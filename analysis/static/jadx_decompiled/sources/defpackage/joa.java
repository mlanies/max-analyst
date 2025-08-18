package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final class joa extends su3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public joa(dv3 dv3Var, ArrayList arrayList) {
        this.c = dv3Var;
        this.b = arrayList;
    }

    @Override // defpackage.su3
    public final void a(uu3 uu3Var, zu3 zu3Var, av3 av3Var) {
        switch (this.a) {
            case 0:
                if (((uu3) this.c) == uu3Var && av3Var.b && zu3Var.d()) {
                    View view = uu3Var.getView();
                    if ((view != null ? view.getWindowToken() : null) != null) {
                        gh7 gh7Var = ((loa) this.b).a;
                        if ((gh7Var == null ? null : gh7Var).d == fg7.o) {
                            (gh7Var != null ? gh7Var : null).d(eg7.ON_RESUME);
                            break;
                        }
                    }
                }
                break;
            default:
                if (av3Var == av3.POP_EXIT) {
                    List list = (List) this.b;
                    for (int size = list.size() - 1; size > 0; size--) {
                        ((znc) this.c).z(null, (coc) list.get(size), true, new gqd());
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.su3
    public void b(uu3 uu3Var, zu3 zu3Var, av3 av3Var) {
        switch (this.a) {
            case 0:
                loa.a((loa) this.b, (uu3) this.c, uu3Var, zu3Var, av3Var);
                for (md6 md6Var : nd6.a.values()) {
                    if (md6Var.a.contains(uu3Var.getInstanceId())) {
                        md6Var.b.invoke(uu3Var, zu3Var, av3Var);
                    }
                }
                break;
        }
    }

    @Override // defpackage.su3
    public void c(uu3 uu3Var, Bundle bundle) {
        switch (this.a) {
            case 0:
                ((loa) this.b).o = bundle.getBundle("Registry.savedState");
                break;
        }
    }

    @Override // defpackage.su3
    public void e(uu3 uu3Var, Bundle bundle) {
        switch (this.a) {
            case 0:
                bundle.putBundle("Registry.savedState", ((loa) this.b).o);
                break;
        }
    }

    @Override // defpackage.su3
    public void f(uu3 uu3Var) {
        switch (this.a) {
            case 0:
                loa loaVar = (loa) this.b;
                if (!loaVar.c) {
                    Bundle bundle = new Bundle();
                    loaVar.o = bundle;
                    td tdVar = loaVar.b;
                    if (tdVar == null) {
                        tdVar = null;
                    }
                    tdVar.u(bundle);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.su3
    public void g(uu3 uu3Var) {
        switch (this.a) {
            case 0:
                gh7 gh7Var = ((loa) this.b).a;
                if (gh7Var == null) {
                    gh7Var = null;
                }
                gh7Var.d(eg7.ON_RESUME);
                break;
        }
    }

    @Override // defpackage.su3
    public void h(uu3 uu3Var) {
        switch (this.a) {
            case 0:
                loa loaVar = (loa) this.b;
                loaVar.getClass();
                LinkedHashMap linkedHashMap = nd6.a;
                kl7 kl7VarL = j1e.l();
                for (uu3 parentController = uu3Var.getParentController(); parentController != null; parentController = parentController.getParentController()) {
                    kl7VarL.add(parentController.getInstanceId());
                }
                nd6.a.put(uu3Var.getInstanceId(), new md6(j1e.d(kl7VarL), new koa(loaVar)));
                break;
        }
    }

    @Override // defpackage.su3
    public void j(uu3 uu3Var, View view) {
        switch (this.a) {
            case 0:
                Object tag = view.getTag(hvb.view_tree_lifecycle_owner);
                loa loaVar = (loa) this.b;
                if (tag == null && view.getTag(hvb.view_tree_saved_state_registry_owner) == null) {
                    s5c.Z(view, loaVar);
                    wmd.G(view, loaVar);
                }
                gh7 gh7Var = loaVar.a;
                if (gh7Var == null) {
                    gh7Var = null;
                }
                gh7Var.d(eg7.ON_START);
                break;
        }
    }

    @Override // defpackage.su3
    public void p(uu3 uu3Var) {
        switch (this.a) {
            case 0:
                ((loa) this.b).getClass();
                nd6.a.remove(uu3Var.getInstanceId());
                break;
        }
    }

    @Override // defpackage.su3
    public void q(uu3 uu3Var) {
        switch (this.a) {
            case 0:
                loa loaVar = (loa) this.b;
                loaVar.c = false;
                loaVar.a = new gh7(loaVar);
                td tdVar = new td(loaVar);
                loaVar.b = tdVar;
                tdVar.t(loaVar.o);
                gh7 gh7Var = loaVar.a;
                if (gh7Var == null) {
                    gh7Var = null;
                }
                gh7Var.d(eg7.ON_CREATE);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.su3
    public void s(uu3 uu3Var, View view) {
        switch (this.a) {
            case 0:
                boolean zIsBeingDestroyed = uu3Var.isBeingDestroyed();
                loa loaVar = (loa) this.b;
                if (!zIsBeingDestroyed || uu3Var.getRouter().a.a.size() != 0) {
                    gh7 gh7Var = loaVar.a;
                    (gh7Var != null ? gh7Var : null).d(eg7.ON_DESTROY);
                    break;
                } else {
                    ViewParent parent = view.getParent();
                    View view2 = parent instanceof View ? (View) parent : null;
                    if (view2 != null) {
                        view2.addOnAttachStateChangeListener(new o50(view2, 7, loaVar));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.su3
    public void t(uu3 uu3Var) {
        switch (this.a) {
            case 0:
                loa loaVar = (loa) this.b;
                gh7 gh7Var = loaVar.a;
                if ((gh7Var == null ? null : gh7Var).d == fg7.X) {
                    if (gh7Var == null) {
                        gh7Var = null;
                    }
                    gh7Var.d(eg7.ON_PAUSE);
                }
                gh7 gh7Var2 = loaVar.a;
                (gh7Var2 != null ? gh7Var2 : null).d(eg7.ON_STOP);
                break;
        }
    }

    public joa(loa loaVar, Widget widget) {
        this.b = loaVar;
        this.c = widget;
    }
}
