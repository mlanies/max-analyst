package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes2.dex */
public final class wv1 extends View {
    public static final float A0;
    public static final float B0;
    public static final float C0;
    public static final /* synthetic */ bc7[] w0;
    public static final float x0;
    public static final float y0;
    public static final float z0;
    public final yj a;
    public final ArgbEvaluator b;
    public final FloatEvaluator c;
    public ValueAnimator o;
    public final Paint s0;
    public final Paint t0;
    public float u0;
    public float v0;

    static {
        oi9 oi9Var = new oi9(wv1.class, "type", "getType()Lone/me/sdk/gallery/view/quickcamera/CameraCentralButton$Type;");
        nec.a.getClass();
        w0 = new bc7[]{oi9Var};
        float f = fk4.d().getDisplayMetrics().density * 4.0f;
        x0 = f;
        y0 = f / 2;
        z0 = fk4.d().getDisplayMetrics().density * 4.0f;
        A0 = fk4.d().getDisplayMetrics().density * 8.0f;
        B0 = fk4.d().getDisplayMetrics().density * 4.0f;
        C0 = fk4.d().getDisplayMetrics().density * 14.0f;
    }

    public wv1(Context context) {
        super(context, null);
        this.a = new yj(this);
        this.b = new ArgbEvaluator();
        this.c = new FloatEvaluator();
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(x0);
        this.s0 = paint;
        Paint paint2 = new Paint();
        qp4.u0.j(this).i();
        paint2.setColor(1308622847);
        this.t0 = paint2;
        this.u0 = z0;
    }

    public final vv1 getType() {
        bc7 bc7Var = w0[0];
        return (vv1) this.a.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        canvas.drawCircle(width, width, width - y0, this.s0);
        float f = x0 + this.u0;
        float fFloatValue = this.c.evaluate(this.v0, (Number) Float.valueOf(1.0f), (Number) Float.valueOf(0.5f)).floatValue() * ((getWidth() - f) / 2);
        canvas.drawRoundRect(f, f, getWidth() - f, getHeight() - f, fFloatValue, fFloatValue, this.t0);
        super.onDraw(canvas);
    }

    public final void setType(vv1 vv1Var) {
        this.a.o1(this, w0[0], vv1Var);
    }
}
