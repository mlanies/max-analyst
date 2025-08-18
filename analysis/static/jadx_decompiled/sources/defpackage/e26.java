package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class e26 implements ka5 {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final oy5 I;
    public int A;
    public int B;
    public boolean C;
    public boolean G;
    public final int a;
    public final List b;
    public final byte[] g;
    public final yaf h;
    public final sue i;
    public final xze n;
    public int o;
    public int p;
    public long q;
    public int r;
    public yaf s;
    public long t;
    public int u;
    public c26 y;
    public int z;
    public final y7g j = new y7g(16);
    public final yaf k = new yaf(16);
    public final yaf d = new yaf(np8.b);
    public final yaf e = new yaf(5);
    public final yaf f = new yaf(3, false);
    public final ArrayDeque l = new ArrayDeque();
    public final ArrayDeque m = new ArrayDeque();
    public final SparseArray c = new SparseArray();
    public long w = -9223372036854775807L;
    public long v = -9223372036854775807L;
    public long x = -9223372036854775807L;
    public oa5 D = oa5.u;
    public xze[] E = new xze[0];
    public xze[] F = new xze[0];

    static {
        my5 my5Var = new my5();
        my5Var.k = "application/x-emsg";
        I = my5Var.a();
    }

    public e26(int i, sue sueVar, List list, xze xzeVar) {
        this.a = i;
        this.i = sueVar;
        this.b = Collections.unmodifiableList(list);
        this.n = xzeVar;
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new yaf(bArr);
    }

    public static cr4 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            my myVar = (my) arrayList.get(i);
            if (myVar.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = myVar.c.a;
                tpb tpbVarA = wmd.A(bArr);
                UUID uuid = tpbVarA == null ? null : tpbVarA.a;
                if (uuid != null) {
                    arrayList2.add(new ar4(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new cr4(null, false, (ar4[]) arrayList2.toArray(new ar4[0]));
    }

    public static void b(yaf yafVar, int i, pze pzeVar) throws ParserException {
        yafVar.H(i + 8);
        int iH = yafVar.h();
        if ((iH & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iH & 2) != 0;
        int iY = yafVar.y();
        if (iY == 0) {
            Arrays.fill(pzeVar.k, 0, pzeVar.d, false);
            return;
        }
        int i2 = pzeVar.d;
        if (iY != i2) {
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(iY);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw ParserException.a(null, sb.toString());
        }
        Arrays.fill(pzeVar.k, 0, iY, z);
        int iC = yafVar.c();
        yaf yafVar2 = (yaf) pzeVar.q;
        yafVar2.E(iC);
        pzeVar.j = true;
        pzeVar.l = true;
        yafVar.g(0, yafVar2.a, yafVar2.c);
        yafVar2.H(0);
        pzeVar.l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:340:0x07bd, code lost:
    
        r4 = r0;
        r4.o = 0;
        r4.r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x07c3, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r51) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e26.c(long):void");
    }

    @Override // defpackage.ka5
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.c;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((c26) sparseArray.valueAt(i)).d();
        }
        this.m.clear();
        this.u = 0;
        this.v = j2;
        this.l.clear();
        this.o = 0;
        this.r = 0;
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        int i;
        this.D = oa5Var;
        int i2 = 0;
        this.o = 0;
        this.r = 0;
        xze[] xzeVarArr = new xze[2];
        this.E = xzeVarArr;
        xze xzeVar = this.n;
        if (xzeVar != null) {
            xzeVarArr[0] = xzeVar;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.a & 4) != 0) {
            xzeVarArr[i] = oa5Var.B(100, 5);
            i3 = HttpStatus.SC_SWITCHING_PROTOCOLS;
            i++;
        }
        xze[] xzeVarArr2 = (xze[]) maf.F(i, this.E);
        this.E = xzeVarArr2;
        for (xze xzeVar2 : xzeVarArr2) {
            xzeVar2.d(I);
        }
        List list = this.b;
        this.F = new xze[list.size()];
        while (i2 < this.F.length) {
            xze xzeVarB = this.D.B(i3, 3);
            xzeVarB.d((oy5) list.get(i2));
            this.F[i2] = xzeVarB;
            i2++;
            i3++;
        }
    }

    @Override // defpackage.ka5
    public final boolean h(ma5 ma5Var) {
        return ju0.H(ma5Var, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f4, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f6, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
    
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fb, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fc, code lost:
    
        r35.C = r4;
        r35.A += 5;
        r35.z += r3;
        r7 = r18;
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020d, code lost:
    
        r13 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0218, code lost:
    
        throw com.google.android.exoplayer2.ParserException.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0219, code lost:
    
        r18 = r7;
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0220, code lost:
    
        if (r35.C == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0222, code lost:
    
        r7 = r35.f;
        r7.E(r4);
        r21 = r3;
        r22 = r14;
        ((defpackage.ra4) r36).h(r7.a, 0, r35.B, false);
        r11.c(r35.B, r7);
        r3 = r35.B;
        r4 = defpackage.np8.O(r7.c, r7.a);
        r7.H("video/hevc".equals(r13.w0) ? 1 : 0);
        r7.G(r4);
        defpackage.fp3.r(r8, r7, r35.F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0257, code lost:
    
        r21 = r3;
        r22 = r14;
        r3 = r11.a(r36, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0261, code lost:
    
        r35.A += r3;
        r35.B -= r3;
        r7 = r18;
        r10 = r20;
        r3 = r21;
        r14 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0274, code lost:
    
        r27 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0277, code lost:
    
        r27 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0279, code lost:
    
        r3 = r35.A;
        r4 = r35.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x027d, code lost:
    
        if (r3 >= r4) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027f, code lost:
    
        r35.A += r11.a(r36, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x028d, code lost:
    
        if (r2.l != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x028f, code lost:
    
        r6 = r2.d.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x029e, code lost:
    
        if (r6.i[r2.f] == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a0, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a2, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a7, code lost:
    
        if (r2.a() == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a9, code lost:
    
        r23 = 1073741824 | r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02af, code lost:
    
        r23 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02b1, code lost:
    
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b5, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b7, code lost:
    
        r26 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02bc, code lost:
    
        r26 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02be, code lost:
    
        r11.b(r8, r23, r35.z, 0, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02cf, code lost:
    
        if (r12.isEmpty() != false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d1, code lost:
    
        r1 = (defpackage.a26) r12.removeFirst();
        r35.u -= r1.c;
        r3 = r1.b;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e2, code lost:
    
        if (r3 == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e4, code lost:
    
        r4 = r4 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e5, code lost:
    
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e7, code lost:
    
        if (r27 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e9, code lost:
    
        r4 = r6.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02ed, code lost:
    
        r3 = r35.E;
        r7 = r3.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f1, code lost:
    
        if (r10 >= r7) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f3, code lost:
    
        r3[r10].b(r4, 1, r1.c, r35.u, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0309, code lost:
    
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0310, code lost:
    
        if (r2.b() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0312, code lost:
    
        r35.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0315, code lost:
    
        r35.o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0319, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        r3 = r35.o;
        r6 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (r3 != 3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
    
        if (r2.l != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
    
        r3 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
    
        r3 = r6.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
    
        r35.z = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        if (r2.f >= r2.i) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        ((defpackage.ra4) r36).z(r3);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
    
        if (r1 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        r3 = (defpackage.yaf) r6.q;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
    
        if (r1 == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:
    
        r3.I(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ed, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f1, code lost:
    
        if (r6.j == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f7, code lost:
    
        if (r6.k[r1] == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f9, code lost:
    
        r3.I(r3.A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0105, code lost:
    
        if (r2.b() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0107, code lost:
    
        r35.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0109, code lost:
    
        r35.o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0116, code lost:
    
        if (r2.d.a.g != 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0118, code lost:
    
        r35.z = r3 - 8;
        ((defpackage.ra4) r36).z(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0131, code lost:
    
        if ("audio/ac4".equals(r2.d.a.f.w0) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0133, code lost:
    
        r35.A = r2.c(r35.z, 7);
        r3 = r35.z;
        r8 = r35.h;
        defpackage.ju0.o(r3, r8);
        r2.a.c(7, r8);
        r35.A += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
    
        r35.A = r2.c(r35.z, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0156, code lost:
    
        r35.z += r35.A;
        r35.o = 4;
        r35.B = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0162, code lost:
    
        r3 = r2.d;
        r7 = r3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0168, code lost:
    
        if (r2.l != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016a, code lost:
    
        r8 = r3.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0171, code lost:
    
        r8 = r6.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0177, code lost:
    
        if (r13 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0179, code lost:
    
        r8 = r13.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017d, code lost:
    
        r3 = r7.j;
        r11 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0181, code lost:
    
        if (r3 == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0183, code lost:
    
        r14 = r35.e;
        r15 = r14.a;
        r15[0] = 0;
        r15[1] = 0;
        r15[2] = 0;
        r10 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019b, code lost:
    
        if (r35.A >= r35.z) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019d, code lost:
    
        r4 = r35.B;
        r27 = r13;
        r13 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a5, code lost:
    
        if (r4 != 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a7, code lost:
    
        r18 = r7;
        ((defpackage.ra4) r36).h(r15, r3, r10, false);
        r14.H(0);
        r4 = r14.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        if (r4 < 1) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ba, code lost:
    
        r35.B = r4 - 1;
        r4 = r35.d;
        r4.H(0);
        r11.c(4, r4);
        r11.c(1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cf, code lost:
    
        if (r35.F.length <= 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d1, code lost:
    
        r4 = r13.w0;
        r13 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01db, code lost:
    
        if ("video/avc".equals(r4) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dd, code lost:
    
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
    
        if ((r13 & 31) == 6) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e5, code lost:
    
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ec, code lost:
    
        if ("video/hevc".equals(r4) == false) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ka5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.ma5 r36, defpackage.lh4 r37) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e26.i(ma5, lh4):int");
    }

    @Override // defpackage.ka5
    public final void release() {
    }
}
