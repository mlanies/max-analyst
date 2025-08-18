package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class do1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ eo1 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do1(eo1 eo1Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = eo1Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((do1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new do1(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        eo1 eo1Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            iy2 iy2Var = (iy2) eo1Var.f.getValue();
            this.X = 1;
            obj = ((jz2) iy2Var).u(this.Z, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        long j = ((e52) obj).a;
        kld kldVar = eo1Var.i;
        je1.c.getClass();
        kldVar.g(new c64(":profile?id=" + j + "&type=local_chat"));
        return e5f.a;
    }
}
