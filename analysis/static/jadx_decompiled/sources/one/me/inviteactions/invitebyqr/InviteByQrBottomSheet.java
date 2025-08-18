package one.me.inviteactions.invitebyqr;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.c57;
import defpackage.c7a;
import defpackage.d67;
import defpackage.du4;
import defpackage.es3;
import defpackage.fk4;
import defpackage.gca;
import defpackage.h67;
import defpackage.hob;
import defpackage.i4f;
import defpackage.je7;
import defpackage.khe;
import defpackage.l67;
import defpackage.m57;
import defpackage.mqd;
import defpackage.nec;
import defpackage.nj4;
import defpackage.od2;
import defpackage.oi9;
import defpackage.pq9;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.w4d;
import defpackage.x77;
import defpackage.xh0;
import defpackage.xx5;
import defpackage.yoc;
import defpackage.z6a;
import defpackage.z7b;
import defpackage.zn5;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/inviteactions/invitebyqr/InviteByQrBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "invite-actions_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class InviteByQrBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] G0 = {new hob(InviteByQrBottomSheet.class, "name", "getName()Landroidx/appcompat/widget/AppCompatTextView;", 0), z7b.g(nec.a, InviteByQrBottomSheet.class, "shortName", "getShortName()Landroidx/appcompat/widget/AppCompatTextView;", 0), new hob(InviteByQrBottomSheet.class, "qrCode", "getQrCode()Landroidx/appcompat/widget/AppCompatImageView;", 0), new oi9(InviteByQrBottomSheet.class, "shareQrCodeJob", "getShareQrCodeJob()Lkotlinx/coroutines/Job;")};
    public final q7c A0;
    public final je7 B0;
    public final je7 C0;
    public final je7 D0;
    public final w4d E0;
    public final khe F0;
    public final q7c y0;
    public final q7c z0;

    public InviteByQrBottomSheet() {
        super(null, 1, null);
        this.y0 = viewBinding(gca.l);
        this.z0 = viewBinding(gca.o);
        this.A0 = viewBinding(gca.m);
        this.B0 = tu0.r(3, new es3(28, this));
        this.C0 = c57.a.getAccessor().d(l67.class);
        this.D0 = createViewModelLazy(h67.class, new nj4(11, new m57(1)));
        this.E0 = mqd.D();
        this.F0 = new khe(new m57(2));
    }

    public static final AppCompatTextView A0(InviteByQrBottomSheet inviteByQrBottomSheet) {
        inviteByQrBottomSheet.getClass();
        return (AppCompatTextView) inviteByQrBottomSheet.y0.T0(inviteByQrBottomSheet, G0[0]);
    }

    public static final AppCompatTextView B0(InviteByQrBottomSheet inviteByQrBottomSheet) {
        inviteByQrBottomSheet.getClass();
        return (AppCompatTextView) inviteByQrBottomSheet.z0.T0(inviteByQrBottomSheet, G0[1]);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        x77 x77Var = (x77) this.E0.T0(this, G0[3]);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        od2.L(new zn5(((h67) this.D0.getValue()).t0, new d67(this, null), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
        appCompatTextView.setId(gca.l);
        appCompatTextView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 18;
        layoutParams.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        float f2 = 20;
        layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        layoutParams.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        appCompatTextView.setLayoutParams(layoutParams);
        i4f.B.b(appCompatTextView, du4.b);
        pq9 pq9Var = qp4.u0;
        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().e);
        linearLayout.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), null);
        appCompatTextView2.setId(gca.o);
        appCompatTextView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        layoutParams2.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        layoutParams2.setMarginEnd(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        appCompatTextView2.setLayoutParams(layoutParams2);
        i4f.p.b(appCompatTextView2, du4.b);
        appCompatTextView2.setTextColor(pq9Var.j(appCompatTextView2).getText().g);
        linearLayout.addView(appCompatTextView2);
        View appCompatImageView = new AppCompatImageView(linearLayout.getContext(), null);
        appCompatImageView.setId(gca.m);
        float f3 = 244;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        layoutParams3.topMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setLayoutParams(layoutParams3);
        linearLayout.setGravity(17);
        linearLayout.addView(appCompatImageView);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(gca.n);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = tu0.G(24 * fk4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams4);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setText(yoc.e);
        tu0.K(oneMeButton, 300L, new xx5(6, this));
        linearLayout.addView(oneMeButton);
        v3c.y(new xh0(this, (Continuation) null, 15), linearLayout);
        return linearLayout;
    }
}
