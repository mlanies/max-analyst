package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class kjb extends ppd {
    public final jjb X;

    public kjb(ExecutorService executorService, jjb jjbVar) {
        super(executorService);
        this.X = jjbVar;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(kgb kgbVar, int i) {
        efb efbVar = (efb) ((ol7) C(i));
        kgbVar.A(efbVar);
        if (efbVar instanceof x6) {
            n6 n6Var = kgbVar instanceof n6 ? (n6) kgbVar : null;
            if (n6Var != null) {
                ((ufd) n6Var.a).setOnSwitchListener(new qz7(new v59(2, this.X, jjb.class, "onChecked", "onChecked(JZ)V", 0, 11), 2, new om8(1, this.X, jjb.class, "onDisabledClick", "onDisabledClick(J)V", 0, 13)));
            }
        }
    }

    @Override // defpackage.ppd, defpackage.hdc
    public final int l(int i) {
        return ((efb) ((ol7) C(i))).getI0();
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (dy7.o(i2, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) {
            return new n6(viewGroup.getContext());
        }
        if (dy7.o(i2, 2048)) {
            return new g2b(viewGroup.getContext(), 1);
        }
        throw new IllegalStateException(("unknown item viewType: " + i).toString());
    }
}
