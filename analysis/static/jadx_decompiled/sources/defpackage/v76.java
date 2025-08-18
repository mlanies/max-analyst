package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class v76 extends a86 {
    public final String a;
    public final List b;
    public final r76 c;

    public v76(String str, String str2, List list) {
        r76 r76Var = new r76(str2);
        this.a = str;
        this.b = list;
        this.c = r76Var;
    }

    @Override // defpackage.a86
    public final String[] a(u76 u76Var) {
        return new String[]{this.a};
    }

    @Override // defpackage.a86
    public final String b() {
        return this.a;
    }

    @Override // defpackage.a86
    public final n3 c() {
        return this.c;
    }

    @Override // defpackage.a86
    public final List d() {
        return this.b;
    }

    @Override // defpackage.a86
    public final String e(u76 u76Var) {
        return u76Var.a + " AND " + u76Var.b() + " = ?";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v76)) {
            return false;
        }
        v76 v76Var = (v76) obj;
        return tpa.f(this.a, v76Var.a) && tpa.f(this.b, v76Var.b) && tpa.f(this.c, v76Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + k7d.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Real(id=" + this.a + ", queryParams=" + this.b + ", name=" + this.c + ")";
    }
}
