package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ji7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ki7 Y;
    public final /* synthetic */ oi0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji7(ki7 ki7Var, oi0 oi0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ki7Var;
        this.Z = oi0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ji7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ji7(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.a;
            oi0 oi0Var = this.Z;
            long j = oi0Var.a;
            pke pkeVar = oi0Var.b;
            String str = pkeVar.o;
            if (str == null) {
                str = pkeVar.c;
            }
            bi7 bi7Var = new bi7(j, str);
            this.X = 1;
            if (kldVar.a(bi7Var, this) == tx3Var) {
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
