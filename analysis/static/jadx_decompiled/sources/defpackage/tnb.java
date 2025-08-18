package defpackage;

/* loaded from: classes.dex */
public final class tnb {
    public final int a;
    public final boolean b;

    public tnb(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tnb.class != obj.getClass()) {
            return false;
        }
        tnb tnbVar = (tnb) obj;
        return this.a == tnbVar.a && this.b == tnbVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
