package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b59 extends ffe implements a66 {
    public final /* synthetic */ n59 X;
    public final /* synthetic */ cu8 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ l20 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b59(n59 n59Var, cu8 cu8Var, boolean z, l20 l20Var, Continuation continuation) {
        super(2, continuation);
        this.X = n59Var;
        this.Y = cu8Var;
        this.Z = z;
        this.s0 = l20Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        b59 b59Var = (b59) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        b59Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new b59(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.X.K(this.Y.b, this.Z, false, this.s0.d());
        return e5f.a;
    }
}
