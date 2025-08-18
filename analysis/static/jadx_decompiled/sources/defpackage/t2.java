package defpackage;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class t2 extends AbstractSet implements Set, rb7 {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
