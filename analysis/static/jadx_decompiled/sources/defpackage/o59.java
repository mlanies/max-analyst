package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final /* synthetic */ class o59 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ o59(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        int i = 6;
        int i2 = 5;
        int i3 = 2;
        vx3 vx3Var = vx3.b;
        int i4 = 1;
        Continuation continuation = null;
        e5f e5fVar = e5f.a;
        MessagesListWidget messagesListWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = MessagesListWidget.X0;
                l89 l89VarB = messagesListWidget.x0().B();
                l89VarB.getClass();
                l89VarB.f(j47.S(l89VarB.c, l89VarB.b, vx3Var, new e89(l89VarB, null)));
                return e5fVar;
            case 1:
                FrameLayout frameLayout = (FrameLayout) obj;
                bc7[] bc7VarArr2 = MessagesListWidget.X0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), null, 6);
                endlessRecyclerView2.setId(mda.Q);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                endlessRecyclerView2.setLayoutManager(messagesListWidget.r0());
                m29 m29Var = messagesListWidget.A0;
                endlessRecyclerView2.setAdapter(m29Var);
                endlessRecyclerView2.setHasFixedSize(true);
                endlessRecyclerView2.setItemAnimator(null);
                endlessRecyclerView2.setThreshold(20);
                endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
                endlessRecyclerView2.setPager(new gd1(15, messagesListWidget));
                endlessRecyclerView2.m(messagesListWidget.M0);
                endlessRecyclerView2.m(messagesListWidget.N0);
                endlessRecyclerView2.m(messagesListWidget.O0);
                endlessRecyclerView2.k(new yc7(i4, messagesListWidget));
                f34 f34Var = new f34(new o59(messagesListWidget, i2));
                messagesListWidget.G0 = f34Var;
                h8e h8eVar = new h8e(endlessRecyclerView2, m29Var, f34Var);
                endlessRecyclerView2.j(h8eVar);
                messagesListWidget.H0 = h8eVar;
                r5f r5fVar = new r5f(m29Var, endlessRecyclerView2);
                endlessRecyclerView2.j(r5fVar);
                messagesListWidget.F0 = r5fVar;
                vge vgeVar = new vge(o19.a.getAccessor().d(go0.class), new WeakReference(endlessRecyclerView2), messagesListWidget.requireActivity(), new p59(messagesListWidget, 9), new o59(messagesListWidget, i));
                messagesListWidget.y0 = vgeVar;
                t69 t69Var = new t69(messagesListWidget, vgeVar);
                messagesListWidget.z0 = t69Var;
                t69Var.i(endlessRecyclerView2);
                v3c.y(new xh0(messagesListWidget, continuation, 21), endlessRecyclerView2);
                frameLayout.addView(endlessRecyclerView2);
                frameLayout.addView(messagesListWidget.q0());
                bc7 bc7Var = MessagesListWidget.X0[13];
                frameLayout.addView((h6c) messagesListWidget.U0.getValue());
                rwc rwcVar = new rwc(frameLayout.getContext());
                rwcVar.setId(mda.R);
                rwcVar.setOnClickListener(new o59(messagesListWidget, i3));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, tu0.G(6 * fk4.d().getDisplayMetrics().density), tu0.G(4 * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 8388693;
                frameLayout.addView(rwcVar, layoutParams);
                return e5fVar;
            case 2:
                bc7[] bc7VarArr3 = MessagesListWidget.X0;
                int iOrdinal = ((lwc) obj).ordinal();
                if (iOrdinal == 0) {
                    MessageModel messageModelL = messagesListWidget.A0.L(messagesListWidget.u0().getLinearLayoutManager().Y0());
                    if (messageModelL != null) {
                        l89 l89VarB2 = messagesListWidget.x0().B();
                        l89VarB2.getClass();
                        l89VarB2.f(j47.S(l89VarB2.c, l89VarB2.b, vx3Var, new i89(l89VarB2, messageModelL, null)));
                    }
                } else if (iOrdinal == 1) {
                    l89 l89VarB3 = messagesListWidget.x0().B();
                    l89VarB3.getClass();
                    l89VarB3.f(j47.S(l89VarB3.c, l89VarB3.b, vx3Var, new b89(l89VarB3, null)));
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l89 l89VarB4 = messagesListWidget.x0().B();
                    l89VarB4.getClass();
                    l89VarB4.f(j47.S(l89VarB4.c, l89VarB4.b, vx3Var, new d89(l89VarB4, null)));
                }
                return e5fVar;
            case 3:
                long jLongValue = ((Long) obj).longValue();
                bc7[] bc7VarArr4 = MessagesListWidget.X0;
                messagesListWidget.x0().G(jLongValue);
                return e5fVar;
            case 4:
                edf edfVar = (edf) obj;
                bc7[] bc7VarArr5 = MessagesListWidget.X0;
                if (edfVar instanceof cdf) {
                    n59 n59VarX0 = messagesListWidget.x0();
                    cdf cdfVar = (cdf) edfVar;
                    n59VarX0.getClass();
                    n59VarX0.n1.o1(n59VarX0, n59.D1[5], pnf.n(n59VarX0, null, vx3Var, new d59(n59VarX0, cdfVar, null), 1));
                    messagesListWidget.x0().H(cdfVar.c, cdfVar.a, null);
                } else {
                    if (!(edfVar instanceof ddf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n59 n59VarX02 = messagesListWidget.x0();
                    ddf ddfVar = (ddf) edfVar;
                    k19 k19Var = new k19(ddfVar.a, ddfVar.b);
                    n59VarX02.getClass();
                    n59VarX02.k1.o1(n59VarX02, n59.D1[2], j47.S(n59VarX02.a, n59VarX02.B0, vx3Var, new d49(n59VarX02, k19Var, null)));
                }
                return e5fVar;
            case 5:
                MessageModel messageModelL2 = messagesListWidget.A0.L(((Integer) obj).intValue());
                CharSequence charSequence = messageModelL2 != null ? messageModelL2.Y : null;
                if (charSequence == null || charSequence.length() == 0) {
                    return null;
                }
                return charSequence;
            default:
                int iIntValue = ((Integer) obj).intValue();
                bc7[] bc7VarArr6 = MessagesListWidget.X0;
                messagesListWidget.y0();
                MessageModel messageModelL3 = messagesListWidget.A0.L(iIntValue);
                if (messageModelL3 != null) {
                    g39 g39VarV0 = messagesListWidget.v0();
                    g39VarV0.getClass();
                    pnf.o(g39VarV0.t0, new e39(messageModelL3.a));
                }
                return e5fVar;
        }
    }
}
