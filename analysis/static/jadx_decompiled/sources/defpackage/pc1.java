package defpackage;

/* loaded from: classes.dex */
public final class pc1 implements qc1 {
    public final jqe a;

    public pc1(iqe iqeVar) {
        this.a = iqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc1) && tpa.f(this.a, ((pc1) obj).a);
    }

    @Override // defpackage.qc1
    public final jqe getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("Success(text="), this.a, ")");
    }
}
