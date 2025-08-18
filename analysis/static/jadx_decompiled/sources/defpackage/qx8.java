package defpackage;

/* loaded from: classes2.dex */
public final class qx8 extends tx8 {
    public final long c;

    public qx8(long j) {
        super(j, 3);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qx8) && this.c == ((qx8) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("ChatId(chatId="), this.c, ")");
    }
}
