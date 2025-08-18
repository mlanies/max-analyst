package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class ak extends yl5 implements dvd, me {
    public final long Z;
    public final zj s0;

    public ak(long j, zj zjVar) {
        super((Drawable) zjVar, sl5.a, true);
        this.Z = j;
        this.s0 = zjVar;
    }

    @Override // defpackage.dvd
    public final Drawable b() {
        return this.s0;
    }

    @Override // defpackage.yl5, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) throws InterruptedException {
        canvas.save();
        canvas.translate(f, i3);
        canvas.clipRect(this.c);
        oq9 oq9Var = zj.z0;
        this.s0.a(canvas, 0.0f, 0.0f, r3.getBounds().height(), paint);
        canvas.restore();
    }

    @Override // defpackage.yl5
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return this.Z == akVar.Z && tpa.f(this.s0, akVar.s0);
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        return this.s0;
    }

    @Override // defpackage.yl5, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int size = super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        zj zjVar = this.s0;
        if (size <= 0) {
            hm9.n(ak.class.getName(), "Empty size when try get size from span");
            size = zjVar.getBounds().right;
        }
        zjVar.getClass();
        bc7 bc7Var = zj.A0[0];
        if (vj.$EnumSwitchMapping$0[((uj) zjVar.Z.b).ordinal()] != 1 || (zjVar.c instanceof ki)) {
            return size;
        }
        return 0;
    }

    @Override // defpackage.yl5
    public final int hashCode() {
        return (Long.hashCode(this.Z) * 31) + (this.s0.hashCode() * 31) + ak.class.hashCode();
    }
}
