package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class u32 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ x32 Y;
    public final /* synthetic */ on5 Z;
    public final /* synthetic */ Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u32(x32 x32Var, on5 on5Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Y = x32Var;
        this.Z = on5Var;
        this.s0 = obj;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((u32) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new u32(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            c66 c66Var = this.Y.X;
            this.X = 1;
            if (c66Var.invoke(this.Z, this.s0, this) == tx3Var) {
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
