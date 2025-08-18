package defpackage;

/* loaded from: classes2.dex */
public final class q86 implements r86 {
    public final float a;

    public q86(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q86) && Float.compare(this.a, ((q86) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "UpdateCameraTranslation(translationY=" + this.a + ")";
    }
}
