package defpackage;

/* loaded from: classes2.dex */
public final class qdb extends wm9 {
    public final long b;

    public qdb(long j) {
        super(e5f.a);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qdb) && this.b == ((qdb) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("BackToChat(chatId="), this.b, ")");
    }
}
