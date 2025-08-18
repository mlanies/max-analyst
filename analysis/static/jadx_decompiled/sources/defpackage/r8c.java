package defpackage;

/* loaded from: classes.dex */
public final class r8c extends tfg {
    public final String h;

    public r8c(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8c) && tpa.f(this.h, ((r8c) obj).h);
    }

    public final int hashCode() {
        String str = this.h;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("Avatar(avatarUrl="), this.h, ")");
    }
}
