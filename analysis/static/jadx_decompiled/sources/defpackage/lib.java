package defpackage;

/* loaded from: classes2.dex */
public final class lib extends cjb {
    public final int a;
    public final c7a b;
    public final b7a c;
    public final z6a o;

    public lib(int i, z6a z6aVar, int i2) {
        c7a c7aVar = c7a.c;
        b7a b7aVar = b7a.a;
        z6aVar = (i2 & 8) != 0 ? z6a.o : z6aVar;
        this.a = i;
        this.b = c7aVar;
        this.c = b7aVar;
        this.o = z6aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lib)) {
            return false;
        }
        lib libVar = (lib) obj;
        return this.a == libVar.a && this.b == libVar.b && this.c == libVar.c && this.o == libVar.o;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 2;
    }

    public final int hashCode() {
        return this.o.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    @Override // defpackage.ol7
    public final int l() {
        return 2;
    }

    public final String toString() {
        return "MainButtonAction(title=" + this.a + ", size=" + this.b + ", mode=" + this.c + ", appearance=" + this.o + ")";
    }
}
