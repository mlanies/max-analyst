package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class l2 extends j2 implements List {
    public final /* synthetic */ y1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(y1 y1Var, Object obj, List list, j2 j2Var) {
        super(y1Var, obj, list, j2Var);
        this.Y = y1Var;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean zIsEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        this.Y.X++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.b).addAll(i, collection);
        if (zAddAll) {
            this.Y.X += this.b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return ((List) this.b).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new k2(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = ((List) this.b).remove(i);
        y1 y1Var = this.Y;
        y1Var.X--;
        c();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return ((List) this.b).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        List listSubList = ((List) this.b).subList(i, i2);
        j2 j2Var = this.c;
        if (j2Var == null) {
            j2Var = this;
        }
        y1 y1Var = this.Y;
        y1Var.getClass();
        boolean z = listSubList instanceof RandomAccess;
        Object obj = this.a;
        return z ? new g2(y1Var, obj, listSubList, j2Var) : new l2(y1Var, obj, listSubList, j2Var);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new k2(this, i);
    }
}
