package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class f4e {
    public final View a;
    public final boolean b = false;
    public int c;
    public int d;
    public final jt e;
    public z2e f;

    public f4e(View view) {
        this.a = view;
        jt jtVar = new jt(9);
        jtVar.b = 0;
        jtVar.c = 0;
        this.e = jtVar;
    }

    public final jt a(int i, int i2) {
        int iMin;
        jt jtVar = this.e;
        jtVar.b = i;
        jtVar.c = i2;
        z2e z2eVar = this.f;
        if (z2eVar == null) {
            return jtVar;
        }
        boolean z = this.b;
        int i3 = z2eVar.t0;
        if (z) {
            iMin = this.d;
        } else {
            iMin = this.c;
            if (i3 >= iMin && i3 <= (iMin = this.d)) {
                iMin = i3;
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.a;
        if (mode == 1073741824) {
            iMin = (int) Math.min(iMin, (View.MeasureSpec.getSize(i2) - view.getPaddingBottom()) - view.getPaddingTop());
        }
        jtVar.b = View.MeasureSpec.makeMeasureSpec(view.getPaddingRight() + view.getPaddingLeft() + ((int) ((z2eVar.s0 / i3) * iMin)), 1073741824);
        jtVar.c = View.MeasureSpec.makeMeasureSpec(view.getPaddingBottom() + view.getPaddingTop() + iMin, 1073741824);
        return jtVar;
    }

    public final void b(z2e z2eVar) {
        this.f = z2eVar;
        c();
    }

    public final void c() {
        z2e z2eVar = this.f;
        if (z2eVar != null && z2eVar.u0) {
            this.c = tu0.G(158 * fk4.d().getDisplayMetrics().density);
            this.d = tu0.G(194 * fk4.d().getDisplayMetrics().density);
        } else {
            float f = 170;
            this.c = tu0.G(fk4.d().getDisplayMetrics().density * f);
            this.d = tu0.G(f * fk4.d().getDisplayMetrics().density);
        }
    }
}
