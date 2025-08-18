package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ome {
    public final mle a;

    public ome(mle mleVar) {
        this.a = mleVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long a(mle mleVar, mme mmeVar) {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "ome", "execute " + mmeVar, null);
        }
        if (!mmeVar.b) {
            ol olVar = mmeVar.a;
            return ((tle) mleVar).b(olVar, (lme) olVar, mmeVar.c);
        }
        final ol olVar2 = mmeVar.a;
        final long j = mmeVar.d;
        final int i = mmeVar.e;
        final tle tleVar = (tle) mleVar;
        tleVar.getClass();
        if (!(olVar2 instanceof hua)) {
            throw new IllegalArgumentException("task must be instance of PersistableTask");
        }
        ((iba) tleVar.u0.getValue()).c().execute(new Runnable() { // from class: ole
            @Override // java.lang.Runnable
            public final void run() {
                tle tleVar2 = tleVar;
                tleVar2.getClass();
                hm9.k(tle.B0, "persistable task execution started, force connection");
                ((p7b) ((m7b) tleVar2.Y.getValue())).a.y(true);
                ((eoe) tleVar2.X.getValue()).g((hua) olVar2, j, i);
                r9d.y((s8g) tleVar2.v0.getValue());
                ((boe) tleVar2.w0.getValue()).a();
            }
        });
        return olVar2.a;
    }

    public static long b(ome omeVar, ol olVar) {
        omeVar.getClass();
        return a(omeVar.a, new mme(olVar, false, false, 0L, 0));
    }

    public static /* synthetic */ long d(ome omeVar, ol olVar, boolean z, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return omeVar.c(olVar, z, 0L, i);
    }

    public final long c(ol olVar, boolean z, long j, int i) {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "ome", "executeAndSave " + olVar + ", " + z + ", " + j + ", " + i, null);
        }
        mme mmeVar = new mme(olVar, true, z, j, i);
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.X, "ome", "tamService != null, execute task " + mmeVar + " ", null);
        }
        return a(this.a, mmeVar);
    }

    public final Object e(dle dleVar, Continuation continuation) {
        sy1 sy1Var = new sy1(1, v3c.u(continuation));
        sy1Var.n();
        nme nmeVar = new nme(sy1Var);
        tle tleVar = (tle) this.a;
        je7 je7Var = tleVar.x0;
        ((yle) je7Var.getValue()).f(false);
        gaa gaaVar = new gaa(nmeVar);
        yle yleVar = (yle) je7Var.getValue();
        long jD = tleVar.d(dleVar);
        x9d x9dVar = (x9d) yleVar.Y.get();
        if (x9dVar != null && !yleVar.e(dleVar, gaaVar)) {
            x9dVar.i(dleVar, false, jD, gaaVar);
        }
        return sy1Var.m();
    }
}
