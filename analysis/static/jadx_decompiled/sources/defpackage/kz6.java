package defpackage;

/* loaded from: classes2.dex */
public final class kz6 extends pi0 {
    public final mg4 X;
    public final boolean Y;
    public final long Z;
    public final long b;
    public final long c;
    public final boolean o;

    public kz6(long j, long j2, boolean z, mg4 mg4Var, boolean z2, long j3) {
        this.b = j;
        this.c = j2;
        this.o = z;
        this.X = mg4Var;
        this.Y = z2;
        this.Z = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz6)) {
            return false;
        }
        kz6 kz6Var = (kz6) obj;
        return this.b == kz6Var.b && this.c == kz6Var.c && this.o == kz6Var.o && this.X == kz6Var.X && this.Y == kz6Var.Y && this.Z == kz6Var.Z;
    }

    public final int hashCode() {
        return Long.hashCode(this.Z) + ms2.d((this.X.hashCode() + ms2.d(h4f.m(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o)) * 31, 31, this.Y);
    }

    @Override // defpackage.pi0
    public final String toString() {
        StringBuilder sb = new StringBuilder("IncomingMessageEvent(chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", isInvisiblePush=");
        sb.append(this.o);
        sb.append(", itemType=");
        sb.append(this.X);
        sb.append(", isControl=");
        sb.append(this.Y);
        sb.append(", sender=");
        return zr6.k(sb, this.Z, ")");
    }
}
