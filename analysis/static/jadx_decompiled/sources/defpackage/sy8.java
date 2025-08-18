package defpackage;

/* loaded from: classes2.dex */
public final class sy8 extends vy8 {
    public final boolean a;
    public final int b;

    public sy8(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy8)) {
            return false;
        }
        sy8 sy8Var = (sy8) obj;
        return this.a == sy8Var.a && this.b == sy8Var.b;
    }

    public final int hashCode() {
        return au1.s(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpandEmoji(expand=");
        sb.append(this.a);
        sb.append(", collapseType=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "BY_MEDIA_KEYBOARD" : "BY_EMOJI_STATE" : "BY_FOCUS" : "BY_DEFAULT");
        sb.append(")");
        return sb.toString();
    }
}
