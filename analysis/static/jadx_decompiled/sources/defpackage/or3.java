package defpackage;

/* loaded from: classes.dex */
public final class or3 {
    public final Integer a;

    public or3(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof or3) && tpa.f(this.a, ((or3) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ButtonTitle(buttonTitleRes=" + this.a + ")";
    }
}
