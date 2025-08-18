package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dzd extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ jzd Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzd(jzd jzdVar, Continuation continuation) {
        super(2, continuation);
        this.Z = jzdVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dzd) n((dn3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dzd dzdVar = new dzd(this.Z, continuation);
        dzdVar.Y = obj;
        return dzdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            dn3 dn3Var = (dn3) this.Y;
            q0e q0eVar = this.Z.t0;
            this.X = 1;
            q0eVar.setValue(dn3Var);
            if (e5fVar == tx3Var) {
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
