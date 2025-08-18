package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class cmd extends FrameLayout {
    public final Paint a;
    public final bmd b;
    public boolean c;

    public cmd(Context context) {
        super(context, null, 0);
        this.a = new Paint();
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
        bkgVar.v(pq9Var.j(this).getText().e);
        yldVar.d = pq9Var.j(this).f().a;
        bkgVar.u();
        bkgVar.x(tu0.G(360 * fk4.d().getDisplayMetrics().density));
        a(bkgVar.m());
    }

    public final void a(yld yldVar) {
        this.b.b(yldVar);
        if (yldVar.j) {
            setLayerType(2, this.a);
        } else {
            setLayerType(0, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.d();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }
}
