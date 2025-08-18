package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mdd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ndd Y;
    public final /* synthetic */ xdf Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdd(ndd nddVar, xdf xdfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = nddVar;
        this.Z = xdfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((mdd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new mdd(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = ndd.A0;
            ndd nddVar = this.Y;
            kxc kxcVarR = nddVar.r();
            kxcVarR.getClass();
            kxcVarR.m("app.media.video.compress", this.Z.name());
            this.X = 1;
            if (ndd.q(nddVar, this) == tx3Var) {
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
