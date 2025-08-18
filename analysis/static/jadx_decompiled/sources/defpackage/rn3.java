package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rn3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ yn3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn3(yn3 yn3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = yn3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rn3 rn3Var = (rn3) n((nm3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rn3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rn3 rn3Var = new rn3(this.Y, continuation);
        rn3Var.X = obj;
        return rn3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        nm3 nm3Var = (nm3) this.X;
        boolean zF = tpa.f(nm3Var, lm3.a);
        yn3 yn3Var = this.Y;
        if (!zF && !(nm3Var instanceof mm3)) {
            throw new NoWhenBranchMatchedException();
        }
        yn3Var.b();
        return e5f.a;
    }
}
