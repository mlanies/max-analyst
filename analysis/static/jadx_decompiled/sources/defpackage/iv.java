package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class iv {
    public static final k40 h = new k40(1);
    public final xl7 a;
    public final qz7 b;
    public List e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List f = Collections.emptyList();
    public final k40 c = h;

    public iv(xl7 xl7Var, qz7 qz7Var) {
        this.a = xl7Var;
        this.b = qz7Var;
    }

    public final void a(List list, Runnable runnable) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            gl7 gl7Var = (gl7) it.next();
            gl7Var.a.D(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List list2 = this.e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f;
        xl7 xl7Var = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.emptyList();
            xl7Var.m(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            ((Executor) this.b.b).execute(new hv(this, list2, list, i, runnable));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        xl7Var.e(0, list.size());
        a(list3, runnable);
    }
}
