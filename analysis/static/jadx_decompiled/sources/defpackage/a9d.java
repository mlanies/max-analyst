package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a9d extends ffe implements a66 {
    public int X;
    public final /* synthetic */ c9d Y;
    public final /* synthetic */ kec Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9d(c9d c9dVar, kec kecVar, Continuation continuation) {
        super(2, continuation);
        this.Y = c9dVar;
        this.Z = kecVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((a9d) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new a9d(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            c9d c9dVar = this.Y;
            e8d e8dVar = c9dVar.a;
            if (e8dVar == null) {
                e8dVar = null;
            }
            js7 js7Var = (js7) e8dVar.w.getValue();
            k5d k5dVar = new k5d(c9dVar, 1, this.Z);
            this.X = 1;
            hmc hmcVarB = js7Var.b();
            Object objT0 = j47.t0(((w9a) hmcVarB.a).b(), new emc(hmcVarB, k5dVar, null), this);
            if (objT0 != tx3Var) {
                objT0 = e5fVar;
            }
            if (objT0 != tx3Var) {
                objT0 = e5fVar;
            }
            if (objT0 == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
