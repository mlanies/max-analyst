package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class fmd extends TextView {
    public final Paint a;
    public final bmd b;
    public boolean c;

    public fmd(Context context) {
        super(context, null);
        Paint paint = new Paint();
        this.a = paint;
        bmd bmdVar = new bmd();
        this.b = bmdVar;
        this.c = true;
        setWillNotDraw(false);
        bmdVar.setCallback(this);
        bkg bkgVar = new bkg(25);
        yld yldVar = (yld) bkgVar.b;
        yldVar.k = false;
        yldVar.i = 0.0f;
        pq9 pq9Var = qp4.u0;
        bkgVar.v(pq9Var.j(this).getText().h);
        pq9Var.j(this).getText();
        yldVar.d = -1;
        bkgVar.u();
        bkgVar.x(tu0.G(360 * fk4.d().getDisplayMetrics().density));
        yld yldVarM = bkgVar.m();
        bmdVar.b(yldVarM);
        if (yldVarM.j) {
            setLayerType(2, paint);
        } else {
            setLayerType(0, null);
        }
    }

    public final void a(boolean z) {
        bmd bmdVar = this.b;
        if (!z) {
            bmdVar.d();
            this.c = false;
            invalidate();
        } else {
            this.c = true;
            if (z) {
                bmdVar.c();
            }
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.d();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }
}
