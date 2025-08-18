package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zeb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ dfb Y;
    public final /* synthetic */ vab Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zeb(dfb dfbVar, vab vabVar, Continuation continuation) {
        super(2, continuation);
        this.Y = dfbVar;
        this.Z = vabVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zeb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zeb(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.a;
            veb vebVar = new veb(this.Z.c);
            this.X = 1;
            if (kldVar.a(vebVar, this) == tx3Var) {
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
