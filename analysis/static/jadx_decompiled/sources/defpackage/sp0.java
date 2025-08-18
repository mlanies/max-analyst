package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class sp0 extends Drawable {
    public static final int[] n = new int[2];
    public static final int[] o = new int[2];
    public final int a;
    public final boolean b;
    public op0 c;
    public final khe d;
    public final qp0 e;
    public boolean f;
    public Bitmap g;
    public pp0 h;
    public k56 i;
    public k56 j;
    public final float k;
    public boolean l;
    public final rp0 m;

    public sp0(Context context, int i, float f, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = (z2 || Build.VERSION.SDK_INT < 31) ? new bme(context) : new aea(1);
        this.d = new khe(new a5(context, 5));
        this.e = new qp0(0, this);
        this.k = f;
        this.m = new rp0(this, context, z2);
    }

    public final View a() {
        Object callback = getCallback();
        while (callback != null) {
            if (callback instanceof Drawable) {
                callback = ((Drawable) callback).getCallback();
            }
            if (callback instanceof View) {
                return (View) callback;
            }
        }
        return null;
    }

    public final void b(boolean z) {
        View rootView;
        View viewA = a();
        if (viewA == null || (rootView = viewA.getRootView()) == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = viewA.getViewTreeObserver();
        qp0 qp0Var = this.e;
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(qp0Var);
        }
        ViewTreeObserver viewTreeObserver2 = rootView.getViewTreeObserver();
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.removeOnPreDrawListener(qp0Var);
        }
        if (z) {
            rootView.getViewTreeObserver().addOnPreDrawListener(qp0Var);
            if (tpa.f(rootView.getWindowId(), viewA.getWindowId())) {
                return;
            }
            viewA.getViewTreeObserver().addOnPreDrawListener(qp0Var);
        }
    }

    public final void c() {
        Bitmap bitmap;
        View viewA;
        op0 op0Var;
        pp0 pp0Var = this.h;
        if (pp0Var == null || (bitmap = this.g) == null || (viewA = a()) == null || (op0Var = this.c) == null) {
            return;
        }
        View rootView = viewA.getRootView();
        bitmap.eraseColor(0);
        pp0Var.save();
        k56 k56Var = this.i;
        if (k56Var != null) {
            k56Var.invoke();
        }
        int[] iArr = n;
        rootView.getLocationOnScreen(iArr);
        int[] iArr2 = o;
        viewA.getLocationOnScreen(iArr2);
        int i = iArr2[0] - iArr[0];
        int i2 = iArr2[1] - iArr[1];
        float height = viewA.getHeight() / bitmap.getHeight();
        float width = viewA.getWidth() / bitmap.getWidth();
        pp0Var.translate((-i) / width, (-i2) / height);
        float f = 1;
        pp0Var.scale(f / width, f / height);
        try {
            rootView.draw(pp0Var);
        } catch (Throwable th) {
            hm9.l0(sp0.class.getName(), "fail to draw blur", th);
        }
        pp0Var.restore();
        if (!bitmap.isRecycled()) {
            op0Var.d(bitmap, this.k);
            this.f = true;
        }
        k56 k56Var2 = this.j;
        if (k56Var2 != null) {
            k56Var2.invoke();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f || (canvas instanceof pp0) || (bitmap = this.g) == null || bitmap.isRecycled()) {
            return;
        }
        int iSave = canvas.save();
        canvas.scale(getBounds().width() / bitmap.getWidth(), getBounds().height() / bitmap.getHeight(), 0.0f, 0.0f);
        try {
            if (canvas.isHardwareAccelerated()) {
                op0 op0Var = this.c;
                if (op0Var != null) {
                    op0Var.c(canvas, bitmap);
                }
            } else {
                ((bme) this.d.getValue()).c(canvas, bitmap);
            }
            canvas.restoreToCount(iSave);
            int i = this.a;
            if (i != 0) {
                canvas.drawColor(i);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        c();
        if (this.l) {
            return;
        }
        View viewA = a();
        if (viewA != null) {
            viewA.addOnAttachStateChangeListener(this.m);
        }
        this.l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        b(this.b);
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (((int) Math.ceil(iWidth / 6.0f)) == 0 || ((int) Math.ceil(iHeight / 6.0f)) == 0) {
            return;
        }
        this.f = false;
        int iCeil = (int) Math.ceil(rect.width() / 6.0f);
        int i = iCeil % 64;
        if (i != 0) {
            iCeil = (iCeil - i) + 64;
        }
        int iCeil2 = (int) Math.ceil(rect.height() / (rect.width() / iCeil));
        Bitmap bitmapCreateBitmap = this.g;
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled() || iCeil >= bitmapCreateBitmap.getWidth() || iCeil2 >= bitmapCreateBitmap.getHeight()) {
            bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.g;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.g = bitmapCreateBitmap;
        } else {
            bitmapCreateBitmap.reconfigure(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
        }
        this.h = new pp0(bitmapCreateBitmap);
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        op0 op0Var = this.c;
        if (op0Var != null) {
            op0Var.p(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
