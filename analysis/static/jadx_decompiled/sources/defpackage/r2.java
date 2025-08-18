package defpackage;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r2 extends AbstractList implements List, sb7 {
    public abstract Object a(int i);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return a(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
