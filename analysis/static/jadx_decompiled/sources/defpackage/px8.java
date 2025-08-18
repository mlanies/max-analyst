package defpackage;

/* loaded from: classes2.dex */
public final class px8 extends tx8 {
    public final long c;

    public px8(long j) {
        super(j, 4);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof px8) && this.c == ((px8) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("ChannelId(channelId="), this.c, ")");
    }
}
