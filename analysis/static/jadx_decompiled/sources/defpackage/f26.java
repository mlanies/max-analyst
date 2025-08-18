package defpackage;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class f26 implements la5 {
    public static final byte[] U0 = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final qy5 V0;
    public ffc A0;
    public int B0;
    public int C0;
    public long D0;
    public int E0;
    public wpa F0;
    public long G0;
    public int H0;
    public long I0;
    public long J0;
    public long K0;
    public d26 L0;
    public int M0;
    public int N0;
    public int O0;
    public boolean P0;
    public pa5 Q0;
    public yze[] R0;
    public yze[] S0;
    public boolean T0;
    public final wpa X;
    public final wpa Y;
    public final wpa Z;
    public final mbe a;
    public final int b;
    public final List c;
    public final SparseArray o;
    public final byte[] s0;
    public final wpa t0;
    public final tue u0;
    public final ph4 v0;
    public final wpa w0;
    public final ArrayDeque x0;
    public final ArrayDeque y0;
    public final yze z0;

    static {
        ny5 ny5Var = new ny5();
        ny5Var.m = ia9.l("application/x-emsg");
        V0 = ny5Var.a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f26(int i, mbe mbeVar) {
        this(mbeVar, i, null, ffc.X, null);
        ls5 ls5Var = zw6.b;
    }

    public static dr4 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            ny nyVar = (ny) arrayList.get(i);
            if (nyVar.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = nyVar.c.a;
                tpb tpbVarY = mqd.y(bArr);
                UUID uuid = tpbVarY == null ? null : tpbVarY.a;
                if (uuid == null) {
                    z04.c0("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new br4(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new dr4(null, false, (br4[]) arrayList2.toArray(new br4[0]));
    }

    public static void b(wpa wpaVar, int i, pze pzeVar) throws ParserException {
        wpaVar.G(i + 8);
        int iG = wpaVar.g();
        if ((iG & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iG & 2) != 0;
        int iY = wpaVar.y();
        if (iY == 0) {
            Arrays.fill(pzeVar.k, 0, pzeVar.d, false);
            return;
        }
        if (iY != pzeVar.d) {
            StringBuilder sbN = rh4.n(iY, "Senc sample count ", " is different from fragment sample count");
            sbN.append(pzeVar.d);
            throw ParserException.a(null, sbN.toString());
        }
        Arrays.fill(pzeVar.k, 0, iY, z);
        int iA = wpaVar.a();
        wpa wpaVar2 = (wpa) pzeVar.q;
        wpaVar2.D(iA);
        pzeVar.j = true;
        pzeVar.l = true;
        wpaVar.e(0, wpaVar2.a, wpaVar2.c);
        wpaVar2.G(0);
        pzeVar.l = false;
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            pa5Var = new k8g(pa5Var, this.a);
        }
        this.Q0 = pa5Var;
        int i3 = 0;
        this.B0 = 0;
        this.E0 = 0;
        yze[] yzeVarArr = new yze[2];
        this.R0 = yzeVarArr;
        yze yzeVar = this.z0;
        if (yzeVar != null) {
            yzeVarArr[0] = yzeVar;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            yzeVarArr[i] = pa5Var.mo6B(100, 5);
            i4 = HttpStatus.SC_SWITCHING_PROTOCOLS;
            i++;
        }
        yze[] yzeVarArr2 = (yze[]) oaf.U(i, this.R0);
        this.R0 = yzeVarArr2;
        for (yze yzeVar2 : yzeVarArr2) {
            yzeVar2.e(V0);
        }
        List list = this.c;
        this.S0 = new yze[list.size()];
        while (i3 < this.S0.length) {
            yze yzeVarMo6B = this.Q0.mo6B(i4, 3);
            yzeVarMo6B.e((qy5) list.get(i3));
            this.S0[i3] = yzeVarMo6B;
            i3++;
            i4++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:347:0x07b6, code lost:
    
        r7 = r0;
        r7.B0 = 0;
        r7.E0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x07bc, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r52) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f26.c(long):void");
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.o;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((d26) sparseArray.valueAt(i)).d();
        }
        this.y0.clear();
        this.H0 = 0;
        this.I0 = j2;
        this.x0.clear();
        this.B0 = 0;
        this.E0 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f1, code lost:
    
        if (((r8 & 126) >> 1) != 39) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f3, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f6, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f7, code lost:
    
        r29.P0 = r2;
        r29.N0 += 5;
        r29.M0 += r4;
        r8 = r18;
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0208, code lost:
    
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0213, code lost:
    
        throw androidx.media3.common.ParserException.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0214, code lost:
    
        r21 = r5;
        r18 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021b, code lost:
    
        if (r29.P0 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021d, code lost:
    
        r8 = r29.Z;
        r8.D(r2);
        r22 = r4;
        r23 = r14;
        ((defpackage.sa4) r30).h(r8.a, 0, r29.O0, false);
        r11.b(r8, r29.O0, 0);
        r2 = r29.O0;
        r4 = defpackage.fm9.Q(r8.c, r8.a);
        r8.G("video/hevc".equals(r13.n) ? 1 : 0);
        r8.F(r4);
        defpackage.z04.q(r9, r8, r29.S0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0252, code lost:
    
        r22 = r4;
        r23 = r14;
        r2 = r11.c(r30, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x025b, code lost:
    
        r29.N0 += r2;
        r29.O0 -= r2;
        r8 = r18;
        r5 = r21;
        r4 = r22;
        r14 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x026e, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0271, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0273, code lost:
    
        r2 = r29.N0;
        r4 = r29.M0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0277, code lost:
    
        if (r2 >= r4) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0279, code lost:
    
        r29.N0 += r11.c(r30, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0287, code lost:
    
        if (r3.l != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0289, code lost:
    
        r1 = r3.d.g[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0298, code lost:
    
        if (r7.i[r3.f] == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x029a, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x029c, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a1, code lost:
    
        if (r3.a() == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a3, code lost:
    
        r1 = r1 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a6, code lost:
    
        r24 = r1;
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ac, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ae, code lost:
    
        r27 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b3, code lost:
    
        r27 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b5, code lost:
    
        r11.a(r9, r24, r29.M0, 0, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c6, code lost:
    
        if (r12.isEmpty() != false) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02c8, code lost:
    
        r1 = (defpackage.b26) r12.removeFirst();
        r29.H0 -= r1.c;
        r2 = r1.b;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d9, code lost:
    
        if (r2 == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02db, code lost:
    
        r4 = r4 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02dc, code lost:
    
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02de, code lost:
    
        if (r28 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e0, code lost:
    
        r4 = r2.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e4, code lost:
    
        r6 = r29.R0;
        r7 = r6.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e8, code lost:
    
        if (r8 >= r7) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ea, code lost:
    
        r6[r8].a(r4, 1, r1.c, r29.H0, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0300, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0307, code lost:
    
        if (r3.b() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0309, code lost:
    
        r29.L0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x030c, code lost:
    
        r29.B0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0310, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
    
        r4 = r29.B0;
        r7 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        if (r4 != 3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
    
        if (r3.l != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
    
        r4 = r3.d.d[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
    
        r4 = r7.g[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d0, code lost:
    
        r29.M0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        if (r3.f >= r3.i) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d8, code lost:
    
        ((defpackage.sa4) r30).z(r4);
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
    
        if (r1 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
    
        r2 = (defpackage.wpa) r7.q;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:
    
        if (r1 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ec, code lost:
    
        r2.H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
    
        r1 = r3.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f3, code lost:
    
        if (r7.j == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f9, code lost:
    
        if (r7.k[r1] == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fb, code lost:
    
        r2.H(r2.A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0107, code lost:
    
        if (r3.b() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0109, code lost:
    
        r29.L0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010c, code lost:
    
        r29.B0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0118, code lost:
    
        if (r3.d.a.g != r2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011a, code lost:
    
        r29.M0 = r4 - 8;
        ((defpackage.sa4) r30).z(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0133, code lost:
    
        if ("audio/ac4".equals(r3.d.a.f.n) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0135, code lost:
    
        r29.N0 = r3.c(r29.M0, 7);
        r4 = r29.M0;
        r9 = r29.t0;
        defpackage.nu0.k(r4, r9);
        r3.a.b(r9, 7, 0);
        r29.N0 += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0150, code lost:
    
        r29.N0 = r3.c(r29.M0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0158, code lost:
    
        r29.M0 += r29.N0;
        r29.B0 = 4;
        r29.O0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
    
        r4 = r3.d;
        r8 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016a, code lost:
    
        if (r3.l != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016c, code lost:
    
        r9 = r4.f[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0173, code lost:
    
        r9 = r7.h[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0179, code lost:
    
        if (r13 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017b, code lost:
    
        r9 = r13.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017f, code lost:
    
        r4 = r8.j;
        r11 = r3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0183, code lost:
    
        if (r4 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0185, code lost:
    
        r14 = r29.Y;
        r15 = r14.a;
        r15[0] = 0;
        r15[r2] = 0;
        r15[2] = 0;
        r5 = r4 + 1;
        r4 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019b, code lost:
    
        if (r29.N0 >= r29.M0) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        r2 = r29.O0;
        r28 = r13;
        r13 = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a5, code lost:
    
        if (r2 != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a7, code lost:
    
        r18 = r8;
        ((defpackage.sa4) r30).h(r15, r4, r5, false);
        r14.G(0);
        r2 = r14.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b8, code lost:
    
        if (r2 < 1) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ba, code lost:
    
        r29.O0 = r2 - 1;
        r2 = r29.X;
        r2.G(0);
        r21 = r5;
        r11.b(r2, 4, 0);
        r11.b(r14, 1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d0, code lost:
    
        if (r29.S0.length <= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d2, code lost:
    
        r2 = r13.n;
        r8 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        if ("video/avc".equals(r2) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e1, code lost:
    
        if ((r8 & 31) == 6) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e9, code lost:
    
        if ("video/hevc".equals(r2) == false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.la5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.na5 r30, defpackage.lh4 r31) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f26.g(na5, lh4):int");
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) {
        ffc ffcVarN;
        iud iudVarW = mr0.W(na5Var, true, false);
        if (iudVarW != null) {
            ffcVarN = zw6.n(iudVarW);
        } else {
            ls5 ls5Var = zw6.b;
            ffcVarN = ffc.X;
        }
        this.A0 = ffcVarN;
        return iudVarW == null;
    }

    @Override // defpackage.la5
    public final List o() {
        return this.A0;
    }

    @Override // defpackage.la5
    public final void release() {
    }

    public f26(mbe mbeVar, int i, tue tueVar, List list, yze yzeVar) {
        this.a = mbeVar;
        this.b = i;
        this.u0 = tueVar;
        this.c = Collections.unmodifiableList(list);
        this.z0 = yzeVar;
        this.v0 = new ph4(18);
        this.w0 = new wpa(16);
        this.X = new wpa(fm9.e);
        this.Y = new wpa(5);
        this.Z = new wpa();
        byte[] bArr = new byte[16];
        this.s0 = bArr;
        this.t0 = new wpa(bArr);
        this.x0 = new ArrayDeque();
        this.y0 = new ArrayDeque();
        this.o = new SparseArray();
        ls5 ls5Var = zw6.b;
        this.A0 = ffc.X;
        this.J0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        this.Q0 = pa5.v;
        this.R0 = new yze[0];
        this.S0 = new yze[0];
    }
}
