package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bfb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ dfb Y;
    public final /* synthetic */ xgb Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfb(dfb dfbVar, xgb xgbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = dfbVar;
        this.Z = xgbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bfb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bfb(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            dfb dfbVar = this.Y;
            kld kldVar = dfbVar.a;
            web webVar = new web(null, dfb.a(dfbVar, this.Z.b));
            this.X = 1;
            if (kldVar.a(webVar, this) == tx3Var) {
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
