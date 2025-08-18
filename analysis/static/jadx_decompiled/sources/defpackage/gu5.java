package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gu5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Set Y;
    public final /* synthetic */ nu5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu5(nu5 nu5Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = set;
        this.Z = nu5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gu5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new gu5(this.Z, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Set set;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            if (this.Y.isEmpty() && (!((Collection) this.Z.y0.get()).isEmpty())) {
                nu5 nu5Var = this.Z;
                at5 at5Var = nu5Var.A0;
                if (at5Var != null && (set = at5Var.v0) != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        nu5Var.s(((Number) it.next()).longValue());
                    }
                }
                nu5Var.y0.updateAndGet(new oe2(2));
            } else if (!this.Y.isEmpty()) {
                nu5 nu5Var2 = this.Z;
                Set set2 = this.Y;
                this.X = 1;
                if (nu5.q(nu5Var2, set2, this) == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            od2.a0(obj);
        }
        nu5 nu5Var3 = this.Z;
        this.X = 2;
        if (nu5.r(nu5Var3, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
