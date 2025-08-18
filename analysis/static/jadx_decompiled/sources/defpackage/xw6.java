package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class xw6 extends zw6 {
    public final transient zw6 c;

    public xw6(zw6 zw6Var) {
        this.c = zw6Var;
    }

    @Override // defpackage.zw6, defpackage.qw6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // defpackage.qw6
    public final boolean f() {
        return this.c.f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        zw6 zw6Var = this.c;
        z04.k(i, zw6Var.size());
        return zw6Var.get((zw6Var.size() - 1) - i);
    }

    @Override // defpackage.zw6, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.zw6, defpackage.qw6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.zw6, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.c.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // defpackage.zw6, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.zw6
    public final zw6 q() {
        return this.c;
    }

    @Override // defpackage.zw6, java.util.List
    /* renamed from: s */
    public final zw6 subList(int i, int i2) {
        zw6 zw6Var = this.c;
        z04.n(i, i2, zw6Var.size());
        return zw6Var.subList(zw6Var.size() - i2, zw6Var.size() - i).q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // defpackage.zw6, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
