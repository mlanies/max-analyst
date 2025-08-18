package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class tha extends View implements kre {
    public final TextPaint A0;
    public final ArrayList B0;
    public final int a;
    public final vsd b;
    public final ysd c;
    public final Paint o;
    public int s0;
    public int t0;
    public final sha u0;
    public final sha v0;
    public boolean w0;
    public float x0;
    public float y0;
    public final Paint z0;

    /* JADX WARN: Type inference failed for: r4v7, types: [sha] */
    /* JADX WARN: Type inference failed for: r4v8, types: [sha] */
    public tha(Context context) {
        super(context);
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.b = new vsd();
        this.c = new ysd();
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 4.0f);
        this.o = paint;
        final int i = 0;
        this.u0 = new Runnable(this) { // from class: sha
            public final /* synthetic */ tha b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        tha thaVar = this.b;
                        Iterator it = thaVar.B0.iterator();
                        while (it.hasNext()) {
                            ((qq) it.next()).a(thaVar.c.d);
                        }
                        break;
                    default:
                        tha thaVar2 = this.b;
                        Iterator it2 = thaVar2.B0.iterator();
                        while (it2.hasNext()) {
                            ((qq) it2.next()).a(thaVar2.c.d);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.v0 = new Runnable(this) { // from class: sha
            public final /* synthetic */ tha b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        tha thaVar = this.b;
                        Iterator it = thaVar.B0.iterator();
                        while (it.hasNext()) {
                            ((qq) it.next()).a(thaVar.c.d);
                        }
                        break;
                    default:
                        tha thaVar2 = this.b;
                        Iterator it2 = thaVar2.B0.iterator();
                        while (it2.hasNext()) {
                            ((qq) it2.next()).a(thaVar2.c.d);
                        }
                        break;
                }
            }
        };
        this.y0 = -1.0f;
        Paint paint2 = new Paint();
        paint2.setShadowLayer(fk4.d().getDisplayMetrics().density * 4.0f, 0.0f, 0.0f, f8.G(-16777216, 0.12f));
        this.z0 = paint2;
        TextPaint textPaint = new TextPaint();
        i4f.j.a(textPaint, getResources().getDisplayMetrics(), du4.b);
        this.A0 = textPaint;
        this.B0 = new ArrayList();
        float f = 16;
        setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(qp4.u0.j(this));
    }

    private final void setLastThumbSnap(float f) {
        ysd ysdVar = this.c;
        float f2 = ysdVar.d;
        bc7 bc7Var = ysd.g[2];
        xsd xsdVar = ysdVar.c;
        float fFloatValue = ((Number) xsdVar.b).floatValue() / 2;
        int i = ysdVar.e;
        for (int i2 = 0; i2 < i; i2++) {
            vsd vsdVar = this.b;
            RectF rectF = vsdVar.b;
            float fA = vsdVar.q.a(i2);
            rectF.left = fA;
            rectF.right = fA;
            rectF.top = vsdVar.n;
            rectF.bottom = vsdVar.o;
            if (Math.abs(rectF.centerX() - f) <= fFloatValue) {
                float fB = ysdVar.b();
                bc7 bc7Var2 = ysd.g[2];
                ysdVar.c((((Number) xsdVar.b).floatValue() * i2) + fB);
                if (ysdVar.d != f2) {
                    sha shaVar = this.u0;
                    removeCallbacks(shaVar);
                    removeCallbacks(this.v0);
                    post(shaVar);
                }
            }
        }
        this.x0 = f;
    }

    public final boolean a() {
        ViewParent parent = getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public final float getValue() {
        return this.c.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        TextPaint textPaint = this.A0;
        textPaint.setTextSize(TypedValue.applyDimension(2, 12.0f, fk4.d().getDisplayMetrics()));
        vsd vsdVar = this.b;
        PointF pointF = vsdVar.a;
        float f = vsdVar.e;
        pointF.x = f;
        float f2 = (vsdVar.d / 2.0f) + vsdVar.j;
        pointF.y = f2;
        canvas.drawText("A", f, f2, textPaint);
        textPaint.setTextSize(TypedValue.applyDimension(2, 18.0f, fk4.d().getDisplayMetrics()));
        PointF pointF2 = vsdVar.a;
        float f3 = (vsdVar.c - vsdVar.g) - vsdVar.l;
        pointF2.x = f3;
        float f4 = (vsdVar.d / 2.0f) + vsdVar.m;
        pointF2.y = f4;
        canvas.drawText("A", f3, f4, textPaint);
        RectF rectF = vsdVar.r;
        pointF2.x = vsdVar.s;
        pointF2.y = rectF.centerY();
        float f5 = pointF2.x;
        Paint paint = this.o;
        paint.setColor(this.s0);
        canvas.drawLine(rectF.left, rectF.top, f5, rectF.bottom, paint);
        int i = this.c.e;
        for (int i2 = 0; i2 < i; i2++) {
            RectF rectF2 = vsdVar.b;
            float fA = vsdVar.q.a(i2);
            rectF2.left = fA;
            rectF2.right = fA;
            rectF2.top = vsdVar.n;
            rectF2.bottom = vsdVar.o;
            if (fA > f5) {
                paint.setColor(this.t0);
            }
            canvas.drawLine(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, paint);
        }
        canvas.drawLine(f5, rectF.top, rectF.right, rectF.bottom, paint);
        float f6 = fk4.d().getDisplayMetrics().density * 12.0f;
        pointF2.x = vsdVar.s;
        float fCenterY = rectF.centerY();
        pointF2.y = fCenterY;
        canvas.drawCircle(pointF2.x, fCenterY, f6, this.z0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        TextPaint textPaint = this.A0;
        textPaint.setTextSize(fk4.d().getDisplayMetrics().density * 12.0f);
        textPaint.measureText("A");
        float f = 20;
        tu0.G(fk4.d().getDisplayMetrics().density * f);
        float fMeasureText = textPaint.measureText("A");
        float f2 = textPaint.getFontMetrics().descent;
        float fB = ote.b(fMeasureText, 0.0f);
        vsd vsdVar = this.b;
        vsdVar.getClass();
        vsdVar.i = fB + tu0.G(fk4.d().getDisplayMetrics().density * f);
        vsdVar.j = f2;
        vsdVar.d();
        vsdVar.b(vsdVar.p);
        textPaint.setTextSize(fk4.d().getDisplayMetrics().density * 18.0f);
        textPaint.measureText("A");
        tu0.G(fk4.d().getDisplayMetrics().density * f);
        float fMeasureText2 = textPaint.measureText("A");
        float f3 = textPaint.getFontMetrics().descent;
        float fB2 = ote.b(fMeasureText2, 0.0f);
        vsdVar.l = fB2;
        vsdVar.k = fB2 + tu0.G(f * fk4.d().getDisplayMetrics().density);
        vsdVar.m = f3;
        vsdVar.d();
        vsdVar.b(vsdVar.p);
        setMeasuredDimension(View.MeasureSpec.getSize(i), tu0.G(68 * fk4.d().getDisplayMetrics().density));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        if (measuredWidth < 0) {
            measuredWidth = 0;
        }
        vsdVar.c = measuredWidth;
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        vsdVar.d = measuredHeight;
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        vsdVar.e = paddingLeft;
        if (paddingTop < 0) {
            paddingTop = 0;
        }
        vsdVar.f = paddingTop;
        if (paddingRight < 0) {
            paddingRight = 0;
        }
        vsdVar.g = paddingRight;
        if (paddingBottom < 0) {
            paddingBottom = 0;
        }
        vsdVar.h = paddingBottom;
        vsdVar.d();
        vsdVar.b(vsdVar.p);
        vsdVar.c(vsdVar.s);
        ysd ysdVar = this.c;
        vsdVar.b(ysdVar.e);
        RectF rectF = vsdVar.r;
        if (this.w0) {
            return;
        }
        vsdVar.c(vsdVar.a((rectF.width() * ysdVar.f) + rectF.left));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.s0 = fkaVar.getIcon().k;
        this.t0 = s63.g(fkaVar.i().b.b, fkaVar.b().g);
        this.o.setColor(this.s0);
        this.z0.setColor(-1);
        this.A0.setColor(fkaVar.getText().g);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.isEnabled()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r6.getAction()
            vsd r2 = r5.b
            r3 = 1
            if (r0 == 0) goto L76
            if (r0 == r3) goto L63
            r4 = 2
            if (r0 == r4) goto L1b
            r4 = 3
            if (r0 == r4) goto L63
            goto La6
        L1b:
            boolean r0 = r5.w0
            if (r0 != 0) goto L3f
            boolean r0 = r5.a()
            if (r0 == 0) goto L38
            float r0 = r6.getX()
            float r4 = r5.y0
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r5.a
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L38
            return r1
        L38:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L3f:
            r5.w0 = r3
            float r6 = r6.getX()
            float r6 = r2.a(r6)
            float r0 = r5.x0
            float r0 = r6 - r0
            float r0 = java.lang.Math.abs(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La6
            li6 r0 = defpackage.li6.CLOCK_TICK
            defpackage.pag.F(r5, r0)
            r5.setLastThumbSnap(r6)
            r2.c(r6)
            goto La6
        L63:
            r5.w0 = r1
            float r6 = r6.getX()
            float r6 = r2.a(r6)
            r5.setLastThumbSnap(r6)
            float r6 = r5.x0
            r2.c(r6)
            goto La6
        L76:
            float r0 = r6.getX()
            r5.y0 = r0
            boolean r0 = r5.a()
            if (r0 == 0) goto L83
            goto La6
        L83:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            r5.requestFocus()
            r5.w0 = r3
            float r0 = r6.getX()
            float r0 = r2.a(r0)
            r5.setLastThumbSnap(r0)
            float r6 = r6.getX()
            r2.c(r6)
            mi6 r6 = defpackage.mi6.GESTURE_START
            defpackage.pag.F(r5, r6)
        La6:
            r5.invalidate()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tha.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setStepSize(float f) {
        ysd ysdVar = this.c;
        float f2 = ysdVar.d;
        ysdVar.c.o1(ysdVar, ysd.g[2], Float.valueOf(f));
        int i = ysdVar.e;
        vsd vsdVar = this.b;
        vsdVar.b(i);
        RectF rectF = vsdVar.r;
        vsdVar.c(vsdVar.a((rectF.width() * ysdVar.f) + rectF.left));
        if (f2 != ysdVar.d) {
            removeCallbacks(this.u0);
            sha shaVar = this.v0;
            removeCallbacks(shaVar);
            post(shaVar);
        }
        postInvalidate();
    }

    public final void setValue(float f) {
        ysd ysdVar = this.c;
        float f2 = ysdVar.d;
        ysdVar.c(f);
        int i = ysdVar.e;
        vsd vsdVar = this.b;
        vsdVar.b(i);
        RectF rectF = vsdVar.r;
        vsdVar.c(vsdVar.a((rectF.width() * ysdVar.f) + rectF.left));
        if (f2 != ysdVar.d) {
            removeCallbacks(this.u0);
            sha shaVar = this.v0;
            removeCallbacks(shaVar);
            post(shaVar);
        }
        postInvalidate();
    }

    public final void setValueFrom(float f) {
        ysd ysdVar = this.c;
        float f2 = ysdVar.d;
        ysdVar.a.o1(ysdVar, ysd.g[0], Float.valueOf(f));
        int i = ysdVar.e;
        vsd vsdVar = this.b;
        vsdVar.b(i);
        RectF rectF = vsdVar.r;
        vsdVar.c(vsdVar.a((rectF.width() * ysdVar.f) + rectF.left));
        if (f2 != ysdVar.d) {
            removeCallbacks(this.u0);
            sha shaVar = this.v0;
            removeCallbacks(shaVar);
            post(shaVar);
        }
        postInvalidate();
    }

    public final void setValueTo(float f) {
        ysd ysdVar = this.c;
        float f2 = ysdVar.d;
        ysdVar.b.o1(ysdVar, ysd.g[1], Float.valueOf(f));
        int i = ysdVar.e;
        vsd vsdVar = this.b;
        vsdVar.b(i);
        RectF rectF = vsdVar.r;
        vsdVar.c(vsdVar.a((rectF.width() * ysdVar.f) + rectF.left));
        if (f2 != ysdVar.d) {
            removeCallbacks(this.u0);
            sha shaVar = this.v0;
            removeCallbacks(shaVar);
            post(shaVar);
        }
        postInvalidate();
    }
}
