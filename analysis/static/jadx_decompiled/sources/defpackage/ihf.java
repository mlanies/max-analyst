package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ihf extends ffe implements a66 {
    public final /* synthetic */ nif X;
    public final /* synthetic */ cu8 Y;
    public final /* synthetic */ wgf Z;
    public final /* synthetic */ gef s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihf(nif nifVar, cu8 cu8Var, wgf wgfVar, gef gefVar, Continuation continuation) {
        super(2, continuation);
        this.X = nifVar;
        this.Y = cu8Var;
        this.Z = wgfVar;
        this.s0 = gefVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ihf ihfVar = (ihf) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ihfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ihf(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.X.a(this.Y.b, this.Z, this.s0);
        return e5f.a;
    }
}
