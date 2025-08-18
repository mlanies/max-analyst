package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.a;

/* loaded from: classes2.dex */
public final class y19 extends yh7 {
    public final boolean p;
    public final k56 q;

    public y19(Context context, int i, boolean z, zj7 zj7Var) {
        super(context);
        this.p = z;
        this.q = zj7Var;
        if (i >= 0) {
            this.a = i;
        }
    }

    @Override // defpackage.yh7
    public final void j() {
        super.j();
        this.q.invoke();
    }

    @Override // defpackage.yh7
    public final void k(View view, n64 n64Var) {
        int iM;
        int iH = h();
        a aVar = this.c;
        if (aVar == null || !aVar.f()) {
            iM = 0;
        } else {
            pdc pdcVar = (pdc) view.getLayoutParams();
            iM = m(a.F(view) - ((ViewGroup.MarginLayoutParams) pdcVar).topMargin, a.z(view) + ((ViewGroup.MarginLayoutParams) pdcVar).bottomMargin, aVar.L(), aVar.o - aVar.I(), iH);
        }
        int iE = e(iM);
        if (iE > 0) {
            int i = -iM;
            if (iE > 300) {
                iE = 300;
            }
            n64Var.e(0, i, iE, this.i);
        }
    }

    public final int m(int i, int i2, int i3, int i4, int i5) {
        int iM;
        if (i5 == -1) {
            return rh4.c(30, fk4.d().getDisplayMetrics().density, i3 - i);
        }
        boolean z = this.p;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i4 - i2;
            return (i6 - (i2 - i) >= i3 || z) ? i6 : i3 - i;
        }
        if (!z && (iM = m(i, i2, i3, i4, -1)) > 0) {
            return iM;
        }
        int iM2 = m(i, i2, i3, i4, 1);
        if (iM2 < 0) {
            return iM2;
        }
        return 0;
    }
}
