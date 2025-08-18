package defpackage;

/* loaded from: classes2.dex */
public final class rx8 extends tx8 {
    public final long c;

    public rx8(long j) {
        super(j, 2);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx8) && this.c == ((rx8) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("DialogBotId(botId="), this.c, ")");
    }
}
