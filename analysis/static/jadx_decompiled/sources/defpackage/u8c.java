package defpackage;

/* loaded from: classes.dex */
public final class u8c extends tfg {
    public final boolean h;

    public u8c(boolean z) {
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8c) && this.h == ((u8c) obj).h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h);
    }

    public final String toString() {
        return au1.j(new StringBuilder("Verified(verified="), this.h, ")");
    }
}
