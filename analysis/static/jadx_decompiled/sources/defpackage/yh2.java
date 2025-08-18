package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yh2 extends ffe implements a66 {
    public Object X;
    public s35 Y;
    public int Z;
    public final /* synthetic */ gi2 s0;
    public final /* synthetic */ xm8 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh2(gi2 gi2Var, xm8 xm8Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = gi2Var;
        this.t0 = xm8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((yh2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yh2(this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        e52 e52VarV;
        s35 s35Var;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        e5f e5fVar = e5f.a;
        xm8 xm8Var = this.t0;
        gi2 gi2Var = this.s0;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = gi2.R0;
            e52VarV = gi2Var.v();
            if (e52VarV == null) {
                return e5fVar;
            }
            long j = xm8Var.j();
            this.X = e52VarV;
            this.Z = 1;
            obj = gi2Var.y(j, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s35Var = this.Y;
                gi2Var = (gi2) this.X;
                od2.a0(obj);
                bc7[] bc7VarArr2 = gi2.R0;
                gi2Var.getClass();
                pnf.o(s35Var, obj);
                return e5fVar;
            }
            e52VarV = (e52) this.X;
            od2.a0(obj);
        }
        es8 es8Var = (es8) obj;
        if (es8Var == null) {
            return e5fVar;
        }
        s35 s35Var2 = gi2Var.K0;
        yd2 yd2Var = (yd2) gi2Var.H0.getValue();
        this.X = gi2Var;
        this.Y = s35Var2;
        this.Z = 2;
        obj = yd2Var.b(e52VarV, es8Var, xm8Var, this);
        if (obj == tx3Var) {
            return tx3Var;
        }
        s35Var = s35Var2;
        bc7[] bc7VarArr22 = gi2.R0;
        gi2Var.getClass();
        pnf.o(s35Var, obj);
        return e5fVar;
    }
}
