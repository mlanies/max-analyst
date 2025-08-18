package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kif extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mif Y;
    public final /* synthetic */ ijf Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kif(mif mifVar, ijf ijfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = mifVar;
        this.Z = ijfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((kif) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new kif(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            r79 r79Var = (r79) this.Y.c.getValue();
            long j = this.Z.a;
            this.X = 1;
            obj = r79Var.a(j, this);
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
