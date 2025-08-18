package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class gcb {
    public final khe a = new khe(new lab(1));

    public final vlb a(int i, CharSequence charSequence, boolean z) {
        int i2;
        int i3;
        jqe eqeVar;
        int iS = au1.s(i);
        if (iS == 0 || iS == 1) {
            gqe gqeVar = new gqe(yea.p1, ys.m0(new Object[]{charSequence}));
            kl7 kl7VarL = j1e.l();
            kl7VarL.add(new mg3(wea.R, new eqe(yea.o1), 1, false));
            kl7VarL.add(new mg3(wea.y, new eqe(yea.n1), 3, false));
            return new vlb(gqeVar, null, j1e.d(kl7VarL), null);
        }
        if (iS != 2) {
            if (iS == 3) {
                return c();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            eqeVar = new eqe(yea.l1);
            i2 = yea.j1;
            i3 = yea.n1;
        } else {
            gqe gqeVar2 = new gqe(yea.K2, ys.m0(new Object[]{charSequence}));
            i2 = yea.J2;
            i3 = yea.I2;
            eqeVar = gqeVar2;
        }
        eqe eqeVar2 = z ? new eqe(yea.i1) : null;
        kl7 kl7VarL2 = j1e.l();
        kl7VarL2.add(new mg3(wea.R, new eqe(i2), 1, false));
        kl7VarL2.add(new mg3(wea.y, new eqe(i3), 3, false));
        return new vlb(eqeVar, eqeVar2, j1e.d(kl7VarL2), null);
    }

    public final mg3 b() {
        return (mg3) this.a.getValue();
    }

    public final vlb c() {
        iqe iqeVar = new iqe("Unsupported chat type");
        kl7 kl7VarL = j1e.l();
        kl7VarL.add(new mg3(wea.B, new eqe(yea.L0), 1, false));
        kl7VarL.add(b());
        return new vlb(iqeVar, null, j1e.d(kl7VarL), null);
    }
}
