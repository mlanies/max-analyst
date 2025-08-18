package defpackage;

/* loaded from: classes2.dex */
public final class yg9 extends ju0 {
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public yg9(long j, long j2, String str, String str2, String str3, String str4) {
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg9)) {
            return false;
        }
        yg9 yg9Var = (yg9) obj;
        return this.d == yg9Var.d && this.e == yg9Var.e && tpa.f(this.f, yg9Var.f) && tpa.f(this.g, yg9Var.g) && tpa.f(this.h, yg9Var.h) && tpa.f(this.i, yg9Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + rh4.d(rh4.d(rh4.d(h4f.m(Long.hashCode(this.d) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAttach(chatId=");
        sb.append(this.d);
        sb.append(", messageId=");
        sb.append(this.e);
        sb.append(", attachLocalId=");
        sb.append(this.f);
        sb.append(", audioUrl=");
        sb.append(this.g);
        sb.append(", attachTitle=");
        sb.append(this.h);
        sb.append(", attachSubtitle=");
        return zr6.l(sb, this.i, ")");
    }
}
