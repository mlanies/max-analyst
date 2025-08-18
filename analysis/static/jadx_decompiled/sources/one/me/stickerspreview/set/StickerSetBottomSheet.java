package one.me.stickerspreview.set;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a3g;
import defpackage.ay7;
import defpackage.bc7;
import defpackage.bja;
import defpackage.cla;
import defpackage.dy7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.gw7;
import defpackage.h76;
import defpackage.hob;
import defpackage.i3e;
import defpackage.iba;
import defpackage.je7;
import defpackage.kpa;
import defpackage.nec;
import defpackage.o3e;
import defpackage.od2;
import defpackage.oec;
import defpackage.p3e;
import defpackage.p4e;
import defpackage.pla;
import defpackage.q7c;
import defpackage.qm0;
import defpackage.qqd;
import defpackage.rh4;
import defpackage.ry0;
import defpackage.rzd;
import defpackage.shb;
import defpackage.suc;
import defpackage.t9;
import defpackage.tu0;
import defpackage.v5e;
import defpackage.x27;
import defpackage.yc7;
import defpackage.yp4;
import defpackage.z5b;
import defpackage.z7;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.stickerspreview.StickerPreviewScreen;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/stickerspreview/set/StickerSetBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "p3e", "stickers-preview_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class StickerSetBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ bc7[] A0;
    public final je7 s0;
    public final fs t0;
    public gw7 u0;
    public final q7c v0;
    public final q7c w0;
    public final a3g x0;
    public final int y0;
    public final qm0 z0;

    static {
        hob hobVar = new hob(StickerSetBottomSheet.class, "stickerId", "getStickerId()J", 0);
        oec oecVar = nec.a;
        A0 = new bc7[]{hobVar, zr6.e(oecVar, StickerSetBottomSheet.class, "headerView", "getHeaderView()Lone/me/sdk/stickers/set/StickersSetHeaderView;", 0), zr6.f(StickerSetBottomSheet.class, "stickerSetRecycler", "getStickerSetRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, oecVar), zr6.f(StickerSetBottomSheet.class, "loadingView", "getLoadingView()Landroid/view/View;", 0, oecVar)};
    }

    public StickerSetBottomSheet(String str, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public static final int x0(StickerSetBottomSheet stickerSetBottomSheet) {
        Object parentController = stickerSetBottomSheet.getParentController();
        p3e p3eVar = parentController instanceof p3e ? (p3e) parentController : null;
        if (p3eVar == null) {
            return 0;
        }
        StickerPreviewScreen stickerPreviewScreen = (StickerPreviewScreen) p3eVar;
        bc7[] bc7VarArr = StickerPreviewScreen.A0;
        return ((ViewGroup) stickerPreviewScreen.t0.T0(stickerPreviewScreen, bc7VarArr[4])).getMeasuredHeight() + ((cla) stickerPreviewScreen.s0.T0(stickerPreviewScreen, bc7VarArr[3])).getBottom();
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final boolean handleBack() {
        return false;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final z5b n0() {
        return new t9(this, 5);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* renamed from: o0 */
    public final x27 getA0() {
        x27 x27Var = x27.c;
        return x27.c;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onAttach(View view) {
        i3e i3eVar = (i3e) this.s0.getValue();
        bc7 bc7Var = A0[0];
        i3eVar.q(Long.valueOf(((Number) this.t0.a(this)).longValue()));
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        tu0.K(view, 300L, new o3e(this, 0));
        od2.L(new zn5(((i3e) this.s0.getValue()).C0, new shb(2, this, StickerSetBottomSheet.class, "handleStickerSet", "handleStickerSet(Lone/me/sdk/stickers/model/StickerSetModel;)V", 4, 11), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void t0() {
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        float f = 10;
        float f2 = 12;
        frameLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        v5e v5eVar = new v5e(linearLayout.getContext());
        v5eVar.setId(bja.j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        float f3 = 4;
        layoutParams.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        v5eVar.setLayoutParams(layoutParams);
        tu0.K(v5eVar.getHeaderButton(), 300L, new o3e(this, 1));
        linearLayout.addView(v5eVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(bja.i);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int iA = z7.A(recyclerView.getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(iA));
        recyclerView.j(new ry0(iA, tu0.G(f3 * fk4.d().getDisplayMetrics().density), 8));
        recyclerView.k(new yc7(2, this));
        recyclerView.setAdapter(this.x0);
        pla.a(recyclerView, new h76(recyclerView, recyclerView, this, 23));
        linearLayout.addView(recyclerView);
        bc7 bc7Var = A0[3];
        linearLayout.addView((View) this.z0.getValue());
        frameLayout.addView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        View yp4Var = new yp4(frameLayout.getContext());
        yp4Var.setTranslationY(rh4.c(6, fk4.d().getDisplayMetrics().density, -r10));
        frameLayout.addView(yp4Var);
    }

    public StickerSetBottomSheet(Bundle bundle) {
        super(bundle);
        Object objV = ay7.v(bundle, Widget.ARG_SCOPE_ID, suc.class);
        if (objV != null) {
            this.s0 = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV)).a, i3e.class, null);
            this.t0 = new fs(Long.class, 0L, "arg_key_sticker_id");
            this.v0 = viewBinding(bja.j);
            this.w0 = viewBinding(bja.i);
            this.x0 = new a3g(((iba) p4e.a.getAccessor().c(iba.class)).a(), new qqd(25, this));
            this.y0 = tu0.G(183 * fk4.d().getDisplayMetrics().density);
            this.z0 = binding(new rzd(3, this));
            v0(false);
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_key_scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
    }
}
