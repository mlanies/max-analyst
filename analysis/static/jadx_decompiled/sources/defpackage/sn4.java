package defpackage;

/* loaded from: classes2.dex */
public final class sn4 implements un4 {
    public final float a;
    public final long b;
    public final long c;

    public sn4(float f, long j, long j2) {
        this.a = f;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn4)) {
            return false;
        }
        sn4 sn4Var = (sn4) obj;
        return Float.compare(this.a, sn4Var.a) == 0 && this.b == sn4Var.b && this.c == sn4Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + h4f.m(Float.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Loading(progress=" + this.a + ", time=" + this.b + ", chatId=" + this.c + ")";
    }
}
