package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bg9 extends ffe implements a66 {
    public final /* synthetic */ dg9 X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg9(dg9 dg9Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = dg9Var;
        this.Y = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bg9 bg9Var = (bg9) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bg9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bg9(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Set setG0;
        List listD;
        od2.a0(obj);
        dg9 dg9Var = this.X;
        Set set = ((xf9) dg9Var.d.getValue()).b;
        boolean zIsEmpty = set.isEmpty();
        long j = this.Y;
        if (zIsEmpty) {
            setG0 = Collections.singleton(new Long(j));
        } else if (set.contains(new Long(j))) {
            setG0 = x53.G0(set);
            setG0.remove(new Long(j));
        } else {
            Long l = new Long(j);
            LinkedHashSet linkedHashSet = new LinkedHashSet(mz7.Z(set.size() + 1));
            linkedHashSet.addAll(set);
            linkedHashSet.add(l);
            setG0 = linkedHashSet;
        }
        if (setG0.isEmpty()) {
            listD = nz4.a;
        } else {
            kl7 kl7VarL = j1e.l();
            kl7VarL.add(new zka(gja.v, hja.h, woc.w));
            listD = j1e.d(kl7VarL);
        }
        dg9Var.d.m(null, new xf9(true, setG0, listD));
        return e5f.a;
    }
}
