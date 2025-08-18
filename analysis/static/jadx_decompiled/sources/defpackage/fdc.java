package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class fdc implements ug7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fdc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ug7
    public final void m(eh7 eh7Var, eg7 eg7Var) throws NoSuchMethodException, SecurityException {
        View view;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                if (eg7Var != eg7.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                eh7Var.Q().f(this);
                isc iscVar = (isc) obj;
                Bundle bundleC = iscVar.y().c("androidx.savedstate.Restarter");
                if (bundleC == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleC.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, fdc.class.getClassLoader()).asSubclass(gsc.class);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                if (!(iscVar instanceof ynf)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                }
                                xnf xnfVarW = ((ynf) iscVar).w();
                                mm mmVarY = iscVar.y();
                                xnfVarW.getClass();
                                LinkedHashMap linkedHashMap = xnfVarW.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    fp3.e((qnf) linkedHashMap.get((String) it.next()), mmVarY, iscVar.Q());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    mmVarY.g();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(wg0.i("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(zr6.i("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                yb3 yb3Var = (yb3) obj;
                if (yb3Var.X == null) {
                    ub3 ub3Var = (ub3) yb3Var.getLastNonConfigurationInstance();
                    if (ub3Var != null) {
                        yb3Var.X = ub3Var.b;
                    }
                    if (yb3Var.X == null) {
                        yb3Var.X = new xnf();
                    }
                }
                yb3Var.a.f(this);
                return;
            case 2:
                new HashMap();
                fa6[] fa6VarArr = (fa6[]) obj;
                if (fa6VarArr.length > 0) {
                    fa6 fa6Var = fa6VarArr[0];
                    throw null;
                }
                if (fa6VarArr.length <= 0) {
                    return;
                }
                fa6 fa6Var2 = fa6VarArr[0];
                throw null;
            case 3:
                if (eg7Var == eg7.ON_DESTROY) {
                    ia5 ia5Var = (ia5) obj;
                    ia5Var.a = null;
                    LinkedList linkedList = ia5Var.b;
                    Iterator it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        ((ha5) it2.next()).b.invoke();
                    }
                    linkedList.clear();
                    return;
                }
                return;
            case 4:
                if (eg7Var != eg7.ON_STOP || (view = ((a) obj).U0) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 5:
                ((pz7) obj).f(false);
                return;
            case 6:
                hm9.n("l84", "onStateChanged: new event = " + eg7Var);
                if (eg7Var != eg7.ON_RESUME) {
                    return;
                }
                l84 l84Var = (l84) obj;
                x77 x77Var = (x77) l84Var.e;
                if (x77Var != null) {
                    x77Var.cancel(null);
                }
                int i = ((fz6) ((bkg) l84Var.c).b).z0.get();
                hm9.n("l84", "onStateChanged: prevAllMediaCount = " + i);
                l84Var.e = j47.T((sx3) l84Var.a, (ox3) l84Var.b, null, new ey7(l84Var, i, null), 2);
                return;
            default:
                if (eg7Var != eg7.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + eg7Var).toString());
                }
                eh7Var.Q().f(this);
                ((fsc) obj).b();
                return;
        }
    }
}
