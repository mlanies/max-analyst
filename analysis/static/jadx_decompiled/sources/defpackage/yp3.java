package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class yp3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cq3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp3(cq3 cq3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = cq3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yp3 yp3Var = (yp3) n((u83) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yp3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yp3 yp3Var = new yp3(this.Y, continuation);
        yp3Var.X = obj;
        return yp3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, kl7] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        ?? arrayList;
        p83 p83Var;
        Iterator it;
        Object uibVar;
        od2.a0(obj);
        u83 u83Var = (u83) this.X;
        boolean zEquals = u83Var.equals(n83.a);
        RandomAccess randomAccess = nz4.a;
        if (zEquals || u83Var.equals(o83.a)) {
            arrayList = randomAccess;
        } else {
            if (!(u83Var instanceof p83)) {
                throw new NoWhenBranchMatchedException();
            }
            p83 p83Var2 = (p83) u83Var;
            List list = p83Var2.a;
            arrayList = new ArrayList(z53.S(list, 10));
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i < 0) {
                    y53.R();
                    throw null;
                }
                t83 t83Var = (t83) next;
                int i3 = t83Var instanceof r83 ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 512;
                if (p83Var2.a.size() != 1) {
                    i3 |= i == 0 ? 536870912 : i == y53.L(p83Var2.a) ? Integer.MIN_VALUE : 1073741824;
                }
                if (tpa.f(t83Var, q83.a)) {
                    uibVar = sib.a;
                } else if (tpa.f(t83Var, r83.a)) {
                    uibVar = new tib(i3);
                } else {
                    if (!(t83Var instanceof s83)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s83 s83Var = (s83) t83Var;
                    e52 e52Var = s83Var.a;
                    long j = e52Var.a;
                    CharSequence charSequence = s83Var.b;
                    iqe iqeVar = new iqe(s83Var.c);
                    String strG = e52Var.g(kk0.c, jk0.a);
                    e52 e52Var2 = s83Var.a;
                    p83Var = p83Var2;
                    it = it2;
                    long j2 = e52Var2.b.a;
                    e52Var2.l0();
                    uibVar = new uib(new ycb(j, charSequence, iqeVar, strG, j2, e52Var2.x0), i3);
                    arrayList.add(uibVar);
                    p83Var2 = p83Var;
                    i = i2;
                    it2 = it;
                }
                p83Var = p83Var2;
                it = it2;
                arrayList.add(uibVar);
                p83Var2 = p83Var;
                i = i2;
                it2 = it;
            }
        }
        q0e q0eVar = this.Y.s;
        RandomAccess randomAccessD = randomAccess;
        if (!arrayList.isEmpty()) {
            xs2 xs2Var = this.Y.n;
            xs2Var.getClass();
            ?? L = j1e.l();
            L.add((mib) xs2Var.a.getValue());
            L.addAll(arrayList);
            randomAccessD = j1e.d(L);
        }
        q0eVar.setValue(randomAccessD);
        return e5f.a;
    }
}
