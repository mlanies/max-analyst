package defpackage;

/* loaded from: classes.dex */
public final class cb implements jb {
    public final boolean a;

    public cb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        cbVar.getClass();
        return this.a == cbVar.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return au1.j(new StringBuilder("DisableAllScreenRecordInCall(isSuccess=true, isEnabled="), this.a, ")");
    }
}
