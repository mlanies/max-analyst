package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import java.util.EnumMap;
import one.me.sdk.richvector.VectorPath;

/* loaded from: classes2.dex */
public final class ph5 extends Drawable implements kre {
    public final TextPaint X;
    public final je7 Y;
    public final BoringLayout.Metrics Z;
    public final Context a;
    public final oh5 b;
    public uf5 c;
    public final RectF o;
    public BoringLayout s0;
    public final float t0;
    public float u0;

    public /* synthetic */ ph5(Context context) {
        this(context, new oh5(context));
    }

    public final void a(uf5 uf5Var) {
        if (tpa.f(this.c, uf5Var)) {
            return;
        }
        this.c = uf5Var;
        onThemeChanged(qp4.u0.b(this.a).i());
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = fk4.d().getDisplayMetrics().density * 6.0f * this.u0;
        float f2 = fk4.d().getDisplayMetrics().density * 2.0f * this.u0;
        int iSave = canvas.save();
        canvas.translate(f, f2);
        try {
            this.b.draw(canvas);
            canvas.restoreToCount(iSave);
            float f3 = fk4.d().getDisplayMetrics().density * 4.0f * this.u0;
            RectF rectF = this.o;
            je7 je7Var = this.Y;
            canvas.drawRoundRect(rectF, f3, f3, (Paint) je7Var.getValue());
            BoringLayout boringLayout = this.s0;
            if (boringLayout == null) {
                return;
            }
            float f4 = z7b.f(rectF.width(), boringLayout.getWidth(), 0.5f, rectF.left);
            float f5 = z7b.f(rectF.height(), boringLayout.getHeight(), 0.5f, rectF.top);
            iSave = canvas.save();
            canvas.translate(f4, f5);
            try {
                boringLayout.getPaint().setAlpha(((Paint) je7Var.getValue()).getAlpha());
                boringLayout.draw(canvas);
            } finally {
            }
        } finally {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        oh5 oh5Var = this.b;
        if (oh5Var.getCallback() != getCallback()) {
            oh5Var.setCallback(getCallback());
        }
        oh5Var.invalidateSelf();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int iWidth = rect.width();
        if (iWidth == 0) {
            return;
        }
        float f = iWidth;
        this.u0 = f / tu0.G(40 * fk4.d().getDisplayMetrics().density);
        uf5 uf5Var = this.c;
        if (uf5Var == null) {
            return;
        }
        this.b.setBounds(0, 0, tu0.G(tu0.G(28 * fk4.d().getDisplayMetrics().density) * this.u0), tu0.G(tu0.G(36 * fk4.d().getDisplayMetrics().density) * this.u0));
        RectF rectF = this.o;
        rectF.set(fk4.d().getDisplayMetrics().density * 4.0f * this.u0, fk4.d().getDisplayMetrics().density * 18.0f * this.u0, f - ((fk4.d().getDisplayMetrics().density * 4.0f) * this.u0), f - ((fk4.d().getDisplayMetrics().density * 8.0f) * this.u0));
        TextPaint textPaint = this.X;
        try {
            textPaint.setTextSize(this.t0 * fk4.d().getDisplayMetrics().density * this.u0);
            BoringLayout.Metrics metrics = this.Z;
            textPaint.getFontMetricsInt(metrics);
            this.s0 = BoringLayout.make(uf5Var.a(), textPaint, tu0.G(rectF.width()), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, metrics, false);
        } catch (Throwable th) {
            this.s0 = null;
            hm9.p(ph5.class.getName(), "fail to generate boring layout for " + uf5Var.a(), th);
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        uf5 uf5Var = this.c;
        if (uf5Var == null) {
            return;
        }
        int i = fkaVar.a().s().b.b.e;
        int iC = fkaVar.a().c(uf5Var.b().b);
        int iC2 = fkaVar.a().c(uf5Var.b().c);
        oh5 oh5Var = this.b;
        VectorPath vectorPath = (VectorPath) oh5Var.a.getValue();
        if (vectorPath != null) {
            vectorPath.setFillColor(i);
        }
        VectorPath vectorPath2 = (VectorPath) oh5Var.b.getValue();
        if (vectorPath2 != null) {
            vectorPath2.setFillColor(iC);
        }
        VectorPath vectorPath3 = (VectorPath) oh5Var.c.getValue();
        if (vectorPath3 != null) {
            vectorPath3.setFillColor(iC2);
        }
        ((Paint) this.Y.getValue()).setColor(fkaVar.a().c(uf5Var.b().a));
        this.X.setColor(fkaVar.a().c(uf5Var.b().X));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        ((Paint) this.Y.getValue()).setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public ph5(Context context, oh5 oh5Var) {
        this.a = context;
        this.b = oh5Var;
        this.o = new RectF();
        TextPaint textPaint = new TextPaint();
        this.X = textPaint;
        this.Y = tu0.r(3, new fh5(2));
        this.Z = new BoringLayout.Metrics();
        this.t0 = 9.0f;
        long jB = ck4.b(1, 9.0f);
        long jB2 = ck4.b(1, 14.0f);
        long jB3 = ck4.b(0, 0.03f);
        String str = i4f.s.f;
        EnumMap enumMap = new EnumMap(du4.class);
        du4 du4Var = du4.b;
        k7d.l(jB, enumMap, du4Var, du4.class).put((EnumMap) du4Var, (du4) new ck4(jB2));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        textPaint.setTypeface(Typeface.create(Typeface.create(str, 0), 500, false));
        textPaint.setLetterSpacing(ck4.d(jB3, displayMetrics));
        ck4 ck4Var = (ck4) enumMap.get(du4Var);
        textPaint.setTextSize(ck4.d((ck4Var == null ? (ck4) x53.f0(enumMap.values()) : ck4Var).a, displayMetrics));
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
        this.u0 = 1.0f;
    }
}
