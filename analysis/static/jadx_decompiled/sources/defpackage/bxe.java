package defpackage;

/* loaded from: classes.dex */
public final class bxe extends s36 {
    public final CharSequence h;

    public bxe(CharSequence charSequence) {
        this.h = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxe) && tpa.f(this.h, ((bxe) obj).h);
    }

    public final int hashCode() {
        CharSequence charSequence = this.h;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    @Override // defpackage.s36
    public final CharSequence q() {
        return this.h;
    }

    public final String toString() {
        return "Connected(text=" + ((Object) this.h) + ")";
    }
}
