package defpackage;

/* loaded from: classes.dex */
public final class nc1 implements qc1 {
    public final jqe a;

    public nc1(iqe iqeVar) {
        this.a = iqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nc1) && tpa.f(this.a, ((nc1) obj).a);
    }

    @Override // defpackage.qc1
    public final jqe getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("Error(text="), this.a, ")");
    }
}
