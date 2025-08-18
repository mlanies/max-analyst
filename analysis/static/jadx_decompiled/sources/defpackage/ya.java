package defpackage;

/* loaded from: classes.dex */
public final class ya implements jb {
    public final boolean a;

    public ya(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ya) && this.a == ((ya) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("DisableAllCamerasOnce(isSuccess="), this.a, ")");
    }
}
