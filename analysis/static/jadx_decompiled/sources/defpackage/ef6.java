package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ef6 {
    public final int[] a;
    public final int[] b;

    public ef6(int[] iArr, int[] iArr2) {
        this.a = iArr;
        this.b = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef6)) {
            return false;
        }
        ef6 ef6Var = (ef6) obj;
        return tpa.f(this.a, ef6Var.a) && tpa.f(this.b, ef6Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return k7d.j("GradientsEmptyBlockIconWrapperColors(shapeGradient=", Arrays.toString(this.a), ", strokeGradient=", Arrays.toString(this.b), ")");
    }
}
