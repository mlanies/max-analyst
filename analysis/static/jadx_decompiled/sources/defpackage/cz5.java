package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class cz5 {
    public final Set a;
    public final Long b;
    public final boolean c;
    public final CharSequence d;
    public final boolean e;

    public cz5(Set set, Long l, boolean z, CharSequence charSequence, boolean z2) {
        this.a = set;
        this.b = l;
        this.c = z;
        this.d = charSequence;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz5)) {
            return false;
        }
        cz5 cz5Var = (cz5) obj;
        return tpa.f(this.a, cz5Var.a) && tpa.f(this.b, cz5Var.b) && this.c == cz5Var.c && tpa.f(this.d, cz5Var.d) && this.e == cz5Var.e;
    }

    public final int hashCode() {
        Set set = this.a;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        Long l = this.b;
        int iD = ms2.d((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        return Boolean.hashCode(this.e) + ((iD + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForwardMessagesSendData(messageIds=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", isForwardAttach=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append((Object) this.d);
        sb.append(", shouldHideAuthor=");
        return au1.j(sb, this.e, ")");
    }
}
