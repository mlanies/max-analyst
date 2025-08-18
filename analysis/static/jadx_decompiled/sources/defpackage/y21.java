package defpackage;

/* loaded from: classes.dex */
public final class y21 {
    public static final y21 h = new y21(null, null, null, null, 124);
    public final Long a;
    public final Long b;
    public final CharSequence c;
    public final String d;
    public final Long e;
    public final CharSequence f;
    public final boolean g;

    public y21(Long l, Long l2, CharSequence charSequence, String str, Long l3, CharSequence charSequence2, boolean z) {
        this.a = l;
        this.b = l2;
        this.c = charSequence;
        this.d = str;
        this.e = l3;
        this.f = charSequence2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y21)) {
            return false;
        }
        y21 y21Var = (y21) obj;
        return tpa.f(this.a, y21Var.a) && tpa.f(this.b, y21Var.b) && tpa.f(this.c, y21Var.c) && tpa.f(this.d, y21Var.d) && tpa.f(this.e, y21Var.e) && tpa.f(this.f, y21Var.f) && this.g == y21Var.g;
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        CharSequence charSequence2 = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode5 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallChatInfo(chatId=");
        sb.append(this.a);
        sb.append(", serverId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append((Object) this.c);
        sb.append(", avatar=");
        sb.append(this.d);
        sb.append(", avatarColorId=");
        sb.append(this.e);
        sb.append(", avatarAbbreviation=");
        sb.append((Object) this.f);
        sb.append(", isLinkCall=");
        return au1.j(sb, this.g, ")");
    }

    public /* synthetic */ y21(Long l, String str, String str2, Long l2, int i) {
        this(null, l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : l2, null, false);
    }
}
