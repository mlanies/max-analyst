package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s93 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ v93 b;

    public /* synthetic */ s93(v93 v93Var, int i) {
        this.a = i;
        this.b = v93Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                v93 v93Var = this.b;
                Map mapB = v93Var.b();
                if (mapB != null) {
                    return mapB.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iD = v93Var.d(entry.getKey());
                    if (iD != -1 && f46.B(v93Var.j()[iD], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                v93 v93Var = this.b;
                Map mapB = v93Var.b();
                return mapB != null ? mapB.entrySet().iterator() : new r93(v93Var, 1);
            default:
                v93 v93Var2 = this.b;
                Map mapB2 = v93Var2.b();
                return mapB2 != null ? mapB2.keySet().iterator() : new r93(v93Var2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                v93 v93Var = this.b;
                Map mapB = v93Var.b();
                if (mapB != null) {
                    return mapB.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!v93Var.f()) {
                        int iC = v93Var.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = v93Var.a;
                        Objects.requireNonNull(obj2);
                        int iH = pag.H(key, value, iC, obj2, v93Var.h(), v93Var.i(), v93Var.j());
                        if (iH != -1) {
                            v93Var.e(iH, iC);
                            v93Var.Y--;
                            v93Var.X += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                v93 v93Var2 = this.b;
                Map mapB2 = v93Var2.b();
                return mapB2 != null ? mapB2.keySet().remove(obj) : v93Var2.g(obj) != v93.u0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
