package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class shg extends rhg {
    public static final shg X = new shg(0, new Object[0]);
    public final transient Object[] c;
    public final transient int o;

    public shg(int i, Object[] objArr) {
        this.c = objArr;
        this.o = i;
    }

    @Override // defpackage.ohg
    public final Object[] a() {
        return this.c;
    }

    @Override // defpackage.ohg
    public final int b() {
        return 0;
    }

    @Override // defpackage.ohg
    public final int c() {
        return this.o;
    }

    @Override // defpackage.ohg
    public final boolean d() {
        return false;
    }

    @Override // defpackage.rhg, defpackage.ohg
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.o;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        lz7.a0(i, this.o);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.o;
    }
}
