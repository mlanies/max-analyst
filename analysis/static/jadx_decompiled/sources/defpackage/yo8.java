package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yo8 extends ffe implements a66 {
    public final /* synthetic */ bp8 X;
    public final /* synthetic */ Collection Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo8(bp8 bp8Var, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.X = bp8Var;
        this.Y = collection;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yo8 yo8Var = (yo8) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yo8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yo8(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Set setSingleton;
        od2.a0(obj);
        bp8 bp8Var = this.X;
        Iterator it = l6d.Z(new at(2, (Iterable) bp8Var.x0.a.getValue()), new wz7(4, this.Y)).iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((kn8) it.next()).a);
            if (it.hasNext()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(lValueOf);
                while (it.hasNext()) {
                    linkedHashSet.add(Long.valueOf(((kn8) it.next()).a));
                }
                setSingleton = linkedHashSet;
            } else {
                setSingleton = Collections.singleton(lValueOf);
            }
        } else {
            setSingleton = wz4.a;
        }
        bp8Var.u0 = setSingleton;
        xn8 xn8Var = new xn8(bp8Var.b, bp8Var.c, setSingleton);
        do8 do8Var = bp8Var.Y;
        do8Var.getClass();
        j47.T(do8Var.b, null, null, new co8(do8Var, xn8Var, null), 3);
        return e5f.a;
    }
}
