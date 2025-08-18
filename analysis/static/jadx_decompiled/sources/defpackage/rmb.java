package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rmb extends ffe implements a66 {
    public final /* synthetic */ cnb X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmb(cnb cnbVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = cnbVar;
        this.Y = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rmb rmbVar = (rmb) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rmbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rmb(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = cnb.S0;
        cnb cnbVar = this.X;
        ((jz2) cnbVar.t()).l().Q(this.Y);
        pnf.o(cnbVar.A0, pkb.b);
        return e5f.a;
    }
}
