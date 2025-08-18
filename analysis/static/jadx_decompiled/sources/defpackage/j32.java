package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class j32 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ on5 Z;
    public final /* synthetic */ l32 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j32(on5 on5Var, l32 l32Var, Continuation continuation) {
        super(2, continuation);
        this.Z = on5Var;
        this.s0 = l32Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((j32) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        j32 j32Var = new j32(this.Z, this.s0, continuation);
        j32Var.Y = obj;
        return j32Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            p8c p8cVarM = this.s0.m((sx3) this.Y);
            this.X = 1;
            Object objV = fp3.v(this.Z, p8cVarM, true, this);
            if (objV != tx3Var) {
                objV = e5fVar;
            }
            if (objV == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
