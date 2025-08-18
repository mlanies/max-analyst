package defpackage;

/* loaded from: classes2.dex */
public final class qr2 extends ka1 {
    public final long b;

    public qr2(long j) {
        super(1);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qr2) && this.b == ((qr2) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("OpenChangeChannelTypeAndUpdateBackstack(chatId="), this.b, ")");
    }
}
