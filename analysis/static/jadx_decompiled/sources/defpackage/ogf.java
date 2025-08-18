package defpackage;

import org.webrtc.Size;

/* loaded from: classes2.dex */
public final class ogf {
    public final boolean a;
    public final m56 b;
    public final int c;
    public volatile Integer d;
    public volatile Integer e;
    public nua f;
    public Integer g;
    public Integer h;
    public Integer i;

    public ogf(boolean z, int i, om8 om8Var) {
        this.a = z;
        this.b = om8Var;
        this.c = ote.e(i - (i % 16), 320, 4096);
    }

    public final nua a(int i, int i2) {
        kpa kpaVar;
        float f;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Integer num = this.d;
        Integer num2 = this.e;
        int iIntValue = this.c;
        if (num != null && num2 != null) {
            iIntValue = Math.min(num.intValue(), num2.intValue());
        } else if (num != null) {
            iIntValue = num.intValue();
        } else if (num2 != null) {
            iIntValue = num2.intValue();
        }
        int iMax = Math.max(i, i2);
        if (iMax > iIntValue) {
            f = iIntValue / iMax;
            int iMin = Math.min(i, i2);
            if (iMin > 0) {
                float f2 = iMin;
                int iG = tu0.G(f * f2);
                int i9 = iG % 16;
                if (i9 > 0) {
                    int i10 = (iG - i9) + 16;
                    if (i9 > i10 - iG) {
                        f = i10 / f2;
                    }
                }
            }
            kpaVar = new kpa(Integer.valueOf(tu0.G(i * f)), Integer.valueOf(tu0.G(i2 * f)));
            z = true;
        } else {
            kpaVar = new kpa(Integer.valueOf(i), Integer.valueOf(i2));
            f = 1.0f;
            z = false;
        }
        int iIntValue2 = ((Number) kpaVar.a).intValue();
        int iIntValue3 = ((Number) kpaVar.b).intValue();
        int iMax2 = Math.max(iIntValue2, iIntValue3);
        int iMax3 = iMax2 < 320 ? Math.max(320 / iMax2, 2) : 1;
        int i11 = iMax3 == 1 ? iMax2 : iMax2 * iMax3;
        int iMin2 = Math.min(iIntValue2, iIntValue3);
        int i12 = iMax3 == 1 ? iMin2 : iMin2 * iMax3;
        if (i11 < iIntValue) {
            iIntValue = i11 - (i11 % 16);
        }
        int i13 = iIntValue / 16;
        int i14 = i13 * 9;
        int iA = i14 > i12 ? j47.a(i12, i13, 0) : j47.a(i14, i13, i12);
        if (iMax3 == 1) {
            iMax2 = iIntValue;
        } else if (iIntValue != i11) {
            iMax2 = tu0.G(iIntValue / iMax3);
        }
        if (z) {
            iMax2 = tu0.G(iMax2 / f);
        }
        if (iMax3 == 1) {
            iMin2 = iA;
        } else if (iA != i12) {
            iMin2 = tu0.G(iA / iMax3);
        }
        if (z) {
            iMin2 = tu0.G(iMin2 / f);
        }
        if (i >= i2) {
            i3 = (i - iMax2) / 2;
            i4 = (i2 - iMin2) / 2;
            i6 = iIntValue;
            i5 = iA;
            i8 = iMin2;
            i7 = iMax2;
        } else {
            i3 = (i - iMin2) / 2;
            i4 = (i2 - iMax2) / 2;
            i5 = iIntValue;
            i6 = iA;
            i7 = iMin2;
            i8 = iMax2;
        }
        return new nua(i3, i4, i7, i8, i6, i5, this.a);
    }

    public final Size b(int i, int i2) {
        if (i != 0 && i2 != 0) {
            nua nuaVarA = a(i, i2);
            return new Size(nuaVarA.g, nuaVarA.h);
        }
        this.b.invoke(rh4.h("Wrong frame size: ", i, i2, "x"));
        return null;
    }
}
