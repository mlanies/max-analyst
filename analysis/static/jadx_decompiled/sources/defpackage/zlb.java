package defpackage;

/* loaded from: classes2.dex */
public final class zlb extends amb {
    public final Integer a;
    public final jqe b;

    public zlb(jqe jqeVar, Integer num) {
        this.a = num;
        this.b = jqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlb)) {
            return false;
        }
        zlb zlbVar = (zlb) obj;
        return tpa.f(this.a, zlbVar.a) && tpa.f(this.b, zlbVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "ShowSuccessSnackbar(iconRes=" + this.a + ", textSource=" + this.b + ")";
    }
}
