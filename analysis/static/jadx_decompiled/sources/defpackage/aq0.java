package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;

/* loaded from: classes2.dex */
public final class aq0 {
    public final int a;
    public final Paint b;
    public final Paint c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Path h;
    public final int i;
    public final RectF j;
    public final RectF k;
    public final float[] l;
    public float m;
    public final gqb n;

    public aq0(int i, Context context, gqb gqbVar) {
        this.i = i;
        this.n = gqbVar;
        bk4 bk4VarB = bk4.b();
        int i2 = bk4VarB.j;
        this.a = i2;
        int i3 = bk4VarB.z;
        this.d = i2;
        int i4 = bk4VarB.d;
        this.e = i4;
        this.f = i2;
        this.g = lt3.a(context, epc.e);
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context);
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(smeVarR.o);
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(smeVarR.w);
        paint2.setStrokeWidth(bk4VarB.b);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        this.h = new Path();
        if (i == 1) {
            RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) gqbVar;
            this.j = new RectF(rangeSeekBarView.b(0.0f) - i2, 0.0f, rangeSeekBarView.b(0.0f), i3);
            float f = i4;
            this.l = new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
        } else {
            RangeSeekBarView rangeSeekBarView2 = (RangeSeekBarView) gqbVar;
            this.j = new RectF(rangeSeekBarView2.b(1.0f), 0.0f, rangeSeekBarView2.b(1.0f) + i2, i3);
            float f2 = i4;
            this.l = new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2};
        }
        RectF rectF = this.j;
        float f3 = i2;
        this.k = new RectF(rectF.left - f3, rectF.top, rectF.right + f3, rectF.bottom);
    }

    public final void a(Canvas canvas) {
        Path path = this.h;
        path.reset();
        RectF rectF = this.j;
        path.addRoundRect(rectF, this.l, Path.Direction.CW);
        Paint paint = this.b;
        int i = this.i;
        int i2 = this.g;
        int i3 = this.e;
        if (i == 0) {
            paint.setShadowLayer(i3, -1.0f, 0.0f, i2);
        } else {
            paint.setShadowLayer(i3, 1.0f, 0.0f, i2);
        }
        canvas.drawPath(path, paint);
        float f = this.f / 2.0f;
        canvas.drawLine(rectF.centerX(), rectF.centerY() - f, rectF.centerX(), rectF.centerY() + f, this.c);
    }

    public final float b() {
        RectF rectF = this.j;
        int i = this.i;
        gqb gqbVar = this.n;
        if (i == 0) {
            return ((RangeSeekBarView) gqbVar).c(rectF.right);
        }
        return ((RangeSeekBarView) gqbVar).c(rectF.left);
    }

    public final void c(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        gqb gqbVar = this.n;
        if (action == 0) {
            this.m = ((RangeSeekBarView) gqbVar).b(b()) - motionEvent.getX();
        } else {
            if (action != 2) {
                return;
            }
            e(((RangeSeekBarView) gqbVar).c(motionEvent.getX() + this.m));
        }
    }

    public final void d() {
        RectF rectF = this.j;
        RectF rectF2 = this.k;
        int i = this.i;
        int i2 = this.d;
        if (i == 0) {
            rectF2.set(rectF.left - i2, rectF.top, rectF.right, rectF.bottom);
        } else {
            rectF2.set(rectF.left, rectF.top, rectF.right + i2, rectF.bottom);
        }
    }

    public final void e(float f) {
        int i = this.i;
        int i2 = this.d;
        gqb gqbVar = this.n;
        float fB = i == 0 ? ((RangeSeekBarView) gqbVar).b(f) - this.a : ((RangeSeekBarView) gqbVar).b(f);
        float f2 = fB - i2;
        RectF rectF = this.j;
        rectF.offsetTo(fB, rectF.top);
        RectF rectF2 = this.k;
        rectF2.offsetTo(f2, rectF2.top);
    }
}
