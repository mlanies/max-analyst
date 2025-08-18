package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class nr7 implements lr7 {
    public static final /* synthetic */ int s0 = 0;
    public final jt3 X;
    public final jt3 Y;
    public final jt3 Z;
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Context o;

    public nr7(Context context, je7 je7Var, je7 je7Var2) {
        this.o = context;
        Objects.requireNonNull(je7Var);
        this.X = new jt3(new m01(1, je7Var));
        this.Y = new jt3(new u00(this, je7Var, context, 13));
        Objects.requireNonNull(je7Var2);
        this.Z = new jt3(new m01(2, je7Var2));
    }

    @Override // defpackage.lr7
    public final void U0() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lr7) it.next()).U0();
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((lr7) it2.next()).U0();
        }
        Iterator it3 = this.c.iterator();
        while (it3.hasNext()) {
            ((lr7) it3.next()).U0();
        }
    }

    public final void a(lr7 lr7Var) {
        if (!wmd.j(this.o, wmd.f)) {
            hm9.n("nr7", "start: no permissions");
            lr7Var.U0();
            return;
        }
        me6 me6Var = (me6) this.X.get();
        re6 re6Var = new re6(18, lr7Var);
        reg regVar = me6Var.a;
        regVar.getClass();
        er0 er0Var = new er0();
        er0Var.c = true;
        er0Var.d = yb9.Z;
        er0Var.b = 2414;
        ukg ukgVarC = regVar.c(0, er0Var.a());
        ukgVarC.i(new ke6(re6Var));
        ukgVarC.c(xne.a, new ke6(re6Var));
    }

    public final void b(lr7 lr7Var) {
        synchronized (this.c) {
            try {
                if (this.c.isEmpty()) {
                    ak6 ak6Var = (ak6) this.Y.get();
                    ak6Var.getClass();
                    nd7.Q(new mr7(ak6Var, 1));
                    hm9.n("nr7", "requestHighAccuracyUpdates");
                }
                this.c.add(lr7Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(lr7 lr7Var) {
        synchronized (this.c) {
            try {
                this.c.remove(lr7Var);
                if (this.c.isEmpty() && this.Y.b != null) {
                    ak6 ak6Var = (ak6) this.Y.get();
                    ak6Var.getClass();
                    nd7.Q(new mr7(ak6Var, 0));
                    hm9.n("nr7", "stopHighAccuracyUpdates");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lr7
    public final void p1(er7 er7Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lr7) it.next()).p1(er7Var);
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((lr7) it2.next()).p1(er7Var);
        }
        Iterator it3 = this.c.iterator();
        while (it3.hasNext()) {
            ((lr7) it3.next()).p1(er7Var);
        }
    }
}
