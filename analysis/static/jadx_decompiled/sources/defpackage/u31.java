package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class u31 {
    public cu3 a;

    public final cu3 a(Context context, List list, t31 t31Var) {
        cu3 cu3Var = this.a;
        if (cu3Var != null) {
            cu3Var.dismiss();
        }
        cu3 cu3Var2 = new cu3(context);
        cu3Var2.setWidth(tu0.G(250 * fk4.d().getDisplayMetrics().density));
        cu3Var2.d = false;
        cu3Var2.f.o1(cu3Var2, cu3.g[0], hq9.e0);
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m7 m7Var = (m7) it.next();
            arrayList.add(new st3(m7Var.getName(), Integer.valueOf(m7Var.getIcon()), rme.u0, rme.D0, new x2(t31Var, 6, m7Var)));
        }
        cu3Var2.a.a(arrayList, new bk(7, cu3Var2));
        this.a = cu3Var2;
        return cu3Var2;
    }
}
