package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class vgc extends ArrayList {
    public final Collection a;

    /* JADX WARN: Illegal instructions before constructor call */
    public vgc() {
        nz4 nz4Var = nz4.a;
        super(nz4Var);
        this.a = nz4Var;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof tgc) {
            return super.contains((tgc) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vgc) && tpa.f(this.a, ((vgc) obj).a);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof tgc) {
            return super.indexOf((tgc) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof tgc) {
            return super.lastIndexOf((tgc) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof tgc) {
            return super.remove((tgc) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "ReplyButtonRow(buttons=" + this.a + ")";
    }
}
