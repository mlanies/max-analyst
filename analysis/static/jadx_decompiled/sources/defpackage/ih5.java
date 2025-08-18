package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ih5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jh5 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih5(jh5 jh5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = jh5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ih5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ih5(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        jh5 jh5Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            String str = jh5Var.b.c;
            if (str != null) {
                k6f k6fVar = (k6f) jh5Var.X.getValue();
                kh5 kh5Var = jh5Var.b;
                long j = kh5Var.a;
                long j2 = kh5Var.b;
                d20 d20Var = d20.X;
                this.X = 1;
                if (k6fVar.a(j, j2, str, d20Var, this) == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        no4 no4Var = (no4) jh5Var.o.getValue();
        kh5 kh5Var2 = jh5Var.b;
        no4Var.a(kh5Var2.b, kh5Var2.d, kh5Var2.c, kh5Var2.e, kh5Var2.f);
        return e5f.a;
    }
}
