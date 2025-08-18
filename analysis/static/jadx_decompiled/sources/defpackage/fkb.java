package defpackage;

/* loaded from: classes2.dex */
public final class fkb extends ka1 {
    public final String b;

    public fkb(String str) {
        super(11);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fkb) && tpa.f(this.b, ((fkb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("CallByNumber(phone="), this.b, ")");
    }
}
