package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nh9 extends ffe implements a66 {
    public final /* synthetic */ uh9 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh9(uh9 uh9Var, Continuation continuation) {
        super(2, continuation);
        this.X = uh9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        nh9 nh9Var = (nh9) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        nh9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new nh9(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        a98 a98Var;
        od2.a0(obj);
        uh9 uh9Var = this.X;
        a98 a98Var2 = uh9Var.m;
        if ((a98Var2 == null || a98Var2.getPlaybackState() != 3) && (a98Var = uh9Var.m) != null) {
            a98Var.prepare();
        }
        a98 a98Var3 = uh9Var.m;
        if (a98Var3 != null) {
            a98Var3.play();
        }
        return e5f.a;
    }
}
