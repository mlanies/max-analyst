package defpackage;

/* loaded from: classes.dex */
public final class kgc {
    public static final kgc b = new kgc(false);
    public final boolean a;

    public kgc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kgc.class == obj.getClass() && this.a == ((kgc) obj).a;
    }

    public final int hashCode() {
        return !this.a ? 1 : 0;
    }
}
