package defpackage;

import android.util.Pair;
import androidx.media3.common.ParserException;

/* loaded from: classes.dex */
public abstract class wy {
    public static final byte[] a;

    static {
        int i = oaf.a;
        a = "OpusHead".getBytes(b52.c);
    }

    public static qy a(int i, wpa wpaVar) {
        wpaVar.G(i + 12);
        wpaVar.H(1);
        b(wpaVar);
        wpaVar.H(2);
        int iU = wpaVar.u();
        if ((iU & 128) != 0) {
            wpaVar.H(2);
        }
        if ((iU & 64) != 0) {
            wpaVar.H(wpaVar.u());
        }
        if ((iU & 32) != 0) {
            wpaVar.H(2);
        }
        wpaVar.H(1);
        b(wpaVar);
        String strD = ia9.d(wpaVar.u());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return new qy(strD, (byte[]) null, -1L, -1L);
        }
        wpaVar.H(4);
        long jW = wpaVar.w();
        long jW2 = wpaVar.w();
        wpaVar.H(1);
        int iB = b(wpaVar);
        byte[] bArr = new byte[iB];
        wpaVar.e(0, bArr, iB);
        return new qy(strD, bArr, jW2 > 0 ? jW2 : -1L, jW > 0 ? jW : -1L);
    }

    public static int b(wpa wpaVar) {
        int iU = wpaVar.u();
        int i = iU & 127;
        while ((iU & 128) == 128) {
            iU = wpaVar.u();
            i = (i << 7) | (iU & 127);
        }
        return i;
    }

    public static be9 c(wpa wpaVar) {
        long jO;
        long jO2;
        wpaVar.G(8);
        if (oy.t(wpaVar.g()) == 0) {
            jO = wpaVar.w();
            jO2 = wpaVar.w();
        } else {
            jO = wpaVar.o();
            jO2 = wpaVar.o();
        }
        return new be9(jO, jO2, wpaVar.w());
    }

    public static Pair d(wpa wpaVar, int i, int i2) throws ParserException {
        Integer num;
        oze ozeVar;
        Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = wpaVar.b;
        while (i5 - i < i2) {
            wpaVar.G(i5);
            int iG = wpaVar.g();
            lz7.f("childAtomSize must be positive", iG > 0);
            if (wpaVar.g() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                String strS = null;
                Integer numValueOf = null;
                while (i6 - i5 < iG) {
                    wpaVar.G(i6);
                    int iG2 = wpaVar.g();
                    int iG3 = wpaVar.g();
                    if (iG3 == 1718775137) {
                        numValueOf = Integer.valueOf(wpaVar.g());
                    } else if (iG3 == 1935894637) {
                        wpaVar.H(4);
                        strS = wpaVar.s(4, b52.c);
                    } else if (iG3 == 1935894633) {
                        i8 = i6;
                        i7 = iG2;
                    }
                    i6 += iG2;
                }
                if ("cenc".equals(strS) || "cbc1".equals(strS) || "cens".equals(strS) || "cbcs".equals(strS)) {
                    lz7.f("frma atom is mandatory", numValueOf != null);
                    lz7.f("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = numValueOf;
                            ozeVar = null;
                            break;
                        }
                        wpaVar.G(i9);
                        int iG4 = wpaVar.g();
                        if (wpaVar.g() == 1952804451) {
                            int iT = oy.t(wpaVar.g());
                            wpaVar.H(1);
                            if (iT == 0) {
                                wpaVar.H(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iU = wpaVar.u();
                                int i10 = (iU & 240) >> 4;
                                i3 = iU & 15;
                                i4 = i10;
                            }
                            boolean z = wpaVar.u() == 1;
                            int iU2 = wpaVar.u();
                            byte[] bArr2 = new byte[16];
                            wpaVar.e(0, bArr2, 16);
                            if (z && iU2 == 0) {
                                int iU3 = wpaVar.u();
                                byte[] bArr3 = new byte[iU3];
                                wpaVar.e(0, bArr3, iU3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            ozeVar = new oze(z, strS, iU2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += iG4;
                        }
                    }
                    lz7.f("tenc atom is mandatory", ozeVar != null);
                    int i11 = oaf.a;
                    pairCreate = Pair.create(num, ozeVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iG;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0c5d  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0c5f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ty e(defpackage.wpa r59, int r60, int r61, java.lang.String r62, defpackage.dr4 r63, boolean r64) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 3895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy.e(wpa, int, int, java.lang.String, dr4, boolean):ty");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
    
        r6 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x089a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0547 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(defpackage.ly r45, defpackage.ea6 r46, long r47, defpackage.dr4 r49, boolean r50, boolean r51, defpackage.w56 r52) {
        /*
            Method dump skipped, instructions count: 2212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy.f(ly, ea6, long, dr4, boolean, boolean, w56):java.util.ArrayList");
    }
}
