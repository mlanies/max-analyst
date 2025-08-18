package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cfb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ dfb Y;
    public final /* synthetic */ ts2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfb(dfb dfbVar, ts2 ts2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = dfbVar;
        this.Z = ts2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cfb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cfb(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.a;
            teb tebVar = new teb(this.Z.a);
            this.X = 1;
            if (kldVar.a(tebVar, this) == tx3Var) {
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
