package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class r32 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ s32 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r32(s32 s32Var, Continuation continuation) {
        super(2, continuation);
        this.Z = s32Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((r32) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        r32 r32Var = new r32(this.Z, continuation);
        r32Var.Y = obj;
        return r32Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            on5 on5Var = (on5) this.Y;
            this.X = 1;
            if (this.Z.n(on5Var, this) == tx3Var) {
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
