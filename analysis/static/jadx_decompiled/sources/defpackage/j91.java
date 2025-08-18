package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class j91 extends ffe implements a66 {
    public int X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((j91) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new j91(2, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            xq9 xq9Var = xq9.a;
            i91 i91Var = new i91(2, null);
            this.X = 1;
            if (j47.t0(xq9Var, i91Var, this) == tx3Var) {
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
