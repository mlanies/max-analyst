package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class uwe extends q18 implements cpe {
    public CharSequence J0;
    public final Context K0;
    public final Paint.FontMetrics L0;
    public final dpe M0;
    public final qq0 N0;
    public final Rect O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public boolean T0;
    public int U0;
    public int V0;
    public float W0;
    public float X0;
    public float Y0;
    public float Z0;

    public uwe(Context context, int i) {
        super(context, null, 0, i);
        this.L0 = new Paint.FontMetrics();
        dpe dpeVar = new dpe(this);
        this.M0 = dpeVar;
        this.N0 = new qq0(13, this);
        this.O0 = new Rect();
        this.W0 = 1.0f;
        this.X0 = 1.0f;
        this.Y0 = 0.5f;
        this.Z0 = 1.0f;
        this.K0 = context;
        TextPaint textPaint = dpeVar.a;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // defpackage.q18, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        float fR = r();
        float f = (float) (-((Math.sqrt(2.0d) * this.U0) - this.U0));
        canvas.scale(this.W0, this.X0, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.Y0) + getBounds().top);
        canvas.translate(fR, f);
        super.draw(canvas);
        if (this.J0 != null) {
            float fCenterY = getBounds().centerY();
            dpe dpeVar = this.M0;
            TextPaint textPaint = dpeVar.a;
            Paint.FontMetrics fontMetrics = this.L0;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            voe voeVar = dpeVar.g;
            TextPaint textPaint2 = dpeVar.a;
            if (voeVar != null) {
                textPaint2.drawableState = getState();
                dpeVar.g.e(this.K0, textPaint2, dpeVar.b);
                textPaint2.setAlpha((int) (this.Z0 * 255.0f));
            }
            CharSequence charSequence = this.J0;
            canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i, textPaint2);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.M0.a.getTextSize(), this.R0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.P0 * 2;
        CharSequence charSequence = this.J0;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.M0.a(charSequence.toString())), this.Q0);
    }

    @Override // defpackage.q18, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.T0) {
            i8g i8gVarE = this.a.a.e();
            i8gVarE.k = s();
            setShapeAppearanceModel(i8gVarE.c());
        }
    }

    public final float r() {
        int i;
        Rect rect = this.O0;
        if (((rect.right - getBounds().right) - this.V0) - this.S0 < 0) {
            i = ((rect.right - getBounds().right) - this.V0) - this.S0;
        } else {
            if (((rect.left - getBounds().left) - this.V0) + this.S0 <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.V0) + this.S0;
        }
        return i;
    }

    public final i2a s() {
        float f = -r();
        float fWidth = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.U0))) / 2.0f;
        return new i2a(new f08(this.U0), Math.min(Math.max(f, -fWidth), fWidth));
    }
}
