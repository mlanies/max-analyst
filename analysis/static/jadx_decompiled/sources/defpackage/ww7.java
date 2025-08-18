package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ww7 extends ffe implements a66 {
    public final /* synthetic */ ax7 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww7(ax7 ax7Var, Continuation continuation) {
        super(2, continuation);
        this.X = ax7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ww7 ww7Var = (ww7) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ww7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ww7(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ((ita) this.X.c.getValue()).d(2, 1);
        return e5f.a;
    }
}
