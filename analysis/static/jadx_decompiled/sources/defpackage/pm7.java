package defpackage;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class pm7 {
    public final she a;
    public final bie b;
    public final mm7 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public pm7(Looper looper, she sheVar, mm7 mm7Var) {
        this(new CopyOnWriteArraySet(), looper, sheVar, mm7Var, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new om7(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        bie bieVar = this.b;
        if (!bieVar.a.hasMessages(1)) {
            bieVar.getClass();
            zhe zheVarC = bie.c();
            zheVarC.a = bieVar.a.obtainMessage(1);
            bieVar.getClass();
            Message message = zheVarC.a;
            message.getClass();
            bieVar.a.sendMessageAtFrontOfQueue(message);
            zheVarC.a();
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean z = !arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (z) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            ((Runnable) arrayDeque2.peekFirst()).run();
            arrayDeque2.removeFirst();
        }
    }

    public final void c(int i, km7 km7Var) {
        g();
        this.f.add(new si1(new CopyOnWriteArraySet(this.d), i, km7Var, 12));
    }

    public final void d() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            om7 om7Var = (om7) it.next();
            mm7 mm7Var = this.c;
            om7Var.d = true;
            if (om7Var.c) {
                om7Var.c = false;
                mm7Var.d(om7Var.a, om7Var.b.e());
            }
        }
        this.d.clear();
    }

    public final void e(Object obj) {
        g();
        CopyOnWriteArraySet copyOnWriteArraySet = this.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            om7 om7Var = (om7) it.next();
            if (om7Var.a.equals(obj)) {
                om7Var.d = true;
                if (om7Var.c) {
                    om7Var.c = false;
                    tm5 tm5VarE = om7Var.b.e();
                    this.c.d(om7Var.a, tm5VarE);
                }
                copyOnWriteArraySet.remove(om7Var);
            }
        }
    }

    public final void f(int i, km7 km7Var) {
        c(i, km7Var);
        b();
    }

    public final void g() {
        if (this.i) {
            fm9.k(Thread.currentThread() == this.b.a.getLooper().getThread());
        }
    }

    public pm7(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, she sheVar, mm7 mm7Var, boolean z) {
        this.a = sheVar;
        this.d = copyOnWriteArraySet;
        this.c = mm7Var;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = sheVar.a(looper, new hl4(2, this));
        this.i = z;
    }
}
