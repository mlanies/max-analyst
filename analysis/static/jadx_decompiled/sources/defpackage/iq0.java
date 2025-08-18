package defpackage;

/* loaded from: classes2.dex */
public final class iq0 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public iq0(String str, long j, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq0)) {
            return false;
        }
        iq0 iq0Var = (iq0) obj;
        return this.a == iq0Var.a && tpa.f(this.b, iq0Var.b) && tpa.f(this.c, iq0Var.c) && tpa.f(this.d, iq0Var.d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iD = rh4.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BotItem(botId=");
        sb.append(this.a);
        sb.append(", botTag=");
        sb.append(this.b);
        sb.append(", commandName=");
        sb.append(this.c);
        sb.append(", commandDescription=");
        return zr6.l(sb, this.d, ")");
    }
}
