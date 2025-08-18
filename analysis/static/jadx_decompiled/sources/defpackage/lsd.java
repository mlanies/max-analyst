package defpackage;

/* loaded from: classes.dex */
public final class lsd {
    public static final lsd c = new lsd(-1, -1);
    public final int a;
    public final int b;

    static {
        new lsd(0, 0);
    }

    public lsd(int i, int i2) {
        fm9.f((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsd)) {
            return false;
        }
        lsd lsdVar = (lsd) obj;
        return this.a == lsdVar.a && this.b == lsdVar.b;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
