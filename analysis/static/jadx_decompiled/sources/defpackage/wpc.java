package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wpc extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ r1a Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpc(r1a r1aVar, Continuation continuation) {
        super(2, continuation);
        this.Z = r1aVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wpc) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wpc wpcVar = new wpc(this.Z, continuation);
        wpcVar.Y = obj;
        return wpcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            iab iabVar = (iab) this.Y;
            AtomicReference atomicReference = new AtomicReference();
            this.Z.a(new l7b(iabVar, atomicReference, false, 4));
            jw3 jw3Var = new jw3(atomicReference, 3);
            this.X = 1;
            if (j47.j(iabVar, jw3Var, this) == tx3Var) {
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
