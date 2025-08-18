package defpackage;

import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class t02 extends a12 {
    public int A0;
    public final yaf Z = new yaf(3, false);
    public final s02 s0 = new s02(1);
    public int t0 = -1;
    public final int u0;
    public final q02[] v0;
    public q02 w0;
    public List x0;
    public List y0;
    public yaf z0;

    public t02(int i, List list) {
        this.u0 = i == -1 ? 1 : i;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.v0 = new q02[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.v0[i2] = new q02();
        }
        this.w0 = this.v0[0];
    }

    @Override // defpackage.a12
    public final w4d a() {
        List list = this.x0;
        this.y0 = list;
        list.getClass();
        return new w4d(7, list);
    }

    @Override // defpackage.a12
    public final void d(w02 w02Var) {
        ByteBuffer byteBuffer = w02Var.o;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        yaf yafVar = this.Z;
        yafVar.F(iLimit, bArrArray);
        while (yafVar.c() >= 3) {
            int iV = yafVar.v();
            int i = iV & 3;
            boolean z = (iV & 4) == 4;
            byte bV = (byte) yafVar.v();
            byte bV2 = (byte) yafVar.v();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        h();
                        int i2 = (bV & 192) >> 6;
                        int i3 = this.t0;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            j();
                        }
                        this.t0 = i2;
                        int i4 = bV & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        yaf yafVar2 = new yaf();
                        yafVar2.b = i4;
                        yafVar2.a = new byte[(i4 * 2) - 1];
                        yafVar2.c = 0;
                        this.z0 = yafVar2;
                        yafVar2.c = 1;
                        yafVar2.a[0] = bV2;
                    } else {
                        np8.d(i == 2);
                        yaf yafVar3 = this.z0;
                        if (yafVar3 != null) {
                            int i5 = yafVar3.c;
                            int i6 = i5 + 1;
                            yafVar3.c = i6;
                            byte[] bArr = yafVar3.a;
                            bArr[i5] = bV;
                            yafVar3.c = i5 + 2;
                            bArr[i6] = bV2;
                        }
                    }
                    yaf yafVar4 = this.z0;
                    if (yafVar4.c == (yafVar4.b * 2) - 1) {
                        h();
                    }
                }
            }
        }
    }

    @Override // defpackage.a12, defpackage.l54
    public final void flush() {
        super.flush();
        this.x0 = null;
        this.y0 = null;
        this.A0 = 0;
        this.w0 = this.v0[0];
        j();
        this.z0 = null;
    }

    @Override // defpackage.a12
    public final boolean g() {
        return this.x0 != this.y0;
    }

    public final void h() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        int i5;
        boolean z;
        yaf yafVar = this.z0;
        if (yafVar == null) {
            return;
        }
        int i6 = yafVar.c;
        byte[] bArr = yafVar.a;
        s02 s02Var = this.s0;
        s02Var.o(i6, bArr);
        int i7 = 3;
        int i8 = s02Var.i(3);
        int i9 = s02Var.i(5);
        int i10 = 2;
        int i11 = 7;
        if (i8 == 7) {
            s02Var.t(2);
            i8 = s02Var.i(6);
        }
        if (i9 != 0 && i8 == this.u0) {
            int i12 = 8;
            boolean z2 = false;
            for (int iG = (i9 * 8) + s02Var.g(); s02Var.b() > 0 && s02Var.g() < iG; iG = i) {
                int i13 = s02Var.i(i12);
                if (i13 != 16) {
                    if (i13 <= 31) {
                        if (i13 != 0) {
                            if (i13 == i7) {
                                this.x0 = i();
                            } else if (i13 != i12) {
                                switch (i13) {
                                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                                        j();
                                        break;
                                    case 13:
                                        this.w0.a('\n');
                                        break;
                                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                                        break;
                                    default:
                                        if (i13 < 17 || i13 > 23) {
                                            if (i13 >= 24 && i13 <= 31) {
                                                s02Var.t(16);
                                                break;
                                            }
                                        } else {
                                            s02Var.t(i12);
                                            break;
                                        }
                                        break;
                                }
                            } else {
                                SpannableStringBuilder spannableStringBuilder = this.w0.b;
                                int length = spannableStringBuilder.length();
                                if (length > 0) {
                                    spannableStringBuilder.delete(length - 1, length);
                                }
                            }
                        }
                        i = iG;
                        i4 = i10;
                        i5 = i12;
                    } else if (i13 <= 127) {
                        if (i13 == 127) {
                            this.w0.a((char) 9835);
                        } else {
                            this.w0.a((char) (i13 & 255));
                        }
                        i = iG;
                        i4 = i10;
                        i5 = i12;
                        z2 = true;
                    } else {
                        if (i13 <= 159) {
                            q02[] q02VarArr = this.v0;
                            switch (i13) {
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                    i = iG;
                                    z = true;
                                    i2 = i7;
                                    int i14 = i13 - 128;
                                    if (this.A0 != i14) {
                                        this.A0 = i14;
                                        this.w0 = q02VarArr[i14];
                                        break;
                                    }
                                    break;
                                case 136:
                                    i = iG;
                                    z = true;
                                    i2 = i7;
                                    int i15 = 1;
                                    for (int i16 = i12; i15 <= i16; i16 = 8) {
                                        if (s02Var.h()) {
                                            q02 q02Var = q02VarArr[8 - i15];
                                            q02Var.a.clear();
                                            q02Var.b.clear();
                                            q02Var.p = -1;
                                            q02Var.q = -1;
                                            q02Var.r = -1;
                                            q02Var.t = -1;
                                            q02Var.v = 0;
                                        }
                                        i15++;
                                    }
                                    break;
                                case 137:
                                    i = iG;
                                    i2 = i7;
                                    int i17 = 1;
                                    for (int i18 = i12; i17 <= i18; i18 = 8) {
                                        if (s02Var.h()) {
                                            q02VarArr[8 - i17].d = true;
                                        }
                                        i17++;
                                    }
                                    z = true;
                                    break;
                                case 138:
                                    i = iG;
                                    i2 = i7;
                                    int i19 = 1;
                                    for (int i20 = i12; i19 <= i20; i20 = 8) {
                                        if (s02Var.h()) {
                                            q02VarArr[8 - i19].d = false;
                                        }
                                        i19++;
                                    }
                                    z = true;
                                    break;
                                case 139:
                                    i = iG;
                                    i2 = i7;
                                    int i21 = 1;
                                    for (int i22 = i12; i21 <= i22; i22 = 8) {
                                        if (s02Var.h()) {
                                            q02VarArr[8 - i21].d = !r2.d;
                                        }
                                        i21++;
                                    }
                                    z = true;
                                    break;
                                case 140:
                                    i = iG;
                                    i2 = i7;
                                    int i23 = 1;
                                    for (int i24 = i12; i23 <= i24; i24 = 8) {
                                        if (s02Var.h()) {
                                            q02VarArr[8 - i23].d();
                                        }
                                        i23++;
                                    }
                                    z = true;
                                    break;
                                case 141:
                                    i = iG;
                                    i2 = i7;
                                    s02Var.t(i12);
                                    z = true;
                                    break;
                                case 142:
                                case 147:
                                case 148:
                                case 149:
                                case 150:
                                default:
                                    i = iG;
                                    z = true;
                                    i2 = i7;
                                    break;
                                case 143:
                                    i = iG;
                                    i2 = i7;
                                    j();
                                    z = true;
                                    break;
                                case 144:
                                    i = iG;
                                    if (!this.w0.c) {
                                        s02Var.t(16);
                                        i2 = 3;
                                        z = true;
                                        break;
                                    } else {
                                        s02Var.i(4);
                                        s02Var.i(2);
                                        s02Var.i(2);
                                        boolean zH = s02Var.h();
                                        boolean zH2 = s02Var.h();
                                        i2 = 3;
                                        s02Var.i(3);
                                        s02Var.i(3);
                                        this.w0.e(zH, zH2);
                                        z = true;
                                    }
                                case 145:
                                    i = iG;
                                    if (this.w0.c) {
                                        int iC = q02.c(s02Var.i(2), s02Var.i(2), s02Var.i(2), s02Var.i(2));
                                        int iC2 = q02.c(s02Var.i(2), s02Var.i(2), s02Var.i(2), s02Var.i(2));
                                        s02Var.t(2);
                                        q02.c(s02Var.i(2), s02Var.i(2), s02Var.i(2), 0);
                                        this.w0.f(iC, iC2);
                                    } else {
                                        s02Var.t(24);
                                    }
                                    i2 = 3;
                                    z = true;
                                    break;
                                case 146:
                                    i = iG;
                                    if (this.w0.c) {
                                        s02Var.t(4);
                                        int i25 = s02Var.i(4);
                                        s02Var.t(2);
                                        s02Var.i(6);
                                        q02 q02Var2 = this.w0;
                                        if (q02Var2.v != i25) {
                                            q02Var2.a('\n');
                                        }
                                        q02Var2.v = i25;
                                    } else {
                                        s02Var.t(16);
                                    }
                                    i2 = 3;
                                    z = true;
                                    break;
                                case 151:
                                    i = iG;
                                    if (this.w0.c) {
                                        int iC3 = q02.c(s02Var.i(2), s02Var.i(2), s02Var.i(2), s02Var.i(2));
                                        s02Var.i(2);
                                        q02.c(s02Var.i(2), s02Var.i(2), s02Var.i(2), 0);
                                        s02Var.h();
                                        s02Var.h();
                                        s02Var.i(2);
                                        s02Var.i(2);
                                        int i26 = s02Var.i(2);
                                        s02Var.t(8);
                                        q02 q02Var3 = this.w0;
                                        q02Var3.o = iC3;
                                        q02Var3.l = i26;
                                    } else {
                                        s02Var.t(32);
                                    }
                                    i2 = 3;
                                    z = true;
                                    break;
                                case 152:
                                case 153:
                                case 154:
                                case 155:
                                case 156:
                                case 157:
                                case 158:
                                case 159:
                                    int i27 = i13 - 152;
                                    q02 q02Var4 = q02VarArr[i27];
                                    s02Var.t(i10);
                                    boolean zH3 = s02Var.h();
                                    boolean zH4 = s02Var.h();
                                    s02Var.h();
                                    int i28 = s02Var.i(i7);
                                    boolean zH5 = s02Var.h();
                                    int i29 = s02Var.i(i11);
                                    int i30 = s02Var.i(i12);
                                    int i31 = s02Var.i(4);
                                    int i32 = s02Var.i(4);
                                    s02Var.t(i10);
                                    s02Var.i(6);
                                    s02Var.t(i10);
                                    int i33 = s02Var.i(3);
                                    i = iG;
                                    int i34 = s02Var.i(3);
                                    q02Var4.c = true;
                                    q02Var4.d = zH3;
                                    q02Var4.k = zH4;
                                    q02Var4.e = i28;
                                    q02Var4.f = zH5;
                                    q02Var4.g = i29;
                                    q02Var4.h = i30;
                                    q02Var4.i = i31;
                                    int i35 = i32 + 1;
                                    if (q02Var4.j != i35) {
                                        q02Var4.j = i35;
                                        while (true) {
                                            ArrayList arrayList = q02Var4.a;
                                            if ((zH4 && arrayList.size() >= q02Var4.j) || arrayList.size() >= 15) {
                                                arrayList.remove(0);
                                            }
                                        }
                                    }
                                    if (i33 != 0 && q02Var4.m != i33) {
                                        q02Var4.m = i33;
                                        int i36 = i33 - 1;
                                        int i37 = q02.C[i36];
                                        boolean z3 = q02.B[i36];
                                        int i38 = q02.z[i36];
                                        int i39 = q02.A[i36];
                                        int i40 = q02.y[i36];
                                        q02Var4.o = i37;
                                        q02Var4.l = i40;
                                    }
                                    if (i34 != 0 && q02Var4.n != i34) {
                                        q02Var4.n = i34;
                                        int i41 = i34 - 1;
                                        int i42 = q02.E[i41];
                                        int i43 = q02.D[i41];
                                        q02Var4.e(false, false);
                                        q02Var4.f(q02.w, q02.F[i41]);
                                    }
                                    if (this.A0 != i27) {
                                        this.A0 = i27;
                                        this.w0 = q02VarArr[i27];
                                    }
                                    i2 = 3;
                                    z = true;
                                    break;
                            }
                        } else {
                            i = iG;
                            z = true;
                            i2 = i7;
                            if (i13 <= 255) {
                                this.w0.a((char) (i13 & 255));
                            }
                            i4 = 2;
                            i3 = 7;
                            c = 6;
                            i5 = 8;
                        }
                        z2 = z;
                        i4 = 2;
                        i3 = 7;
                        c = 6;
                        i5 = 8;
                    }
                    c = 6;
                    i2 = i7;
                    i3 = i11;
                } else {
                    i = iG;
                    i2 = i7;
                    int i44 = i12;
                    int i45 = s02Var.i(i44);
                    if (i45 <= 31) {
                        i3 = 7;
                        if (i45 > 7) {
                            if (i45 <= 15) {
                                s02Var.t(i44);
                            } else if (i45 <= 23) {
                                s02Var.t(16);
                            } else if (i45 <= 31) {
                                s02Var.t(24);
                            }
                        }
                    } else {
                        i3 = 7;
                        if (i45 <= 127) {
                            if (i45 == 32) {
                                this.w0.a(' ');
                            } else if (i45 == 33) {
                                this.w0.a((char) 160);
                            } else if (i45 == 37) {
                                this.w0.a((char) 8230);
                            } else if (i45 == 42) {
                                this.w0.a((char) 352);
                            } else if (i45 == 44) {
                                this.w0.a((char) 338);
                            } else if (i45 == 63) {
                                this.w0.a((char) 376);
                            } else if (i45 == 57) {
                                this.w0.a((char) 8482);
                            } else if (i45 == 58) {
                                this.w0.a((char) 353);
                            } else if (i45 == 60) {
                                this.w0.a((char) 339);
                            } else if (i45 != 61) {
                                switch (i45) {
                                    case 48:
                                        this.w0.a((char) 9608);
                                        break;
                                    case 49:
                                        this.w0.a((char) 8216);
                                        break;
                                    case 50:
                                        this.w0.a((char) 8217);
                                        break;
                                    case 51:
                                        this.w0.a((char) 8220);
                                        break;
                                    case 52:
                                        this.w0.a((char) 8221);
                                        break;
                                    case 53:
                                        this.w0.a((char) 8226);
                                        break;
                                    default:
                                        switch (i45) {
                                            case 118:
                                                this.w0.a((char) 8539);
                                                break;
                                            case 119:
                                                this.w0.a((char) 8540);
                                                break;
                                            case 120:
                                                this.w0.a((char) 8541);
                                                break;
                                            case 121:
                                                this.w0.a((char) 8542);
                                                break;
                                            case 122:
                                                this.w0.a((char) 9474);
                                                break;
                                            case 123:
                                                this.w0.a((char) 9488);
                                                break;
                                            case 124:
                                                this.w0.a((char) 9492);
                                                break;
                                            case 125:
                                                this.w0.a((char) 9472);
                                                break;
                                            case 126:
                                                this.w0.a((char) 9496);
                                                break;
                                            case 127:
                                                this.w0.a((char) 9484);
                                                break;
                                        }
                                }
                            } else {
                                this.w0.a((char) 8480);
                            }
                            z2 = true;
                        } else if (i45 > 159) {
                            i4 = 2;
                            c = 6;
                            i5 = 8;
                            if (i45 <= 255) {
                                if (i45 == 160) {
                                    this.w0.a((char) 13252);
                                } else {
                                    this.w0.a('_');
                                }
                                z2 = true;
                            }
                        } else if (i45 <= 135) {
                            s02Var.t(32);
                        } else if (i45 <= 143) {
                            s02Var.t(40);
                        } else if (i45 <= 159) {
                            i4 = 2;
                            s02Var.t(2);
                            c = 6;
                            i5 = 8;
                            s02Var.t(s02Var.i(6) * 8);
                        }
                    }
                    i4 = 2;
                    c = 6;
                    i5 = 8;
                }
                i10 = i4;
                i7 = i2;
                i11 = i3;
                i12 = i5;
            }
            if (z2) {
                this.x0 = i();
            }
        }
        this.z0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t02.i():java.util.List");
    }

    public final void j() {
        for (int i = 0; i < 8; i++) {
            this.v0[i].d();
        }
    }
}
