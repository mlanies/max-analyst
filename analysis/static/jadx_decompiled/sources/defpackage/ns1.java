package defpackage;

import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ns1 extends ffe implements a66 {
    public final /* synthetic */ List X;
    public final /* synthetic */ m5d Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns1(List list, m5d m5dVar, Continuation continuation) {
        super(2, continuation);
        this.X = list;
        this.Y = m5dVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ns1 ns1Var = (ns1) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ns1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ns1(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        for (al6 al6Var : this.X) {
            boolean z = al6Var instanceof wk6;
            m5d m5dVar = this.Y;
            if (z) {
                wk6 wk6Var = (wk6) al6Var;
                ((s8g) ((je7) m5dVar.c).getValue()).a(new k8d(wk6Var.b, wk6Var.d, null, false, mg4.REGULAR));
            } else if (al6Var instanceof yk6) {
                yk6 yk6Var = (yk6) al6Var;
                ((s8g) ((je7) m5dVar.c).getValue()).a(new k8d(yk6Var.b, yk6Var.c, null, false, mg4.REGULAR));
            } else if (al6Var instanceof xk6) {
                hd1 hd1Var = (hd1) ((je7) m5dVar.o).getValue();
                String str = ((xk6) al6Var).d;
                uqd uqdVarH = hd1Var.a.n().h(yb9.a);
                gd1 gd1Var = new gd1(0, str);
                uy1 uy1Var = new uy1(1);
                Objects.requireNonNull(uy1Var, "observer is null");
                try {
                    iq1 iq1Var = new iq1(uy1Var, 7, gd1Var);
                    uy1Var.c(iq1Var);
                    uqdVarH.k(iq1Var);
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            } else if (!(al6Var instanceof zk6)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
