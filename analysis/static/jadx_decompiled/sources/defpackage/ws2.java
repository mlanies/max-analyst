package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ws2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws2(long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ws2) n((e52) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ws2 ws2Var = new ws2(this.Y, continuation);
        ws2Var.X = obj;
        return ws2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        e52 e52Var = (e52) this.X;
        long j = this.Y;
        long jF = e52Var.f();
        String strQ = e52Var.q();
        String strG = e52Var.g(kk0.a, jk0.a);
        if (strG == null) {
            strG = "";
        }
        e52Var.l0();
        return new rya(j, jF, e52Var.x0, strQ, strG);
    }
}
