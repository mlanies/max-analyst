package defpackage;

/* loaded from: classes2.dex */
public final class bhe {
    public final ta3 a;

    public bhe(ua3 ua3Var) {
        this.a = ua3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhe) && tpa.f(this.a, ((bhe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncFlushSignal(completableDeferred=" + this.a + ")";
    }
}
