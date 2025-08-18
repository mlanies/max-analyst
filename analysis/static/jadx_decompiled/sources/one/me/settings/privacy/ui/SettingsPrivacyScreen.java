package one.me.settings.privacy.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.aed;
import defpackage.aid;
import defpackage.bc7;
import defpackage.bid;
import defpackage.bqc;
import defpackage.bvc;
import defpackage.chd;
import defpackage.cid;
import defpackage.cla;
import defpackage.ehd;
import defpackage.fg7;
import defpackage.glc;
import defpackage.hob;
import defpackage.iba;
import defpackage.iha;
import defpackage.j25;
import defpackage.je7;
import defpackage.jhd;
import defpackage.jp;
import defpackage.k4a;
import defpackage.kc2;
import defpackage.kha;
import defpackage.khd;
import defpackage.kka;
import defpackage.lhd;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nhd;
import defpackage.nz4;
import defpackage.o;
import defpackage.od2;
import defpackage.ohd;
import defpackage.p7b;
import defpackage.pnf;
import defpackage.q1d;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.qqd;
import defpackage.rpc;
import defpackage.ry0;
import defpackage.shb;
import defpackage.thd;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v3c;
import defpackage.v7c;
import defpackage.vhd;
import defpackage.w4d;
import defpackage.w9a;
import defpackage.w9e;
import defpackage.wuc;
import defpackage.x27;
import defpackage.xie;
import defpackage.yhd;
import defpackage.zhd;
import defpackage.zn5;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/settings/privacy/ui/SettingsPrivacyScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Lj25;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SettingsPrivacyScreen extends Widget implements ng3, j25 {
    public static final /* synthetic */ bc7[] Z;
    public static final String s0;
    public final q7c X;
    public final chd Y;
    public final glc a;
    public final x27 b;
    public final je7 c;
    public final String o;

    static {
        hob hobVar = new hob(SettingsPrivacyScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        Z = new bc7[]{hobVar};
        s0 = "settings-privacy";
    }

    public SettingsPrivacyScreen() {
        super(null, 0, 3, null);
        this.a = new glc(wuc.SETTINGS_PRIVACY);
        this.b = x27.d;
        this.c = createViewModelLazy(cid.class, new nhd(0, new jhd(this, 0)));
        this.o = s0;
        this.X = viewBinding(iha.t);
        chd chdVar = new chd(new qqd(23, this), ((iba) ehd.a.getAccessor().c(iba.class)).a());
        this.Y = chdVar;
        od2.L(new zn5(m0().A0, new shb(2, chdVar, chd.class, "submitList", "submitList(Ljava/util/List;)V", 4, 4), 5), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getO() {
        return this.o;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.a;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        cid cidVarM0 = m0();
        cidVarM0.getClass();
        int i2 = iha.l;
        w4d w4dVar = cidVarM0.B0;
        if (i == i2) {
            w4dVar.o1(cidVarM0, cid.O0[0], pnf.n(cidVarM0, null, null, new vhd(cidVarM0, true, null), 3));
            return;
        }
        if (i == iha.m) {
            if (((jp) cidVarM0.s()).g.getBoolean("app.privacy.online.show", true)) {
                cidVarM0.w(aed.g);
                return;
            }
            return;
        }
        if (i != iha.o) {
            if (i == iha.n) {
                w4dVar.o1(cidVarM0, cid.O0[0], pnf.n(cidVarM0, null, null, new vhd(cidVarM0, false, null), 3));
                return;
            }
            int i3 = iha.h;
            w4d w4dVar2 = cidVarM0.C0;
            if (i == i3) {
                w4dVar2.o1(cidVarM0, cid.O0[1], pnf.n(cidVarM0, null, null, new aid(cidVarM0, 1, null), 3));
                return;
            }
            if (i == iha.i) {
                w4dVar2.o1(cidVarM0, cid.O0[1], pnf.n(cidVarM0, null, null, new aid(cidVarM0, 3, null), 3));
                return;
            }
            int i4 = iha.f;
            w4d w4dVar3 = cidVarM0.D0;
            if (i == i4) {
                w4dVar3.o1(cidVarM0, cid.O0[2], pnf.n(cidVarM0, null, null, new zhd(cidVarM0, 1, null), 3));
                return;
            }
            if (i == iha.g) {
                w4dVar3.o1(cidVarM0, cid.O0[2], pnf.n(cidVarM0, null, null, new zhd(cidVarM0, 3, null), 3));
                return;
            }
            int i5 = iha.r;
            w4d w4dVar4 = cidVarM0.E0;
            if (i == i5) {
                w4dVar4.o1(cidVarM0, cid.O0[3], pnf.n(cidVarM0, null, null, new bid(cidVarM0, 1, null), 3));
                return;
            }
            if (i == iha.s) {
                w4dVar4.o1(cidVarM0, cid.O0[3], pnf.n(cidVarM0, null, null, new bid(cidVarM0, 3, null), 3));
                return;
            }
            if (i == iha.k) {
                if (cidVarM0.H0 == null) {
                    String strD = ((xie) cidVarM0.Z.getValue()).d();
                    List listSingletonList = (strD == null || w9e.C0(strD)) ? nz4.a : Collections.singletonList(strD);
                    k4a k4aVar = (k4a) cidVarM0.r();
                    cidVarM0.H0 = Long.valueOf(k4a.v(k4aVar, new kc2(1, ((p7b) k4aVar.y()).a.o(), listSingletonList)));
                    return;
                }
                return;
            }
            if (i != iha.j) {
                int i6 = iha.q;
                w4d w4dVar5 = cidVarM0.F0;
                if (i == i6) {
                    w4dVar5.o1(cidVarM0, cid.O0[4], pnf.n(cidVarM0, null, null, new yhd(cidVarM0, true, null), 3));
                } else if (i == iha.p) {
                    w4dVar5.o1(cidVarM0, cid.O0[4], pnf.n(cidVarM0, null, null, new yhd(cidVarM0, false, null), 3));
                }
            }
        }
    }

    public final cid m0() {
        return (cid) this.c.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla claVar = new cla(linearLayout.getContext(), 6);
        claVar.setId(iha.w);
        claVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        claVar.setTitle(kha.I);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new rpc(5, this)));
        linearLayout.addView(claVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(iha.t);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.Y);
        recyclerView.setItemAnimator(null);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new bqc(9, this), null, 12));
        recyclerView.j(new ry0(5));
        recyclerView.j(new ohd(recyclerView.getContext()));
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, null, 13), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        ((RecyclerView) this.X.T0(this, Z[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        cid cidVarM0 = m0();
        pnf.n(cidVarM0, ((w9a) cidVarM0.o).a(), null, new thd(cidVarM0, null), 2);
        v7c v7cVar = m0().M0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(v7cVar, getViewLifecycleOwner().Q(), fg7Var), new khd(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().N0, getViewLifecycleOwner().Q(), fg7Var), new lhd(null, this), 5), getViewLifecycleScope());
    }
}
