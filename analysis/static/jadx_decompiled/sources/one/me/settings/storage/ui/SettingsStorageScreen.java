package one.me.settings.storage.ui;

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
import defpackage.cla;
import defpackage.fg7;
import defpackage.hbc;
import defpackage.hid;
import defpackage.hob;
import defpackage.iba;
import defpackage.iid;
import defpackage.je7;
import defpackage.kka;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nha;
import defpackage.nhd;
import defpackage.o;
import defpackage.od2;
import defpackage.oha;
import defpackage.oid;
import defpackage.q1d;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.rpc;
import defpackage.rxd;
import defpackage.ry0;
import defpackage.shb;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v3c;
import defpackage.vid;
import defpackage.x27;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/settings/storage/ui/SettingsStorageScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "<init>", "()V", "settings-storage_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SettingsStorageScreen extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] X;
    public final je7 a;
    public final q7c b;
    public final hid c;
    public final x27 o;

    static {
        hob hobVar = new hob(SettingsStorageScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        X = new bc7[]{hobVar};
    }

    public SettingsStorageScreen() {
        super(null, 0, 3, null);
        je7 je7VarCreateViewModelLazy = createViewModelLazy(vid.class, new nhd(1, new hbc(29)));
        this.a = je7VarCreateViewModelLazy;
        this.b = viewBinding(nha.D);
        hid hidVar = new hid(new rxd(27, this), ((iba) iid.a.getAccessor().c(iba.class)).a());
        this.c = hidVar;
        this.o = x27.d;
        od2.L(new zn5(((vid) je7VarCreateViewModelLazy.getValue()).s0, new shb(2, hidVar, hid.class, "submitList", "submitList(Ljava/util/List;)V", 4, 5), 5), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.o;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        ((vid) this.a.getValue()).t(i);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla claVar = new cla(linearLayout.getContext(), 6);
        claVar.setId(nha.I);
        claVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        claVar.setTitle(oha.z);
        claVar.setLeftActions(new kka(new rpc(6, this)));
        claVar.setForm(uka.a);
        linearLayout.addView(claVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(nha.D);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.c);
        recyclerView.setItemAnimator(null);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new bqc(10, this), null, 12));
        recyclerView.j(new ry0(7));
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, null, 14), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        ((RecyclerView) this.b.T0(this, X[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((vid) this.a.getValue()).v0, getViewLifecycleOwner().Q(), fg7.o), new oid(null, this), 5), getViewLifecycleScope());
    }
}
