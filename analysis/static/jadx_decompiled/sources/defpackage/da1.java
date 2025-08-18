package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class da1 extends ppd {
    public final bkg X;

    public da1(bkg bkgVar, ExecutorService executorService) {
        super(executorService);
        this.X = bkgVar;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: H */
    public final void r(hqd hqdVar, int i) {
        if (!(hqdVar instanceof ca1)) {
            hqdVar.A((ol7) C(i));
            return;
        }
        ca1 ca1Var = (ca1) hqdVar;
        ol7 ol7Var = (ol7) C(i);
        if (ol7Var instanceof jc1) {
            ca1Var.A(ol7Var);
            tu0.K((ufd) ca1Var.a, 300L, new tb(this.X, 2, (jc1) ol7Var));
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        return new ca1(new ufd(viewGroup.getContext(), null));
    }
}
