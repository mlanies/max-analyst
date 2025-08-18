package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vv extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bx Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ ta3 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(bx bxVar, long j, ta3 ta3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = bxVar;
        this.Z = j;
        this.s0 = ta3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vv) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vv(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bx bxVar = this.Y;
            uu uuVar = bxVar.j;
            fd7 fd7Var = new fd7(this.s0);
            this.X = 1;
            if (bxVar.t(uuVar, this.Z, fd7Var, this) == tx3Var) {
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
