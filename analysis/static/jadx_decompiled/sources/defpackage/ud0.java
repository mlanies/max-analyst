package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ud0 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public ud0(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static ud0 a(wpa wpaVar) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        String str;
        int i8;
        try {
            wpaVar.H(4);
            int iU = (wpaVar.u() & 3) + 1;
            if (iU == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU2 = wpaVar.u() & 31;
            int i9 = 0;
            while (true) {
                bArr = c54.a;
                if (i9 >= iU2) {
                    break;
                }
                int iA = wpaVar.A();
                int i10 = wpaVar.b;
                wpaVar.H(iA);
                byte[] bArr2 = wpaVar.a;
                byte[] bArr3 = new byte[iA + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i10, bArr3, 4, iA);
                arrayList.add(bArr3);
                i9++;
            }
            int iU3 = wpaVar.u();
            for (int i11 = 0; i11 < iU3; i11++) {
                int iA2 = wpaVar.A();
                int i12 = wpaVar.b;
                wpaVar.H(iA2);
                byte[] bArr4 = wpaVar.a;
                byte[] bArr5 = new byte[iA2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i12, bArr5, 4, iA2);
                arrayList.add(bArr5);
            }
            if (iU2 > 0) {
                bm9 bm9VarK = fm9.K(iU, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                int i13 = bm9VarK.e;
                int i14 = bm9VarK.f;
                int i15 = bm9VarK.h + 8;
                int i16 = bm9VarK.i + 8;
                int i17 = bm9VarK.p;
                int i18 = bm9VarK.q;
                int i19 = bm9VarK.r;
                int i20 = bm9VarK.s;
                float f2 = bm9VarK.g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(bm9VarK.a), Integer.valueOf(bm9VarK.b), Integer.valueOf(bm9VarK.c));
                i6 = i18;
                i7 = i19;
                i8 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i4 = i16;
                i5 = i17;
                i = i13;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                f = 1.0f;
                str = null;
                i8 = 16;
            }
            return new ud0(arrayList, iU, i, i2, i3, i4, i5, i6, i7, i8, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing AVC config");
        }
    }
}
