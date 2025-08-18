package defpackage;

/* loaded from: classes2.dex */
public final class m72 extends pi0 {
    public final long b;

    public m72(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m72) && this.b == ((m72) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    @Override // defpackage.pi0
    public final String toString() {
        return zr6.k(new StringBuilder("ChatClearEvent(chatId="), this.b, ")");
    }
}
