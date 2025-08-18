package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class rce implements ol7 {
    public final String X;
    public final List Y;
    public final int Z;
    public final long a;
    public final CharSequence b;
    public final String c;
    public final CharSequence o;

    public rce(long j, CharSequence charSequence, String str, CharSequence charSequence2, String str2, List list, int i) {
        this.a = j;
        this.b = charSequence;
        this.c = str;
        this.o = charSequence2;
        this.X = str2;
        this.Y = list;
        this.Z = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rce)) {
            return false;
        }
        rce rceVar = (rce) obj;
        return this.a == rceVar.a && tpa.f(this.b, rceVar.b) && tpa.f(this.c, rceVar.c) && tpa.f(this.o, rceVar.o) && tpa.f(this.X, rceVar.X) && tpa.f(this.Y, rceVar.Y) && this.Z == rceVar.Z;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return au1.s(this.Z) + k7d.g(this.Y, rh4.d(rh4.f(this.o, rh4.d(rh4.f(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31), 31, this.X), 31);
    }

    public final CharSequence k() {
        int i = this.Z;
        CharSequence charSequence = this.b;
        if (i == 3) {
            return charSequence;
        }
        CharSequence charSequence2 = this.o;
        return charSequence2.length() == 0 ? charSequence : charSequence2;
    }

    @Override // defpackage.ol7
    public final int l() {
        return 1;
    }

    public final String toString() {
        return "SuggestionsState(id=" + this.a + ", name=" + ((Object) this.b) + ", avatar=" + this.c + ", shortName=" + ((Object) this.o) + ", query=" + this.X + ", contextActions=" + this.Y + ", type=" + k7d.t(this.Z) + ")";
    }
}
