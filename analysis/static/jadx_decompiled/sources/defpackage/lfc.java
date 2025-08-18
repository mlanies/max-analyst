package defpackage;

/* loaded from: classes.dex */
public final class lfc extends jx6 {
    public static final Object[] t0;
    public static final lfc u0;
    public final transient int X;
    public final transient Object[] Y;
    public final transient int Z;
    public final transient Object[] o;
    public final transient int s0;

    static {
        Object[] objArr = new Object[0];
        t0 = objArr;
        u0 = new lfc(0, 0, 0, objArr, objArr);
    }

    public lfc(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.o = objArr;
        this.X = i;
        this.Y = objArr2;
        this.Z = i2;
        this.s0 = i3;
    }

    @Override // defpackage.qw6
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.o;
        int i2 = this.s0;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.qw6
    public final Object[] c() {
        return this.o;
    }

    @Override // defpackage.qw6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.Y;
            if (objArr.length != 0) {
                int iA = xfg.A(obj);
                while (true) {
                    int i = iA & this.Z;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iA = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.qw6
    public final int d() {
        return this.s0;
    }

    @Override // defpackage.qw6
    public final int e() {
        return 0;
    }

    @Override // defpackage.qw6
    public final boolean f() {
        return false;
    }

    @Override // defpackage.qw6
    /* renamed from: g */
    public final m5f iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.jx6, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.X;
    }

    @Override // defpackage.jx6
    public final zw6 k() {
        return zw6.h(this.s0, this.o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.s0;
    }
}
