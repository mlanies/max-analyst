package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sn3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ yn3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn3(yn3 yn3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = yn3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sn3 sn3Var = (sn3) n((ota) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sn3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sn3 sn3Var = new sn3(this.Y, continuation);
        sn3Var.X = obj;
        return sn3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (!(((ota) this.X) instanceof ota)) {
            throw new NoWhenBranchMatchedException();
        }
        this.Y.b();
        return e5f.a;
    }
}
