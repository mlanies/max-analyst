package one.me.chats.picker.chats;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.ai0;
import defpackage.bc7;
import defpackage.dy7;
import defpackage.e2f;
import defpackage.fs;
import defpackage.hob;
import defpackage.je7;
import defpackage.jp8;
import defpackage.k56;
import defpackage.kpa;
import defpackage.kw5;
import defpackage.m56;
import defpackage.m58;
import defpackage.mya;
import defpackage.nec;
import defpackage.oa2;
import defpackage.od2;
import defpackage.oya;
import defpackage.p12;
import defpackage.p8a;
import defpackage.qm0;
import defpackage.qya;
import defpackage.rh4;
import defpackage.rxa;
import defpackage.s04;
import defpackage.s4a;
import defpackage.suc;
import defpackage.ti3;
import defpackage.txa;
import defpackage.wa5;
import defpackage.wja;
import defpackage.ww9;
import defpackage.x27;
import defpackage.x30;
import defpackage.yt8;
import defpackage.z84;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B=\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/chats/picker/chats/PickerChatsTabWidget;", "Lone/me/sdk/arch/Widget;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "", "isInMultiSelect", "Lkotlin/Function1;", "Le5f;", "onMultiSelectToggled", "Loa2;", "filter", "(Ljava/lang/String;ZLm56;Loa2;Lz84;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class PickerChatsTabWidget extends Widget {
    public static final /* synthetic */ bc7[] y0 = {new hob(PickerChatsTabWidget.class, "sharedScopeId", "getSharedScopeId-IluPPks()Ljava/lang/String;", 0), rh4.g(nec.a, PickerChatsTabWidget.class, "isInMultiSelect", "isInMultiSelect()Z"), new hob(PickerChatsTabWidget.class, "itemsFilter", "getItemsFilter()Lone/me/chats/list/loader/ChatFilterEnum;", 0), new hob(PickerChatsTabWidget.class, "foldersTabs", "getFoldersTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), new hob(PickerChatsTabWidget.class, "foldersViewPager", "getFoldersViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public final m56 X;
    public final qm0 Y;
    public final qm0 Z;
    public final fs a;
    public final fs b;
    public final fs c;
    public final x27 o;
    public final je7 s0;
    public s04 t0;
    public final x30 u0;
    public final int v0;
    public final kw5 w0;
    public final e2f x0;

    public PickerChatsTabWidget(String str, boolean z, m56 m56Var, oa2 oa2Var, z84 z84Var) {
        this(dy7.g(new kpa("scope.id", new suc(str)), new kpa("is_in_multiselect", Boolean.valueOf(z)), new kpa("picker.filter", oa2Var)));
        this.X = m56Var;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getO() {
        return this.o;
    }

    public final wja m0() {
        bc7 bc7Var = y0[3];
        return (wja) this.Y.getValue();
    }

    public final ViewPager2 n0() {
        bc7 bc7Var = y0[4];
        return (ViewPager2) this.Z.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        wja wjaVarM0 = m0();
        ti3 ti3Var = new ti3(0, -2);
        ti3Var.i = 0;
        ti3Var.e = 0;
        ti3Var.h = 0;
        constraintLayout.addView(wjaVarM0, ti3Var);
        ViewPager2 viewPager2N0 = n0();
        ti3 ti3Var2 = new ti3(0, 0);
        ti3Var2.j = p8a.e;
        ti3Var2.l = 0;
        ti3Var2.e = 0;
        ti3Var2.h = 0;
        constraintLayout.addView(viewPager2N0, ti3Var2);
        return constraintLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        s04 s04Var = this.t0;
        if (s04Var != null) {
            s04Var.c();
        }
        this.t0 = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ViewPager2 viewPager2N0 = n0();
        kw5 kw5Var = this.w0;
        viewPager2N0.setAdapter(kw5Var);
        n0().setOffscreenPageLimit(this.v0);
        s04 s04VarB = this.u0.b(m0(), n0(), new ww9(16), new ai0(21));
        s04VarB.a();
        this.t0 = s04VarB;
        View childAt = n0().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        if (kw5Var.z0.size() > 0) {
            n0().e(0, false);
            n0().measure(View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
        }
        od2.L(new zn5(od2.x(new m58(((txa) this.s0.getValue()).u0, 23)), new qya(this, null), 5), getViewLifecycleScope());
    }

    public PickerChatsTabWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        fs fsVar = new fs(suc.class, "scope.id");
        this.a = fsVar;
        this.b = new fs(Boolean.class, Boolean.TRUE, "is_in_multiselect");
        this.c = new fs(oa2.class, "picker.filter");
        this.o = x27.c;
        final int i = 0;
        this.Y = binding(new k56(this) { // from class: nya
            public final /* synthetic */ PickerChatsTabWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                PickerChatsTabWidget pickerChatsTabWidget = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = PickerChatsTabWidget.y0;
                        wja wjaVar = new wja(pickerChatsTabWidget.getContext(), null);
                        wjaVar.setId(p8a.e);
                        wjaVar.setTabMode(0);
                        return wjaVar;
                    default:
                        bc7[] bc7VarArr2 = PickerChatsTabWidget.y0;
                        ViewPager2 viewPager2 = new ViewPager2(pickerChatsTabWidget.getContext());
                        viewPager2.setId(p8a.d);
                        fm9.z(viewPager2);
                        return viewPager2;
                }
            }
        });
        final int i2 = 1;
        this.Z = binding(new k56(this) { // from class: nya
            public final /* synthetic */ PickerChatsTabWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                PickerChatsTabWidget pickerChatsTabWidget = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = PickerChatsTabWidget.y0;
                        wja wjaVar = new wja(pickerChatsTabWidget.getContext(), null);
                        wjaVar.setId(p8a.e);
                        wjaVar.setTabMode(0);
                        return wjaVar;
                    default:
                        bc7[] bc7VarArr2 = PickerChatsTabWidget.y0;
                        ViewPager2 viewPager2 = new ViewPager2(pickerChatsTabWidget.getContext());
                        viewPager2.setId(p8a.d);
                        fm9.z(viewPager2);
                        return viewPager2;
                }
            }
        });
        bc7 bc7Var = y0[0];
        this.s0 = m41getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, txa.class, null);
        je7 je7VarCreateViewModelLazy = createViewModelLazy(mya.class, new jp8(10, new s4a(19)));
        this.u0 = new x30(null, 6);
        this.v0 = 3;
        b bVar = new b();
        bVar.setMaxRecycledViews(rxa.a, 30);
        this.w0 = new kw5(this, bVar, new yt8(18, this));
        e2f e2fVar = new e2f();
        e2fVar.R(new p12());
        e2fVar.R(new wa5());
        e2fVar.U(0);
        e2fVar.I(150L);
        this.x0 = e2fVar;
        od2.L(new zn5(((mya) je7VarCreateViewModelLazy.getValue()).b, new oya(this, null), 5), getLifecycleScope());
    }

    public /* synthetic */ PickerChatsTabWidget(String str, boolean z, m56 m56Var, oa2 oa2Var, int i, z84 z84Var) {
        this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : m56Var, (i & 8) != 0 ? oa2.a : oa2Var, null);
    }
}
