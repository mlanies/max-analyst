package defpackage;

/* loaded from: classes2.dex */
public final class ue0 {
    public final int a;

    public ue0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ue0) {
            return this.a == ((ue0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(-592138) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("BackgroundLocalChipsColors(active="), this.a, ", default=-592138)");
    }
}
