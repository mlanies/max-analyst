package defpackage;

/* loaded from: classes.dex */
public final class q8c extends tfg {
    public final CharSequence h;

    public q8c(CharSequence charSequence) {
        this.h = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8c) && tpa.f(this.h, ((q8c) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "Abbreviation(abbreviation=" + ((Object) this.h) + ")";
    }
}
