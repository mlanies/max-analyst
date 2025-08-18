package defpackage;

/* loaded from: classes2.dex */
public final class px4 {
    public final String a;
    public final ox4 b;
    public final ox4 c;

    public px4(String str, ox4 ox4Var, ox4 ox4Var2) {
        this.a = str;
        this.b = ox4Var;
        this.c = ox4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px4)) {
            return false;
        }
        px4 px4Var = (px4) obj;
        return tpa.f(this.a, px4Var.a) && tpa.f(this.b, px4Var.b) && tpa.f(this.c, px4Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ox4 ox4Var = this.b;
        int iHashCode2 = (iHashCode + (ox4Var == null ? 0 : ox4Var.hashCode())) * 31;
        ox4 ox4Var2 = this.c;
        return iHashCode2 + (ox4Var2 != null ? ox4Var2.hashCode() : 0);
    }

    public final String toString() {
        return "EmojiLottie(emoji=" + this.a + ", emojiAnimation=" + this.b + ", reactionAnimation=" + this.c + ")";
    }
}
