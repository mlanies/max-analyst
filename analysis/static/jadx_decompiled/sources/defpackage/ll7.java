package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ll7 implements vd0 {
    public final zw6 a;
    public final int b;

    public ll7(int i, ffc ffcVar) {
        this.b = i;
        this.a = ffcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ll7 b(int i, wpa wpaVar) {
        String str;
        vd0 yd0Var;
        int i2;
        int i3 = 4;
        wmd.i(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i4 = wpaVar.c;
        int i5 = 0;
        int i6 = -2;
        int i7 = 0;
        while (wpaVar.a() > 8) {
            int i8 = wpaVar.i();
            int i9 = wpaVar.b + wpaVar.i();
            wpaVar.F(i9);
            if (i8 != 1414744396) {
                v8e v8eVar = null;
                switch (i8) {
                    case 1718776947:
                        if (i6 == 2) {
                            wpaVar.H(i3);
                            int i10 = wpaVar.i();
                            int i11 = wpaVar.i();
                            wpaVar.H(i3);
                            int i12 = wpaVar.i();
                            switch (i12) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                ey8.k(i12, "Ignoring track with unsupported compression ");
                            } else {
                                ny5 ny5Var = new ny5();
                                ny5Var.s = i10;
                                ny5Var.t = i11;
                                ny5Var.d(str);
                                v8eVar = new v8e(new qy5(ny5Var));
                            }
                        } else if (i6 == 1) {
                            int iN = wpaVar.n();
                            String str2 = iN != 1 ? iN != 85 ? iN != 255 ? iN != 8192 ? iN != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 == null) {
                                ey8.k(iN, "Ignoring track with unsupported format tag ");
                            } else {
                                int iN2 = wpaVar.n();
                                int i13 = wpaVar.i();
                                wpaVar.H(6);
                                int iC = oaf.C(wpaVar.n());
                                int iN3 = wpaVar.a() > 0 ? wpaVar.n() : i5;
                                byte[] bArr = new byte[iN3];
                                wpaVar.e(i5, bArr, iN3);
                                ny5 ny5Var2 = new ny5();
                                ny5Var2.m = ia9.l(str2);
                                ny5Var2.A = iN2;
                                ny5Var2.B = i13;
                                if ("audio/raw".equals(str2) && iC != 0) {
                                    ny5Var2.C = iC;
                                }
                                if ("audio/mp4a-latm".equals(str2) && iN3 > 0) {
                                    ny5Var2.p = zw6.n(bArr);
                                }
                                v8eVar = new v8e(new qy5(ny5Var2));
                            }
                        } else {
                            z04.c0("Ignoring strf box for unsupported track type: " + oaf.H(i6));
                        }
                        yd0Var = v8eVar;
                        break;
                    case 1751742049:
                        int i14 = wpaVar.i();
                        wpaVar.H(8);
                        int i15 = wpaVar.i();
                        int i16 = wpaVar.i();
                        wpaVar.H(i3);
                        wpaVar.i();
                        wpaVar.H(12);
                        yd0Var = new yd0(i14, i15, i16);
                        break;
                    case 1752331379:
                        int i17 = wpaVar.i();
                        wpaVar.H(12);
                        wpaVar.i();
                        int i18 = wpaVar.i();
                        int i19 = wpaVar.i();
                        wpaVar.H(i3);
                        int i20 = wpaVar.i();
                        int i21 = wpaVar.i();
                        wpaVar.H(8);
                        yd0Var = new zd0(i17, i18, i19, i20, i21);
                        break;
                    case 1852994675:
                        yd0Var = new y8e(wpaVar.s(wpaVar.a(), b52.c));
                        break;
                    default:
                        yd0Var = v8eVar;
                        break;
                }
            } else {
                yd0Var = b(wpaVar.i(), wpaVar);
            }
            if (yd0Var != null) {
                if (yd0Var.getType() == 1752331379) {
                    int i22 = ((zd0) yd0Var).a;
                    if (i22 == 1935960438) {
                        i6 = 2;
                    } else if (i22 != 1935963489) {
                        if (i22 != 1937012852) {
                            z04.c0("Found unsupported streamType fourCC: " + Integer.toHexString(i22));
                            i2 = -1;
                        } else {
                            i2 = 3;
                        }
                        i6 = i2;
                    } else {
                        i6 = 1;
                    }
                }
                int i23 = i7 + 1;
                if (objArrCopyOf.length < i23) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, pw6.h(objArrCopyOf.length, i23));
                }
                objArrCopyOf[i7] = yd0Var;
                i7 = i23;
            }
            wpaVar.G(i9);
            wpaVar.F(i4);
            i3 = 4;
            i5 = 0;
        }
        return new ll7(i, zw6.h(i7, objArrCopyOf));
    }

    public final vd0 a(Class cls) {
        ls5 ls5VarListIterator = this.a.listIterator(0);
        while (ls5VarListIterator.hasNext()) {
            vd0 vd0Var = (vd0) ls5VarListIterator.next();
            if (vd0Var.getClass() == cls) {
                return vd0Var;
            }
        }
        return null;
    }

    @Override // defpackage.vd0
    public final int getType() {
        return this.b;
    }
}
