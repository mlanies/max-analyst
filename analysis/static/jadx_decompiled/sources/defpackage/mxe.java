package defpackage;

/* loaded from: classes2.dex */
public final class mxe {
    public final nxe a;

    public mxe(nxe nxeVar) {
        this.a = nxeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxe) && tpa.f(this.a, ((mxe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TopbarStrokeSeparatorColors(default=" + this.a + ")";
    }
}
