package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class vj6 {
    public final List a;
    public final int b;
    public final float c;
    public final String d;

    public vj6(List list, int i, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = f;
        this.d = str;
    }

    public static vj6 a(yaf yafVar) throws ParserException {
        int i;
        try {
            yafVar.I(21);
            int iV = yafVar.v() & 3;
            int iV2 = yafVar.v();
            int i2 = yafVar.b;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < iV2; i5++) {
                yafVar.I(1);
                int iA = yafVar.A();
                for (int i6 = 0; i6 < iA; i6++) {
                    int iA2 = yafVar.A();
                    i4 += iA2 + 4;
                    yafVar.I(iA2);
                }
            }
            yafVar.H(i2);
            byte[] bArr = new byte[i4];
            float f = 1.0f;
            String strF = null;
            int i7 = 0;
            int i8 = 0;
            while (i7 < iV2) {
                int iV3 = yafVar.v() & 127;
                int iA3 = yafVar.A();
                int i9 = i3;
                while (i9 < iA3) {
                    int iA4 = yafVar.A();
                    System.arraycopy(np8.b, i3, bArr, i8, 4);
                    int i10 = i8 + 4;
                    System.arraycopy(yafVar.a, yafVar.b, bArr, i10, iA4);
                    if (iV3 == 33 && i9 == 0) {
                        wl9 wl9VarE = np8.E(i10, bArr, i10 + iA4);
                        float f2 = wl9VarE.g;
                        i = iV2;
                        strF = i24.f(wl9VarE.a, wl9VarE.b, wl9VarE.c, wl9VarE.d, wl9VarE.e, wl9VarE.f);
                        f = f2;
                    } else {
                        i = iV2;
                    }
                    i8 = i10 + iA4;
                    yafVar.I(iA4);
                    i9++;
                    iV2 = i;
                    i3 = 0;
                }
                i7++;
                i3 = 0;
            }
            return new vj6(i4 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iV + 1, f, strF);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing HEVC config");
        }
    }
}
