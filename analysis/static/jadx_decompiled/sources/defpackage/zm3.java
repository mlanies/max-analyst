package defpackage;

/* loaded from: classes2.dex */
public final class zm3 implements efb {
    public final boolean X;
    public final CharSequence Y;
    public final rdb Z;
    public final long a;
    public final String b;
    public final jqe c;
    public final String o;
    public final int s0;
    public final boolean t0;

    public zm3(long j, String str, jqe jqeVar, String str2, boolean z, CharSequence charSequence, rdb rdbVar, int i, boolean z2, int i2) {
        i = (i2 & 128) != 0 ? 32768 : i;
        z2 = (i2 & 256) != 0 ? false : z2;
        this.a = j;
        this.b = str;
        this.c = jqeVar;
        this.o = str2;
        this.X = z;
        this.Y = charSequence;
        this.Z = rdbVar;
        this.s0 = i;
        this.t0 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm3)) {
            return false;
        }
        zm3 zm3Var = (zm3) obj;
        return this.a == zm3Var.a && tpa.f(this.b, zm3Var.b) && tpa.f(this.c, zm3Var.c) && tpa.f(this.o, zm3Var.o) && this.X == zm3Var.X && tpa.f(this.Y, zm3Var.Y) && this.Z == zm3Var.Z && dy7.o(this.s0, zm3Var.s0) && this.t0 == zm3Var.t0;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return this.a == ol7Var.getItemId();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.t0) + k7d.e(this.s0, (this.Z.hashCode() + rh4.f(this.Y, ms2.d(rh4.d(k7d.f(rh4.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o), 31, this.X), 31)) * 31, 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.s0;
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        String strJ = dy7.J(this.s0);
        StringBuilder sb = new StringBuilder("ContactInfoItem(id=");
        sb.append(this.a);
        sb.append(", fullName=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.o);
        sb.append(", isOnline=");
        sb.append(this.X);
        sb.append(", abbreviation=");
        sb.append((Object) this.Y);
        sb.append(", type=");
        sb.append(this.Z);
        sb.append(", itemViewType=");
        sb.append(strJ);
        sb.append(", newPermissions=");
        return au1.j(sb, this.t0, ")");
    }
}
