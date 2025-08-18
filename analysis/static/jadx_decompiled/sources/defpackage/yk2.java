package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yk2 extends ffe implements a66 {
    public final /* synthetic */ Collection X;
    public final /* synthetic */ bl2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk2(Set set, bl2 bl2Var, Continuation continuation) {
        super(2, continuation);
        this.X = set;
        this.Y = bl2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yk2 yk2Var = (yk2) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yk2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yk2((Set) this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bl2 bl2Var = this.Y;
        String strN0 = x53.n0(this.X, ", ", null, null, new l(26, bl2Var), 30);
        int iS = au1.s(bl2Var.w0);
        s35 s35Var = bl2Var.x0;
        Collection collection = this.X;
        if (iS == 0) {
            pnf.o(s35Var, np8.l(collection, new eqe(yea.i2), new iqe(strN0)));
        } else {
            if (iS != 1) {
                throw new NoWhenBranchMatchedException();
            }
            pnf.o(s35Var, np8.m(collection, new eqe(yea.j2), new iqe(strN0)));
        }
        return e5f.a;
    }
}
