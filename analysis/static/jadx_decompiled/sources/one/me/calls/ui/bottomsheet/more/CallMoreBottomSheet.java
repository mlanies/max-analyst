package one.me.calls.ui.bottomsheet.more;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ac;
import defpackage.acc;
import defpackage.ae1;
import defpackage.ak1;
import defpackage.bc7;
import defpackage.be1;
import defpackage.ce1;
import defpackage.de1;
import defpackage.dy7;
import defpackage.ee1;
import defpackage.el1;
import defpackage.ez0;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fka;
import defpackage.fs;
import defpackage.hob;
import defpackage.iba;
import defpackage.ie1;
import defpackage.ix3;
import defpackage.j1e;
import defpackage.je7;
import defpackage.k11;
import defpackage.kl7;
import defpackage.kpa;
import defpackage.la1;
import defpackage.nec;
import defpackage.nnf;
import defpackage.nz4;
import defpackage.od2;
import defpackage.q7c;
import defpackage.qe5;
import defpackage.qp4;
import defpackage.qpa;
import defpackage.ry0;
import defpackage.s;
import defpackage.se5;
import defpackage.suc;
import defpackage.sy0;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.wmc;
import defpackage.x2;
import defpackage.y7a;
import defpackage.yz0;
import defpackage.z84;
import defpackage.zi1;
import defpackage.zn5;
import defpackage.zr6;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import ru.ok.android.externcalls.sdk.Conversation;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/more/CallMoreBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "Lbe1;", "type", "(Ljava/lang/String;Lbe1;Lz84;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallMoreBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ bc7[] x0 = {new hob(CallMoreBottomSheet.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), zr6.e(nec.a, CallMoreBottomSheet.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final je7 s0;
    public final je7 t0;
    public final q7c u0;
    public final je7 v0;
    public final ae1 w0;

    public CallMoreBottomSheet(String str, be1 be1Var, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("open_type", be1Var.name())));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onDestroyView(View view) {
        ((RecyclerView) this.u0.T0(this, x0[1])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        List listD;
        Conversation conversationA;
        je7 je7Var = this.t0;
        ie1 ie1Var = (ie1) je7Var.getValue();
        el1 el1Var = ie1Var.c;
        la1 la1Var = (la1) el1Var.C0.a.getValue();
        int iOrdinal = ie1Var.b.ordinal();
        if (iOrdinal != 0) {
            boolean z = true;
            if (iOrdinal == 1) {
                boolean z2 = la1Var.g;
                ak1 ak1Var = la1Var.i;
                if (z2) {
                    sy0 sy0Var = qpa.a;
                    boolean zIsMeCreatorOrAdmin = (!((se5) ((qe5) ie1Var.Y.getValue())).q() || (conversationA = ((yz0) ((ez0) ie1Var.X.getValue())).d().a()) == null) ? false : conversationA.isMeCreatorOrAdmin();
                    boolean zBooleanValue = ((Boolean) el1Var.z0.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) el1Var.B0.getValue()).booleanValue();
                    nnf nnfVar = (nnf) el1Var.N0.a.getValue();
                    kl7 kl7VarL = j1e.l();
                    if (la1Var.l && !ak1Var.a()) {
                        z = false;
                    }
                    nnf nnfVar2 = nnf.c;
                    if (nnfVar == nnfVar2 && z) {
                        kl7VarL.add(qpa.m);
                    } else if (nnfVar == nnfVar2) {
                        kl7VarL.add(qpa.l);
                    } else {
                        nnf nnfVar3 = nnf.a;
                        if (nnfVar == nnfVar3 && z) {
                            kl7VarL.add(qpa.k);
                        } else if (nnfVar == nnfVar3) {
                            kl7VarL.add(qpa.j);
                        }
                    }
                    if (zBooleanValue) {
                        qpa.a(kl7VarL, ak1Var);
                    }
                    if (zBooleanValue2) {
                        kl7VarL.addAll(qpa.b(la1Var.j));
                    }
                    if (zIsMeCreatorOrAdmin) {
                        kl7VarL.add(qpa.n);
                    }
                    listD = j1e.d(kl7VarL);
                } else {
                    sy0 sy0Var2 = qpa.a;
                    boolean zBooleanValue3 = ((Boolean) el1Var.A0.getValue()).booleanValue();
                    kl7 kl7VarL2 = j1e.l();
                    if (zBooleanValue3) {
                        qpa.a(kl7VarL2, ak1Var);
                    }
                    kl7VarL2.add(qpa.b);
                    kl7VarL2.add(qpa.a);
                    listD = j1e.d(kl7VarL2);
                }
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                sy0 sy0Var3 = qpa.a;
                listD = qpa.b(la1Var.j);
            }
        } else {
            listD = nz4.a;
        }
        this.w0.E(listD);
        ac acVar = ((ie1) je7Var.getValue()).t0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(acVar, getViewLifecycleOwner().Q(), fg7Var), new ce1(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((ie1) je7Var.getValue()).u0, getViewLifecycleOwner().Q(), fg7Var), new de1(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final fka q0() {
        return qp4.u0.o(getContext()).c;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View frameLayout2 = new FrameLayout(linearLayout.getContext());
        frameLayout2.setId(y7a.m0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(tu0.G(36 * fk4.d().getDisplayMetrics().density), tu0.G(5 * fk4.d().getDisplayMetrics().density));
        layoutParams2.gravity = 49;
        float f = 12;
        layoutParams2.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        layoutParams2.bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        frameLayout2.setLayoutParams(layoutParams2);
        frameLayout2.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 40.0f));
        frameLayout2.setBackgroundColor(qp4.u0.p(frameLayout2).c.getIcon().h);
        linearLayout.addView(frameLayout2);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(y7a.k0);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.w0);
        recyclerView.setItemAnimator(null);
        recyclerView.j(new ry0(0));
        linearLayout.addView(recyclerView);
        v3c.y(new ee1(3, null, 0), linearLayout);
        frameLayout.addView(linearLayout);
    }

    public CallMoreBottomSheet(Bundle bundle) {
        super(bundle);
        fs fsVar = new fs(suc.class, new suc("default"), Widget.ARG_SCOPE_ID);
        bc7 bc7Var = x0[0];
        this.s0 = m41getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, el1.class, null);
        this.t0 = createViewModelLazy(ie1.class, new s(17, new x2(bundle, this, 13)));
        this.u0 = viewBinding(y7a.k0);
        je7 je7VarR = tu0.r(3, new k11(17));
        this.v0 = je7VarR;
        this.w0 = new ae1(new wmc(this, false), (acc) je7VarR.getValue(), ((iba) zi1.a.getAccessor().c(iba.class)).a());
    }
}
