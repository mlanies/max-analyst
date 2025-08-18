package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* loaded from: classes.dex */
public final class fcf extends ImageSpan implements kre {
    public final m56 X;
    public final Resources Y;
    public ecf Z;
    public final Context a;
    public final int b;
    public final boolean c;
    public final boolean o;

    public fcf(Context context, int i, boolean z, m56 m56Var) {
        super(context, i == 1 ? woc.h2 : woc.i2, 2);
        this.a = context;
        this.b = i;
        this.c = true;
        this.o = z;
        this.X = m56Var;
        this.Y = Resources.getSystem();
        this.Z = new ecf(context, i, m56Var);
        onThemeChanged(qp4.u0.b(context).i());
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iSave = canvas.save();
        try {
            int i6 = paint.getFontMetricsInt().descent;
            float f2 = 2;
            canvas.translate(f, ((i4 + i6) - ((i6 - r3.ascent) / f2)) - ((this.Z.getBounds().bottom - this.Z.getBounds().top) / f2));
            this.Z.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        return this.Z;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int I = i24.I(paint.getTextSize() / this.Y.getDisplayMetrics().density);
        if (I != this.b) {
            this.Z = new ecf(this.a, I, this.X);
        }
        int iG = tu0.G(h4f.f(I) * fk4.d().getDisplayMetrics().density);
        int i3 = this.c ? iG : 0;
        if (!this.o) {
            iG = 0;
        }
        ecf ecfVar = this.Z;
        float fI = h4f.i(I);
        ecfVar.setBounds(i3, 0, rh4.c(fI, fk4.d().getDisplayMetrics().density, i3), tu0.G(fk4.d().getDisplayMetrics().density * fI));
        return wg0.d(fI, fk4.d().getDisplayMetrics().density, i3, iG);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        ecf ecfVar = this.Z;
        if (!(ecfVar instanceof ecf)) {
            ecfVar = null;
        }
        if (ecfVar != null) {
            ecfVar.onThemeChanged(fkaVar);
        }
    }
}
