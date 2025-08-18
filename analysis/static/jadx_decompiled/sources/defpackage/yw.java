package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yw extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ bx s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(q0e q0eVar, Continuation continuation, bx bxVar) {
        super(2, continuation);
        this.Z = q0eVar;
        this.s0 = bxVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((yw) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yw ywVar = new yw((q0e) this.Z, continuation, this.s0);
        ywVar.Y = obj;
        return ywVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            xw xwVar = new xw((on5) this.Y, this.s0);
            this.X = 1;
            if (this.Z.d(xwVar, this) == tx3Var) {
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
