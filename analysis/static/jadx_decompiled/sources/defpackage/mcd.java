package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mcd extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ je7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcd(je7 je7Var, Continuation continuation) {
        super(2, continuation);
        this.Z = je7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((mcd) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mcd mcdVar = new mcd(this.Z, continuation);
        mcdVar.Y = obj;
        return mcdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            on5 on5Var = (on5) this.Y;
            Long l = new Long(((p7b) ((m7b) this.Z.getValue())).a.t());
            this.X = 1;
            if (on5Var.a(l, this) == tx3Var) {
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
