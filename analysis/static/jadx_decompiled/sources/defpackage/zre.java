package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* loaded from: classes.dex */
public final class zre extends View implements kre {
    public static final /* synthetic */ bc7[] x0 = {new oi9(zre.class, "themeName", "getThemeName()Ljava/lang/String;"), rh4.g(nec.a, zre.class, "patternDrawable", "getPatternDrawable()Landroid/graphics/drawable/Drawable;")};
    public final xre a;
    public final GradientDrawable b;
    public final xre c;
    public final Paint o;
    public final Paint s0;
    public final RectF t0;
    public final RectF u0;
    public LinearGradient v0;
    public LinearGradient w0;

    public zre(Context context) {
        super(context);
        this.a = new xre(qp4.u0.p(this).a, this, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 10.0f);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        l73 l73Var = getTheme().a().s().b.a;
        gradientDrawable.setColors(new int[]{l73Var.g, l73Var.h});
        this.b = gradientDrawable;
        this.c = new xre(gradientDrawable, this, 1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 1.0f);
        paint.setColor(getTheme().i().b.b);
        this.o = paint;
        this.s0 = new Paint(1);
        this.t0 = new RectF();
        this.u0 = new RectF();
        setBackground(gradientDrawable);
        setClipToOutline(true);
        setOutlineProvider(new e62(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fka getTheme() {
        fka fkaVarA;
        pq9 pq9Var = qp4.u0;
        sba sbaVarF = ((adb) pq9Var.b(getContext()).X).f(getThemeName());
        return (sbaVarF == null || (fkaVarA = sbaVarF.a(pq9Var.b(getContext()).j())) == null) ? pq9Var.b(getContext()).i() : fkaVarA;
    }

    public final void b() {
        float f = fk4.d().getDisplayMetrics().density * 8.0f;
        float f2 = fk4.d().getDisplayMetrics().density * 30.0f;
        float f3 = (fk4.d().getDisplayMetrics().density * 48.0f) + f;
        float f4 = (fk4.d().getDisplayMetrics().density * 24.0f) + f2;
        int[] incomingColors = getIncomingColors();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.v0 = new LinearGradient(f3, f2, f, f4, incomingColors, (float[]) null, tileMode);
        float f5 = fk4.d().getDisplayMetrics().density * 16.0f;
        this.w0 = new LinearGradient((fk4.d().getDisplayMetrics().density * 48.0f) + f5, (fk4.d().getDisplayMetrics().density * 4.0f) + f4, f5, getHeight() - (fk4.d().getDisplayMetrics().density * 30.0f), getOutgoingColors(), (float[]) null, tileMode);
    }

    public final int[] getIncomingColors() {
        return getTheme().a().g().a.o;
    }

    public final int[] getOutgoingColors() {
        return getTheme().a().k().a.o;
    }

    public final Drawable getPatternDrawable() {
        bc7 bc7Var = x0[1];
        return (Drawable) this.c.b;
    }

    public final String getThemeName() {
        bc7 bc7Var = x0[0];
        return (String) this.a.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = (fk4.d().getDisplayMetrics().density * 1.0f) / 2;
        canvas.drawRoundRect(f, f, getWidth() - f, getHeight() - f, (fk4.d().getDisplayMetrics().density * 10.0f) - f, (fk4.d().getDisplayMetrics().density * 10.0f) - f, this.o);
        RectF rectF = this.t0;
        rectF.set(fk4.d().getDisplayMetrics().density * 8.0f, fk4.d().getDisplayMetrics().density * 30.0f, (fk4.d().getDisplayMetrics().density * 48.0f) + (fk4.d().getDisplayMetrics().density * 8.0f), (fk4.d().getDisplayMetrics().density * 24.0f) + (fk4.d().getDisplayMetrics().density * 30.0f));
        Paint paint = this.s0;
        paint.setShader(this.v0);
        canvas.drawRoundRect(rectF, fk4.d().getDisplayMetrics().density * 8.0f, fk4.d().getDisplayMetrics().density * 8.0f, paint);
        RectF rectF2 = this.u0;
        rectF2.set(fk4.d().getDisplayMetrics().density * 16.0f, (fk4.d().getDisplayMetrics().density * 4.0f) + rectF.bottom, (fk4.d().getDisplayMetrics().density * 48.0f) + (fk4.d().getDisplayMetrics().density * 16.0f), getHeight() - (fk4.d().getDisplayMetrics().density * 30.0f));
        paint.setShader(this.w0);
        canvas.drawRoundRect(rectF2, fk4.d().getDisplayMetrics().density * 8.0f, fk4.d().getDisplayMetrics().density * 8.0f, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(tu0.G(72 * fk4.d().getDisplayMetrics().density), tu0.G(112 * fk4.d().getDisplayMetrics().density));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.o.setColor(getTheme().i().b.b);
        GradientDrawable gradientDrawable = this.b;
        l73 l73Var = getTheme().a().s().b.a;
        gradientDrawable.setColors(new int[]{l73Var.g, l73Var.h});
        b();
        invalidate();
    }

    public final void setBackgroundPattern(Drawable drawable) {
        setBackground(drawable);
    }

    public final void setPatternDrawable(Drawable drawable) {
        this.c.o1(this, x0[1], drawable);
    }

    public final void setThemeName(String str) {
        this.a.o1(this, x0[0], str);
    }
}
