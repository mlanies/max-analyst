package ru.ok.messages.media.trim.rangeSeekBar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.view.View;
import defpackage.aq0;
import defpackage.bk4;
import defpackage.bq7;
import defpackage.ce;
import defpackage.cqc;
import defpackage.f5b;
import defpackage.fm9;
import defpackage.ft;
import defpackage.gqb;
import defpackage.hb3;
import defpackage.hk9;
import defpackage.khe;
import defpackage.lt1;
import defpackage.muc;
import defpackage.nl9;
import defpackage.ote;
import defpackage.p4c;
import defpackage.r0a;
import defpackage.sd7;
import defpackage.sme;
import defpackage.u3a;
import defpackage.yt8;
import java.util.Set;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* loaded from: classes2.dex */
public class RangeSeekBarView extends View implements gqb {
    public static int Q0 = 0;
    public static float R0 = 1.0f;
    public static float S0 = 1.0f;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public long E0;
    public boolean F0;
    public final LongSparseArray G0;
    public Rect H0;
    public FrgTrimVideo I0;
    public sd7 J0;
    public final Paint K0;
    public int L0;
    public float M0;
    public long N0;
    public final bk4 O0;
    public final boolean P0;
    public final int a;
    public final int b;
    public final int c;
    public u3a o;
    public final int s0;
    public final Paint t0;
    public int u0;
    public f5b v0;
    public aq0 w0;
    public aq0 x0;
    public boolean y0;
    public float z0;

    public RangeSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.G0 = new LongSparseArray();
        getContext();
        bk4 bk4VarB = bk4.b();
        this.O0 = bk4VarB;
        int i = bk4VarB.h;
        this.a = i;
        int i2 = bk4VarB.e;
        this.b = i2;
        this.c = i + i2;
        Paint paint = new Paint();
        this.t0 = paint;
        Context context2 = getContext();
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context2);
        paint.setColor(ote.b0(smeVarR.m, 0.8f));
        Paint paint2 = new Paint();
        this.K0 = paint2;
        paint2.setColor(smeVarR.m);
        paint2.setStrokeWidth(1.0f);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        this.s0 = bk4VarB.z;
        setLayerType(1, null);
        this.P0 = getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final void a() {
        int i = this.u0;
        if (i == 0) {
            if (this.w0.b() > this.x0.b()) {
                this.w0.e(this.x0.b());
            } else if (this.w0.b() < 0.0f) {
                this.w0.e(0.0f);
            }
            if (this.x0.b() - this.w0.b() > this.A0) {
                this.w0.e(this.x0.b() - this.A0);
            } else if (this.x0.b() - this.w0.b() < this.z0) {
                this.w0.e(this.x0.b() - this.z0);
            }
        } else if (i == 1) {
            if (this.x0.b() < this.w0.b()) {
                this.x0.e(this.w0.b());
            } else {
                float fB = this.x0.b();
                float f = R0;
                if (fB > f) {
                    this.x0.e(f);
                }
            }
            if (this.x0.b() - this.w0.b() > this.A0) {
                this.x0.e(this.w0.b() + this.A0);
            } else if (this.x0.b() - this.w0.b() < this.z0) {
                this.x0.e(this.w0.b() + this.z0);
            }
        }
        if (this.v0.a() < this.w0.b()) {
            this.v0.c(this.w0.b());
            this.y0 = true;
        } else if (this.v0.a() > this.x0.b()) {
            this.v0.c(this.x0.b());
            this.y0 = true;
        }
        getContext();
        float fA = bk4.a(48.0f);
        float f2 = this.x0.j.left - (this.O0.j * 2);
        aq0 aq0Var = this.w0;
        RectF rectF = aq0Var.j;
        float f3 = rectF.right;
        if (fA > f2 - f3) {
            aq0Var.d();
            this.x0.d();
            return;
        }
        RectF rectF2 = aq0Var.k;
        float f4 = rectF.left;
        float f5 = aq0Var.d;
        rectF2.set(f4 - f5, rectF.top, f3 + f5, rectF.bottom);
        aq0 aq0Var2 = this.x0;
        RectF rectF3 = aq0Var2.k;
        RectF rectF4 = aq0Var2.j;
        float f6 = rectF4.left;
        float f7 = aq0Var2.d;
        rectF3.set(f6 - f7, rectF4.top, rectF4.right + f7, rectF4.bottom);
    }

    public final float b(float f) {
        return (((f - 0.0f) / S0) * Q0) + this.O0.j + this.a;
    }

    public final float c(float f) {
        return ((((f - this.O0.j) - this.a) * S0) / Q0) + 0.0f;
    }

    public final int d(long j) {
        long j2 = this.E0;
        return ((int) (((j - (0.0f * j2)) / (S0 * j2)) * Q0)) + this.O0.j + this.a;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cqc.b(this.J0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.F0) {
            boolean z = this.P0;
            if (z) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, canvas.getWidth() / 2, canvas.getHeight() / 2);
            }
            canvas.save();
            canvas.translate(0.0f, this.b);
            if (this.N0 != 0) {
                canvas.save();
                canvas.clipRect(this.H0);
                long j = this.N0;
                long j2 = (((long) (this.E0 * 0.0f)) / j) * j;
                long j3 = (j * (((int) this.M0) + 2)) + j2;
                int iD = d(j2);
                int iD2 = d(j3);
                int i = iD;
                while (i < iD2) {
                    float f = i;
                    canvas.drawLine(f, 0, f, this.L0, this.K0);
                    i += this.L0;
                    j3 = j3;
                }
                long j4 = j3;
                LongSparseArray longSparseArray = this.G0;
                if (longSparseArray.size() != 0) {
                    if (z) {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, canvas.getWidth() / 2, canvas.getHeight() / 2);
                    }
                    for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                        long jKeyAt = longSparseArray.keyAt(i2);
                        int iD3 = d(jKeyAt);
                        if (z) {
                            iD3 = getWidth() - iD3;
                        }
                        if (jKeyAt > j2 || jKeyAt < j4) {
                            canvas.drawBitmap((Bitmap) longSparseArray.valueAt(i2), iD3, 0, (Paint) null);
                        }
                    }
                    if (z) {
                        canvas.restore();
                    }
                }
                canvas.restore();
            }
            float fB = this.w0.b();
            bk4 bk4Var = this.O0;
            float fC = c(bk4Var.j / 2);
            Paint paint = this.t0;
            if (fB > fC) {
                canvas.drawRect(b(0.0f), 0, b(this.w0.b()) - (bk4Var.j / 2), bk4Var.z, paint);
            }
            if (this.x0.b() < R0 - (c(bk4Var.j / 2) - 0.0f)) {
                canvas.drawRect((bk4Var.j / 2) + b(this.x0.b()), 0, b(R0), bk4Var.z, paint);
            }
            this.w0.a(canvas);
            this.x0.a(canvas);
            canvas.restore();
            f5b f5bVar = this.v0;
            RectF rectF = f5bVar.i;
            canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.width() / 2.0f, f5bVar.c);
            RectF rectF2 = f5bVar.j;
            Paint paint2 = f5bVar.e;
            canvas.drawRect(rectF2, paint2);
            canvas.drawRect(f5bVar.k, paint2);
            canvas.drawCircle(f5bVar.g.centerX(), f5bVar.f, f5bVar.b, f5bVar.d);
            if (z) {
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        bk4 bk4Var = this.O0;
        setMeasuredDimension(View.MeasureSpec.getSize(i), bk4Var.z + this.c + bk4Var.h + bk4Var.i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = getWidth();
        bk4 bk4Var = this.O0;
        int i5 = width - (bk4Var.j * 2);
        int i6 = this.a;
        Q0 = i5 - (i6 * 2);
        this.v0 = new f5b(this.b + bk4Var.z + this.c + bk4Var.h, getContext(), this);
        int i7 = 0;
        this.w0 = new aq0(0, getContext(), this);
        this.x0 = new aq0(1, getContext(), this);
        this.w0.e(this.B0);
        this.x0.e(this.C0);
        this.v0.c(this.D0);
        this.u0 = 1;
        a();
        this.u0 = 3;
        int i8 = bk4Var.j + i6;
        int i9 = Q0 + i8;
        int i10 = this.s0;
        this.H0 = new Rect(i8, 0, i9, i10);
        this.L0 = i10;
        this.M0 = (getWidth() - (bk4Var.j * 2)) / this.L0;
        this.N0 = (int) ((S0 * this.E0) / r11);
        cqc.b(this.J0);
        LongSparseArray longSparseArray = this.G0;
        longSparseArray.clear();
        long j = this.N0;
        if (j != 0) {
            long j2 = (((long) (0.0f * this.E0)) / j) * j;
            long j3 = (j * (((int) this.M0) + 2)) + j2;
            while (i7 < longSparseArray.size()) {
                long jKeyAt = longSparseArray.keyAt(i7);
                long j4 = this.N0 * 30;
                if (jKeyAt < j2 - j4 || jKeyAt > j4 + j3) {
                    longSparseArray.removeAt(i7);
                    i7--;
                }
                i7++;
            }
            r0a r0aVarN = new hb3(2, new lt1(this, j2, 7)).r(muc.a()).n(ce.a());
            sd7 sd7Var = new sd7(new yt8(25, this), new p4c(0), ft.d);
            r0aVarN.a(sd7Var);
            this.J0 = sd7Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r2 != 3) goto L110;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEndPosition(long j) {
        this.x0.e(j / this.E0);
        a();
        invalidate();
    }

    public void setOnChangeRangeSeekBarListener(u3a u3aVar) {
        aq0 aq0Var;
        this.o = u3aVar;
        if (u3aVar == null || (aq0Var = this.w0) == null || this.x0 == null || this.v0 == null) {
            return;
        }
        aq0Var.b();
        Set<hk9> set = (Set) ((nl9) u3aVar).a;
        for (hk9 hk9Var : set) {
            hk9Var.c2();
            hk9Var.b2();
            ((bq7) hk9Var.Y).q(hk9Var.u0);
        }
        long jB = (long) (this.x0.b() * this.E0);
        for (hk9 hk9Var2 : set) {
            hk9Var2.t0 = jB;
            hk9Var2.c2();
            hk9Var2.b2();
            ((bq7) hk9Var2.Y).q(hk9Var2.u0);
        }
        long jA = (long) (this.v0.a() * this.E0);
        for (hk9 hk9Var3 : set) {
            hk9Var3.u0 = jA;
            hk9Var3.b2();
            ((bq7) hk9Var3.Y).q(jA);
        }
    }

    public void setPointerPosition(long j) {
        this.v0.c(j / this.E0);
        a();
        invalidate();
    }

    public void setStartPosition(long j) {
        this.w0.e(j / this.E0);
        a();
        invalidate();
    }
}
