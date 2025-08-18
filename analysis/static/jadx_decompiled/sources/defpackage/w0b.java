package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w0b extends ffe implements a66 {
    public final /* synthetic */ y0b X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ e52 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0b(y0b y0bVar, int i, e52 e52Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = y0bVar;
        this.Y = i;
        this.Z = e52Var;
        this.s0 = j;
        this.t0 = j2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        w0b w0bVar = (w0b) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        w0bVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new w0b(this.X, this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wha whaVar = (wha) this.X.e.getValue();
        whaVar.c(new eia(0, 0, this.Y, 3));
        whaVar.g(new eqe(oea.d));
        whaVar.e(nia.a);
        whaVar.f(new sia(new eqe(oea.e)));
        whaVar.d(new u72(this.X, this.Z, this.s0, this.t0));
        whaVar.i();
        return e5f.a;
    }
}
