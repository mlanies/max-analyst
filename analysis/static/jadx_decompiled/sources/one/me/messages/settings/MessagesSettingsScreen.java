package one.me.messages.settings;

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
import defpackage.bvc;
import defpackage.cla;
import defpackage.fg7;
import defpackage.gd1;
import defpackage.glc;
import defpackage.hj8;
import defpackage.hob;
import defpackage.iba;
import defpackage.j78;
import defpackage.je7;
import defpackage.jp8;
import defpackage.kka;
import defpackage.lq0;
import defpackage.mfd;
import defpackage.nec;
import defpackage.o;
import defpackage.od2;
import defpackage.p89;
import defpackage.q1d;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.ry0;
import defpackage.t89;
import defpackage.tu0;
import defpackage.u89;
import defpackage.uda;
import defpackage.uka;
import defpackage.v3c;
import defpackage.vda;
import defpackage.wz7;
import defpackage.x27;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/messages/settings/MessagesSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "message-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MessagesSettingsScreen extends Widget {
    public static final /* synthetic */ bc7[] Y;
    public final mfd X;
    public final glc a;
    public final x27 b;
    public final je7 c;
    public final q7c o;

    static {
        hob hobVar = new hob(MessagesSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        Y = new bc7[]{hobVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesSettingsScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new glc(new j78(12), null, 6);
        this.b = x27.d;
        je7 je7VarCreateViewModelLazy = createViewModelLazy(u89.class, new jp8(4, new j78(13)));
        this.c = je7VarCreateViewModelLazy;
        this.o = viewBinding(uda.a);
        mfd mfdVar = new mfd(new gd1(16, this), ((iba) p89.a.getAccessor().c(iba.class)).a());
        this.X = mfdVar;
        od2.L(new zn5(((u89) je7VarCreateViewModelLazy.getValue()).o, new lq0(2, mfdVar, mfd.class, "submitList", "submitList(Ljava/util/List;)V", 4, 23), 5), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getA() {
        return this.b;
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
        claVar.setId(uda.b);
        claVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        claVar.setTitle(vda.c);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new wz7(9, this)));
        linearLayout.addView(claVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(uda.a);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.X);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new hj8(20), null, 12));
        recyclerView.j(new ry0(2));
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, null, 6), linearLayout);
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
        od2.L(new zn5(tu0.g(((u89) this.c.getValue()).X, getViewLifecycleOwner().Q(), fg7.o), new t89(null, this), 5), getViewLifecycleScope());
    }
}
