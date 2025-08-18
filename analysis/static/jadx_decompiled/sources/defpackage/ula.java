package defpackage;

/* loaded from: classes2.dex */
public final class ula extends wm9 {
    public final long b;
    public final boolean c;
    public final String d;

    public ula(long j, String str, boolean z) {
        super(e5f.a);
        this.b = j;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ula)) {
            return false;
        }
        ula ulaVar = (ula) obj;
        return this.b == ulaVar.b && this.c == ulaVar.c && tpa.f(this.d, ulaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ms2.d(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenChatCall(chatId=");
        sb.append(this.b);
        sb.append(", isVideo=");
        sb.append(this.c);
        sb.append(", link=");
        return zr6.l(sb, this.d, ")");
    }
}
