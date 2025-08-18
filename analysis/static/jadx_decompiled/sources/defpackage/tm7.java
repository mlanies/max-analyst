package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class tm7 extends AbstractSequentialList implements Serializable {
    public final List a;
    public final w56 b;

    public tm7(w56 w56Var, List list) {
        list.getClass();
        this.a = list;
        this.b = w56Var;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new rm7(this, this.a.listIterator(i), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
