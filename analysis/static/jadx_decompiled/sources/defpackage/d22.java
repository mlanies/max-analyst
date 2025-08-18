package defpackage;

/* loaded from: classes2.dex */
public final class d22 extends e22 {
    public final jqe a;

    public d22(eqe eqeVar) {
        this.a = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d22) && tpa.f(this.a, ((d22) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("SomethingWentWrong(text="), this.a, ")");
    }
}
