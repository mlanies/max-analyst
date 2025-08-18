package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class t20 {
    public static final /* synthetic */ int d = 0;
    public final rm4 a;
    public final av0 b;
    public final rm4 c;

    public t20(rm4 rm4Var, av0 av0Var, rm4 rm4Var2) {
        this.a = rm4Var;
        this.b = av0Var;
        this.c = rm4Var2;
    }

    public static boolean a(k8g k8gVar) {
        f20 f20Var;
        s10 s10Var;
        i10 i10Var;
        k20 k20Var;
        x10 x10Var;
        if (k8gVar == null) {
            return true;
        }
        for (l20 l20Var : (List) k8gVar.a) {
            if (l20Var.a == g20.c && (x10Var = l20Var.b) != null && oag.t(x10Var.Z)) {
                return false;
            }
            g20 g20Var = g20.o;
            g20 g20Var2 = l20Var.a;
            if (g20Var2 == g20Var && (k20Var = l20Var.d) != null && k20Var.a == 0) {
                return false;
            }
            if (g20Var2 == g20.X && (i10Var = l20Var.e) != null && i10Var.a == 0) {
                return false;
            }
            if (g20Var2 == g20.u0 && (s10Var = l20Var.j) != null && s10Var.a == 0) {
                return false;
            }
            if (g20Var2 == g20.Y && (f20Var = l20Var.f) != null && f20Var.a == 0) {
                return false;
            }
            if (l20Var.x == z10.b) {
                return false;
            }
        }
        return true;
    }

    public final void b(cu8 cu8Var) {
        if (cu8Var.n()) {
            Iterator it = ((List) cu8Var.z0.a).iterator();
            while (it.hasNext()) {
                d(cu8Var.b, ((l20) it.next()).r, z10.b);
            }
        }
    }

    public final void c() {
        au8 au8Var = (au8) this.a.get();
        oz7 oz7Var = iu8.b;
        Iterator it = au8Var.s().iterator();
        while (it.hasNext()) {
            cu8 cu8Var = (cu8) it.next();
            if (cu8Var.n()) {
                Iterator it2 = ((List) cu8Var.z0.a).iterator();
                while (it2.hasNext()) {
                    d(cu8Var.b, ((l20) it2.next()).r, z10.a);
                }
            }
        }
    }

    public final void d(long j, String str, z10 z10Var) {
        ((au8) this.a.get()).v(j, str, new ync(7, z10Var));
    }
}
