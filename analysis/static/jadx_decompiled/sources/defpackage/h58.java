package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class h58 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ p58 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h58(p58 p58Var, Continuation continuation) {
        super(2, continuation);
        this.Y = p58Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((h58) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new h58(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            return e5f.a;
        }
        od2.a0(obj);
        p58 p58Var = this.Y;
        q0e q0eVar = p58Var.s0;
        xw xwVar = new xw(8, p58Var);
        this.X = 1;
        q0eVar.d(new zq(new kec(), 1, xwVar), this);
        return tx3Var;
    }
}
