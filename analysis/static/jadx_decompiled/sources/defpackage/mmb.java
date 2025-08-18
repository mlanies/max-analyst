package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mmb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cnb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmb(cnb cnbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = cnbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((mmb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new mmb(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        cnb cnbVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            pab pabVar = cnbVar.O0;
            this.X = 1;
            pabVar.a(this);
            if (e5fVar == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        pnf.o(cnbVar.z0, new ulb(new eqe(yea.F0), new imb(cnbVar, 2)));
        return e5fVar;
    }
}
