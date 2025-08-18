package defpackage;

/* loaded from: classes2.dex */
public final class w73 implements y73 {
    public final long a;

    public w73(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w73) && this.a == ((w73) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("Add(chatId="), this.a, ")");
    }
}
