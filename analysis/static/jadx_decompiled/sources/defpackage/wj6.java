package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class wj6 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final String j;

    public wj6(List list, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = f;
        this.i = i7;
        this.j = str;
    }

    public static wj6 a(wpa wpaVar) {
        int i;
        int i2;
        try {
            wpaVar.H(21);
            int iU = wpaVar.u() & 3;
            int iU2 = wpaVar.u();
            int i3 = wpaVar.b;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < iU2; i6++) {
                wpaVar.H(1);
                int iA = wpaVar.A();
                for (int i7 = 0; i7 < iA; i7++) {
                    int iA2 = wpaVar.A();
                    i5 += iA2 + 4;
                    wpaVar.H(iA2);
                }
            }
            wpaVar.G(i3);
            byte[] bArr = new byte[i5];
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            float f = 1.0f;
            String strI = null;
            int i14 = 0;
            int i15 = 0;
            while (i14 < iU2) {
                int iU3 = wpaVar.u() & 63;
                int iA3 = wpaVar.A();
                int i16 = i4;
                while (i16 < iA3) {
                    int iA4 = wpaVar.A();
                    int i17 = iU2;
                    System.arraycopy(fm9.e, i4, bArr, i15, 4);
                    int i18 = i15 + 4;
                    System.arraycopy(wpaVar.a, wpaVar.b, bArr, i18, iA4);
                    if (iU3 == 33 && i16 == 0) {
                        xl9 xl9VarJ = fm9.J(i18, bArr, i18 + iA4);
                        int i19 = xl9VarJ.e + 8;
                        i9 = xl9VarJ.f + 8;
                        i10 = xl9VarJ.m;
                        int i20 = xl9VarJ.n;
                        int i21 = xl9VarJ.o;
                        float f2 = xl9VarJ.k;
                        int i22 = xl9VarJ.l;
                        i = iU3;
                        i2 = iA3;
                        i8 = i19;
                        strI = c54.i(xl9VarJ.a, xl9VarJ.b, xl9VarJ.c, xl9VarJ.d, xl9VarJ.g, xl9VarJ.h);
                        i12 = i21;
                        i11 = i20;
                        i13 = i22;
                        f = f2;
                    } else {
                        i = iU3;
                        i2 = iA3;
                    }
                    i15 = i18 + iA4;
                    wpaVar.H(iA4);
                    i16++;
                    iU2 = i17;
                    iU3 = i;
                    iA3 = i2;
                    i4 = 0;
                }
                i14++;
                i4 = 0;
            }
            return new wj6(i5 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iU + 1, i8, i9, i10, i11, i12, f, i13, strI);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing HEVC config");
        }
    }
}
