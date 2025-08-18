package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class td0 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public td0(ArrayList arrayList, int i, int i2, int i3, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static td0 a(yaf yafVar) throws ParserException {
        byte[] bArr;
        int i;
        int i2;
        float f;
        String str;
        try {
            yafVar.I(4);
            int iV = (yafVar.v() & 3) + 1;
            if (iV == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iV2 = yafVar.v() & 31;
            int i3 = 0;
            while (true) {
                bArr = i24.a;
                if (i3 >= iV2) {
                    break;
                }
                int iA = yafVar.A();
                int i4 = yafVar.b;
                yafVar.I(iA);
                byte[] bArr2 = yafVar.a;
                byte[] bArr3 = new byte[iA + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i4, bArr3, 4, iA);
                arrayList.add(bArr3);
                i3++;
            }
            int iV3 = yafVar.v();
            for (int i5 = 0; i5 < iV3; i5++) {
                int iA2 = yafVar.A();
                int i6 = yafVar.b;
                yafVar.I(iA2);
                byte[] bArr4 = yafVar.a;
                byte[] bArr5 = new byte[iA2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i6, bArr5, 4, iA2);
                arrayList.add(bArr5);
            }
            if (iV2 > 0) {
                am9 am9VarF = np8.F(iV, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                int i7 = am9VarF.e;
                int i8 = am9VarF.f;
                float f2 = am9VarF.g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(am9VarF.a), Integer.valueOf(am9VarF.b), Integer.valueOf(am9VarF.c));
                i = i7;
                i2 = i8;
                f = f2;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
                str = null;
            }
            return new td0(arrayList, iV, i, i2, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing AVC config");
        }
    }
}
