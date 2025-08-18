package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class f22 {
    public final je7 a = neb.a.getAccessor().d(fl7.class);

    public static List b() {
        int i = sea.z0;
        x6 x6Var = new x6(i, new vfd(i, 0, new eqe(vea.M1), null, null, Integer.valueOf(woc.r), null, null, null, 0, null, 2008), 536871936);
        int i2 = sea.B0;
        x6 x6Var2 = new x6(i2, new vfd(i2, 0, new eqe(vea.O1), null, null, Integer.valueOf(woc.Z1), null, null, null, 0, null, 2008), 1073742848);
        int i3 = sea.C0;
        return y53.M(x6Var, x6Var2, new x6(i3, new vfd(i3, 0, new eqe(vea.P1), null, null, Integer.valueOf(woc.W1), null, null, null, 0, null, 2008), -2147482624));
    }

    public final List a(z12 z12Var) {
        Uri uri;
        jqe eqeVar;
        jqe eqeVar2;
        boolean z = z12Var instanceof k72;
        nz4 nz4Var = nz4.a;
        je7 je7Var = this.a;
        String lastPathSegment = null;
        if (!z) {
            if (!(z12Var instanceof zk3)) {
                throw new NoWhenBranchMatchedException();
            }
            p22 p22Var = (p22) ((zk3) z12Var).i.getValue();
            if (p22Var == null) {
                return nz4Var;
            }
            kl7 kl7VarL = j1e.l();
            kl7VarL.add(new mmd());
            String strG = au1.g(((fl7) je7Var.getValue()).e, "/");
            String str = p22Var.b;
            if (str != null && (uri = Uri.parse(str)) != null) {
                lastPathSegment = uri.getLastPathSegment();
            }
            String str2 = lastPathSegment;
            eqe eqeVar3 = new eqe(vea.C0);
            Integer num = p22Var.d;
            kl7VarL.add(new qmd(new omd(strG, str2, eqeVar3, false, true, p22Var.c, Integer.valueOf(num != null ? num.intValue() : wfa.X))));
            return j1e.d(kl7VarL);
        }
        k72 k72Var = (k72) z12Var;
        e52 e52VarO = k72Var.o();
        boolean z2 = e52VarO != null && e52VarO.I();
        q0e q0eVar = k72Var.i;
        if (z2) {
            o22 o22Var = (o22) q0eVar.getValue();
            if (o22Var == null) {
                return nz4Var;
            }
            kl7 kl7VarL2 = j1e.l();
            kl7VarL2.add(new s0d(new eqe(vea.Y1), null, 0, 14));
            int i = sea.i0;
            n22 n22Var = n22.c;
            n22 n22Var2 = o22Var.b;
            kl7VarL2.add(new c4d(i, n22Var2 == n22Var, new eqe(vea.n2), new eqe(vea.l2), 536879104));
            kl7VarL2.add(new c4d(sea.j0, n22Var2 == n22.b, new eqe(vea.s2), new eqe(vea.p2), 1073750016));
            int iOrdinal = n22Var2.ordinal();
            if (iOrdinal == 0) {
                String strG2 = au1.g(((fl7) je7Var.getValue()).e, "/");
                eqe eqeVar4 = new eqe(vea.q2);
                String str3 = o22Var.c;
                jqe jqeVar = o22Var.d;
                if (jqeVar != null) {
                    eqeVar2 = jqeVar;
                } else {
                    eqeVar2 = (str3 == null || str3.length() == 0) ? new eqe(vea.V1) : new eqe(vea.W1);
                }
                Integer num2 = o22Var.e;
                kl7VarL2.add(new qmd(new omd(strG2, str3, eqeVar4, false, false, eqeVar2, Integer.valueOf(num2 != null ? num2.intValue() : wfa.X))));
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                String str4 = o22Var.c;
                if (str4 == null || str4.length() == 0) {
                    kl7VarL2.add(new n2b(new eqe(vea.T1)));
                } else {
                    kl7VarL2.add(new qmd(new pmd(new iqe(str4), new eqe(vea.U1), Integer.valueOf(wfa.X))));
                }
            }
            if (tpa.f(k72Var.q(), Boolean.FALSE)) {
                kl7VarL2.addAll(b());
            }
            return j1e.d(kl7VarL2);
        }
        o22 o22Var2 = (o22) q0eVar.getValue();
        if (o22Var2 == null) {
            return nz4Var;
        }
        kl7 kl7VarL3 = j1e.l();
        kl7VarL3.add(new s0d(new eqe(vea.e2), null, 0, 14));
        int i2 = sea.i0;
        n22 n22Var3 = n22.c;
        n22 n22Var4 = o22Var2.b;
        kl7VarL3.add(new c4d(i2, n22Var4 == n22Var3, new eqe(vea.n2), new eqe(vea.o2), 536879104));
        kl7VarL3.add(new c4d(sea.j0, n22Var4 == n22.b, new eqe(vea.s2), new eqe(vea.t2), 1073750016));
        int iOrdinal2 = n22Var4.ordinal();
        Integer num3 = o22Var2.e;
        String str5 = o22Var2.c;
        if (iOrdinal2 == 0) {
            String strG3 = au1.g(((fl7) je7Var.getValue()).e, "/");
            eqe eqeVar5 = new eqe(vea.q2);
            String str6 = o22Var2.c;
            jqe jqeVar2 = o22Var2.d;
            if (jqeVar2 != null) {
                eqeVar = jqeVar2;
            } else {
                eqeVar = (str6 == null || str6.length() == 0) ? new eqe(vea.b2) : new eqe(vea.c2);
            }
            kl7VarL3.add(new qmd(new omd(strG3, str6, eqeVar5, true, false, eqeVar, Integer.valueOf(num3 != null ? num3.intValue() : wfa.X))));
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (str5 == null || str5.length() == 0) {
                kl7VarL3.add(new qmd(new nmd(new eqe(vea.Z1), new eqe(vea.a2), Integer.valueOf(num3 != null ? num3.intValue() : wfa.X))));
            } else {
                kl7VarL3.add(new qmd(new pmd(new iqe(str5), new eqe(vea.a2), Integer.valueOf(wfa.X))));
            }
        }
        if (tpa.f(k72Var.q(), Boolean.FALSE)) {
            if (!(str5 == null || str5.length() == 0)) {
                kl7VarL3.addAll(b());
            }
        }
        return j1e.d(kl7VarL3);
    }
}
