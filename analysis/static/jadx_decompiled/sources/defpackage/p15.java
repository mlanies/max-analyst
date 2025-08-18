package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class p15 extends hdc {
    public final /* synthetic */ z15 X;
    public final hdc o;

    public p15(z15 z15Var, hdc hdcVar) {
        this.X = z15Var;
        this.o = hdcVar;
        A(hdcVar.b);
    }

    @Override // defpackage.hdc
    public final void B(jdc jdcVar) {
        super.B(jdcVar);
        this.o.B(jdcVar);
    }

    @Override // defpackage.hdc
    public final int j() {
        z15 z15Var = this.X;
        int i = 0;
        int i2 = (!z15Var.d2 || z15Var.g2 == null) ? 0 : 1;
        if (z15Var.e2 && z15Var.g2 != null) {
            i = 1;
        }
        return this.o.j() + i + i2;
    }

    @Override // defpackage.hdc
    public final long k(int i) {
        z15 z15Var = this.X;
        if (z15Var.e2 && i == 0) {
            return -100L;
        }
        if (z15Var.d2 && i == j() - 1) {
            return -200L;
        }
        hdc hdcVar = this.o;
        if (hdcVar.j() > 0) {
            return hdcVar.k(i - (z15Var.e2 ? 1 : 0));
        }
        return -1L;
    }

    @Override // defpackage.hdc
    public final int l(int i) {
        z15 z15Var = this.X;
        if ((z15Var.e2 && i == 0) || (z15Var.d2 && i == j() - 1)) {
            return -1;
        }
        hdc hdcVar = this.o;
        if (hdcVar.j() > 0) {
            return hdcVar.l(i - (z15Var.e2 ? 1 : 0));
        }
        return -1;
    }

    @Override // defpackage.hdc
    public final void q(RecyclerView recyclerView) {
        this.o.q(recyclerView);
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) {
        s(decVar, i, new ArrayList());
    }

    @Override // defpackage.hdc
    public final void s(dec decVar, int i, List list) {
        if (decVar instanceof o15) {
            return;
        }
        hdc hdcVar = this.o;
        if (hdcVar.j() > 0) {
            hdcVar.s(decVar, i - (this.X.e2 ? 1 : 0), list);
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        if (i != -1) {
            return this.o.t(viewGroup, i);
        }
        z15 z15Var = this.X;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(z15Var.getContext());
        Integer num = z15Var.g2;
        if (num == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        View viewInflate = layoutInflaterFrom.inflate(num.intValue(), viewGroup, false);
        try {
            tj3 tj3Var = z15Var.h2;
            if (tj3Var != null) {
                tj3Var.accept(viewInflate);
            }
        } catch (Exception unused) {
        }
        return new o15(viewInflate);
    }

    @Override // defpackage.hdc
    public final void u(RecyclerView recyclerView) {
        this.o.u(recyclerView);
    }

    @Override // defpackage.hdc
    public final boolean v(dec decVar) {
        return (decVar instanceof o15) || this.o.v(decVar);
    }

    @Override // defpackage.hdc
    public final void w(dec decVar) {
        if (decVar instanceof o15) {
            return;
        }
        this.o.w(decVar);
    }

    @Override // defpackage.hdc
    public final void x(dec decVar) {
        if (decVar instanceof o15) {
            return;
        }
        this.o.x(decVar);
    }

    @Override // defpackage.hdc
    public final void y(dec decVar) {
        if (decVar instanceof o15) {
            return;
        }
        this.o.y(decVar);
    }

    @Override // defpackage.hdc
    public final void z(jdc jdcVar) {
        super.z(jdcVar);
        this.o.z(jdcVar);
    }
}
