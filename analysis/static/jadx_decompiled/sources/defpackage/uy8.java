package defpackage;

/* loaded from: classes2.dex */
public final class uy8 extends vy8 {
    public final int a;

    public uy8(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uy8) && this.a == ((uy8) obj).a;
    }

    public final int hashCode() {
        return au1.s(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToggleEmoji(state=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "KEYBOARD_BY_SYSTEM" : "KEYBOARD" : "EMOJI" : "DEFAULT");
        sb.append(")");
        return sb.toString();
    }
}
