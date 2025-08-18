package defpackage;

/* loaded from: classes.dex */
public final class e51 implements t51 {
    public final vz2 a;

    public e51(vz2 vz2Var) {
        this.a = vz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e51) && tpa.f(this.a, ((e51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChatsUpdate(info=" + this.a + ")";
    }
}
