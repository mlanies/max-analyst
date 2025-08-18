package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class z57 extends ffe implements a66 {
    public int X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((z57) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new z57(2, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            int i2 = ft4.o;
            long jR = z7.R(2, kt4.SECONDS);
            this.X = 1;
            if (j47.y(jR, this) == tx3Var) {
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
