package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class yl7 implements View.OnTouchListener {
    public static final int C0 = ViewConfiguration.getTapTimeout();
    public boolean A0;
    public final ListView B0;
    public final float[] X;
    public final float[] Y;
    public final int Z;
    public final i90 a;
    public final AccelerateInterpolator b;
    public final View c;
    public re o;
    public final int s0;
    public final float[] t0;
    public final float[] u0;
    public final float[] v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    public yl7(ListView listView) {
        i90 i90Var = new i90();
        i90Var.e = Long.MIN_VALUE;
        i90Var.g = -1L;
        i90Var.f = 0L;
        this.a = i90Var;
        this.b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.X = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.Y = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.t0 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.u0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.v0 = fArr5;
        this.c = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.Z = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.s0 = C0;
        i90Var.a = 500;
        i90Var.b = 500;
        this.B0 = listView;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.X
            r0 = r0[r4]
            float[] r1 = r3.Y
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.t0
            r0 = r0[r4]
            float[] r1 = r3.u0
            r1 = r1[r4]
            float[] r3 = r3.v0
            r3 = r3[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r3 = b(r5, r1, r3)
            return r3
        L51:
            float r4 = -r5
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl7.a(int, float, float, float):float");
    }

    public final float c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.Z;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.z0 && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.x0) {
            this.z0 = false;
            return;
        }
        i90 i90Var = this.a;
        i90Var.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - i90Var.e);
        int i3 = i90Var.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        i90Var.i = i;
        i90Var.h = i90Var.a(jCurrentAnimationTimeMillis);
        i90Var.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        ListView listView;
        int count;
        i90 i90Var = this.a;
        float f = i90Var.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(i90Var.c);
        if (iAbs == 0 || (count = (listView = this.B0).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 3
            boolean r1 = r7.A0
            r2 = 0
            if (r1 != 0) goto L7
            return r2
        L7:
            int r1 = r9.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            r4 = 2
            if (r1 == r4) goto L1e
            if (r1 == r0) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.y0 = r3
            r7.w0 = r2
        L1e:
            float r1 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r7.c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r1 = r7.a(r2, r1, r4, r6)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r7.a(r3, r9, r8, r4)
            i90 r9 = r7.a
            r9.c = r1
            r9.d = r8
            boolean r8 = r7.z0
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            re r8 = r7.o
            if (r8 != 0) goto L5f
            re r8 = new re
            r8.<init>(r0, r7)
            r7.o = r8
        L5f:
            r7.z0 = r3
            r7.x0 = r3
            boolean r8 = r7.w0
            if (r8 != 0) goto L74
            int r8 = r7.s0
            if (r8 <= 0) goto L74
            re r9 = r7.o
            long r0 = (long) r8
            java.util.WeakHashMap r8 = defpackage.zmf.a
            r5.postOnAnimationDelayed(r9, r0)
            goto L79
        L74:
            re r8 = r7.o
            r8.run()
        L79:
            r7.w0 = r3
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl7.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
