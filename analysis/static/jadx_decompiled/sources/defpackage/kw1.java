package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class kw1 implements tj3 {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ tj3 b;
    public final /* synthetic */ lw1 c;

    public kw1(lw1 lw1Var, Executor executor, cy1 cy1Var) {
        this.c = lw1Var;
        this.a = executor;
        this.b = cy1Var;
    }

    @Override // defpackage.tj3
    public final void accept(Object obj) {
        xkf xkfVar = (xkf) obj;
        if (xkfVar instanceof skf) {
            if (kq0.t()) {
                lw1 lw1Var = this.c;
                cdc cdcVar = (cdc) lw1Var.h.remove(this);
                if (cdcVar != null && lw1Var.g == cdcVar) {
                    lw1Var.g = null;
                }
            } else {
                this.a.execute(new cu1(3, this));
            }
        }
        this.b.accept(xkfVar);
    }
}
