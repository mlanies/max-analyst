package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s73 {
    public final r73 a;
    public final int[] b;

    public s73(r73 r73Var, int[] iArr) {
        this.a = r73Var;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s73)) {
            return false;
        }
        s73 s73Var = (s73) obj;
        return tpa.f(this.a, s73Var.a) && tpa.f(this.b, s73Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonBackgroundSkeletonStickerPrimaryColors(baseGradient=" + this.a + ", tongueGradient=" + Arrays.toString(this.b) + ")";
    }
}
