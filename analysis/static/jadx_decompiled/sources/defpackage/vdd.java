package defpackage;

/* loaded from: classes2.dex */
public final class vdd implements wdd {
    public final vbd a;

    public vdd(vbd vbdVar) {
        this.a = vbdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdd) && tpa.f(this.a, ((vdd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionsInfo(event=" + this.a + ")";
    }
}
