package one.me.webapp.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a3g;
import defpackage.bc7;
import defpackage.bse;
import defpackage.bvc;
import defpackage.bwf;
import defpackage.cla;
import defpackage.d71;
import defpackage.dy7;
import defpackage.e09;
import defpackage.eh2;
import defpackage.f0g;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.g0g;
import defpackage.glc;
import defpackage.gte;
import defpackage.h0g;
import defpackage.hob;
import defpackage.i0g;
import defpackage.iba;
import defpackage.je7;
import defpackage.jwf;
import defpackage.kka;
import defpackage.kla;
import defpackage.kpa;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nhd;
import defpackage.o;
import defpackage.od2;
import defpackage.oec;
import defpackage.p0g;
import defpackage.q1d;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.rpc;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v3c;
import defpackage.w7c;
import defpackage.x27;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/webapp/settings/WebAppSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "botId", "(J)V", "web-app_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class WebAppSettingsScreen extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] s0;
    public final q7c X;
    public bwf Y;
    public final a3g Z;
    public final glc a;
    public final x27 b;
    public final je7 c;
    public final q7c o;

    static {
        hob hobVar = new hob(WebAppSettingsScreen.class, "botId", "getBotId()J", 0);
        oec oecVar = nec.a;
        s0 = new bc7[]{hobVar, zr6.e(oecVar, WebAppSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), zr6.f(WebAppSettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oecVar)};
    }

    public WebAppSettingsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new glc(new bse(22), null, 6);
        this.b = x27.d;
        this.c = createViewModelLazy(p0g.class, new nhd(17, new eh2(bundle, 11)));
        this.o = viewBinding(kla.f);
        this.X = viewBinding(kla.i);
        this.Z = new a3g(((iba) jwf.a.getAccessor().c(iba.class)).a(), new i0g(this), 0);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.a;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
    }

    public final p0g m0() {
        return (p0g) this.c.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla claVar = new cla(linearLayout.getContext(), 6);
        claVar.setId(kla.i);
        claVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new rpc(16, this)));
        linearLayout.addView(claVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(kla.f);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.Z);
        float f = 12;
        recyclerView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new gte(17, this), null, 12));
        recyclerView.j(new d71());
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, null, 16), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        ((RecyclerView) this.o.T0(this, s0[1])).setAdapter(null);
        this.Y = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.Y = new bwf(requireActivity(), new e09(0, m0(), p0g.class, "onBiometrySuccess", "onBiometrySuccess()V", 0, 18), new e09(0, m0(), p0g.class, "onBiometryFail", "onBiometryFail()V", 0, 19));
        w7c w7cVar = m0().u0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new f0g(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().v0, getViewLifecycleOwner().Q(), fg7Var), new g0g(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().w0, getViewLifecycleOwner().Q(), fg7Var), new h0g(null, this), 5), getViewLifecycleScope());
    }

    public WebAppSettingsScreen(long j) {
        this(dy7.g(new kpa("bot_id_arg", Long.valueOf(j))));
    }
}
