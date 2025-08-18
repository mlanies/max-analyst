package defpackage;

/* loaded from: classes2.dex */
public final class hs9 extends gle {
    public final fs8 X;
    public final boolean Y;
    public final long Z;
    public final long c;
    public final f52 o;
    public final boolean s0;

    public hs9(long j, f52 f52Var, fs8 fs8Var, boolean z, long j2, boolean z2) {
        this.c = j;
        this.o = f52Var;
        this.X = fs8Var;
        this.Y = z;
        this.Z = j2;
        this.s0 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs9)) {
            return false;
        }
        hs9 hs9Var = (hs9) obj;
        return this.c == hs9Var.c && tpa.f(this.o, hs9Var.o) && tpa.f(this.X, hs9Var.X) && this.Y == hs9Var.Y && this.Z == hs9Var.Z && this.s0 == hs9Var.s0;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.c) * 31;
        f52 f52Var = this.o;
        return Boolean.hashCode(this.s0) + h4f.m(ms2.d((this.X.hashCode() + ((iHashCode + (f52Var == null ? 0 : f52Var.hashCode())) * 31)) * 31, 31, this.Y), 31, this.Z);
    }

    @Override // defpackage.zje
    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(chatId=");
        sb.append(this.c);
        sb.append(", chat=");
        sb.append(this.o);
        sb.append(", message=");
        sb.append(this.X);
        sb.append(", isInvisible=");
        sb.append(this.Y);
        sb.append(", prevMessageId=");
        sb.append(this.Z);
        sb.append(", ttl=");
        return au1.j(sb, this.s0, ")");
    }
}
