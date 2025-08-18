package one.me.stickerssettings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bc7;
import defpackage.bk;
import defpackage.bqc;
import defpackage.bvc;
import defpackage.cla;
import defpackage.f77;
import defpackage.fg7;
import defpackage.gja;
import defpackage.glc;
import defpackage.hja;
import defpackage.hob;
import defpackage.iba;
import defpackage.j47;
import defpackage.j6e;
import defpackage.je7;
import defpackage.jn3;
import defpackage.k6e;
import defpackage.kka;
import defpackage.m6e;
import defpackage.n6e;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nhd;
import defpackage.o;
import defpackage.o6e;
import defpackage.od2;
import defpackage.p6e;
import defpackage.pq9;
import defpackage.q1d;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.ry0;
import defpackage.s35;
import defpackage.t6e;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v3c;
import defpackage.v6e;
import defpackage.vx3;
import defpackage.vxd;
import defpackage.w6e;
import defpackage.w9a;
import defpackage.x27;
import defpackage.xid;
import defpackage.xt3;
import defpackage.z67;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickerssettings/StickersSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Lng3;", "<init>", "()V", "stickers-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class StickersSettingsScreen extends Widget implements xt3, ng3 {
    public static final /* synthetic */ bc7[] Y;
    public final j6e X;
    public final glc a;
    public final je7 b;
    public final q7c c;
    public f77 o;

    static {
        hob hobVar = new hob(StickersSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        Y = new bc7[]{hobVar};
    }

    public StickersSettingsScreen() {
        super(null, 0, 3, null);
        this.a = new glc(new xid(15), null, 6);
        this.b = createViewModelLazy(w6e.class, new nhd(10, new xid(16)));
        this.c = viewBinding(gja.f);
        this.X = new j6e(((iba) k6e.a.getAccessor().c(iba.class)).a(), new m6e(this, 2), new m6e(this, 3), new m6e(this, 4));
        od2.L(new zn5(m0().Y, new n6e(null, this), 5), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final x27 getA() {
        x27 x27Var = x27.c;
        return x27.d;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.a;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        w6e w6eVarM0 = m0();
        Long l = w6eVarM0.y0;
        if (l != null) {
            long jLongValue = l.longValue();
            w6eVarM0.y0 = null;
            if (i == gja.b) {
                vxd vxdVarS = j47.S(w6eVarM0.a, ((w9a) w6eVarM0.c).b(), vx3.b, new t6e(w6eVarM0, jLongValue, null));
                w6eVarM0.A0.o1(w6eVarM0, w6e.B0[2], vxdVarS);
            }
        }
    }

    public final w6e m0() {
        return (w6e) this.b.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla claVar = new cla(linearLayout.getContext(), 6);
        claVar.setId(gja.x);
        claVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        claVar.setTitle(hja.G);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new m6e(this, 0)));
        linearLayout.addView(claVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(gja.f);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.X);
        bqc bqcVar = new bqc(18, this);
        pq9 pq9Var = qp4.u0;
        recyclerView.j(new q1d(pq9Var.j(recyclerView), bqcVar, null, 12));
        recyclerView.j(new jn3(pq9Var.j(recyclerView)));
        recyclerView.j(new ry0(6));
        f77 f77Var = new f77(new z67(new bk(19, this), new m6e(this, 1)));
        this.o = f77Var;
        f77Var.i(recyclerView);
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, null, 15), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        ((RecyclerView) this.c.T0(this, Y[0])).setAdapter(null);
        f77 f77Var = this.o;
        if (f77Var != null) {
            f77Var.i(null);
        }
        this.o = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        s35 s35Var = m0().Z;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(s35Var, getViewLifecycleOwner().Q(), fg7Var), new o6e(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().s0, getViewLifecycleOwner().Q(), fg7Var), new p6e(null, this), 5), getViewLifecycleScope());
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        w6e w6eVarM0 = m0();
        Long l = w6eVarM0.x0;
        if (l != null) {
            long jLongValue = l.longValue();
            w6eVarM0.x0 = null;
            vxd vxdVarS = j47.S(w6eVarM0.a, ((w9a) w6eVarM0.c).a(), vx3.b, new v6e(w6eVarM0, jLongValue, i, null));
            w6eVarM0.z0.o1(w6eVarM0, w6e.B0[1], vxdVarS);
        }
    }
}
