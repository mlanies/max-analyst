package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xt2 extends ffe implements m56 {
    public final /* synthetic */ pu2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt2(pu2 pu2Var, Continuation continuation) {
        super(1, continuation);
        this.X = pu2Var;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) throws Throwable {
        xt2 xt2Var = new xt2(this.X, (Continuation) obj);
        e5f e5fVar = e5f.a;
        xt2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        pu2 pu2Var = this.X;
        ArrayList arrayListE = pu2Var.a.e();
        boolean z = x53.q0(arrayListE) instanceof uk6;
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof nl2) {
                arrayList.add(next);
            }
        }
        ArrayList arrayListT0 = x53.t0(pu2Var.w0, x53.x0(arrayList, new fs4(14)));
        mt2 mt2Var = new mt2(arrayListT0, z);
        String str = pu2Var.z0;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, zr6.h(arrayListT0.size(), "emitHistory "), null);
        }
        pu2Var.x0.m(null, mt2Var);
        pu2Var.u0.set(arrayListE.isEmpty() && !z);
        return e5f.a;
    }
}
