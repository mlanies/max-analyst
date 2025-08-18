package defpackage;

/* loaded from: classes.dex */
public final class xk6 implements al6 {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final String d;

    public xk6(String str, long j, String str2, String str3) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk6)) {
            return false;
        }
        xk6 xk6Var = (xk6) obj;
        return tpa.f(this.a, xk6Var.a) && this.b == xk6Var.b && tpa.f(this.c, xk6Var.c) && tpa.f(this.d, xk6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rh4.f(this.c, h4f.m(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Link(link=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", chatName=");
        sb.append((Object) this.c);
        sb.append(", conversationId=");
        return zr6.l(sb, this.d, ")");
    }
}
