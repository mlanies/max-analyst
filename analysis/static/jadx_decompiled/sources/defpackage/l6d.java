package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class l6d extends m6d {
    public static int X(c6d c6dVar) {
        Iterator it = c6dVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                y53.Q();
                throw null;
            }
        }
        return i;
    }

    public static c6d Y(c6d c6dVar, int i) {
        if (i >= 0) {
            return i == 0 ? c6dVar : c6dVar instanceof os4 ? ((os4) c6dVar).b(i) : new ns4(c6dVar, i, 0);
        }
        throw new IllegalArgumentException(wg0.g(i, "Requested element count ", " is less than zero.").toString());
    }

    public static qk5 Z(c6d c6dVar, m56 m56Var) {
        return new qk5(c6dVar, true, m56Var);
    }

    public static qk5 a0(c6d c6dVar, m56 m56Var) {
        return new qk5(c6dVar, false, m56Var);
    }

    public static Object b0(r1f r1fVar) {
        Iterator it = r1fVar.a.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        return r1fVar.b.invoke(it.next());
    }

    public static Object c0(c6d c6dVar) {
        Iterator it = c6dVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final um5 d0(c6d c6dVar, m56 m56Var) {
        if (!(c6dVar instanceof r1f)) {
            return new um5(c6dVar, n71.u0, m56Var);
        }
        r1f r1fVar = (r1f) c6dVar;
        return new um5(r1fVar.a, r1fVar.b, m56Var);
    }

    public static qk5 e0(c6d c6dVar, m56 m56Var) {
        return a0(new r1f(c6dVar, m56Var), n71.v0);
    }

    public static r1f f0(c6d c6dVar, m56 m56Var) {
        return new r1f(c6dVar, new c0(8, m56Var));
    }

    public static c6d g0(c6d c6dVar, int i) {
        if (i >= 0) {
            return i == 0 ? vz4.a : c6dVar instanceof os4 ? ((os4) c6dVar).a(i) : new ns4(c6dVar, i, 1);
        }
        throw new IllegalArgumentException(wg0.g(i, "Requested element count ", " is less than zero.").toString());
    }

    public static void h0(c6d c6dVar, Collection collection) {
        Iterator it = c6dVar.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static List i0(c6d c6dVar) {
        Iterator it = c6dVar.iterator();
        if (!it.hasNext()) {
            return nz4.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
