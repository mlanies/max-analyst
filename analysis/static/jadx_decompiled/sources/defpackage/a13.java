package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a13 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;
    public final /* synthetic */ qp4 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a13(qp4 qp4Var, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = qp4Var;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                a13 a13Var = new a13(this.Z, continuation, 0);
                a13Var.Y = th;
                a13Var.o(e5f.a);
                throw null;
            default:
                a13 a13Var2 = new a13(this.Z, continuation, 1);
                a13Var2.Y = th;
                e5f e5fVar = e5f.a;
                a13Var2.o(e5fVar);
                return e5fVar;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                Throwable th = this.Y;
                hm9.p((String) this.Z.a, "big_flow: fail", th);
                throw th;
            default:
                od2.a0(obj);
                Throwable th2 = this.Y;
                qp4 qp4Var = this.Z;
                if (th2 != null) {
                    hm9.p((String) qp4Var.a, "big_flow: completion", th2);
                } else {
                    hm9.n((String) qp4Var.a, "big_flow: completion");
                }
                return e5f.a;
        }
    }
}
