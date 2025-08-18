package defpackage;

/* loaded from: classes.dex */
public final class t8c extends tfg {
    public final boolean h;

    public t8c(boolean z) {
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8c) && this.h == ((t8c) obj).h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h);
    }

    public final String toString() {
        return au1.j(new StringBuilder("Online(online="), this.h, ")");
    }
}
