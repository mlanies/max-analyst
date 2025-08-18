package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class v73 {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public v73(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v73)) {
            return false;
        }
        v73 v73Var = (v73) obj;
        return tpa.f(this.a, v73Var.a) && this.b == v73Var.b && this.c == v73Var.c && this.d == v73Var.d && this.e == v73Var.e && this.f == v73Var.f && this.g == v73Var.g && this.h == v73Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + k7d.e(this.g, k7d.e(452984831, k7d.e(872415231, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Arrays.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = au1.m("CommonBackgroundSystemBubbleGradientColors(gradient=", Arrays.toString(this.a), ", qRBackground=");
        sbM.append(this.b);
        sbM.append(", qRStep1=");
        sbM.append(this.c);
        sbM.append(", qRStep2=");
        sbM.append(this.d);
        sbM.append(", qRStep3=");
        sbM.append(this.e);
        sbM.append(", qRStep4=");
        sbM.append(this.f);
        sbM.append(", strokeFadeStep1=872415231, strokeFadeStep2=452984831, strokeStep1=");
        sbM.append(this.g);
        sbM.append(", strokeStep2=");
        return zr6.j(sbM, this.h, ")");
    }
}
