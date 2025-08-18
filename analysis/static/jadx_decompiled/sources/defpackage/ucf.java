package defpackage;

/* loaded from: classes2.dex */
public final class ucf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ucf(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucf)) {
            return false;
        }
        ucf ucfVar = (ucf) obj;
        return this.a == ucfVar.a && this.b == ucfVar.b && this.c == ucfVar.c && this.d == ucfVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VfxEmptyBlockHaloColors(bubble1=");
        sb.append(this.a);
        sb.append(", bubble2=");
        sb.append(this.b);
        sb.append(", bubble3=");
        sb.append(this.c);
        sb.append(", bubble4=");
        return zr6.j(sb, this.d, ")");
    }
}
