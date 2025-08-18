package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class vs8 extends Drawable {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public Drawable e;
    public boolean f;
    public int g;
    public final RectF h;
    public final RectF i;
    public final Path j;
    public Path k;
    public final float l;
    public final float m;
    public final float n;
    public final int o;
    public final float[] p;
    public int q;
    public LinearGradient r;
    public LinearGradient s;
    public final Matrix t;
    public final us8 u;
    public final us8 v;
    public float w;
    public int x;
    public static final /* synthetic */ bc7[] z = {new oi9(vs8.class, "incomingBackgroundColor", "getIncomingBackgroundColor()[I"), rh4.g(nec.a, vs8.class, "outgoingBackgroundColor", "getOutgoingBackgroundColor()[I")};
    public static final qx7 y = new qx7(13);
    public static final Paint A = new Paint(1);

    public vs8(int[] iArr, int[] iArr2, boolean z2, int i, boolean z3, boolean z4, int i2) {
        float[] fArr;
        z3 = (i2 & 32) != 0 ? true : z3;
        z4 = (i2 & 64) != 0 ? true : z4;
        this.a = z2;
        this.x = i;
        this.b = false;
        this.c = z3;
        this.d = z4;
        this.e = null;
        this.f = false;
        this.g = 0;
        this.h = new RectF();
        this.i = new RectF();
        this.j = new Path();
        this.l = fk4.d().getDisplayMetrics().density * 6.0f;
        this.m = fk4.d().getDisplayMetrics().density * 16.0f;
        this.n = fk4.d().getDisplayMetrics().density * 2.0f;
        this.o = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        if (this.d) {
            fArr = new float[8];
            for (int i3 = 0; i3 < 8; i3++) {
                fArr[i3] = this.m;
            }
        } else {
            fArr = new float[8];
        }
        this.p = fArr;
        this.q = 255;
        this.t = new Matrix();
        this.u = new us8(iArr, this, 0);
        this.v = new us8(iArr2, this, 1);
    }

    public static boolean b(vs8 vs8Var, boolean z2, int i, boolean z3, boolean z4, int i2, boolean z5) {
        boolean z6 = (vs8Var.c == z4 && vs8Var.a == z2 && vs8Var.x == i && vs8Var.d == z3 && tpa.f(vs8Var.e, null) && vs8Var.f == z5) ? false : true;
        vs8Var.b = false;
        vs8Var.c = z4;
        vs8Var.g = i2;
        vs8Var.a = z2;
        vs8Var.x = i;
        vs8Var.d = z3;
        vs8Var.e = null;
        vs8Var.f = z5;
        if (z6) {
            vs8Var.c(vs8Var.getBounds());
        }
        return z6;
    }

    public final Path a() {
        Path path = this.k;
        return path == null ? this.j : path;
    }

    public final void c(Rect rect) {
        float f;
        float[] fArr;
        Path path;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        int i = this.x;
        boolean z2 = this.a;
        boolean z3 = this.d;
        boolean z4 = this.f;
        float[] fArr2 = this.p;
        if (z3) {
            ys.a0(fArr2, this.m);
            int i2 = i == 0 ? -1 : ws8.$EnumSwitchMapping$0[au1.s(i)];
            if (i2 != -1) {
                float f2 = this.l;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (z2) {
                                fArr2[0] = f2;
                                fArr2[1] = f2;
                            } else {
                                fArr2[3] = f2;
                                fArr2[2] = f2;
                            }
                        } else if (z2) {
                            fArr2[0] = f2;
                            fArr2[1] = f2;
                            fArr2[6] = f2;
                            fArr2[7] = f2;
                        } else {
                            fArr2[2] = f2;
                            fArr2[3] = f2;
                            fArr2[4] = f2;
                            fArr2[5] = f2;
                        }
                    } else if (z2) {
                        fArr2[7] = f2;
                        fArr2[6] = f2;
                    } else {
                        fArr2[5] = f2;
                        fArr2[4] = f2;
                    }
                } else if (z4) {
                    fArr2[4] = f2;
                    fArr2[5] = f2;
                    fArr2[6] = f2;
                    fArr2[7] = f2;
                }
            }
        }
        Path path2 = this.j;
        path2.reset();
        boolean z5 = this.b;
        int i3 = this.o;
        if (z5) {
            fArr = new float[9];
            int length = fArr2.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                fArr[i5] = fArr2[i4] - (fk4.d().getDisplayMetrics().density * 0.5f);
                i4++;
                i5++;
            }
            f = i3;
        } else {
            f = 0.0f;
            fArr = fArr2;
        }
        RectF rectF = this.h;
        rectF.set(rect.left + f, rect.top + f, rect.right - f, (rect.bottom - f) - this.w);
        Path.Direction direction = Path.Direction.CW;
        path2.addRoundRect(rectF, fArr, direction);
        if (this.b) {
            path = new Path();
            RectF rectF2 = this.i;
            float f3 = i3 / 2.0f;
            rectF2.set(getBounds().left + f3, getBounds().top + f3, getBounds().right - f3, getBounds().bottom - f3);
            path.addRoundRect(rectF2, fArr2, direction);
        } else {
            path = null;
        }
        this.k = path;
        bc7[] bc7VarArr = z;
        bc7 bc7Var = bc7VarArr[0];
        d((int[]) this.u.b, rect);
        bc7 bc7Var2 = bc7VarArr[1];
        e((int[]) this.v.b, rect);
    }

    public final void d(int[] iArr, Rect rect) {
        LinearGradient linearGradient = new LinearGradient(1.0f, 0.1f, 0.0f, 0.9f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.t;
        matrix.reset();
        matrix.setScale(rect.width(), rect.height());
        matrix.postTranslate(rect.left, rect.top);
        linearGradient.setLocalMatrix(matrix);
        this.r = linearGradient;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        if (bq4.a(this) == 1) {
            float f = 2;
            canvas.scale(-1.0f, 1.0f, getBounds().width() / f, getBounds().height() / f);
        }
        boolean z2 = this.c;
        Path path = this.j;
        Paint paint = A;
        if (z2 && this.e == null) {
            paint.setShader(this.a ? this.r : this.s);
            paint.setStyle(Paint.Style.FILL);
            paint.setAlpha(this.q);
            canvas.drawPath(path, paint);
        }
        if (this.e != null) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            try {
                Drawable drawable = this.e;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        if (this.b) {
            paint.setShader(null);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.g);
            paint.setStrokeWidth(this.n);
            paint.setAlpha(this.q);
            Path path2 = this.k;
            if (path2 != null) {
                canvas.drawPath(path2, paint);
            }
        }
        canvas.restore();
    }

    public final void e(int[] iArr, Rect rect) {
        LinearGradient linearGradient = new LinearGradient(1.0f, 0.1f, 0.0f, 0.9f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.t;
        matrix.reset();
        matrix.setScale(rect.width(), rect.height());
        matrix.postTranslate(rect.left, rect.top);
        linearGradient.setLocalMatrix(matrix);
        this.s = linearGradient;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 30) {
            super.getOutline(outline);
        } else {
            outline.setPath(a());
            outline.setAlpha(0.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.q = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
