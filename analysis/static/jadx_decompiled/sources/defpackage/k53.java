package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class k53 extends bd8 implements ot8, z43 {
    public final e53 w0;

    public k53(Context context) {
        super(context);
        this.w0 = new e53(context, this);
    }

    @Override // defpackage.mc8
    public final int b(int i, int i2) {
        e53 e53Var = this.w0;
        int i3 = e53Var.c;
        e53Var.b(i, i2);
        return e53Var.d;
    }

    @Override // defpackage.ot8
    public final void d(MotionEvent motionEvent, int[] iArr) {
        this.w0.e(tu0.G(motionEvent.getX()), tu0.G(motionEvent.getY()), iArr);
    }

    @Override // defpackage.ot8
    public final boolean h(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new g53(this, drawable, 0));
        } else {
            post(new h53(this, drawable, 0));
        }
    }

    @Override // defpackage.ot8
    public final a53 n(MotionEvent motionEvent) {
        return this.w0.a(tu0.G(motionEvent.getX()), tu0.G(motionEvent.getY()));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = 2;
        float f2 = (measuredWidth - ((fk4.d().getDisplayMetrics().density * 1.0f) * f)) / measuredWidth;
        float f3 = (measuredHeight - ((1.0f * fk4.d().getDisplayMetrics().density) * f)) / measuredHeight;
        Matrix matrixA = k78.a();
        matrixA.reset();
        matrixA.setScale(f2, f3, measuredWidth / 2.0f, measuredHeight / 2.0f);
        Path pathB = k78.b();
        pathB.reset();
        pathB.set(((vs8) getBackground()).a());
        pathB.transform(k78.a());
        Path pathB2 = k78.b();
        int iSave = canvas.save();
        canvas.clipPath(pathB2);
        try {
            dispatchDraw(canvas);
            e53 e53Var = this.w0;
            int length = e53Var.h.length;
            for (int i = 0; i < length; i++) {
                umc umcVarE = e53Var.e.i(i).e();
                if (umcVarE != null) {
                    umcVarE.draw(canvas);
                }
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.w0.e.p();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.w0.e.r();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.scheduleDrawable(drawable, runnable, j);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new i53(this, drawable, runnable, j, 0));
        } else {
            post(new i53(this, drawable, runnable, j, 1));
        }
    }

    public void setOnFinalImageSetCallback(m56 m56Var) {
        this.w0.g = m56Var;
    }

    @Override // defpackage.mc8
    public final long t(int i, int i2, int i3, int i4) {
        e53 e53Var = this.w0;
        e53Var.c(i2);
        return dy7.l(e53Var.c, e53Var.d);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable, runnable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new j53(this, drawable, runnable, 0));
        } else {
            post(new j53(this, drawable, runnable, 1));
        }
    }

    @Override // defpackage.mc8
    public final void v(x38 x38Var) {
        f53 f53Var = (f53) x38Var;
        float[] fArr = f53Var.a;
        e53 e53Var = this.w0;
        e53Var.h = fArr;
        e53Var.f.o1(e53Var, e53.k[0], f53Var.b);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.w0.g(drawable) || super.verifyDrawable(drawable);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new g53(this, drawable, 1));
        } else {
            post(new h53(this, drawable, 1));
        }
    }
}
