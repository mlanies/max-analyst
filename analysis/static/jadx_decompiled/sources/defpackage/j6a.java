package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class j6a extends ffe implements a66 {
    public int X;
    public final /* synthetic */ k6a Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6a(k6a k6aVar, Continuation continuation) {
        super(2, continuation);
        this.Y = k6aVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((j6a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new j6a(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        k6a k6aVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            xie xieVar = (xie) k6aVar.b.getValue();
            xieVar.getClass();
            sa3 sa3Var = new sa3(0, new vpc(hz4.a, new rie(xieVar, null)));
            this.X = 1;
            if (s36.e(sa3Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        hm9.n("PushToken", "Refresh current token succeed.");
        xie xieVar2 = (xie) k6aVar.b.getValue();
        i6a i6aVar = new i6a(k6aVar);
        xieVar2.getClass();
        j47.T(xieVar2.s0, null, null, new sie(xieVar2, i6aVar, null), 3);
        return e5f.a;
    }
}
