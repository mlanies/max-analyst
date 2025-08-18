package defpackage;

/* loaded from: classes.dex */
public final class a54 extends fp3 {
    public final boolean e;

    public a54(boolean z) {
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a54) && this.e == ((a54) obj).e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e);
    }

    public final String toString() {
        return au1.j(new StringBuilder("Switch(isToggled="), this.e, ")");
    }
}
