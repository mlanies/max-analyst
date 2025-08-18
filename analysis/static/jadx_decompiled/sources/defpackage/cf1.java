package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class cf1 extends ppd {
    public final ey1 X;
    public final Executor Y;

    /* JADX WARN: Illegal instructions before constructor call */
    public cf1(ey1 ey1Var) {
        ExecutorService executorServiceA = jyc.a.p().a();
        super(executorServiceA);
        this.X = ey1Var;
        this.Y = executorServiceA;
    }

    @Override // defpackage.ppd, defpackage.hdc
    public final int l(int i) {
        return ((ol7) this.o.f.get(i)).getI0();
    }

    @Override // defpackage.hdc
    public final void s(dec decVar, int i, List list) {
        hqd hqdVar = (hqd) decVar;
        boolean zIsEmpty = list.isEmpty();
        iv ivVar = this.o;
        if (zIsEmpty) {
            hqdVar.A((ol7) ivVar.f.get(i));
            return;
        }
        if (((ol7) ivVar.f.get(i)).getI0() != 1) {
            hqdVar.A((ol7) ivVar.f.get(i));
            return;
        }
        bf1 bf1Var = (bf1) hqdVar;
        pk5 pk5Var = new pk5(l6d.Z(new um5(new at(2, list), new we1(1), n6d.a), n71.X));
        while (pk5Var.hasNext()) {
            ue1 ue1Var = (ue1) pk5Var.next();
            boolean z = ue1Var instanceof se1;
            View view = bf1Var.a;
            if (z) {
                ((lk3) view).setName(((se1) ue1Var).a);
            } else {
                if (ue1Var instanceof qe1) {
                    lk3 lk3Var = (lk3) view;
                    Integer num = ((qe1) ue1Var).a;
                    lk3Var.setMessage(num != null ? lk3Var.getContext().getString(num.intValue()) : null);
                } else if (ue1Var instanceof pe1) {
                    pe1 pe1Var = (pe1) ue1Var;
                    ((lk3) view).O(pe1Var.a.a, pe1Var.b, pe1Var.c);
                } else if (ue1Var instanceof re1) {
                    re1 re1Var = (re1) ue1Var;
                    bf1Var.E(re1Var.b, re1Var.a);
                } else {
                    if (!(ue1Var instanceof te1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((lk3) view).setIconInfo(((te1) ue1Var).a ? Integer.valueOf(x7a.J) : null);
                }
            }
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new bf1(viewGroup.getContext(), this.X);
        }
        throw new IllegalArgumentException(wg0.g(i, "Not supported viewType=", " for CallOpponentsListAdapter"));
    }
}
