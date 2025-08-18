package defpackage;

/* loaded from: classes.dex */
public final class wa implements jb {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa)) {
            return false;
        }
        ((wa) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "DisableAllCameraAndMicInCall(isSuccess=true, isEnabled=false)";
    }
}
