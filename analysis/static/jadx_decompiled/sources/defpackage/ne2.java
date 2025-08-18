package defpackage;

/* loaded from: classes.dex */
public final class ne2 {
    public final long a;
    public final long b;
    public final String c;
    public final en4 d;
    public final boolean e;

    public ne2(long j, long j2, String str, en4 en4Var, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = en4Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne2)) {
            return false;
        }
        ne2 ne2Var = (ne2) obj;
        return this.a == ne2Var.a && this.b == ne2Var.b && tpa.f(this.c, ne2Var.c) && this.d == ne2Var.d && this.e == ne2Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + rh4.d(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadData(msgId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", localAttachId=");
        sb.append(this.c);
        sb.append(", cause=");
        sb.append(this.d);
        sb.append(", completed=");
        return au1.j(sb, this.e, ")");
    }
}
