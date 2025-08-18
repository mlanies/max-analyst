package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class kge extends Drawable {
    public final pte a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public kge(String str, int i, int i2, int i3, pte pteVar) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.a = pteVar;
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kge mutate() {
        pte pteVar = this.a;
        pteVar.getClass();
        Paint paint = new Paint(pteVar.g);
        pte pteVar2 = new pte(pteVar.a, pteVar.b, pteVar.c);
        pteVar2.g = paint;
        pteVar2.j = true;
        return new kge(this.b, this.c, this.d, this.e, pteVar2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        pte pteVar = this.a;
        if (!pteVar.j) {
            hm9.m0(pte.class.getSimpleName(), "error: cant' render svg, incorrect data!", new Object[0]);
            return;
        }
        float f = pteVar.f;
        int iSave = canvas.save();
        canvas.scale(f, f, 0.0f, 0.0f);
        try {
            canvas.drawPaint(pteVar.g);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.g.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.g.setColorFilter(colorFilter);
    }

    public kge(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = 1;
        if (jge.$EnumSwitchMapping$0[au1.s(1)] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        pte pteVar = new pte(str, i, i2);
        this.a = pteVar;
    }
}
