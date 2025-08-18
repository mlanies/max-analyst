package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class jfc extends zw6 {
    public final transient int X;
    public final transient Object[] c;
    public final transient int o;

    public jfc(int i, int i2, Object[] objArr) {
        this.c = objArr;
        this.o = i;
        this.X = i2;
    }

    @Override // defpackage.qw6
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        z04.k(i, this.X);
        Object obj = this.c[(i * 2) + this.o];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.X;
    }
}
