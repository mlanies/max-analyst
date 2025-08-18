package defpackage;

/* loaded from: classes2.dex */
public final class c02 {
    public final boolean a;

    public c02(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c02) && this.a == ((c02) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("SetSelection(selected="), this.a, ")");
    }
}
