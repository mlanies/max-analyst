package defpackage;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public interface ce3 {
    static void H(mi9 mi9Var, ce3 ce3Var, ce3 ce3Var2, aa0 aa0Var) {
        if (!Objects.equals(aa0Var, ev6.J)) {
            mi9Var.d(aa0Var, ce3Var2.q(aa0Var), ce3Var2.h(aa0Var));
            return;
        }
        kic kicVar = (kic) ce3Var2.f(aa0Var, null);
        kic kicVar2 = (kic) ce3Var.f(aa0Var, null);
        be3 be3VarQ = ce3Var2.q(aa0Var);
        if (kicVar == null) {
            kicVar = kicVar2;
        } else if (kicVar2 != null) {
            fm5 fm5Var = kicVar.a;
            if (fm5Var == null) {
                fm5Var = kicVar2.a;
            }
            lic licVar = kicVar.b;
            if (licVar == null) {
                licVar = kicVar2.b;
            }
            int i = kicVar.c;
            if (i == 0) {
                i = kicVar2.c;
            }
            kicVar2 = new kic(fm5Var, licVar, i);
            kicVar = kicVar2;
        }
        mi9Var.d(aa0Var, be3VarQ, kicVar);
    }

    static wma K(ce3 ce3Var, ce3 ce3Var2) {
        if (ce3Var == null && ce3Var2 == null) {
            return wma.c;
        }
        mi9 mi9VarC = ce3Var2 != null ? mi9.c(ce3Var2) : mi9.b();
        if (ce3Var != null) {
            Iterator it = ce3Var.g().iterator();
            while (it.hasNext()) {
                H(mi9VarC, ce3Var2, ce3Var, (aa0) it.next());
            }
        }
        return wma.a(mi9VarC);
    }

    void e(f9 f9Var);

    Object f(aa0 aa0Var, Object obj);

    Set g();

    Object h(aa0 aa0Var);

    Set i(aa0 aa0Var);

    Object l(aa0 aa0Var, be3 be3Var);

    boolean o(aa0 aa0Var);

    be3 q(aa0 aa0Var);
}
