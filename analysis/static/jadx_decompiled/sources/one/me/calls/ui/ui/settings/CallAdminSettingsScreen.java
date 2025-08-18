package one.me.calls.ui.ui.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.aa;
import defpackage.an9;
import defpackage.b01;
import defpackage.b8a;
import defpackage.bc7;
import defpackage.bt1;
import defpackage.c01;
import defpackage.cla;
import defpackage.d01;
import defpackage.dz0;
import defpackage.ez0;
import defpackage.fg7;
import defpackage.foc;
import defpackage.hob;
import defpackage.iba;
import defpackage.iq9;
import defpackage.je7;
import defpackage.k01;
import defpackage.k56;
import defpackage.kka;
import defpackage.kr1;
import defpackage.ky7;
import defpackage.lq0;
import defpackage.m;
import defpackage.nec;
import defpackage.od2;
import defpackage.pq9;
import defpackage.q1d;
import defpackage.q7c;
import defpackage.qe5;
import defpackage.qp4;
import defpackage.s;
import defpackage.se5;
import defpackage.tnd;
import defpackage.tu0;
import defpackage.uka;
import defpackage.uu3;
import defpackage.wmc;
import defpackage.wr1;
import defpackage.x27;
import defpackage.y7a;
import defpackage.yz0;
import defpackage.zi1;
import defpackage.zn5;
import defpackage.znc;
import defpackage.zr6;
import defpackage.zz0;
import kotlin.Metadata;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/calls/ui/ui/settings/CallAdminSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Liq9;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallAdminSettingsScreen extends Widget implements iq9 {
    public static final /* synthetic */ bc7[] t0 = {new hob(CallAdminSettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.e(nec.a, CallAdminSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final je7 X;
    public final je7 Y;
    public final q7c Z;
    public final x27 a;
    public final je7 b;
    public final dz0 c;
    public final je7 o;
    public final je7 s0;

    /* JADX WARN: Multi-variable type inference failed */
    public CallAdminSettingsScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = x27.d;
        this.b = createViewModelLazy(k01.class, new s(8, new m(24)));
        dz0 dz0Var = new dz0(new wmc(this, false), ((iba) zi1.a.getAccessor().c(iba.class)).a());
        this.c = dz0Var;
        final int i = 0;
        this.o = tu0.r(3, new k56(this) { // from class: a01
            public final /* synthetic */ CallAdminSettingsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                CallAdminSettingsScreen callAdminSettingsScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = CallAdminSettingsScreen.t0;
                        return new q1d(qp4.u0.o(callAdminSettingsScreen.getContext()).c, new ync(13, callAdminSettingsScreen), new l(17, callAdminSettingsScreen), 4);
                    default:
                        bc7[] bc7VarArr2 = CallAdminSettingsScreen.t0;
                        return new b01(callAdminSettingsScreen);
                }
            }
        });
        this.X = tu0.r(3, new m(25));
        this.Y = tu0.r(3, new m(26));
        viewBinding(y7a.T);
        this.Z = viewBinding(y7a.S);
        od2.L(new zn5(m0().s0, new lq0(2, dz0Var, dz0.class, "submitList", "submitList(Ljava/util/List;)V", 4, 2), 5), getLifecycleScope());
        final int i2 = 1;
        this.s0 = tu0.r(3, new k56(this) { // from class: a01
            public final /* synthetic */ CallAdminSettingsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                CallAdminSettingsScreen callAdminSettingsScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = CallAdminSettingsScreen.t0;
                        return new q1d(qp4.u0.o(callAdminSettingsScreen.getContext()).c, new ync(13, callAdminSettingsScreen), new l(17, callAdminSettingsScreen), 4);
                    default:
                        bc7[] bc7VarArr2 = CallAdminSettingsScreen.t0;
                        return new b01(callAdminSettingsScreen);
                }
            }
        });
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getA() {
        return this.a;
    }

    public final k01 m0() {
        return (k01) this.b.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla claVar = new cla(linearLayout.getContext(), 6);
        claVar.setId(y7a.T);
        claVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        claVar.setTitle(b8a.z);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new c01(0, this)));
        pq9 pq9Var = qp4.u0;
        claVar.setCustomTheme(pq9Var.p(claVar).c);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(y7a.S);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.c);
        recyclerView.setItemAnimator(null);
        recyclerView.j((q1d) this.o.getValue());
        recyclerView.j((zz0) this.X.getValue());
        linearLayout.addView(claVar);
        linearLayout.addView(recyclerView);
        linearLayout.setBackgroundColor(pq9Var.p(linearLayout).c.b().l);
        return linearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        if (((tnd) this.Y.getValue()) != null) {
            tnd.a();
        }
        uu3 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        foc focVar = parentController instanceof foc ? (foc) parentController : null;
        znc zncVarT = focVar != null ? focVar.T() : null;
        if (zncVarT != null) {
            zncVarT.K((b01) this.s0.getValue());
        }
        bc7[] bc7VarArr = t0;
        bc7 bc7Var = bc7VarArr[1];
        q7c q7cVar = this.Z;
        ((RecyclerView) q7cVar.T0(this, bc7Var)).setAdapter(null);
        ((RecyclerView) q7cVar.T0(this, bc7VarArr[1])).p0((zz0) this.X.getValue());
        ((RecyclerView) q7cVar.T0(this, bc7VarArr[1])).p0((q1d) this.o.getValue());
        k01 k01VarM0 = m0();
        ((wr1) ((kr1) k01VarM0.X.getValue())).G.remove(k01VarM0);
        ez0 ez0VarQ = k01VarM0.q();
        ez0VarQ.getClass();
        aa aaVar = (aa) ((yz0) ez0VarQ).F0.getValue();
        bt1 bt1Var = (bt1) k01VarM0.Y.getValue();
        boolean z = aaVar.b;
        je7 je7Var = k01VarM0.o;
        se5 se5Var = (se5) ((qe5) je7Var.getValue());
        se5Var.getClass();
        boolean z2 = se5Var.n(PmsKey.grse, false) ? aaVar.e : false;
        se5 se5Var2 = (se5) ((qe5) je7Var.getValue());
        se5Var2.getClass();
        boolean z3 = se5Var2.n(PmsKey.gcwre, false) ? aaVar.g : false;
        bt1Var.getClass();
        ky7 ky7Var = new ky7();
        Integer numD = ((an9) bt1Var.c.getValue()).d();
        if (numD != null) {
            ky7Var.put("screen", Integer.valueOf(numD.intValue()));
        }
        ky7Var.put("camera", Boolean.valueOf(z));
        ky7Var.put("microphone", Boolean.valueOf(aaVar.c));
        ky7Var.put("screenshare", Boolean.valueOf(aaVar.d));
        ky7Var.put("recording", Boolean.valueOf(z2));
        ky7Var.put("waiting", Boolean.valueOf(z3));
        bt1Var.b("ADMIN_CALL_SETTINGS", ky7Var.b());
        super.onDestroyView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        uu3 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        foc focVar = parentController instanceof foc ? (foc) parentController : null;
        znc zncVarT = focVar != null ? focVar.T() : null;
        if (zncVarT != null) {
            zncVarT.a((b01) this.s0.getValue());
        }
        od2.L(new zn5(tu0.g(m0().t0, getViewLifecycleOwner().Q(), fg7.o), new d01(null, this), 5), getViewLifecycleScope());
    }
}
