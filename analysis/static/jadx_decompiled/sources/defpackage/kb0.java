package defpackage;

/* loaded from: classes.dex */
public final class kb0 {
    public final Integer a;

    public kb0(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kb0)) {
            return false;
        }
        kb0 kb0Var = (kb0) obj;
        Integer num = this.a;
        return num == null ? kb0Var.a == null : num.equals(kb0Var.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
