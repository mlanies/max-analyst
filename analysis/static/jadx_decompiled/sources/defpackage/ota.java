package defpackage;

/* loaded from: classes2.dex */
public final class ota {
    public final boolean a;

    public ota(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ota) && this.a == ((ota) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("ContactsPermissionChange(isGranted="), this.a, ")");
    }
}
