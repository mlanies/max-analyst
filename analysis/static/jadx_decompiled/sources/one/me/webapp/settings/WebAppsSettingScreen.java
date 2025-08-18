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
import defpackage.b3g;
import defpackage.bc7;
import defpackage.bse;
import defpackage.bvc;
import defpackage.c3g;
import defpackage.cla;
import defpackage.d3g;
import defpackage.d71;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.g3g;
import defpackage.glc;
import defpackage.gte;
import defpackage.hob;
import defpackage.iba;
import defpackage.je7;
import defpackage.jwf;
import defpackage.kka;
import defpackage.kla;
import defpackage.mla;
import defpackage.nec;
import defpackage.nhd;
import defpackage.o;
import defpackage.od2;
import defpackage.q1d;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.rpc;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v3c;
import defpackage.x27;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/webapp/settings/WebAppsSettingScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "web-app_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class WebAppsSettingScreen extends Widget {
    public static final /* synthetic */ bc7[] X;
    public final glc a;
    public final je7 b;
    public final q7c c;
    public final a3g o;

    static {
        hob hobVar = new hob(WebAppsSettingScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        X = new bc7[]{hobVar};
    }

    public WebAppsSettingScreen() {
        super(null, 0, 3, null);
        this.a = new glc(new bse(23), null, 6);
        je7 je7VarCreateViewModelLazy = createViewModelLazy(g3g.class, new nhd(18, new bse(24)));
        this.b = je7VarCreateViewModelLazy;
        this.c = viewBinding(kla.f);
        this.o = new a3g(((iba) jwf.a.getAccessor().c(iba.class)).a(), new d3g(this), 0);
        od2.L(new zn5(((g3g) je7VarCreateViewModelLazy.getValue()).Y, new b3g(null, this), 5), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final x27 getB() {
        x27 x27Var = x27.c;
        return x27.d;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.a;
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
        claVar.setTitle(mla.l);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new rpc(17, this)));
        linearLayout.addView(claVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(kla.f);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        float f = 12;
        recyclerView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.o);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new gte(18, this), null, 12));
        recyclerView.j(new d71());
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, null, 17), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        ((RecyclerView) this.c.T0(this, X[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((g3g) this.b.getValue()).Z, getViewLifecycleOwner().Q(), fg7.o), new c3g(null, this), 5), getViewLifecycleScope());
    }
}
