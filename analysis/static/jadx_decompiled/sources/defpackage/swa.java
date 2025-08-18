package defpackage;

/* loaded from: classes2.dex */
public final class swa implements twa {
    public final long a;

    public swa(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swa) && this.a == ((swa) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("OpenChat(chatId="), this.a, ")");
    }
}
