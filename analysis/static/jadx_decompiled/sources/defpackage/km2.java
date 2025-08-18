package defpackage;

/* loaded from: classes2.dex */
public final class km2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public km2(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2)) {
            return false;
        }
        km2 km2Var = (km2) obj;
        return this.a == km2Var.a && this.b == km2Var.b && this.c == km2Var.c && this.d == km2Var.d && this.e == km2Var.e && this.f == km2Var.f && this.g == km2Var.g && this.h == km2Var.h && this.i == km2Var.i && this.j == km2Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatOptions(signAdmin=");
        sb.append(this.a);
        sb.append(", onlyOwnerCanChangeIconTitle=");
        sb.append(this.b);
        sb.append(", official=");
        sb.append(this.c);
        sb.append(", onlyAdminCanAddMember=");
        sb.append(this.d);
        sb.append(", allCanPinMessage=");
        sb.append(this.e);
        sb.append(", ok=");
        sb.append(this.f);
        sb.append(", onlyAdminCanCall=");
        sb.append(this.g);
        sb.append(", sentByPhone=");
        sb.append(this.h);
        sb.append(", serviceChat=");
        sb.append(this.i);
        sb.append(", membersCanSeePrivateLink=");
        return au1.j(sb, this.j, ")");
    }
}
