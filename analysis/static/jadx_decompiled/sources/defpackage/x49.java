package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x49 extends ffe implements a66 {
    public final /* synthetic */ n59 X;
    public final /* synthetic */ List Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x49(n59 n59Var, List list, Continuation continuation) {
        super(2, continuation);
        this.X = n59Var;
        this.Y = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((x49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new x49(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Long l;
        od2.a0(obj);
        n59 n59Var = this.X;
        e52 e52Var = (e52) n59Var.o1.a.getValue();
        e5f e5fVar = e5f.a;
        if (e52Var != null && (l = (Long) x53.i0(this.Y)) != null) {
            long jLongValue = l.longValue();
            if (e52Var.X != null) {
                pnf.n(n59Var, ((w9a) n59Var.Y).b(), null, new m59(n59Var, e52Var.a, jLongValue, e52Var.b.a, null), 2);
            }
        }
        return e5fVar;
    }
}
