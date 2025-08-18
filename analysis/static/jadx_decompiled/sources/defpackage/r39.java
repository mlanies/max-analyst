package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r39 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r39(n59 n59Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = n59Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((r39) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new r39(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        n59 n59Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            r79 r79VarR = n59.r(n59Var);
            this.X = 1;
            obj = r79VarR.a(this.Z, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5fVar;
            }
            od2.a0(obj);
        }
        cu8 cu8Var = (cu8) obj;
        if (cu8Var == null) {
            return e5fVar;
        }
        if (cu8Var.m(g20.c)) {
            this.X = 2;
            if (n59.s(n59Var, cu8Var, this) == tx3Var) {
                return tx3Var;
            }
        } else if (cu8Var.m(g20.o)) {
            this.X = 3;
            if (n59.t(n59Var, cu8Var, this) == tx3Var) {
                return tx3Var;
            }
        }
        return e5fVar;
    }
}
