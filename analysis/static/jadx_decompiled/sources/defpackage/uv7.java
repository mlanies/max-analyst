package defpackage;

/* loaded from: classes.dex */
public final class uv7 extends sv7 {
    static {
        new uv7(1L, 0L);
    }

    public uv7(long j, long j2) {
        super(j, j2);
    }

    public final boolean a(long j) {
        return this.a <= j && j <= this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uv7) {
            if (!isEmpty() || !((uv7) obj).isEmpty()) {
                uv7 uv7Var = (uv7) obj;
                if (this.a == uv7Var.a) {
                    if (this.b == uv7Var.b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.a;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.b;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    public final boolean isEmpty() {
        return this.a > this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
