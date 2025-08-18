package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class rg6 extends View {
    public static final /* synthetic */ int o = 0;
    public final Paint a;
    public final pg6 b;
    public qg6 c;

    public rg6(Context context) {
        super(context, null, 0);
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = oq9.d();
        paint.setStyle(Paint.Style.FILL);
        this.b = getDrawConfiguration();
    }

    public static void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Pages number is negative".toString());
        }
        if (i2 >= i) {
            throw new IllegalArgumentException("Selected page index is equal or bigger than pages number".toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Selected page index is negative".toString());
        }
    }

    private final int getBigDotsNumber() {
        return Math.min(1, this.c.a);
    }

    private static final qg6 getDefaultPageState() {
        return oq9.d();
    }

    private final float getDotsAnimationShift() {
        int iS = au1.s(this.c.f);
        if (iS == 0 || iS == 1) {
            return 0.0f;
        }
        pg6 pg6Var = this.b;
        if (iS == 2) {
            return (-this.c.c) * pg6Var.d;
        }
        if (iS == 3) {
            return (1.0f - this.c.c) * pg6Var.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final pg6 getDrawConfiguration() {
        float f = fk4.d().getDisplayMetrics().density * 3.0f;
        float f2 = fk4.d().getDisplayMetrics().density * 2.0f;
        float f3 = fk4.d().getDisplayMetrics().density * 1.0f;
        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        pq9 pq9Var = qp4.u0;
        bs6 icon = pq9Var.p(this).c.getIcon();
        pq9Var.p(this).c.getIcon();
        return new pg6(f, f2, f3, iG, icon.h);
    }

    private final float getSelectedBigDotAnimationShift() {
        int iS = au1.s(this.c.f);
        if (iS == 0) {
            return 0.0f;
        }
        if (iS == 1) {
            return this.c.c * this.b.d;
        }
        if (iS == 2 || iS == 3) {
            return 0.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(int i, int i2) {
        if (i == 0) {
            this.c = oq9.d();
            invalidate();
            return;
        }
        a(i, i2);
        qg6 qg6Var = this.c;
        if (i == qg6Var.a) {
            c(i2, 0.0f);
            return;
        }
        qg6Var.a = i;
        qg6Var.b = i2;
        qg6Var.c = 0.0f;
        if (qg6Var.d >= i) {
            qg6Var.d = Math.min(i - 1, 0);
        } else if (i <= 1) {
            qg6Var.d = i2;
        }
        qg6 qg6Var2 = this.c;
        qg6Var2.f = 1;
        qg6Var2.e = false;
        invalidate();
    }

    public final void c(int i, float f) {
        qg6 qg6Var = this.c;
        int i2 = qg6Var.b;
        qg6Var.b = i;
        int i3 = i - i2;
        int i4 = qg6Var.d;
        int i5 = i4 + i3;
        int i6 = 1;
        if (qg6Var.e && i3 == 1) {
            qg6Var.e = false;
            i3 = 0;
            i5 = 0;
        }
        if (i3 != 0) {
            qg6Var.e = i5 < 0;
        }
        qg6Var.d = ote.e(i5, 0, 0);
        qg6 qg6Var2 = this.c;
        int i7 = qg6Var2.f;
        int i8 = qg6Var2.b;
        int i9 = qg6Var2.d;
        if (f != 0.0f) {
            if (i7 == 1 || i8 != i2) {
                i6 = 2;
                if (i8 < i2) {
                    if (i4 == 0 && i9 == 0) {
                        i6 = 4;
                    }
                } else if (i9 == 0) {
                    i6 = 3;
                }
            } else {
                i6 = i7;
            }
        }
        qg6Var2.f = i6;
        qg6Var2.c = f;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg6.onDraw(android.graphics.Canvas):void");
    }

    public final void setSelectedPageIndex(int i) {
        a(this.c.a, i);
        c(i, 0.0f);
    }
}
