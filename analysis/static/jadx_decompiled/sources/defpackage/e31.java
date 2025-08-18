package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class e31 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ l31 Y;
    public final /* synthetic */ boolean Z = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e31(l31 l31Var, Continuation continuation) {
        super(2, continuation);
        this.Y = l31Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        e31 e31Var = (e31) n((e52) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        e31Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        e31 e31Var = new e31(this.Y, continuation);
        e31Var.X = obj;
        return e31Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        e52 e52Var = (e52) this.X;
        q0e q0eVar = this.Y.j;
        long j = e52Var.a;
        e52Var.k0();
        CharSequence charSequence = e52Var.u0;
        String strG = e52Var.g(kk0.o, jk0.a);
        long jF = e52Var.f();
        e52Var.l0();
        q0eVar.m(null, new y21(new Long(j), new Long(e52Var.b.a), charSequence, strG, new Long(jF), e52Var.x0, !this.Z));
        return e5f.a;
    }
}
