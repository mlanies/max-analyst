package defpackage;

import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class u02 extends b12 {
    public final wpa h = new wpa();
    public final s02 i = new s02(2);
    public int j = -1;
    public final int k;
    public final r02[] l;
    public r02 m;
    public List n;
    public List o;
    public s02 p;
    public int q;

    public u02(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.l = new r02[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.l[i2] = new r02();
        }
        this.m = this.l[0];
    }

    @Override // defpackage.b12
    public final c12 e() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new c12(list);
    }

    @Override // defpackage.b12, defpackage.m54
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    @Override // defpackage.b12
    public final void g(x02 x02Var) {
        ByteBuffer byteBuffer = x02Var.X;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        wpa wpaVar = this.h;
        wpaVar.E(iLimit, bArrArray);
        while (wpaVar.a() >= 3) {
            int iU = wpaVar.u();
            int i = iU & 3;
            boolean z = (iU & 4) == 4;
            byte bU = (byte) wpaVar.u();
            byte bU2 = (byte) wpaVar.u();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        j();
                        int i2 = (bU & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            l();
                            z04.c0("Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bU & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        s02 s02Var = new s02(i2, i4);
                        this.p = s02Var;
                        s02Var.e = 1;
                        s02Var.b[0] = bU2;
                    } else {
                        fm9.f(i == 2);
                        s02 s02Var2 = this.p;
                        if (s02Var2 == null) {
                            z04.u("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            int i5 = s02Var2.e;
                            int i6 = i5 + 1;
                            s02Var2.e = i6;
                            byte[] bArr = s02Var2.b;
                            bArr[i5] = bU;
                            s02Var2.e = i5 + 2;
                            bArr[i6] = bU2;
                        }
                    }
                    s02 s02Var3 = this.p;
                    if (s02Var3.e == (s02Var3.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // defpackage.b12
    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        int i;
        boolean z;
        int i2;
        int i3;
        char c;
        s02 s02Var = this.p;
        if (s02Var == null) {
            return;
        }
        int i4 = 2;
        boolean z2 = true;
        if (s02Var.e != (s02Var.d * 2) - 1) {
            z04.t("DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        s02 s02Var2 = this.p;
        byte[] bArr = s02Var2.b;
        int i5 = s02Var2.e;
        s02 s02Var3 = this.i;
        s02Var3.o(i5, bArr);
        boolean z3 = false;
        while (true) {
            if (s02Var3.b() > 0) {
                int i6 = 3;
                int i7 = s02Var3.i(3);
                int i8 = s02Var3.i(5);
                int i9 = 7;
                if (i7 == 7) {
                    s02Var3.t(i4);
                    i7 = s02Var3.i(6);
                    if (i7 < 7) {
                        ey8.k(i7, "Invalid extended service number: ");
                    }
                }
                if (i8 == 0) {
                    if (i7 != 0) {
                        z04.c0("serviceNumber is non-zero (" + i7 + ") when blockSize is 0");
                    }
                } else if (i7 != this.k) {
                    s02Var3.u(i8);
                } else {
                    int iG = (i8 * 8) + s02Var3.g();
                    while (s02Var3.g() < iG) {
                        int i10 = s02Var3.i(8);
                        if (i10 != 16) {
                            if (i10 <= 31) {
                                if (i10 != 0) {
                                    if (i10 == i6) {
                                        this.n = k();
                                    } else if (i10 != 8) {
                                        switch (i10) {
                                            case Protos.Attaches.Attach.PRESENT /* 12 */:
                                                l();
                                                break;
                                            case 13:
                                                this.m.a('\n');
                                                break;
                                            case Protos.Attaches.Attach.LOCATION /* 14 */:
                                                break;
                                            default:
                                                if (i10 < 17 || i10 > 23) {
                                                    if (i10 < 24 || i10 > 31) {
                                                        ey8.k(i10, "Invalid C0 command: ");
                                                        break;
                                                    } else {
                                                        z04.c0("Currently unsupported COMMAND_P16 Command: " + i10);
                                                        s02Var3.t(16);
                                                        break;
                                                    }
                                                } else {
                                                    z04.c0("Currently unsupported COMMAND_EXT1 Command: " + i10);
                                                    s02Var3.t(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.m.b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i3 = i4;
                                i = i6;
                                i2 = i9;
                            } else if (i10 <= 127) {
                                if (i10 == 127) {
                                    this.m.a((char) 9835);
                                } else {
                                    this.m.a((char) (i10 & 255));
                                }
                                i3 = i4;
                                i = i6;
                                i2 = i9;
                                z3 = true;
                            } else {
                                if (i10 <= 159) {
                                    r02[] r02VarArr = this.l;
                                    switch (i10) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i = i6;
                                            z = true;
                                            int i11 = i10 - 128;
                                            if (this.q != i11) {
                                                this.q = i11;
                                                this.m = r02VarArr[i11];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            i = i6;
                                            z = true;
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (s02Var3.h()) {
                                                    r02 r02Var = r02VarArr[8 - i12];
                                                    r02Var.a.clear();
                                                    r02Var.b.clear();
                                                    r02Var.o = -1;
                                                    r02Var.p = -1;
                                                    r02Var.q = -1;
                                                    r02Var.s = -1;
                                                    r02Var.u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i = i6;
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (s02Var3.h()) {
                                                    r02VarArr[8 - i13].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            i = i6;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (s02Var3.h()) {
                                                    r02VarArr[8 - i14].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            i = i6;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (s02Var3.h()) {
                                                    r02VarArr[8 - i15].d = !r1.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            i = i6;
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (s02Var3.h()) {
                                                    r02VarArr[8 - i16].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            i = i6;
                                            s02Var3.t(8);
                                            z = true;
                                            break;
                                        case 142:
                                            i = i6;
                                            z = true;
                                            break;
                                        case 143:
                                            i = i6;
                                            l();
                                            z = true;
                                            break;
                                        case 144:
                                            if (!this.m.c) {
                                                s02Var3.t(16);
                                                i = 3;
                                                z = true;
                                                break;
                                            } else {
                                                s02Var3.i(4);
                                                s02Var3.i(2);
                                                s02Var3.i(2);
                                                boolean zH = s02Var3.h();
                                                boolean zH2 = s02Var3.h();
                                                i = 3;
                                                s02Var3.i(3);
                                                s02Var3.i(3);
                                                this.m.e(zH, zH2);
                                                z = true;
                                            }
                                        case 145:
                                            if (this.m.c) {
                                                int iC = r02.c(s02Var3.i(2), s02Var3.i(2), s02Var3.i(2), s02Var3.i(2));
                                                int iC2 = r02.c(s02Var3.i(2), s02Var3.i(2), s02Var3.i(2), s02Var3.i(2));
                                                s02Var3.t(2);
                                                r02.c(s02Var3.i(2), s02Var3.i(2), s02Var3.i(2), 0);
                                                this.m.f(iC, iC2);
                                            } else {
                                                s02Var3.t(24);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 146:
                                            if (this.m.c) {
                                                s02Var3.t(4);
                                                int i17 = s02Var3.i(4);
                                                s02Var3.t(2);
                                                s02Var3.i(6);
                                                r02 r02Var2 = this.m;
                                                if (r02Var2.u != i17) {
                                                    r02Var2.a('\n');
                                                }
                                                r02Var2.u = i17;
                                            } else {
                                                s02Var3.t(16);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            ey8.k(i10, "Invalid C1 command: ");
                                            i = i6;
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.m.c) {
                                                int iC3 = r02.c(s02Var3.i(2), s02Var3.i(2), s02Var3.i(2), s02Var3.i(2));
                                                s02Var3.i(2);
                                                r02.c(s02Var3.i(2), s02Var3.i(2), s02Var3.i(2), 0);
                                                s02Var3.h();
                                                s02Var3.h();
                                                s02Var3.i(2);
                                                s02Var3.i(2);
                                                int i18 = s02Var3.i(2);
                                                s02Var3.t(8);
                                                r02 r02Var3 = this.m;
                                                r02Var3.n = iC3;
                                                r02Var3.k = i18;
                                            } else {
                                                s02Var3.t(32);
                                            }
                                            i = 3;
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
                                            int i19 = i10 - 152;
                                            r02 r02Var4 = r02VarArr[i19];
                                            s02Var3.t(i4);
                                            boolean zH3 = s02Var3.h();
                                            s02Var3.t(i4);
                                            int i20 = s02Var3.i(i6);
                                            boolean zH4 = s02Var3.h();
                                            int i21 = s02Var3.i(i9);
                                            int i22 = s02Var3.i(8);
                                            int i23 = s02Var3.i(4);
                                            int i24 = s02Var3.i(4);
                                            s02Var3.t(i4);
                                            s02Var3.t(6);
                                            s02Var3.t(i4);
                                            int i25 = s02Var3.i(i6);
                                            int i26 = s02Var3.i(i6);
                                            r02Var4.c = true;
                                            r02Var4.d = zH3;
                                            r02Var4.e = i20;
                                            r02Var4.f = zH4;
                                            r02Var4.g = i21;
                                            r02Var4.h = i22;
                                            r02Var4.i = i23;
                                            int i27 = i24 + 1;
                                            if (r02Var4.j != i27) {
                                                r02Var4.j = i27;
                                                while (true) {
                                                    ArrayList arrayList = r02Var4.a;
                                                    if (arrayList.size() >= r02Var4.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i25 != 0 && r02Var4.l != i25) {
                                                r02Var4.l = i25;
                                                int i28 = i25 - 1;
                                                int i29 = r02.B[i28];
                                                boolean z4 = r02.A[i28];
                                                int i30 = r02.y[i28];
                                                int i31 = r02.z[i28];
                                                int i32 = r02.x[i28];
                                                r02Var4.n = i29;
                                                r02Var4.k = i32;
                                            }
                                            if (i26 != 0 && r02Var4.m != i26) {
                                                r02Var4.m = i26;
                                                int i33 = i26 - 1;
                                                int i34 = r02.D[i33];
                                                int i35 = r02.C[i33];
                                                r02Var4.e(false, false);
                                                r02Var4.f(r02.v, r02.E[i33]);
                                            }
                                            if (this.q != i19) {
                                                this.q = i19;
                                                this.m = r02VarArr[i19];
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                    }
                                } else {
                                    i = i6;
                                    z = true;
                                    if (i10 <= 255) {
                                        this.m.a((char) (i10 & 255));
                                    } else {
                                        ey8.k(i10, "Invalid base command: ");
                                        i3 = 2;
                                        i2 = 7;
                                    }
                                }
                                z3 = z;
                                i3 = 2;
                                i2 = 7;
                            }
                            z = true;
                        } else {
                            i = i6;
                            z = true;
                            int i36 = s02Var3.i(8);
                            if (i36 <= 31) {
                                i2 = 7;
                                if (i36 > 7) {
                                    if (i36 <= 15) {
                                        s02Var3.t(8);
                                    } else if (i36 <= 23) {
                                        s02Var3.t(16);
                                    } else if (i36 <= 31) {
                                        s02Var3.t(24);
                                    }
                                }
                            } else {
                                i2 = 7;
                                if (i36 <= 127) {
                                    if (i36 == 32) {
                                        this.m.a(' ');
                                    } else if (i36 == 33) {
                                        this.m.a((char) 160);
                                    } else if (i36 == 37) {
                                        this.m.a((char) 8230);
                                    } else if (i36 == 42) {
                                        this.m.a((char) 352);
                                    } else if (i36 == 44) {
                                        this.m.a((char) 338);
                                    } else if (i36 == 63) {
                                        this.m.a((char) 376);
                                    } else if (i36 == 57) {
                                        this.m.a((char) 8482);
                                    } else if (i36 == 58) {
                                        this.m.a((char) 353);
                                    } else if (i36 == 60) {
                                        this.m.a((char) 339);
                                    } else if (i36 != 61) {
                                        switch (i36) {
                                            case 48:
                                                this.m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.m.a((char) 8226);
                                                break;
                                            default:
                                                switch (i36) {
                                                    case 118:
                                                        this.m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.m.a((char) 9484);
                                                        break;
                                                    default:
                                                        ey8.k(i36, "Invalid G2 character: ");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.m.a((char) 8480);
                                    }
                                    z3 = true;
                                } else {
                                    if (i36 > 159) {
                                        i3 = 2;
                                        c = 6;
                                        if (i36 <= 255) {
                                            if (i36 == 160) {
                                                this.m.a((char) 13252);
                                            } else {
                                                ey8.k(i36, "Invalid G3 character: ");
                                                this.m.a('_');
                                            }
                                            z3 = true;
                                        } else {
                                            ey8.k(i36, "Invalid extended command: ");
                                        }
                                    } else if (i36 <= 135) {
                                        s02Var3.t(32);
                                    } else if (i36 <= 143) {
                                        s02Var3.t(40);
                                    } else if (i36 <= 159) {
                                        i3 = 2;
                                        s02Var3.t(2);
                                        c = 6;
                                        s02Var3.t(s02Var3.i(6) * 8);
                                    }
                                    i6 = i;
                                    i4 = i3;
                                    z2 = z;
                                    i9 = i2;
                                }
                            }
                            i3 = 2;
                        }
                        c = 6;
                        i6 = i;
                        i4 = i3;
                        z2 = z;
                        i9 = i2;
                    }
                }
            }
        }
        if (z3) {
            this.n = k();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u02.k():java.util.List");
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
