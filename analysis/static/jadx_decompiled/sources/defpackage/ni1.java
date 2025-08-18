package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;

/* loaded from: classes.dex */
public final class ni1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.Y = callScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ni1 ni1Var = (ni1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ni1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ni1 ni1Var = new ni1(continuation, this.Y);
        ni1Var.X = obj;
        return ni1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        gg1 gg1Var;
        iaf iafVar;
        m31 m31Var;
        m31 m31Var2;
        final int i = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        od2.a0(obj);
        j41 j41Var = (j41) this.X;
        boolean zF = tpa.f(j41Var, i41.a);
        CallScreen callScreen = this.Y;
        if (zF) {
            yxc yxcVar = CallScreen.R0;
            callScreen.s0(false);
        } else {
            if (!(j41Var instanceof h41)) {
                throw new NoWhenBranchMatchedException();
            }
            jp1 jp1Var = ((h41) j41Var).a;
            yxc yxcVar2 = CallScreen.R0;
            callScreen.getClass();
            w4f w4fVar = jp1Var.c;
            Object[] objArr3 = w4fVar != null;
            br7.F(callScreen.A0(), callScreen.t0(), null);
            final q21 q21VarT0 = callScreen.t0();
            q21VarT0.setVisibility(objArr3 != false ? 0 : 8);
            md0 md0Var = (w4fVar == null || (m31Var2 = w4fVar.c) == null) ? null : m31Var2.c;
            od0 od0Var = (w4fVar == null || (m31Var = w4fVar.c) == null) ? null : m31Var.d;
            no1 no1Var = q21VarT0.G0;
            no1Var.getClass();
            String str = md0Var != null ? md0Var.b : null;
            uc0 uc0Var = md0Var != null ? md0Var.a : null;
            s5a s5aVar = no1Var.G0;
            s5a.h(s5aVar, str, uc0Var);
            s5aVar.setCustomOverlay(od0Var);
            if (q21VarT0.getVisibility() == 0) {
                q21VarT0.setName(w4fVar != null ? w4fVar.a : null);
                q21VarT0.setStatus(w4fVar != null ? w4fVar.b : null);
                no1Var.R(w4fVar != null ? w4fVar.d : false, w4fVar != null ? w4fVar.e : false ? x7a.b : x7a.a, f0c.call_cancel, new k56() { // from class: o21
                    @Override // defpackage.k56
                    public final Object invoke() {
                        e5f e5fVar = e5f.a;
                        q21 q21Var = q21VarT0;
                        switch (i) {
                            case 0:
                                p21 p21Var = q21Var.H0;
                                if (p21Var != null) {
                                    yxc yxcVar3 = CallScreen.R0;
                                    ((CallScreen) ((gaa) p21Var).a).s0(true);
                                    break;
                                }
                                break;
                            default:
                                p21 p21Var2 = q21Var.H0;
                                if (p21Var2 != null) {
                                    yxc yxcVar4 = CallScreen.R0;
                                    CallScreen callScreen2 = (CallScreen) ((gaa) p21Var2).a;
                                    callScreen2.y0().e(zs1.RECALL, false);
                                    el1 el1VarD0 = callScreen2.D0();
                                    la1 la1VarS = el1VarD0.s();
                                    j1e j1eVar = la1VarS.c;
                                    m38 m38Var = m38.b;
                                    boolean z = la1VarS.q == m38Var;
                                    boolean z2 = la1VarS.r == m38Var;
                                    ir1 ir1Var = el1VarD0.c;
                                    ir1Var.getClass();
                                    if (j1eVar != null) {
                                        ((wr1) ir1Var.a).A(new lyd(new jyd(j1eVar), z, z2, null));
                                        ir1Var.o(u9f.o);
                                        ir1Var.v.o1(ir1Var, ir1.y[0], od2.L(ir1Var.w, ir1Var.k));
                                    }
                                    ir1Var.m();
                                    ir1Var.n();
                                    break;
                                }
                                break;
                        }
                        return e5fVar;
                    }
                });
                int i2 = x7a.c;
                int i3 = f0c.call_recall;
                final Object[] objArr4 = objArr2 == true ? 1 : 0;
                no1Var.Q(i2, i3, new k56() { // from class: o21
                    @Override // defpackage.k56
                    public final Object invoke() {
                        e5f e5fVar = e5f.a;
                        q21 q21Var = q21VarT0;
                        switch (objArr4) {
                            case 0:
                                p21 p21Var = q21Var.H0;
                                if (p21Var != null) {
                                    yxc yxcVar3 = CallScreen.R0;
                                    ((CallScreen) ((gaa) p21Var).a).s0(true);
                                    break;
                                }
                                break;
                            default:
                                p21 p21Var2 = q21Var.H0;
                                if (p21Var2 != null) {
                                    yxc yxcVar4 = CallScreen.R0;
                                    CallScreen callScreen2 = (CallScreen) ((gaa) p21Var2).a;
                                    callScreen2.y0().e(zs1.RECALL, false);
                                    el1 el1VarD0 = callScreen2.D0();
                                    la1 la1VarS = el1VarD0.s();
                                    j1e j1eVar = la1VarS.c;
                                    m38 m38Var = m38.b;
                                    boolean z = la1VarS.q == m38Var;
                                    boolean z2 = la1VarS.r == m38Var;
                                    ir1 ir1Var = el1VarD0.c;
                                    ir1Var.getClass();
                                    if (j1eVar != null) {
                                        ((wr1) ir1Var.a).A(new lyd(new jyd(j1eVar), z, z2, null));
                                        ir1Var.o(u9f.o);
                                        ir1Var.v.o1(ir1Var, ir1.y[0], od2.L(ir1Var.w, ir1Var.k));
                                    }
                                    ir1Var.m();
                                    ir1Var.n();
                                    break;
                                }
                                break;
                        }
                        return e5fVar;
                    }
                });
                no1Var.N(w4fVar != null ? w4fVar.f : false);
            }
            qd7 qd7Var = jp1Var.d;
            boolean z = qd7Var != null;
            if (br7.G(callScreen.C0()) || z) {
                br7.F(callScreen.C0(), callScreen.v0(), null);
                callScreen.v0().setActive(z);
                dm1 dm1VarV0 = callScreen.v0();
                if (z) {
                    if (qd7Var == null || (gg1Var = qd7Var.a) == null) {
                        gg1Var = gg1.c;
                    }
                    dm1VarV0.setParticipantId(gg1Var);
                    if (qd7Var == null || (iafVar = qd7Var.e) == null) {
                        iafVar = iaf.o;
                    }
                    if (dm1VarV0.S0 != iafVar) {
                        dm1VarV0.S0 = iafVar;
                        AppCompatImageView appCompatImageView = dm1VarV0.K0;
                        int iOrdinal = iafVar.ordinal();
                        if (iOrdinal == 0) {
                            appCompatImageView.setVisibility(0);
                            appCompatImageView.setImageResource(x7a.b0);
                            appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(f0c.call_user_item_more));
                            tu0.K(appCompatImageView, 300L, new tb(appCompatImageView, 6, dm1VarV0));
                        } else if (iOrdinal == 1) {
                            appCompatImageView.setVisibility(0);
                            appCompatImageView.setImageResource(x7a.l0);
                            appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(b8a.c2));
                            tu0.K(appCompatImageView, 300L, new bm1(dm1VarV0, objArr == true ? 1 : 0));
                        } else {
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            appCompatImageView.setVisibility(8);
                            appCompatImageView.setContentDescription(null);
                        }
                    }
                    boolean z2 = qd7Var != null ? qd7Var.c : false;
                    if (!tpa.f(dm1VarV0.N0, Boolean.valueOf(z2))) {
                        dm1VarV0.N0 = Boolean.valueOf(z2);
                        dm1VarV0.L0.setVisibility(z2 ? 0 : 8);
                    }
                    dm1VarV0.setLabel(qd7Var != null ? qd7Var.b : null);
                    boolean z3 = qd7Var != null ? qd7Var.d : false;
                    if (!tpa.f(dm1VarV0.O0, Boolean.valueOf(z3))) {
                        dm1VarV0.O0 = Boolean.valueOf(z3);
                        dm1VarV0.x();
                    }
                }
            }
            md0 md0Var2 = jp1Var.f;
            if (md0Var2 != null && jp1Var.c == null) {
                br7.F(callScreen.A0(), callScreen.t0(), null);
                no1 no1Var2 = callScreen.t0().G0;
                no1Var2.getClass();
                s5a s5aVar2 = no1Var2.G0;
                s5a.h(s5aVar2, md0Var2.b, md0Var2.a);
                s5aVar2.setCustomOverlay(null);
            }
            if (jp1Var.g) {
                uu3 uu3VarB = callScreen.u0().b();
                CallEventsWidget callEventsWidget = uu3VarB instanceof CallEventsWidget ? (CallEventsWidget) uu3VarB : null;
                if (callEventsWidget != null) {
                    callEventsWidget.getRouter().B(callEventsWidget);
                    f9 f9Var = callEventsWidget.a;
                    if (f9Var != null) {
                        CallScreen callScreen2 = (CallScreen) f9Var.b;
                        callScreen2.z0().a.remove((CallEventsWidget) f9Var.c);
                        callScreen2.u0().a();
                    }
                    callEventsWidget.a = null;
                }
            } else if (callScreen.u0().b() == null) {
                callScreen.u0().d("call_events_widget_tag", new ci1(callScreen, 11));
            }
        }
        return e5f.a;
    }
}
