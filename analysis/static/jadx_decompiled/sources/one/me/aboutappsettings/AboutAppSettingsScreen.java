package one.me.aboutappsettings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.cla;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.g4a;
import defpackage.h;
import defpackage.iba;
import defpackage.je7;
import defpackage.jv5;
import defpackage.kka;
import defpackage.l;
import defpackage.m;
import defpackage.n;
import defpackage.o;
import defpackage.od2;
import defpackage.p;
import defpackage.q;
import defpackage.q1d;
import defpackage.qp4;
import defpackage.s;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v;
import defpackage.v3c;
import defpackage.w7c;
import defpackage.x27;
import defpackage.xw0;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/aboutappsettings/AboutAppSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "about-app-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class AboutAppSettingsScreen extends Widget {
    public static final /* synthetic */ int c = 0;
    public final je7 a;
    public final jv5 b;

    /* JADX WARN: Multi-variable type inference failed */
    public AboutAppSettingsScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = createViewModelLazy(v.class, new s(0, new m(0)));
        this.b = new jv5(((iba) h.a.getAccessor().d(iba.class).getValue()).a(), new n(this), 1);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final x27 getB() {
        x27 x27Var = x27.c;
        return x27.d;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cla claVar = new cla(getContext(), 6);
        claVar.setForm(uka.a);
        claVar.setTitle(g4a.a);
        claVar.setLeftActions(new kka(new l(0, this)));
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        float f = 12;
        recyclerView.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.b);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new xw0(6), null, 8));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(claVar);
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, null, 0), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        je7 je7Var = this.a;
        w7c w7cVar = ((v) je7Var.getValue()).X;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new p(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((v) je7Var.getValue()).c, getViewLifecycleOwner().Q(), fg7Var), new q(null, this), 5), getViewLifecycleScope());
    }
}
