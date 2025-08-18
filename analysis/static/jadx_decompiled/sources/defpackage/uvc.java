package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class uvc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vvc Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvc(long j, vvc vvcVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vvcVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((uvc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new uvc(this.Z, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        long jLongValue;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        vvc vvcVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            long jLongValue2 = ((Number) vvcVar.v0.getValue()).longValue();
            this.X = 1;
            if (j47.x(jLongValue2, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        do {
            q0e q0eVar = vvcVar.y0;
            do {
                value = q0eVar.getValue();
            } while (!q0eVar.c(value, new Long((System.currentTimeMillis() - this.Z) / 1000)));
            jLongValue = ((Number) vvcVar.v0.getValue()).longValue();
            this.X = 2;
        } while (j47.x(jLongValue, this) != tx3Var);
        return tx3Var;
    }
}
