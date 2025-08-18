package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class us extends qpd implements Map {
    public rs X;
    public ts Y;
    public ps o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us(qpd qpdVar) {
        super(0);
        int i = qpdVar.c;
        b(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(qpdVar.f(i2), qpdVar.i(i2));
            }
        } else if (i > 0) {
            ys.V(0, 0, i, qpdVar.a, this.a);
            ys.W(0, 0, i << 1, qpdVar.b, this.b);
            this.c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        ps psVar = this.o;
        if (psVar != null) {
            return psVar;
        }
        ps psVar2 = new ps(this);
        this.o = psVar2;
        return psVar2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        rs rsVar = this.X;
        if (rsVar != null) {
            return rsVar;
        }
        rs rsVar2 = new rs(this);
        this.X = rsVar2;
        return rsVar2;
    }

    public final boolean l(Collection collection) {
        int i = this.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                g(i2);
            }
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        ts tsVar = this.Y;
        if (tsVar != null) {
            return tsVar;
        }
        ts tsVar2 = new ts(this);
        this.Y = tsVar2;
        return tsVar2;
    }
}
