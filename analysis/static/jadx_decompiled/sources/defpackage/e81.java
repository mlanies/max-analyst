package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class e81 extends ppd {
    public final o9g X;
    public final Executor Y;

    public e81(o9g o9gVar, ExecutorService executorService) {
        super(executorService);
        this.X = o9gVar;
        this.Y = executorService;
    }

    @Override // defpackage.hdc
    public final void s(dec decVar, int i, List list) {
        d81 d81Var = (d81) decVar;
        if (list.isEmpty()) {
            d81Var.A((il6) this.o.f.get(i));
            return;
        }
        pk5 pk5Var = new pk5(l6d.Z(new um5(new at(2, list), new k8(21), n6d.a), n71.c));
        while (pk5Var.hasNext()) {
            hl6 hl6Var = (hl6) pk5Var.next();
            boolean z = hl6Var instanceof fl6;
            View view = d81Var.a;
            if (z) {
                ((fk3) view).setTitle(((fl6) hl6Var).a);
            } else if (hl6Var instanceof bl6) {
                bl6 bl6Var = (bl6) hl6Var;
                boolean z2 = bl6Var.d;
                long j = bl6Var.a;
                if (z2) {
                    fk3 fk3Var = (fk3) view;
                    fk3Var.E(j, null, null);
                    fk3Var.setAvatarOverlay((od0) d81Var.G0.getValue());
                } else {
                    fk3 fk3Var2 = (fk3) view;
                    fk3Var2.setAvatarOverlay(null);
                    String str = bl6Var.c;
                    if (str == null) {
                        str = "";
                    }
                    fk3Var2.E(j, bl6Var.b, str);
                }
            } else if (hl6Var instanceof gl6) {
                ((fk3) view).setTime(((gl6) hl6Var).a);
            } else if (hl6Var instanceof el6) {
                ((fk3) view).C(((el6) hl6Var).a);
            } else if (hl6Var instanceof dl6) {
                ((fk3) view).setDescription(((dl6) hl6Var).a);
            } else {
                if (!(hl6Var instanceof cl6)) {
                    throw new NoWhenBranchMatchedException();
                }
                fk3 fk3Var3 = (fk3) view;
                cl6 cl6Var = (cl6) hl6Var;
                fk3Var3.A(cl6Var.a == 1);
                fk3Var3.B(cl6Var.a == 2);
            }
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        return new d81(new fk3(viewGroup.getContext(), null), this.X);
    }
}
