package defpackage;

/* loaded from: classes2.dex */
public final class nna {
    public final int a;
    public final long b;
    public final long c;

    public nna(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutgoingMessageLink{type=");
        sb.append(zr6.q(this.a));
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        return zr6.k(sb, this.c, "}");
    }
}
