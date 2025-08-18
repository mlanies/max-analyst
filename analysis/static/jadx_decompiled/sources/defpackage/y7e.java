package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y7e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ b8e Y;
    public final /* synthetic */ w3e Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7e(b8e b8eVar, w3e w3eVar, Continuation continuation) {
        super(2, continuation);
        this.Y = b8eVar;
        this.Z = w3eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((y7e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new y7e(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            b8e b8eVar = this.Y;
            AtomicLong atomicLong = b8eVar.v0;
            w3e w3eVar = this.Z;
            atomicLong.compareAndSet(0L, w3eVar.a);
            db3 db3VarD = ((sc5) b8eVar.Y.getValue()).d(w3eVar.a, true);
            this.X = 1;
            if (s36.e(db3VarD, this) == tx3Var) {
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
