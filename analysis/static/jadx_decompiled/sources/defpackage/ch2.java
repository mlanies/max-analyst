package defpackage;

/* loaded from: classes2.dex */
public final class ch2 {
    public final tka a;
    public final CharSequence b;

    public ch2(tka tkaVar, String str) {
        this.a = tkaVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch2)) {
            return false;
        }
        ch2 ch2Var = (ch2) obj;
        return tpa.f(this.a, ch2Var.a) && tpa.f(this.b, ch2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatMediaTabsViewState(avatarParams=" + this.a + ", chatName=" + ((Object) this.b) + ")";
    }
}
