package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ec6 {
    public final wxc a;
    public final je7 b;
    public final khe c;
    public final khe d;

    public ec6(je7 je7Var, je7 je7Var2, wxc wxcVar) {
        this.a = wxcVar;
        this.b = je7Var;
        this.c = new khe(new z30(14, je7Var2));
        this.d = new khe(new z30(15, je7Var2));
    }

    public final void a(e52 e52Var, Collection collection) {
        t5c t5cVar = (t5c) this.c.getValue();
        t5cVar.getClass();
        if (t5cVar == t5c.a) {
            hm9.m0("ec6", "executeByServerIds: reactPermission is disabled", new Object[0]);
            return;
        }
        if (collection.isEmpty()) {
            hm9.m0("ec6", "messageServerIds are empty!", new Object[0]);
            return;
        }
        if (e52Var.b.a == 0) {
            if (!e52Var.b.f(this.a.a())) {
                return;
            }
        }
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "ec6", "executeByServerIds " + collection.size() + " [" + x53.n0(collection, null, null, null, null, 63) + "]", null);
        }
        try {
            b(e52Var.a, e52Var.b.a, new at(2, collection));
        } catch (Throwable th) {
            hm9.p("ec6", "executeByServerIds: call request failure!", th);
        }
    }

    public final void b(long j, long j2, at atVar) {
        khe kheVar = this.d;
        int iIntValue = ((Number) kheVar.getValue()).intValue();
        int iIntValue2 = ((Number) kheVar.getValue()).intValue();
        np8.h(iIntValue, iIntValue2);
        Iterator itQ = np8.Q(atVar.iterator(), iIntValue, iIntValue2, false);
        while (itQ.hasNext()) {
            List list = (List) itQ.next();
            k4a k4aVar = (k4a) ((pk) this.b.getValue());
            if (k4aVar.o(j)) {
                k4a.v(k4aVar, new bf9(((p7b) k4aVar.y()).a.o(), j, j2, list));
            }
        }
    }
}
