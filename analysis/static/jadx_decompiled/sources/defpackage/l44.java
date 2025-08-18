package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l44 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ o44 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l44(long j, o44 o44Var, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = o44Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((l44) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new l44(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long j = this.Y;
            if (j > 0) {
                this.X = 1;
                if (j47.x(j, this) == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            od2.a0(obj);
        }
        o44 o44Var = this.Z;
        f44 f44Var = o44Var.g;
        this.X = 2;
        if (o44.a(o44Var, f44Var, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
