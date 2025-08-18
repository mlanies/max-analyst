package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hh0 extends ffe implements a66 {
    public final /* synthetic */ vg0 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh0(vg0 vg0Var, Continuation continuation) {
        super(2, continuation);
        this.X = vg0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hh0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hh0(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return Boolean.valueOf(!((Boolean) this.X.c().invoke()).booleanValue());
    }
}
