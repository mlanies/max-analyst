package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class dbf {
    public final int[] a;
    public final float b;

    public dbf(int[] iArr, float f) {
        this.a = iArr;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbf)) {
            return false;
        }
        dbf dbfVar = (dbf) obj;
        return tpa.f(this.a, dbfVar.a) && Float.compare(this.b, dbfVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Gradient(colors=" + Arrays.toString(this.a) + ", angle=" + this.b + ")";
    }
}
