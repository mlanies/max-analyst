package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vdc {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public b g;
    public final /* synthetic */ RecyclerView h;

    public vdc(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(dec decVar, boolean z) {
        RecyclerView.o(decVar);
        RecyclerView recyclerView = this.h;
        fec fecVar = recyclerView.z1;
        if (fecVar != null) {
            eec eecVar = fecVar.e;
            boolean z2 = eecVar instanceof eec;
            View view = decVar.a;
            zmf.j(view, z2 ? (a4) eecVar.e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.C0;
            if (arrayList.size() > 0) {
                au1.r(arrayList.get(0));
                throw null;
            }
            hdc hdcVar = recyclerView.A0;
            if (hdcVar != null) {
                hdcVar.y(decVar);
            }
            if (recyclerView.s1 != null) {
                recyclerView.u0.p(decVar);
            }
            if (RecyclerView.M1) {
                Objects.toString(decVar);
            }
        }
        decVar.D0 = null;
        decVar.C0 = null;
        c().putRecycledView(decVar);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.s1.b()) {
            return !recyclerView.s1.h ? i : recyclerView.s0.A(i, 0);
        }
        StringBuilder sbN = rh4.n(i, "invalid position ", ". State item count is ");
        sbN.append(recyclerView.s1.b());
        sbN.append(recyclerView.F());
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    public final b c() {
        if (this.g == null) {
            this.g = new b();
            d();
        }
        return this.g;
    }

    public final void d() {
        RecyclerView recyclerView;
        hdc hdcVar;
        b bVar = this.g;
        if (bVar == null || (hdcVar = (recyclerView = this.h).A0) == null || !recyclerView.G0) {
            return;
        }
        bVar.attachForPoolingContainer(hdcVar);
    }

    public final void e() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            f(size);
        }
        this.c.clear();
        if (RecyclerView.R1) {
            b23 b23Var = this.h.r1;
            int[] iArr = b23Var.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            b23Var.d = 0;
        }
    }

    public final void f(int i) {
        boolean z = RecyclerView.L1;
        dec decVar = (dec) this.c.get(i);
        if (RecyclerView.M1) {
            Objects.toString(decVar);
        }
        a(decVar, true);
        this.c.remove(i);
    }

    public final void g(View view) {
        dec decVarU = RecyclerView.U(view);
        boolean zR = decVarU.r();
        RecyclerView recyclerView = this.h;
        if (zR) {
            recyclerView.removeDetachedView(view, false);
        }
        if (decVarU.q()) {
            decVarU.y0.k(decVarU);
        } else if (decVarU.y()) {
            decVarU.u0 &= -33;
        }
        h(decVarU);
        if (recyclerView.a1 == null || decVarU.o()) {
            return;
        }
        recyclerView.a1.d(decVarU);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d0, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.dec r12) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vdc.h(dec):void");
    }

    public final void i(View view) {
        mdc mdcVar;
        dec decVarU = RecyclerView.U(view);
        boolean zK = decVarU.k(12);
        RecyclerView recyclerView = this.h;
        if (!zK && decVarU.s() && (mdcVar = recyclerView.a1) != null) {
            yb4 yb4Var = (yb4) mdcVar;
            if (decVarU.j().isEmpty() && yb4Var.g && !decVarU.n()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                decVarU.y0 = this;
                decVarU.z0 = true;
                this.b.add(decVarU);
                return;
            }
        }
        if (decVarU.n() && !decVarU.p() && !recyclerView.A0.b) {
            throw new IllegalArgumentException(ms2.e(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        decVarU.y0 = this;
        decVarU.z0 = false;
        this.a.add(decVarU);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Type inference failed for: r2v19, types: [a4] */
    /* JADX WARN: Type inference failed for: r3v10, types: [a4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dec j(int r22, long r23) {
        /*
            Method dump skipped, instructions count: 1295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vdc.j(int, long):dec");
    }

    public final void k(dec decVar) {
        if (decVar.z0) {
            this.b.remove(decVar);
        } else {
            this.a.remove(decVar);
        }
        decVar.y0 = null;
        decVar.z0 = false;
        decVar.u0 &= -33;
    }

    public final void l() {
        a aVar = this.h.B0;
        this.f = this.e + (aVar != null ? aVar.j : 0);
        for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
            f(size);
        }
    }
}
