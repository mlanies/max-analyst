package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class dif extends ViewGroup implements k34, l7c, jw8, aoa, cmf, bmf, mhf {
    public static final /* synthetic */ bc7[] L0;
    public final xhf A0;
    public final je7 B0;
    public final je7 C0;
    public final int D0;
    public final int E0;
    public final yj F0;
    public o50 G0;
    public vxd H0;
    public vxd I0;
    public ValueAnimator J0;
    public int K0;
    public final m56 a;
    public final r6c b;
    public final dw8 c;
    public final boa o;
    public final zef s0;
    public final ShapeDrawable t0;
    public final jjf u0;
    public final bu6 v0;
    public final mdf w0;
    public final j34 x0;
    public final je7 y0;
    public final Rect z0;

    static {
        oi9 oi9Var = new oi9(dif.class, "model", "getModel()Lone/me/messages/list/loader/model/VideoMessageAttach;");
        nec.a.getClass();
        L0 = new bc7[]{oi9Var};
    }

    public dif(Context context, om8 om8Var) {
        r6c r6cVar = new r6c();
        dw8 dw8Var = new dw8();
        boa boaVar = new boa();
        zef zefVar = new zef();
        super(context);
        this.a = om8Var;
        this.b = r6cVar;
        this.c = dw8Var;
        this.o = boaVar;
        this.s0 = zefVar;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(getBorderColor());
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(fk4.d().getDisplayMetrics().density * 1.0f);
        shapeDrawable.setCallback(this);
        this.t0 = shapeDrawable;
        this.u0 = new jjf();
        bu6 bu6Var = new bu6(context);
        la6 la6Var = (la6) bu6Var.getHierarchy();
        wnc wncVar = new wnc();
        wncVar.b = true;
        la6Var.n(wncVar);
        tu0.K(bu6Var, 300L, new elb(14, this));
        bu6Var.setOnLongClickListener(new zl0(12, this));
        this.v0 = bu6Var;
        mdf mdfVar = new mdf(context);
        mdfVar.setBackgroundEnabled(true);
        mdfVar.setDrawableEnabled(false);
        mdfVar.setCapsuleInside(false);
        this.w0 = mdfVar;
        j34 j34Var = new j34(context);
        j34Var.setBackgroundEnabled$message_list_release(true);
        j34Var.setBackgroundColor(getColorBubbleOutside());
        this.x0 = j34Var;
        final int i = 0;
        this.y0 = tu0.r(3, new k56(this) { // from class: whf
            public final /* synthetic */ dif b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i2 = i;
                dif difVar = this.b;
                switch (i2) {
                    case 0:
                        return dif.d(difVar);
                    default:
                        return dif.a(difVar);
                }
            }
        });
        this.z0 = new Rect();
        xhf xhfVar = new xhf();
        xhfVar.b(getIconBackgroundColor(), Integer.valueOf(tu0.G(24 * fk4.d().getDisplayMetrics().density)));
        Drawable drawableB = kt3.b(getContext(), woc.P0);
        int iG = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        int iconColor = getIconColor();
        xhfVar.addLayer(drawableB);
        drawableB.setTint(iconColor);
        xhfVar.setLayerSize(1, iG, iG);
        xhfVar.setLayerGravity(1, 17);
        this.A0 = xhfVar;
        final int i2 = 1;
        this.B0 = tu0.r(3, new k56(this) { // from class: whf
            public final /* synthetic */ dif b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i22 = i2;
                dif difVar = this.b;
                switch (i22) {
                    case 0:
                        return dif.d(difVar);
                    default:
                        return dif.a(difVar);
                }
            }
        });
        this.C0 = tu0.r(3, new khf(context, this));
        float f = 4;
        this.D0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.E0 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        this.F0 = new yj(28, this);
        r6cVar.b = this;
        dw8Var.b = this;
        zefVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(bu6Var, new ViewGroup.LayoutParams(-1, -1));
        addView(j34Var, new ViewGroup.LayoutParams(-2, -2));
        addView(mdfVar, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setWillNotDraw(false);
        setTransitionGroup(true);
        this.K0 = tu0.G(228 * fk4.d().getDisplayMetrics().density);
    }

    public static xhf a(dif difVar) {
        xhf xhfVar = new xhf();
        xhfVar.b(difVar.getIconBackgroundColor(), Integer.valueOf(tu0.G(52 * fk4.d().getDisplayMetrics().density)));
        a10 a10Var = new a10();
        a10Var.a = kt3.b(difVar.getContext(), woc.m0);
        a10Var.invalidateSelf();
        a10Var.p.setColor(difVar.getIconColor());
        a10Var.invalidateSelf();
        a10Var.e = true;
        a10Var.invalidateSelf();
        int iG = tu0.G(44 * fk4.d().getDisplayMetrics().density);
        int iconColor = difVar.getIconColor();
        xhfVar.addLayer(a10Var);
        a10Var.setTint(iconColor);
        xhfVar.setLayerSize(1, iG, iG);
        xhfVar.setLayerGravity(1, 17);
        return xhfVar;
    }

    public static void b(dif difVar) {
        wgf model = difVar.getModel();
        if (model != null) {
            difVar.a.invoke(new k19(model.a, model));
        }
    }

    public static xhf d(dif difVar) {
        xhf xhfVar = new xhf();
        xhfVar.b(difVar.getIconBackgroundColor(), Integer.valueOf(tu0.G(52 * fk4.d().getDisplayMetrics().density)));
        Drawable drawableB = kt3.b(difVar.getContext(), woc.u0);
        int iG = tu0.G(24 * fk4.d().getDisplayMetrics().density);
        int iconColor = difVar.getIconColor();
        xhfVar.addLayer(drawableB);
        drawableB.setTint(iconColor);
        xhfVar.setLayerSize(1, iG, iG);
        xhfVar.setLayerGravity(1, 17);
        return xhfVar;
    }

    public static final void e(dif difVar) {
        wgf model = difVar.getModel();
        if (model != null) {
            difVar.a.invoke(new l19(model.a, model));
        }
    }

    private final int getBorderColor() {
        return qp4.u0.j(this).a().k().a.h;
    }

    private final boolean getCanDrawMuteIcon() {
        return getMeasuredWidth() == tu0.G(((float) 228) * fk4.d().getDisplayMetrics().density) && this.v0.getOverlayDrawable() == null;
    }

    private final int getColorBubbleOutside() {
        return qp4.u0.j(this).a().s().b.g;
    }

    private final ohf getDurationSlider() {
        return (ohf) this.C0.getValue();
    }

    private final int getIconBackgroundColor() {
        qp4.u0.j(this).a().s().b.getClass();
        return 1543503872;
    }

    private final int getIconColor() {
        qp4.u0.j(this).a().s().c.getClass();
        return -1;
    }

    private final wgf getModel() {
        bc7 bc7Var = L0[0];
        return (wgf) this.F0.b;
    }

    private final xhf getNeedDownloadDrawable() {
        return (xhf) this.y0.getValue();
    }

    private final xhf getProgressDownloadDrawable() {
        return (xhf) this.B0.getValue();
    }

    public static final void h(dif difVar) {
        wgf model = difVar.getModel();
        if (model == null) {
            return;
        }
        wcf wcfVar = model.c;
        difVar.v0.setImageAttach(new yt6(0L, wcfVar.b, wcfVar.c, wcfVar.d, false, wcfVar.e, false, wcfVar.h, wcfVar.i, null, null, 3584));
        long jE = ft4.e(wcfVar.f);
        String[] strArr = are.b;
        difVar.w0.setContent(tfg.c(jE));
        difVar.y(model.e);
        difVar.requestLayout();
        difVar.invalidate();
    }

    public static final void i(dif difVar, ijf ijfVar) {
        wgf model = difVar.getModel();
        if (tpa.f(model != null ? Long.valueOf(model.a) : null, ijfVar != null ? Long.valueOf(ijfVar.a) : null)) {
            zef zefVar = difVar.s0;
            View viewR = zefVar.R();
            if (viewR != null) {
                viewR.setForeground(null);
            }
            int i = ijfVar != null ? ijfVar.X : 0;
            int i2 = i == 0 ? -1 : yhf.$EnumSwitchMapping$0[au1.s(i)];
            if (i2 == 1) {
                difVar.s0.o(ijfVar, ijfVar.c, ijfVar.a, false, false);
                return;
            }
            bu6 bu6Var = difVar.v0;
            if (i2 == 2) {
                int maxAvailableWidth$message_list_release = ((zs8) difVar.getParent()).getMaxAvailableWidth$message_list_release();
                bu6Var.setOverlayDrawable(null);
                int iG = tu0.G(228 * fk4.d().getDisplayMetrics().density);
                if (iG == bu6Var.getMeasuredWidth()) {
                    ValueAnimator valueAnimator = difVar.J0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iG, maxAvailableWidth$message_list_release);
                    valueAnimatorOfInt.addUpdateListener(new yj0(9, difVar));
                    valueAnimatorOfInt.setDuration(300L);
                    valueAnimatorOfInt.addListener(new cif(difVar, 0));
                    valueAnimatorOfInt.start();
                    difVar.J0 = valueAnimatorOfInt;
                    return;
                }
                return;
            }
            if (i2 == 3) {
                ay7.b(difVar, difVar.getDurationSlider(), -1);
                difVar.getDurationSlider().setVisibility(0);
                ohf.k(difVar.getDurationSlider(), ijfVar.Y);
                return;
            }
            if (i2 != 5) {
                return;
            }
            je7 je7Var = difVar.C0;
            if (je7Var.a()) {
                ohf ohfVar = (ohf) je7Var.getValue();
                ohfVar.setVisibility(8);
                ohfVar.j();
            }
            zefVar.u();
            int i3 = difVar.K0;
            int iG2 = tu0.G(228 * fk4.d().getDisplayMetrics().density);
            if (i3 == bu6Var.getMeasuredWidth()) {
                ValueAnimator valueAnimator2 = difVar.J0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i3, iG2);
                valueAnimatorOfInt2.addUpdateListener(new yj0(9, difVar));
                valueAnimatorOfInt2.setDuration(300L);
                valueAnimatorOfInt2.addListener(new cif(difVar, 1));
                valueAnimatorOfInt2.start();
                difVar.J0 = valueAnimatorOfInt2;
            }
        }
    }

    private final void setModel(wgf wgfVar) {
        this.F0.o1(this, L0[0], wgfVar);
    }

    @Override // defpackage.jw8
    public final void c(is0 is0Var) {
        this.c.c(is0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.t0.draw(canvas);
        if (getCanDrawMuteIcon()) {
            Rect rect = this.z0;
            xhf xhfVar = this.A0;
            xhfVar.setBounds(rect);
            xhfVar.draw(canvas);
        }
    }

    @Override // defpackage.l7c
    public final void f(ix8 ix8Var, boolean z) {
        this.b.f(ix8Var, z);
    }

    @Override // defpackage.k34
    public final void g(CharSequence charSequence, boolean z) {
        this.x0.c(charSequence, z);
    }

    public boolean getDependOnOutsideView() {
        return this.o.a;
    }

    @Override // defpackage.cmf
    public View getPreviewView() {
        return this.v0;
    }

    @Override // defpackage.cmf
    public final boolean j() {
        return this.s0.j();
    }

    @Override // defpackage.l7c
    public final void k(is0 is0Var, boolean z) {
        this.b.k(is0Var, z);
    }

    @Override // defpackage.jw8
    public final void l() {
        this.c.l();
    }

    @Override // defpackage.cmf
    public final boolean m() {
        return br7.H((je7) this.s0.c);
    }

    public final void n(wgf wgfVar) {
        o50 o50Var;
        setModel(wgfVar);
        this.G0 = new o50(this, 14, wgfVar);
        if (isAttachedToWindow() && (o50Var = this.G0) != null) {
            o50Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.G0);
    }

    @Override // defpackage.cmf
    public final void o(tlf tlfVar, o00 o00Var, long j, boolean z, boolean z2) {
        this.s0.o(tlfVar, o00Var, j, z, true);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        jjf jjfVar = this.u0;
        jjfVar.getClass();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Region region = (Region) jjfVar.e;
        if (!region.isEmpty()) {
            Region region2 = (Region) jjfVar.d;
            if (!region2.isEmpty() && !region.contains(x, y) && region2.contains(x, y)) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = 4;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
        if (br7.H((je7) this.c.c)) {
            int iC = rh4.c(f, fk4.d().getDisplayMetrics().density, iG);
            this.c.T(0, iC);
            iG = wg0.d(f, fk4.d().getDisplayMetrics().density, this.c.K(), iC);
        }
        ote.E(this.v0, 0, iG, 0, 12);
        if (getCanDrawMuteIcon()) {
            int measuredWidth = ((this.v0.getMeasuredWidth() / 2) + this.v0.getLeft()) - (this.A0.getIntrinsicWidth() / 2);
            int iQ = rh4.q(12, fk4.d().getDisplayMetrics().density, this.v0.getBottom() - this.A0.getIntrinsicHeight());
            this.z0.set(measuredWidth, iQ, this.A0.getIntrinsicWidth() + measuredWidth, this.A0.getIntrinsicHeight() + iQ);
        }
        je7 je7Var = this.C0;
        if (je7Var.a()) {
            ote.E((ohf) je7Var.getValue(), 0, iG, 0, 12);
        }
        if (br7.H((je7) this.s0.c)) {
            this.s0.T(0, iG);
            View viewR = this.s0.R();
            if (viewR != null) {
                int x = (int) viewR.getX();
                int y = (int) viewR.getY();
                this.t0.setBounds(x, y, viewR.getMeasuredWidth() + x, viewR.getMeasuredHeight() + y);
                jjf jjfVar = this.u0;
                jjfVar.getClass();
                int measuredWidth2 = viewR.getMeasuredWidth();
                int measuredHeight = viewR.getMeasuredHeight();
                if (measuredWidth2 != jjfVar.a || measuredHeight != jjfVar.b) {
                    jjfVar.a = measuredWidth2;
                    jjfVar.b = measuredHeight;
                    if (viewR.getMeasuredWidth() != viewR.getMeasuredHeight()) {
                        String name = jjf.class.getName();
                        ir6 ir6Var = hm9.m;
                        if (ir6Var != null && ir6Var.c()) {
                            ir6Var.d(us7.Z, name, rh4.h("Cannot calculate a video msg clickable area: w=", viewR.getMeasuredWidth(), viewR.getMeasuredHeight(), ", h="), null);
                        }
                    } else {
                        float measuredWidth3 = viewR.getMeasuredWidth() / 2.0f;
                        ((Path) jjfVar.c).reset();
                        ((Path) jjfVar.c).addCircle(viewR.getLeft() + measuredWidth3, viewR.getTop() + measuredWidth3, measuredWidth3, Path.Direction.CW);
                        ((Region) jjfVar.d).set(viewR.getLeft(), viewR.getTop(), viewR.getRight(), viewR.getBottom());
                        ((Region) jjfVar.e).setPath((Path) jjfVar.c, (Region) jjfVar.d);
                    }
                }
            }
        } else {
            bu6 bu6Var = this.v0;
            int x2 = (int) bu6Var.getX();
            int y2 = (int) bu6Var.getY();
            this.t0.setBounds(x2, y2, bu6Var.getMeasuredWidth() + x2, bu6Var.getMeasuredHeight() + y2);
            jjf jjfVar2 = this.u0;
            ((Region) jjfVar2.e).setEmpty();
            ((Region) jjfVar2.d).setEmpty();
            jjfVar2.a = -1;
            jjfVar2.b = -1;
        }
        int iQ2 = br7.H((je7) this.b.c) ? rh4.q(10, fk4.d().getDisplayMetrics().density, rh4.q(8, fk4.d().getDisplayMetrics().density, getMeasuredHeight() - this.b.K())) : getMeasuredHeight();
        ote.E(this.x0, (getMeasuredWidth() - this.x0.getMeasuredWidth()) - this.E0, (iQ2 - this.x0.getMeasuredHeight()) - this.D0, 0, 12);
        ote.E(this.w0, 0, (iQ2 - this.w0.getMeasuredHeight()) - this.D0, 0, 12);
        if (br7.H((je7) this.b.c)) {
            int iC2 = rh4.c(10, fk4.d().getDisplayMetrics().density, iQ2);
            r6c r6cVar = this.b;
            r6cVar.T(r6cVar.Z ? getMeasuredWidth() - this.b.L() : 0, iC2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : wg0.m(10, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int iMax = getDependOnOutsideView() ? size : 0;
        float f = 4;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
        dw8 dw8Var = this.c;
        if (br7.H((je7) dw8Var.c)) {
            dw8Var.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, dw8Var.L());
            iG += (tu0.G(f * fk4.d().getDisplayMetrics().density) * 2) + dw8Var.K();
        }
        j34 j34Var = this.x0;
        j34Var.measure(i, i2);
        mdf mdfVar = this.w0;
        mdfVar.measure(i, i2);
        int iMax2 = Math.max(j34Var.getMeasuredHeight(), mdfVar.getMeasuredHeight()) + iG;
        int i3 = this.K0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        bu6 bu6Var = this.v0;
        bu6Var.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        je7 je7Var = this.C0;
        if (je7Var.a()) {
            ((ohf) je7Var.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
        int iMax3 = Math.max(iMax, Math.max(bu6Var.getMeasuredWidth(), mdfVar.getMeasuredWidth() + j34Var.getMeasuredWidth()));
        int measuredHeight = bu6Var.getMeasuredHeight() + iMax2;
        zef zefVar = this.s0;
        if (br7.H((je7) zefVar.c)) {
            zefVar.U(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
        r6c r6cVar = this.b;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            iMax3 = Math.max(iMax3, r6cVar.L());
            measuredHeight = wg0.d(8, fk4.d().getDisplayMetrics().density, r6cVar.K() + tu0.G(10 * fk4.d().getDisplayMetrics().density), measuredHeight);
        }
        setMeasuredDimension(iMax3, measuredHeight);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        this.s0.u();
        int i = this.K0;
        int iG = tu0.G(228 * fk4.d().getDisplayMetrics().density);
        if (i == this.v0.getMeasuredWidth()) {
            ValueAnimator valueAnimator = this.J0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, iG);
            valueAnimatorOfInt.addUpdateListener(new yj0(9, this));
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addListener(new zhf());
            valueAnimatorOfInt.start();
            this.J0 = valueAnimatorOfInt;
        }
        super.onStartTemporaryDetach();
    }

    public final void p(v83 v83Var) {
        Drawable foreground = this.v0.getForeground();
        xhf xhfVar = foreground instanceof xhf ? (xhf) foreground : null;
        m73 m73Var = v83Var.b;
        w83 w83Var = v83Var.c;
        if (xhfVar != null) {
            w83Var.getClass();
            m73Var.getClass();
            xhfVar.a();
        }
        w83Var.getClass();
        m73Var.getClass();
        this.A0.a();
        ShapeDrawable shapeDrawable = this.t0;
        shapeDrawable.getPaint().setColor(getBorderColor());
        shapeDrawable.invalidateSelf();
        this.w0.invalidate();
    }

    @Override // defpackage.l7c
    public final void q(boolean z) {
        this.b.q(z);
    }

    @Override // defpackage.bmf
    public final /* bridge */ /* synthetic */ xlf r(boolean z) {
        return vlf.a;
    }

    @Override // defpackage.cmf
    public final boolean s() {
        return this.s0.s();
    }

    @Override // defpackage.l7c
    public void setChipObserver(w5c w5cVar) {
        this.b.setChipObserver(w5cVar);
    }

    @Override // defpackage.k34
    public void setDateBackgroundColor(int i) {
        this.x0.setBackgroundColor(i);
    }

    @Override // defpackage.k34
    public void setDateTextColor(int i) {
        this.x0.setTextColor$message_list_release(i);
    }

    @Override // defpackage.k34
    public void setDateViewStatus(zof zofVar) {
        this.x0.setStatus$message_list_release(zofVar);
    }

    @Override // defpackage.aoa
    public void setDependOnOutsideView(boolean z) {
        this.o.a = z;
    }

    @Override // defpackage.jw8
    public void setForwardClickListener(m56 m56Var) {
        this.c.X = m56Var;
    }

    @Override // defpackage.l7c
    public void setIsIncoming(boolean z) {
        this.b.o = z;
    }

    @Override // defpackage.jw8
    public void setLink(cw8 cw8Var) {
        this.c.setLink(cw8Var);
    }

    @Override // defpackage.l7c
    public void setOnClickListener(m56 m56Var) {
        this.b.X = m56Var;
    }

    @Override // defpackage.jw8
    public void setReplyClickListener(a66 a66Var) {
        this.c.o = a66Var;
    }

    @Override // defpackage.l7c
    public void setStackFromEnd(boolean z) {
        this.b.Z = z;
    }

    @Override // defpackage.cmf
    public void setVideoClickListener(a66 a66Var) {
        this.s0.o = a66Var;
    }

    @Override // defpackage.cmf
    public void setVideoLongClickListener(a66 a66Var) {
        this.s0.X = a66Var;
    }

    public final void t() {
        wgf model = getModel();
        if (model != null) {
            this.a.invoke(new h19(model.a, model));
        }
    }

    @Override // defpackage.cmf
    public final void u() {
        this.s0.u();
    }

    public final void v() {
        wgf model = getModel();
        if (model != null) {
            this.a.invoke(new i19(model.a, model));
        }
    }

    public final void w(float f) {
        wgf model = getModel();
        if (model != null) {
            this.a.invoke(new j19(model.a, model, f));
        }
    }

    public final void x(float f) {
        bu6 bu6Var = this.v0;
        Drawable overlayDrawable = bu6Var.getOverlayDrawable();
        xhf xhfVar = overlayDrawable instanceof xhf ? (xhf) overlayDrawable : null;
        Drawable drawable = xhfVar != null ? xhfVar.getDrawable(1) : null;
        if (!(drawable instanceof a10)) {
            bu6Var.setOverlayDrawable(getProgressDownloadDrawable());
            drawable = bu6Var.getOverlayDrawable();
        }
        if (drawable != null) {
            drawable.setLevel((int) (f * 100));
        }
    }

    public final void y(b00 b00Var) {
        wgf model = getModel();
        if (!tpa.f(model != null ? Long.valueOf(model.a) : null, b00Var != null ? Long.valueOf(b00Var.a()) : null) || b00Var == null) {
            return;
        }
        if (b00Var instanceof xz) {
            x(((xz) b00Var).b);
            return;
        }
        if (b00Var instanceof a00) {
            x(((a00) b00Var).b);
            return;
        }
        boolean z = b00Var instanceof yz;
        bu6 bu6Var = this.v0;
        if (z) {
            bu6Var.setOverlayDrawable(getNeedDownloadDrawable());
        } else {
            if (!(b00Var instanceof zz)) {
                throw new NoWhenBranchMatchedException();
            }
            bu6Var.setOverlayDrawable(null);
        }
    }

    public final void z(wgf wgfVar) {
        setModel(wgfVar);
    }
}
