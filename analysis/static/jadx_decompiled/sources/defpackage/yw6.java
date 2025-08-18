package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class yw6 extends zw6 {
    public final /* synthetic */ zw6 X;
    public final transient int c;
    public final transient int o;

    public yw6(zw6 zw6Var, int i, int i2) {
        this.X = zw6Var;
        this.c = i;
        this.o = i2;
    }

    @Override // defpackage.qw6
    public final Object[] c() {
        return this.X.c();
    }

    @Override // defpackage.qw6
    public final int d() {
        return this.X.e() + this.c + this.o;
    }

    @Override // defpackage.qw6
    public final int e() {
        return this.X.e() + this.c;
    }

    @Override // defpackage.qw6
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        z04.k(i, this.o);
        return this.X.get(i + this.c);
    }

    @Override // defpackage.zw6, defpackage.qw6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.zw6, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.zw6, java.util.List
    /* renamed from: s */
    public final zw6 subList(int i, int i2) {
        z04.n(i, i2, this.o);
        int i3 = this.c;
        return this.X.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.o;
    }

    @Override // defpackage.zw6, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
