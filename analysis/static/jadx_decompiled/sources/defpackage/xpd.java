package defpackage;

import android.content.Context;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class xpd extends PopupWindow {
    public final List a;
    public final m56 b;

    public xpd(Context context, boolean z, ArrayList arrayList, wz7 wz7Var) {
        boolean z2;
        this.a = arrayList;
        this.b = wz7Var;
        setHeight(-2);
        setWidth(tu0.G(250 * fk4.d().getDisplayMetrics().density));
        setElevation(fk4.d().getDisplayMetrics().density * 12.0f);
        boolean z3 = true;
        setOutsideTouchable(true);
        setFocusable(true);
        h6b h6bVar = new h6b(context, z);
        if (arrayList.isEmpty()) {
            z2 = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((wpd) it.next()).d != null) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        for (wpd wpdVar : this.a) {
            g6b g6bVar = new g6b(context, z);
            jqe jqeVar = wpdVar.b;
            Integer num = wpdVar.d;
            g6bVar.c(g6bVar, jqeVar, wpdVar.c, num != null ? z3 : false, z2);
            g6bVar.b(num, wpdVar.e);
            tu0.K(g6bVar, 300L, new v7d(this, 6, wpdVar));
            h6bVar.addView(g6bVar, -1, -2);
            z3 = true;
        }
        setContentView(h6bVar);
    }
}
