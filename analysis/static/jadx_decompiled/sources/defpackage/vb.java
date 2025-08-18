package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vb extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bc Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(bc bcVar, Continuation continuation) {
        super(2, continuation);
        this.Z = bcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vb) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vb vbVar = new vb(this.Z, continuation);
        vbVar.Y = obj;
        return vbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            List list = (List) this.Y;
            kld kldVar = this.Z.Y;
            this.X = 1;
            if (kldVar.a(list, this) == tx3Var) {
                return tx3Var;
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
