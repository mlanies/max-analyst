package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class cla extends FrameLayout implements b5d, kre {
    public static final /* synthetic */ bc7[] H0 = {new oi9(cla.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), rh4.g(nec.a, cla.class, "form", "getForm()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Form;"), new oi9(cla.class, "rightActions", "getRightActions()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Action$Right;"), new oi9(cla.class, "leftActions", "getLeftActions()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Action$Left;"), new oi9(cla.class, "actionsHorizontalPadding", "getActionsHorizontalPadding()Lkotlin/Pair;"), new oi9(cla.class, "isTextShimmerEnabled", "isTextShimmerEnabled()Z")};
    public OneMeButton A0;
    public View B0;
    public View C0;
    public final Rect D0;
    public boolean E0;
    public boolean F0;
    public k56 G0;
    public final bla a;
    public final bla b;
    public final bla c;
    public final bla o;
    public final bla s0;
    public final bla t0;
    public final TextView u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    /* JADX WARN: Multi-variable type inference failed */
    public cla(final Context context, int i) {
        super(context, null, 0);
        this.a = new bla(this, 0, false);
        this.b = new bla(this, 1);
        this.c = new bla(this, 2);
        this.o = new bla(this, 3);
        this.s0 = new bla(this, 4, 0 == true ? 1 : 0);
        this.t0 = new bla(this, 5);
        TextView textView = new TextView(context);
        textView.setId(xoc.O0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(qp4.u0.j(textView).getText().e);
        textView.setTextAlignment(5);
        textView.setSingleLine();
        this.u0 = textView;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.v0 = tu0.r(3, new k56() { // from class: jka
            @Override // defpackage.k56
            public final Object invoke() {
                ViewGroup.LayoutParams layoutParams;
                switch (objArr) {
                    case 0:
                        fmd fmdVar = new fmd(context);
                        fmdVar.setId(xoc.N0);
                        fmdVar.setEllipsize(TextUtils.TruncateAt.END);
                        pq9 pq9Var = qp4.u0;
                        fmdVar.setTextColor(pq9Var.j(fmdVar).getText().e);
                        fmdVar.setSingleLine();
                        bkg bkgVar = new bkg(25);
                        yld yldVar = (yld) bkgVar.b;
                        yldVar.k = false;
                        yldVar.d = pq9Var.j(fmdVar).getText().a;
                        bkgVar.v(pq9Var.j(fmdVar).getText().h);
                        yldVar.i = 0.0f;
                        bkgVar.w(900L);
                        bkgVar.u();
                        bkgVar.x(tu0.G(360 * fk4.d().getDisplayMetrics().density));
                        yldVar.q = new LinearInterpolator();
                        yld yldVarM = bkgVar.m();
                        fmdVar.b.b(yldVarM);
                        if (yldVarM.j) {
                            fmdVar.setLayerType(2, fmdVar.a);
                        } else {
                            fmdVar.setLayerType(0, null);
                        }
                        np8.n(fmdVar);
                        i4f.p.b(fmdVar, du4.b);
                        cla claVar = this;
                        claVar.getClass();
                        bc7 bc7Var = cla.H0[5];
                        fmdVar.a(((Boolean) claVar.t0.b).booleanValue());
                        claVar.addView(fmdVar);
                        return fmdVar;
                    case 1:
                        s5a s5aVar = new s5a(context);
                        s5aVar.setId(xoc.P0);
                        cla claVar2 = this;
                        if (claVar2.getForm() == uka.c) {
                            float f = 40;
                            layoutParams = new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        } else {
                            float f2 = 24;
                            layoutParams = new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                        }
                        s5aVar.setLayoutParams(layoutParams);
                        s5aVar.setAvatarShape(j5a.a);
                        claVar2.addView(s5aVar);
                        return s5aVar;
                    case 2:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(xoc.Q0);
                        float f3 = 16;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                        imageView.setImageDrawable(kt3.b(imageView.getContext(), woc.Y));
                        imageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(imageView).getIcon().f));
                        this.addView(imageView);
                        return imageView;
                    default:
                        ela elaVar = new ela(context);
                        elaVar.setId(xoc.M0);
                        elaVar.setVisibility(8);
                        elaVar.setAlpha(0.0f);
                        elaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        this.addView(elaVar);
                        return elaVar;
                }
            }
        });
        final int i2 = 1;
        this.w0 = tu0.r(3, new k56() { // from class: jka
            @Override // defpackage.k56
            public final Object invoke() {
                ViewGroup.LayoutParams layoutParams;
                switch (i2) {
                    case 0:
                        fmd fmdVar = new fmd(context);
                        fmdVar.setId(xoc.N0);
                        fmdVar.setEllipsize(TextUtils.TruncateAt.END);
                        pq9 pq9Var = qp4.u0;
                        fmdVar.setTextColor(pq9Var.j(fmdVar).getText().e);
                        fmdVar.setSingleLine();
                        bkg bkgVar = new bkg(25);
                        yld yldVar = (yld) bkgVar.b;
                        yldVar.k = false;
                        yldVar.d = pq9Var.j(fmdVar).getText().a;
                        bkgVar.v(pq9Var.j(fmdVar).getText().h);
                        yldVar.i = 0.0f;
                        bkgVar.w(900L);
                        bkgVar.u();
                        bkgVar.x(tu0.G(360 * fk4.d().getDisplayMetrics().density));
                        yldVar.q = new LinearInterpolator();
                        yld yldVarM = bkgVar.m();
                        fmdVar.b.b(yldVarM);
                        if (yldVarM.j) {
                            fmdVar.setLayerType(2, fmdVar.a);
                        } else {
                            fmdVar.setLayerType(0, null);
                        }
                        np8.n(fmdVar);
                        i4f.p.b(fmdVar, du4.b);
                        cla claVar = this;
                        claVar.getClass();
                        bc7 bc7Var = cla.H0[5];
                        fmdVar.a(((Boolean) claVar.t0.b).booleanValue());
                        claVar.addView(fmdVar);
                        return fmdVar;
                    case 1:
                        s5a s5aVar = new s5a(context);
                        s5aVar.setId(xoc.P0);
                        cla claVar2 = this;
                        if (claVar2.getForm() == uka.c) {
                            float f = 40;
                            layoutParams = new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        } else {
                            float f2 = 24;
                            layoutParams = new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                        }
                        s5aVar.setLayoutParams(layoutParams);
                        s5aVar.setAvatarShape(j5a.a);
                        claVar2.addView(s5aVar);
                        return s5aVar;
                    case 2:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(xoc.Q0);
                        float f3 = 16;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                        imageView.setImageDrawable(kt3.b(imageView.getContext(), woc.Y));
                        imageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(imageView).getIcon().f));
                        this.addView(imageView);
                        return imageView;
                    default:
                        ela elaVar = new ela(context);
                        elaVar.setId(xoc.M0);
                        elaVar.setVisibility(8);
                        elaVar.setAlpha(0.0f);
                        elaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        this.addView(elaVar);
                        return elaVar;
                }
            }
        });
        final int i3 = 2;
        this.x0 = tu0.r(3, new k56() { // from class: jka
            @Override // defpackage.k56
            public final Object invoke() {
                ViewGroup.LayoutParams layoutParams;
                switch (i3) {
                    case 0:
                        fmd fmdVar = new fmd(context);
                        fmdVar.setId(xoc.N0);
                        fmdVar.setEllipsize(TextUtils.TruncateAt.END);
                        pq9 pq9Var = qp4.u0;
                        fmdVar.setTextColor(pq9Var.j(fmdVar).getText().e);
                        fmdVar.setSingleLine();
                        bkg bkgVar = new bkg(25);
                        yld yldVar = (yld) bkgVar.b;
                        yldVar.k = false;
                        yldVar.d = pq9Var.j(fmdVar).getText().a;
                        bkgVar.v(pq9Var.j(fmdVar).getText().h);
                        yldVar.i = 0.0f;
                        bkgVar.w(900L);
                        bkgVar.u();
                        bkgVar.x(tu0.G(360 * fk4.d().getDisplayMetrics().density));
                        yldVar.q = new LinearInterpolator();
                        yld yldVarM = bkgVar.m();
                        fmdVar.b.b(yldVarM);
                        if (yldVarM.j) {
                            fmdVar.setLayerType(2, fmdVar.a);
                        } else {
                            fmdVar.setLayerType(0, null);
                        }
                        np8.n(fmdVar);
                        i4f.p.b(fmdVar, du4.b);
                        cla claVar = this;
                        claVar.getClass();
                        bc7 bc7Var = cla.H0[5];
                        fmdVar.a(((Boolean) claVar.t0.b).booleanValue());
                        claVar.addView(fmdVar);
                        return fmdVar;
                    case 1:
                        s5a s5aVar = new s5a(context);
                        s5aVar.setId(xoc.P0);
                        cla claVar2 = this;
                        if (claVar2.getForm() == uka.c) {
                            float f = 40;
                            layoutParams = new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        } else {
                            float f2 = 24;
                            layoutParams = new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                        }
                        s5aVar.setLayoutParams(layoutParams);
                        s5aVar.setAvatarShape(j5a.a);
                        claVar2.addView(s5aVar);
                        return s5aVar;
                    case 2:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(xoc.Q0);
                        float f3 = 16;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                        imageView.setImageDrawable(kt3.b(imageView.getContext(), woc.Y));
                        imageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(imageView).getIcon().f));
                        this.addView(imageView);
                        return imageView;
                    default:
                        ela elaVar = new ela(context);
                        elaVar.setId(xoc.M0);
                        elaVar.setVisibility(8);
                        elaVar.setAlpha(0.0f);
                        elaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        this.addView(elaVar);
                        return elaVar;
                }
            }
        });
        this.y0 = tu0.r(3, new zj7(23, this));
        final int i4 = 3;
        this.z0 = tu0.r(3, new k56() { // from class: jka
            @Override // defpackage.k56
            public final Object invoke() {
                ViewGroup.LayoutParams layoutParams;
                switch (i4) {
                    case 0:
                        fmd fmdVar = new fmd(context);
                        fmdVar.setId(xoc.N0);
                        fmdVar.setEllipsize(TextUtils.TruncateAt.END);
                        pq9 pq9Var = qp4.u0;
                        fmdVar.setTextColor(pq9Var.j(fmdVar).getText().e);
                        fmdVar.setSingleLine();
                        bkg bkgVar = new bkg(25);
                        yld yldVar = (yld) bkgVar.b;
                        yldVar.k = false;
                        yldVar.d = pq9Var.j(fmdVar).getText().a;
                        bkgVar.v(pq9Var.j(fmdVar).getText().h);
                        yldVar.i = 0.0f;
                        bkgVar.w(900L);
                        bkgVar.u();
                        bkgVar.x(tu0.G(360 * fk4.d().getDisplayMetrics().density));
                        yldVar.q = new LinearInterpolator();
                        yld yldVarM = bkgVar.m();
                        fmdVar.b.b(yldVarM);
                        if (yldVarM.j) {
                            fmdVar.setLayerType(2, fmdVar.a);
                        } else {
                            fmdVar.setLayerType(0, null);
                        }
                        np8.n(fmdVar);
                        i4f.p.b(fmdVar, du4.b);
                        cla claVar = this;
                        claVar.getClass();
                        bc7 bc7Var = cla.H0[5];
                        fmdVar.a(((Boolean) claVar.t0.b).booleanValue());
                        claVar.addView(fmdVar);
                        return fmdVar;
                    case 1:
                        s5a s5aVar = new s5a(context);
                        s5aVar.setId(xoc.P0);
                        cla claVar2 = this;
                        if (claVar2.getForm() == uka.c) {
                            float f = 40;
                            layoutParams = new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        } else {
                            float f2 = 24;
                            layoutParams = new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                        }
                        s5aVar.setLayoutParams(layoutParams);
                        s5aVar.setAvatarShape(j5a.a);
                        claVar2.addView(s5aVar);
                        return s5aVar;
                    case 2:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(xoc.Q0);
                        float f3 = 16;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                        imageView.setImageDrawable(kt3.b(imageView.getContext(), woc.Y));
                        imageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(imageView).getIcon().f));
                        this.addView(imageView);
                        return imageView;
                    default:
                        ela elaVar = new ela(context);
                        elaVar.setId(xoc.M0);
                        elaVar.setVisibility(8);
                        elaVar.setAlpha(0.0f);
                        elaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        this.addView(elaVar);
                        return elaVar;
                }
            }
        });
        this.D0 = new Rect();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(textView, new FrameLayout.LayoutParams(-2, -2));
        k();
        l();
        addOnLayoutChangeListener(new qq0(9, this));
        if (isLaidOut()) {
            e(this);
        }
    }

    public static final void d(cla claVar, final ska skaVar) {
        View viewY;
        OneMeButton oneMeButton;
        claVar.removeView(claVar.B0);
        claVar.removeView(claVar.C0);
        Context context = claVar.getContext();
        ala searchViewInteraction = claVar.getSearchViewInteraction();
        boolean z = skaVar instanceof pka;
        View view = null;
        pka pkaVar = z ? (pka) skaVar : null;
        View viewY2 = c54.Y(context, pkaVar != null ? pkaVar.a : null, searchViewInteraction);
        if (viewY2 != null) {
            viewY2.setId(xoc.t0);
        } else {
            viewY2 = null;
        }
        claVar.C0 = viewY2;
        Context context2 = claVar.getContext();
        ala searchViewInteraction2 = claVar.getSearchViewInteraction();
        fka customTheme = claVar.getCustomTheme();
        if (z) {
            viewY = c54.Y(context2, ((pka) skaVar).b, searchViewInteraction2);
        } else {
            if (skaVar instanceof rka) {
                oneMeButton = new OneMeButton(context2, null);
                oneMeButton.setCustomTheme(customTheme);
                oneMeButton.d(Integer.valueOf(jub.ic_more_vertical_filled_16), true);
                final int i = 0;
                tu0.K(oneMeButton, 300L, new View.OnClickListener() { // from class: pwe
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i) {
                            case 0:
                                ((rka) skaVar).a.invoke(view2);
                                break;
                            case 1:
                                ((mka) skaVar).a.invoke(view2);
                                break;
                            default:
                                ((lka) skaVar).a.invoke(view2);
                                break;
                        }
                    }
                });
            } else if (skaVar instanceof mka) {
                oneMeButton = new OneMeButton(context2, null);
                oneMeButton.d(Integer.valueOf(jub.ic_done_28), true);
                final int i2 = 1;
                tu0.K(oneMeButton, 300L, new View.OnClickListener() { // from class: pwe
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i2) {
                            case 0:
                                ((rka) skaVar).a.invoke(view2);
                                break;
                            case 1:
                                ((mka) skaVar).a.invoke(view2);
                                break;
                            default:
                                ((lka) skaVar).a.invoke(view2);
                                break;
                        }
                    }
                });
            } else if (skaVar instanceof lka) {
                oneMeButton = new OneMeButton(context2, null);
                oneMeButton.d(Integer.valueOf(jub.ic_cancel_outline_28), true);
                final int i3 = 2;
                tu0.K(oneMeButton, 300L, new View.OnClickListener() { // from class: pwe
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i3) {
                            case 0:
                                ((rka) skaVar).a.invoke(view2);
                                break;
                            case 1:
                                ((mka) skaVar).a.invoke(view2);
                                break;
                            default:
                                ((lka) skaVar).a.invoke(view2);
                                break;
                        }
                    }
                });
            } else {
                if (!(skaVar instanceof nka)) {
                    throw new NoWhenBranchMatchedException();
                }
                viewY = null;
            }
            viewY = oneMeButton;
        }
        if (viewY != null) {
            viewY.setId(xoc.s0);
            view = viewY;
        }
        claVar.B0 = view;
        if (view != null) {
            claVar.addView(view);
            f46.C(view, tu0.G(40 * fk4.d().getDisplayMetrics().density), tu0.G(52 * fk4.d().getDisplayMetrics().density));
        }
        View view2 = claVar.C0;
        if (view2 != null) {
            claVar.addView(view2);
            f46.C(view2, tu0.G(40 * fk4.d().getDisplayMetrics().density), tu0.G(52 * fk4.d().getDisplayMetrics().density));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.cla r7) {
        /*
            android.widget.TextView r0 = r7.u0
            int r1 = r0.getLeft()
            int r0 = r0.getRight()
            int r2 = r7.getHeight()
            android.graphics.Rect r3 = r7.D0
            r4 = 0
            r3.set(r1, r4, r0, r2)
            je7 r0 = r7.w0
            boolean r1 = r0.a()
            if (r1 == 0) goto L2e
            java.lang.Object r0 = r0.getValue()
            s5a r0 = (defpackage.s5a) r0
            int r0 = r0.getLeft()
            int r1 = r3.left
            int r0 = java.lang.Math.min(r0, r1)
            r3.left = r0
        L2e:
            je7 r0 = r7.v0
            boolean r1 = r0.a()
            if (r1 == 0) goto L54
            java.lang.Object r0 = r0.getValue()
            fmd r0 = (defpackage.fmd) r0
            int r1 = r0.getLeft()
            int r2 = r3.left
            int r1 = java.lang.Math.min(r1, r2)
            r3.left = r1
            int r0 = r0.getRight()
            int r1 = r3.right
            int r0 = java.lang.Math.max(r0, r1)
            r3.right = r0
        L54:
            one.me.sdk.uikit.common.button.OneMeButton r0 = r7.A0
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L88
            android.view.TouchDelegate r5 = r0.getTouchDelegate()
            if (r5 == 0) goto L7d
            android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r5 = r5.getTouchDelegateInfo()
            if (r5 == 0) goto L7d
            int r6 = r5.getRegionCount()
            if (r6 > 0) goto L6e
            r5 = r2
            goto L72
        L6e:
            android.graphics.Region r5 = r5.getRegionAt(r4)
        L72:
            if (r5 == 0) goto L7d
            android.graphics.Rect r5 = r5.getBounds()
            if (r5 == 0) goto L7d
            int r5 = r5.right
            goto L7e
        L7d:
            r5 = r1
        L7e:
            int r0 = r0.getRight()
            int r0 = java.lang.Math.max(r5, r0)
            r3.left = r0
        L88:
            je7 r0 = r7.x0
            boolean r5 = r0.a()
            if (r5 == 0) goto La2
            java.lang.Object r0 = r0.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            int r0 = r0.getRight()
            int r5 = r3.right
            int r0 = java.lang.Math.max(r0, r5)
            r3.right = r0
        La2:
            android.view.View r0 = r7.B0
            if (r0 == 0) goto Ld4
            android.view.TouchDelegate r5 = r0.getTouchDelegate()
            if (r5 == 0) goto Lc9
            android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r5 = r5.getTouchDelegateInfo()
            if (r5 == 0) goto Lc9
            int r6 = r5.getRegionCount()
            if (r6 > 0) goto Lba
            r5 = r2
            goto Lbe
        Lba:
            android.graphics.Region r5 = r5.getRegionAt(r4)
        Lbe:
            if (r5 == 0) goto Lc9
            android.graphics.Rect r5 = r5.getBounds()
            if (r5 == 0) goto Lc9
            int r5 = r5.left
            goto Lca
        Lc9:
            r5 = r1
        Lca:
            int r0 = r0.getLeft()
            int r0 = java.lang.Math.min(r5, r0)
            r3.right = r0
        Ld4:
            android.view.View r7 = r7.C0
            if (r7 == 0) goto L103
            android.view.TouchDelegate r0 = r7.getTouchDelegate()
            if (r0 == 0) goto Lf9
            android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = r0.getTouchDelegateInfo()
            if (r0 == 0) goto Lf9
            int r5 = r0.getRegionCount()
            if (r5 > 0) goto Leb
            goto Lef
        Leb:
            android.graphics.Region r2 = r0.getRegionAt(r4)
        Lef:
            if (r2 == 0) goto Lf9
            android.graphics.Rect r0 = r2.getBounds()
            if (r0 == 0) goto Lf9
            int r1 = r0.left
        Lf9:
            int r7 = r7.getLeft()
            int r7 = java.lang.Math.min(r1, r7)
            r3.right = r7
        L103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cla.e(cla):void");
    }

    private final fka getCurrentTheme() {
        fka customTheme = getCustomTheme();
        return customTheme == null ? qp4.u0.j(this) : customTheme;
    }

    private final ala getSearchViewInteraction() {
        return (ala) this.y0.getValue();
    }

    private final int getVerticalPaddingOffset() {
        return (getPaddingTop() / 2) - (getPaddingBottom() / 2);
    }

    public static void h(View view, int i, int i2) {
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    public static void i(View view, int i, int i2) {
        view.layout(i, i2 - (view.getMeasuredHeight() / 2), view.getMeasuredWidth() + i, view.getMeasuredHeight() + (i2 - (view.getMeasuredHeight() / 2)));
    }

    @Override // defpackage.b5d
    public final void a() {
        ((ela) this.z0.getValue()).a();
    }

    @Override // defpackage.b5d
    public final boolean b() {
        je7 je7Var = this.z0;
        return je7Var.a() && ((ela) je7Var.getValue()).b();
    }

    @Override // defpackage.b5d
    public final void c(String str, List list, k56 k56Var, m56 m56Var) {
        ((ela) this.z0.getValue()).c(str, list, k56Var, m56Var);
    }

    public final void f(boolean z) {
        this.F0 = !z;
        this.u0.setVisibility(z ? 0 : 8);
        je7 je7Var = this.v0;
        if (je7Var.a()) {
            ((fmd) je7Var.getValue()).setVisibility(z ? 0 : 8);
        }
        je7 je7Var2 = this.w0;
        if (je7Var2.a()) {
            ((s5a) je7Var2.getValue()).setVisibility(z ? 0 : 8);
        }
        je7 je7Var3 = this.x0;
        if (je7Var3.a()) {
            ((ImageView) je7Var3.getValue()).setVisibility(z ? 0 : 8);
        }
        OneMeButton oneMeButton = this.A0;
        if (oneMeButton != null) {
            oneMeButton.setVisibility(z ? 0 : 8);
        }
        View view = this.B0;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        View view2 = this.C0;
        if (view2 != null) {
            view2.setVisibility(z ? 0 : 8);
        }
    }

    public final boolean g() {
        eha searchView = getSearchView();
        cha state = searchView != null ? searchView.getState() : null;
        return state == cha.c || state == cha.o || state == cha.b;
    }

    public final kpa getActionsHorizontalPadding() {
        bc7 bc7Var = H0[4];
        return (kpa) this.s0.b;
    }

    public final fka getCustomTheme() {
        bc7 bc7Var = H0[0];
        return (fka) this.a.b;
    }

    public final uka getForm() {
        bc7 bc7Var = H0[1];
        return (uka) this.b.b;
    }

    public final qka getLeftActions() {
        bc7 bc7Var = H0[3];
        return (qka) this.o.b;
    }

    public final ska getRightActions() {
        bc7 bc7Var = H0[2];
        return (ska) this.c.b;
    }

    public final eha getSearchView() {
        View view = this.B0;
        eha ehaVar = view instanceof eha ? (eha) view : null;
        if (ehaVar != null) {
            return ehaVar;
        }
        View view2 = this.C0;
        if (view2 instanceof eha) {
            return (eha) view2;
        }
        return null;
    }

    public final TextView getTitle() {
        return this.u0;
    }

    public final int j(int i, int i2, int i3, int i4, View view, View view2) {
        int measuredWidth;
        if (view != null && view2 != null) {
            measureChild(view, i, i2);
            measureChild(view2, i, i2);
            return view2.getMeasuredWidth() + view.getMeasuredWidth() + i4 + i3;
        }
        if (view != null) {
            measureChild(view, i, i2);
            measuredWidth = view.getMeasuredWidth();
        } else {
            if (view2 == null) {
                return 0;
            }
            measureChild(view2, i, i2);
            measuredWidth = view2.getMeasuredWidth();
        }
        return measuredWidth + i3;
    }

    public final void k() {
        int iOrdinal = getForm().ordinal();
        TextView textView = this.u0;
        if (iOrdinal == 0) {
            i4f.B.b(textView, du4.b);
            textView.setTextColor(getCurrentTheme().getText().e);
            OneMeButton oneMeButton = this.A0;
            if (oneMeButton != null) {
                i24.b(oneMeButton, getLeftActions(), getCustomTheme());
            }
            View view = this.C0;
            if (view != null) {
                i24.c(view, getRightActions(), false);
            }
            View view2 = this.B0;
            if (view2 != null) {
                i24.c(view2, getRightActions(), true);
            }
        } else if (iOrdinal == 1) {
            i4f.z.b(textView, du4.b);
            textView.setTextColor(getCurrentTheme().getText().e);
            View view3 = this.C0;
            if (view3 != null) {
                i24.d(view3, getRightActions(), false);
            }
            View view4 = this.B0;
            if (view4 != null) {
                i24.d(view4, getRightActions(), true);
            }
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i4f.B.b(textView, du4.b);
            textView.setTextColor(getCurrentTheme().getText().e);
            OneMeButton oneMeButton2 = this.A0;
            if (oneMeButton2 != null) {
                i24.b(oneMeButton2, getLeftActions(), getCustomTheme());
            }
            View view5 = this.C0;
            if (view5 != null) {
                i24.c(view5, getRightActions(), false);
            }
            View view6 = this.B0;
            if (view6 != null) {
                i24.c(view6, getRightActions(), true);
            }
        }
        je7 je7Var = this.v0;
        if (je7Var.a()) {
            fmd fmdVar = (fmd) je7Var.getValue();
            bc7 bc7Var = H0[5];
            if (((Boolean) this.t0.b).booleanValue()) {
                i4f.j.b(fmdVar, du4.b);
                fmdVar.setTextColor(getCurrentTheme().getText().h);
            } else {
                i4f.p.b(fmdVar, du4.b);
                fmdVar.setTextColor(getCurrentTheme().getText().g);
            }
        }
    }

    public final void l() {
        int iOrdinal = getForm().ordinal();
        je7 je7Var = this.w0;
        TextView textView = this.u0;
        if (iOrdinal == 0) {
            textView.setGravity(17);
            if (je7Var.a()) {
                s5a s5aVar = (s5a) je7Var.getValue();
                ViewGroup.LayoutParams layoutParams = s5aVar.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                float f = 24;
                layoutParams.width = tu0.G(fk4.d().getDisplayMetrics().density * f);
                layoutParams.height = tu0.G(f * fk4.d().getDisplayMetrics().density);
                s5aVar.setLayoutParams(layoutParams);
            }
            kpa actionsHorizontalPadding = getActionsHorizontalPadding();
            int iIntValue = actionsHorizontalPadding != null ? ((Number) actionsHorizontalPadding.a).intValue() : tu0.G(12 * fk4.d().getDisplayMetrics().density);
            kpa actionsHorizontalPadding2 = getActionsHorizontalPadding();
            setPadding(iIntValue, 0, actionsHorizontalPadding2 != null ? ((Number) actionsHorizontalPadding2.b).intValue() : tu0.G(12 * fk4.d().getDisplayMetrics().density), 0);
            return;
        }
        if (iOrdinal == 1) {
            textView.setGravity(8388611);
            if (je7Var.a()) {
                s5a s5aVar2 = (s5a) je7Var.getValue();
                ViewGroup.LayoutParams layoutParams2 = s5aVar2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                float f2 = 24;
                layoutParams2.width = tu0.G(fk4.d().getDisplayMetrics().density * f2);
                layoutParams2.height = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
                s5aVar2.setLayoutParams(layoutParams2);
            }
            kpa actionsHorizontalPadding3 = getActionsHorizontalPadding();
            int iIntValue2 = actionsHorizontalPadding3 != null ? ((Number) actionsHorizontalPadding3.a).intValue() : tu0.G(16 * fk4.d().getDisplayMetrics().density);
            kpa actionsHorizontalPadding4 = getActionsHorizontalPadding();
            setPadding(iIntValue2, 0, actionsHorizontalPadding4 != null ? ((Number) actionsHorizontalPadding4.b).intValue() : tu0.G(12 * fk4.d().getDisplayMetrics().density), 0);
            return;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        textView.setGravity(8388611);
        if (je7Var.a()) {
            s5a s5aVar3 = (s5a) je7Var.getValue();
            ViewGroup.LayoutParams layoutParams3 = s5aVar3.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            float f3 = 40;
            layoutParams3.width = tu0.G(fk4.d().getDisplayMetrics().density * f3);
            layoutParams3.height = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
            s5aVar3.setLayoutParams(layoutParams3);
        }
        kpa actionsHorizontalPadding5 = getActionsHorizontalPadding();
        int iIntValue3 = actionsHorizontalPadding5 != null ? ((Number) actionsHorizontalPadding5.a).intValue() : tu0.G(4 * fk4.d().getDisplayMetrics().density);
        kpa actionsHorizontalPadding6 = getActionsHorizontalPadding();
        setPadding(iIntValue3, 0, actionsHorizontalPadding6 != null ? ((Number) actionsHorizontalPadding6.b).intValue() : tu0.G(4 * fk4.d().getDisplayMetrics().density), 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int verticalPaddingOffset;
        int measuredHeight2;
        int verticalPaddingOffset2;
        int measuredHeight3;
        int verticalPaddingOffset3;
        int iOrdinal = getForm().ordinal();
        je7 je7Var = this.w0;
        je7 je7Var2 = this.x0;
        TextView textView = this.u0;
        je7 je7Var3 = this.v0;
        je7 je7Var4 = this.z0;
        if (iOrdinal == 0) {
            View viewZ = br7.z(je7Var4);
            if (viewZ != null) {
                i(viewZ, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            OneMeButton oneMeButton = this.A0;
            if (oneMeButton != null) {
                oneMeButton.layout(getPaddingLeft(), ((getMeasuredHeight() / 2) - (oneMeButton.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), oneMeButton.getMeasuredWidth() + getPaddingLeft(), (oneMeButton.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
            View viewZ2 = br7.z(je7Var3);
            if (viewZ2 != null) {
                measuredHeight = (((getMeasuredHeight() - viewZ2.getMeasuredHeight()) - textView.getMeasuredHeight()) - tu0.G(2 * fk4.d().getDisplayMetrics().density)) / 2;
                verticalPaddingOffset = getVerticalPaddingOffset();
            } else {
                measuredHeight = (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
                verticalPaddingOffset = getVerticalPaddingOffset();
            }
            int i5 = measuredHeight + verticalPaddingOffset;
            View view = this.B0;
            View view2 = this.C0;
            if ((view2 instanceof eha) && g()) {
                eha ehaVar = (eha) view2;
                ehaVar.layout((getMeasuredWidth() - getPaddingRight()) - ehaVar.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (ehaVar.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (ehaVar.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            } else if (view != null && view2 != null) {
                view.layout((getMeasuredWidth() - getPaddingRight()) - view.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                float f = 12;
                view2.layout(rh4.q(f, fk4.d().getDisplayMetrics().density, c54.x(view) - view2.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), rh4.q(f, fk4.d().getDisplayMetrics().density, c54.x(view)), (view2.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view2 != null) {
                view2.layout((getMeasuredWidth() - getPaddingRight()) - view2.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view2.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view != null) {
                view.layout((getMeasuredWidth() - getPaddingRight()) - view.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
            View viewZ3 = br7.z(je7Var);
            View viewZ4 = br7.z(je7Var2);
            int measuredHeight4 = (textView.getMeasuredHeight() / 2) + i5;
            int measuredWidth = (((getMeasuredWidth() / 2) - (viewZ3 != null ? (tu0.G(8 * fk4.d().getDisplayMetrics().density) + viewZ3.getMeasuredWidth()) / 2 : 0)) - (viewZ4 != null ? (tu0.G(2 * fk4.d().getDisplayMetrics().density) + viewZ4.getMeasuredWidth()) / 2 : 0)) - (textView.getMeasuredWidth() / 2);
            if (viewZ3 != null) {
                i(viewZ3, measuredWidth, measuredHeight4);
                measuredWidth = wg0.d(8, fk4.d().getDisplayMetrics().density, viewZ3.getMeasuredWidth(), measuredWidth);
            }
            h(textView, measuredWidth, i5);
            float f2 = 2;
            int iD = wg0.d(f2, fk4.d().getDisplayMetrics().density, textView.getMeasuredWidth(), measuredWidth);
            if (viewZ4 != null) {
                i(viewZ4, iD, measuredHeight4);
            }
            if (viewZ2 != null) {
                int measuredWidth2 = (getMeasuredWidth() / 2) - (viewZ2.getMeasuredWidth() / 2);
                View viewZ5 = br7.z(je7Var);
                h(viewZ2, measuredWidth2, tu0.G(f2 * fk4.d().getDisplayMetrics().density) + (viewZ5 != null ? viewZ5.getBottom() : textView.getBottom()));
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            View viewZ6 = br7.z(je7Var4);
            if (viewZ6 != null) {
                i(viewZ6, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            View viewZ7 = br7.z(je7Var3);
            if (viewZ7 != null) {
                measuredHeight2 = (((getMeasuredHeight() - viewZ7.getMeasuredHeight()) - textView.getMeasuredHeight()) - tu0.G(2 * fk4.d().getDisplayMetrics().density)) / 2;
                verticalPaddingOffset2 = getVerticalPaddingOffset();
            } else {
                measuredHeight2 = (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
                verticalPaddingOffset2 = getVerticalPaddingOffset();
            }
            int i6 = measuredHeight2 + verticalPaddingOffset2;
            h(textView, getPaddingLeft(), i6);
            View viewZ8 = br7.z(je7Var2);
            if (viewZ8 != null) {
                i(viewZ8, rh4.c(2, fk4.d().getDisplayMetrics().density, textView.getRight()), (textView.getMeasuredHeight() / 2) + i6);
            }
            if (viewZ7 != null) {
                h(viewZ7, getPaddingLeft(), tu0.G(2 * fk4.d().getDisplayMetrics().density) + textView.getBottom());
            }
            View view3 = this.B0;
            View view4 = this.C0;
            if ((view4 instanceof eha) && g()) {
                eha ehaVar2 = (eha) view4;
                ehaVar2.layout((getMeasuredWidth() - getPaddingRight()) - ehaVar2.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (ehaVar2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (ehaVar2.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            if (view3 != null && view4 != null) {
                view3.layout((getMeasuredWidth() - getPaddingRight()) - view3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view3.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
                float f3 = 16;
                view4.layout(rh4.q(f3, fk4.d().getDisplayMetrics().density, c54.x(view3) - view4.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view4.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), rh4.q(f3, fk4.d().getDisplayMetrics().density, c54.x(view3)), (view4.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            } else if (view4 != null) {
                view4.layout((getMeasuredWidth() - getPaddingRight()) - view4.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view4.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view4.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            } else {
                if (view3 != null) {
                    view3.layout((getMeasuredWidth() - getPaddingRight()) - view3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view3.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                    return;
                }
                return;
            }
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        View viewZ9 = br7.z(je7Var4);
        if (viewZ9 != null) {
            i(viewZ9, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            return;
        }
        View viewZ10 = br7.z(je7Var3);
        if (viewZ10 != null) {
            measuredHeight3 = ((getMeasuredHeight() - viewZ10.getMeasuredHeight()) - textView.getMeasuredHeight()) / 2;
            verticalPaddingOffset3 = getVerticalPaddingOffset();
        } else {
            measuredHeight3 = (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
            verticalPaddingOffset3 = getVerticalPaddingOffset();
        }
        int i7 = measuredHeight3 + verticalPaddingOffset3;
        int paddingLeft = getPaddingLeft();
        OneMeButton oneMeButton2 = this.A0;
        if (oneMeButton2 != null) {
            oneMeButton2.layout(getPaddingLeft(), ((getMeasuredHeight() / 2) - (oneMeButton2.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), oneMeButton2.getMeasuredWidth() + getPaddingLeft(), (oneMeButton2.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            paddingLeft += oneMeButton2.getMeasuredWidth();
        }
        View viewZ11 = br7.z(je7Var);
        if (viewZ11 != null) {
            int iG = paddingLeft + (this.A0 != null ? tu0.G(8 * fk4.d().getDisplayMetrics().density) / 2 : tu0.G(8 * fk4.d().getDisplayMetrics().density));
            i(viewZ11, iG, (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            paddingLeft = iG + viewZ11.getMeasuredWidth();
        }
        float f4 = 8;
        int iG2 = tu0.G(fk4.d().getDisplayMetrics().density * f4) + paddingLeft;
        h(textView, iG2, i7);
        View viewZ12 = br7.z(je7Var2);
        if (viewZ12 != null) {
            i(viewZ12, rh4.c(2, fk4.d().getDisplayMetrics().density, textView.getRight()), (textView.getMeasuredHeight() / 2) + i7);
        }
        if (viewZ10 != null) {
            h(viewZ10, iG2, textView.getBottom());
        }
        View view5 = this.B0;
        View view6 = this.C0;
        if ((view6 instanceof eha) && g()) {
            eha ehaVar3 = (eha) view6;
            ehaVar3.layout((getMeasuredWidth() - getPaddingRight()) - ehaVar3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (ehaVar3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (ehaVar3.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            return;
        }
        if (view5 != null && view6 != null) {
            view5.layout((getMeasuredWidth() - getPaddingRight()) - view5.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view5.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view5.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            view6.layout(rh4.q(f4, fk4.d().getDisplayMetrics().density, c54.x(view5) - view6.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view6.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), rh4.q(f4, fk4.d().getDisplayMetrics().density, c54.x(view5)), (view6.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
        } else if (view6 != null) {
            view6.layout((getMeasuredWidth() - getPaddingRight()) - view6.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view6.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view6.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
        } else if (view5 != null) {
            view5.layout((getMeasuredWidth() - getPaddingRight()) - view5.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view5.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view5.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iOrdinal = getForm().ordinal();
        je7 je7Var = this.w0;
        TextView textView = this.u0;
        je7 je7Var2 = this.x0;
        je7 je7Var3 = this.v0;
        je7 je7Var4 = this.z0;
        if (iOrdinal == 0) {
            int size = View.MeasureSpec.getSize(i);
            int paddingTop = getPaddingTop() + tu0.G(52 * fk4.d().getDisplayMetrics().density) + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            View viewZ = br7.z(je7Var4);
            if (viewZ != null) {
                viewZ.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
            }
            if (viewZ != null) {
                measureChild(viewZ, i, i2);
            }
            float f = 12;
            int paddingRight = getPaddingRight() + j(i, i2, tu0.G(16 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), this.B0, this.C0);
            int paddingLeft2 = getPaddingLeft();
            OneMeButton oneMeButton = this.A0;
            if (oneMeButton != null) {
                measureChild(oneMeButton, i, i2);
                paddingLeft2 = wg0.d(f, fk4.d().getDisplayMetrics().density, oneMeButton.getMeasuredWidth(), paddingLeft2);
            }
            int iMax = size - (Math.max(paddingLeft2, paddingRight) * 2);
            View viewZ2 = br7.z(je7Var3);
            if (viewZ2 != null) {
                viewZ2.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            View viewZ3 = br7.z(je7Var);
            if (viewZ3 != null) {
                measureChild(viewZ3, i, i2);
                iMax -= tu0.G(8 * fk4.d().getDisplayMetrics().density) + viewZ3.getMeasuredWidth();
            }
            View viewZ4 = br7.z(je7Var2);
            if (viewZ4 != null) {
                measureChild(viewZ4, i, i2);
                iMax -= tu0.G(2 * fk4.d().getDisplayMetrics().density) + viewZ4.getMeasuredWidth();
            }
            textView.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size, paddingTop);
            return;
        }
        if (iOrdinal == 1) {
            int size2 = View.MeasureSpec.getSize(i);
            int paddingBottom = getPaddingBottom() + getPaddingTop() + tu0.G(52 * fk4.d().getDisplayMetrics().density);
            int paddingLeft3 = (size2 - getPaddingLeft()) - getPaddingRight();
            View viewZ5 = br7.z(je7Var4);
            if (viewZ5 != null) {
                viewZ5.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft3, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
            }
            int iJ = paddingLeft3 - j(i, i2, tu0.G(16 * fk4.d().getDisplayMetrics().density), tu0.G(12 * fk4.d().getDisplayMetrics().density), this.B0, this.C0);
            View viewZ6 = br7.z(je7Var3);
            if (viewZ6 != null) {
                viewZ6.measure(View.MeasureSpec.makeMeasureSpec(iJ, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            View viewZ7 = br7.z(je7Var2);
            if (viewZ7 != null) {
                measureChild(viewZ7, i, i2);
                iJ -= tu0.G(2 * fk4.d().getDisplayMetrics().density) + viewZ7.getMeasuredWidth();
            }
            textView.measure(View.MeasureSpec.makeMeasureSpec(iJ, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size2, paddingBottom);
            return;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int size3 = View.MeasureSpec.getSize(i);
        float f2 = 64;
        int paddingBottom2 = getPaddingBottom() + getPaddingTop() + tu0.G(fk4.d().getDisplayMetrics().density * f2);
        int paddingLeft4 = (size3 - getPaddingLeft()) - getPaddingRight();
        View viewZ8 = br7.z(je7Var4);
        if (viewZ8 != null) {
            viewZ8.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft4, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom2, 1073741824));
        }
        float f3 = 8;
        int iJ2 = paddingLeft4 - j(i, i2, tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), this.B0, this.C0);
        OneMeButton oneMeButton2 = this.A0;
        if (oneMeButton2 != null) {
            measureChild(oneMeButton2, i, i2);
            iJ2 -= oneMeButton2.getMeasuredWidth();
        }
        View viewZ9 = br7.z(je7Var);
        if (viewZ9 != null) {
            measureChild(viewZ9, i, i2);
            iJ2 -= tu0.G(f3 * fk4.d().getDisplayMetrics().density) + (viewZ9.getMeasuredWidth() + (this.A0 != null ? tu0.G(fk4.d().getDisplayMetrics().density * f3) / 2 : tu0.G(fk4.d().getDisplayMetrics().density * f3)));
        }
        View viewZ10 = br7.z(je7Var3);
        if (viewZ10 != null) {
            viewZ10.measure(View.MeasureSpec.makeMeasureSpec(iJ2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        View viewZ11 = br7.z(je7Var2);
        if (viewZ11 != null) {
            measureChild(viewZ11, i, i2);
            iJ2 -= tu0.G(2 * fk4.d().getDisplayMetrics().density) + viewZ11.getMeasuredWidth();
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(iJ2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(size3, getPaddingBottom() + getPaddingTop() + tu0.G(f2 * fk4.d().getDisplayMetrics().density));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        pq9 pq9Var = qp4.u0;
        qp4 qp4VarB = pq9Var.b(getContext());
        fka currentTheme = getCurrentTheme();
        qp4VarB.getClass();
        qp4.c(this, currentTheme);
        k();
        je7 je7Var = this.v0;
        if (je7Var.a()) {
            fmd fmdVar = (fmd) je7Var.getValue();
            CharSequence text = fmdVar.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            Object[] spans = spanned != null ? spanned.getSpans(0, fmdVar.getText().length(), kre.class) : null;
            if (spans == null) {
                spans = new kre[0];
            }
            for (Object obj : spans) {
                kre kreVar = (kre) obj;
                kreVar.onThemeChanged(getCurrentTheme());
                qqe.b(fmdVar, kreVar);
            }
        }
        je7 je7Var2 = this.x0;
        if (je7Var2.a()) {
            ImageView imageView = (ImageView) je7Var2.getValue();
            imageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(imageView).getIcon().f));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate;
        View view;
        TouchDelegate touchDelegate2;
        View view2;
        TouchDelegate touchDelegate3;
        OneMeButton oneMeButton;
        if (motionEvent == null || this.F0) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            if (this.D0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                k56 k56Var = this.G0;
                if (k56Var != null) {
                    k56Var.invoke();
                }
                performClick();
                return true;
            }
        }
        OneMeButton oneMeButton2 = this.A0;
        if (oneMeButton2 != null && (touchDelegate3 = oneMeButton2.getTouchDelegate()) != null && touchDelegate3.onTouchEvent(motionEvent)) {
            if (motionEvent.getAction() == 1 && (oneMeButton = this.A0) != null) {
                oneMeButton.performClick();
            }
            return true;
        }
        View view3 = this.C0;
        if (view3 != null && (touchDelegate2 = view3.getTouchDelegate()) != null && touchDelegate2.onTouchEvent(motionEvent)) {
            if (motionEvent.getAction() == 1 && (view2 = this.C0) != null) {
                view2.performClick();
            }
            return true;
        }
        View view4 = this.B0;
        if (view4 != null && (touchDelegate = view4.getTouchDelegate()) != null && touchDelegate.onTouchEvent(motionEvent) && motionEvent.getAction() == 1 && (view = this.B0) != null) {
            view.performClick();
        }
        return true;
    }

    public final void setActionsHorizontalPadding(kpa kpaVar) {
        this.s0.o1(this, H0[4], kpaVar);
    }

    public final void setAvatar(tka tkaVar) {
        if (getForm() == uka.b) {
            throw new IllegalStateException("setAvatar can't be applied for Form.Main");
        }
        je7 je7Var = this.w0;
        int i = 8;
        if (tkaVar != null) {
            s5a s5aVar = (s5a) je7Var.getValue();
            s5aVar.g(oag.a(tkaVar.b, Long.valueOf(tkaVar.c)), true);
            s5aVar.setAvatarUrl(tkaVar.a);
            s5a.j(s5aVar, tkaVar.d, null, 30);
            s5aVar.setCustomOverlay(tkaVar.e);
            if (!g() && !this.F0) {
                i = 0;
            }
            s5aVar.setVisibility(i);
        } else if (je7Var.a()) {
            ((s5a) je7Var.getValue()).setVisibility(8);
        }
        if (g()) {
            return;
        }
        requestLayout();
    }

    public final void setAvatarAlpha(float f) {
        je7 je7Var = this.w0;
        if (je7Var.a()) {
            ((s5a) je7Var.getValue()).setAlpha(f);
        }
    }

    public final void setCustomTheme(fka fkaVar) {
        this.a.o1(this, H0[0], fkaVar);
    }

    public final void setDropdownRotationProgress(float f) {
        je7 je7Var = this.x0;
        if (je7Var.a()) {
            ((ImageView) je7Var.getValue()).setRotation(ote.d(f, 0.0f, 1.0f) * 180.0f);
        }
    }

    public final void setForm(uka ukaVar) {
        this.b.o1(this, H0[1], ukaVar);
    }

    public final void setLeftActions(qka qkaVar) {
        this.o.o1(this, H0[3], qkaVar);
    }

    public final void setRightActions(ska skaVar) {
        this.c.o1(this, H0[2], skaVar);
    }

    public final void setShowDropdown(boolean z) {
        ((View) this.x0.getValue()).setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public final void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public final void setTextShimmerEnabled(boolean z) {
        this.t0.o1(this, H0[5], Boolean.valueOf(z));
    }

    public final void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public final void setTitleAlpha(float f) {
        this.u0.setAlpha(f);
    }

    public final void setTitleClickListener(k56 k56Var) {
        this.G0 = k56Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.E0 = charSequence != null;
        je7 je7Var = this.v0;
        if (charSequence != null) {
            ((fmd) je7Var.getValue()).setText(charSequence);
            ((View) je7Var.getValue()).setVisibility((g() || this.F0) ? 8 : 0);
        } else if (je7Var.a()) {
            ((fmd) je7Var.getValue()).setVisibility(8);
        }
        if (g()) {
            return;
        }
        requestLayout();
    }

    public final void setTitle(CharSequence charSequence) {
        this.u0.setText(charSequence);
    }
}
