package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a5a extends ffe implements a66 {
    public int X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((a5a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new a5a(2, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            t03 t03VarG = ((zb2) ((ta2) jyc.a.getAccessor().c(ta2.class))).g();
            this.X = 1;
            if (od2.U(t03VarG, this) == tx3Var) {
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
