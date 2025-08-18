package one.me.keyboardmedia.emoji;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ay7;
import defpackage.az4;
import defpackage.bc7;
import defpackage.bkg;
import defpackage.cc8;
import defpackage.d71;
import defpackage.dy7;
import defpackage.f;
import defpackage.fk4;
import defpackage.g02;
import defpackage.hob;
import defpackage.iba;
import defpackage.jca;
import defpackage.je7;
import defpackage.jv5;
import defpackage.jy2;
import defpackage.kc7;
import defpackage.kpa;
import defpackage.lc7;
import defpackage.ly4;
import defpackage.m57;
import defpackage.mc7;
import defpackage.nc7;
import defpackage.nec;
import defpackage.nj4;
import defpackage.oc7;
import defpackage.od2;
import defpackage.q7c;
import defpackage.ry0;
import defpackage.suc;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/keyboardmedia/emoji/KeyboardEmojiWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "keyboard-media_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class KeyboardEmojiWidget extends Widget {
    public static final /* synthetic */ bc7[] s0 = {new hob(KeyboardEmojiWidget.class, "contentRecyclerView", "getContentRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), zr6.e(nec.a, KeyboardEmojiWidget.class, "tabsRecyclerView", "getTabsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final jv5 X;
    public final ly4 Y;
    public final g02 Z;
    public final je7 a;
    public final je7 b;
    public final q7c c;
    public final q7c o;

    public KeyboardEmojiWidget(String str, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final RecyclerView m0() {
        return (RecyclerView) this.c.T0(this, s0[0]);
    }

    public final RecyclerView n0() {
        return (RecyclerView) this.o.T0(this, s0[1]);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(jca.b);
        int iG = tu0.G(44 * fk4.d().getDisplayMetrics().density);
        Continuation continuation = null;
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), null);
        recyclerView.setId(jca.d);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, iG));
        int iG2 = tu0.G(4 * fk4.d().getDisplayMetrics().density);
        int iG3 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        recyclerView.setPadding(iG3, iG2, iG3, iG2);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        int i = 3;
        v3c.y(new nc7(i, continuation, 0), recyclerView);
        frameLayout.addView(recyclerView);
        RecyclerView recyclerView2 = new RecyclerView(frameLayout.getContext(), null);
        recyclerView2.setId(jca.c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = iG;
        recyclerView2.setLayoutParams(layoutParams);
        v3c.y(new nc7(i, continuation, 1), recyclerView2);
        recyclerView2.setClipToPadding(false);
        recyclerView2.setClipChildren(false);
        recyclerView2.setItemAnimator(null);
        int iG4 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        recyclerView2.setPadding(iG4, recyclerView2.getPaddingTop(), iG4, tu0.G(48 * fk4.d().getDisplayMetrics().density));
        frameLayout.addView(recyclerView2);
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        m0().setAdapter(null);
        m0().s0(this.Z);
        n0().setAdapter(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        n0().setAdapter(this.Y);
        n0().j(new d71(tu0.G(2 * fk4.d().getDisplayMetrics().density), 3));
        RecyclerView recyclerViewM0 = m0();
        int iG = tu0.G(32 * fk4.d().getDisplayMetrics().density);
        int iG2 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        int iG3 = tu0.G(11 * fk4.d().getDisplayMetrics().density);
        int i = (recyclerViewM0.getContext().getResources().getDisplayMetrics().widthPixels - (iG2 * 2)) / (iG + iG3);
        if (i < 1) {
            i = 1;
        }
        mc7 mc7Var = new mc7(this, recyclerViewM0);
        recyclerViewM0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i);
        gridLayoutManager.K = mc7Var;
        recyclerViewM0.setLayoutManager(gridLayoutManager);
        recyclerViewM0.m(this.Z);
        recyclerViewM0.j(new ry0(i, iG3, 1));
        recyclerViewM0.setAdapter(this.X);
        od2.L(new zn5(((az4) this.a.getValue()).Z, new oc7(this, null), 5), getViewLifecycleScope());
    }

    public KeyboardEmojiWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        je7 je7VarCreateViewModelLazy = createViewModelLazy(az4.class, new nj4(14, new m57(7)));
        this.a = je7VarCreateViewModelLazy;
        Object objV = ay7.v(bundle, Widget.ARG_SCOPE_ID, suc.class);
        if (objV != null) {
            this.b = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV)).a, cc8.class, null);
            this.c = viewBinding(jca.c);
            this.o = viewBinding(jca.d);
            kc7 kc7Var = kc7.a;
            jv5 jv5Var = new jv5(((iba) kc7Var.getAccessor().c(iba.class)).a(), new bkg(15, this), 5);
            this.X = jv5Var;
            this.Y = new ly4(((iba) kc7Var.getAccessor().c(iba.class)).a(), new jy2(23, this));
            this.Z = new g02(jv5Var, new f(1, (az4) je7VarCreateViewModelLazy.getValue(), az4.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/sdk/lists/adapter/ListItem;)V", 0, 28));
            od2.L(new zn5(((az4) je7VarCreateViewModelLazy.getValue()).u0, new lc7(this, null), 5), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_key_scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
    }
}
