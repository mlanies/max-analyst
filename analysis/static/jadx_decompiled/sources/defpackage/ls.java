package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ls implements r6d {
    public final r6d a;
    public final int b = 1;

    public ls(r6d r6dVar) {
        this.a = r6dVar;
    }

    @Override // defpackage.r6d
    public final String a() {
        return "kotlin.collections.ArrayList";
    }

    @Override // defpackage.r6d
    public final boolean c() {
        return false;
    }

    @Override // defpackage.r6d
    public final int d(String str) {
        Integer numE0 = dae.e0(str);
        if (numE0 != null) {
            return numE0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // defpackage.r6d
    public final pag e() {
        return nae.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls)) {
            return false;
        }
        ls lsVar = (ls) obj;
        return tpa.f(this.a, lsVar.a) && tpa.f(a(), lsVar.a());
    }

    @Override // defpackage.r6d
    public final int f() {
        return this.b;
    }

    @Override // defpackage.r6d
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.r6d
    public final List getAnnotations() {
        return nz4.a;
    }

    @Override // defpackage.r6d
    public final List h(int i) {
        if (i >= 0) {
            return nz4.a;
        }
        StringBuilder sbN = rh4.n(i, "Illegal index ", ", ");
        sbN.append(a());
        sbN.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbN.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.r6d
    public final r6d i(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder sbN = rh4.n(i, "Illegal index ", ", ");
        sbN.append(a());
        sbN.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbN.toString().toString());
    }

    @Override // defpackage.r6d
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.r6d
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbN = rh4.n(i, "Illegal index ", ", ");
        sbN.append(a());
        sbN.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbN.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
