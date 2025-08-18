package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nk3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ zk3 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk3(zk3 zk3Var, Continuation continuation) {
        super(2, continuation);
        this.Z = zk3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((nk3) n((xeb) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        nk3 nk3Var = new nk3(this.Z, continuation);
        nk3Var.Y = obj;
        return nk3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            xeb xebVar = (xeb) this.Y;
            if (xebVar instanceof ueb) {
                Long l = ((ueb) xebVar).a;
                zk3 zk3Var = this.Z;
                long j = zk3Var.p.get();
                if (l == null || l.longValue() != j) {
                    return e5fVar;
                }
                kld kldVar = zk3Var.e;
                g43 g43Var = g43.b;
                this.X = 1;
                if (kldVar.a(g43Var, this) == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
