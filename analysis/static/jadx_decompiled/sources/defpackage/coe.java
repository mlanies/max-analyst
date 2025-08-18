package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class coe {
    public boolean a;
    public mne b;
    public final ArrayList c = new ArrayList();
    public boolean d;
    public final foe e;
    public final String f;

    public coe(foe foeVar, String str) {
        this.e = foeVar;
        this.f = str;
    }

    public final void a() {
        byte[] bArr = naf.a;
        synchronized (this.e) {
            if (b()) {
                this.e.e(this);
            }
        }
    }

    public final boolean b() {
        mne mneVar = this.b;
        if (mneVar != null && mneVar.d) {
            this.d = true;
        }
        ArrayList arrayList = this.c;
        boolean z = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((mne) arrayList.get(size)).d) {
                mne mneVar2 = (mne) arrayList.get(size);
                if (foe.i.isLoggable(Level.FINE)) {
                    wmd.c(mneVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(mne mneVar, long j) {
        synchronized (this.e) {
            if (!this.a) {
                if (d(mneVar, j, false)) {
                    this.e.e(this);
                }
            } else if (mneVar.d) {
                foe foeVar = foe.h;
                if (foe.i.isLoggable(Level.FINE)) {
                    wmd.c(mneVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                foe foeVar2 = foe.h;
                if (foe.i.isLoggable(Level.FINE)) {
                    wmd.c(mneVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(mne mneVar, long j, boolean z) {
        coe coeVar = mneVar.a;
        if (coeVar != this) {
            if (coeVar != null) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            mneVar.a = this;
        }
        this.e.g.getClass();
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.c;
        int iIndexOf = arrayList.indexOf(mneVar);
        if (iIndexOf != -1) {
            if (mneVar.b <= j2) {
                if (foe.i.isLoggable(Level.FINE)) {
                    wmd.c(mneVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        mneVar.b = j2;
        if (foe.i.isLoggable(Level.FINE)) {
            wmd.c(mneVar, this, z ? "run again after ".concat(wmd.p(j2 - jNanoTime)) : "scheduled after ".concat(wmd.p(j2 - jNanoTime)));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((mne) it.next()).b - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = arrayList.size();
        }
        arrayList.add(size, mneVar);
        return size == 0;
    }

    public final void e() {
        byte[] bArr = naf.a;
        synchronized (this.e) {
            this.a = true;
            if (b()) {
                this.e.e(this);
            }
        }
    }

    public final String toString() {
        return this.f;
    }
}
