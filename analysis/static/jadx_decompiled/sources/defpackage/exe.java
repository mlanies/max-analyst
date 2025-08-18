package defpackage;

/* loaded from: classes2.dex */
public final class exe {
    public final fxe a;
    public final gxe b;

    public exe(fxe fxeVar, gxe gxeVar) {
        this.a = fxeVar;
        this.b = gxeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exe)) {
            return false;
        }
        exe exeVar = (exe) obj;
        return tpa.f(this.a, exeVar.a) && tpa.f(this.b, exeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopbarBackgroundColors(default=" + this.a + ", disabled=" + this.b + ")";
    }
}
