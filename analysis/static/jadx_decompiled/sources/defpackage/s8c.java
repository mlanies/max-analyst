package defpackage;

/* loaded from: classes.dex */
public final class s8c extends tfg {
    public final CharSequence h;

    public s8c(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8c) && tpa.f(this.h, ((s8c) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "Name(name=" + ((Object) this.h) + ")";
    }
}
