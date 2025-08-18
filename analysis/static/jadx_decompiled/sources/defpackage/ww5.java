package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ww5 extends ffe implements a66 {
    public final /* synthetic */ yw5 X;
    public final /* synthetic */ String Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww5(yw5 yw5Var, String str, Continuation continuation) {
        super(2, continuation);
        this.X = yw5Var;
        this.Y = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ww5 ww5Var = (ww5) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ww5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ww5(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wha whaVar = (wha) this.X.Y.getValue();
        whaVar.h(this.Y);
        whaVar.e(new kia(woc.j));
        whaVar.i();
        return e5f.a;
    }
}
