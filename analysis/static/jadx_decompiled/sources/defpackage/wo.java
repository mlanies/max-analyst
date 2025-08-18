package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class wo extends j47 {
    public final /* synthetic */ int w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wo(int i) {
        super(17);
        this.w0 = i;
    }

    public static c45 u0(yaf yafVar) {
        String strQ = yafVar.q();
        strQ.getClass();
        String strQ2 = yafVar.q();
        strQ2.getClass();
        return new c45(strQ, strQ2, yafVar.p(), yafVar.p(), Arrays.copyOfRange(yafVar.a, yafVar.b, yafVar.c));
    }

    @Override // defpackage.j47
    public final e99 w(j99 j99Var, ByteBuffer byteBuffer) {
        switch (this.w0) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                s02 s02Var = new s02(byteBuffer.array(), byteBuffer.limit(), 1, (byte) 0);
                int i = 12;
                s02Var.t(12);
                int iF = (s02Var.f() + s02Var.i(12)) - 4;
                s02Var.t(44);
                s02Var.u(s02Var.i(12));
                s02Var.t(16);
                ArrayList arrayList = new ArrayList();
                while (s02Var.f() < iF) {
                    s02Var.t(48);
                    int i2 = s02Var.i(8);
                    s02Var.t(4);
                    int iF2 = s02Var.f() + s02Var.i(i);
                    String str = null;
                    String str2 = null;
                    while (s02Var.f() < iF2) {
                        int i3 = s02Var.i(8);
                        int i4 = s02Var.i(8);
                        int iF3 = s02Var.f() + i4;
                        if (i3 == 2) {
                            int i5 = s02Var.i(16);
                            s02Var.t(8);
                            if (i5 == 3) {
                                while (s02Var.f() < iF3) {
                                    int i6 = s02Var.i(8);
                                    Charset charset = b52.a;
                                    byte[] bArr = new byte[i6];
                                    s02Var.l(i6, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i7 = s02Var.i(8);
                                    for (int i8 = 0; i8 < i7; i8++) {
                                        s02Var.u(s02Var.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i3 == 21) {
                            Charset charset2 = b52.a;
                            byte[] bArr2 = new byte[i4];
                            s02Var.l(i4, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        s02Var.q(iF3 * 8);
                    }
                    s02Var.q(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new uo(i2, str2.length() != 0 ? str.concat(str2) : new String(str)));
                    }
                    i = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new e99(arrayList);
            default:
                return new e99(u0(new yaf(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
