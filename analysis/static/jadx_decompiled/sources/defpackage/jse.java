package defpackage;

/* loaded from: classes.dex */
public final class jse {
    public final String a;

    public jse(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jse) && tpa.f(this.a, ((jse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("Close(themeName="), this.a, ")");
    }
}
