package defpackage;

/* loaded from: classes.dex */
public final class rya {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final CharSequence e;

    public rya(long j, long j2, CharSequence charSequence, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rya)) {
            return false;
        }
        rya ryaVar = (rya) obj;
        return this.a == ryaVar.a && this.b == ryaVar.b && tpa.f(this.c, ryaVar.c) && tpa.f(this.d, ryaVar.d) && tpa.f(this.e, ryaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rh4.d(rh4.d(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "PickerChip(id=" + this.a + ", avatarSourceId=" + this.b + ", title=" + this.c + ", avatarUrl=" + this.d + ", abbreviation=" + ((Object) this.e) + ")";
    }
}
