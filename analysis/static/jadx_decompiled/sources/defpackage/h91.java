package defpackage;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.calls.ui.ui.pip.PipScreen;

/* loaded from: classes.dex */
public final class h91 implements yu3 {
    public final /* synthetic */ l91 a;

    public h91(l91 l91Var) {
        this.a = l91Var;
    }

    @Override // defpackage.yu3
    public final void a(uu3 uu3Var, uu3 uu3Var2, boolean z) {
        boolean z2 = false;
        l91 l91Var = this.a;
        if (uu3Var != null) {
            xj1 xj1Var = (xj1) l91Var.Y.getValue();
            boolean z3 = uu3Var instanceof iq9;
            boolean zA = xj1Var.a();
            l91 l91Var2 = xj1Var.a;
            if (z3) {
                l91.e(l91Var2);
                if (zA) {
                    l91Var2.f(true);
                } else {
                    Activity activity = l91Var2.Z;
                    if (activity != null) {
                        boolean zF = y8a.a.o().f().F();
                        hm9.n("PipAppController", "try to hide call indicator hasCall=" + l91Var2.b());
                        if (zF) {
                            ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
                            View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
                            dy7.j(activity, childAt != null && qp4.u0.b(childAt.getContext()).j());
                        }
                    }
                }
            } else if (zA) {
                Activity activity2 = l91Var2.Z;
                if (activity2 != null) {
                    ((cb5) l91Var2.b).d(activity2, l91.c());
                }
            } else {
                Activity activity3 = l91Var2.Z;
                if (activity3 != null) {
                    boolean zB = l91Var2.b();
                    coc cocVar = (coc) x53.q0(l91.c().e());
                    uu3 uu3Var3 = cocVar != null ? cocVar.a : null;
                    boolean z4 = !((uu3Var3 instanceof iq9) || uu3Var3 == null);
                    hm9.n("PipAppController", "try to show call indicator hasCall=" + zB + " canShow=" + z4 + ".");
                    if (z4 && zB && y8a.a.o().f().l(new CallIndicatorWidget())) {
                        dy7.j(activity3, true);
                    }
                    if (!zB) {
                        hm9.n("PipAppController", "can't show indicator due to call is absent, try to force close indicator.");
                        l91Var2.f(true);
                    }
                }
            }
        }
        boolean z5 = uu3Var instanceof PipScreen;
        v1e v1eVar = v1e.b;
        if (z5 && !(uu3Var2 instanceof PipScreen)) {
            tg1 tg1Var = (tg1) l91Var.s0.getValue();
            String str = ((wr1) l91Var.a).k().c;
            w1e w1eVar = (w1e) tg1Var;
            q0e q0eVar = w1eVar.a;
            if (q0eVar.getValue() != v1eVar) {
                w1eVar.a(str, true);
            }
            q0eVar.m(null, v1eVar);
        }
        boolean z6 = uu3Var2 instanceof PipScreen;
        if (z6 && !z5) {
            tg1 tg1Var2 = (tg1) l91Var.s0.getValue();
            String str2 = ((wr1) l91Var.a).k().c;
            w1e w1eVar2 = (w1e) tg1Var2;
            q0e q0eVar2 = w1eVar2.a;
            if (q0eVar2.getValue() == v1eVar) {
                w1eVar2.a(str2, false);
            }
            q0eVar2.m(null, v1e.a);
        }
        if (z6 && uu3Var == null) {
            hm9.n("PipAppController", "pip screen was hidden quietly, skip hide fake pip.");
            return;
        }
        l91Var.getClass();
        if ((uu3Var2 instanceof iq9) || uu3Var2 == null) {
            if (((wr1) l91Var.a).q() && ((xj1) l91Var.Y.getValue()).a()) {
                z2 = true;
            }
            l91Var.v0 = z2;
        }
    }

    @Override // defpackage.yu3
    public final void b(uu3 uu3Var, uu3 uu3Var2, boolean z) {
        l91 l91Var = this.a;
        if (uu3Var != null) {
            xj1 xj1Var = (xj1) l91Var.Y.getValue();
            boolean z2 = uu3Var instanceof iq9;
            boolean zA = xj1Var.a();
            l91 l91Var2 = xj1Var.a;
            if (z2) {
                l91Var2.f(true);
                l91.e(l91Var2);
            } else {
                l91Var2.g(false);
                if (zA) {
                    Activity activity = l91Var2.Z;
                    nb5 nb5Var = l91Var2.b;
                    if (activity != null) {
                        ((cb5) nb5Var).d(activity, l91.c());
                    }
                    Activity activity2 = l91Var2.Z;
                    if (activity2 != null && l91Var2.v0) {
                        znc zncVarC = l91.c();
                        cb5 cb5Var = (cb5) nb5Var;
                        cb5Var.getClass();
                        hm9.n("FakePipController", "try to show local pip");
                        xg1 xg1Var = cb5Var.g;
                        Float fValueOf = xg1Var != null ? Float.valueOf(xg1Var.getAlpha()) : null;
                        if (fValueOf != null && fValueOf.floatValue() == 1.0f && ft.l(xg1Var)) {
                            hm9.n("FakePipController", "local pip already in show progress");
                        } else {
                            cb5Var.d(activity2, zncVarC);
                            if (xg1Var != null) {
                                xg1Var.setVisibility(8);
                            }
                            tg1 tg1Var = (tg1) cb5Var.a.getValue();
                            String str = ((wr1) ((kr1) cb5Var.e.getValue())).k().c;
                            w1e w1eVar = (w1e) tg1Var;
                            q0e q0eVar = w1eVar.a;
                            Object value = q0eVar.getValue();
                            v1e v1eVar = v1e.b;
                            if (value != v1eVar) {
                                w1eVar.a(str, true);
                            }
                            q0eVar.m(null, v1eVar);
                            if (xg1Var != null) {
                                ft.g(xg1Var, true, 0L, null, 4);
                            }
                        }
                        l91Var2.y0.f(l91.c().e().size() < 2);
                    }
                } else {
                    l91.e(l91Var2);
                }
            }
        }
        l91Var.j();
    }
}
