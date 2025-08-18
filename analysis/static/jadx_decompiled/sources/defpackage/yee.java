package defpackage;

/* loaded from: classes2.dex */
public final class yee extends pi0 {
    public final long b;

    public yee(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yee) && this.b == ((yee) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    @Override // defpackage.pi0
    public final String toString() {
        return zr6.k(new StringBuilder("SuspendBotEvent(chatId="), this.b, ")");
    }
}
