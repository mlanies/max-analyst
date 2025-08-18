package defpackage;

/* loaded from: classes.dex */
public final class qe1 extends ue1 {
    public final Integer a;

    public qe1(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qe1) && tpa.f(this.a, ((qe1) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Description(description=" + this.a + ")";
    }
}
