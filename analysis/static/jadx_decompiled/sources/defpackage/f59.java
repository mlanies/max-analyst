package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class f59 extends ffe implements a66 {
    public final /* synthetic */ n59 X;
    public final /* synthetic */ cu8 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f59(n59 n59Var, cu8 cu8Var, Continuation continuation) {
        super(2, continuation);
        this.X = n59Var;
        this.Y = cu8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        f59 f59Var = (f59) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        f59Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new f59(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        long j = this.Y.b;
        bc7[] bc7VarArr = n59.D1;
        this.X.K(j, false, false, false);
        return e5f.a;
    }
}
