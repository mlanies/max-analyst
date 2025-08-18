package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rh9 extends ffe implements a66 {
    public final /* synthetic */ uh9 X;
    public final /* synthetic */ float Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh9(uh9 uh9Var, float f, Continuation continuation) {
        super(2, continuation);
        this.X = uh9Var;
        this.Y = f;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rh9 rh9Var = (rh9) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rh9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rh9(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        a98 a98Var = this.X.m;
        if (a98Var != null) {
            a98Var.setPlaybackSpeed(this.Y);
        }
        return e5f.a;
    }
}
