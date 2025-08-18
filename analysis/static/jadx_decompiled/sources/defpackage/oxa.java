package defpackage;

/* loaded from: classes.dex */
public final class oxa {
    public final boolean a;

    public oxa(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxa) && this.a == ((oxa) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("OnlineStatus(isOnline="), this.a, ")");
    }
}
