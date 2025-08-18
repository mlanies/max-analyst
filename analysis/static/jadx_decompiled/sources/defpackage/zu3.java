package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zu3 {
    public static final HashMap c = new HashMap();
    public boolean a;
    public boolean b;

    public zu3() {
        getClass().getConstructor(null);
    }

    public static final void c(wu3 wu3Var) {
        View view;
        ViewGroup viewGroup = wu3Var.d;
        if (viewGroup == null) {
            return;
        }
        zu3 zu3VarB = wu3Var.e;
        if (zu3VarB == null) {
            zu3VarB = new gqd(true);
        } else if (zu3VarB.b && !zu3VarB.e()) {
            zu3VarB = zu3VarB.b();
        }
        zu3 zu3Var = zu3VarB;
        zu3Var.b = true;
        HashMap map = c;
        uu3 uu3Var = wu3Var.a;
        uu3 uu3Var2 = wu3Var.b;
        boolean z = wu3Var.c;
        if (uu3Var2 != null) {
            if (z) {
                np8.k(uu3Var2.getInstanceId());
            } else {
                vu3 vu3Var = (vu3) map.get(uu3Var2.getInstanceId());
                if (vu3Var != null) {
                    boolean z2 = vu3Var.b;
                    zu3 zu3Var2 = vu3Var.a;
                    if (z2) {
                        zu3Var2.f(zu3Var, uu3Var);
                    } else {
                        zu3Var2.a();
                    }
                }
            }
        }
        if (uu3Var != null) {
            map.put(uu3Var.getInstanceId(), new vu3(zu3Var, z));
        }
        List list = wu3Var.f;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((yu3) it.next()).a(uu3Var, uu3Var2, z);
        }
        av3 av3Var = z ? av3.PUSH_ENTER : av3.POP_ENTER;
        av3 av3Var2 = z ? av3.PUSH_EXIT : av3.POP_EXIT;
        View view2 = null;
        if (uu3Var != null) {
            View viewInflate = uu3Var.inflate(viewGroup);
            uu3Var.changeStarted(zu3Var, av3Var);
            view = viewInflate;
        } else {
            view = null;
        }
        if (uu3Var2 != null) {
            view2 = uu3Var2.getView();
            uu3Var2.changeStarted(zu3Var, av3Var2);
        }
        zu3Var.g(viewGroup, view2, view, z, new xu3(uu3Var2, zu3Var, av3Var2, uu3Var, list, view2, av3Var, z, viewGroup));
    }

    public void a() {
    }

    public zu3 b() {
        return np8.p(j());
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return false;
    }

    public void f(zu3 zu3Var, uu3 uu3Var) {
    }

    public abstract void g(ViewGroup viewGroup, View view, View view2, boolean z, xu3 xu3Var);

    public void h(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public final Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putString("ControllerChangeHandler.className", getClass().getName());
        Bundle bundle2 = new Bundle();
        i(bundle2);
        bundle.putBundle("ControllerChangeHandler.savedState", bundle2);
        return bundle;
    }
}
