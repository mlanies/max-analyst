package defpackage;

/* loaded from: classes2.dex */
public final class pr2 extends ka1 {
    public final long b;

    public pr2(long j) {
        super(1);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr2) && this.b == ((pr2) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("OpenAddSubscribersAndUpdateBackstack(chatId="), this.b, ")");
    }
}
