package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;

/* loaded from: classes2.dex */
public final class f5b {
    public final int a;
    public final int b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final int f;
    public final RectF g;
    public float h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final gqb l;

    public f5b(int i, Context context, gqb gqbVar) {
        this.l = gqbVar;
        bk4 bk4VarB = bk4.b();
        int i2 = bk4VarB.i;
        int i3 = bk4VarB.b;
        int i4 = bk4VarB.a;
        this.a = i4;
        int i5 = bk4VarB.h;
        this.b = i5;
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context);
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(smeVarR.w);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        this.d = paint;
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setColor(ote.b0(smeVarR.m, 0.6f));
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        int i6 = i - i5;
        this.f = i6;
        float f = i3 / 2.0f;
        float f2 = i4;
        RectF rectF = new RectF(((-i5) * 2) + f + f2, i6 - i5, (i5 * 2) + f + f2, i5 + i6 + i2);
        this.g = rectF;
        float f3 = i6;
        RectF rectF2 = new RectF(rectF.centerX() - f, -10.0f, rectF.centerX() + f, f3);
        this.i = rectF2;
        float f4 = rectF2.left;
        this.j = new RectF(f4 - f2, 0.0f, f4, f3);
        float f5 = rectF2.right;
        this.k = new RectF(f5, 0.0f, f2 + f5, f3);
    }

    public final float a() {
        return ((RangeSeekBarView) this.l).c(this.i.centerX());
    }

    public final void b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        gqb gqbVar = this.l;
        if (action == 0) {
            this.h = ((RangeSeekBarView) gqbVar).b(a()) - motionEvent.getX();
        } else {
            if (action != 2) {
                return;
            }
            c(((RangeSeekBarView) gqbVar).c(motionEvent.getX() + this.h));
        }
    }

    public final void c(float f) {
        float fB = ((RangeSeekBarView) this.l).b(f);
        RectF rectF = this.g;
        rectF.offsetTo(fB - (rectF.width() / 2.0f), rectF.top);
        RectF rectF2 = this.i;
        rectF2.offsetTo(rectF.centerX() - (rectF2.width() / 2.0f), 0.0f);
        this.j.offsetTo(rectF2.left - this.a, 0.0f);
        this.k.offsetTo(rectF2.right, 0.0f);
    }
}
