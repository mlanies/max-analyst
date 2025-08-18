package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a50 extends ffe implements a66 {
    public final /* synthetic */ je7 X;
    public final /* synthetic */ c50 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a50(je7 je7Var, c50 c50Var, Continuation continuation) {
        super(2, continuation);
        this.X = je7Var;
        this.Y = c50Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        a50 a50Var = (a50) n((on5) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        a50Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new a50(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        je7 je7Var = this.X;
        ch9 ch9Var = (ch9) je7Var.getValue();
        c50 c50Var = this.Y;
        ((uh9) ch9Var).e(c50Var.d);
        j47.T(c50Var.b, null, null, new z40(je7Var, c50Var, null), 3);
        return e5f.a;
    }
}
