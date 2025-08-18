package defpackage;

/* loaded from: classes.dex */
public final class baf implements bo1 {
    public final long a;
    public final String b;
    public final CharSequence c;
    public final boolean d;
    public final String e;

    public baf(long j, String str, CharSequence charSequence, boolean z, String str2) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
        this.d = z;
        this.e = str2;
    }

    @Override // defpackage.bo1
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.bo1
    public final long d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baf)) {
            return false;
        }
        baf bafVar = (baf) obj;
        return this.a == bafVar.a && tpa.f(this.b, bafVar.b) && tpa.f(this.c, bafVar.c) && this.d == bafVar.d && tpa.f(this.e, bafVar.e);
    }

    @Override // defpackage.bo1
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        int iD = ms2.d(rh4.f(this.c, rh4.d(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // defpackage.bo1
    public final CharSequence j() {
        return this.c;
    }

    @Override // defpackage.bo1
    public final String q() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserInfo(serverId=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", abbreviation=");
        sb.append((Object) this.c);
        sb.append(", isUnknown=");
        sb.append(this.d);
        sb.append(", avatar=");
        return zr6.l(sb, this.e, ")");
    }
}
