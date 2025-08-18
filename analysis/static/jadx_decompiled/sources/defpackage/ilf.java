package defpackage;

/* loaded from: classes.dex */
public final class ilf implements su0 {
    public final int a;
    public final int b;
    public final int c;
    public final float o;

    public ilf(float f, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.o = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilf)) {
            return false;
        }
        ilf ilfVar = (ilf) obj;
        return this.a == ilfVar.a && this.b == ilfVar.b && this.c == ilfVar.c && this.o == ilfVar.o;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.o) + ((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31);
    }
}
