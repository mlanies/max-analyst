package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u96 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ b86 Y;
    public final /* synthetic */ z96 Z;
    public final /* synthetic */ b86 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u96(b86 b86Var, z96 z96Var, b86 b86Var2, Continuation continuation) {
        super(2, continuation);
        this.Y = b86Var;
        this.Z = z96Var;
        this.s0 = b86Var2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((u96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new u96(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        z96 z96Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            b86 b86Var = this.Y;
            if (b86Var != null) {
                hq7 hq7Var = z96Var.X;
                int i2 = z96Var.y0.b;
                this.X = 1;
                fz6 fz6Var = (fz6) hq7Var;
                Object objT0 = j47.t0(((w9a) fz6Var.c).b().plus(fz6Var.b), new ez6(fz6Var, b86Var.a, i2, null), this);
                if (objT0 != tx3Var) {
                    objT0 = e5fVar;
                }
                if (objT0 == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        z96Var.H0 = pnf.n(z96Var, ((w9a) z96Var.s()).e().plus(z96Var.o), null, new g96(z96Var, this.s0, null), 2);
        return e5fVar;
    }
}
