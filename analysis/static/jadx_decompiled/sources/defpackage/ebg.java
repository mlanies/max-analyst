package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ebg {
    public int b = 0;
    public final boolean[] a = new boolean[pf0.values().length];

    public final boolean a(pf0 pf0Var, boolean z) {
        int iOrdinal = pf0Var.ordinal();
        boolean[] zArr = this.a;
        boolean z2 = zArr[iOrdinal];
        zArr[pf0Var.ordinal()] = z;
        if (z2 == z) {
            return false;
        }
        this.b += z ? 1 : -1;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ebg.class != obj.getClass()) {
            return false;
        }
        ebg ebgVar = (ebg) obj;
        return this.b == ebgVar.b && Arrays.equals(this.a, ebgVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
