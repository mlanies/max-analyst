package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class gi5 extends ppe {
    public static final /* synthetic */ bc7[] W0;
    public int A0;
    public final je7 B0;
    public boolean C0;
    public boolean D0;
    public o50 E0;
    public x77 F0;
    public final yj G0;
    public final Rect H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final ShapeDrawable L0;
    public final je7 M0;
    public final je7 N0;
    public final je7 O0;
    public final je7 P0;
    public final je7 Q0;
    public final OneMeDraweeView R0;
    public final TextView S0;
    public Layout T0;
    public final int U0;
    public final int V0;

    static {
        oi9 oi9Var = new oi9(gi5.class, "model", "getModel()Lone/me/messages/list/loader/model/FileAttachModel;");
        nec.a.getClass();
        W0 = new bc7[]{oi9Var};
    }

    public gi5(final Context context) {
        super(context);
        pq9 pq9Var = qp4.u0;
        int i = pq9Var.j(this).a().d(true).a.i;
        this.A0 = pq9Var.j(this).a().d(true).b.f;
        this.B0 = tu0.r(3, new hy4(context, 5));
        this.G0 = new yj(9, this);
        this.H0 = new Rect();
        final int i2 = 0;
        this.I0 = tu0.r(3, new k56(this) { // from class: di5
            public final /* synthetic */ gi5 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return kt3.b(this.b.getContext(), woc.u0);
                    case 1:
                        return kt3.b(this.b.getContext(), woc.J1);
                    default:
                        return gi5.w(this.b);
                }
            }
        });
        final int i3 = 1;
        this.J0 = tu0.r(3, new k56(this) { // from class: di5
            public final /* synthetic */ gi5 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return kt3.b(this.b.getContext(), woc.u0);
                    case 1:
                        return kt3.b(this.b.getContext(), woc.J1);
                    default:
                        return gi5.w(this.b);
                }
            }
        });
        final int i4 = 2;
        this.K0 = tu0.r(3, new k56(this) { // from class: di5
            public final /* synthetic */ gi5 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return kt3.b(this.b.getContext(), woc.u0);
                    case 1:
                        return kt3.b(this.b.getContext(), woc.J1);
                    default:
                        return gi5.w(this.b);
                }
            }
        });
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(getPreviewActionIconBackgroundColor());
        this.L0 = shapeDrawable;
        final int i5 = 0;
        this.M0 = tu0.r(3, new k56() { // from class: ei5
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        ch5 ch5Var = new ch5(context);
                        this.addView(ch5Var);
                        return ch5Var;
                    case 1:
                        ImageView imageView = new ImageView(context);
                        float f = 44;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        gi5 gi5Var = this;
                        imageView.setBackground(gi5Var.L0);
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        imageView.setTranslationZ(Float.MAX_VALUE);
                        gi5Var.addView(imageView);
                        return imageView;
                    case 2:
                        bu6 bu6Var = new bu6(context);
                        this.addView(bu6Var);
                        return bu6Var;
                    default:
                        mdf mdfVar = new mdf(context);
                        mdfVar.setBackgroundEnabled(true);
                        this.addView(mdfVar);
                        return mdfVar;
                }
            }
        });
        final int i6 = 1;
        this.N0 = tu0.r(3, new k56() { // from class: ei5
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        ch5 ch5Var = new ch5(context);
                        this.addView(ch5Var);
                        return ch5Var;
                    case 1:
                        ImageView imageView = new ImageView(context);
                        float f = 44;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        gi5 gi5Var = this;
                        imageView.setBackground(gi5Var.L0);
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        imageView.setTranslationZ(Float.MAX_VALUE);
                        gi5Var.addView(imageView);
                        return imageView;
                    case 2:
                        bu6 bu6Var = new bu6(context);
                        this.addView(bu6Var);
                        return bu6Var;
                    default:
                        mdf mdfVar = new mdf(context);
                        mdfVar.setBackgroundEnabled(true);
                        this.addView(mdfVar);
                        return mdfVar;
                }
            }
        });
        final int i7 = 2;
        this.O0 = tu0.r(3, new k56() { // from class: ei5
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        ch5 ch5Var = new ch5(context);
                        this.addView(ch5Var);
                        return ch5Var;
                    case 1:
                        ImageView imageView = new ImageView(context);
                        float f = 44;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        gi5 gi5Var = this;
                        imageView.setBackground(gi5Var.L0);
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        imageView.setTranslationZ(Float.MAX_VALUE);
                        gi5Var.addView(imageView);
                        return imageView;
                    case 2:
                        bu6 bu6Var = new bu6(context);
                        this.addView(bu6Var);
                        return bu6Var;
                    default:
                        mdf mdfVar = new mdf(context);
                        mdfVar.setBackgroundEnabled(true);
                        this.addView(mdfVar);
                        return mdfVar;
                }
            }
        });
        final int i8 = 3;
        this.P0 = tu0.r(3, new k56() { // from class: ei5
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        ch5 ch5Var = new ch5(context);
                        this.addView(ch5Var);
                        return ch5Var;
                    case 1:
                        ImageView imageView = new ImageView(context);
                        float f = 44;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        gi5 gi5Var = this;
                        imageView.setBackground(gi5Var.L0);
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        imageView.setTranslationZ(Float.MAX_VALUE);
                        gi5Var.addView(imageView);
                        return imageView;
                    case 2:
                        bu6 bu6Var = new bu6(context);
                        this.addView(bu6Var);
                        return bu6Var;
                    default:
                        mdf mdfVar = new mdf(context);
                        mdfVar.setBackgroundEnabled(true);
                        this.addView(mdfVar);
                        return mdfVar;
                }
            }
        });
        this.Q0 = tu0.r(3, new fh5(3));
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        this.R0 = oneMeDraweeView;
        TextView textView = new TextView(context);
        os2.f.b(textView, du4.b);
        textView.setMaxLines(1);
        this.S0 = textView;
        this.U0 = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        this.V0 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(oneMeDraweeView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        qx7 qx7Var = vs8.y;
        fka fkaVarJ = pq9Var.j(this);
        qx7Var.getClass();
        setBackground(qx7.e(fkaVarJ));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    private final ch5 getActionIconView() {
        return (ch5) this.M0.getValue();
    }

    private final ImageView getBigPreviewActionIcon() {
        return (ImageView) this.N0.getValue();
    }

    private final up0 getBlurPostProcessor() {
        return (up0) this.B0.getValue();
    }

    private final ix3 getCornersOutlineProvider() {
        return (ix3) this.Q0.getValue();
    }

    private final zf5 getModel() {
        bc7 bc7Var = W0[0];
        return (zf5) this.G0.b;
    }

    private final int getPreviewActionIconBackgroundColor() {
        qp4.u0.j(this).a().s().b.getClass();
        return 1543503872;
    }

    private final int getPreviewActionIconColor() {
        qp4.u0.j(this).a().s().c.getClass();
        return -1;
    }

    private final void setModel(zf5 zf5Var) {
        this.G0.o1(this, W0[0], zf5Var);
    }

    private final void setPreview(zf5 zf5Var) {
        yt6 yt6Var = zf5Var.k;
        wcf wcfVar = zf5Var.l;
        if ((yt6Var == null && wcfVar == null) || zf5Var.m) {
            return;
        }
        if (yt6Var == null) {
            yt6Var = wcfVar != null ? new yt6(0L, wcfVar.b, wcfVar.c, wcfVar.d, false, wcfVar.e, false, wcfVar.h, null, null, null, 3840) : null;
        }
        je7 je7Var = this.P0;
        ((View) je7Var.getValue()).setVisibility(zf5Var.j == 2 ? 0 : 8);
        if (br7.H(je7Var)) {
            mdf mdfVar = (mdf) je7Var.getValue();
            if (wcfVar != null) {
                long jE = ft4.e(wcfVar.f);
                String[] strArr = are.b;
                mdfVar.setContent(tfg.c(jE));
            }
        }
        if (yt6Var != null) {
            bu6 bu6Var = (bu6) this.O0.getValue();
            bu6Var.setVisibility(0);
            bu6Var.setImageAttach(yt6Var);
            OneMeDraweeView oneMeDraweeView = this.R0;
            xv6 xv6VarD = xv6.d(yt6Var.b);
            xv6VarD.d = yt6Var.i;
            xv6VarD.l = getBlurPostProcessor();
            oneMeDraweeView.o(xv6VarD.a(), null);
            ((la6) oneMeDraweeView.getHierarchy()).h(yt6Var.j);
        }
    }

    private final void setSubtitle(jqe jqeVar) {
        if (jqeVar == null) {
            return;
        }
        this.S0.setText(jqeVar.b(getContext()));
    }

    public static Drawable w(gi5 gi5Var) {
        int i = woc.m0;
        int previewActionIconColor = gi5Var.getPreviewActionIconColor();
        Drawable drawableB = kt3.b(gi5Var.getContext(), i);
        ngg.G(drawableB, previewActionIconColor);
        return drawableB;
    }

    public static final void x(gi5 gi5Var, boolean z) {
        zf5 model = gi5Var.getModel();
        if (model == null) {
            return;
        }
        gi5Var.T0 = model.e;
        gi5Var.setSubtitle(model.g);
        gi5Var.setPreview(model);
        boolean z2 = !z;
        gi5Var.getMessageTextView$message_list_release().setVisibility(model.m ? 0 : 8);
        boolean z3 = gi5Var.D0;
        je7 je7Var = gi5Var.N0;
        j0e j0eVar = model.n;
        yf5 yf5Var = model.i;
        if (z3) {
            je7 je7Var2 = gi5Var.M0;
            if (je7Var2.a()) {
                ((ch5) je7Var2.getValue()).setVisibility(8);
            }
            gi5Var.getBigPreviewActionIcon().setVisibility(0);
            if (yf5Var instanceof xf5) {
                gi5Var.C(je7Var);
                return;
            }
            if (yf5Var instanceof vf5) {
                gi5Var.A(je7Var);
                return;
            } else {
                if (j0eVar.getValue() == null && (yf5Var instanceof wf5)) {
                    gi5Var.B(je7Var, ((wf5) yf5Var).a);
                    return;
                }
                return;
            }
        }
        if (je7Var.a()) {
            ((ImageView) je7Var.getValue()).setVisibility(8);
        }
        je7 je7Var3 = gi5Var.O0;
        if (je7Var3.a()) {
            ((bu6) je7Var3.getValue()).setVisibility(8);
        }
        gi5Var.R0.setVisibility(8);
        gi5Var.getActionIconView().setVisibility(0);
        boolean z4 = yf5Var instanceof xf5;
        uf5 uf5Var = model.f;
        if (z4) {
            gi5Var.getActionIconView().d(uf5Var, z2);
            return;
        }
        if (yf5Var instanceof vf5) {
            gi5Var.getActionIconView().b(uf5Var, z2);
            return;
        }
        if (j0eVar.getValue() == null && (yf5Var instanceof wf5)) {
            gi5Var.getActionIconView().c(uf5Var, ((wf5) yf5Var).a, z2);
            return;
        }
        ch5 actionIconView = gi5Var.getActionIconView();
        ph5 ph5Var = actionIconView.o;
        ph5Var.a(uf5Var);
        uf5 uf5Var2 = ph5Var.c;
        if (uf5Var2 == null) {
            return;
        }
        int iC = qp4.u0.j(actionIconView).a().c(uf5Var2.b().o);
        actionIconView.c.c(iC, iC);
    }

    public final void A(je7 je7Var) {
        if (je7Var.a()) {
            ImageView imageView = (ImageView) je7Var.getValue();
            zf5 model = getModel();
            if ((model != null ? model.j : 0) == 2) {
                Drawable drawable = (Drawable) this.J0.getValue();
                ngg.G(drawable, getPreviewActionIconColor());
                imageView.setImageDrawable(drawable);
                imageView.setBackground(this.L0);
            }
            zf5 model2 = getModel();
            imageView.setVisibility((model2 != null ? model2.j : 0) != 2 ? 8 : 0);
        }
    }

    public final void B(je7 je7Var, float f) {
        Drawable drawable = (Drawable) this.K0.getValue();
        int previewActionIconColor = getPreviewActionIconColor();
        ImageView imageView = (ImageView) je7Var.getValue();
        if (!(imageView.getDrawable() instanceof a10)) {
            a10 a10Var = new a10();
            a10Var.a = drawable;
            a10Var.invalidateSelf();
            a10Var.p.setColor(previewActionIconColor);
            a10Var.invalidateSelf();
            a10Var.e = true;
            a10Var.invalidateSelf();
            imageView.setImageDrawable(a10Var);
            imageView.setAdjustViewBounds(false);
        }
        imageView.getDrawable().setLevel((int) (f * 100));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public final void C(je7 je7Var) {
        ImageView imageView = (ImageView) je7Var.getValue();
        imageView.setAdjustViewBounds(false);
        Drawable drawable = (Drawable) this.I0.getValue();
        ngg.G(drawable, getPreviewActionIconColor());
        imageView.setImageDrawable(drawable);
        imageView.setBackground(this.L0);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
    }

    public final void D(zf5 zf5Var) {
        setModel(zf5Var);
    }

    public final void E(b00 b00Var) {
        zf5 model;
        uf5 uf5Var;
        if (b00Var == null || (model = getModel()) == null || b00Var.a() != model.b) {
            return;
        }
        setSubtitle(b00Var.b());
        boolean z = this.D0;
        je7 je7Var = this.N0;
        if (z) {
            je7 je7Var2 = this.M0;
            if (je7Var2.a()) {
                ((ch5) je7Var2.getValue()).setVisibility(8);
            }
            getBigPreviewActionIcon().setVisibility(0);
            if (b00Var instanceof xz) {
                B(je7Var, ((xz) b00Var).b);
                return;
            }
            if (b00Var instanceof a00) {
                B(je7Var, ((a00) b00Var).b);
                return;
            } else if (b00Var instanceof yz) {
                C(je7Var);
                return;
            } else {
                if (!(b00Var instanceof zz)) {
                    throw new NoWhenBranchMatchedException();
                }
                A(je7Var);
                return;
            }
        }
        if (je7Var.a()) {
            ((ImageView) je7Var.getValue()).setVisibility(8);
        }
        je7 je7Var3 = this.O0;
        if (je7Var3.a()) {
            ((bu6) je7Var3.getValue()).setVisibility(8);
        }
        this.R0.setVisibility(8);
        getActionIconView().setVisibility(0);
        zf5 model2 = getModel();
        if (model2 == null || (uf5Var = model2.f) == null) {
            uf5Var = tf5.c;
        }
        if (b00Var instanceof xz) {
            getActionIconView().c(uf5Var, ((xz) b00Var).b, true);
            return;
        }
        if (b00Var instanceof a00) {
            getActionIconView().c(uf5Var, ((a00) b00Var).b, true);
        } else if (b00Var instanceof yz) {
            getActionIconView().d(uf5Var, true);
        } else {
            if (!(b00Var instanceof zz)) {
                throw new NoWhenBranchMatchedException();
            }
            getActionIconView().b(uf5Var, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int contentHorizontalPadding$message_list_release;
        super.dispatchDraw(canvas);
        Layout layout = this.T0;
        if (layout != null) {
            View viewZ = br7.z(this.M0);
            if (viewZ != null) {
                contentHorizontalPadding$message_list_release = getContentHorizontalPadding$message_list_release() + viewZ.getMeasuredWidth();
            } else {
                contentHorizontalPadding$message_list_release = 0;
            }
            int i = this.U0 + contentHorizontalPadding$message_list_release;
            float top = this.S0.getTop() - layout.getHeight();
            int iSave = canvas.save();
            canvas.translate(i, top);
            try {
                layout.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // defpackage.ppe, defpackage.k34
    public final void g(CharSequence charSequence, boolean z) {
        j34 date$message_list_release = getDate$message_list_release();
        bc7[] bc7VarArr = j34.D0;
        date$message_list_release.c(charSequence, false);
    }

    @Override // defpackage.ppe, defpackage.ot8
    public final boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.C0 && mpf.c(this.R0, this).contains(x, y)) {
            return true;
        }
        je7 je7Var = this.O0;
        if (br7.H(je7Var) && mpf.c((View) je7Var.getValue(), this).contains(x, y)) {
            return true;
        }
        return this.H0.contains(x, y);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x023f  */
    @Override // defpackage.ppe, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi5.onLayout(boolean, int, int, int, int):void");
    }

    @Override // defpackage.ppe, android.view.View
    public final void onMeasure(int i, int i2) {
        int iK;
        float f;
        int iIntValue;
        float f2 = 10;
        int iM = wg0.m(f2, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int iG = tu0.G(40 * fk4.d().getDisplayMetrics().density);
        int iG2 = tu0.G(44 * fk4.d().getDisplayMetrics().density);
        int iG3 = tu0.G(4 * fk4.d().getDisplayMetrics().density);
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : getSuggestedMinimumWidth() + getContentHorizontalPadding$message_list_release();
        if (br7.H((je7) getSenderAliasDelegate().c) && br7.H(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            size = Math.max(size, getSenderAliasDelegate().L());
        }
        boolean zH = br7.H(getSenderNameViewStub$message_list_release().b);
        int iG4 = this.U0;
        if (zH) {
            getSenderNameViewStub$message_list_release().d(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            int iH0 = getSenderAliasDelegate().h0();
            iK = getSenderBottomMargin$message_list_release() + getSenderNameViewStub$message_list_release().a() + iG4;
            size = Math.max(size, (iG4 * 2) + getSenderNameViewStub$message_list_release().b() + iH0);
        } else {
            iK = iG4;
        }
        zf5 model = getModel();
        int i3 = this.V0;
        if (model != null && model.m) {
            dy8 messageTextView$message_list_release = getMessageTextView$message_list_release();
            messageTextView$message_list_release.h();
            size = Math.max(size, (iG4 * 2) + messageTextView$message_list_release.getMeasuredWidth());
            iK += messageTextView$message_list_release.getMeasuredHeight() + i3;
        }
        je7 je7Var = this.O0;
        boolean zH2 = br7.H(je7Var);
        OneMeDraweeView oneMeDraweeView = this.R0;
        if (zH2) {
            bu6 bu6Var = (bu6) je7Var.getValue();
            int i4 = iG4 * 2;
            f = f2;
            bu6Var.measure(View.MeasureSpec.makeMeasureSpec(iM - i4, 1073741824), i2);
            iK += bu6Var.getMeasuredLayoutHeight() + i3;
            size = Math.max(size, bu6Var.getMeasuredLayoutWidth() + i4);
            boolean z = (bu6Var.getMeasuredLayoutWidth() == bu6Var.getMeasuredWidth() && bu6Var.getMeasuredLayoutHeight() == bu6Var.getMeasuredHeight()) ? false : true;
            this.C0 = z;
            oneMeDraweeView.setVisibility(z ? 0 : 8);
        } else {
            f = f2;
        }
        if (this.C0) {
            oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(iM - (iG4 * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(((bu6) je7Var.getValue()).getMeasuredLayoutHeight(), 1073741824));
        }
        je7 je7Var2 = this.N0;
        if (je7Var2.a()) {
            ((ImageView) je7Var2.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iG2, 1073741824), View.MeasureSpec.makeMeasureSpec(iG2, 1073741824));
        }
        boolean zH3 = br7.H(je7Var);
        je7 je7Var3 = this.M0;
        if (zH3) {
            iIntValue = Math.min(iM, ((bu6) je7Var.getValue()).getMeasuredWidth());
        } else {
            Integer numValueOf = Integer.valueOf(getContentHorizontalPadding$message_list_release() + iG);
            if (!br7.H(je7Var3)) {
                numValueOf = 0;
            }
            iIntValue = (iM - numValueOf.intValue()) - (iG4 * 2);
        }
        if (br7.H((je7) getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            size = Math.max(size, (iG4 * 2) + getMessageLinkDelegate().L());
            iK += getMessageLinkDelegate().K() + iG3;
        }
        getDate$message_list_release().measure(i, i2);
        je7 je7Var4 = this.P0;
        if (je7Var4.a()) {
            ((mdf) je7Var4.getValue()).measure(i, i2);
        }
        if (je7Var3.a()) {
            ((ch5) je7Var3.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iG, 1073741824), View.MeasureSpec.makeMeasureSpec(iG, 1073741824));
        }
        TextView textView = this.S0;
        textView.measure(View.MeasureSpec.makeMeasureSpec(iIntValue, Integer.MIN_VALUE), i2);
        int iMax = Math.max(nu0.q(this.T0), textView.getMeasuredWidth());
        if (!br7.H(je7Var)) {
            size = Math.max(size, getContentHorizontalPadding$message_list_release() + (iG4 * 2) + iMax + iG);
        }
        int contentHorizontalPadding$message_list_release = (size - iG4) - getContentHorizontalPadding$message_list_release();
        Integer numValueOf2 = Integer.valueOf(iG);
        Integer numValueOf3 = Integer.valueOf(textView.getMeasuredHeight() + nu0.p(this.T0));
        if (!br7.H(je7Var3)) {
            numValueOf2 = numValueOf3;
        }
        this.H0.set(iG4, iK, contentHorizontalPadding$message_list_release, numValueOf2.intValue() + iK);
        int measuredHeight = textView.getMeasuredHeight() + nu0.p(this.T0);
        Integer numValueOf4 = Integer.valueOf(iG);
        Integer numValueOf5 = Integer.valueOf(measuredHeight);
        if (!br7.H(je7Var3)) {
            numValueOf4 = numValueOf5;
        }
        int iMax2 = Math.max(numValueOf4.intValue(), measuredHeight) + iK;
        if (br7.H((je7) getReactionsDelegate().c)) {
            getReactionsDelegate().U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            iMax2 = wg0.d(f, fk4.d().getDisplayMetrics().density, getReactionsDelegate().K(), iMax2);
            size = Math.max(size, (iG4 * 2) + getReactionsDelegate().L());
        }
        if (br7.H((je7) getReactionsDelegate().c)) {
            if (size - (getReactionsDelegate().L() + (iG4 * 2)) < getDate$message_list_release().getMeasuredWidth()) {
                iMax2 += rh4.c(6, fk4.d().getDisplayMetrics().density, getDate$message_list_release().getMeasuredHeight()) - tu0.G(8 * fk4.d().getDisplayMetrics().density);
            }
        }
        int iQ = nu0.q(this.T0) - textView.getMeasuredWidth();
        if (!br7.H((je7) getReactionsDelegate().c) && iQ < getDate$message_list_release().getMeasuredWidth()) {
            size += (tu0.G(8 * fk4.d().getDisplayMetrics().density) + getDate$message_list_release().getMeasuredWidth()) - iQ;
        }
        if (br7.H((je7) getReactionsDelegate().c)) {
            iG4 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        }
        setMeasuredDimension(size, iMax2 + iG4);
    }

    @Override // defpackage.ppe, defpackage.k34
    public void setDateBackgroundColor(int i) {
    }

    @Override // defpackage.ppe, defpackage.k34
    public void setDateTextColor(int i) {
        getDate$message_list_release().setTextColor$message_list_release(i);
    }

    @Override // defpackage.ppe, defpackage.k34
    public void setDateViewStatus(zof zofVar) {
        getDate$message_list_release().setStatus$message_list_release(zofVar);
    }

    public final void setFileInfo(zf5 zf5Var) {
        o50 o50Var;
        setModel(zf5Var);
        this.E0 = new o50(this, 2, zf5Var);
        if (isAttachedToWindow() && (o50Var = this.E0) != null) {
            o50Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.E0);
    }

    @Override // defpackage.ppe, defpackage.x5d
    public void setSenderName(Layout layout) {
        getSenderNameViewStub$message_list_release().e(layout);
    }

    @Override // defpackage.ppe, defpackage.x5d
    public void setSenderNameColor(int i) {
        getSenderNameViewStub$message_list_release().f(i);
    }

    public final void y(is0 is0Var) {
        TextPaint paint;
        int i = is0Var.a.i;
        this.A0 = is0Var.b.f;
        je7 je7Var = this.I0;
        boolean zA = je7Var.a();
        pq9 pq9Var = qp4.u0;
        if (zA) {
            Drawable drawable = (Drawable) je7Var.getValue();
            pq9Var.j(this).a().s().c.getClass();
            ngg.G(drawable, -1);
        }
        je7 je7Var2 = this.K0;
        if (je7Var2.a()) {
            Drawable drawable2 = (Drawable) je7Var2.getValue();
            pq9Var.j(this).a().s().c.getClass();
            ngg.G(drawable2, -1);
        }
        Layout layout = this.T0;
        ls0 ls0Var = is0Var.d;
        if (layout != null && (paint = layout.getPaint()) != null) {
            paint.setColor(ls0Var.e);
        }
        this.S0.setTextColor(ls0Var.f);
        je7 je7Var3 = this.M0;
        if (je7Var3.a()) {
            ch5 ch5Var = (ch5) je7Var3.getValue();
            ch5Var.a = is0Var;
            fka fkaVarJ = pq9Var.j(ch5Var);
            ph5 ph5Var = ch5Var.o;
            ph5Var.onThemeChanged(fkaVarJ);
            uf5 uf5Var = ph5Var.c;
            if (uf5Var != null) {
                int iC = pq9Var.j(ch5Var).a().c(uf5Var.b().o);
                ch5Var.c.c(iC, iC);
            }
        }
        je7 je7Var4 = this.N0;
        boolean zA2 = je7Var4.a();
        ShapeDrawable shapeDrawable = this.L0;
        if (zA2) {
            ImageView imageView = (ImageView) je7Var4.getValue();
            if (imageView.getDrawable() instanceof a10) {
                Drawable drawable3 = imageView.getDrawable();
                a10 a10Var = drawable3 instanceof a10 ? (a10) drawable3 : null;
                if (a10Var != null) {
                    a10Var.p.setColor(this.A0);
                    a10Var.invalidateSelf();
                }
            } else {
                imageView.setBackground(shapeDrawable);
                imageView.setImageTintList(ColorStateList.valueOf(getPreviewActionIconColor()));
            }
        }
        shapeDrawable.getPaint().setColor(getPreviewActionIconBackgroundColor());
        getDate$message_list_release().setTextColor$message_list_release(ls0Var.m);
        invalidate();
    }

    public final void z() {
        removeOnAttachStateChangeListener(this.E0);
        x77 x77Var = this.F0;
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        this.F0 = null;
        setModel(null);
    }
}
