package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import defpackage.bu4;
import defpackage.i61;
import defpackage.kd7;
import defpackage.kj6;
import defpackage.oy;
import defpackage.pdc;
import defpackage.stb;
import defpackage.vdc;
import defpackage.vz1;
import defpackage.wz1;
import defpackage.xz1;
import defpackage.ydc;
import defpackage.z2c;
import defpackage.zdc;
import defpackage.zr6;
import java.util.List;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends a implements ydc {
    public final bu4 p;
    public oy q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager() {
        bu4 bu4Var = new bu4();
        new wz1();
        this.r = new i61(1, this);
        this.p = bu4Var;
        w0();
        Q0(0);
    }

    public static kj6 N0(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((kd7) list.get(i5)).getClass();
            float fAbs = Math.abs(0.0f - f);
            if (0.0f <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (0.0f > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (0.0f <= f5) {
                f5 = 0.0f;
                i2 = i5;
            }
            if (0.0f > f3) {
                f3 = 0.0f;
                i4 = i5;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new kj6((kd7) list.get(i), (kd7) list.get(i3));
    }

    @Override // androidx.recyclerview.widget.a
    public final void A(Rect rect, View view) {
        RecyclerView.V(rect, view);
        rect.centerY();
        if (O0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.a
    public final void I0(RecyclerView recyclerView, int i) {
        vz1 vz1Var = new vz1(this, recyclerView.getContext(), 0);
        vz1Var.a = i;
        J0(vz1Var);
    }

    public final float L0(int i) {
        this.q.l();
        throw null;
    }

    public final int M0() {
        return O0() ? this.n : this.o;
    }

    public final boolean O0() {
        return this.q.b == 0;
    }

    public final boolean P0() {
        return O0() && H() == 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean Q() {
        return true;
    }

    public final void Q0(int i) {
        xz1 xz1Var;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(zr6.h(i, "invalid orientation:"));
        }
        c(null);
        oy oyVar = this.q;
        if (oyVar == null || i != oyVar.b) {
            if (i == 0) {
                xz1Var = new xz1(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                xz1Var = new xz1(this, 0);
            }
            this.q = xz1Var;
            w0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void W(RecyclerView recyclerView) throws Resources.NotFoundException {
        bu4 bu4Var = this.p;
        Context context = recyclerView.getContext();
        float dimension = bu4Var.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(stb.m3_carousel_small_item_size_min);
        }
        bu4Var.a = dimension;
        float dimension2 = bu4Var.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(stb.m3_carousel_small_item_size_max);
        }
        bu4Var.b = dimension2;
        p0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // androidx.recyclerview.widget.a
    public final void X(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Y(android.view.View r7, int r8, defpackage.vdc r9, defpackage.zdc r10) {
        /*
            r6 = this;
            int r10 = r6.w()
            r0 = 0
            if (r10 != 0) goto L8
            return r0
        L8:
            oy r10 = r6.q
            int r10 = r10.b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r8 == r3) goto L40
            r4 = 2
            if (r8 == r4) goto L3e
            r4 = 17
            if (r8 == r4) goto L36
            r4 = 33
            if (r8 == r4) goto L33
            r4 = 66
            if (r8 == r4) goto L2a
            r4 = 130(0x82, float:1.82E-43)
            if (r8 == r4) goto L27
        L25:
            r8 = r1
            goto L41
        L27:
            if (r10 != r3) goto L25
            goto L3e
        L2a:
            if (r10 != 0) goto L25
            boolean r8 = r6.P0()
            if (r8 == 0) goto L3e
            goto L40
        L33:
            if (r10 != r3) goto L25
            goto L40
        L36:
            if (r10 != 0) goto L25
            boolean r8 = r6.P0()
            if (r8 == 0) goto L40
        L3e:
            r8 = r3
            goto L41
        L40:
            r8 = r2
        L41:
            if (r8 != r1) goto L44
            return r0
        L44:
            java.lang.String r10 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = 0
            if (r8 != r2) goto L87
            int r7 = androidx.recyclerview.widget.a.M(r7)
            if (r7 != 0) goto L55
            return r0
        L55:
            android.view.View r7 = r6.v(r1)
            int r7 = androidx.recyclerview.widget.a.M(r7)
            int r7 = r7 - r3
            if (r7 < 0) goto L76
            int r8 = r6.G()
            if (r7 < r8) goto L67
            goto L76
        L67:
            r6.L0(r7)
            dec r6 = r9.j(r7, r4)
            android.view.View r6 = r6.a
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r10)
            throw r6
        L76:
            boolean r7 = r6.P0()
            if (r7 == 0) goto L82
            int r7 = r6.w()
            int r1 = r7 + (-1)
        L82:
            android.view.View r6 = r6.v(r1)
            goto Lca
        L87:
            int r7 = androidx.recyclerview.widget.a.M(r7)
            int r8 = r6.G()
            int r8 = r8 - r3
            if (r7 != r8) goto L93
            return r0
        L93:
            int r7 = r6.w()
            int r7 = r7 - r3
            android.view.View r7 = r6.v(r7)
            int r7 = androidx.recyclerview.widget.a.M(r7)
            int r7 = r7 + r3
            if (r7 < 0) goto Lb9
            int r8 = r6.G()
            if (r7 < r8) goto Laa
            goto Lb9
        Laa:
            r6.L0(r7)
            dec r6 = r9.j(r7, r4)
            android.view.View r6 = r6.a
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r10)
            throw r6
        Lb9:
            boolean r7 = r6.P0()
            if (r7 == 0) goto Lc0
            goto Lc6
        Lc0:
            int r7 = r6.w()
            int r1 = r7 + (-1)
        Lc6:
            android.view.View r6 = r6.v(r1)
        Lca:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.Y(android.view.View, int, vdc, zdc):android.view.View");
    }

    @Override // androidx.recyclerview.widget.a
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(a.M(v(0)));
            accessibilityEvent.setToIndex(a.M(v(w() - 1)));
        }
    }

    @Override // defpackage.ydc
    public final PointF a(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.a
    public final void d0(int i, int i2) {
        G();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean e() {
        return O0();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        return !O0();
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(int i, int i2) {
        G();
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(vdc vdcVar, zdc zdcVar) {
        if (zdcVar.b() <= 0 || M0() <= 0.0f) {
            r0(vdcVar);
        } else {
            P0();
            View view = vdcVar.j(0, Long.MAX_VALUE).a;
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int k(zdc zdcVar) {
        w();
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0(zdc zdcVar) {
        if (w() == 0) {
            return;
        }
        a.M(v(0));
    }

    @Override // androidx.recyclerview.widget.a
    public final int l(zdc zdcVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int m(zdc zdcVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int n(zdc zdcVar) {
        w();
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int o(zdc zdcVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int p(zdc zdcVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final pdc s() {
        return new pdc(-2, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean v0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final int x0(int i, vdc vdcVar, zdc zdcVar) {
        if (!O0() || w() == 0 || i == 0) {
            return 0;
        }
        View view = vdcVar.j(0, Long.MAX_VALUE).a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.a
    public final void y0(int i) {
    }

    @Override // androidx.recyclerview.widget.a
    public final int z0(int i, vdc vdcVar, zdc zdcVar) {
        if (!f() || w() == 0 || i == 0) {
            return 0;
        }
        View view = vdcVar.j(0, Long.MAX_VALUE).a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new wz1();
        this.r = new i61(1, this);
        this.p = new bu4();
        w0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.Carousel);
            typedArrayObtainStyledAttributes.getInt(z2c.Carousel_carousel_alignment, 0);
            w0();
            Q0(typedArrayObtainStyledAttributes.getInt(z2c.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
