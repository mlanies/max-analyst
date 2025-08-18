package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class odd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rdd Y;
    public final /* synthetic */ vbd Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odd(rdd rddVar, vbd vbdVar, Continuation continuation) {
        super(2, continuation);
        this.Y = rddVar;
        this.Z = vbdVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((odd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new odd(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.b;
            vdd vddVar = new vdd(this.Z);
            this.X = 1;
            if (kldVar.a(vddVar, this) == tx3Var) {
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
