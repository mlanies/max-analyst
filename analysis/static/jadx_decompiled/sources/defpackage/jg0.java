package defpackage;

/* loaded from: classes.dex */
public final class jg0 implements lg0 {
    public final boolean a;

    public jg0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jg0) && this.a == ((jg0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("ContactsPermissionChange(isGranted="), this.a, ")");
    }
}
