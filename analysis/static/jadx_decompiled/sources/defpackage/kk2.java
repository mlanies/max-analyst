package defpackage;

/* loaded from: classes2.dex */
public final class kk2 {
    public final int a;
    public final jqe b;
    public final boolean c;

    public kk2(int i, cqe cqeVar, boolean z) {
        this.a = i;
        this.b = cqeVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk2)) {
            return false;
        }
        kk2 kk2Var = (kk2) obj;
        return this.a == kk2Var.a && tpa.f(this.b, kk2Var.b) && this.c == kk2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k7d.f(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMembersInfo(titleRes=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", isAdminWithPermission=");
        return au1.j(sb, this.c, ")");
    }
}
