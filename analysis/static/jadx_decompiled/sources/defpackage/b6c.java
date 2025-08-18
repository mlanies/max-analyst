package defpackage;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b6c extends ViewGroup {
    public static final /* synthetic */ bc7[] B0;
    public final ye4 A0;
    public m56 a;
    public w5c b;
    public boolean c;
    public final yj o;
    public final bi9 s0;
    public k56 t0;
    public final TransitionSet u0;
    public final ri9 v0;
    public final ri9 w0;
    public final ri9 x0;
    public final int y0;
    public final z5c[] z0;

    static {
        oi9 oi9Var = new oi9(b6c.class, "isStackFromEnd", "isStackFromEnd()Z");
        nec.a.getClass();
        B0 = new bc7[]{oi9Var};
    }

    public b6c(Context context) {
        super(context);
        this.o = new yj(this);
        this.s0 = new bi9();
        this.t0 = new lab(25);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new p6c(new a6c(this, 2)));
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.setOrdering(1);
        transitionSet.addListener((Transition.TransitionListener) new a6(2, this));
        this.u0 = transitionSet;
        this.v0 = new ri9();
        this.w0 = new ri9();
        this.x0 = new ri9();
        int i = q6c.a;
        this.y0 = i;
        z5c[] z5cVarArr = new z5c[i];
        for (int i2 = 0; i2 < i; i2++) {
            z5cVarArr[i2] = null;
        }
        this.z0 = z5cVarArr;
        this.A0 = new ye4(14);
    }

    public final void a(ri9 ri9Var) {
        Object[] objArr = ri9Var.b;
        long[] jArr = ri9Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        View view = (View) objArr[(i << 3) + i3];
                        this.s0.a(view.getId());
                        this.u0.addTarget(view.getId());
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int b(int i) {
        bc7 bc7Var = B0[0];
        if (!((Boolean) this.o.b).booleanValue()) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            z5c z5cVar = (z5c) ys.f0(i, this.z0);
            if (z5cVar == null) {
                break;
            }
            int measuredWidth = z5cVar.getMeasuredWidth() + (i2 == 0 ? 0 : tu0.G(4 * fk4.d().getDisplayMetrics().density)) + i2;
            if (measuredWidth > getMeasuredWidth()) {
                break;
            }
            i++;
            i2 = measuredWidth;
        }
        return getMeasuredWidth() - i2;
    }

    public final void c() {
        this.v0.b();
        this.w0.b();
        this.x0.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094 A[LOOP:0: B:14:0x0026->B:34:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0 A[EDGE_INSN: B:60:0x00a0->B:35:0x00a0 BREAK  A[LOOP:0: B:14:0x0026->B:34:0x0094], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b6c.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r19 = this;
            r0 = r19
            android.transition.TransitionSet r1 = r0.u0
            bi9 r0 = r0.s0
            int[] r2 = r0.b
            long[] r3 = r0.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 255(0xff, double:1.26E-321)
            r7 = 7
            r8 = 0
            if (r4 < 0) goto L4a
            r9 = r8
        L14:
            r10 = r3[r9]
            long r12 = ~r10
            long r12 = r12 << r7
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L45
            int r12 = r9 - r4
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L2d:
            if (r14 >= r12) goto L43
            long r15 = r10 & r5
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L3f
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r2[r15]
            r1.removeTarget(r15)
        L3f:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L2d
        L43:
            if (r12 != r13) goto L4a
        L45:
            if (r9 == r4) goto L4a
            int r9 = r9 + 1
            goto L14
        L4a:
            r0.d = r8
            long[] r1 = r0.a
            long[] r2 = defpackage.usc.a
            if (r1 == r2) goto L68
            defpackage.ys.b0(r1)
            long[] r1 = r0.a
            int r2 = r0.c
            int r3 = r2 >> 3
            r2 = r2 & r7
            int r2 = r2 << 3
            r7 = r1[r3]
            long r4 = r5 << r2
            long r9 = ~r4
            long r6 = r7 & r9
            long r4 = r4 | r6
            r1[r3] = r4
        L68:
            int r1 = r0.c
            int r1 = defpackage.usc.a(r1)
            int r2 = r0.d
            int r1 = r1 - r2
            r0.e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b6c.e():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.ix8 r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b6c.f(ix8, boolean):void");
    }

    public final w5c getChipObserver() {
        return this.b;
    }

    public final m56 getOnChipClickListener() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iB;
        int childCount = getChildCount();
        int measuredWidth = 0;
        int measuredHeight = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            z5c z5cVar = (z5c) ys.f0(i5, this.z0);
            if (z5cVar != null) {
                int iB2 = measuredWidth == 0 ? b(i5) : tu0.G(4 * fk4.d().getDisplayMetrics().density);
                if (getMeasuredWidth() - measuredWidth >= z5cVar.getMeasuredWidth() + iB2) {
                    iB = measuredWidth + iB2;
                    ote.E(z5cVar, iB, measuredHeight, 0, 12);
                } else {
                    iB = b(i5);
                    measuredHeight += z5cVar.getMeasuredHeight() + tu0.G(8 * fk4.d().getDisplayMetrics().density);
                    ote.E(z5cVar, iB, measuredHeight, 0, 12);
                }
                measuredWidth = iB + z5cVar.getMeasuredWidth();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View childAt;
        z5c[] z5cVarArr;
        int i3 = 0;
        while (true) {
            int i4 = this.y0;
            childAt = null;
            z5cVarArr = this.z0;
            if (i3 >= i4) {
                break;
            }
            if (i3 < getChildCount()) {
                z5cVarArr[i3] = getChildAt(i3);
            } else {
                z5cVarArr[i3] = 0;
            }
            i3++;
        }
        Arrays.sort(z5cVarArr, this.A0);
        int size = View.MeasureSpec.getMode(i) == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int measuredWidth = 0;
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            z5c z5cVar = (z5c) ys.f0(i6, z5cVarArr);
            if (z5cVar != null) {
                z5cVar.measure(i, i2);
                int measuredWidth2 = z5cVar.getMeasuredWidth() + measuredWidth + (measuredWidth == 0 ? 0 : tu0.G(4 * fk4.d().getDisplayMetrics().density));
                if (measuredWidth2 > size) {
                    i5++;
                    measuredWidth = z5cVar.getMeasuredWidth();
                } else {
                    measuredWidth = measuredWidth2;
                }
                iMax = Math.max(iMax, measuredWidth);
            }
        }
        if (measuredWidth == 0) {
            i5 = 0;
        }
        if ((getChildCount() > 0) && (childAt = getChildAt(0)) == null) {
            throw new IndexOutOfBoundsException();
        }
        setMeasuredDimension(iMax, (tu0.G(8 * fk4.d().getDisplayMetrics().density) * i5) + ((i5 + 1) * (childAt != null ? childAt.getMeasuredHeight() : 0)));
    }

    public final void setChipObserver(w5c w5cVar) {
        this.b = w5cVar;
    }

    public final void setIncoming(boolean z) {
        this.c = z;
    }

    public final void setOnChipClickListener(m56 m56Var) {
        this.a = m56Var;
    }

    public final void setStackFromEnd(boolean z) {
        this.o.o1(this, B0[0], Boolean.valueOf(z));
    }
}
