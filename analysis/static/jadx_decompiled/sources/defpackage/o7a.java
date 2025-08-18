package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o7a extends ViewGroup {
    public static final /* synthetic */ bc7[] z0 = {new oi9(o7a.class, "mode", "getMode()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Mode;"), rh4.g(nec.a, o7a.class, "appearance", "getAppearance()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Appearance;"), new oi9(o7a.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;")};
    public m7a a;
    public final n7a b;
    public final n7a c;
    public final n7a o;
    public final li9 s0;
    public final li9 t0;
    public final li9 u0;
    public final Rect v0;
    public int w0;
    public int x0;
    public int y0;

    public o7a(Context context) {
        super(context);
        this.b = new n7a(this, 0);
        this.c = new n7a(this, 1);
        this.o = new n7a(this, 2);
        this.s0 = new li9(4);
        this.t0 = new li9(4);
        this.u0 = new li9();
        this.v0 = new Rect();
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = -1;
    }

    public static k7a a(o7a o7aVar, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = o7aVar.getChildCount();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        k7a k7aVar = (k7a) o7aVar.getChildAt(i);
        if (k7aVar == null) {
            k7aVar = new k7a(o7aVar.getContext());
            if (z) {
                o7aVar.addViewInLayout(k7aVar, o7aVar.getChildCount(), new ViewGroup.LayoutParams(-2, -2));
            } else {
                o7aVar.addView(k7aVar);
            }
        }
        k7aVar.setId(vxb.oneme_buttonstack_more_btn);
        k7aVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        k7aVar.setMode(o7aVar.getMode());
        k7aVar.setAppearance(o7aVar.getAppearance());
        k7aVar.setCustomTheme(o7aVar.getCustomTheme());
        k7aVar.setText(a2c.oneme_button_stack_more);
        k7aVar.setIcon(woc.q1);
        tu0.K(k7aVar, 300L, new xx5(20, o7aVar));
        return k7aVar;
    }

    public static final wpd c(l7a l7aVar) {
        int i = l7aVar.a;
        Integer num = l7aVar.b;
        return new wpd(i, num != null ? new eqe(num.intValue()) : jqe.a, l7aVar.c, l7aVar.d, l7aVar.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d2 -> B:36:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.List r9, java.util.List r10, boolean r11) {
        /*
            r8 = this;
            li9 r0 = r8.s0
            java.lang.Object[] r1 = r0.a
            int r2 = r0.b
            r3 = 0
            r4 = 0
            java.util.Arrays.fill(r1, r3, r2, r4)
            r0.b = r3
            li9 r1 = r8.u0
            java.lang.Object[] r2 = r1.a
            int r5 = r1.b
            java.util.Arrays.fill(r2, r3, r5, r4)
            r1.b = r3
            r2 = r3
        L19:
            r4 = 4
            if (r2 >= r4) goto L89
            java.lang.Object r5 = defpackage.x53.j0(r2, r9)
            l7a r5 = (defpackage.l7a) r5
            if (r5 == 0) goto L89
            android.view.View r4 = r8.getChildAt(r2)
            k7a r4 = (defpackage.k7a) r4
            if (r4 != 0) goto L38
            k7a r4 = new k7a
            android.content.Context r6 = r8.getContext()
            r4.<init>(r6)
            r8.addView(r4)
        L38:
            int r6 = r5.a
            r4.setId(r6)
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            r4.setLayoutParams(r6)
            r4.setVisibility(r3)
            boolean r6 = r5.f
            r4.setEnabled(r6)
            h7a r6 = r8.getMode()
            r4.setMode(r6)
            g7a r6 = r8.getAppearance()
            r4.setAppearance(r6)
            fka r6 = r8.getCustomTheme()
            r4.setCustomTheme(r6)
            java.lang.Integer r6 = r5.b
            if (r6 == 0) goto L6e
            int r6 = r6.intValue()
            r4.setText(r6)
        L6e:
            java.lang.Integer r6 = r5.d
            if (r6 == 0) goto L79
            int r6 = r6.intValue()
            r4.setIcon(r6)
        L79:
            vu5 r6 = new vu5
            r7 = 21
            r6.<init>(r8, r7, r5)
            defpackage.tu0.L(r4, r6)
            r0.b(r5)
            int r2 = r2 + 1
            goto L19
        L89:
            r0 = 1
            if (r2 != r4) goto L94
            int r5 = r9.size()
            if (r5 <= r4) goto L94
            r4 = r0
            goto L95
        L94:
            r4 = r3
        L95:
            boolean r5 = r10.isEmpty()
            r0 = r0 ^ r5
            if (r4 != 0) goto La3
            if (r0 == 0) goto L9f
            goto La3
        L9f:
            r9 = -1
            r8.w0 = r9
            goto Ld4
        La3:
            int r0 = r9.size()
            r4 = r2
        La8:
            if (r4 >= r0) goto Lb4
            java.lang.Object r5 = r9.get(r4)
            r1.b(r5)
            int r4 = r4 + 1
            goto La8
        Lb4:
            int r9 = r10.size()
            r0 = r3
        Lb9:
            if (r0 >= r9) goto Lc5
            java.lang.Object r4 = r10.get(r0)
            r1.b(r4)
            int r0 = r0 + 1
            goto Lb9
        Lc5:
            r9 = 2
            k7a r9 = a(r8, r2, r3, r9)
            r9.setVisibility(r3)
            r9.setEnabled(r11)
            r8.w0 = r2
        Ld2:
            int r2 = r2 + 1
        Ld4:
            int r9 = r8.getChildCount()
            if (r2 >= r9) goto Le6
            android.view.View r9 = r8.getChildAt(r2)
            if (r9 == 0) goto Ld2
            r10 = 8
            r9.setVisibility(r10)
            goto Ld2
        Le6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7a.b(java.util.List, java.util.List, boolean):void");
    }

    public final g7a getAppearance() {
        bc7 bc7Var = z0[1];
        return (g7a) this.c.b;
    }

    public final fka getCustomTheme() {
        bc7 bc7Var = z0[2];
        return (fka) this.o.b;
    }

    public final m7a getListener() {
        return this.a;
    }

    public final h7a getMode() {
        bc7 bc7Var = z0[0];
        return (h7a) this.b.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int iD = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.x0;
            if (i5 > this.y0 || i6 > i5) {
                ote.E(childAt, iD, 0, 0, 12);
                iD = wg0.d(8, fk4.d().getDisplayMetrics().density, childAt.getMeasuredWidth(), iD);
            } else {
                ote.D(childAt, 0, 0, 0, 0);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int i3 = 0;
        if (mode2 != Integer.MIN_VALUE && mode2 != 1073741824) {
            int childCount = getChildCount();
            int measuredWidth = 0;
            int iMax = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                childAt.measure(i, i2);
                measuredWidth += childAt.getMeasuredWidth();
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                i3++;
            }
            setMeasuredDimension((tu0.G(8 * fk4.d().getDisplayMetrics().density) * (getChildCount() - 1)) + measuredWidth, iMax);
            return;
        }
        int childCount2 = getChildCount() - 1;
        while (true) {
            if (-1 >= childCount2) {
                childCount2 = -1;
                break;
            }
            View childAt2 = getChildAt(childCount2);
            if (childAt2 != null && childAt2.getVisibility() == 0) {
                break;
            } else {
                childCount2--;
            }
        }
        if (childCount2 == -1) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.x0 = -1;
        this.y0 = -1;
        li9 li9Var = this.t0;
        Arrays.fill(li9Var.a, 0, li9Var.b, (Object) null);
        li9Var.b = 0;
        int i4 = childCount2 + 1;
        float f = 8;
        int iG = (size - (tu0.G(fk4.d().getDisplayMetrics().density * f) * childCount2)) / i4;
        while (iG < tu0.G(67 * fk4.d().getDisplayMetrics().density)) {
            int i5 = this.w0;
            boolean z = i5 == -1;
            if (i5 == -1) {
                this.w0 = getChildCount();
                a(this, 0, true, 1);
            }
            int i6 = this.y0;
            if (i6 == -1) {
                int i7 = this.w0;
                this.x0 = i7 - (z ? 2 : 1);
                this.y0 = i7 - (z ? 2 : 1);
            } else {
                this.x0 = i6 - (z ? 2 : 1);
            }
            li9Var.a(0, this.s0.c(this.x0));
            int i8 = i4 - 1;
            int iG2 = (size - (tu0.G(fk4.d().getDisplayMetrics().density * f) * (i4 - 2))) / i8;
            i4 = i8;
            iG = iG2;
        }
        int childCount3 = getChildCount();
        int iMax2 = 0;
        while (i3 < childCount3) {
            int i9 = this.x0;
            if (i3 > this.y0 || i9 > i3) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iG, 1073741824);
                View childAt3 = getChildAt(i3);
                childAt3.measure(iMakeMeasureSpec, i2);
                iMax2 = Math.max(iMax2, childAt3.getMeasuredHeight());
            }
            i3++;
        }
        setMeasuredDimension(size, Math.max(mode, iMax2));
    }

    public final void setAppearance(g7a g7aVar) {
        this.c.o1(this, z0[1], g7aVar);
    }

    public final void setCustomTheme(fka fkaVar) {
        this.o.o1(this, z0[2], fkaVar);
    }

    public final void setListener(m7a m7aVar) {
        this.a = m7aVar;
    }

    public final void setMode(h7a h7aVar) {
        this.b.o1(this, z0[0], h7aVar);
    }
}
