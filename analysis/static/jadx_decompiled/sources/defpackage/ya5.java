package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ya5 extends js {
    public int A0;
    public final boolean[] B0;
    public int C0;
    public boolean D0;
    public final boolean E0;
    public final Drawable[] t0;
    public final int u0;
    public int v0;
    public int w0;
    public long x0;
    public final int[] y0;
    public final int[] z0;

    public ya5(Drawable[] drawableArr) {
        super(drawableArr);
        this.E0 = true;
        if (!(drawableArr.length >= 1)) {
            throw new IllegalStateException("At least one layer required!");
        }
        this.t0 = drawableArr;
        int[] iArr = new int[drawableArr.length];
        this.y0 = iArr;
        int[] iArr2 = new int[drawableArr.length];
        this.z0 = iArr2;
        this.A0 = 255;
        boolean[] zArr = new boolean[drawableArr.length];
        this.B0 = zArr;
        this.C0 = 0;
        this.u0 = 2;
        this.v0 = 2;
        Arrays.fill(iArr, 0);
        iArr[0] = 255;
        Arrays.fill(iArr2, 0);
        iArr2[0] = 255;
        Arrays.fill(zArr, false);
        zArr[0] = true;
    }

    public final void c() {
        this.C0--;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean zF;
        int i;
        int i2 = this.v0;
        int[] iArr = this.z0;
        Drawable[] drawableArr = this.t0;
        if (i2 == 0) {
            System.arraycopy(iArr, 0, this.y0, 0, drawableArr.length);
            this.x0 = SystemClock.uptimeMillis();
            zF = f(this.w0 == 0 ? 1.0f : 0.0f);
            if (!this.D0 && (i = this.u0) >= 0) {
                boolean[] zArr = this.B0;
                if (i < zArr.length && zArr[i]) {
                    this.D0 = true;
                }
            }
            this.v0 = zF ? 2 : 1;
        } else if (i2 != 1) {
            zF = true;
        } else {
            od2.p(this.w0 > 0);
            zF = f((SystemClock.uptimeMillis() - this.x0) / this.w0);
            this.v0 = zF ? 2 : 1;
        }
        for (int i3 = 0; i3 < drawableArr.length; i3++) {
            Drawable drawable = drawableArr[i3];
            int iCeil = (int) Math.ceil((iArr[i3] * this.A0) / 255.0d);
            if (drawable != null && iCeil > 0) {
                this.C0++;
                if (this.E0) {
                    drawable.mutate();
                }
                drawable.setAlpha(iCeil);
                this.C0--;
                drawable.draw(canvas);
            }
        }
        if (!zF) {
            invalidateSelf();
        } else if (this.D0) {
            this.D0 = false;
        }
    }

    public final void e() {
        this.v0 = 2;
        for (int i = 0; i < this.t0.length; i++) {
            this.z0[i] = this.B0[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    public final boolean f(float f) {
        boolean z = true;
        for (int i = 0; i < this.t0.length; i++) {
            boolean z2 = this.B0[i];
            int i2 = (int) (((z2 ? 1 : -1) * 255 * f) + this.y0[i]);
            int[] iArr = this.z0;
            iArr[i] = i2;
            if (i2 < 0) {
                iArr[i] = 0;
            }
            if (iArr[i] > 255) {
                iArr[i] = 255;
            }
            if (z2 && iArr[i] < 255) {
                z = false;
            }
            if (!z2 && iArr[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.C0 == 0) {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.A0 != i) {
            this.A0 = i;
            invalidateSelf();
        }
    }
}
