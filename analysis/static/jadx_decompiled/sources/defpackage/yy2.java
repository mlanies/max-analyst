package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yy2 extends ffe implements a66 {
    public final /* synthetic */ je7 X;
    public final /* synthetic */ jz2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy2(je7 je7Var, jz2 jz2Var, Continuation continuation) {
        super(2, continuation);
        this.X = je7Var;
        this.Y = jz2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yy2 yy2Var = (yy2) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yy2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yy2(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ((p82) this.X.getValue()).G = this.Y.b;
        return e5f.a;
    }
}
