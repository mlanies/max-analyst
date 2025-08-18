package defpackage;

/* loaded from: classes2.dex */
public final class zab implements bbb {
    public final int a;

    public zab(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zab) && this.a == ((zab) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("SetMainPhoto(index="), this.a, ")");
    }
}
