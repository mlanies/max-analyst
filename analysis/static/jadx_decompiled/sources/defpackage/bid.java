package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bid extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cid Y;
    public final /* synthetic */ int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bid(cid cidVar, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = cidVar;
        this.Z = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bid) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bid(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        cid cidVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            i6f i6fVar = (i6f) cidVar.w0.getValue();
            this.X = 1;
            Object objT0 = j47.t0(((w9a) ((kke) i6fVar.c.getValue())).b(), new h6f(i6fVar, this.Z, null), this);
            if (objT0 != tx3Var) {
                objT0 = e5fVar;
            }
            if (objT0 == tx3Var) {
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
        this.X = 2;
        return cid.q(cidVar, this) == tx3Var ? tx3Var : e5fVar;
    }
}
