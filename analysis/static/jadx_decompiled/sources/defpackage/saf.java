package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class saf {
    public final ol6 a;
    public final mg4 b;

    public saf(ol6 ol6Var, mg4 mg4Var) {
        this.a = ol6Var;
        this.b = mg4Var;
    }

    public final List a(List list, m56 m56Var, m56 m56Var2, m56 m56Var3, sj3 sj3Var, m56 m56Var4) {
        ol6 ol6Var = this.a;
        if (!ol6Var.b()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            boolean zN = ol6Var.n(((Number) m56Var.invoke(obj)).longValue());
            if (!zN && m56Var3 != null && this.b.a() && m56Var3.invoke(obj) != vx8.DELAYED_FIRE_ERROR) {
                arrayList.add(m56Var2.invoke(obj));
            }
            if (m56Var4 != null) {
                m56Var4.invoke(obj);
            }
            if (zN) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            hm9.n("saf", "items for delete not empty, count = " + arrayList.size());
            sj3Var.accept(arrayList);
        }
        return arrayList2;
    }
}
