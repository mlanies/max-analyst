package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h83 extends ffe implements a66 {
    public final /* synthetic */ m83 X;
    public final /* synthetic */ y73 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h83(m83 m83Var, y73 y73Var, Continuation continuation) {
        super(2, continuation);
        this.X = m83Var;
        this.Y = y73Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((h83) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new h83(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = m83.m;
        return ((jz2) ((iy2) this.X.f.getValue())).m(((w73) this.Y).a).a.getValue();
    }
}
