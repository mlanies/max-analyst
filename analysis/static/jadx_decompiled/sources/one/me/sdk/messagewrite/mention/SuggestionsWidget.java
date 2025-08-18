package one.me.sdk.messagewrite.mention;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.ade;
import defpackage.au1;
import defpackage.bc7;
import defpackage.dj3;
import defpackage.dy7;
import defpackage.fk4;
import defpackage.fp3;
import defpackage.fs;
import defpackage.hob;
import defpackage.je7;
import defpackage.k56;
import defpackage.kpa;
import defpackage.l2a;
import defpackage.lga;
import defpackage.nec;
import defpackage.oce;
import defpackage.od2;
import defpackage.oi9;
import defpackage.pce;
import defpackage.q0e;
import defpackage.q7c;
import defpackage.qm0;
import defpackage.r1b;
import defpackage.suc;
import defpackage.t9;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.x27;
import defpackage.yce;
import defpackage.yq0;
import defpackage.z15;
import defpackage.z5b;
import defpackage.z7b;
import defpackage.z84;
import defpackage.zn5;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/sdk/messagewrite/mention/SuggestionsWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Loce;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SuggestionsWidget extends BaseBottomSheetWidget implements oce {
    public static final /* synthetic */ bc7[] B0 = {new oi9(SuggestionsWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), z7b.g(nec.a, SuggestionsWidget.class, "suggestionsContainer", "getSuggestionsContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), new hob(SuggestionsWidget.class, "dragView", "getDragView()Landroid/widget/FrameLayout;", 0), new hob(SuggestionsWidget.class, "suggestionsRecyclerView", "getSuggestionsRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0), new hob(SuggestionsWidget.class, "closeView", "getCloseView()Landroidx/appcompat/widget/AppCompatImageView;", 0), new hob(SuggestionsWidget.class, "titleView", "getTitleView()Landroidx/appcompat/widget/AppCompatTextView;", 0), new hob(SuggestionsWidget.class, "closePanelView", "getClosePanelView()Landroid/widget/FrameLayout;", 0), new hob(SuggestionsWidget.class, "notFoundView", "getNotFoundView()Landroidx/appcompat/widget/AppCompatTextView;", 0)};
    public final qm0 A0;
    public final je7 s0;
    public final q7c t0;
    public final je7 u0;
    public final qm0 v0;
    public final qm0 w0;
    public final qm0 x0;
    public final qm0 y0;
    public final qm0 z0;

    public SuggestionsWidget(String str, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final z15 A0() {
        bc7 bc7Var = B0[3];
        return (z15) this.w0.getValue();
    }

    public final yce B0() {
        return (yce) this.s0.getValue();
    }

    public final void C0() {
        q0e q0eVar;
        Object value;
        yce yceVarB0 = B0();
        do {
            q0eVar = yceVarB0.I0;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, null));
        s0(true);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final boolean handleBack() {
        C0();
        return true;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final z5b n0() {
        return new t9(this, 6);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* renamed from: o0 */
    public final x27 getA0() {
        return new x27(0, new yq0(1, 3, false), 1);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        A0().setAdapter(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        A0().setAdapter((pce) this.u0.getValue());
        od2.L(new zn5(B0().D0, new ade(this, null), 5), getViewLifecycleScope());
        v3c.y(new r1b(this, (Continuation) null, 17), view);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(y0());
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(lga.E);
        constraintLayout.addView(x0(), -1, -2);
        constraintLayout.addView(A0());
        constraintLayout.addView(z0());
        dj3 dj3VarQ = fp3.q(constraintLayout);
        int id = y0().getId();
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 7, 0, 7);
        int id2 = x0().getId();
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.d(id2, 7, 0, 7);
        float f = 8;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id2, 4));
        dj3VarQ.d(id2, 6, 0, 6);
        new l2a(dj3VarQ, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        int id3 = z0().getId();
        dj3VarQ.d(id3, 3, x0().getId(), 4);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id3, 4));
        dj3VarQ.d(id3, 6, 0, 6);
        int id4 = A0().getId();
        dj3VarQ.d(id4, 3, x0().getId(), 4);
        au1.p(20, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id4, 4));
        dj3VarQ.d(id4, 7, 0, 7);
        dj3VarQ.d(id4, 6, 0, 6);
        dj3VarQ.d(id4, 4, 0, 4);
        dj3VarQ.g(id4).d.m0 = true;
        dj3VarQ.g(id4).d.x = 0.0f;
        dj3VarQ.a(constraintLayout);
        frameLayout.addView(constraintLayout, -1, -1);
    }

    public final FrameLayout x0() {
        bc7 bc7Var = B0[6];
        return (FrameLayout) this.z0.getValue();
    }

    public final FrameLayout y0() {
        bc7 bc7Var = B0[2];
        return (FrameLayout) this.v0.getValue();
    }

    public final AppCompatTextView z0() {
        bc7 bc7Var = B0[7];
        return (AppCompatTextView) this.A0.getValue();
    }

    public SuggestionsWidget(Bundle bundle) {
        super(bundle);
        fs fsVar = new fs(suc.class, Widget.ARG_SCOPE_ID);
        bc7 bc7Var = B0[0];
        this.s0 = m41getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, yce.class, null);
        this.t0 = viewBinding(lga.E);
        final int i = 0;
        this.u0 = tu0.r(3, new k56(this) { // from class: zce
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                pq9 pq9Var = qp4.u0;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = SuggestionsWidget.B0;
                        return new pce(suggestionsWidget, ((iba) f9g.a.getAccessor().d(iba.class).getValue()).c());
                    case 1:
                        bc7[] bc7VarArr2 = SuggestionsWidget.B0;
                        View frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(lga.D);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(36 * fk4.d().getDisplayMetrics().density), tu0.G(5 * fk4.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 40.0f));
                        frameLayout.setBackgroundColor(pq9Var.j(frameLayout).getIcon().h);
                        return frameLayout;
                    case 2:
                        bc7[] bc7VarArr3 = SuggestionsWidget.B0;
                        z15 z15Var = new z15(suggestionsWidget.getContext(), null);
                        z15Var.setId(lga.F);
                        z15Var.setClipToPadding(false);
                        z15Var.setLayoutParams(new ti3(-1, -2));
                        z15Var.getContext();
                        z15Var.setLayoutManager(new LinearLayoutManager());
                        z15Var.setPager(new j81(suggestionsWidget, 10));
                        z15Var.setThreshold(3);
                        return z15Var;
                    case 3:
                        bc7[] bc7VarArr4 = SuggestionsWidget.B0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), null);
                        appCompatImageView.setId(lga.z);
                        float f = 44;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        appCompatImageView.setLayoutParams(layoutParams2);
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        appCompatImageView.setImageResource(yfa.c);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).getIcon().f));
                        tu0.K(appCompatImageView, 300L, new elb(9, suggestionsWidget));
                        int i2 = pq9Var.j(appCompatImageView).d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), null, shapeDrawable));
                        return appCompatImageView;
                    case 4:
                        bc7[] bc7VarArr5 = SuggestionsWidget.B0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView.setId(lga.G);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, tu0.G(44 * fk4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        i4f.B.b(appCompatTextView, du4.b);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().e);
                        appCompatTextView.setText(mga.s);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        bc7[] bc7VarArr6 = SuggestionsWidget.B0;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(lga.A);
                        bc7[] bc7VarArr7 = SuggestionsWidget.B0;
                        bc7 bc7Var2 = bc7VarArr7[4];
                        frameLayout2.addView((AppCompatImageView) suggestionsWidget.x0.getValue());
                        bc7 bc7Var3 = bc7VarArr7[5];
                        frameLayout2.addView((AppCompatTextView) suggestionsWidget.y0.getValue());
                        frameLayout2.setVisibility(8);
                        br7.e(frameLayout2);
                        return frameLayout2;
                    default:
                        bc7[] bc7VarArr8 = SuggestionsWidget.B0;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView2.setId(lga.C);
                        appCompatTextView2.setLayoutParams(new ti3(-2, -2));
                        i4f.n.b(appCompatTextView2, du4.b);
                        appCompatTextView2.setTextColor(pq9Var.j(appCompatTextView2).getText().h);
                        appCompatTextView2.setText(mga.r);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        float f2 = 16;
                        appCompatTextView2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0);
                        br7.e(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i2 = 1;
        this.v0 = binding(new k56(this) { // from class: zce
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                pq9 pq9Var = qp4.u0;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = SuggestionsWidget.B0;
                        return new pce(suggestionsWidget, ((iba) f9g.a.getAccessor().d(iba.class).getValue()).c());
                    case 1:
                        bc7[] bc7VarArr2 = SuggestionsWidget.B0;
                        View frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(lga.D);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(36 * fk4.d().getDisplayMetrics().density), tu0.G(5 * fk4.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 40.0f));
                        frameLayout.setBackgroundColor(pq9Var.j(frameLayout).getIcon().h);
                        return frameLayout;
                    case 2:
                        bc7[] bc7VarArr3 = SuggestionsWidget.B0;
                        z15 z15Var = new z15(suggestionsWidget.getContext(), null);
                        z15Var.setId(lga.F);
                        z15Var.setClipToPadding(false);
                        z15Var.setLayoutParams(new ti3(-1, -2));
                        z15Var.getContext();
                        z15Var.setLayoutManager(new LinearLayoutManager());
                        z15Var.setPager(new j81(suggestionsWidget, 10));
                        z15Var.setThreshold(3);
                        return z15Var;
                    case 3:
                        bc7[] bc7VarArr4 = SuggestionsWidget.B0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), null);
                        appCompatImageView.setId(lga.z);
                        float f = 44;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        appCompatImageView.setLayoutParams(layoutParams2);
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        appCompatImageView.setImageResource(yfa.c);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).getIcon().f));
                        tu0.K(appCompatImageView, 300L, new elb(9, suggestionsWidget));
                        int i22 = pq9Var.j(appCompatImageView).d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        return appCompatImageView;
                    case 4:
                        bc7[] bc7VarArr5 = SuggestionsWidget.B0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView.setId(lga.G);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, tu0.G(44 * fk4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        i4f.B.b(appCompatTextView, du4.b);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().e);
                        appCompatTextView.setText(mga.s);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        bc7[] bc7VarArr6 = SuggestionsWidget.B0;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(lga.A);
                        bc7[] bc7VarArr7 = SuggestionsWidget.B0;
                        bc7 bc7Var2 = bc7VarArr7[4];
                        frameLayout2.addView((AppCompatImageView) suggestionsWidget.x0.getValue());
                        bc7 bc7Var3 = bc7VarArr7[5];
                        frameLayout2.addView((AppCompatTextView) suggestionsWidget.y0.getValue());
                        frameLayout2.setVisibility(8);
                        br7.e(frameLayout2);
                        return frameLayout2;
                    default:
                        bc7[] bc7VarArr8 = SuggestionsWidget.B0;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView2.setId(lga.C);
                        appCompatTextView2.setLayoutParams(new ti3(-2, -2));
                        i4f.n.b(appCompatTextView2, du4.b);
                        appCompatTextView2.setTextColor(pq9Var.j(appCompatTextView2).getText().h);
                        appCompatTextView2.setText(mga.r);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        float f2 = 16;
                        appCompatTextView2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0);
                        br7.e(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i3 = 2;
        this.w0 = binding(new k56(this) { // from class: zce
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                pq9 pq9Var = qp4.u0;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = SuggestionsWidget.B0;
                        return new pce(suggestionsWidget, ((iba) f9g.a.getAccessor().d(iba.class).getValue()).c());
                    case 1:
                        bc7[] bc7VarArr2 = SuggestionsWidget.B0;
                        View frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(lga.D);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(36 * fk4.d().getDisplayMetrics().density), tu0.G(5 * fk4.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 40.0f));
                        frameLayout.setBackgroundColor(pq9Var.j(frameLayout).getIcon().h);
                        return frameLayout;
                    case 2:
                        bc7[] bc7VarArr3 = SuggestionsWidget.B0;
                        z15 z15Var = new z15(suggestionsWidget.getContext(), null);
                        z15Var.setId(lga.F);
                        z15Var.setClipToPadding(false);
                        z15Var.setLayoutParams(new ti3(-1, -2));
                        z15Var.getContext();
                        z15Var.setLayoutManager(new LinearLayoutManager());
                        z15Var.setPager(new j81(suggestionsWidget, 10));
                        z15Var.setThreshold(3);
                        return z15Var;
                    case 3:
                        bc7[] bc7VarArr4 = SuggestionsWidget.B0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), null);
                        appCompatImageView.setId(lga.z);
                        float f = 44;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        appCompatImageView.setLayoutParams(layoutParams2);
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        appCompatImageView.setImageResource(yfa.c);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).getIcon().f));
                        tu0.K(appCompatImageView, 300L, new elb(9, suggestionsWidget));
                        int i22 = pq9Var.j(appCompatImageView).d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        return appCompatImageView;
                    case 4:
                        bc7[] bc7VarArr5 = SuggestionsWidget.B0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView.setId(lga.G);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, tu0.G(44 * fk4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        i4f.B.b(appCompatTextView, du4.b);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().e);
                        appCompatTextView.setText(mga.s);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        bc7[] bc7VarArr6 = SuggestionsWidget.B0;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(lga.A);
                        bc7[] bc7VarArr7 = SuggestionsWidget.B0;
                        bc7 bc7Var2 = bc7VarArr7[4];
                        frameLayout2.addView((AppCompatImageView) suggestionsWidget.x0.getValue());
                        bc7 bc7Var3 = bc7VarArr7[5];
                        frameLayout2.addView((AppCompatTextView) suggestionsWidget.y0.getValue());
                        frameLayout2.setVisibility(8);
                        br7.e(frameLayout2);
                        return frameLayout2;
                    default:
                        bc7[] bc7VarArr8 = SuggestionsWidget.B0;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView2.setId(lga.C);
                        appCompatTextView2.setLayoutParams(new ti3(-2, -2));
                        i4f.n.b(appCompatTextView2, du4.b);
                        appCompatTextView2.setTextColor(pq9Var.j(appCompatTextView2).getText().h);
                        appCompatTextView2.setText(mga.r);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        float f2 = 16;
                        appCompatTextView2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0);
                        br7.e(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i4 = 3;
        this.x0 = binding(new k56(this) { // from class: zce
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                pq9 pq9Var = qp4.u0;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i4) {
                    case 0:
                        bc7[] bc7VarArr = SuggestionsWidget.B0;
                        return new pce(suggestionsWidget, ((iba) f9g.a.getAccessor().d(iba.class).getValue()).c());
                    case 1:
                        bc7[] bc7VarArr2 = SuggestionsWidget.B0;
                        View frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(lga.D);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(36 * fk4.d().getDisplayMetrics().density), tu0.G(5 * fk4.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 40.0f));
                        frameLayout.setBackgroundColor(pq9Var.j(frameLayout).getIcon().h);
                        return frameLayout;
                    case 2:
                        bc7[] bc7VarArr3 = SuggestionsWidget.B0;
                        z15 z15Var = new z15(suggestionsWidget.getContext(), null);
                        z15Var.setId(lga.F);
                        z15Var.setClipToPadding(false);
                        z15Var.setLayoutParams(new ti3(-1, -2));
                        z15Var.getContext();
                        z15Var.setLayoutManager(new LinearLayoutManager());
                        z15Var.setPager(new j81(suggestionsWidget, 10));
                        z15Var.setThreshold(3);
                        return z15Var;
                    case 3:
                        bc7[] bc7VarArr4 = SuggestionsWidget.B0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), null);
                        appCompatImageView.setId(lga.z);
                        float f = 44;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        appCompatImageView.setLayoutParams(layoutParams2);
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        appCompatImageView.setImageResource(yfa.c);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).getIcon().f));
                        tu0.K(appCompatImageView, 300L, new elb(9, suggestionsWidget));
                        int i22 = pq9Var.j(appCompatImageView).d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        return appCompatImageView;
                    case 4:
                        bc7[] bc7VarArr5 = SuggestionsWidget.B0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView.setId(lga.G);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, tu0.G(44 * fk4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        i4f.B.b(appCompatTextView, du4.b);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().e);
                        appCompatTextView.setText(mga.s);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        bc7[] bc7VarArr6 = SuggestionsWidget.B0;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(lga.A);
                        bc7[] bc7VarArr7 = SuggestionsWidget.B0;
                        bc7 bc7Var2 = bc7VarArr7[4];
                        frameLayout2.addView((AppCompatImageView) suggestionsWidget.x0.getValue());
                        bc7 bc7Var3 = bc7VarArr7[5];
                        frameLayout2.addView((AppCompatTextView) suggestionsWidget.y0.getValue());
                        frameLayout2.setVisibility(8);
                        br7.e(frameLayout2);
                        return frameLayout2;
                    default:
                        bc7[] bc7VarArr8 = SuggestionsWidget.B0;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView2.setId(lga.C);
                        appCompatTextView2.setLayoutParams(new ti3(-2, -2));
                        i4f.n.b(appCompatTextView2, du4.b);
                        appCompatTextView2.setTextColor(pq9Var.j(appCompatTextView2).getText().h);
                        appCompatTextView2.setText(mga.r);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        float f2 = 16;
                        appCompatTextView2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0);
                        br7.e(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i5 = 4;
        this.y0 = binding(new k56(this) { // from class: zce
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                pq9 pq9Var = qp4.u0;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i5) {
                    case 0:
                        bc7[] bc7VarArr = SuggestionsWidget.B0;
                        return new pce(suggestionsWidget, ((iba) f9g.a.getAccessor().d(iba.class).getValue()).c());
                    case 1:
                        bc7[] bc7VarArr2 = SuggestionsWidget.B0;
                        View frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(lga.D);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(36 * fk4.d().getDisplayMetrics().density), tu0.G(5 * fk4.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 40.0f));
                        frameLayout.setBackgroundColor(pq9Var.j(frameLayout).getIcon().h);
                        return frameLayout;
                    case 2:
                        bc7[] bc7VarArr3 = SuggestionsWidget.B0;
                        z15 z15Var = new z15(suggestionsWidget.getContext(), null);
                        z15Var.setId(lga.F);
                        z15Var.setClipToPadding(false);
                        z15Var.setLayoutParams(new ti3(-1, -2));
                        z15Var.getContext();
                        z15Var.setLayoutManager(new LinearLayoutManager());
                        z15Var.setPager(new j81(suggestionsWidget, 10));
                        z15Var.setThreshold(3);
                        return z15Var;
                    case 3:
                        bc7[] bc7VarArr4 = SuggestionsWidget.B0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), null);
                        appCompatImageView.setId(lga.z);
                        float f = 44;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        appCompatImageView.setLayoutParams(layoutParams2);
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        appCompatImageView.setImageResource(yfa.c);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).getIcon().f));
                        tu0.K(appCompatImageView, 300L, new elb(9, suggestionsWidget));
                        int i22 = pq9Var.j(appCompatImageView).d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        return appCompatImageView;
                    case 4:
                        bc7[] bc7VarArr5 = SuggestionsWidget.B0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView.setId(lga.G);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, tu0.G(44 * fk4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        i4f.B.b(appCompatTextView, du4.b);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().e);
                        appCompatTextView.setText(mga.s);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        bc7[] bc7VarArr6 = SuggestionsWidget.B0;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(lga.A);
                        bc7[] bc7VarArr7 = SuggestionsWidget.B0;
                        bc7 bc7Var2 = bc7VarArr7[4];
                        frameLayout2.addView((AppCompatImageView) suggestionsWidget.x0.getValue());
                        bc7 bc7Var3 = bc7VarArr7[5];
                        frameLayout2.addView((AppCompatTextView) suggestionsWidget.y0.getValue());
                        frameLayout2.setVisibility(8);
                        br7.e(frameLayout2);
                        return frameLayout2;
                    default:
                        bc7[] bc7VarArr8 = SuggestionsWidget.B0;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView2.setId(lga.C);
                        appCompatTextView2.setLayoutParams(new ti3(-2, -2));
                        i4f.n.b(appCompatTextView2, du4.b);
                        appCompatTextView2.setTextColor(pq9Var.j(appCompatTextView2).getText().h);
                        appCompatTextView2.setText(mga.r);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        float f2 = 16;
                        appCompatTextView2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0);
                        br7.e(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i6 = 5;
        this.z0 = binding(new k56(this) { // from class: zce
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                pq9 pq9Var = qp4.u0;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i6) {
                    case 0:
                        bc7[] bc7VarArr = SuggestionsWidget.B0;
                        return new pce(suggestionsWidget, ((iba) f9g.a.getAccessor().d(iba.class).getValue()).c());
                    case 1:
                        bc7[] bc7VarArr2 = SuggestionsWidget.B0;
                        View frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(lga.D);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(36 * fk4.d().getDisplayMetrics().density), tu0.G(5 * fk4.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 40.0f));
                        frameLayout.setBackgroundColor(pq9Var.j(frameLayout).getIcon().h);
                        return frameLayout;
                    case 2:
                        bc7[] bc7VarArr3 = SuggestionsWidget.B0;
                        z15 z15Var = new z15(suggestionsWidget.getContext(), null);
                        z15Var.setId(lga.F);
                        z15Var.setClipToPadding(false);
                        z15Var.setLayoutParams(new ti3(-1, -2));
                        z15Var.getContext();
                        z15Var.setLayoutManager(new LinearLayoutManager());
                        z15Var.setPager(new j81(suggestionsWidget, 10));
                        z15Var.setThreshold(3);
                        return z15Var;
                    case 3:
                        bc7[] bc7VarArr4 = SuggestionsWidget.B0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), null);
                        appCompatImageView.setId(lga.z);
                        float f = 44;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        appCompatImageView.setLayoutParams(layoutParams2);
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        appCompatImageView.setImageResource(yfa.c);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).getIcon().f));
                        tu0.K(appCompatImageView, 300L, new elb(9, suggestionsWidget));
                        int i22 = pq9Var.j(appCompatImageView).d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        return appCompatImageView;
                    case 4:
                        bc7[] bc7VarArr5 = SuggestionsWidget.B0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView.setId(lga.G);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, tu0.G(44 * fk4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        i4f.B.b(appCompatTextView, du4.b);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().e);
                        appCompatTextView.setText(mga.s);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        bc7[] bc7VarArr6 = SuggestionsWidget.B0;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(lga.A);
                        bc7[] bc7VarArr7 = SuggestionsWidget.B0;
                        bc7 bc7Var2 = bc7VarArr7[4];
                        frameLayout2.addView((AppCompatImageView) suggestionsWidget.x0.getValue());
                        bc7 bc7Var3 = bc7VarArr7[5];
                        frameLayout2.addView((AppCompatTextView) suggestionsWidget.y0.getValue());
                        frameLayout2.setVisibility(8);
                        br7.e(frameLayout2);
                        return frameLayout2;
                    default:
                        bc7[] bc7VarArr8 = SuggestionsWidget.B0;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView2.setId(lga.C);
                        appCompatTextView2.setLayoutParams(new ti3(-2, -2));
                        i4f.n.b(appCompatTextView2, du4.b);
                        appCompatTextView2.setTextColor(pq9Var.j(appCompatTextView2).getText().h);
                        appCompatTextView2.setText(mga.r);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        float f2 = 16;
                        appCompatTextView2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0);
                        br7.e(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i7 = 6;
        this.A0 = binding(new k56(this) { // from class: zce
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                pq9 pq9Var = qp4.u0;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i7) {
                    case 0:
                        bc7[] bc7VarArr = SuggestionsWidget.B0;
                        return new pce(suggestionsWidget, ((iba) f9g.a.getAccessor().d(iba.class).getValue()).c());
                    case 1:
                        bc7[] bc7VarArr2 = SuggestionsWidget.B0;
                        View frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(lga.D);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(36 * fk4.d().getDisplayMetrics().density), tu0.G(5 * fk4.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 40.0f));
                        frameLayout.setBackgroundColor(pq9Var.j(frameLayout).getIcon().h);
                        return frameLayout;
                    case 2:
                        bc7[] bc7VarArr3 = SuggestionsWidget.B0;
                        z15 z15Var = new z15(suggestionsWidget.getContext(), null);
                        z15Var.setId(lga.F);
                        z15Var.setClipToPadding(false);
                        z15Var.setLayoutParams(new ti3(-1, -2));
                        z15Var.getContext();
                        z15Var.setLayoutManager(new LinearLayoutManager());
                        z15Var.setPager(new j81(suggestionsWidget, 10));
                        z15Var.setThreshold(3);
                        return z15Var;
                    case 3:
                        bc7[] bc7VarArr4 = SuggestionsWidget.B0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), null);
                        appCompatImageView.setId(lga.z);
                        float f = 44;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        appCompatImageView.setLayoutParams(layoutParams2);
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        appCompatImageView.setImageResource(yfa.c);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).getIcon().f));
                        tu0.K(appCompatImageView, 300L, new elb(9, suggestionsWidget));
                        int i22 = pq9Var.j(appCompatImageView).d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        return appCompatImageView;
                    case 4:
                        bc7[] bc7VarArr5 = SuggestionsWidget.B0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView.setId(lga.G);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, tu0.G(44 * fk4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        i4f.B.b(appCompatTextView, du4.b);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().e);
                        appCompatTextView.setText(mga.s);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        bc7[] bc7VarArr6 = SuggestionsWidget.B0;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(lga.A);
                        bc7[] bc7VarArr7 = SuggestionsWidget.B0;
                        bc7 bc7Var2 = bc7VarArr7[4];
                        frameLayout2.addView((AppCompatImageView) suggestionsWidget.x0.getValue());
                        bc7 bc7Var3 = bc7VarArr7[5];
                        frameLayout2.addView((AppCompatTextView) suggestionsWidget.y0.getValue());
                        frameLayout2.setVisibility(8);
                        br7.e(frameLayout2);
                        return frameLayout2;
                    default:
                        bc7[] bc7VarArr8 = SuggestionsWidget.B0;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView2.setId(lga.C);
                        appCompatTextView2.setLayoutParams(new ti3(-2, -2));
                        i4f.n.b(appCompatTextView2, du4.b);
                        appCompatTextView2.setTextColor(pq9Var.j(appCompatTextView2).getText().h);
                        appCompatTextView2.setText(mga.r);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        float f2 = 16;
                        appCompatTextView2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0);
                        br7.e(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        v0(false);
    }
}
