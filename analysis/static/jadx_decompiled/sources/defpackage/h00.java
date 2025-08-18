package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h00 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ i00 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(i00 i00Var, Continuation continuation) {
        super(2, continuation);
        this.Y = i00Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        h00 h00Var = (h00) n((r5c) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        h00Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        h00 h00Var = new h00(this.Y, continuation);
        h00Var.X = obj;
        return h00Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        r5c r5cVar = (r5c) this.X;
        i00 i00Var = this.Y;
        i00Var.e.m(null, i00Var.a(r5cVar));
        return e5f.a;
    }
}
