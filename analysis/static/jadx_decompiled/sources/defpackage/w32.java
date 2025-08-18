package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class w32 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ x32 Z;
    public final /* synthetic */ on5 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w32(x32 x32Var, on5 on5Var, Continuation continuation) {
        super(2, continuation);
        this.Z = x32Var;
        this.s0 = on5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((w32) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        w32 w32Var = new w32(this.Z, this.s0, continuation);
        w32Var.Y = obj;
        return w32Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            mec mecVar = new mec();
            x32 x32Var = this.Z;
            mn5 mn5Var = x32Var.o;
            p32 p32Var = new p32(mecVar, sx3Var, x32Var, this.s0, 1);
            this.X = 1;
            if (mn5Var.d(p32Var, this) == tx3Var) {
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
