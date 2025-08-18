package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ms6 extends View {
    public final m56 a;
    public Drawable b;
    public float c;
    public final Rect o;
    public final int s0;
    public final float t0;
    public final Paint u0;
    public final Matrix v0;
    public final int[] w0;

    public ms6(Context context, m56 m56Var) {
        super(context, null);
        this.a = m56Var;
        this.b = kt3.b(getContext(), woc.e2);
        this.o = new Rect();
        this.s0 = 3;
        this.t0 = 0.9f;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.u0 = paint;
        this.v0 = new Matrix();
        this.w0 = new int[]{f8.G(0, 0.75f), -16777216};
    }

    public final void a(Canvas canvas, float f, float f2, float f3, int i, ks6 ks6Var) {
        List listSingletonList;
        Drawable.ConstantState constantState;
        if (i >= this.s0) {
            return;
        }
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = i2 * 45;
            double radians = Math.toRadians(i3);
            ks6 ks6Var2 = ks6.o;
            if (ks6Var == ks6Var2 || ks6Var.a.contains(Double.valueOf(radians))) {
                float fCos = (((float) Math.cos(radians)) * f3) + f;
                float fSin = (((float) Math.sin(radians)) * f3) + f2;
                float fG = tu0.G(((Number) this.a.invoke((ks6Var != ks6Var2 || i3 % 90 == 0) ? Integer.valueOf(i) : Integer.valueOf(i + 1))).intValue() * fk4.d().getDisplayMetrics().density) / 2;
                int i4 = (int) (fCos - fG);
                int i5 = (int) (fSin - fG);
                int i6 = (int) (fCos + fG);
                int i7 = (int) (fSin + fG);
                Rect rect = this.o;
                rect.set(i4, i5, i6, i7);
                Drawable drawable = this.b;
                Drawable drawableNewDrawable = (drawable == null || (constantState = drawable.getConstantState()) == null) ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    drawableNewDrawable.setBounds(rect);
                }
                if (drawableNewDrawable != null) {
                    drawableNewDrawable.draw(canvas);
                }
                rect.setEmpty();
            }
        }
        int i8 = ls6.$EnumSwitchMapping$0[ks6Var.ordinal()];
        if (i8 == 1) {
            listSingletonList = Collections.singletonList(Double.valueOf(Math.toRadians(180.0d)));
        } else if (i8 == 2) {
            listSingletonList = Collections.singletonList(Double.valueOf(Math.toRadians(0.0d)));
        } else {
            if (i8 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            listSingletonList = y53.M(Double.valueOf(Math.toRadians(180.0d)), Double.valueOf(Math.toRadians(0.0d)));
        }
        ArrayList arrayList = new ArrayList(z53.S(listSingletonList, 10));
        Iterator it = listSingletonList.iterator();
        while (it.hasNext()) {
            double dDoubleValue = ((Number) it.next()).doubleValue();
            arrayList.add(new kpa(Float.valueOf((((float) Math.cos(dDoubleValue)) * f3) + f), Float.valueOf((((float) Math.sin(dDoubleValue)) * f3) + f2)));
        }
        int iOrdinal = ks6Var.ordinal();
        float f4 = this.t0;
        if (iOrdinal == 0) {
            kpa kpaVar = (kpa) arrayList.get(0);
            a(canvas, ((Number) kpaVar.a).floatValue(), ((Number) kpaVar.b).floatValue(), f3 * f4, i + 1, ks6.b);
            return;
        }
        if (iOrdinal == 1) {
            kpa kpaVar2 = (kpa) arrayList.get(0);
            a(canvas, ((Number) kpaVar2.a).floatValue(), ((Number) kpaVar2.b).floatValue(), f3 * f4, i + 1, ks6.c);
            return;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        kpa kpaVar3 = (kpa) arrayList.get(0);
        float fFloatValue = ((Number) kpaVar3.a).floatValue();
        float fFloatValue2 = ((Number) kpaVar3.b).floatValue();
        kpa kpaVar4 = (kpa) arrayList.get(1);
        float fFloatValue3 = ((Number) kpaVar4.a).floatValue();
        float fFloatValue4 = ((Number) kpaVar4.b).floatValue();
        float f5 = f3 * f4;
        int i9 = i + 1;
        a(canvas, fFloatValue, fFloatValue2, f5, i9, ks6.b);
        a(canvas, fFloatValue3, fFloatValue4, f5, i9, ks6.c);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RadialGradient radialGradient = new RadialGradient(width, height, Math.max(width, height), this.w0, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.v0;
        matrix.reset();
        matrix.setScale(1.0f, 0.4f, width, height);
        radialGradient.setLocalMatrix(matrix);
        Paint paint = this.u0;
        paint.setShader(radialGradient);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        a(canvas2, width, height, this.c, 0, ks6.o);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
    }

    public final void setIcon$common_release(Drawable drawable) {
        this.b = drawable;
        invalidate();
    }

    public final void setInitialRadius$common_release(float f) {
        this.c = f;
        invalidate();
    }

    public final void setIcon$common_release(int i) {
        this.b = kt3.b(getContext(), i);
        invalidate();
    }
}
