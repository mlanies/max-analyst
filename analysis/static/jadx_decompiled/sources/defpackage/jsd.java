package defpackage;

/* loaded from: classes.dex */
public final class jsd extends jx6 {
    public final transient Object o;

    public jsd(Object obj) {
        obj.getClass();
        this.o = obj;
    }

    @Override // defpackage.jx6, defpackage.qw6
    public final zw6 a() {
        return zw6.n(this.o);
    }

    @Override // defpackage.qw6
    public final int b(int i, Object[] objArr) {
        objArr[i] = this.o;
        return i + 1;
    }

    @Override // defpackage.qw6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.o.equals(obj);
    }

    @Override // defpackage.qw6
    public final boolean f() {
        return false;
    }

    @Override // defpackage.qw6
    /* renamed from: g */
    public final m5f iterator() {
        p77 p77Var = new p77(0);
        p77Var.b = this.o;
        return p77Var;
    }

    @Override // defpackage.jx6, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.o.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.o.toString() + ']';
    }
}
