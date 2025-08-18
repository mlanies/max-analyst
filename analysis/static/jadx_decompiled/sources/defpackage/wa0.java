package defpackage;

/* loaded from: classes.dex */
public final class wa0 {
    public final eh7 a;
    public final x90 b;

    public wa0(eh7 eh7Var, x90 x90Var) {
        if (eh7Var == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.a = eh7Var;
        if (x90Var == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.b = x90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        return this.a.equals(wa0Var.a) && this.b.equals(wa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.a + ", cameraId=" + this.b + "}";
    }
}
