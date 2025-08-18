package defpackage;

/* loaded from: classes2.dex */
public final class ty8 extends vy8 {
    public final iv8 a;

    public ty8(iv8 iv8Var) {
        this.a = iv8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty8) && this.a == ((ty8) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NewInputState(expandableState=" + this.a + ")";
    }
}
