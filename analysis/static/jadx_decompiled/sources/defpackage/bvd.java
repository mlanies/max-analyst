package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes2.dex */
public final class bvd extends ReplacementSpan {
    public final int a;

    public bvd(int i) {
        this.a = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bvd) {
            return this.a == ((bvd) obj).a;
        }
        return false;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return this.a;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.a) * 31) + bvd.class.hashCode();
    }
}
