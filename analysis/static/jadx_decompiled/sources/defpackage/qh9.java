package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qh9 extends ffe implements a66 {
    public final /* synthetic */ long X;
    public final /* synthetic */ uh9 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh9(long j, uh9 uh9Var, Continuation continuation) {
        super(2, continuation);
        this.X = j;
        this.Y = uh9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qh9 qh9Var = (qh9) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qh9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new qh9(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int i = uh9.K;
        long j = this.X;
        hm9.m("uh9", "seekToPosition, posMs %d", new Long(j));
        uh9 uh9Var = this.Y;
        uh9Var.f();
        a98 a98Var = uh9Var.m;
        if (a98Var != null) {
            a98Var.seekTo(j);
        }
        uh9Var.s.m(null, new Long(j));
        uh9Var.G.m(null, new Float(ote.d((float) (j / uh9Var.E), 0.0f, 1.0f)));
        return e5f.a;
    }
}
