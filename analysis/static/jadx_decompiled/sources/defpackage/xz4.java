package defpackage;

/* loaded from: classes2.dex */
public final class xz4 implements a05 {
    public final String a;
    public final CharSequence b;
    public final long c;
    public final yt6 d;
    public final jqe e;
    public final jqe f;

    public xz4(String str, CharSequence charSequence, long j, yt6 yt6Var, jqe jqeVar, jqe jqeVar2) {
        this.a = str;
        this.b = charSequence;
        this.c = j;
        this.d = yt6Var;
        this.e = jqeVar;
        this.f = jqeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz4)) {
            return false;
        }
        xz4 xz4Var = (xz4) obj;
        return tpa.f(this.a, xz4Var.a) && tpa.f(this.b, xz4Var.b) && this.c == xz4Var.c && tpa.f(this.d, xz4Var.d) && tpa.f(this.e, xz4Var.e) && tpa.f(this.f, xz4Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iM = h4f.m((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.c);
        yt6 yt6Var = this.d;
        return this.f.hashCode() + k7d.f((iM + (yt6Var != null ? yt6Var.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return "EmptyBot(avatar=" + this.a + ", avatarPlaceholder=" + ((Object) this.b) + ", avatarPlaceholderId=" + this.c + ", imageAttachConfig=" + this.d + ", title=" + this.e + ", subtitle=" + this.f + ")";
    }
}
