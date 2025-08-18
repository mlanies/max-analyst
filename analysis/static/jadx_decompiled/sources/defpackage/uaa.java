package defpackage;

/* loaded from: classes2.dex */
public final class uaa {
    public final long a;
    public final xd7 b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final boolean f;
    public final k8g g;

    public /* synthetic */ uaa(long j, xd7 xd7Var, Long l, Long l2, Long l3, boolean z, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : xd7Var, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) == 0 ? l3 : null, (i & 32) != 0 ? false : z, (k8g) null);
    }

    public final k8g a() {
        return this.g;
    }

    public final Long b() {
        return this.e;
    }

    public final String c() {
        xd7 xd7Var = this.b;
        if (xd7Var != null) {
            return xd7Var.a;
        }
        return null;
    }

    public final boolean d() {
        return fm9.G(this.b) && this.d == null && this.c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaa)) {
            return false;
        }
        uaa uaaVar = (uaa) obj;
        if (this.a != uaaVar.a) {
            return false;
        }
        xd7 xd7Var = this.b;
        return ((fm9.G(xd7Var) && fm9.G(uaaVar.b)) || tpa.f(xd7Var, uaaVar.b)) && tpa.f(this.c, uaaVar.c) && tpa.f(this.d, uaaVar.d);
    }

    public final int hashCode() {
        xd7 xd7Var = this.b;
        int iM = h4f.m((xd7Var != null ? xd7Var.hashCode() : 0) * 31, 31, this.a);
        Long l = this.c;
        int iHashCode = (iM + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.d;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "OneMeDraft(cid=" + this.a + ", lastInputText=" + this.b + ", replyMessageId=" + this.c + ", editMessageId=" + this.d + ", serverTime=" + this.e + ", fromServer=" + this.f + ", attaches=" + this.g + ")";
    }

    public uaa(long j, xd7 xd7Var, Long l, Long l2, Long l3, boolean z, k8g k8gVar) {
        this.a = j;
        this.b = xd7Var;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = z;
        this.g = k8gVar;
    }
}
