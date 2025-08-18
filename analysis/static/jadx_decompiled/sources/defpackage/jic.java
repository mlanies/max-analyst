package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class jic {
    public final int a;
    public final int b;
    public final float c;
    public final float d;

    public jic(int i, float f, int i2) {
        this(f, i, i2, 8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jic) {
            jic jicVar = (jic) obj;
            if (this.a == jicVar.a && this.b == jicVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final String toString() {
        return String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)}, 2));
    }

    public jic(float f, int i, int i2, int i3) {
        f = (i3 & 4) != 0 ? 2048.0f : f;
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = 0.6666667f;
        if (i <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i2 <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
