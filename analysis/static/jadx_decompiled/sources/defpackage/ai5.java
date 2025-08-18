package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ai5 extends ffe implements a66 {
    public xi9 X;
    public bi5 Y;
    public String Z;
    public int s0;
    public final /* synthetic */ bi5 t0;
    public final /* synthetic */ String u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai5(bi5 bi5Var, String str, Continuation continuation) {
        super(2, continuation);
        this.t0 = bi5Var;
        this.u0 = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ai5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ai5(this.t0, this.u0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [xi9] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        aj9 aj9Var;
        String str;
        bi5 bi5Var;
        xi9 xi9Var;
        tx3 tx3Var = tx3.a;
        int i = this.s0;
        try {
            if (i == 0) {
                od2.a0(obj);
                bi5 bi5Var2 = this.t0;
                aj9Var = bi5Var2.l;
                this.X = aj9Var;
                this.Y = bi5Var2;
                str = this.u0;
                this.Z = str;
                this.s0 = 1;
                if (aj9Var.d(this) == tx3Var) {
                    return tx3Var;
                }
                bi5Var = bi5Var2;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xi9Var = this.X;
                    try {
                        od2.a0(obj);
                        ((aj9) xi9Var).e(null);
                        return e5f.a;
                    } catch (Throwable th) {
                        th = th;
                        ((aj9) xi9Var).e(null);
                        throw th;
                    }
                }
                String str2 = this.Z;
                bi5Var = this.Y;
                ?? r5 = this.X;
                od2.a0(obj);
                str = str2;
                aj9Var = r5;
            }
            kld kldVar = bi5Var.m;
            this.X = aj9Var;
            this.Y = null;
            this.Z = null;
            this.s0 = 2;
            if (kldVar.a(str, this) == tx3Var) {
                return tx3Var;
            }
            xi9Var = aj9Var;
            ((aj9) xi9Var).e(null);
            return e5f.a;
        } catch (Throwable th2) {
            th = th2;
            xi9Var = aj9Var;
            ((aj9) xi9Var).e(null);
            throw th;
        }
    }
}
