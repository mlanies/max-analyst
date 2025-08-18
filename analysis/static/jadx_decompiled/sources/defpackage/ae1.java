package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class ae1 extends ppd {
    public final wmc X;
    public final acc Y;

    public ae1(wmc wmcVar, acc accVar, ExecutorService executorService) {
        super(executorService);
        this.X = wmcVar;
        this.Y = accVar;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: H */
    public final void r(hqd hqdVar, int i) {
        boolean z = hqdVar instanceof zd1;
        final wmc wmcVar = this.X;
        if (!z) {
            if (!(hqdVar instanceof yd1)) {
                hqdVar.A((ol7) C(i));
                return;
            }
            yd1 yd1Var = (yd1) hqdVar;
            ol7 ol7Var = (ol7) C(i);
            if (ol7Var instanceof sy0) {
                yd1Var.A(ol7Var);
                View view = yd1Var.a;
                boolean z2 = ((sy0) ol7Var).u0;
                ((ufd) view).setEnabled(z2);
                if (!z2) {
                    view.setOnClickListener(null);
                    return;
                }
                final sy0 sy0Var = (sy0) ol7Var;
                final int i2 = 0;
                tu0.K(view, 300L, new View.OnClickListener() { // from class: xd1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i2) {
                            case 0:
                                wmcVar.m(((sy0) sy0Var).o);
                                break;
                            default:
                                wmcVar.m(((sy0) sy0Var).o);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        zd1 zd1Var = (zd1) hqdVar;
        ol7 ol7Var2 = (ol7) C(i);
        if (ol7Var2 instanceof sy0) {
            View view2 = zd1Var.a;
            ufd ufdVar = (ufd) view2;
            sy0 sy0Var2 = (sy0) ol7Var2;
            boolean z3 = sy0Var2.u0;
            ufdVar.setDisableStartIconText(z3);
            zd1Var.A(ol7Var2);
            ufdVar.setEnabled(z3);
            if (z3) {
                final sy0 sy0Var3 = (sy0) ol7Var2;
                final int i3 = 1;
                tu0.K(view2, 300L, new View.OnClickListener() { // from class: xd1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i3) {
                            case 0:
                                wmcVar.m(((sy0) sy0Var3).o);
                                break;
                            default:
                                wmcVar.m(((sy0) sy0Var3).o);
                                break;
                        }
                    }
                });
            } else {
                view2.setOnClickListener(null);
            }
            CharSequence charSequence = zd1Var.F0.b;
            ufdVar.setDescription(charSequence != null ? new iqe(charSequence) : sy0Var2.Y);
        }
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: I */
    public final void y(hqd hqdVar) {
        hqdVar.D();
        zd1 zd1Var = hqdVar instanceof zd1 ? (zd1) hqdVar : null;
        if (zd1Var != null) {
            zd1Var.F0.a.remove(zd1Var);
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        if (i == y7a.l0) {
            ufd ufdVar = new ufd(viewGroup.getContext(), null);
            yd1 yd1Var = new yd1(ufdVar);
            ufdVar.setThemeDepended(pfd.b);
            return yd1Var;
        }
        if (i == y7a.j0) {
            return new zd1(viewGroup.getContext(), this.Y);
        }
        String name = ae1.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.Z, name, zr6.h(i, "unknown item viewType: "), null);
        }
        return new az0(new View(viewGroup.getContext()), 3);
    }
}
