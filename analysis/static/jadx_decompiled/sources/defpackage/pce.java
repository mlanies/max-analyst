package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class pce extends ppd {
    public final oce X;

    public pce(oce oceVar, ExecutorService executorService) {
        super(executorService);
        this.X = oceVar;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(sce sceVar, int i) {
        rce rceVar = (rce) ((ol7) C(i));
        lk3 lk3Var = (lk3) sceVar.a;
        lk3Var.setId(lga.B);
        CharSequence charSequence = rceVar.b;
        lk3Var.setName(charSequence);
        lk3Var.setMessage(rceVar.o);
        int i2 = rceVar.Z;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 1 || i2 == 2) {
            lk3Var.O(rceVar.a, charSequence, rceVar.c);
        } else {
            lk3Var.G0.setVisibility(8);
            lk3Var.J();
        }
        boolean z = !rceVar.Y.isEmpty();
        oce oceVar = this.X;
        if (z) {
            lk3.S(lk3Var, Integer.valueOf(kga.a), null, new a81(oceVar, lk3Var, rceVar, 12), 6);
        } else {
            lk3.S(lk3Var, null, null, null, 6);
        }
        tu0.K(lk3Var, 300L, new v7d(oceVar, 12, rceVar));
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        return new sce(new lk3(viewGroup.getContext(), null));
    }
}
