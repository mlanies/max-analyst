package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wp9 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp9(wp9 wp9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = wp9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        tp9 tp9Var = (tp9) n((k4d) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        tp9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tp9 tp9Var = new tp9(this.Y, continuation);
        tp9Var.X = obj;
        return tp9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        k4d k4dVar = (k4d) this.X;
        j4d j4dVar = k4dVar.a;
        h4d h4dVar = j4dVar instanceof h4d ? (h4d) j4dVar : null;
        Long l = h4dVar != null ? new Long(h4dVar.c) : null;
        l2b l2bVar = k4dVar.b;
        j2b j2bVar = l2bVar instanceof j2b ? (j2b) l2bVar : null;
        Long l2 = j2bVar != null ? new Long(j2bVar.b) : null;
        if (l == null) {
            l = l2;
        }
        q0e q0eVar = this.Y.X;
        Iterable<qo9> iterable = (Iterable) q0eVar.getValue();
        ArrayList arrayList = new ArrayList(z53.S(iterable, 10));
        for (qo9 qo9Var : iterable) {
            arrayList.add(qo9.y(qo9Var, l != null && qo9Var.a == l.longValue()));
        }
        q0eVar.m(null, arrayList);
        return e5f.a;
    }
}
