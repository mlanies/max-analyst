package one.me.appearancesettings.singletheme;

import android.annotation.SuppressLint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ac;
import defpackage.au1;
import defpackage.bc7;
import defpackage.br7;
import defpackage.bvc;
import defpackage.cla;
import defpackage.dj3;
import defpackage.du4;
import defpackage.fk4;
import defpackage.fp3;
import defpackage.glc;
import defpackage.hob;
import defpackage.hp;
import defpackage.i24;
import defpackage.i4f;
import defpackage.iba;
import defpackage.j47;
import defpackage.je7;
import defpackage.jq;
import defpackage.jv5;
import defpackage.khe;
import defpackage.kka;
import defpackage.kke;
import defpackage.kq;
import defpackage.kqe;
import defpackage.kxc;
import defpackage.l;
import defpackage.l2a;
import defpackage.m;
import defpackage.mr;
import defpackage.n4a;
import defpackage.nec;
import defpackage.ngg;
import defpackage.o4a;
import defpackage.od2;
import defpackage.oq;
import defpackage.or;
import defpackage.pq9;
import defpackage.pr;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.qq;
import defpackage.qr;
import defpackage.s;
import defpackage.sq;
import defpackage.sr;
import defpackage.tha;
import defpackage.ti3;
import defpackage.tr;
import defpackage.tu0;
import defpackage.uka;
import defpackage.ur;
import defpackage.v3c;
import defpackage.w7c;
import defpackage.w9a;
import defpackage.x27;
import defpackage.y52;
import defpackage.z7;
import defpackage.zaa;
import defpackage.zn5;
import defpackage.zr;
import defpackage.zr6;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/appearancesettings/singletheme/AppearanceSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "appearance-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class AppearanceSettingsScreen extends Widget {
    public static final /* synthetic */ bc7[] Z = {new hob(AppearanceSettingsScreen.class, "chatPreview", "getChatPreview()Lone/me/appearancesettings/singletheme/view/ChatAppearanceSelectorView;", 0), zr6.e(nec.a, AppearanceSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final jv5 X;
    public final je7 Y;
    public final glc a;
    public final je7 b;
    public final q7c c;
    public final je7 o;

    public AppearanceSettingsScreen() {
        super(null, 0, 3, null);
        this.a = new glc(new m(11), null, 6);
        this.b = createViewModelLazy(zr.class, new s(7, new m(12)));
        this.c = viewBinding(n4a.d);
        viewBinding(n4a.i);
        jq jqVar = jq.a;
        khe kheVarD = jqVar.getAccessor().d(iba.class);
        this.o = kheVarD;
        this.X = new jv5(new mr(m0()), ((iba) kheVarD.getValue()).a(), 2);
        this.Y = jqVar.getAccessor().d(hp.class);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final x27 getB() {
        x27 x27Var = x27.c;
        return x27.d;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.a;
    }

    public final zr m0() {
        return (zr) this.b.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        y52 y52Var = new y52(getContext(), ((iba) this.o.getValue()).a());
        y52Var.setId(n4a.d);
        y52Var.setBackgroundSelectedListener(new or(m0()));
        j47.T(getViewLifecycleScope(), null, null, new pr(y52Var, this, null), 3);
        cla claVar = new cla(getContext(), 6);
        claVar.setId(n4a.k);
        claVar.setForm(uka.a);
        claVar.setTitle(o4a.m);
        claVar.setLeftActions(new kka(new l(10, this)));
        TextView textView = new TextView(getContext());
        textView.setId(n4a.j);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        kqe kqeVar = i4f.u;
        kqeVar.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.j(textView).getText().g);
        textView.setText(z7.B(textView.getContext(), o4a.k));
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setId(n4a.i);
        recyclerView.setLayoutParams(new ti3(-1, 0));
        recyclerView.setAdapter(this.X);
        recyclerView.setItemAnimator(null);
        recyclerView.j(new kq(0));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        TextView textView2 = new TextView(getContext());
        textView2.setId(n4a.g);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        kqeVar.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.j(textView2).getText().g);
        textView2.setText(z7.B(textView2.getContext(), o4a.d));
        float[] fArr = new float[8];
        int i = 0;
        for (int i2 = 8; i < i2; i2 = 8) {
            fArr[i] = fk4.d().getDisplayMetrics().density * 16.0f;
            i++;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        ngg.G(shapeDrawable, pq9Var.b(getContext()).i().b().g);
        tha thaVar = new tha(getContext());
        thaVar.setId(n4a.h);
        thaVar.setLayoutParams(new ti3(0, 0));
        thaVar.setValueFrom(0.0f);
        thaVar.setValueTo(5.0f);
        thaVar.setStepSize(1.0f);
        thaVar.setValue(((kxc) ((hp) this.Y.getValue())).e("app.extra.text.size.mode", 1));
        thaVar.setBackground(shapeDrawable);
        TextView textView3 = new TextView(getContext());
        textView3.setId(n4a.f);
        textView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        i4f.E.b(textView3, du4.b);
        textView3.setTextColor(pq9Var.j(textView3).getText().g);
        textView3.setText(z7.B(textView3.getContext(), o4a.c));
        int i3 = 1;
        tu0.K(textView3, 300L, new oq(thaVar, textView3, i3));
        thaVar.B0.add(new qq(textView3, this, i3));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        float f = 12;
        float f2 = 16;
        constraintLayout.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        constraintLayout.setLayoutParams(layoutParams);
        jq jqVar = jq.a;
        od2.L(new zn5(od2.F(new ac((w7c) ((zaa) jqVar.getAccessor().c(zaa.class)).a, 2, this), ((w9a) ((kke) jqVar.getAccessor().d(kke.class).getValue())).a()), new qr(y52Var, null), 5), getViewLifecycleScope());
        constraintLayout.addView(y52Var);
        constraintLayout.addView(textView);
        constraintLayout.addView(recyclerView);
        constraintLayout.addView(textView2);
        constraintLayout.addView(textView3);
        constraintLayout.addView(thaVar);
        dj3 dj3VarQ = fp3.q(constraintLayout);
        int id = y52Var.getId();
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 7, 0, 7);
        int id2 = textView.getId();
        dj3VarQ.d(id2, 3, y52Var.getId(), 4);
        float f3 = 24;
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id2, 4));
        dj3VarQ.d(id2, 6, 0, 6);
        new l2a(dj3VarQ, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        int id3 = recyclerView.getId();
        dj3VarQ.d(id3, 3, textView.getId(), 4);
        float f4 = 6;
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id3, 4));
        dj3VarQ.d(id3, 6, 0, 6);
        dj3VarQ.d(id3, 7, 0, 7);
        int id4 = textView2.getId();
        dj3VarQ.d(id4, 3, recyclerView.getId(), 4);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id4, 4));
        dj3VarQ.d(id4, 6, 0, 6);
        new l2a(dj3VarQ, 6, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        int id5 = textView3.getId();
        dj3VarQ.d(id5, 3, recyclerView.getId(), 4);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id5, 4));
        dj3VarQ.d(id5, 7, 0, 7);
        new l2a(dj3VarQ, 7, id5, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        int id6 = thaVar.getId();
        dj3VarQ.d(id6, 3, textView2.getId(), 4);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id6, 4));
        dj3VarQ.d(id6, 6, 0, 6);
        dj3VarQ.d(id6, 7, 0, 7);
        dj3VarQ.a(constraintLayout);
        LinearLayout linearLayout = new LinearLayout(getContext());
        br7.e(linearLayout);
        linearLayout.setOrientation(1);
        linearLayout.addView(claVar);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ScrollView scrollView = new ScrollView(linearLayout.getContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollView.addView(constraintLayout);
        linearLayout.addView(scrollView);
        v3c.y(new sq(this, textView, textView2, textView3, shapeDrawable, y52Var, (Continuation) null), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        i24.s(new zn5(m0().F0, new sr(this, null), 5), getViewLifecycleScope());
        i24.s(new zn5(m0().I0, new tr(this, null), 5), getViewLifecycleScope());
        i24.s(new zn5(m0().G0, new ur(2, null), 5), getViewLifecycleScope());
        m0().x();
    }
}
