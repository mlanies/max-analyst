package defpackage;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class ra0 implements su6 {
    public final nje a;
    public final long b;
    public final int c;
    public final Matrix d;

    public ra0(nje njeVar, long j, int i, Matrix matrix) {
        if (njeVar == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.a = njeVar;
        this.b = j;
        this.c = i;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.d = matrix;
    }

    @Override // defpackage.su6
    public final void b(t55 t55Var) {
        t55Var.d(this.c);
    }

    @Override // defpackage.su6
    public final nje c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra0)) {
            return false;
        }
        ra0 ra0Var = (ra0) obj;
        return this.a.equals(ra0Var.a) && this.b == ra0Var.b && this.c == ra0Var.c && this.d.equals(ra0Var.d);
    }

    @Override // defpackage.su6
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return this.d.hashCode() ^ ((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.a + ", timestamp=" + this.b + ", rotationDegrees=" + this.c + ", sensorToBufferTransformMatrix=" + this.d + "}";
    }
}
