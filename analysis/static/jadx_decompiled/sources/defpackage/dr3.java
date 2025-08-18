package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dr3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gza Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr3(gza gzaVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = gzaVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dr3) n((dn3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dr3 dr3Var = new dr3(this.Y, this.Z, continuation);
        dr3Var.X = obj;
        return dr3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        List list;
        od2.a0(obj);
        dn3 dn3Var = (dn3) this.X;
        int iOrdinal = this.Y.b.ordinal();
        long j = this.Z;
        Object obj2 = null;
        if (iOrdinal != 1) {
            if (iOrdinal != 2 || (list = dn3Var.c) == null) {
                return null;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((nn3) next).a == j) {
                    obj2 = next;
                    break;
                }
            }
            return (nn3) obj2;
        }
        List list2 = dn3Var.a;
        if (list2 == null) {
            return null;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((nn3) next2).a == j) {
                obj2 = next2;
                break;
            }
        }
        return (nn3) obj2;
    }
}
