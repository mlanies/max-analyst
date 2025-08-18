package defpackage;

/* loaded from: classes2.dex */
public final class jz6 {
    public final bg1 a;
    public final String b;
    public final boolean c;

    public jz6(bg1 bg1Var, String str, boolean z) {
        this.a = bg1Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz6)) {
            return false;
        }
        jz6 jz6Var = (jz6) obj;
        return tpa.f(this.a, jz6Var.a) && tpa.f(this.b, jz6Var.b) && this.c == jz6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rh4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InboundMessage(senderId=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", isDirect=");
        return au1.j(sb, this.c, ")");
    }
}
