package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lif extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mif Y;
    public final /* synthetic */ cu8 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lif(mif mifVar, cu8 cu8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = mifVar;
        this.Z = cu8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((lif) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new lif(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ds3 ds3Var = (ds3) this.Y.o.getValue();
            long j = this.Z.Y;
            this.X = 1;
            obj = ds3Var.b(j, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
