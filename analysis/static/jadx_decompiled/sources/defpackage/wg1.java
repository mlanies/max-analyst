package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class wg1 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ xg1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg1(xg1 xg1Var, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                ug1 ug1Var = ug1.a;
                this.o = xg1Var;
                super(9, ug1Var);
                break;
            default:
                this.o = xg1Var;
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        x1b u1bVar;
        switch (this.c) {
            case 0:
                fka fkaVar = (fka) obj2;
                if (tpa.f((fka) obj, fkaVar)) {
                    return;
                }
                this.o.getFakePipView().setCustomTheme(fkaVar);
                return;
            case 1:
                ug1 ug1Var = (ug1) obj2;
                if (((ug1) obj) != ug1Var) {
                    int iOrdinal = ug1Var.ordinal();
                    xg1 xg1Var = this.o;
                    if (iOrdinal == 0) {
                        u1bVar = v1b.a;
                    } else if (iOrdinal == 1) {
                        u1bVar = new u1b(xg1Var, new wd6(5, xg1Var), xg1Var.getPipPositionMediator());
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        u1bVar = new f1b(xg1Var, new re6(6, xg1Var), xg1Var.getPipPositionMediator());
                    }
                    xg1Var.o = u1bVar;
                    return;
                }
                return;
            default:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                xg1 xg1Var2 = this.o;
                xg1Var2.c(xg1Var2.getLeft(), xg1Var2.getTop(), xg1Var2.getRight(), xg1Var2.getBottom());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg1(j1b j1bVar, xg1 xg1Var) {
        super(9, j1bVar);
        this.c = 2;
        this.o = xg1Var;
    }
}
