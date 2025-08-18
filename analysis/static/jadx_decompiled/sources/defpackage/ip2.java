package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ip2 extends ffe implements a66 {
    public final /* synthetic */ rq2 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip2(rq2 rq2Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = rq2Var;
        this.Y = j;
        this.Z = j2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ip2 ip2Var = (ip2) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ip2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ip2(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        p82 p82VarL = ((jz2) this.X.X).l();
        e52 e52VarC = p82VarL.C(this.Y);
        if (e52VarC != null) {
            p82VarL.l(this.Z, e52VarC);
            ((k4a) ((pk) p82VarL.p.get())).r(e52VarC.a);
        }
        return e5f.a;
    }
}
