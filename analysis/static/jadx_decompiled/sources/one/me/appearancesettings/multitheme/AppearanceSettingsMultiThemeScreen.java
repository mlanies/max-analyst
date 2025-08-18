package one.me.appearancesettings.multitheme;

import android.annotation.SuppressLint;
import android.content.Context;
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
import com.google.android.material.button.MaterialButtonToggleGroup;
import defpackage.ac;
import defpackage.ar;
import defpackage.au1;
import defpackage.bc7;
import defpackage.br7;
import defpackage.bvc;
import defpackage.cla;
import defpackage.cr;
import defpackage.dj3;
import defpackage.du4;
import defpackage.f18;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fp3;
import defpackage.glc;
import defpackage.hob;
import defpackage.hp;
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
import defpackage.kr;
import defpackage.kxc;
import defpackage.l2a;
import defpackage.m;
import defpackage.m56;
import defpackage.mqc;
import defpackage.n4a;
import defpackage.nec;
import defpackage.ngg;
import defpackage.nq;
import defpackage.o4a;
import defpackage.od2;
import defpackage.oec;
import defpackage.oq;
import defpackage.pq9;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.qq;
import defpackage.s;
import defpackage.sm2;
import defpackage.so9;
import defpackage.sq;
import defpackage.t03;
import defpackage.tha;
import defpackage.ti3;
import defpackage.tq;
import defpackage.tu0;
import defpackage.uka;
import defpackage.uq;
import defpackage.v3c;
import defpackage.w7c;
import defpackage.w9a;
import defpackage.wq;
import defpackage.x27;
import defpackage.xq;
import defpackage.z7;
import defpackage.zaa;
import defpackage.zn5;
import defpackage.zr6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/appearancesettings/multitheme/AppearanceSettingsMultiThemeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "appearance-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class AppearanceSettingsMultiThemeScreen extends Widget {
    public static final /* synthetic */ bc7[] s0;
    public final q7c X;
    public final je7 Y;
    public final jv5 Z;
    public final glc a;
    public final je7 b;
    public final q7c c;
    public final q7c o;

    static {
        hob hobVar = new hob(AppearanceSettingsMultiThemeScreen.class, "chatPreviewView", "getChatPreviewView()Lone/me/appearancesettings/multitheme/views/ChatPreviewView;", 0);
        oec oecVar = nec.a;
        s0 = new bc7[]{hobVar, zr6.e(oecVar, AppearanceSettingsMultiThemeScreen.class, "currentThemeTitle", "getCurrentThemeTitle()Landroid/widget/TextView;", 0), zr6.f(AppearanceSettingsMultiThemeScreen.class, "segmentedButtons", "getSegmentedButtons()Lcom/google/android/material/button/MaterialButtonToggleGroup;", 0, oecVar)};
    }

    public AppearanceSettingsMultiThemeScreen() {
        super(null, 0, 3, null);
        this.a = new glc(new m(9), null, 6);
        this.b = createViewModelLazy(kr.class, new s(6, new m(10)));
        this.c = viewBinding(n4a.d);
        this.o = viewBinding(n4a.e);
        this.X = viewBinding(n4a.l);
        jq jqVar = jq.a;
        khe kheVarD = jqVar.getAccessor().d(iba.class);
        this.Y = jqVar.getAccessor().d(hp.class);
        this.Z = new jv5(new cr(m0()), ((iba) kheVarD.getValue()).a(), 13);
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

    public final kr m0() {
        return (kr) this.b.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [nq] */
    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cla claVar = new cla(getContext(), 6);
        claVar.setId(n4a.k);
        claVar.setForm(uka.a);
        claVar.setTitle(o4a.m);
        final int i = 0;
        claVar.setLeftActions(new kka(new m56(this) { // from class: nq
            public final /* synthetic */ AppearanceSettingsMultiThemeScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = AppearanceSettingsMultiThemeScreen.s0;
                        kr krVarM0 = appearanceSettingsMultiThemeScreen.m0();
                        krVarM0.getClass();
                        pnf.o(krVarM0.C0, g43.b);
                        return e5f.a;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        jv5 jv5Var = appearanceSettingsMultiThemeScreen.Z;
                        boolean z = false;
                        if (jv5Var.j() > 0 && ((wre) ((ol7) jv5Var.C(iIntValue))).a) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        TextView textView = new TextView(getContext());
        textView.setId(n4a.g);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        i4f.u.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.j(textView).getText().g);
        textView.setText(z7.B(textView.getContext(), o4a.d));
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = fk4.d().getDisplayMetrics().density * 16.0f;
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
        TextView textView2 = new TextView(getContext());
        textView2.setId(n4a.f);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        i4f.E.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.j(textView2).getText().g);
        textView2.setText(z7.B(textView2.getContext(), o4a.c));
        int i3 = 0;
        tu0.K(textView2, 300L, new oq(thaVar, textView2, i3));
        thaVar.B0.add(new qq(textView2, this, i3));
        sm2 sm2Var = new sm2(getContext());
        sm2Var.setId(n4a.d);
        j47.T(getViewLifecycleScope(), null, null, new tq(sm2Var, this, null), 3);
        TextView textView3 = new TextView(getContext());
        textView3.setId(n4a.e);
        textView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        i4f.j.b(textView3, du4.b);
        textView3.setTextColor(pq9Var.j(textView3).getText().e);
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setId(n4a.i);
        recyclerView.setLayoutParams(new ti3(-2, 0));
        recyclerView.setAdapter(this.Z);
        recyclerView.setItemAnimator(null);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.o1(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.j(new kq(11));
        final int i4 = 1;
        recyclerView.j(new so9(recyclerView.getContext(), (nq) new m56(this) { // from class: nq
            public final /* synthetic */ AppearanceSettingsMultiThemeScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = this.b;
                switch (i4) {
                    case 0:
                        bc7[] bc7VarArr = AppearanceSettingsMultiThemeScreen.s0;
                        kr krVarM0 = appearanceSettingsMultiThemeScreen.m0();
                        krVarM0.getClass();
                        pnf.o(krVarM0.C0, g43.b);
                        return e5f.a;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        jv5 jv5Var = appearanceSettingsMultiThemeScreen.Z;
                        boolean z = false;
                        if (jv5Var.j() > 0 && ((wre) ((ol7) jv5Var.C(iIntValue))).a) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        TextView textView4 = new TextView(getContext());
        textView4.setId(n4a.j);
        textView4.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        i4f.u.b(textView4, du4.b);
        textView4.setTextColor(pq9Var.j(textView4).getText().g);
        textView4.setText(z7.B(textView4.getContext(), o4a.k));
        MaterialButtonToggleGroup materialButtonToggleGroup = new MaterialButtonToggleGroup(getContext(), null);
        materialButtonToggleGroup.setId(n4a.l);
        materialButtonToggleGroup.setLayoutParams(new ti3(-1, 0));
        materialButtonToggleGroup.setElevation(0.0f);
        materialButtonToggleGroup.setStateListAnimator(null);
        materialButtonToggleGroup.setSingleSelection(true);
        materialButtonToggleGroup.setSelectionRequired(true);
        materialButtonToggleGroup.setOrientation(0);
        materialButtonToggleGroup.c.add(new f18() { // from class: pq
            @Override // defpackage.f18
            public final void a(int i5, boolean z) {
                Object next;
                Object value;
                er erVar;
                bc7[] bc7VarArr = AppearanceSettingsMultiThemeScreen.s0;
                if (z) {
                    kr krVarM0 = this.a.m0();
                    q0e q0eVar = krVarM0.z0;
                    er erVar2 = (er) q0eVar.getValue();
                    if (erVar2 == null) {
                        return;
                    }
                    Iterator it = erVar2.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((int) ((fq) next).getItemId()) == i5) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    fq fqVar = (fq) next;
                    if (fqVar == null) {
                        return;
                    }
                    int iOrdinal = fqVar.a.ordinal();
                    qp4 qp4Var = krVarM0.y0;
                    jp jpVar = krVarM0.c;
                    if (iOrdinal == 0) {
                        jpVar.y("app.night.mode.system");
                        qp4Var.k(fq9.b);
                    } else if (iOrdinal == 1) {
                        jpVar.y("app.night.mode");
                        qp4Var.k(cq9.b);
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jpVar.y("app.night.mode.enabled");
                        qp4Var.k(dq9.b);
                    }
                    do {
                        value = q0eVar.getValue();
                        er erVar3 = (er) value;
                        if (erVar3 != null) {
                            List<fq> list = erVar3.b;
                            ArrayList arrayList = new ArrayList(z53.S(list, 10));
                            for (fq fqVar2 : list) {
                                int itemId = (int) fqVar2.getItemId();
                                jqe jqeVar = fqVar2.c;
                                bq bqVar = fqVar2.a;
                                arrayList.add(itemId == i5 ? new fq(bqVar, Boolean.TRUE, jqeVar) : new fq(bqVar, Boolean.FALSE, jqeVar));
                            }
                            erVar = new er(krVarM0.t(erVar3.a), arrayList, krVarM0.s());
                        } else {
                            erVar = null;
                        }
                    } while (!q0eVar.c(value, erVar));
                }
            }
        });
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        float f = 12;
        float f2 = 16;
        constraintLayout.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        constraintLayout.setLayoutParams(layoutParams);
        jq jqVar = jq.a;
        od2.L(new zn5(od2.F(new ac((w7c) ((zaa) jqVar.getAccessor().c(zaa.class)).a, 1, this), ((w9a) ((kke) jqVar.getAccessor().d(kke.class).getValue())).a()), new uq(sm2Var, null), 5), getViewLifecycleScope());
        constraintLayout.addView(textView);
        constraintLayout.addView(textView2);
        constraintLayout.addView(thaVar);
        constraintLayout.addView(textView4);
        constraintLayout.addView(materialButtonToggleGroup);
        constraintLayout.addView(sm2Var);
        constraintLayout.addView(textView3);
        constraintLayout.addView(recyclerView);
        dj3 dj3VarQ = fp3.q(constraintLayout);
        int id = textView.getId();
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 6, 0, 6);
        new l2a(dj3VarQ, 6, id, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        int id2 = textView2.getId();
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.d(id2, 7, 0, 7);
        new l2a(dj3VarQ, 7, id2, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        int id3 = thaVar.getId();
        dj3VarQ.d(id3, 3, textView.getId(), 4);
        float f3 = 6;
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id3, 4));
        dj3VarQ.d(id3, 6, 0, 6);
        dj3VarQ.d(id3, 7, 0, 7);
        int id4 = textView4.getId();
        dj3VarQ.d(id4, 3, thaVar.getId(), 4);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id4, 4));
        dj3VarQ.d(id4, 6, 0, 6);
        new l2a(dj3VarQ, 6, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        int id5 = materialButtonToggleGroup.getId();
        dj3VarQ.d(id5, 3, textView4.getId(), 4);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id5, 4));
        dj3VarQ.d(id5, 6, 0, 6);
        dj3VarQ.d(id5, 7, 0, 7);
        int id6 = sm2Var.getId();
        dj3VarQ.d(id6, 3, materialButtonToggleGroup.getId(), 4);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id6, 4));
        dj3VarQ.d(id6, 6, 0, 6);
        dj3VarQ.d(id6, 7, 0, 7);
        int id7 = textView3.getId();
        dj3VarQ.d(id7, 3, sm2Var.getId(), 4);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id7, 4));
        dj3VarQ.d(id7, 6, 0, 6);
        dj3VarQ.d(id7, 7, 0, 7);
        int id8 = recyclerView.getId();
        dj3VarQ.d(id8, 3, textView3.getId(), 4);
        new l2a(dj3VarQ, 3, id8, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id8, 6, 0, 6);
        dj3VarQ.d(id8, 7, 0, 7);
        dj3VarQ.a(constraintLayout);
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams2);
        br7.e(linearLayout);
        linearLayout.setOrientation(1);
        linearLayout.addView(claVar);
        ScrollView scrollView = new ScrollView(linearLayout.getContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollView.addView(constraintLayout);
        linearLayout.addView(scrollView);
        v3c.y(new sq(textView4, this, textView, textView2, shapeDrawable, sm2Var, (Continuation) null), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        mqc mqcVar = new mqc(new ar(new t03(m0().A0, 11), null, this));
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(mqcVar, getViewLifecycleOwner().Q(), fg7Var), new wq(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().C0, getViewLifecycleOwner().Q(), fg7Var), new xq(2, null), 5), getViewLifecycleScope());
    }
}
