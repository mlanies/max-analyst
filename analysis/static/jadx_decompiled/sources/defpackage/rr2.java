package defpackage;

/* loaded from: classes2.dex */
public final class rr2 extends ka1 {
    public final long b;

    public rr2(long j) {
        super(1);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rr2) && this.b == ((rr2) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("OpenChatAndUpdateBackstack(chatId="), this.b, ")");
    }
}
