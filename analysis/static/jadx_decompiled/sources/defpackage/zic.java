package defpackage;

/* loaded from: classes.dex */
public final class zic {
    public final CharSequence a;
    public final Long b;
    public final Long c;

    public zic(CharSequence charSequence, Long l, Long l2) {
        this.a = charSequence;
        this.b = l;
        this.c = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zic)) {
            return false;
        }
        zic zicVar = (zic) obj;
        return tpa.f(this.a, zicVar.a) && tpa.f(this.b, zicVar.b) && tpa.f(this.c, zicVar.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "Result(text=" + ((Object) this.a) + ", editMsgId=" + this.b + ", replyMsgId=" + this.c + ")";
    }
}
