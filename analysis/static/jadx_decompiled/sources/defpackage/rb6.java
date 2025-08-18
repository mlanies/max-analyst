package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rb6 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb6(Object obj, Continuation continuation, Long l) {
        super(2, continuation);
        this.X = obj;
        this.Y = l;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rb6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rb6(this.X, continuation, this.Y);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        cu8 cu8Var = ((es8) this.X).a;
        return new q8d(new p8d(cu8Var.t0, cu8Var.b, this.Y.longValue()));
    }
}
