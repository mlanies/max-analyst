package defpackage;

/* loaded from: classes.dex */
public final class ifc extends jx6 {
    public final transient zw6 X;
    public final transient cx6 o;

    public ifc(cx6 cx6Var, jfc jfcVar) {
        this.o = cx6Var;
        this.X = jfcVar;
    }

    @Override // defpackage.jx6, defpackage.qw6
    public final zw6 a() {
        return this.X;
    }

    @Override // defpackage.qw6
    public final int b(int i, Object[] objArr) {
        return this.X.b(i, objArr);
    }

    @Override // defpackage.qw6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.o.get(obj) != null;
    }

    @Override // defpackage.qw6
    public final boolean f() {
        return true;
    }

    @Override // defpackage.qw6
    /* renamed from: g */
    public final m5f iterator() {
        return this.X.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.o.size();
    }
}
