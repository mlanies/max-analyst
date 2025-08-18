package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class hdc {
    public final idc a = new idc();
    public boolean b = false;
    public int c = 1;

    public void A(boolean z) {
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z;
    }

    public void B(jdc jdcVar) {
        this.a.unregisterObserver(jdcVar);
    }

    public final void h(dec decVar, int i) {
        boolean z = decVar.D0 == null;
        if (z) {
            decVar.c = i;
            if (this.b) {
                decVar.X = k(i);
            }
            decVar.u0 = (decVar.u0 & (-520)) | 1;
            Trace.beginSection("RV OnBindView");
        }
        decVar.D0 = this;
        boolean z2 = RecyclerView.L1;
        View view = decVar.a;
        if (z2) {
            if (view.getParent() == null) {
                WeakHashMap weakHashMap = zmf.a;
                if (view.isAttachedToWindow() != decVar.r()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + decVar.r() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + decVar);
                }
            }
            if (view.getParent() == null) {
                WeakHashMap weakHashMap2 = zmf.a;
                if (view.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + decVar);
                }
            }
        }
        s(decVar, i, decVar.j());
        if (z) {
            ArrayList arrayList = decVar.v0;
            if (arrayList != null) {
                arrayList.clear();
            }
            decVar.u0 &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof pdc) {
                ((pdc) layoutParams).c = true;
            }
            Trace.endSection();
        }
    }

    public int i(hdc hdcVar, dec decVar, int i) {
        if (hdcVar == this) {
            return i;
        }
        return -1;
    }

    public abstract int j();

    public long k(int i) {
        return -1L;
    }

    public int l(int i) {
        return 0;
    }

    public final void m() {
        this.a.b();
    }

    public final void n(int i, int i2) {
        this.a.c(i, i2);
    }

    public final void o(int i, int i2, Object obj) {
        this.a.d(i, i2, obj);
    }

    public final void p(int i, int i2) {
        this.a.e(i, i2);
    }

    public void q(RecyclerView recyclerView) {
    }

    public abstract void r(dec decVar, int i);

    public void s(dec decVar, int i, List list) {
        r(decVar, i);
    }

    public abstract dec t(ViewGroup viewGroup, int i);

    public void u(RecyclerView recyclerView) {
    }

    public boolean v(dec decVar) {
        return false;
    }

    public void w(dec decVar) {
    }

    public void x(dec decVar) {
    }

    public void y(dec decVar) {
    }

    public void z(jdc jdcVar) {
        this.a.registerObserver(jdcVar);
    }
}
