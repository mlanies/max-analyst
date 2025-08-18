package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qcd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ add Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcd(add addVar, Continuation continuation) {
        super(2, continuation);
        this.Y = addVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qcd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new qcd(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        add addVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            mb6 mb6Var = addVar.c;
            this.X = 1;
            obj = mb6Var.b(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        pnf.o(addVar.A0, new zfd((String) obj, new eqe(mha.w)));
        return e5f.a;
    }
}
