package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tdb extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ feb Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdb(feb febVar, Continuation continuation) {
        super(2, continuation);
        this.Z = febVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tdb) n((kpa) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tdb tdbVar = new tdb(this.Z, continuation);
        tdbVar.Y = obj;
        return tdbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        ti9 ti9Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kpa kpaVar = (kpa) this.Y;
            e52 e52Var = (e52) kpaVar.a;
            uj3 uj3Var = (uj3) kpaVar.b;
            feb febVar = this.Z;
            if (!febVar.A0) {
                q0e q0eVar = febVar.y0;
                this.Y = q0eVar;
                this.X = 1;
                obj = feb.q(febVar, e52Var, uj3Var, false);
                if (obj == tx3Var) {
                    return tx3Var;
                }
                ti9Var = q0eVar;
            }
            return e5f.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ti9Var = (ti9) this.Y;
        od2.a0(obj);
        ti9Var.setValue(obj);
        return e5f.a;
    }
}
