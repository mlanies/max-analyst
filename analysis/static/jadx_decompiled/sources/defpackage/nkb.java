package defpackage;

/* loaded from: classes2.dex */
public final class nkb extends ka1 {
    public final long b;
    public final hdb c;

    public nkb(long j, hdb hdbVar) {
        super(11);
        this.b = j;
        this.c = hdbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkb)) {
            return false;
        }
        nkb nkbVar = (nkb) obj;
        return this.b == nkbVar.b && this.c == nkbVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "OpenChat(chatId=" + this.b + ", type=" + this.c + ")";
    }
}
