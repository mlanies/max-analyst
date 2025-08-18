package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sp2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rq2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp2(rq2 rq2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = rq2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sp2(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            t03 t03Var = new t03(this.Y.Y0, 11);
            this.X = 1;
            obj = od2.A(t03Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return new Long(((e52) obj).a);
    }
}
