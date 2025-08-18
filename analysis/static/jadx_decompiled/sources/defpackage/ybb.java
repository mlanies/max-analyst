package defpackage;

/* loaded from: classes2.dex */
public final class ybb implements acb {
    public final int a;

    public ybb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ybb) && this.a == ((ybb) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("ShowPhoto(index="), this.a, ")");
    }
}
