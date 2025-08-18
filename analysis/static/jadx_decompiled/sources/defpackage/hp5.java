package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hp5 extends ffe implements e66 {
    public int X;
    public /* synthetic */ Throwable Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ a66 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp5(long j, a66 a66Var, Continuation continuation) {
        super(4, continuation);
        this.s0 = j;
        this.t0 = a66Var;
    }

    @Override // defpackage.e66
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        hp5 hp5Var = new hp5(this.s0, this.t0, (Continuation) obj4);
        hp5Var.Y = (Throwable) obj2;
        hp5Var.Z = jLongValue;
        return hp5Var.o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Throwable th = this.Y;
            if (this.Z < this.s0) {
                this.X = 1;
                obj = this.t0.invoke(th, this);
                if (obj == tx3Var) {
                    return tx3Var;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od2.a0(obj);
        boolean z = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z);
    }
}
