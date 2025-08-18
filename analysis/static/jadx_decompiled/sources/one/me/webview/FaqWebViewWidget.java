package one.me.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.al;
import defpackage.bc7;
import defpackage.cla;
import defpackage.ds3;
import defpackage.f5a;
import defpackage.hla;
import defpackage.hob;
import defpackage.j47;
import defpackage.je7;
import defpackage.jy2;
import defpackage.kka;
import defpackage.kke;
import defpackage.mqd;
import defpackage.nec;
import defpackage.nla;
import defpackage.ola;
import defpackage.q33;
import defpackage.q3g;
import defpackage.q7c;
import defpackage.qb5;
import defpackage.rb5;
import defpackage.rh4;
import defpackage.ri4;
import defpackage.sb5;
import defpackage.uka;
import defpackage.w4d;
import defpackage.w9a;
import defpackage.x27;
import defpackage.x77;
import defpackage.xe5;
import defpackage.y7d;
import defpackage.zf4;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/webview/FaqWebViewWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "webview_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class FaqWebViewWidget extends Widget {
    public static final /* synthetic */ bc7[] Z = {new hob(FaqWebViewWidget.class, "webView", "getWebView()Lone/me/sdk/uikit/common/views/OneMeWebView;", 0), rh4.g(nec.a, FaqWebViewWidget.class, "urlJob", "getUrlJob()Lkotlinx/coroutines/Job;")};
    public final xe5 X;
    public final zf4 Y;
    public final q7c a;
    public final x27 b;
    public final w4d c;
    public final je7 o;

    public FaqWebViewWidget() {
        super(null, 0, 3, null);
        this.a = viewBinding(nla.a);
        this.b = x27.d;
        this.c = mqd.D();
        q3g q3gVar = q3g.a;
        this.o = q3gVar.getAccessor().d(al.class);
        this.X = new xe5(q3gVar.getAccessor().d(ri4.class), q3gVar.getAccessor().d(f5a.class), q3gVar.getAccessor().d(ds3.class), q3gVar.getAccessor().d(q33.class), q3gVar.getAccessor().d(y7d.class), q3gVar.getAccessor().d(Context.class));
        this.Y = j47.h(getLifecycleScope(), ((w9a) ((kke) q3gVar.getAccessor().c(kke.class))).a(), new qb5(2, null), 2);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        cla claVar = new cla(linearLayout.getContext(), 6);
        claVar.setTitle(ola.b);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new jy2(12, this)));
        linearLayout.addView(claVar);
        hla hlaVar = new hla(linearLayout.getContext(), null, 0, 14);
        hlaVar.setId(nla.a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        hlaVar.setLayoutParams(layoutParams);
        hlaVar.getSettings().setJavaScriptEnabled(true);
        hlaVar.setWebViewClient(new rb5(this));
        linearLayout.addView(hlaVar);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        bc7[] bc7VarArr = Z;
        bc7 bc7Var = bc7VarArr[1];
        w4d w4dVar = this.c;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[1], null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        j47.T(getViewLifecycleScope(), null, null, new sb5(this, null), 3);
    }
}
