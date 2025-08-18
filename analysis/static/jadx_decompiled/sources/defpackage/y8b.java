package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class y8b implements r6d {
    public final String a;
    public final x8b b;

    public y8b(String str, x8b x8bVar) {
        this.a = str;
        this.b = x8bVar;
    }

    @Override // defpackage.r6d
    public final String a() {
        return this.a;
    }

    @Override // defpackage.r6d
    public final boolean c() {
        return false;
    }

    @Override // defpackage.r6d
    public final int d(String str) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.r6d
    public final pag e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8b)) {
            return false;
        }
        y8b y8bVar = (y8b) obj;
        if (tpa.f(this.a, y8bVar.a)) {
            if (tpa.f(this.b, y8bVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.r6d
    public final int f() {
        return 0;
    }

    @Override // defpackage.r6d
    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.r6d
    public final List getAnnotations() {
        return nz4.a;
    }

    @Override // defpackage.r6d
    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.r6d
    public final r6d i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.r6d
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.r6d
    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return rh4.m(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
