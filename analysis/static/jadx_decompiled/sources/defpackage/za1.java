package defpackage;

/* loaded from: classes.dex */
public final class za1 extends gb1 {
    public final md0 a;

    public za1(md0 md0Var) {
        this.a = md0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za1) && tpa.f(this.a, ((za1) obj).a);
    }

    public final int hashCode() {
        md0 md0Var = this.a;
        if (md0Var == null) {
            return 0;
        }
        return md0Var.hashCode();
    }

    public final String toString() {
        return "Avatar(avatarInfo=" + this.a + ")";
    }
}
