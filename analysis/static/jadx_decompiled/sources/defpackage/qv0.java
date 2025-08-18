package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qv0 extends View {
    public final TextPaint A0;
    public final TextPaint B0;
    public ov0 C0;
    public fv0 D0;
    public kv0 E0;
    public final Drawable F0;
    public final Drawable G0;
    public final Drawable H0;
    public final Drawable I0;
    public ColorStateList J0;
    public ColorStateList K0;
    public sz6 L0;
    public final Path M0;
    public final RectF N0;
    public final float[] O0;
    public final Size P0;
    public boolean Q0;
    public boolean R0;
    public final GestureDetector S0;
    public final int a;
    public final int b;
    public final int c;
    public final float o;
    public final int s0;
    public final int t0;
    public int u0;
    public ArrayList v0;
    public ic7 w0;
    public final Paint x0;
    public final Paint y0;
    public final Paint z0;

    public qv0(Context context) {
        super(context, null);
        this.a = tu0.G(40 * fk4.d().getDisplayMetrics().density);
        this.b = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        this.c = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        this.o = fk4.d().getDisplayMetrics().density * 6.0f;
        this.s0 = tu0.G(20 * fk4.d().getDisplayMetrics().density);
        this.t0 = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        this.v0 = new ArrayList();
        pq9 pq9Var = qp4.u0;
        pq9Var.j(this).getIcon();
        this.J0 = ColorStateList.valueOf(-1);
        this.K0 = ColorStateList.valueOf(pq9Var.j(this).getIcon().f);
        this.M0 = new Path();
        this.N0 = new RectF();
        this.O0 = new float[8];
        this.S0 = new GestureDetector(context, new q00(1, this));
        this.P0 = new Size(s5c.G(context).getWidth(), s5c.G(context).getHeight());
        int i = lda.l;
        pq9Var.j(this).getIcon();
        this.F0 = ngg.u(i, -1, context);
        int i2 = lda.k;
        pq9Var.j(this).getIcon();
        this.G0 = ngg.u(i2, -1, context);
        int i3 = lda.b;
        pq9Var.j(this).getIcon();
        this.I0 = ngg.u(i3, -1, context);
        int i4 = lda.a;
        pq9Var.j(this).getIcon();
        this.H0 = ngg.u(i4, -1, context);
        pq9Var.j(this).getText();
        this.A0 = b(-1);
        this.B0 = b(pq9Var.j(this).getText().e);
        this.x0 = a(pq9Var.j(this).a().d(true).a.a.a);
        this.y0 = a(pq9Var.j(this).a().s().b.m);
        this.z0 = a(pq9Var.j(this).a().d(true).a.a.c);
        v3c.y(new br(3, (Continuation) null, 2), this);
    }

    public static Paint a(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        return paint;
    }

    public final TextPaint b(int i) {
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(i);
        i4f.D.a(textPaint, getResources().getDisplayMetrics(), du4.b);
        textPaint.setTextSize(fk4.d().getDisplayMetrics().density * 16.0f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    public final ic7 getKeyboard() {
        return this.w0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.v0.isEmpty()) {
            return;
        }
        Iterator it = this.v0.iterator();
        while (it.hasNext()) {
            jq0 jq0Var = (jq0) it.next();
            a20 a20Var = jq0Var.b;
            RectF rectF = this.N0;
            rectF.set(a20Var.b, a20Var.c, a20Var.d, a20Var.e);
            fv0 fv0Var = this.D0;
            boolean z = jq0Var.e;
            fv0 fv0Var2 = jq0Var.a;
            if (fv0Var2 == fv0Var) {
                int i = pv0.$EnumSwitchMapping$1[au1.s(fv0Var2.c)];
                paint = this.z0;
            } else if (z || !this.R0) {
                int i2 = pv0.$EnumSwitchMapping$1[au1.s(fv0Var2.c)];
                paint = this.x0;
            } else {
                paint = this.y0;
            }
            a20 a20Var2 = jq0Var.b;
            float[] fArr = jq0Var.h;
            if (fArr != null) {
                Path path = this.M0;
                path.reset();
                float f = fArr[0];
                float[] fArr2 = this.O0;
                fArr2[0] = f;
                fArr2[1] = fArr[0];
                float f2 = fArr[1];
                fArr2[2] = f2;
                fArr2[3] = f2;
                float f3 = fArr[2];
                fArr2[4] = f3;
                fArr2[5] = f3;
                float f4 = fArr[3];
                fArr2[6] = f4;
                fArr2[7] = f4;
                path.addRoundRect(rectF, fArr2, Path.Direction.CCW);
                canvas.drawPath(path, paint);
            } else {
                rectF.set(a20Var2.b, a20Var2.c, a20Var2.d, a20Var2.e);
                float f5 = this.o;
                canvas.drawRoundRect(rectF, f5, f5, paint);
            }
            if (fv0Var2.s0) {
                sz6 sz6Var = this.L0;
                if (sz6Var != null) {
                    float f6 = a20Var2.b;
                    float f7 = a20Var2.d;
                    int i3 = this.s0 / 2;
                    float f8 = a20Var2.c;
                    float f9 = a20Var2.e;
                    sz6Var.setBounds(((int) ((f6 + f7) * 0.5f)) - i3, ((int) ((f8 + f9) * 0.5f)) - i3, ((int) ((f6 + f7) * 0.5f)) + i3, i3 + ((int) ((f8 + f9) * 0.5f)));
                }
                sz6 sz6Var2 = this.L0;
                if (sz6Var2 != null) {
                    sz6Var2.draw(canvas);
                }
            } else {
                String str = jq0Var.i;
                float f10 = (a20Var2.b + a20Var2.d) * 0.5f;
                float f11 = (a20Var2.c + a20Var2.e) * 0.5f;
                TextPaint textPaint = this.A0;
                float fAscent = f11 - ((textPaint.ascent() + textPaint.descent()) / 2);
                if (!z && this.R0) {
                    textPaint = this.B0;
                }
                canvas.drawText(str, f10, fAscent, textPaint);
            }
            int i4 = (int) a20Var2.d;
            int i5 = this.b;
            int i6 = i4 - i5;
            int i7 = this.t0;
            int i8 = i6 - i7;
            int i9 = ((int) a20Var2.c) + i5;
            int i10 = i7 + i9;
            int iOrdinal = fv0Var2.b.ordinal();
            Drawable drawable = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 5 ? null : this.F0 : this.I0 : this.H0 : this.G0;
            if (drawable != null) {
                drawable.setTintList((z || !this.R0) ? this.J0 : this.K0);
                drawable.setBounds(i8, i9, i6, i10);
                drawable.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ic7 ic7Var = this.w0;
        if (this.v0.size() == 0 || ic7Var == null) {
            super.onMeasure(i, i2);
            return;
        }
        int size = ((z07) ic7Var).a.size();
        int size2 = View.MeasureSpec.getSize(i);
        if (!this.Q0) {
            double d = size2;
            Size size3 = this.P0;
            if (d > Math.min(size3.getWidth(), size3.getHeight())) {
                size2 = (int) ((size3.getWidth() * size2) / size3.getHeight());
            }
        }
        boolean z = this.R0;
        int i3 = this.b;
        int i4 = this.c;
        int i5 = z ? i4 : i3;
        int i6 = this.a;
        setMeasuredDimension(size2, (i5 + i6) * size);
        int i7 = 0;
        a20 a20Var = ((jq0) this.v0.get(0)).b;
        if ((a20Var.b == 0.0f && a20Var.c == 0.0f && a20Var.d == 0.0f && a20Var.e == 0.0f) || this.u0 != getMeasuredWidth()) {
            int measuredWidth = getMeasuredWidth();
            ArrayList arrayList = this.v0;
            if (!this.R0) {
                i4 = i3;
            }
            l lVar = new l(16, this);
            Iterator it = arrayList.iterator();
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (it.hasNext()) {
                jq0 jq0Var = (jq0) it.next();
                int i11 = jq0Var.c;
                if (i11 != -1) {
                    i10 = (measuredWidth - (i11 * i3)) / i11;
                    i8 = i7;
                }
                boolean z2 = jq0Var.g;
                if (z2) {
                    i10 += i3;
                }
                float f = i8;
                float f2 = i9;
                int i12 = jq0Var.d ? i8 + measuredWidth : i8 + i10;
                int i13 = i9 + i6;
                int i14 = measuredWidth;
                Iterator it2 = it;
                a20 a20Var2 = jq0Var.b;
                a20Var2.b = f;
                a20Var2.c = f2;
                a20Var2.d = i12;
                a20Var2.e = i13;
                lVar.invoke(jq0Var);
                i8 = i8 + i10 + i3;
                if (z2) {
                    i9 = i13 + i4;
                }
                measuredWidth = i14;
                it = it2;
                i7 = 0;
            }
        }
        this.u0 = getMeasuredWidth();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        this.S0.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        mpa mpaVar = null;
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            this.D0 = null;
            this.E0 = null;
            invalidate();
            return false;
        }
        ArrayList arrayList = this.v0;
        ic7 ic7Var = this.w0;
        List list = ic7Var != null ? ((z07) ic7Var).a : null;
        if (list == null) {
            list = nz4.a;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!arrayList.isEmpty() && !list.isEmpty()) {
            int y = (int) (motionEvent.getY() / (measuredHeight / list.size()));
            int size = list.size() - 1;
            if (y > size) {
                String name = kq0.class.getName();
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.s0, name, rh4.h("Calculated wrong row index=", y, size, ", correct index="), null);
                }
                y = size;
            }
            lv0 lv0Var = (lv0) list.get(y);
            if (!lv0Var.isEmpty()) {
                int x = (int) (motionEvent.getX() / (measuredWidth / lv0Var.size()));
                int size2 = lv0Var.size() - 1;
                if (x > size2) {
                    String name2 = kq0.class.getName();
                    ir6 ir6Var2 = hm9.m;
                    if (ir6Var2 != null && ir6Var2.c()) {
                        ir6Var2.d(us7.s0, name2, rh4.h("Calculated wrong column index=", x, size2, ", correct index="), null);
                    }
                    x = size2;
                }
                mpaVar = new mpa(new kv0(y, x), lv0Var.get(x));
            }
        }
        if (mpaVar == null) {
            return true;
        }
        this.E0 = (kv0) mpaVar.a;
        this.D0 = (fv0) mpaVar.b;
        invalidate();
        return true;
    }

    public final void setClickListener(ov0 ov0Var) {
        this.C0 = ov0Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof sz6) || super.verifyDrawable(drawable);
    }
}
