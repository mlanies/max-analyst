package defpackage;

/* loaded from: classes.dex */
public final class qg6 {
    public int a;
    public int b;
    public float c;
    public int d;
    public boolean e;
    public int f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg6)) {
            return false;
        }
        qg6 qg6Var = (qg6) obj;
        return this.a == qg6Var.a && this.b == qg6Var.b && Float.compare(this.c, qg6Var.c) == 0 && this.d == qg6Var.d && this.e == qg6Var.e && this.f == qg6Var.f;
    }

    public final int hashCode() {
        return au1.s(this.f) + ms2.d(k7d.e(this.d, ms2.c(k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), 31), 31, this.e);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        float f = this.c;
        int i3 = this.d;
        boolean z = this.e;
        int i4 = this.f;
        StringBuilder sbJ = wg0.j("PageState(pagesNumber=", i, ", selectedPageIndex=", i2, ", pageOffsetFraction=");
        sbJ.append(f);
        sbJ.append(", selectedBigDotIndex=");
        sbJ.append(i3);
        sbJ.append(", wasShiftedFromZeroToZero=");
        sbJ.append(z);
        sbJ.append(", dotsAnimationType=");
        sbJ.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "ALL_DOTS_TO_RIGHT" : "ALL_DOTS_TO_LEFT" : "BIG_DOTS_CHANGE" : "NONE");
        sbJ.append(")");
        return sbJ.toString();
    }
}
