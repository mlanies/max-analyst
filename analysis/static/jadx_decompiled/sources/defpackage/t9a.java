package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t9a extends ffe implements m56 {
    public int X;
    public final /* synthetic */ u9a Y;
    public final /* synthetic */ cu8 Z;
    public final /* synthetic */ e52 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9a(u9a u9aVar, cu8 cu8Var, e52 e52Var, Continuation continuation) {
        super(1, continuation);
        this.Y = u9aVar;
        this.Z = cu8Var;
        this.s0 = e52Var;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        return new t9a(this.Y, this.Z, this.s0, (Continuation) obj).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            a81 a81Var = new a81(this.Y, this.Z, this.s0, 6);
            this.X = 1;
            obj = ema.C(a81Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
