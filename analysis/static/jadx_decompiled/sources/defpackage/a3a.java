package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class a3a {
    public boolean a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public k56 c;

    public a3a(boolean z) {
        this.a = z;
    }

    public void a() {
    }

    public abstract void b();

    public void c(ge0 ge0Var) {
    }

    public void d() {
    }

    public final void e() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((qy1) it.next()).cancel();
        }
    }

    public final void f(boolean z) {
        this.a = z;
        k56 k56Var = this.c;
        if (k56Var != null) {
            k56Var.invoke();
        }
    }
}
