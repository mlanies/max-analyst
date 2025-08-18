package defpackage;

/* loaded from: classes.dex */
public final class kg0 implements lg0 {
    public final boolean a;

    public kg0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kg0) && this.a == ((kg0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("NotificationsPermissionChange(isGranted="), this.a, ")");
    }
}
