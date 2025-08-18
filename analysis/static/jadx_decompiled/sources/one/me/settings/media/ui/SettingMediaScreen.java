package one.me.settings.media.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bc7;
import defpackage.bqc;
import defpackage.bvc;
import defpackage.cdd;
import defpackage.cla;
import defpackage.fd7;
import defpackage.fg7;
import defpackage.fha;
import defpackage.gha;
import defpackage.glc;
import defpackage.hbc;
import defpackage.hob;
import defpackage.iba;
import defpackage.je7;
import defpackage.jp8;
import defpackage.kka;
import defpackage.lgd;
import defpackage.mgd;
import defpackage.ndd;
import defpackage.nec;
import defpackage.ng3;
import defpackage.o;
import defpackage.od2;
import defpackage.q1d;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.rpc;
import defpackage.ry0;
import defpackage.shb;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v3c;
import defpackage.x27;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/settings/media/ui/SettingMediaScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "<init>", "()V", "settings-media_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SettingMediaScreen extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] Y;
    public final lgd X;
    public final glc a;
    public final x27 b;
    public final je7 c;
    public final q7c o;

    static {
        hob hobVar = new hob(SettingMediaScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        Y = new bc7[]{hobVar};
    }

    public SettingMediaScreen() {
        super(null, 0, 3, null);
        this.a = new glc(new hbc(17), null, 6);
        this.b = x27.d;
        this.c = createViewModelLazy(ndd.class, new jp8(27, new hbc(18)));
        this.o = viewBinding(fha.B);
        lgd lgdVar = new lgd(new fd7(this), ((iba) mgd.a.getAccessor().c(iba.class)).a());
        this.X = lgdVar;
        od2.L(new zn5(m0().Y, new shb(2, lgdVar, lgd.class, "submitList", "submitList(Ljava/util/List;)V", 4, 3), 5), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getA() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.a;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        m0().s(i);
    }

    public final ndd m0() {
        return (ndd) this.c.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla claVar = new cla(linearLayout.getContext(), 6);
        claVar.setId(fha.E);
        claVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        claVar.setTitle(gha.u);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new rpc(3, this)));
        linearLayout.addView(claVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(fha.B);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.X);
        recyclerView.setItemAnimator(null);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new bqc(8, this), null, 12));
        recyclerView.j(new ry0(4));
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, null, 11), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        ((RecyclerView) this.o.T0(this, Y[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(m0().z0, getViewLifecycleOwner().Q(), fg7.o), new cdd(null, this), 5), getViewLifecycleScope());
    }
}
