package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class wd9 implements la5, v1d {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public boolean E0;
    public pa5 F0;
    public ud9[] G0;
    public long[][] H0;
    public int I0;
    public long J0;
    public int K0;
    public vc9 L0;
    public final wpa X;
    public final wpa Y;
    public final ArrayDeque Z;
    public final mbe a;
    public final int b;
    public final wpa c;
    public final wpa o;
    public final h2d s0;
    public final ArrayList t0;
    public ffc u0;
    public int v0;
    public int w0;
    public long x0;
    public int y0;
    public wpa z0;

    public wd9(int i, mbe mbeVar) {
        this.a = mbeVar;
        this.b = i;
        ls5 ls5Var = zw6.b;
        this.u0 = ffc.X;
        this.v0 = (i & 4) != 0 ? 3 : 0;
        this.s0 = new h2d();
        this.t0 = new ArrayList();
        this.Y = new wpa(16);
        this.Z = new ArrayDeque();
        this.c = new wpa(fm9.e);
        this.o = new wpa(4);
        this.X = new wpa();
        this.A0 = -1;
        this.F0 = pa5.v;
        this.G0 = new ud9[0];
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        if ((this.b & 16) == 0) {
            pa5Var = new k8g(pa5Var, this.a);
        }
        this.F0 = pa5Var;
    }

    @Override // defpackage.v1d
    public final boolean c() {
        return true;
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        this.Z.clear();
        this.y0 = 0;
        this.A0 = -1;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        if (j == 0) {
            if (this.v0 != 3) {
                this.v0 = 0;
                this.y0 = 0;
                return;
            } else {
                h2d h2dVar = this.s0;
                h2dVar.a.clear();
                h2dVar.b = 0;
                this.t0.clear();
                return;
            }
        }
        for (ud9 ud9Var : this.G0) {
            a0f a0fVar = ud9Var.b;
            int iF = oaf.f(a0fVar.f, j2, false);
            while (true) {
                if (iF < 0) {
                    iF = -1;
                    break;
                } else if ((a0fVar.g[iF] & 1) != 0) {
                    break;
                } else {
                    iF--;
                }
            }
            if (iF == -1) {
                iF = a0fVar.a(j2);
            }
            ud9Var.e = iF;
            b3f b3fVar = ud9Var.d;
            if (b3fVar != null) {
                b3fVar.b = false;
                b3fVar.c = 0;
            }
        }
    }

    @Override // defpackage.v1d
    public final t1d e(long j) {
        return i(-1, j);
    }

    @Override // defpackage.v1d
    public final long f() {
        return this.J0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:370:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
    @Override // defpackage.la5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.na5 r39, defpackage.lh4 r40) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd9.g(na5, lh4):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.t1d i(int r21, long r22) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd9.i(int, long):t1d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d9, code lost:
    
        r4 = r12.q(r28 - 12);
        r31 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e5, code lost:
    
        r31 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ec, code lost:
    
        if (r1 != 1851878757) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ee, code lost:
    
        r2 = r12.q(r28 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f9, code lost:
    
        if (r1 != 1684108385) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fb, code lost:
    
        r14 = r28;
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ff, code lost:
    
        r12.H(r28 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0204, code lost:
    
        r7 = r30;
        r8 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0209, code lost:
    
        r30 = r7;
        r31 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x020d, code lost:
    
        if (r4 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020f, code lost:
    
        if (r2 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0212, code lost:
    
        if (r3 != (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0215, code lost:
    
        r12.G(r3);
        r12.H(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0227, code lost:
    
        r4 = new defpackage.v37(r4, r2, r12.q(r14 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x022a, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x022b, code lost:
    
        r12.G(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0230, code lost:
    
        r30 = r7;
        r31 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0237, code lost:
    
        r3 = 16777215 & r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x023e, code lost:
    
        if (r3 != 6516084) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0240, code lost:
    
        r4 = defpackage.pag.z(r4, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0248, code lost:
    
        if (r3 == 7233901) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x024d, code lost:
    
        if (r3 != 7631467) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0254, code lost:
    
        if (r3 == 6516589) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0259, code lost:
    
        if (r3 != 7828084) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0260, code lost:
    
        if (r3 != 6578553) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0262, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x026c, code lost:
    
        if (r3 != 4280916) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x026e, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0278, code lost:
    
        if (r3 != 7630703) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x027a, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0284, code lost:
    
        if (r3 != 6384738) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0286, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0290, code lost:
    
        if (r3 != 7108978) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0292, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x029c, code lost:
    
        if (r3 != 6776174) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x029e, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a6, code lost:
    
        if (r3 != 6779504) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a8, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02b0, code lost:
    
        defpackage.z04.t("Skipped unknown metadata entry: " + defpackage.oy.e(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c3, code lost:
    
        r12.G(r13);
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02c8, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02d0, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02d8, code lost:
    
        if (r4 == null) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02da, code lost:
    
        r6.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02dd, code lost:
    
        r7 = r30;
        r8 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02eb, code lost:
    
        r12.G(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ee, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02ef, code lost:
    
        r31 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f6, code lost:
    
        if (r6.isEmpty() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02f9, code lost:
    
        r4 = new defpackage.f99(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0345, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        r12.G(r7);
        r7 = r7 + r14;
        r12.H(r3);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        r13 = r12.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (r13 >= r7) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        r13 = r12.g() + r13;
        r4 = r12.g();
        r3 = (r4 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        if (r3 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        if (r3 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        r30 = r7;
        r31 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        if (r4 != 1735291493) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        r1 = defpackage.et6.a(defpackage.pag.C(r12) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        if (r1 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        r3 = new defpackage.jpe("TCON", null, defpackage.zw6.n(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
    
        defpackage.z04.c0("Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        r12.G(r13);
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ed, code lost:
    
        r30 = r7;
        r31 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f8, code lost:
    
        if (r4 != 1684632427) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
    
        r4 = defpackage.pag.B(r4, r12, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
    
        r12.G(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010a, code lost:
    
        if (r4 != 1953655662) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010c, code lost:
    
        r4 = defpackage.pag.B(r4, r12, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0116, code lost:
    
        if (r4 != 1953329263) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0118, code lost:
    
        r4 = defpackage.pag.D(r4, "TBPM", r12, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0124, code lost:
    
        if (r4 != 1668311404) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0126, code lost:
    
        r4 = defpackage.pag.D(r4, "TCMP", r12, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
    
        if (r4 != 1668249202) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0133, code lost:
    
        r4 = defpackage.pag.A(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013b, code lost:
    
        if (r4 != 1631670868) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013d, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0147, code lost:
    
        if (r4 != 1936682605) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0149, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0153, code lost:
    
        if (r4 != 1936679276) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0155, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015f, code lost:
    
        if (r4 != 1936679282) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0161, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016b, code lost:
    
        if (r4 != 1936679265) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016d, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0177, code lost:
    
        if (r4 != 1936679791) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0179, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0183, code lost:
    
        if (r4 != 1920233063) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0185, code lost:
    
        r4 = defpackage.pag.D(r4, "ITUNESADVISORY", r12, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0191, code lost:
    
        if (r4 != 1885823344) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0193, code lost:
    
        r4 = defpackage.pag.D(r4, "ITUNESGAPLESS", r12, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a0, code lost:
    
        if (r4 != 1936683886) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a2, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ad, code lost:
    
        if (r4 != 1953919848) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01af, code lost:
    
        r4 = defpackage.pag.E(r4, r12, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ba, code lost:
    
        if (r4 != 757935405) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bc, code lost:
    
        r2 = null;
        r4 = null;
        r3 = -1;
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c0, code lost:
    
        r1 = r12.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c2, code lost:
    
        if (r1 >= r13) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c4, code lost:
    
        r28 = r12.g();
        r1 = r12.g();
        r30 = r7;
        r12.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d7, code lost:
    
        if (r1 != 1835360622) goto L101;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:202:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06d3 A[LOOP:13: B:342:0x06d0->B:344:0x06d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(long r35) {
        /*
            Method dump skipped, instructions count: 1904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd9.j(long):void");
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) {
        ffc ffcVarN;
        iud iudVarW = mr0.W(na5Var, false, (this.b & 2) != 0);
        if (iudVarW != null) {
            ffcVarN = zw6.n(iudVarW);
        } else {
            ls5 ls5Var = zw6.b;
            ffcVarN = ffc.X;
        }
        this.u0 = ffcVarN;
        return iudVarW == null;
    }

    @Override // defpackage.la5
    public final List o() {
        return this.u0;
    }

    @Override // defpackage.la5
    public final void release() {
    }
}
