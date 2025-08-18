package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class c28 implements ka5 {
    public static final byte[] b0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] c0;
    public static final byte[] d0;
    public static final byte[] e0;
    public static final UUID f0;
    public static final Map g0;
    public long A;
    public long B;
    public nv7 C;
    public nv7 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;
    public final ea4 a;
    public oa5 a0;
    public final yaf b;
    public final SparseArray c;
    public final boolean d;
    public final yaf e;
    public final yaf f;
    public final yaf g;
    public final yaf h;
    public final yaf i;
    public final yaf j;
    public final yaf k;
    public final yaf l;
    public final yaf m;
    public final yaf n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public a28 u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    static {
        int i = maf.a;
        c0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(b52.c);
        d0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        e0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        ms2.i(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        ms2.i(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        g0 = Collections.unmodifiableMap(map);
    }

    public c28(int i) {
        ea4 ea4Var = new ea4(0);
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = ea4Var;
        ea4Var.g = new sy4(20, this);
        this.d = (i & 1) == 0;
        this.b = new yaf(0, false);
        this.c = new SparseArray();
        this.g = new yaf(4);
        this.h = new yaf(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new yaf(4);
        this.e = new yaf(np8.b);
        this.f = new yaf(4);
        this.j = new yaf(3, false);
        this.k = new yaf(3, false);
        this.l = new yaf(8);
        this.m = new yaf(3, false);
        this.n = new yaf(3, false);
        this.L = new int[1];
    }

    public static byte[] e(long j, String str, long j2) {
        np8.d(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = maf.a;
        return str2.getBytes(b52.c);
    }

    public final void a(int i) {
        if (this.C == null || this.D == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw ParserException.a(null, sb.toString());
        }
    }

    public final void b(int i) {
        if (this.u != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw ParserException.a(null, sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.a28 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c28.c(a28, long, int, int, int):void");
    }

    @Override // defpackage.ka5
    public final void d(long j, long j2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        ea4 ea4Var = this.a;
        ea4Var.c = 0;
        ea4Var.b.clear();
        yaf yafVar = (yaf) ea4Var.f;
        yafVar.b = 0;
        yafVar.c = 0;
        yaf yafVar2 = this.b;
        yafVar2.b = 0;
        yafVar2.c = 0;
        j();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            b3f b3fVar = ((a28) sparseArray.valueAt(i)).T;
            if (b3fVar != null) {
                b3fVar.b = false;
                b3fVar.c = 0;
            }
            i++;
        }
    }

    public final void f(ra4 ra4Var, int i) {
        yaf yafVar = this.g;
        if (yafVar.c >= i) {
            return;
        }
        byte[] bArr = yafVar.a;
        if (bArr.length < i) {
            yafVar.d(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = yafVar.a;
        int i2 = yafVar.c;
        ra4Var.h(bArr2, i2, i - i2, false);
        yafVar.G(i);
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        this.a0 = oa5Var;
    }

    @Override // defpackage.ka5
    public final boolean h(ma5 ma5Var) {
        sh0 sh0Var = new sh0(19, (byte) 0);
        ra4 ra4Var = (ra4) ma5Var;
        long j = ra4Var.c;
        long j2 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (j != -1 && j <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j2 = j;
        }
        int i = (int) j2;
        yaf yafVar = (yaf) sh0Var.c;
        ra4Var.q(yafVar.a, 0, 4, false);
        sh0Var.b = 4;
        for (long jW = yafVar.w(); jW != 440786851; jW = ((jW << 8) & (-256)) | (yafVar.a[0] & 255)) {
            int i2 = sh0Var.b + 1;
            sh0Var.b = i2;
            if (i2 == i) {
                return false;
            }
            ra4Var.q(yafVar.a, 0, 1, false);
        }
        long jX = sh0Var.x(ra4Var);
        long j3 = sh0Var.b;
        if (jX == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + jX >= j) {
            return false;
        }
        while (true) {
            long j4 = sh0Var.b;
            long j5 = j3 + jX;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (sh0Var.x(ra4Var) == Long.MIN_VALUE) {
                return false;
            }
            long jX2 = sh0Var.x(ra4Var);
            if (jX2 < 0 || jX2 > 2147483647L) {
                return false;
            }
            if (jX2 != 0) {
                int i3 = (int) jX2;
                ra4Var.b(i3, false);
                sh0Var.b += i3;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x06f9, code lost:
    
        if (r2 == 0) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0c8d, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0c8f, code lost:
    
        r19 = true;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x109a, code lost:
    
        if (r19 == false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x109c, code lost:
    
        r1 = ((defpackage.ra4) r43).e();
        r3 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:818:0x10a8, code lost:
    
        if (r3.y == false) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x10aa, code lost:
    
        r3.A = r1;
        r44.a = r3.z;
        r3.y = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x10b4, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x10b6, code lost:
    
        r4 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x10ba, code lost:
    
        if (r3.v == false) goto L880;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x10bc, code lost:
    
        r0 = r3.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x10c2, code lost:
    
        if (r0 == (-1)) goto L881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x10c4, code lost:
    
        r4.a = r0;
        r3.A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x10ca, code lost:
    
        r3 = r42;
        r4 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x10ce, code lost:
    
        r0 = r3;
        r2 = r38;
        r3 = r39;
        r5 = r40;
        r4 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:880:0x10ce, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:906:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0433 A[PHI: r29
      0x0433: PHI (r29v35 java.lang.String) = 
      (r29v1 java.lang.String)
      (r29v2 java.lang.String)
      (r29v3 java.lang.String)
      (r29v4 java.lang.String)
      (r29v5 java.lang.String)
      (r29v6 java.lang.String)
      (r29v7 java.lang.String)
      (r29v8 java.lang.String)
      (r29v9 java.lang.String)
      (r29v10 java.lang.String)
      (r29v11 java.lang.String)
      (r29v12 java.lang.String)
      (r29v13 java.lang.String)
      (r29v14 java.lang.String)
      (r29v15 java.lang.String)
      (r29v16 java.lang.String)
      (r29v17 java.lang.String)
      (r29v18 java.lang.String)
      (r29v19 java.lang.String)
      (r29v20 java.lang.String)
      (r29v21 java.lang.String)
      (r29v22 java.lang.String)
      (r29v23 java.lang.String)
      (r29v24 java.lang.String)
      (r29v25 java.lang.String)
      (r29v26 java.lang.String)
      (r29v27 java.lang.String)
      (r29v28 java.lang.String)
      (r29v29 java.lang.String)
      (r29v30 java.lang.String)
      (r29v31 java.lang.String)
      (r29v32 java.lang.String)
      (r29v33 java.lang.String)
      (r29v36 java.lang.String)
     binds: [B:367:0x061d, B:363:0x0612, B:359:0x0607, B:355:0x05fc, B:351:0x05f1, B:347:0x05e6, B:343:0x05db, B:339:0x05ce, B:335:0x05be, B:331:0x05ae, B:327:0x059e, B:323:0x058e, B:319:0x057e, B:315:0x056e, B:311:0x055e, B:307:0x054e, B:303:0x053e, B:299:0x052e, B:295:0x051e, B:291:0x050e, B:287:0x04fe, B:283:0x04ee, B:279:0x04de, B:275:0x04ce, B:271:0x04be, B:267:0x04ae, B:263:0x049e, B:259:0x048e, B:255:0x047e, B:251:0x046e, B:247:0x045e, B:243:0x044e, B:239:0x043e, B:236:0x0431] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x09e8  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0be2  */
    /* JADX WARN: Type inference failed for: r0v179 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v78, types: [ma5, ra4] */
    /* JADX WARN: Type inference failed for: r1v93, types: [a28, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [yaf] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.String] */
    @Override // defpackage.ka5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.ma5 r43, defpackage.lh4 r44) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 5198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c28.i(ma5, lh4):int");
    }

    public final void j() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.j.E(0);
    }

    public final long k(long j) throws ParserException {
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            return maf.J(j, j2, 1000L);
        }
        throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int l(ra4 ra4Var, a28 a28Var, int i) throws ParserException {
        int iA;
        int iA2;
        int i2;
        if ("S_TEXT/UTF8".equals(a28Var.b)) {
            m(ra4Var, b0, i);
            int i3 = this.S;
            j();
            return i3;
        }
        if ("S_TEXT/ASS".equals(a28Var.b)) {
            m(ra4Var, d0, i);
            int i4 = this.S;
            j();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(a28Var.b)) {
            m(ra4Var, e0, i);
            int i5 = this.S;
            j();
            return i5;
        }
        xze xzeVar = a28Var.X;
        boolean z = this.U;
        yaf yafVar = this.j;
        if (!z) {
            boolean z2 = a28Var.h;
            yaf yafVar2 = this.g;
            if (z2) {
                this.O &= -1073741825;
                if (!this.V) {
                    ra4Var.h(yafVar2.a, 0, 1, false);
                    this.R++;
                    byte b = yafVar2.a[0];
                    if ((b & 128) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.Y = b;
                    this.V = true;
                }
                byte b2 = this.Y;
                if ((b2 & 1) == 1) {
                    boolean z3 = (b2 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.Z) {
                        yaf yafVar3 = this.l;
                        ra4Var.h(yafVar3.a, 0, 8, false);
                        this.R += 8;
                        this.Z = true;
                        yafVar2.a[0] = (byte) ((z3 ? 128 : 0) | 8);
                        yafVar2.H(0);
                        xzeVar.c(1, yafVar2);
                        this.S++;
                        yafVar3.H(0);
                        xzeVar.c(8, yafVar3);
                        this.S += 8;
                    }
                    if (z3) {
                        if (!this.W) {
                            ra4Var.h(yafVar2.a, 0, 1, false);
                            this.R++;
                            yafVar2.H(0);
                            this.X = yafVar2.v();
                            this.W = true;
                        }
                        int i6 = this.X * 4;
                        yafVar2.E(i6);
                        ra4Var.h(yafVar2.a, 0, i6, false);
                        this.R += i6;
                        short s = (short) ((this.X / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.o = ByteBuffer.allocate(i7);
                        }
                        this.o.position(0);
                        this.o.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.X;
                            if (i8 >= i2) {
                                break;
                            }
                            int iY = yafVar2.y();
                            if (i8 % 2 == 0) {
                                this.o.putShort((short) (iY - i9));
                            } else {
                                this.o.putInt(iY - i9);
                            }
                            i8++;
                            i9 = iY;
                        }
                        int i10 = (i - this.R) - i9;
                        if (i2 % 2 == 1) {
                            this.o.putInt(i10);
                        } else {
                            this.o.putShort((short) i10);
                            this.o.putInt(0);
                        }
                        byte[] bArrArray = this.o.array();
                        yaf yafVar4 = this.m;
                        yafVar4.F(i7, bArrArray);
                        xzeVar.c(i7, yafVar4);
                        this.S += i7;
                    }
                }
            } else {
                byte[] bArr = a28Var.i;
                if (bArr != null) {
                    yafVar.F(bArr.length, bArr);
                }
            }
            if (a28Var.f > 0) {
                this.O |= 268435456;
                this.n.E(0);
                yafVar2.E(4);
                byte[] bArr2 = yafVar2.a;
                bArr2[0] = (byte) ((i >> 24) & 255);
                bArr2[1] = (byte) ((i >> 16) & 255);
                bArr2[2] = (byte) ((i >> 8) & 255);
                bArr2[3] = (byte) (i & 255);
                xzeVar.c(4, yafVar2);
                this.S += 4;
            }
            this.U = true;
        }
        int i11 = i + yafVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(a28Var.b) && !"V_MPEGH/ISO/HEVC".equals(a28Var.b)) {
            if (a28Var.T != null) {
                np8.f(yafVar.c == 0);
                a28Var.T.e(ra4Var);
            }
            while (true) {
                int i12 = this.R;
                if (i12 >= i11) {
                    break;
                }
                int i13 = i11 - i12;
                int iC = yafVar.c();
                if (iC > 0) {
                    iA2 = Math.min(i13, iC);
                    xzeVar.c(iA2, yafVar);
                } else {
                    iA2 = xzeVar.a(ra4Var, i13, false);
                }
                this.R += iA2;
                this.S += iA2;
            }
        } else {
            yaf yafVar5 = this.f;
            byte[] bArr3 = yafVar5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i14 = a28Var.Y;
            int i15 = 4 - i14;
            while (this.R < i11) {
                int i16 = this.T;
                if (i16 == 0) {
                    int iMin = Math.min(i14, yafVar.c());
                    ra4Var.h(bArr3, i15 + iMin, i14 - iMin, false);
                    if (iMin > 0) {
                        yafVar.g(i15, bArr3, iMin);
                    }
                    this.R += i14;
                    yafVar5.H(0);
                    this.T = yafVar5.y();
                    yaf yafVar6 = this.e;
                    yafVar6.H(0);
                    xzeVar.c(4, yafVar6);
                    this.S += 4;
                } else {
                    int iC2 = yafVar.c();
                    if (iC2 > 0) {
                        iA = Math.min(i16, iC2);
                        xzeVar.c(iA, yafVar);
                    } else {
                        iA = xzeVar.a(ra4Var, i16, false);
                    }
                    this.R += iA;
                    this.S += iA;
                    this.T -= iA;
                }
            }
        }
        if ("A_VORBIS".equals(a28Var.b)) {
            yaf yafVar7 = this.h;
            yafVar7.H(0);
            xzeVar.c(4, yafVar7);
            this.S += 4;
        }
        int i17 = this.S;
        j();
        return i17;
    }

    public final void m(ra4 ra4Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        yaf yafVar = this.k;
        byte[] bArr2 = yafVar.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            yafVar.F(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        ra4Var.h(yafVar.a, bArr.length, i, false);
        yafVar.H(0);
        yafVar.G(length);
    }

    @Override // defpackage.ka5
    public final void release() {
    }
}
