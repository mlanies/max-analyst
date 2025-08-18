package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class iib extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ jib s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iib(t03 t03Var, Continuation continuation, jib jibVar) {
        super(2, continuation);
        this.Z = t03Var;
        this.s0 = jibVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((iib) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        iib iibVar = new iib((t03) this.Z, continuation, this.s0);
        iibVar.Y = obj;
        return iibVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zq zqVar = new zq((on5) this.Y, this.s0, 9);
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
