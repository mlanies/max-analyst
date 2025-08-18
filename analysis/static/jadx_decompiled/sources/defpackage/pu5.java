package defpackage;

/* loaded from: classes.dex */
public final class pu5 implements ol7 {
    public final CharSequence X;
    public final boolean Y;
    public final int Z;
    public final long a;
    public final String b;
    public final CharSequence c;
    public final long o;

    public pu5(long j, String str, CharSequence charSequence, long j2, CharSequence charSequence2, boolean z, int i) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
        this.o = j2;
        this.X = charSequence2;
        this.Y = z;
        this.Z = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu5)) {
            return false;
        }
        pu5 pu5Var = (pu5) obj;
        return this.a == pu5Var.a && tpa.f(this.b, pu5Var.b) && tpa.f(this.c, pu5Var.c) && this.o == pu5Var.o && tpa.f(this.X, pu5Var.X) && this.Y == pu5Var.Y && this.Z == pu5Var.Z;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return Integer.hashCode(this.Z) + ms2.d(rh4.f(this.X, h4f.m(rh4.f(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.o), 31), 31, this.Y);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.Z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderMemberItem(itemId=");
        sb.append(this.a);
        sb.append(", avatarUrl=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append((Object) this.c);
        sb.append(", avatarSourceId=");
        sb.append(this.o);
        sb.append(", abbreviation=");
        sb.append((Object) this.X);
        sb.append(", isVerified=");
        sb.append(this.Y);
        sb.append(", viewType=");
        return zr6.j(sb, this.Z, ")");
    }
}
