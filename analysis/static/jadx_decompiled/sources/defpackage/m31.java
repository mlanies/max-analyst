package defpackage;

/* loaded from: classes.dex */
public final class m31 {
    public final Long a;
    public final CharSequence b;
    public final md0 c;
    public final od0 d;
    public final boolean e;

    public m31(Long l, CharSequence charSequence, md0 md0Var, od0 od0Var, boolean z) {
        this.a = l;
        this.b = charSequence;
        this.c = md0Var;
        this.d = od0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m31)) {
            return false;
        }
        m31 m31Var = (m31) obj;
        return tpa.f(this.a, m31Var.a) && tpa.f(this.b, m31Var.b) && tpa.f(this.c, m31Var.c) && tpa.f(this.d, m31Var.d) && this.e == m31Var.e;
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        md0 md0Var = this.c;
        int iHashCode3 = (iHashCode2 + (md0Var == null ? 0 : md0Var.hashCode())) * 31;
        od0 od0Var = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (od0Var != null ? od0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallChatState(chatId=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", overlay=");
        sb.append(this.d);
        sb.append(", isLinkCall=");
        return au1.j(sb, this.e, ")");
    }

    public /* synthetic */ m31(Long l, CharSequence charSequence, md0 md0Var, boolean z, int i) {
        this((i & 1) != 0 ? null : l, charSequence, md0Var, (od0) null, z);
    }
}
