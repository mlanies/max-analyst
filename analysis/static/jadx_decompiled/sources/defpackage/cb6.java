package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class cb6 {
    public final je7 a;

    public cb6(je7 je7Var) {
        this.a = je7Var;
    }

    public final boolean a(e52 e52Var, List list) {
        long jT = ((hyc) ((q33) this.a.getValue())).t();
        if (e52Var == null || !e52Var.b.f(jT)) {
            return true;
        }
        if (list.size() <= 1) {
            cu8 cu8Var = (cu8) x53.i0(list);
            if (cu8Var == null) {
                return true;
            }
            return cu8Var.C0 != null && cu8Var.A0 == 2;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cu8 cu8Var2 = (cu8) it.next();
                if (cu8Var2.C0 != null && cu8Var2.A0 == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
