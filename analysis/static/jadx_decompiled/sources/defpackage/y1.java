package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class y1 extends q2 implements Serializable {
    public transient int X;
    public final transient Map o;

    public y1(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.o = map;
    }

    @Override // defpackage.q2
    public final Map a() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        c2 c2VarC = c();
        this.c = c2VarC;
        return c2VarC;
    }

    public final void b() {
        Map map = this.o;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.X = 0;
    }

    public c2 c() {
        return new c2(this, this.o);
    }

    public abstract Collection d();

    public d2 e() {
        return new d2(this, this.o);
    }

    public final List f(Object obj) {
        Collection collectionD = (Collection) this.o.get(obj);
        if (collectionD == null) {
            collectionD = d();
        }
        List list = (List) collectionD;
        return list instanceof RandomAccess ? new g2(this, obj, list, null) : new l2(this, obj, list, null);
    }

    public final boolean g(Object obj, Object obj2) {
        Map map = this.o;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.X++;
            return true;
        }
        Collection collectionD = d();
        if (!collectionD.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.X++;
        map.put(obj, collectionD);
        return true;
    }

    public final p2 h() {
        p2 p2Var = this.b;
        if (p2Var != null) {
            return p2Var;
        }
        p2 p2Var2 = new p2(0, this);
        this.b = p2Var2;
        return p2Var2;
    }
}
