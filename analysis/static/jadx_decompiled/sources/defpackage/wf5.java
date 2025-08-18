package defpackage;

/* loaded from: classes2.dex */
public final class wf5 implements yf5 {
    public final float a;

    public wf5(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wf5) && Float.compare(this.a, ((wf5) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Downloading(progress=" + this.a + ")";
    }
}
