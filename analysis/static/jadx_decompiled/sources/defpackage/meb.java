package defpackage;

/* loaded from: classes2.dex */
public final class meb {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public meb(String str, long j, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, int i) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = z;
        this.f = z2;
        this.g = i;
    }

    public static meb a(meb mebVar, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = mebVar.a;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = mebVar.e;
        }
        return new meb(str2, mebVar.b, mebVar.c, mebVar.d, z, mebVar.f, mebVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof meb)) {
            return false;
        }
        meb mebVar = (meb) obj;
        return tpa.f(this.a, mebVar.a) && this.b == mebVar.b && tpa.f(this.c, mebVar.c) && tpa.f(this.d, mebVar.d) && this.e == mebVar.e && this.f == mebVar.f && this.g == mebVar.g;
    }

    public final int hashCode() {
        String str = this.a;
        int iM = h4f.m((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int iHashCode = (iM + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        return au1.s(this.g) + ms2.d(ms2.d((iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileEditAppBarState(avatarUrl=");
        sb.append(this.a);
        sb.append(", avatarSourceId=");
        sb.append(this.b);
        sb.append(", firstName=");
        sb.append((Object) this.c);
        sb.append(", abbreviation=");
        sb.append((Object) this.d);
        sb.append(", showAcceptChanges=");
        sb.append(this.e);
        sb.append(", showAddPhoto=");
        sb.append(this.f);
        sb.append(", confirmType=");
        int i = this.g;
        sb.append(i != 1 ? i != 2 ? "null" : "TOOLBAR_ACTION" : "BUTTON");
        sb.append(")");
        return sb.toString();
    }
}
