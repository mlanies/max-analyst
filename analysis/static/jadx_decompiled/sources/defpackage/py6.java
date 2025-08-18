package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class py6 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ fz6 Y;
    public final /* synthetic */ b86 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py6(fz6 fz6Var, b86 b86Var, Continuation continuation) {
        super(2, continuation);
        this.Y = fz6Var;
        this.Z = b86Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((py6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new py6(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        b86 b86Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            a86 a86Var = b86Var.a;
            this.X = 1;
            obj = fz6.a(a86Var, this.Y, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return b86.a(b86Var, ((Number) obj).intValue(), false, 13);
    }
}
