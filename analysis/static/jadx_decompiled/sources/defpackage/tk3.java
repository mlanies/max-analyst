package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tk3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ zk3 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk3(t03 t03Var, Continuation continuation, zk3 zk3Var) {
        super(2, continuation);
        this.Z = t03Var;
        this.s0 = zk3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tk3) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tk3 tk3Var = new tk3((t03) this.Z, continuation, this.s0);
        tk3Var.Y = obj;
        return tk3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zq zqVar = new zq((on5) this.Y, this.s0, 4);
            this.X = 1;
            if (this.Z.d(zqVar, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
