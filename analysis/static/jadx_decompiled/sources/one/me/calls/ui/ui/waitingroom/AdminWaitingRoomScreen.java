package one.me.calls.ui.ui.waitingroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.aba;
import defpackage.au1;
import defpackage.b7a;
import defpackage.b8a;
import defpackage.bc7;
import defpackage.c7a;
import defpackage.cla;
import defpackage.dj3;
import defpackage.eqe;
import defpackage.fk4;
import defpackage.fp3;
import defpackage.hob;
import defpackage.iq9;
import defpackage.ja;
import defpackage.je7;
import defpackage.kka;
import defpackage.l;
import defpackage.l2a;
import defpackage.la;
import defpackage.m;
import defpackage.nec;
import defpackage.od2;
import defpackage.oec;
import defpackage.pq9;
import defpackage.q7c;
import defpackage.qa;
import defpackage.qp4;
import defpackage.s;
import defpackage.tu0;
import defpackage.uka;
import defpackage.x27;
import defpackage.x5;
import defpackage.x7a;
import defpackage.y7a;
import defpackage.z6a;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/calls/ui/ui/waitingroom/AdminWaitingRoomScreen;", "Lone/me/sdk/arch/Widget;", "Liq9;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class AdminWaitingRoomScreen extends Widget implements iq9 {
    public static final /* synthetic */ bc7[] s0;
    public final q7c X;
    public final q7c Y;
    public final je7 Z;
    public final je7 a;
    public final q7c b;
    public final q7c c;
    public final q7c o;

    static {
        hob hobVar = new hob(AdminWaitingRoomScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        oec oecVar = nec.a;
        s0 = new bc7[]{hobVar, zr6.e(oecVar, AdminWaitingRoomScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), zr6.f(AdminWaitingRoomScreen.class, "applyAllButton", "getApplyAllButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar), zr6.f(AdminWaitingRoomScreen.class, "rejectAllButton", "getRejectAllButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar), zr6.f(AdminWaitingRoomScreen.class, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0, oecVar)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdminWaitingRoomScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = createViewModelLazy(qa.class, new s(4, new m(3)));
        this.b = viewBinding(y7a.T0);
        this.c = viewBinding(y7a.Q0);
        this.o = viewBinding(y7a.O0);
        this.X = viewBinding(y7a.S0);
        this.Y = viewBinding(y7a.P0);
        this.Z = tu0.r(3, new x5(5, this));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final x27 getB() {
        x27 x27Var = x27.c;
        return x27.d;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        pq9 pq9Var = qp4.u0;
        constraintLayout.setBackgroundColor(pq9Var.p(constraintLayout).c.b().k);
        cla claVar = new cla(getContext(), 6);
        claVar.setId(y7a.T0);
        claVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        claVar.setCustomTheme(pq9Var.p(claVar).c);
        claVar.setTitle(b8a.X0);
        claVar.setSubtitle(b8a.j2);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new l(5, this)));
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setId(y7a.Q0);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter((ja) this.Z.getValue());
        recyclerView.setItemAnimator(null);
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setId(y7a.O0);
        oneMeButton.setCustomTheme(pq9Var.p(oneMeButton).c);
        c7a c7aVar = c7a.c;
        oneMeButton.setSize(c7aVar);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setText(b8a.S0);
        final int i = 0;
        tu0.K(oneMeButton, 300L, new View.OnClickListener(this) { // from class: ka
            public final /* synthetic */ AdminWaitingRoomScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdminWaitingRoomScreen adminWaitingRoomScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = AdminWaitingRoomScreen.s0;
                        ((qa) adminWaitingRoomScreen.a.getValue()).q(true);
                        break;
                    case 1:
                        bc7[] bc7VarArr2 = AdminWaitingRoomScreen.s0;
                        ((qa) adminWaitingRoomScreen.a.getValue()).q(false);
                        break;
                    default:
                        bc7[] bc7VarArr3 = AdminWaitingRoomScreen.s0;
                        adminWaitingRoomScreen.getRouter().B(adminWaitingRoomScreen);
                        break;
                }
            }
        });
        oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        OneMeButton oneMeButton2 = new OneMeButton(getContext(), null);
        oneMeButton2.setId(y7a.S0);
        oneMeButton2.setCustomTheme(pq9Var.p(oneMeButton2).c);
        oneMeButton2.setSize(c7aVar);
        oneMeButton2.setMode(b7a.b);
        oneMeButton2.setAppearance(z6a.c);
        oneMeButton2.setText(b8a.W0);
        final int i2 = 1;
        tu0.K(oneMeButton2, 300L, new View.OnClickListener(this) { // from class: ka
            public final /* synthetic */ AdminWaitingRoomScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdminWaitingRoomScreen adminWaitingRoomScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = AdminWaitingRoomScreen.s0;
                        ((qa) adminWaitingRoomScreen.a.getValue()).q(true);
                        break;
                    case 1:
                        bc7[] bc7VarArr2 = AdminWaitingRoomScreen.s0;
                        ((qa) adminWaitingRoomScreen.a.getValue()).q(false);
                        break;
                    default:
                        bc7[] bc7VarArr3 = AdminWaitingRoomScreen.s0;
                        adminWaitingRoomScreen.getRouter().B(adminWaitingRoomScreen);
                        break;
                }
            }
        });
        oneMeButton2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        aba abaVar = new aba(getContext(), null);
        abaVar.setId(y7a.P0);
        abaVar.setIcon(x7a.I0);
        abaVar.setTitle(new eqe(b8a.V0));
        abaVar.setSubtitle(new eqe(b8a.U0));
        final int i3 = 2;
        abaVar.x(abaVar.getContext().getString(b8a.T0), new View.OnClickListener(this) { // from class: ka
            public final /* synthetic */ AdminWaitingRoomScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdminWaitingRoomScreen adminWaitingRoomScreen = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = AdminWaitingRoomScreen.s0;
                        ((qa) adminWaitingRoomScreen.a.getValue()).q(true);
                        break;
                    case 1:
                        bc7[] bc7VarArr2 = AdminWaitingRoomScreen.s0;
                        ((qa) adminWaitingRoomScreen.a.getValue()).q(false);
                        break;
                    default:
                        bc7[] bc7VarArr3 = AdminWaitingRoomScreen.s0;
                        adminWaitingRoomScreen.getRouter().B(adminWaitingRoomScreen);
                        break;
                }
            }
        });
        abaVar.setCustomTheme(pq9Var.p(abaVar).c);
        abaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        abaVar.setVisibility(8);
        constraintLayout.addView(claVar);
        constraintLayout.addView(abaVar);
        constraintLayout.addView(recyclerView);
        constraintLayout.addView(oneMeButton);
        constraintLayout.addView(oneMeButton2);
        dj3 dj3VarQ = fp3.q(constraintLayout);
        int id = claVar.getId();
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 7, 0, 7);
        int id2 = recyclerView.getId();
        dj3VarQ.d(id2, 3, claVar.getId(), 4);
        dj3VarQ.d(id2, 6, 0, 6);
        dj3VarQ.d(id2, 7, 0, 7);
        dj3VarQ.d(id2, 4, oneMeButton.getId(), 3);
        int id3 = abaVar.getId();
        dj3VarQ.d(id3, 3, claVar.getId(), 4);
        dj3VarQ.d(id3, 6, 0, 6);
        dj3VarQ.d(id3, 7, 0, 7);
        dj3VarQ.d(id3, 4, 0, 4);
        int id4 = oneMeButton.getId();
        dj3VarQ.d(id4, 6, oneMeButton2.getId(), 6);
        float f = 12;
        new l2a(dj3VarQ, 6, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        dj3VarQ.d(id4, 7, oneMeButton2.getId(), 7);
        new l2a(dj3VarQ, 7, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        dj3VarQ.d(id4, 4, oneMeButton2.getId(), 3);
        new l2a(dj3VarQ, 4, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        int id5 = oneMeButton2.getId();
        dj3VarQ.d(id5, 6, 0, 6);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id5, 4));
        dj3VarQ.d(id5, 7, 0, 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id5, 4));
        dj3VarQ.d(id5, 4, 0, 4);
        new l2a(dj3VarQ, 4, id5, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        dj3VarQ.a(constraintLayout);
        return constraintLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        ((RecyclerView) this.c.T0(this, s0[1])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(((qa) this.a.getValue()).X, new la(this, null), 5), getLifecycleScope());
    }
}
