package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yi9 extends ffe implements a66 {
    public xi9 X;
    public m56 Y;
    public int Z;
    public final /* synthetic */ xi9 s0;
    public final /* synthetic */ m56 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi9(xi9 xi9Var, t9a t9aVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = xi9Var;
        this.t0 = t9aVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((yi9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yi9(this.s0, (t9a) this.t0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [xi9] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        m56 m56Var;
        aj9 aj9Var;
        Throwable th;
        xi9 xi9Var;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        try {
            if (i == 0) {
                od2.a0(obj);
                xi9 xi9Var2 = this.s0;
                this.X = xi9Var2;
                m56Var = this.t0;
                this.Y = m56Var;
                this.Z = 1;
                aj9Var = (aj9) xi9Var2;
                if (aj9Var.d(this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xi9Var = this.X;
                    try {
                        od2.a0(obj);
                        ((aj9) xi9Var).e(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        ((aj9) xi9Var).e(null);
                        throw th;
                    }
                }
                m56Var = this.Y;
                ?? r3 = this.X;
                od2.a0(obj);
                aj9Var = r3;
            }
            this.X = aj9Var;
            this.Y = null;
            this.Z = 2;
            Object objInvoke = m56Var.invoke(this);
            if (objInvoke == tx3Var) {
                return tx3Var;
            }
            aj9 aj9Var2 = aj9Var;
            obj = objInvoke;
            xi9Var = aj9Var2;
            ((aj9) xi9Var).e(null);
            return obj;
        } catch (Throwable th3) {
            aj9 aj9Var3 = aj9Var;
            th = th3;
            xi9Var = aj9Var3;
            ((aj9) xi9Var).e(null);
            throw th;
        }
    }
}
