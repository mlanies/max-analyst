package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class xo extends nd7 {
    public final /* synthetic */ int k;

    public /* synthetic */ xo(int i) {
        this.k = i;
    }

    public static d45 X(wpa wpaVar) {
        String strP = wpaVar.p();
        strP.getClass();
        String strP2 = wpaVar.p();
        strP2.getClass();
        return new d45(strP, strP2, wpaVar.o(), wpaVar.o(), Arrays.copyOfRange(wpaVar.a, wpaVar.b, wpaVar.c));
    }

    @Override // defpackage.nd7
    public final f99 n(k99 k99Var, ByteBuffer byteBuffer) {
        int i = 2;
        switch (this.k) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                s02 s02Var = new s02(byteBuffer.array(), byteBuffer.limit(), 2, (byte) 0);
                int i2 = 12;
                s02Var.t(12);
                int iF = (s02Var.f() + s02Var.i(12)) - 4;
                s02Var.t(44);
                s02Var.u(s02Var.i(12));
                s02Var.t(16);
                ArrayList arrayList = new ArrayList();
                while (s02Var.f() < iF) {
                    s02Var.t(48);
                    int i3 = s02Var.i(8);
                    s02Var.t(4);
                    int iF2 = s02Var.f() + s02Var.i(i2);
                    String str = null;
                    String str2 = null;
                    while (s02Var.f() < iF2) {
                        int i4 = s02Var.i(8);
                        int i5 = s02Var.i(8);
                        int iF3 = s02Var.f() + i5;
                        if (i4 == i) {
                            int i6 = s02Var.i(16);
                            s02Var.t(8);
                            if (i6 == 3) {
                                while (s02Var.f() < iF3) {
                                    int i7 = s02Var.i(8);
                                    Charset charset = b52.a;
                                    byte[] bArr = new byte[i7];
                                    s02Var.l(i7, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i8 = s02Var.i(8);
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        s02Var.u(s02Var.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i4 == 21) {
                            Charset charset2 = b52.a;
                            byte[] bArr2 = new byte[i5];
                            s02Var.l(i5, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        s02Var.q(iF3 * 8);
                        i = 2;
                    }
                    s02Var.q(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new vo(i3, str.concat(str2)));
                    }
                    i = 2;
                    i2 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new f99(arrayList);
            default:
                return new f99(X(new wpa(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
