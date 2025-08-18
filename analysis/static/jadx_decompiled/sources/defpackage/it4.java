package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class it4 extends ffe implements a66 {
    public long X;
    public int Y;
    public final /* synthetic */ jt4 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it4(jt4 jt4Var, Continuation continuation) {
        super(2, continuation);
        this.Z = jt4Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((it4) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new it4(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        Object value;
        long jLongValue;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        jt4 jt4Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue2 = ((Number) jt4Var.c.getValue()).longValue();
            this.X = jCurrentTimeMillis;
            this.Y = 1;
            if (j47.x(jLongValue2, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = this.X;
            od2.a0(obj);
        }
        do {
            q0e q0eVar = jt4Var.d;
            do {
                value = q0eVar.getValue();
            } while (!q0eVar.c(value, new Long((System.currentTimeMillis() - jCurrentTimeMillis) / 1000)));
            jLongValue = ((Number) jt4Var.c.getValue()).longValue();
            this.X = jCurrentTimeMillis;
            this.Y = 2;
        } while (j47.x(jLongValue, this) != tx3Var);
        return tx3Var;
    }
}
