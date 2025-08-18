package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c3e extends ffe implements a66 {
    public final /* synthetic */ i3e X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3e(i3e i3eVar, Continuation continuation) {
        super(2, continuation);
        this.X = i3eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((c3e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new c3e(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        e52 e52Var = (e52) ((jz2) ((iy2) this.X.s0.getValue())).m(this.X.b).a.getValue();
        e5f e5fVar = e5f.a;
        if (e52Var == null) {
            return e5fVar;
        }
        q0e q0eVar = this.X.z0;
        e52Var.k0();
        q0eVar.setValue(e52Var.u0);
        return e5fVar;
    }
}
