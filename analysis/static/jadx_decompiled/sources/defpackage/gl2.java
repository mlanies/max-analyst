package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gl2 extends ffe implements a66 {
    public il2 X;
    public pk Y;
    public int Z;
    public final /* synthetic */ il2 s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ long u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl2(il2 il2Var, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.s0 = il2Var;
        this.t0 = str;
        this.u0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gl2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new gl2(this.s0, this.t0, this.u0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        il2 il2Var;
        pk pkVar;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        if (i == 0) {
            od2.a0(obj);
            il2Var = this.s0;
            pk pkVar2 = il2Var.b;
            this.X = il2Var;
            this.Y = pkVar2;
            this.Z = 1;
            Object objA = od2.A(il2Var.a, this);
            if (objA == tx3Var) {
                return tx3Var;
            }
            pkVar = pkVar2;
            obj = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pkVar = this.Y;
            il2Var = this.X;
            od2.a0(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        k4a k4aVar = (k4a) pkVar;
        il2Var.i = k4a.v(k4aVar, new hf9(this.t0, ((p7b) k4aVar.y()).a.o(), jLongValue, this.u0));
        return e5f.a;
    }
}
