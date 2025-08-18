package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class im3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jm3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im3(jm3 jm3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((im3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new im3(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        jm3 jm3Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            if (!jm3Var.B.get()) {
                return e5fVar;
            }
            pc6 pc6Var = (pc6) jm3Var.A.getValue();
            this.X = 1;
            obj = ((ome) ((qea) pc6Var.a.getValue()).a.getValue()).e(new gs9(sla.o2, 7), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        Long l = ((fgc) obj).c;
        jm3.p(jm3Var, l != null ? l.longValue() : 0L);
        return e5fVar;
    }
}
