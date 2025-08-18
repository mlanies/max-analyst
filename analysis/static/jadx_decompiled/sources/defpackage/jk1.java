package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jk1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ el1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk1(el1 el1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = el1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jk1 jk1Var = (jk1) n((xvc) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jk1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jk1 jk1Var = new jk1(this.Y, continuation);
        jk1Var.X = obj;
        return jk1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int iOrdinal = ((xvc) this.X).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                pnf.o(this.Y.M0, wj1.r);
            } else if (iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
