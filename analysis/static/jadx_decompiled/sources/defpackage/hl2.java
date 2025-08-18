package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hl2 extends ffe implements a66 {
    public pk X;
    public int Y;
    public final /* synthetic */ il2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl2(il2 il2Var, Continuation continuation) {
        super(2, continuation);
        this.Z = il2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hl2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hl2(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        pk pkVar;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            il2 il2Var = this.Z;
            pk pkVar2 = il2Var.b;
            this.X = pkVar2;
            this.Y = 1;
            obj = od2.A(il2Var.a, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            pkVar = pkVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pkVar = this.X;
            od2.a0(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        k4a k4aVar = (k4a) pkVar;
        k4aVar.getClass();
        k4a.v(k4aVar, new gq0(((p7b) k4aVar.y()).a.o(), jLongValue, 1));
        return e5f.a;
    }
}
