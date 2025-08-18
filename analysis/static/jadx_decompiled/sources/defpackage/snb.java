package defpackage;

/* loaded from: classes.dex */
public final class snb {
    public final int a;
    public final boolean b;

    public snb(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || snb.class != obj.getClass()) {
            return false;
        }
        snb snbVar = (snb) obj;
        return this.a == snbVar.a && this.b == snbVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
