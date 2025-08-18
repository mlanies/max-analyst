package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pwa extends ffe implements a66 {
    public q0e X;
    public int Y;
    public final /* synthetic */ qwa Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwa(qwa qwaVar, Continuation continuation) {
        super(2, continuation);
        this.Z = qwaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pwa) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pwa(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        q0e q0eVar;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            qwa qwaVar = this.Z;
            q0e q0eVar2 = qwaVar.d;
            ds3 ds3Var = (ds3) qwaVar.a.getValue();
            this.X = q0eVar2;
            this.Y = 1;
            obj = ds3Var.d();
            if (obj == tx3Var) {
                return tx3Var;
            }
            q0eVar = q0eVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q0eVar = this.X;
            od2.a0(obj);
        }
        q0eVar.setValue(Boolean.valueOf(((Number) obj).intValue() == 0));
        return e5f.a;
    }
}
