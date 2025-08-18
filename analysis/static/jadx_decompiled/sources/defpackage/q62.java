package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q62 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ k72 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q62(k72 k72Var, Continuation continuation) {
        super(2, continuation);
        this.Z = k72Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((q62) n((e52) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        q62 q62Var = new q62(this.Z, continuation);
        q62Var.Y = obj;
        return q62Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            e52 e52Var = (e52) this.Y;
            if (e52Var.J() && !e52Var.z()) {
                kld kldVar = this.Z.e;
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
        return e5f.a;
    }
}
