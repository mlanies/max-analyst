package defpackage;

/* loaded from: classes2.dex */
public final class es9 extends gle {
    public final long X;
    public final int Y;
    public final long c;
    public final long o;

    public es9(int i, long j, long j2, long j3) {
        this.c = j;
        this.o = j2;
        this.X = j3;
        this.Y = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es9)) {
            return false;
        }
        es9 es9Var = (es9) obj;
        return this.c == es9Var.c && this.o == es9Var.o && this.X == es9Var.X && this.Y == es9Var.Y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.Y) + h4f.m(h4f.m(Long.hashCode(this.c) * 31, 31, this.o), 31, this.X);
    }

    @Override // defpackage.zje
    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(chatId=");
        sb.append(this.c);
        sb.append(", userId=");
        sb.append(this.o);
        sb.append(", mark=");
        sb.append(this.X);
        sb.append(", unread=");
        return zr6.j(sb, this.Y, ")");
    }
}
