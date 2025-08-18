package org.apache.http.impl.conn.tsccm;

import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.LangUtils;

@Deprecated
/* loaded from: classes2.dex */
public class RouteSpecificPool {
    protected final int maxEntries;
    protected final HttpRoute route;
    private final Log log = LogFactory.getLog(getClass());
    protected final LinkedList<BasicPoolEntry> freeEntries = new LinkedList<>();
    protected final Queue<WaitingThread> waitingThreads = new LinkedList();
    protected int numEntries = 0;

    public RouteSpecificPool(HttpRoute httpRoute, int i) {
        this.route = httpRoute;
        this.maxEntries = i;
    }

    public BasicPoolEntry allocEntry(Object obj) {
        if (!this.freeEntries.isEmpty()) {
            LinkedList<BasicPoolEntry> linkedList = this.freeEntries;
            ListIterator<BasicPoolEntry> listIterator = linkedList.listIterator(linkedList.size());
            while (listIterator.hasPrevious()) {
                BasicPoolEntry basicPoolEntryPrevious = listIterator.previous();
                if (LangUtils.equals(obj, basicPoolEntryPrevious.getState())) {
                    listIterator.remove();
                    return basicPoolEntryPrevious;
                }
            }
        }
        if (this.freeEntries.isEmpty()) {
            return null;
        }
        BasicPoolEntry basicPoolEntryRemove = this.freeEntries.remove();
        basicPoolEntryRemove.setState(null);
        try {
            basicPoolEntryRemove.getConnection().close();
        } catch (IOException e) {
            this.log.debug("I/O error closing connection", e);
        }
        return basicPoolEntryRemove;
    }

    public void createdEntry(BasicPoolEntry basicPoolEntry) {
        if (this.route.equals(basicPoolEntry.getPlannedRoute())) {
            this.numEntries++;
            return;
        }
        throw new IllegalArgumentException("Entry not planned for this pool.\npool: " + this.route + "\nplan: " + basicPoolEntry.getPlannedRoute());
    }

    public boolean deleteEntry(BasicPoolEntry basicPoolEntry) {
        boolean zRemove = this.freeEntries.remove(basicPoolEntry);
        if (zRemove) {
            this.numEntries--;
        }
        return zRemove;
    }

    public void dropEntry() {
        int i = this.numEntries;
        if (i < 1) {
            throw new IllegalStateException("There is no entry that could be dropped.");
        }
        this.numEntries = i - 1;
    }

    public void freeEntry(BasicPoolEntry basicPoolEntry) {
        int i = this.numEntries;
        if (i < 1) {
            throw new IllegalStateException("No entry created for this pool. " + this.route);
        }
        if (i > this.freeEntries.size()) {
            this.freeEntries.add(basicPoolEntry);
        } else {
            throw new IllegalStateException("No entry allocated from this pool. " + this.route);
        }
    }

    public int getCapacity() {
        return this.maxEntries - this.numEntries;
    }

    public final int getEntryCount() {
        return this.numEntries;
    }

    public final int getMaxEntries() {
        return this.maxEntries;
    }

    public final HttpRoute getRoute() {
        return this.route;
    }

    public boolean hasThread() {
        return !this.waitingThreads.isEmpty();
    }

    public boolean isUnused() {
        return this.numEntries < 1 && this.waitingThreads.isEmpty();
    }

    public WaitingThread nextThread() {
        return this.waitingThreads.peek();
    }

    public void queueThread(WaitingThread waitingThread) {
        if (waitingThread == null) {
            throw new IllegalArgumentException("Waiting thread must not be null.");
        }
        this.waitingThreads.add(waitingThread);
    }

    public void removeThread(WaitingThread waitingThread) {
        if (waitingThread == null) {
            return;
        }
        this.waitingThreads.remove(waitingThread);
    }
}
