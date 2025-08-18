package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n96 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ z96 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n96(z96 z96Var, Continuation continuation) {
        super(2, continuation);
        this.Z = z96Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((n96) n((kpa) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        n96 n96Var = new n96(this.Z, continuation);
        n96Var.Y = obj;
        return n96Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        z96 z96Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            kpa kpaVar = (kpa) this.Y;
            int iIntValue = ((Number) kpaVar.a).intValue();
            v86 v86Var = (v86) kpaVar.b;
            if (tpa.f(v86Var, t86.b)) {
                boolean zB = ((eua) z96Var.s0.getValue()).b(eua.l);
                zt0 zt0Var = z96Var.D0;
                if (zB) {
                    e86 e86Var = e86.a;
                    this.X = 1;
                    if (zt0Var.o(e86Var, this) == tx3Var) {
                        return tx3Var;
                    }
                    pnf.o(z96Var.Y.c, l86.a);
                } else {
                    f86 f86Var = f86.a;
                    this.X = 2;
                    if (zt0Var.o(f86Var, this) == tx3Var) {
                        return tx3Var;
                    }
                }
            } else {
                if (!(v86Var instanceof u86)) {
                    throw new NoWhenBranchMatchedException();
                }
                s35 s35Var = z96Var.Y.c;
                if (z96Var.b.a) {
                    iIntValue--;
                }
                pnf.o(s35Var, new n86(iIntValue, ((b86) z96Var.C0.a.getValue()).a.b(), ((u86) v86Var).c));
            }
        } else if (i == 1) {
            od2.a0(obj);
            pnf.o(z96Var.Y.c, l86.a);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
