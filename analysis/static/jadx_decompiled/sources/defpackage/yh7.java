package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes.dex */
public class yh7 {
    public int a = -1;
    public RecyclerView b;
    public a c;
    public boolean d;
    public boolean e;
    public View f;
    public final n64 g;
    public final LinearInterpolator h;
    public final DecelerateInterpolator i;
    public PointF j;
    public final DisplayMetrics k;
    public boolean l;
    public float m;
    public int n;
    public int o;

    public yh7(Context context) {
        n64 n64Var = new n64(2);
        n64Var.f = -1;
        n64Var.b = false;
        n64Var.c = 0;
        n64Var.d = 0;
        n64Var.e = Integer.MIN_VALUE;
        n64Var.g = null;
        this.g = n64Var;
        this.h = new LinearInterpolator();
        this.i = new DecelerateInterpolator();
        this.l = false;
        this.n = 0;
        this.o = 0;
        this.k = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(View view, int i) {
        a aVar = this.c;
        if (aVar == null || !aVar.e()) {
            return 0;
        }
        pdc pdcVar = (pdc) view.getLayoutParams();
        return a(a.B(view) - ((ViewGroup.MarginLayoutParams) pdcVar).leftMargin, a.E(view) + ((ViewGroup.MarginLayoutParams) pdcVar).rightMargin, aVar.J(), aVar.n - aVar.K(), i);
    }

    public int c(View view, int i) {
        a aVar = this.c;
        if (aVar == null || !aVar.f()) {
            return 0;
        }
        pdc pdcVar = (pdc) view.getLayoutParams();
        return a(a.F(view) - ((ViewGroup.MarginLayoutParams) pdcVar).topMargin, a.z(view) + ((ViewGroup.MarginLayoutParams) pdcVar).bottomMargin, aVar.L(), aVar.o - aVar.I(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final int e(int i) {
        return (int) Math.ceil(f(i) / 0.3356d);
    }

    public int f(int i) {
        float fAbs = Math.abs(i);
        if (!this.l) {
            this.m = d(this.k);
            this.l = true;
        }
        return (int) Math.ceil(fAbs * this.m);
    }

    public PointF g(int i) {
        Object obj = this.c;
        if (obj instanceof ydc) {
            return ((ydc) obj).a(i);
        }
        return null;
    }

    public int h() {
        PointF pointF = this.j;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh7.i(int, int):void");
    }

    public void j() {
        this.o = 0;
        this.n = 0;
        this.j = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(android.view.View r4, defpackage.n64 r5) {
        /*
            r3 = this;
            android.graphics.PointF r0 = r3.j
            if (r0 == 0) goto L12
            float r0 = r0.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            if (r0 <= 0) goto L10
            r0 = 1
            goto L13
        L10:
            r0 = -1
            goto L13
        L12:
            r0 = 0
        L13:
            int r0 = r3.b(r4, r0)
            int r1 = r3.h()
            int r4 = r3.c(r4, r1)
            int r1 = r0 * r0
            int r2 = r4 * r4
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r3.e(r1)
            if (r1 <= 0) goto L37
            int r0 = -r0
            int r4 = -r4
            android.view.animation.DecelerateInterpolator r3 = r3.i
            r5.e(r0, r4, r1, r3)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh7.k(android.view.View, n64):void");
    }

    public final void l() {
        if (this.e) {
            this.e = false;
            j();
            this.b.s1.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            a aVar = this.c;
            if (aVar.e == this) {
                aVar.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
