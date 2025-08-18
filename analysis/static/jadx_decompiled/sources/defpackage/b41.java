package defpackage;

/* loaded from: classes2.dex */
public final class b41 extends pi0 {
    public final String X;
    public final long b;
    public final String c;
    public final long o;

    public b41(String str, String str2, long j, long j2) {
        this.b = j;
        this.c = str;
        this.o = j2;
        this.X = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b41)) {
            return false;
        }
        b41 b41Var = (b41) obj;
        return this.b == b41Var.b && tpa.f(this.c, b41Var.c) && this.o == b41Var.o && tpa.f(this.X, b41Var.X);
    }

    public final int hashCode() {
        return this.X.hashCode() + h4f.m(rh4.d(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o);
    }

    @Override // defpackage.pi0
    public final String toString() {
        StringBuilder sb = new StringBuilder("CallCreateJoinLinkEvent(requestId=");
        sb.append(this.b);
        sb.append(", conversationId=");
        sb.append(this.c);
        sb.append(", peerId=");
        sb.append(this.o);
        sb.append(", joinLink=");
        return zr6.l(sb, this.X, ")");
    }
}
