package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yhb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jib Y;
    public final /* synthetic */ e52 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhb(jib jibVar, e52 e52Var, Continuation continuation) {
        super(2, continuation);
        this.Y = jibVar;
        this.Z = e52Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((yhb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yhb(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        jib jibVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            if (((gh3) jibVar.Z.getValue()).f()) {
                pk pkVar = (pk) jibVar.X.getValue();
                e52 e52Var = this.Z;
                jibVar.x0.set(((k4a) pkVar).l(e52Var.a, e52Var.b.a, 0, null, true, null));
                return e5fVar;
            }
            this.X = 1;
            if (j47.x(500L, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        kld kldVar = jibVar.Y;
        ez3 ez3Var = ez3.a;
        this.X = 2;
        return kldVar.a(ez3Var, this) == tx3Var ? tx3Var : e5fVar;
    }
}
