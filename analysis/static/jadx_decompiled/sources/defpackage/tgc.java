package defpackage;

/* loaded from: classes2.dex */
public final class tgc {
    public final int a;
    public final int b;
    public final String c;
    public final x10 d;
    public final long e;

    public tgc(int i, int i2, String str, x10 x10Var, long j) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = x10Var;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgc)) {
            return false;
        }
        tgc tgcVar = (tgc) obj;
        return this.a == tgcVar.a && this.b == tgcVar.b && tpa.f(this.c, tgcVar.c) && tpa.f(this.d, tgcVar.d) && this.e == tgcVar.e;
    }

    public final int hashCode() {
        int iD = rh4.d(ey8.g(this.b, au1.s(this.a) * 31, 31), 31, this.c);
        x10 x10Var = this.d;
        return Long.hashCode(this.e) + ((iD + (x10Var == null ? 0 : x10Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyButton(type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNKNOWN" : "LOCATION" : "CONTACT" : "IMAGE" : "MESSAGE");
        sb.append(", intent=");
        int i2 = this.b;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "UNKNOWN" : "NEGATIVE" : "POSITIVE" : "DEFAULT");
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", outgoingMessageId=");
        return zr6.k(sb, this.e, ")");
    }
}
