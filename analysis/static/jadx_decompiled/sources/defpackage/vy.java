package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;

/* loaded from: classes.dex */
public abstract class vy {
    public static final byte[] a;

    static {
        int i = maf.a;
        a = "OpusHead".getBytes(b52.c);
    }

    public static Pair a(int i, yaf yafVar) {
        yafVar.H(i + 12);
        yafVar.I(1);
        b(yafVar);
        yafVar.I(2);
        int iV = yafVar.v();
        if ((iV & 128) != 0) {
            yafVar.I(2);
        }
        if ((iV & 64) != 0) {
            yafVar.I(yafVar.A());
        }
        if ((iV & 32) != 0) {
            yafVar.I(2);
        }
        yafVar.I(1);
        b(yafVar);
        String strD = ha9.d(yafVar.v());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return Pair.create(strD, null);
        }
        yafVar.I(12);
        yafVar.I(1);
        int iB = b(yafVar);
        byte[] bArr = new byte[iB];
        yafVar.g(0, bArr, iB);
        return Pair.create(strD, bArr);
    }

    public static int b(yaf yafVar) {
        int iV = yafVar.v();
        int i = iV & 127;
        while ((iV & 128) == 128) {
            iV = yafVar.v();
            i = (i << 7) | (iV & 127);
        }
        return i;
    }

    public static Pair c(yaf yafVar, int i, int i2) throws ParserException {
        Integer num;
        nze nzeVar;
        Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = yafVar.b;
        while (i5 - i < i2) {
            yafVar.H(i5);
            int iH = yafVar.h();
            dy7.k("childAtomSize must be positive", iH > 0);
            if (yafVar.h() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                String strT = null;
                Integer numValueOf = null;
                while (i6 - i5 < iH) {
                    yafVar.H(i6);
                    int iH2 = yafVar.h();
                    int iH3 = yafVar.h();
                    if (iH3 == 1718775137) {
                        numValueOf = Integer.valueOf(yafVar.h());
                    } else if (iH3 == 1935894637) {
                        yafVar.I(4);
                        strT = yafVar.t(4, b52.c);
                    } else if (iH3 == 1935894633) {
                        i8 = i6;
                        i7 = iH2;
                    }
                    i6 += iH2;
                }
                if ("cenc".equals(strT) || "cbc1".equals(strT) || "cens".equals(strT) || "cbcs".equals(strT)) {
                    dy7.k("frma atom is mandatory", numValueOf != null);
                    dy7.k("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = numValueOf;
                            nzeVar = null;
                            break;
                        }
                        yafVar.H(i9);
                        int iH4 = yafVar.h();
                        if (yafVar.h() == 1952804451) {
                            int iS = oy.s(yafVar.h());
                            yafVar.I(1);
                            if (iS == 0) {
                                yafVar.I(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iV = yafVar.v();
                                int i10 = (iV & 240) >> 4;
                                i3 = iV & 15;
                                i4 = i10;
                            }
                            boolean z = yafVar.v() == 1;
                            int iV2 = yafVar.v();
                            byte[] bArr2 = new byte[16];
                            yafVar.g(0, bArr2, 16);
                            if (z && iV2 == 0) {
                                int iV3 = yafVar.v();
                                byte[] bArr3 = new byte[iV3];
                                yafVar.g(0, bArr3, iV3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            nzeVar = new nze(z, strT, iV2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += iH4;
                        }
                    }
                    dy7.k("tenc atom is mandatory", nzeVar != null);
                    int i11 = maf.a;
                    pairCreate = Pair.create(num, nzeVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iH;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x045f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zze d(defpackage.jze r41, defpackage.ky r42, defpackage.da6 r43) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy.d(jze, ky, da6):zze");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
    
        r13 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:324:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0d47  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0d49  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList e(defpackage.ky r70, defpackage.da6 r71, long r72, defpackage.cr4 r74, boolean r75, boolean r76, defpackage.w56 r77) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 3501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy.e(ky, da6, long, cr4, boolean, boolean, w56):java.util.ArrayList");
    }
}
