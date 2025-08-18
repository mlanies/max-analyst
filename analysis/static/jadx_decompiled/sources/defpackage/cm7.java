package defpackage;

/* loaded from: classes.dex */
public final class cm7 extends fm7 {
    public final d24 a;

    public cm7(d24 d24Var) {
        this.a = d24Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cm7.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((cm7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (cm7.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
