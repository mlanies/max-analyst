package defpackage;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.ok.messages.settings.view.SliderWithCustomTicks;

/* loaded from: classes.dex */
public abstract class ck0 extends View {
    public static final int F1 = m2c.Widget_MaterialComponents_Slider;
    public static final int G1 = tsb.motionDurationMedium4;
    public static final int H1 = tsb.motionDurationShort3;
    public static final int I1 = tsb.motionEasingEmphasizedInterpolator;
    public static final int J1 = tsb.motionEasingEmphasizedAccelerateInterpolator;
    public final ArrayList A0;
    public Drawable A1;
    public final ArrayList B0;
    public List B1;
    public boolean C0;
    public float C1;
    public ValueAnimator D0;
    public int D1;
    public ValueAnimator E0;
    public final xj0 E1;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public final Paint a;
    public final int a1;
    public final Paint b;
    public float b1;
    public final Paint c;
    public MotionEvent c1;
    public boolean d1;
    public float e1;
    public float f1;
    public ArrayList g1;
    public int h1;
    public int i1;
    public float j1;
    public float[] k1;
    public boolean l1;
    public int m1;
    public int n1;
    public final Paint o;
    public int o1;
    public boolean p1;
    public boolean q1;
    public ColorStateList r1;
    public final Paint s0;
    public ColorStateList s1;
    public final Paint t0;
    public ColorStateList t1;
    public final Paint u0;
    public ColorStateList u1;
    public final ak0 v0;
    public ColorStateList v1;
    public final AccessibilityManager w0;
    public final Path w1;
    public zj0 x0;
    public final RectF x1;
    public final int y0;
    public final RectF y1;
    public final ArrayList z0;
    public final q18 z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v10, types: [xj0] */
    public ck0(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int i2 = F1;
        super(y18.a(context, attributeSet, i, i2), attributeSet, i);
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = false;
        this.W0 = -1;
        this.X0 = -1;
        this.d1 = false;
        this.g1 = new ArrayList();
        this.h1 = -1;
        this.i1 = -1;
        this.j1 = 0.0f;
        this.l1 = true;
        this.p1 = false;
        this.w1 = new Path();
        this.x1 = new RectF();
        this.y1 = new RectF();
        q18 q18Var = new q18();
        this.z1 = q18Var;
        this.B1 = Collections.emptyList();
        this.D1 = 0;
        final usd usdVar = (usd) this;
        this.E1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: xj0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                usdVar.w();
            }
        };
        Context context2 = getContext();
        this.a = new Paint();
        this.b = new Paint();
        Paint paint = new Paint(1);
        this.c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.o = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.s0 = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.t0 = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.u0 = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.N0 = resources.getDimensionPixelSize(stb.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(stb.mtrl_slider_track_side_padding);
        this.G0 = dimensionPixelOffset;
        this.R0 = dimensionPixelOffset;
        this.H0 = resources.getDimensionPixelSize(stb.mtrl_slider_thumb_radius);
        this.I0 = resources.getDimensionPixelSize(stb.mtrl_slider_track_height);
        this.J0 = resources.getDimensionPixelSize(stb.mtrl_slider_tick_radius);
        this.K0 = resources.getDimensionPixelSize(stb.mtrl_slider_tick_radius);
        this.L0 = resources.getDimensionPixelSize(stb.mtrl_slider_tick_min_spacing);
        this.a1 = resources.getDimensionPixelSize(stb.mtrl_slider_label_padding);
        int[] iArr = z2c.Slider;
        sre.a(context2, attributeSet, i, i2);
        sre.b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.y0 = typedArrayObtainStyledAttributes.getResourceId(z2c.Slider_labelStyle, m2c.Widget_MaterialComponents_Tooltip);
        this.e1 = typedArrayObtainStyledAttributes.getFloat(z2c.Slider_android_valueFrom, 0.0f);
        this.f1 = typedArrayObtainStyledAttributes.getFloat(z2c.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.e1));
        this.j1 = typedArrayObtainStyledAttributes.getFloat(z2c.Slider_android_stepSize, 0.0f);
        this.M0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(z2c.Slider_minTouchTargetSize, (float) Math.ceil(mqd.h(getContext(), 48))));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(z2c.Slider_trackColor);
        int i3 = zHasValue ? z2c.Slider_trackColor : z2c.Slider_trackColorInactive;
        int i4 = zHasValue ? z2c.Slider_trackColor : z2c.Slider_trackColorActive;
        ColorStateList colorStateListQ = ju0.q(context2, typedArrayObtainStyledAttributes, i3);
        setTrackInactiveTintList(colorStateListQ == null ? z7.n(context2, etb.material_slider_inactive_track_color) : colorStateListQ);
        ColorStateList colorStateListQ2 = ju0.q(context2, typedArrayObtainStyledAttributes, i4);
        setTrackActiveTintList(colorStateListQ2 == null ? z7.n(context2, etb.material_slider_active_track_color) : colorStateListQ2);
        q18Var.l(ju0.q(context2, typedArrayObtainStyledAttributes, z2c.Slider_thumbColor));
        if (typedArrayObtainStyledAttributes.hasValue(z2c.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(ju0.q(context2, typedArrayObtainStyledAttributes, z2c.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(z2c.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateListQ3 = ju0.q(context2, typedArrayObtainStyledAttributes, z2c.Slider_haloColor);
        setHaloTintList(colorStateListQ3 == null ? z7.n(context2, etb.material_slider_halo_color) : colorStateListQ3);
        this.l1 = typedArrayObtainStyledAttributes.getBoolean(z2c.Slider_tickVisible, true);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(z2c.Slider_tickColor);
        int i5 = zHasValue2 ? z2c.Slider_tickColor : z2c.Slider_tickColorInactive;
        int i6 = zHasValue2 ? z2c.Slider_tickColor : z2c.Slider_tickColorActive;
        ColorStateList colorStateListQ4 = ju0.q(context2, typedArrayObtainStyledAttributes, i5);
        setTickInactiveTintList(colorStateListQ4 == null ? z7.n(context2, etb.material_slider_inactive_tick_marks_color) : colorStateListQ4);
        ColorStateList colorStateListQ5 = ju0.q(context2, typedArrayObtainStyledAttributes, i6);
        setTickActiveTintList(colorStateListQ5 == null ? z7.n(context2, etb.material_slider_active_tick_marks_color) : colorStateListQ5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.Slider_trackStopIndicatorSize, 0));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.Slider_trackInsideCornerSize, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(z2c.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.Slider_tickRadiusActive, this.Y0 / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.Slider_tickRadiusInactive, this.Y0 / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(z2c.Slider_labelBehavior, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(z2c.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        q18Var.m();
        this.F0 = ViewConfiguration.get(context2).getScaledTouchSlop();
        ak0 ak0Var = new ak0(usdVar);
        this.v0 = ak0Var;
        zmf.j(this, ak0Var);
        this.w0 = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public final boolean A(float f) {
        return i(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.e1)), MathContext.DECIMAL64).doubleValue());
    }

    public final float B(float f) {
        return (o(f) * this.o1) + this.R0;
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.S0, this.T0);
        } else {
            float fMax = Math.max(this.S0, this.T0) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final int b() {
        int i = this.O0 / 2;
        int i2 = this.P0;
        return i + ((i2 == 1 || i2 == 3) ? ((uwe) this.z0.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator c(boolean z) {
        int iP;
        TimeInterpolator timeInterpolatorQ;
        int i = 0;
        float fFloatValue = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.E0 : this.D0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
        if (z) {
            iP = z7.P(G1, 83, getContext());
            timeInterpolatorQ = z7.Q(getContext(), I1, og.e);
        } else {
            iP = z7.P(H1, 117, getContext());
            timeInterpolatorQ = z7.Q(getContext(), J1, og.c);
        }
        valueAnimatorOfFloat.setDuration(iP);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorQ);
        valueAnimatorOfFloat.addUpdateListener(new yj0(i, this));
        return valueAnimatorOfFloat;
    }

    public final void d(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate((this.R0 + ((int) (o(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.v0.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.setColor(h(this.v1));
        this.b.setColor(h(this.u1));
        this.s0.setColor(h(this.t1));
        this.t0.setColor(h(this.s1));
        this.u0.setColor(h(this.u1));
        Iterator it = this.z0.iterator();
        while (it.hasNext()) {
            uwe uweVar = (uwe) it.next();
            if (uweVar.isStateful()) {
                uweVar.setState(getDrawableState());
            }
        }
        q18 q18Var = this.z1;
        if (q18Var.isStateful()) {
            q18Var.setState(getDrawableState());
        }
        Paint paint = this.o;
        paint.setColor(h(this.r1));
        paint.setAlpha(63);
    }

    public final void e() {
        if (!this.C0) {
            this.C0 = true;
            ValueAnimator valueAnimatorC = c(true);
            this.D0 = valueAnimatorC;
            this.E0 = null;
            valueAnimatorC.start();
        }
        ArrayList arrayList = this.z0;
        Iterator it = arrayList.iterator();
        for (int i = 0; i < this.g1.size() && it.hasNext(); i++) {
            if (i != this.i1) {
                q((uwe) it.next(), ((Float) this.g1.get(i)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.g1.size())));
        }
        q((uwe) it.next(), ((Float) this.g1.get(this.i1)).floatValue());
    }

    public final void f() {
        if (this.C0) {
            this.C0 = false;
            ValueAnimator valueAnimatorC = c(false);
            this.E0 = valueAnimatorC;
            this.D0 = null;
            valueAnimatorC.addListener(new h6(2, this));
            this.E0.start();
        }
    }

    public final float[] g() {
        float fFloatValue = ((Float) this.g1.get(0)).floatValue();
        float fFloatValue2 = ((Float) wg0.f(this.g1, 1)).floatValue();
        if (this.g1.size() == 1) {
            fFloatValue = this.e1;
        }
        float fO = o(fFloatValue);
        float fO2 = o(fFloatValue2);
        return k() ? new float[]{fO2, fO} : new float[]{fO, fO2};
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.v0.k;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract int getThumbRadius();

    public abstract float getValueFrom();

    public abstract float getValueTo();

    public List<Float> getValues() {
        return new ArrayList(this.g1);
    }

    public final int h(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean i(double d) {
        double dDoubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.j1)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean j(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) == 3) {
            return false;
        }
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        WeakHashMap weakHashMap = zmf.a;
        return getLayoutDirection() == 1;
    }

    public final void l() {
        if (this.j1 <= 0.0f) {
            return;
        }
        z();
        int iMin = Math.min((int) (((this.f1 - this.e1) / this.j1) + 1.0f), (this.o1 / this.L0) + 1);
        float[] fArr = this.k1;
        if (fArr == null || fArr.length != iMin * 2) {
            this.k1 = new float[iMin * 2];
        }
        float f = this.o1 / (iMin - 1);
        for (int i = 0; i < iMin * 2; i += 2) {
            float[] fArr2 = this.k1;
            fArr2[i] = ((i / 2.0f) * f) + this.R0;
            fArr2[i + 1] = b();
        }
    }

    public final boolean m(int i) {
        int i2 = this.i1;
        long j = i2 + i;
        long size = this.g1.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.i1 = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.h1 != -1) {
            this.h1 = i3;
        }
        v();
        postInvalidate();
        return true;
    }

    public final void n(int i) {
        if (k()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        m(i);
    }

    public final float o(float f) {
        float f2 = this.e1;
        float f3 = (f - f2) / (this.f1 - f2);
        return k() ? 1.0f - f3 : f3;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.E1);
        Iterator it = this.z0.iterator();
        while (it.hasNext()) {
            uwe uweVar = (uwe) it.next();
            ViewGroup viewGroupJ = mqd.j(this);
            if (viewGroupJ == null) {
                uweVar.getClass();
            } else {
                uweVar.getClass();
                int[] iArr = new int[2];
                viewGroupJ.getLocationOnScreen(iArr);
                uweVar.V0 = iArr[0];
                viewGroupJ.getWindowVisibleDisplayFrame(uweVar.O0);
                viewGroupJ.addOnLayoutChangeListener(uweVar.N0);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        zj0 zj0Var = this.x0;
        if (zj0Var != null) {
            removeCallbacks(zj0Var);
        }
        this.C0 = false;
        Iterator it = this.z0.iterator();
        while (it.hasNext()) {
            uwe uweVar = (uwe) it.next();
            y7f y7fVarK = mqd.k(this);
            if (y7fVarK != null) {
                ((ViewOverlay) y7fVarK.b).remove(uweVar);
                ViewGroup viewGroupJ = mqd.j(this);
                if (viewGroupJ == null) {
                    uweVar.getClass();
                } else {
                    viewGroupJ.removeOnLayoutChangeListener(uweVar.N0);
                }
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.E1);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck0.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        ak0 ak0Var = this.v0;
        if (!z) {
            this.h1 = -1;
            ak0Var.j(this.i1);
            return;
        }
        if (i == 1) {
            m(Integer.MAX_VALUE);
        } else if (i == 2) {
            m(Integer.MIN_VALUE);
        } else if (i == 17) {
            n(Integer.MAX_VALUE);
        } else if (i == 66) {
            n(Integer.MIN_VALUE);
        }
        ak0Var.w(this.i1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck0.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.p1 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.O0;
        int i4 = this.P0;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + ((i4 == 1 || i4 == 3) ? ((uwe) this.z0.get(0)).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        bk0 bk0Var = (bk0) parcelable;
        super.onRestoreInstanceState(bk0Var.getSuperState());
        this.e1 = bk0Var.a;
        this.f1 = bk0Var.b;
        r(bk0Var.c);
        this.j1 = bk0Var.o;
        if (bk0Var.X) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        bk0 bk0Var = new bk0(super.onSaveInstanceState());
        bk0Var.a = this.e1;
        bk0Var.b = this.f1;
        bk0Var.c = new ArrayList(this.g1);
        bk0Var.o = this.j1;
        bk0Var.X = hasFocus();
        return bk0Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.o1 = Math.max(i - (this.R0 * 2), 0);
        l();
        v();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        y7f y7fVarK;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (y7fVarK = mqd.k(this)) == null) {
            return;
        }
        Iterator it = this.z0.iterator();
        while (it.hasNext()) {
            ((ViewOverlay) y7fVarK.b).remove((uwe) it.next());
        }
    }

    public final void p() {
        Iterator it = this.B0.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public final void q(uwe uweVar, float f) {
        String str = String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
        if (!TextUtils.equals(uweVar.J0, str)) {
            uweVar.J0 = str;
            uweVar.M0.e = true;
            uweVar.invalidateSelf();
        }
        int iO = (this.R0 + ((int) (o(f) * this.o1))) - (uweVar.getIntrinsicWidth() / 2);
        int iB = b() - ((this.T0 / 2) + this.a1);
        uweVar.setBounds(iO, iB - uweVar.getIntrinsicHeight(), uweVar.getIntrinsicWidth() + iO, iB);
        Rect rect = new Rect(uweVar.getBounds());
        uh4.b(mqd.j(this), this, rect);
        uweVar.setBounds(rect);
        ((ViewOverlay) mqd.k(this).b).add(uweVar);
    }

    public final void r(ArrayList arrayList) {
        ViewGroup viewGroupJ;
        int resourceId;
        y7f y7fVarK;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.g1.size() == arrayList.size() && this.g1.equals(arrayList)) {
            return;
        }
        this.g1 = arrayList;
        this.q1 = true;
        this.i1 = 0;
        v();
        ArrayList arrayList2 = this.z0;
        if (arrayList2.size() > this.g1.size()) {
            List<uwe> listSubList = arrayList2.subList(this.g1.size(), arrayList2.size());
            for (uwe uweVar : listSubList) {
                WeakHashMap weakHashMap = zmf.a;
                if (isAttachedToWindow() && (y7fVarK = mqd.k(this)) != null) {
                    ((ViewOverlay) y7fVarK.b).remove(uweVar);
                    ViewGroup viewGroupJ2 = mqd.j(this);
                    if (viewGroupJ2 == null) {
                        uweVar.getClass();
                    } else {
                        viewGroupJ2.removeOnLayoutChangeListener(uweVar.N0);
                    }
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.g1.size()) {
            Context context = getContext();
            int i = this.y0;
            uwe uweVar2 = new uwe(context, i);
            TypedArray typedArrayD = sre.d(uweVar2.K0, null, z2c.Tooltip, 0, i, new int[0]);
            Context context2 = uweVar2.K0;
            uweVar2.U0 = context2.getResources().getDimensionPixelSize(stb.mtrl_tooltip_arrowSize);
            boolean z = typedArrayD.getBoolean(z2c.Tooltip_showMarker, true);
            uweVar2.T0 = z;
            if (z) {
                i8g i8gVarE = uweVar2.a.a.e();
                i8gVarE.k = uweVar2.s();
                uweVar2.setShapeAppearanceModel(i8gVarE.c());
            } else {
                uweVar2.U0 = 0;
            }
            CharSequence text = typedArrayD.getText(z2c.Tooltip_android_text);
            boolean zEquals = TextUtils.equals(uweVar2.J0, text);
            dpe dpeVar = uweVar2.M0;
            if (!zEquals) {
                uweVar2.J0 = text;
                dpeVar.e = true;
                uweVar2.invalidateSelf();
            }
            int i2 = z2c.Tooltip_android_textAppearance;
            voe voeVar = (!typedArrayD.hasValue(i2) || (resourceId = typedArrayD.getResourceId(i2, 0)) == 0) ? null : new voe(context2, resourceId);
            if (voeVar != null && typedArrayD.hasValue(z2c.Tooltip_android_textColor)) {
                voeVar.j = ju0.q(context2, typedArrayD, z2c.Tooltip_android_textColor);
            }
            dpeVar.c(voeVar, context2);
            uweVar2.l(ColorStateList.valueOf(typedArrayD.getColor(z2c.Tooltip_backgroundTint, s63.g(s63.i(mr0.y(tsb.colorOnBackground, context2, uwe.class.getCanonicalName()), 153), s63.i(mr0.y(R.attr.colorBackground, context2, uwe.class.getCanonicalName()), 229)))));
            uweVar2.n(ColorStateList.valueOf(mr0.y(tsb.colorSurface, context2, uwe.class.getCanonicalName())));
            uweVar2.P0 = typedArrayD.getDimensionPixelSize(z2c.Tooltip_android_padding, 0);
            uweVar2.Q0 = typedArrayD.getDimensionPixelSize(z2c.Tooltip_android_minWidth, 0);
            uweVar2.R0 = typedArrayD.getDimensionPixelSize(z2c.Tooltip_android_minHeight, 0);
            uweVar2.S0 = typedArrayD.getDimensionPixelSize(z2c.Tooltip_android_layout_margin, 0);
            typedArrayD.recycle();
            arrayList2.add(uweVar2);
            WeakHashMap weakHashMap2 = zmf.a;
            if (isAttachedToWindow() && (viewGroupJ = mqd.j(this)) != null) {
                int[] iArr = new int[2];
                viewGroupJ.getLocationOnScreen(iArr);
                uweVar2.V0 = iArr[0];
                viewGroupJ.getWindowVisibleDisplayFrame(uweVar2.O0);
                viewGroupJ.addOnLayoutChangeListener(uweVar2.N0);
            }
        }
        int i3 = arrayList2.size() == 1 ? 0 : 1;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            uwe uweVar3 = (uwe) it.next();
            uweVar3.a.k = i3;
            uweVar3.invalidateSelf();
        }
        Iterator it2 = this.A0.iterator();
        while (it2.hasNext()) {
            kj0 kj0Var = (kj0) it2.next();
            Iterator it3 = this.g1.iterator();
            while (it3.hasNext()) {
                ((Float) it3.next()).getClass();
                ((SliderWithCustomTicks) kj0Var).getClass();
            }
        }
        postInvalidate();
    }

    public final boolean s(int i, float f) {
        this.i1 = i;
        if (Math.abs(f - ((Float) this.g1.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.D1 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = this.e1;
                minSeparation = z7b.f(f2, this.f1, (minSeparation - this.R0) / this.o1, f2);
            }
        }
        if (k()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.g1.set(i, Float.valueOf(z04.o(f, i3 < 0 ? this.e1 : minSeparation + ((Float) this.g1.get(i3)).floatValue(), i2 >= this.g1.size() ? this.f1 : ((Float) this.g1.get(i2)).floatValue() - minSeparation)));
        Iterator it = this.A0.iterator();
        while (it.hasNext()) {
            kj0 kj0Var = (kj0) it.next();
            ((Float) this.g1.get(i)).getClass();
            SliderWithCustomTicks sliderWithCustomTicks = (SliderWithCustomTicks) kj0Var;
            sliderWithCustomTicks.getClass();
            pag.F(sliderWithCustomTicks, mi6.VIRTUAL_KEY);
        }
        AccessibilityManager accessibilityManager = this.w0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return true;
        }
        Runnable runnable = this.x0;
        if (runnable == null) {
            this.x0 = new zj0(this);
        } else {
            removeCallbacks(runnable);
        }
        zj0 zj0Var = this.x0;
        zj0Var.b = i;
        postDelayed(zj0Var, 200L);
        return true;
    }

    public void setActiveThumbIndex(int i) {
        this.h1 = i;
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public abstract void setHaloRadius(int i);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i);

    public void setSeparationUnit(int i) {
        this.D1 = i;
        this.q1 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f);

    public abstract void setThumbHeight(int i);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f);

    public abstract void setThumbTrackGapSize(int i);

    public abstract void setThumbWidth(int i);

    public abstract void setTickActiveRadius(int i);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i);

    public abstract void setTrackStopIndicatorSize(int i);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        r(arrayList);
    }

    public final void t() {
        double dRound;
        float f = this.C1;
        float f2 = this.j1;
        if (f2 > 0.0f) {
            dRound = Math.round(f * r1) / ((int) ((this.f1 - this.e1) / f2));
        } else {
            dRound = f;
        }
        if (k()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.f1;
        s(this.h1, (float) ((dRound * (f3 - r1)) + this.e1));
    }

    public final void u(int i, Rect rect) {
        int iO = this.R0 + ((int) (o(getValues().get(i).floatValue()) * this.o1));
        int iB = b();
        int iMax = Math.max(this.S0 / 2, this.M0 / 2);
        int iMax2 = Math.max(this.T0 / 2, this.M0 / 2);
        rect.set(iO - iMax, iB - iMax2, iO + iMax, iB + iMax2);
    }

    public final void v() {
        if ((!(getBackground() instanceof RippleDrawable)) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iO = (int) ((o(((Float) this.g1.get(this.i1)).floatValue()) * this.o1) + this.R0);
            int iB = b();
            int i = this.U0;
            aq4.f(background, iO - i, iB - i, iO + i, iB + i);
        }
    }

    public final void w() {
        int i = this.P0;
        if (i == 0 || i == 1) {
            if (this.h1 == -1 || !isEnabled()) {
                f();
                return;
            } else {
                e();
                return;
            }
        }
        if (i == 2) {
            f();
            return;
        }
        if (i != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.P0);
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            mqd.j(this).getHitRect(rect);
            if (getLocalVisibleRect(rect)) {
                e();
                return;
            }
        }
        f();
    }

    public final void x(Canvas canvas, Paint paint, RectF rectF, int i) {
        float f;
        float f2 = this.Q0 / 2.0f;
        int iS = au1.s(i);
        if (iS == 1) {
            f = this.Z0;
        } else if (iS != 2) {
            if (iS == 3) {
                f2 = this.Z0;
            }
            f = f2;
        } else {
            f = f2;
            f2 = this.Z0;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        Path path = this.w1;
        path.reset();
        if (rectF.width() >= f2 + f) {
            path.addRoundRect(rectF, new float[]{f2, f2, f, f, f, f, f2, f2}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float fMin = Math.min(f2, f);
        float fMax = Math.max(f2, f);
        canvas.save();
        path.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
        canvas.clipPath(path);
        int iS2 = au1.s(i);
        RectF rectF2 = this.y1;
        if (iS2 == 1) {
            float f3 = rectF.left;
            rectF2.set(f3, rectF.top, (2.0f * fMax) + f3, rectF.bottom);
        } else if (iS2 != 2) {
            rectF2.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            float f4 = rectF.right;
            rectF2.set(f4 - (2.0f * fMax), rectF.top, f4, rectF.bottom);
        }
        canvas.drawRoundRect(rectF2, fMax, fMax, paint);
        canvas.restore();
    }

    public final void y() {
        boolean z;
        int iMax = Math.max(this.N0, Math.max(this.Q0 + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.T0));
        boolean z2 = false;
        if (iMax == this.O0) {
            z = false;
        } else {
            this.O0 = iMax;
            z = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.S0 / 2) - this.H0, 0), Math.max((this.Q0 - this.I0) / 2, 0)), Math.max(Math.max(this.m1 - this.J0, 0), Math.max(this.n1 - this.K0, 0))) + this.G0;
        if (this.R0 != iMax2) {
            this.R0 = iMax2;
            WeakHashMap weakHashMap = zmf.a;
            if (isLaidOut()) {
                this.o1 = Math.max(getWidth() - (this.R0 * 2), 0);
                l();
            }
            z2 = true;
        }
        if (z) {
            requestLayout();
        } else if (z2) {
            postInvalidate();
        }
    }

    public final void z() {
        if (this.q1) {
            float f = this.e1;
            float f2 = this.f1;
            if (f >= f2) {
                throw new IllegalStateException("valueFrom(" + this.e1 + ") must be smaller than valueTo(" + this.f1 + ")");
            }
            if (f2 <= f) {
                throw new IllegalStateException("valueTo(" + this.f1 + ") must be greater than valueFrom(" + this.e1 + ")");
            }
            if (this.j1 > 0.0f && !A(f2)) {
                throw new IllegalStateException("The stepSize(" + this.j1 + ") must be 0, or a factor of the valueFrom(" + this.e1 + ")-valueTo(" + this.f1 + ") range");
            }
            Iterator it = this.g1.iterator();
            while (it.hasNext()) {
                Float f3 = (Float) it.next();
                if (f3.floatValue() < this.e1 || f3.floatValue() > this.f1) {
                    throw new IllegalStateException("Slider value(" + f3 + ") must be greater or equal to valueFrom(" + this.e1 + "), and lower or equal to valueTo(" + this.f1 + ")");
                }
                if (this.j1 > 0.0f && !A(f3.floatValue())) {
                    float f4 = this.e1;
                    float f5 = this.j1;
                    throw new IllegalStateException("Value(" + f3 + ") must be equal to valueFrom(" + f4 + ") plus a multiple of stepSize(" + f5 + ") when using stepSize(" + f5 + ")");
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f6 = this.j1;
            if (f6 > 0.0f && minSeparation > 0.0f) {
                if (this.D1 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.j1 + ")");
                }
                if (minSeparation < f6 || !i(minSeparation)) {
                    float f7 = this.j1;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f7 + ") when using stepSize(" + f7 + ")");
                }
            }
            this.q1 = false;
        }
    }

    public void setValues(List<Float> list) {
        r(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.A1 = null;
        this.B1 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.B1;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            a(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
