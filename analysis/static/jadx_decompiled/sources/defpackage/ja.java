package defpackage;

import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class ja extends ppd {
    public final ia X;
    public final lrf Y;

    public ja(ia iaVar, ExecutorService executorService, lrf lrfVar) {
        super(executorService);
        this.X = iaVar;
        this.Y = lrfVar;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: H */
    public final void r(hqd hqdVar, int i) {
        iv ivVar = this.o;
        int i0 = ((ol7) ivVar.f.get(i)).getI0();
        int i2 = y7a.U0;
        ia iaVar = this.X;
        if (i0 == i2) {
            ha haVar = (ha) hqdVar;
            ol7 ol7Var = (ol7) C(i);
            if (ol7Var instanceof z9f) {
                haVar.A((z9f) ol7Var);
                lk3 lk3Var = (lk3) haVar.a;
                lk3Var.N();
                lrf lrfVar = haVar.F0;
                lk3Var.Q((LayerDrawable) lrfVar.b.getValue(), (LayerDrawable) lrfVar.c.getValue(), new ga(iaVar, 0, (z9f) ol7Var));
                return;
            }
            return;
        }
        if (((ol7) ivVar.f.get(i)).getI0() != y7a.R0) {
            hqdVar.A((ol7) C(i));
            return;
        }
        fa faVar = (fa) hqdVar;
        ol7 ol7Var2 = (ol7) C(i);
        if (ol7Var2 instanceof aaf) {
            View view = faVar.a;
            ((ufd) view).setModelItem((aaf) ol7Var2);
            tu0.K(view, 300L, new c5(7, iaVar));
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        if (i == y7a.U0) {
            return new ha(viewGroup.getContext(), this.Y);
        }
        if (i != y7a.R0) {
            throw new IllegalStateException(("unknown item viewType " + i).toString());
        }
        ufd ufdVar = new ufd(viewGroup.getContext(), null);
        fa faVar = new fa(ufdVar);
        ufdVar.setThemeDepended(pfd.b);
        return faVar;
    }
}
