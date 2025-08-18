package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c4f extends ReplacementSpan {
    public static TextPaint Y;
    public TextPaint X;
    public final b4f b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public short c = -1;
    public float o = 1.0f;

    public c4f(b4f b4fVar) {
        c54.o(b4fVar, "rasterizer cannot be null");
        this.b = b4fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r14, java.lang.CharSequence r15, int r16, int r17, float r18, int r19, int r20, int r21, android.graphics.Paint r22) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4f.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        b4f b4fVar = this.b;
        this.o = fAbs / (b4fVar.c().a(14) != 0 ? ((ByteBuffer) r8.o).getShort(r1 + r8.a) : (short) 0);
        l99 l99VarC = b4fVar.c();
        int iA = l99VarC.a(14);
        if (iA != 0) {
            ((ByteBuffer) l99VarC.o).getShort(iA + l99VarC.a);
        }
        short s = (short) ((b4fVar.c().a(12) != 0 ? ((ByteBuffer) r5.o).getShort(r7 + r5.a) : (short) 0) * this.o);
        this.c = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
