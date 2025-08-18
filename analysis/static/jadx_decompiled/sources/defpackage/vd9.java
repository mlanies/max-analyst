package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vd9 implements ka5, u1d {
    public int i;
    public long j;
    public int k;
    public yaf l;
    public int n;
    public int o;
    public int p;
    public oa5 q;
    public td9[] r;
    public long[][] s;
    public int t;
    public long u;
    public int v;
    public int h = 0;
    public final g2d f = new g2d();
    public final ArrayList g = new ArrayList();
    public final yaf d = new yaf(16);
    public final ArrayDeque e = new ArrayDeque();
    public final yaf a = new yaf(np8.b);
    public final yaf b = new yaf(4);
    public final yaf c = new yaf(3, false);
    public int m = -1;

    @Override // defpackage.u1d
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ka5
    public final void d(long j, long j2) {
        this.e.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j == 0) {
            if (this.h != 3) {
                this.h = 0;
                this.k = 0;
                return;
            } else {
                g2d g2dVar = this.f;
                g2dVar.a.clear();
                g2dVar.b = 0;
                this.g.clear();
                return;
            }
        }
        td9[] td9VarArr = this.r;
        if (td9VarArr != null) {
            for (td9 td9Var : td9VarArr) {
                zze zzeVar = td9Var.b;
                int iF = maf.f(zzeVar.f, j2, false);
                while (true) {
                    if (iF < 0) {
                        iF = -1;
                        break;
                    } else if ((zzeVar.g[iF] & 1) != 0) {
                        break;
                    } else {
                        iF--;
                    }
                }
                if (iF == -1) {
                    iF = zzeVar.a(j2);
                }
                td9Var.e = iF;
                b3f b3fVar = td9Var.d;
                if (b3fVar != null) {
                    b3fVar.b = false;
                    b3fVar.c = 0;
                }
            }
        }
    }

    @Override // defpackage.u1d
    public final s1d e(long j) {
        long j2;
        long j3;
        long jMin;
        long j4;
        boolean z;
        int[] iArr;
        long j5;
        int iA;
        vd9 vd9Var = this;
        long j6 = j;
        td9[] td9VarArr = vd9Var.r;
        td9VarArr.getClass();
        int length = td9VarArr.length;
        y1d y1dVar = y1d.c;
        if (length == 0) {
            return new s1d(y1dVar, y1dVar);
        }
        int i = vd9Var.t;
        boolean z2 = false;
        if (i != -1) {
            zze zzeVar = vd9Var.r[i].b;
            int iF = maf.f(zzeVar.f, j6, false);
            while (true) {
                if (iF < 0) {
                    iF = -1;
                    break;
                }
                if ((zzeVar.g[iF] & 1) != 0) {
                    break;
                }
                iF--;
            }
            if (iF == -1) {
                iF = zzeVar.a(j6);
            }
            if (iF == -1) {
                return new s1d(y1dVar, y1dVar);
            }
            long[] jArr = zzeVar.f;
            long j7 = jArr[iF];
            long[] jArr2 = zzeVar.c;
            j2 = jArr2[iF];
            if (j7 >= j6 || iF >= zzeVar.b - 1 || (iA = zzeVar.a(j6)) == -1 || iA == iF) {
                j5 = -9223372036854775807L;
                jMin = -1;
            } else {
                j5 = jArr[iA];
                jMin = jArr2[iA];
            }
            j3 = j5;
            j6 = j7;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
            jMin = -1;
        }
        int i2 = 0;
        long jMin2 = j2;
        while (true) {
            td9[] td9VarArr2 = vd9Var.r;
            if (i2 >= td9VarArr2.length) {
                break;
            }
            if (i2 != vd9Var.t) {
                zze zzeVar2 = td9VarArr2[i2].b;
                int iF2 = maf.f(zzeVar2.f, j6, z2);
                while (true) {
                    iArr = zzeVar2.g;
                    if (iF2 < 0) {
                        iF2 = -1;
                        break;
                    }
                    if ((iArr[iF2] & 1) != 0) {
                        break;
                    }
                    iF2--;
                }
                if (iF2 == -1) {
                    iF2 = zzeVar2.a(j6);
                }
                long[] jArr3 = zzeVar2.c;
                if (iF2 == -1) {
                    j4 = j6;
                } else {
                    j4 = j6;
                    jMin2 = Math.min(jArr3[iF2], jMin2);
                }
                if (j3 != -9223372036854775807L) {
                    z = false;
                    int iF3 = maf.f(zzeVar2.f, j3, false);
                    while (true) {
                        if (iF3 < 0) {
                            iF3 = -1;
                            break;
                        }
                        if ((iArr[iF3] & 1) != 0) {
                            break;
                        }
                        iF3--;
                    }
                    if (iF3 == -1) {
                        iF3 = zzeVar2.a(j3);
                    }
                    if (iF3 != -1) {
                        jMin = Math.min(jArr3[iF3], jMin);
                    }
                } else {
                    z = false;
                }
            } else {
                j4 = j6;
                z = z2;
            }
            i2++;
            vd9Var = this;
            z2 = z;
            j6 = j4;
        }
        y1d y1dVar2 = new y1d(j6, jMin2);
        return j3 == -9223372036854775807L ? new s1d(y1dVar2, y1dVar2) : new s1d(y1dVar2, new y1d(j3, jMin));
    }

    @Override // defpackage.u1d
    public final long f() {
        return this.u;
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        this.q = oa5Var;
    }

    @Override // defpackage.ka5
    public final boolean h(ma5 ma5Var) {
        return ju0.H(ma5Var, false, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0466, code lost:
    
        r3 = r10;
        r9 = r36.k;
        r10 = r36.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x046e, code lost:
    
        if (r9 != 0) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0477, code lost:
    
        if (r37.h(r10.a, 0, 8, r3) != false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0479, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x047b, code lost:
    
        r36.k = 8;
        r10.H(0);
        r36.j = r10.w();
        r36.i = r10.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x048f, code lost:
    
        r13 = r36.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0495, code lost:
    
        if (r13 != 1) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0497, code lost:
    
        r37.readFully(r10.a, 8, 8);
        r36.k += 8;
        r36.j = r10.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04ac, code lost:
    
        if (r13 != 0) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04ae, code lost:
    
        r13 = r37.x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04b4, code lost:
    
        if (r13 != (-1)) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04b6, code lost:
    
        r9 = (defpackage.ky) r12.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04bc, code lost:
    
        if (r9 == null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04be, code lost:
    
        r13 = r9.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04c2, code lost:
    
        if (r13 == (-1)) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04c4, code lost:
    
        r36.j = (r13 - r37.e()) + r36.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04cf, code lost:
    
        r3 = r36.j;
        r9 = r36.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04d6, code lost:
    
        if (r3 < r9) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04d8, code lost:
    
        r3 = r36.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04e3, code lost:
    
        if (r3 == 1836019574) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04e8, code lost:
    
        if (r3 == 1953653099) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04ed, code lost:
    
        if (r3 == 1835297121) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04f2, code lost:
    
        if (r3 == 1835626086) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04f7, code lost:
    
        if (r3 == 1937007212) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04fc, code lost:
    
        if (r3 == 1701082227) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x04fe, code lost:
    
        if (r3 != 1835365473) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0506, code lost:
    
        if (r3 == 1835296868) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x050b, code lost:
    
        if (r3 == 1836476516) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x050d, code lost:
    
        if (r3 == 1751411826) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0512, code lost:
    
        if (r3 == 1937011556) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0517, code lost:
    
        if (r3 == 1937011827) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x051c, code lost:
    
        if (r3 == 1937011571) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0521, code lost:
    
        if (r3 == 1668576371) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0526, code lost:
    
        if (r3 == 1701606260) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x052b, code lost:
    
        if (r3 == 1937011555) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0530, code lost:
    
        if (r3 == 1937011578) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0535, code lost:
    
        if (r3 == 1937013298) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x053a, code lost:
    
        if (r3 == 1937007471) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x053f, code lost:
    
        if (r3 == 1668232756) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0544, code lost:
    
        if (r3 == 1953196132) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0549, code lost:
    
        if (r3 == 1718909296) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x054e, code lost:
    
        if (r3 == 1969517665) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0553, code lost:
    
        if (r3 == 1801812339) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0558, code lost:
    
        if (r3 != 1768715124) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x055b, code lost:
    
        r3 = r37.e();
        r9 = r36.k;
        r28 = r3 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0569, code lost:
    
        if (r36.i != 1836086884) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x056b, code lost:
    
        new defpackage.uc9(0, r28, -9223372036854775807L, r28 + r9, r36.j - r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x057d, code lost:
    
        r36.l = null;
        r36.h = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0583, code lost:
    
        r3 = 0;
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0587, code lost:
    
        if (r9 != 8) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0589, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x058b, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x058c, code lost:
    
        defpackage.np8.f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0596, code lost:
    
        if (r36.j > 2147483647L) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0598, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x059a, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x059b, code lost:
    
        defpackage.np8.f(r3);
        r3 = new defpackage.yaf((int) r36.j);
        java.lang.System.arraycopy(r10.a, 0, r3.a, 0, 8);
        r36.l = r3;
        r36.h = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x05b4, code lost:
    
        r9 = r37.e();
        r11 = r36.j;
        r4 = r36.k;
        r9 = (r9 + r11) - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x05c2, code lost:
    
        if (r11 == r4) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x05c6, code lost:
    
        if (r36.i != 1835365473) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x05c8, code lost:
    
        r14.E(8);
        r37.l(0, r14.a, 8);
        r3 = defpackage.vy.a;
        r3 = r14.b;
        r4 = 4;
        r14.I(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x05e0, code lost:
    
        if (r14.h() == 1751411826) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x05e2, code lost:
    
        r3 = r3 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x05e3, code lost:
    
        r14.H(r3);
        r37.z(r14.b);
        r37.y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x05ef, code lost:
    
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x05f0, code lost:
    
        r12.push(new defpackage.ky(r36.i, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0602, code lost:
    
        if (r36.j != r36.k) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0604, code lost:
    
        j(r9);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0609, code lost:
    
        r3 = 0;
        r36.h = 0;
        r36.k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x061a, code lost:
    
        throw com.google.android.exoplayer2.ParserException.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x045f  */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v20 */
    @Override // defpackage.ka5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.ma5 r37, defpackage.lh4 r38) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd9.i(ma5, lh4):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c8, code lost:
    
        if (r5 != 1936679791) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ca, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d5, code lost:
    
        if (r5 != 1920233063) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d7, code lost:
    
        r5 = defpackage.nd7.N(r5, "ITUNESADVISORY", r10, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e3, code lost:
    
        if (r5 != 1885823344) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e5, code lost:
    
        r5 = defpackage.nd7.N(r5, "ITUNESGAPLESS", r10, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f2, code lost:
    
        if (r5 != 1936683886) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f4, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ff, code lost:
    
        if (r5 != 1953919848) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0201, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020c, code lost:
    
        if (r5 != 757935405) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x020e, code lost:
    
        r5 = null;
        r12 = null;
        r8 = -1;
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0212, code lost:
    
        r1 = r10.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0214, code lost:
    
        if (r1 >= r11) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0216, code lost:
    
        r18 = r10.h();
        r1 = r10.h();
        r27 = r4;
        r10.I(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0229, code lost:
    
        if (r1 != 1835360622) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x022b, code lost:
    
        r12 = r10.r(r18 - 12);
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0237, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x023e, code lost:
    
        if (r1 != 1851878757) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0240, code lost:
    
        r5 = r10.r(r18 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x024b, code lost:
    
        if (r1 != 1684108385) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x024d, code lost:
    
        r13 = r18;
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0251, code lost:
    
        r10.I(r18 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0256, code lost:
    
        r4 = r27;
        r6 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x025b, code lost:
    
        r27 = r4;
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x025f, code lost:
    
        if (r12 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0261, code lost:
    
        if (r5 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0264, code lost:
    
        if (r8 != (-1)) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0267, code lost:
    
        r10.H(r8);
        r10.I(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0279, code lost:
    
        r12 = new defpackage.u37(r12, r5, r10.r(r13 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x027b, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x027c, code lost:
    
        r10.H(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0281, code lost:
    
        r27 = r4;
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0287, code lost:
    
        r1 = r5 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x028c, code lost:
    
        if (r1 != 6516084) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x028e, code lost:
    
        r1 = r10.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0299, code lost:
    
        if (r10.h() != 1684108385) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x029b, code lost:
    
        r10.I(8);
        r1 = r10.r(r1 - 16);
        r12 = new defpackage.g73("und", r1, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02af, code lost:
    
        r1 = java.lang.String.valueOf(defpackage.oy.d(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02bb, code lost:
    
        if (r1.length() == 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02bd, code lost:
    
        "Failed to parse comment attribute: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02c6, code lost:
    
        if (r1 == 7233901) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02cb, code lost:
    
        if (r1 != 7631467) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02d2, code lost:
    
        if (r1 == 6516589) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02d7, code lost:
    
        if (r1 != 7828084) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02de, code lost:
    
        if (r1 != 6578553) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02e0, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02ea, code lost:
    
        if (r1 != 4280916) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ec, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f6, code lost:
    
        if (r1 != 7630703) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02f8, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0303, code lost:
    
        if (r1 != 6384738) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0305, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0310, code lost:
    
        if (r1 != 7108978) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0312, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x031d, code lost:
    
        if (r1 != 6776174) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x031f, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0328, code lost:
    
        if (r1 != 6779504) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x032a, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0332, code lost:
    
        r4 = java.lang.String.valueOf(defpackage.oy.d(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0340, code lost:
    
        if (r4.length() == 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0342, code lost:
    
        "Skipped unknown metadata entry: ".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0345, code lost:
    
        r10.H(r11);
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x034a, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0352, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x035a, code lost:
    
        if (r12 == null) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x035c, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x035f, code lost:
    
        r4 = r27;
        r6 = r28;
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x036b, code lost:
    
        r10.H(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x036e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x036f, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0375, code lost:
    
        if (r3.isEmpty() == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0377, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0379, code lost:
    
        r12 = new defpackage.e99(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x037e, code lost:
    
        r18 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r10.H(r4);
        r4 = r4 + r5;
        r10.I(r12);
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        r5 = r10.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (r5 >= r4) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        r11 = r10.h() + r5;
        r5 = r10.h();
        r8 = (r5 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (r8 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        if (r8 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        r27 = r4;
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        if (r5 != 1735291493) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        r10.I(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (r10.h() != 1684108385) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:
    
        r10.I(8);
        r5 = r10.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
    
        if (r5 <= 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
    
        if (r5 > 192) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        r5 = defpackage.nd7.b[r5 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
    
        if (r5 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
    
        r8 = new defpackage.ipe("TCON", null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        r10.H(r11);
        r27 = r4;
        r28 = r6;
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        if (r5 != 1684632427) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
    
        r12 = defpackage.nd7.L(r5, r10, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0106, code lost:
    
        r10.H(r11);
        r27 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010b, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        if (r5 != 1953655662) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0117, code lost:
    
        r12 = defpackage.nd7.L(r5, r10, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0121, code lost:
    
        if (r5 != 1953329263) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0123, code lost:
    
        r5 = defpackage.nd7.N(r5, "TBPM", r10, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012b, code lost:
    
        r10.H(r11);
        r27 = r4;
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0135, code lost:
    
        if (r5 != 1668311404) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0137, code lost:
    
        r5 = defpackage.nd7.N(r5, "TCMP", r10, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0142, code lost:
    
        if (r5 != 1668249202) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0144, code lost:
    
        r5 = r10.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014f, code lost:
    
        if (r10.h() != 1684108385) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0151, code lost:
    
        r8 = r10.h() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0159, code lost:
    
        if (r8 != 13) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015b, code lost:
    
        r12 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0160, code lost:
    
        if (r8 != 14) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0162, code lost:
    
        r12 = "image/png";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0165, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0166, code lost:
    
        if (r12 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0168, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016b, code lost:
    
        r10.I(r1);
        r5 = r5 - 16;
        r8 = new byte[r5];
        r10.g(0, r8, r5);
        r12 = new defpackage.tl(r12, null, 3, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0180, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0187, code lost:
    
        if (r5 != 1631670868) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0189, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0194, code lost:
    
        if (r5 != 1936682605) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0196, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a1, code lost:
    
        if (r5 != 1936679276) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a3, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ae, code lost:
    
        if (r5 != 1936679282) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b0, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bb, code lost:
    
        if (r5 != 1936679265) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bd, code lost:
    
        r12 = defpackage.nd7.M(r5, r10, "TSOP");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0697 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0679 A[EDGE_INSN: B:402:0x0679->B:329:0x0679 BREAK  A[LOOP:10: B:318:0x0643->B:328:0x0673], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(long r30) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd9.j(long):void");
    }

    @Override // defpackage.ka5
    public final void release() {
    }
}
