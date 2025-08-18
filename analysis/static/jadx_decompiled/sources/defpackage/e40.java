package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e40 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ f40 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ ub8 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e40(f40 f40Var, long j, ub8 ub8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = f40Var;
        this.Z = j;
        this.s0 = ub8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((e40) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new e40(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objT0;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            nx3 nx3VarB = ((w9a) ((kke) this.Y.Z.getValue())).b();
            d40 d40Var = new d40(this.Y, this.Z, null);
            this.X = 1;
            objT0 = j47.t0(nx3VarB, d40Var, this);
            if (objT0 == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            objT0 = obj;
        }
        cu8 cu8Var = (cu8) objT0;
        if (cu8Var != null) {
            this.Y.v0 = this.Z;
            this.Y.w0 = cu8Var.t0;
            f40 f40Var = this.Y;
            f40Var.s(this.Z, this.s0, f40Var.w0);
        } else {
            this.Y.s(this.Z, this.s0, -1L);
        }
        return e5f.a;
    }
}
