package defpackage;

/* loaded from: classes2.dex */
public final class ycb {
    public final long a;
    public final CharSequence b;
    public final jqe c;
    public final String d;
    public final long e;
    public final CharSequence f;

    public ycb(long j, CharSequence charSequence, iqe iqeVar, String str, long j2, CharSequence charSequence2) {
        this.a = j;
        this.b = charSequence;
        this.c = iqeVar;
        this.d = str;
        this.e = j2;
        this.f = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycb)) {
            return false;
        }
        ycb ycbVar = (ycb) obj;
        return this.a == ycbVar.a && tpa.f(this.b, ycbVar.b) && tpa.f(this.c, ycbVar.c) && tpa.f(this.d, ycbVar.d) && this.e == ycbVar.e && tpa.f(this.f, ycbVar.f);
    }

    public final int hashCode() {
        int iF = k7d.f(rh4.f(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        return this.f.hashCode() + h4f.m(ms2.d((iF + (str == null ? 0 : str.hashCode())) * 31, 31, false), 31, this.e);
    }

    public final String toString() {
        return "ProfileContactCellItem(id=" + this.a + ", title=" + ((Object) this.b) + ", subtitle=" + this.c + ", avatarUrl=" + this.d + ", isOnline=false, avatarSourceId=" + this.e + ", abbreviation=" + ((Object) this.f) + ")";
    }
}
