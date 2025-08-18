package defpackage;

import bolts.AggregateException;
import bolts.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class jne implements gu3 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ AtomicInteger d;
    public final /* synthetic */ rne e;

    public jne(Object obj, ArrayList arrayList, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, rne rneVar) {
        this.a = obj;
        this.b = arrayList;
        this.c = atomicBoolean;
        this.d = atomicInteger;
        this.e = rneVar;
    }

    @Override // defpackage.gu3
    public final Object a(Task task) {
        if (task.isFaulted()) {
            synchronized (this.a) {
                this.b.add(task.getError());
            }
        }
        if (task.isCancelled()) {
            this.c.set(true);
        }
        if (this.d.decrementAndGet() == 0) {
            if (this.b.size() != 0) {
                if (this.b.size() == 1) {
                    this.e.b((Exception) this.b.get(0));
                } else {
                    String str = String.format("There were %d exceptions.", Integer.valueOf(this.b.size()));
                    ArrayList arrayList = this.b;
                    AggregateException aggregateException = new AggregateException(str, (arrayList == null || arrayList.size() <= 0) ? null : (Throwable) arrayList.get(0));
                    aggregateException.a = Collections.unmodifiableList(arrayList);
                    this.e.b(aggregateException);
                }
            } else if (this.c.get()) {
                this.e.a();
            } else {
                this.e.c(null);
            }
        }
        return null;
    }
}
