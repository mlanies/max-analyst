package one.me.sdk.zoom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import defpackage.b9b;
import defpackage.br7;
import defpackage.ev3;
import defpackage.f46;
import defpackage.fre;
import defpackage.g06;
import defpackage.iag;
import defpackage.j0;
import defpackage.jag;
import defpackage.k0;
import defpackage.kag;
import defpackage.la6;
import defpackage.lag;
import defpackage.mq4;
import defpackage.n5;
import defpackage.na6;
import defpackage.q00;
import defpackage.r68;
import defpackage.ru6;
import defpackage.ta5;
import defpackage.uf4;

/* loaded from: classes2.dex */
public class ZoomableDraweeView extends na6 implements iag {
    public static final /* synthetic */ int F0 = 0;
    public volatile fre A0;
    public final Runnable B0;
    public final n5 C0;
    public mq4 D0;
    public jag E0;
    public final RectF v0;
    public final RectF w0;
    public boolean x0;
    public GestureDetector y0;
    public lag z0;

    public ZoomableDraweeView(Context context) {
        super(context);
        this.v0 = new RectF();
        this.w0 = new RectF();
        this.A0 = null;
        this.B0 = new kag(this, 0);
        this.C0 = new n5(5, this);
        this.E0 = new uf4(new b9b(new r68()));
        m();
    }

    @Override // defpackage.iag
    public void f(Matrix matrix) {
        ta5.d(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onTransformChanged: view %x");
        if (this.D0 != null && f46.K(((uf4) this.E0).k) > 1.1f) {
            p(this.D0);
        }
        invalidate();
    }

    public jag getZoomableController() {
        return this.E0;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        removeCallbacks(this.A0);
        this.A0 = new fre(this, 23, drawable);
        br7.N(this, this.A0);
    }

    public final void m() {
        ((uf4) this.E0).b = this;
        this.y0 = new GestureDetector(getContext(), new q00(19, this));
    }

    public void n(Throwable th) {
        ta5.d(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onFinalImageSet: view %x");
        lag lagVar = this.z0;
        if (lagVar != null) {
            lagVar.d(th);
        }
        requestLayout();
        postInvalidate();
    }

    public void o(ru6 ru6Var) {
        ta5.d(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onFinalImageSet: view %x");
        if (!((uf4) this.E0).c) {
            q();
            jag jagVar = this.E0;
            boolean z = this.x0;
            uf4 uf4Var = (uf4) jagVar;
            uf4Var.c = z;
            if (!z) {
                uf4Var.reset();
            }
        }
        requestLayout();
        postInvalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int iSave = 0;
        boolean z = this.x0 && !((uf4) this.E0).k.isIdentity();
        if (z) {
            iSave = canvas.save();
            canvas.concat(((uf4) this.E0).k);
        }
        super.onDraw(canvas);
        if (z) {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ta5.d(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onLayout: view %x");
        super.onLayout(z, i, i2, i3, i4);
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    @Override // defpackage.uq4, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.zoom.ZoomableDraweeView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(mq4 mq4Var) {
        mq4 controller = getController();
        if (controller instanceof k0) {
            k0 k0Var = (k0) controller;
            n5 n5Var = this.C0;
            k0Var.getClass();
            n5Var.getClass();
            ev3 ev3Var = k0Var.f;
            if (ev3Var instanceof j0) {
                j0 j0Var = (j0) ev3Var;
                synchronized (j0Var) {
                    int iIndexOf = j0Var.a.indexOf(n5Var);
                    if (iIndexOf != -1) {
                        j0Var.a.set(iIndexOf, null);
                    }
                }
            } else if (ev3Var == n5Var) {
                k0Var.f = null;
            }
        }
        if (mq4Var instanceof k0) {
            ((k0) mq4Var).a(this.C0);
        }
        this.D0 = null;
        super.setController(mq4Var);
    }

    public final void q() {
        g06 g06Var = ((la6) getHierarchy()).f;
        Matrix matrix = g06.o;
        g06Var.n(matrix);
        Rect bounds = g06Var.getBounds();
        RectF rectF = this.v0;
        rectF.set(bounds);
        matrix.mapRect(rectF);
        float width = getWidth();
        float height = getHeight();
        RectF rectF2 = this.w0;
        rectF2.set(0.0f, 0.0f, width, height);
        ((uf4) this.E0).h.set(rectF);
        ((uf4) this.E0).g.set(rectF2);
        ta5.f(ZoomableDraweeView.class, "updateZoomableControllerBounds: view %x, view bounds: %s, image bounds: %s", Integer.valueOf(hashCode()), rectF2, rectF);
    }

    @Override // defpackage.uq4
    public void setController(mq4 mq4Var) {
        p(null);
        uf4 uf4Var = (uf4) this.E0;
        uf4Var.c = false;
        uf4Var.reset();
        p(mq4Var);
    }

    public void setListener(lag lagVar) {
        this.z0 = lagVar;
    }

    public void setZoomEnabled(boolean z) {
        this.x0 = z;
        jag jagVar = this.E0;
        if (jagVar != null) {
            uf4 uf4Var = (uf4) jagVar;
            uf4Var.c = z;
            if (z) {
                return;
            }
            uf4Var.reset();
        }
    }

    public void setZoomableController(jag jagVar) {
        jagVar.getClass();
        ((uf4) this.E0).b = null;
        this.E0 = jagVar;
        ((uf4) jagVar).b = this;
    }

    public ZoomableDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v0 = new RectF();
        this.w0 = new RectF();
        this.A0 = null;
        this.B0 = new kag(this, 0);
        this.C0 = new n5(5, this);
        this.E0 = new uf4(new b9b(new r68()));
        m();
    }

    public ZoomableDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.v0 = new RectF();
        this.w0 = new RectF();
        this.A0 = null;
        this.B0 = new kag(this, 0);
        this.C0 = new n5(5, this);
        this.E0 = new uf4(new b9b(new r68()));
        m();
    }
}
