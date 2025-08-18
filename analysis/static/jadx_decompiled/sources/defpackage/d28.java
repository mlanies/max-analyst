package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d28 implements la5 {
    public static final byte[] p1 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] q1;
    public static final byte[] r1;
    public static final byte[] s1;
    public static final UUID t1;
    public static final Map u1;
    public final wpa A0;
    public ByteBuffer B0;
    public long C0;
    public long D0;
    public long E0;
    public long F0;
    public long G0;
    public b28 H0;
    public boolean I0;
    public int J0;
    public long K0;
    public boolean L0;
    public long M0;
    public long N0;
    public long O0;
    public nv7 P0;
    public nv7 Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public long U0;
    public long V0;
    public int W0;
    public final boolean X;
    public int X0;
    public final mbe Y;
    public int[] Y0;
    public final wpa Z;
    public int Z0;
    public final ea4 a;
    public int a1;
    public final yaf b;
    public int b1;
    public final SparseArray c;
    public int c1;
    public boolean d1;
    public long e1;
    public int f1;
    public int g1;
    public int h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public int l1;
    public byte m1;
    public boolean n1;
    public final boolean o;
    public pa5 o1;
    public final wpa s0;
    public final wpa t0;
    public final wpa u0;
    public final wpa v0;
    public final wpa w0;
    public final wpa x0;
    public final wpa y0;
    public final wpa z0;

    static {
        int i = oaf.a;
        q1 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(b52.c);
        r1 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        s1 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        t1 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        ms2.i(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        ms2.i(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        u1 = Collections.unmodifiableMap(map);
    }

    public d28(int i, mbe mbeVar) {
        ea4 ea4Var = new ea4(1);
        this.D0 = -1L;
        this.E0 = -9223372036854775807L;
        this.F0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        this.M0 = -1L;
        this.N0 = -1L;
        this.O0 = -9223372036854775807L;
        this.a = ea4Var;
        ea4Var.g = new wd6(20, this);
        this.Y = mbeVar;
        this.o = (i & 1) == 0;
        this.X = (i & 2) == 0;
        this.b = new yaf(1, false);
        this.c = new SparseArray();
        this.t0 = new wpa(4);
        this.u0 = new wpa(ByteBuffer.allocate(4).putInt(-1).array());
        this.v0 = new wpa(4);
        this.Z = new wpa(fm9.e);
        this.s0 = new wpa(4);
        this.w0 = new wpa();
        this.x0 = new wpa();
        this.y0 = new wpa(8);
        this.z0 = new wpa();
        this.A0 = new wpa();
        this.Y0 = new int[1];
    }

    public static byte[] e(long j, String str, long j2) {
        fm9.f(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = oaf.a;
        return str2.getBytes(b52.c);
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        this.o1 = pa5Var;
        if (this.X) {
            pa5Var = new k8g(pa5Var, this.Y);
        }
        this.o1 = pa5Var;
    }

    public final void a(int i) {
        if (this.P0 == null || this.Q0 == null) {
            throw ParserException.a(null, "Element " + i + " must be in a Cues");
        }
    }

    public final void b(int i) {
        if (this.H0 != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.b28 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d28.c(b28, long, int, int, int):void");
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        this.O0 = -9223372036854775807L;
        this.T0 = 0;
        ea4 ea4Var = this.a;
        ea4Var.c = 0;
        ea4Var.b.clear();
        yaf yafVar = (yaf) ea4Var.f;
        yafVar.b = 0;
        yafVar.c = 0;
        yaf yafVar2 = this.b;
        yafVar2.b = 0;
        yafVar2.c = 0;
        h();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            b3f b3fVar = ((b28) sparseArray.valueAt(i)).U;
            if (b3fVar != null) {
                b3fVar.b = false;
                b3fVar.c = 0;
            }
            i++;
        }
    }

    public final void f(sa4 sa4Var, int i) {
        wpa wpaVar = this.t0;
        if (wpaVar.c >= i) {
            return;
        }
        byte[] bArr = wpaVar.a;
        if (bArr.length < i) {
            wpaVar.b(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = wpaVar.a;
        int i2 = wpaVar.c;
        sa4Var.h(bArr2, i2, i - i2, false);
        wpaVar.F(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0d96, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x107c, code lost:
    
        if (r19 == false) goto L799;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x107e, code lost:
    
        r4 = ((defpackage.sa4) r44).o;
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x1088, code lost:
    
        if (r0.L0 == false) goto L793;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x108a, code lost:
    
        r0.N0 = r4;
        r45.a = r0.M0;
        r0.L0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x1095, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x1097, code lost:
    
        r4 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x109b, code lost:
    
        if (r0.I0 == false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x109d, code lost:
    
        r12 = r0.N0;
        r31 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x10a5, code lost:
    
        if (r12 == (-1)) goto L850;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x10a7, code lost:
    
        r4.a = r12;
        r0.N0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x10ad, code lost:
    
        r0 = r43;
        r4 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x10b1, code lost:
    
        r31 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x10b3, code lost:
    
        r4 = r17;
        r10 = r31;
        r2 = r32;
        r3 = r33;
        r5 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0472 A[PHI: r31
      0x0472: PHI (r31v41 java.lang.String) = 
      (r31v7 java.lang.String)
      (r31v8 java.lang.String)
      (r31v9 java.lang.String)
      (r31v10 java.lang.String)
      (r31v11 java.lang.String)
      (r31v12 java.lang.String)
      (r31v13 java.lang.String)
      (r31v14 java.lang.String)
      (r31v15 java.lang.String)
      (r31v16 java.lang.String)
      (r31v17 java.lang.String)
      (r31v18 java.lang.String)
      (r31v19 java.lang.String)
      (r31v20 java.lang.String)
      (r31v21 java.lang.String)
      (r31v22 java.lang.String)
      (r31v23 java.lang.String)
      (r31v24 java.lang.String)
      (r31v25 java.lang.String)
      (r31v26 java.lang.String)
      (r31v27 java.lang.String)
      (r31v28 java.lang.String)
      (r31v29 java.lang.String)
      (r31v30 java.lang.String)
      (r31v31 java.lang.String)
      (r31v32 java.lang.String)
      (r31v33 java.lang.String)
      (r31v34 java.lang.String)
      (r31v35 java.lang.String)
      (r31v36 java.lang.String)
      (r31v37 java.lang.String)
      (r31v38 java.lang.String)
      (r31v42 java.lang.String)
     binds: [B:366:0x0659, B:362:0x064e, B:358:0x0643, B:354:0x0638, B:350:0x062d, B:346:0x0622, B:342:0x0617, B:338:0x060a, B:334:0x05fa, B:330:0x05ea, B:326:0x05da, B:322:0x05ca, B:318:0x05ba, B:314:0x05aa, B:310:0x059a, B:306:0x058a, B:302:0x057a, B:298:0x056a, B:294:0x055a, B:290:0x054a, B:286:0x053a, B:282:0x052a, B:278:0x051a, B:274:0x050a, B:270:0x04fa, B:266:0x04ea, B:262:0x04da, B:258:0x04ca, B:254:0x04ba, B:250:0x04aa, B:246:0x049a, B:242:0x048a, B:235:0x0470] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0caf  */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r0v86, types: [sa4] */
    /* JADX WARN: Type inference failed for: r0v99, types: [b28, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.la5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.na5 r44, defpackage.lh4 r45) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 5180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d28.g(na5, lh4):int");
    }

    public final void h() {
        this.f1 = 0;
        this.g1 = 0;
        this.h1 = 0;
        this.i1 = false;
        this.j1 = false;
        this.k1 = false;
        this.l1 = 0;
        this.m1 = (byte) 0;
        this.n1 = false;
        this.w0.D(0);
    }

    public final long i(long j) throws ParserException {
        long j2 = this.E0;
        if (j2 == -9223372036854775807L) {
            throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i = oaf.a;
        return oaf.a0(j, j2, 1000L, RoundingMode.FLOOR);
    }

    public final int j(sa4 sa4Var, b28 b28Var, int i, boolean z) throws ParserException {
        int iC;
        int iC2;
        int i2;
        if ("S_TEXT/UTF8".equals(b28Var.b)) {
            k(sa4Var, p1, i);
            int i3 = this.g1;
            h();
            return i3;
        }
        if ("S_TEXT/ASS".equals(b28Var.b)) {
            k(sa4Var, r1, i);
            int i4 = this.g1;
            h();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(b28Var.b)) {
            k(sa4Var, s1, i);
            int i5 = this.g1;
            h();
            return i5;
        }
        yze yzeVar = b28Var.Y;
        boolean z2 = this.i1;
        wpa wpaVar = this.w0;
        if (!z2) {
            boolean z3 = b28Var.h;
            wpa wpaVar2 = this.t0;
            if (z3) {
                this.b1 &= -1073741825;
                if (!this.j1) {
                    sa4Var.h(wpaVar2.a, 0, 1, false);
                    this.f1++;
                    byte b = wpaVar2.a[0];
                    if ((b & 128) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.m1 = b;
                    this.j1 = true;
                }
                byte b2 = this.m1;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.b1 |= 1073741824;
                    if (!this.n1) {
                        wpa wpaVar3 = this.y0;
                        sa4Var.h(wpaVar3.a, 0, 8, false);
                        this.f1 += 8;
                        this.n1 = true;
                        wpaVar2.a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        wpaVar2.G(0);
                        yzeVar.b(wpaVar2, 1, 1);
                        this.g1++;
                        wpaVar3.G(0);
                        yzeVar.b(wpaVar3, 8, 1);
                        this.g1 += 8;
                    }
                    if (z4) {
                        if (!this.k1) {
                            sa4Var.h(wpaVar2.a, 0, 1, false);
                            this.f1++;
                            wpaVar2.G(0);
                            this.l1 = wpaVar2.u();
                            this.k1 = true;
                        }
                        int i6 = this.l1 * 4;
                        wpaVar2.D(i6);
                        sa4Var.h(wpaVar2.a, 0, i6, false);
                        this.f1 += i6;
                        short s = (short) ((this.l1 / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.B0;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.B0 = ByteBuffer.allocate(i7);
                        }
                        this.B0.position(0);
                        this.B0.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.l1;
                            if (i8 >= i2) {
                                break;
                            }
                            int iY = wpaVar2.y();
                            if (i8 % 2 == 0) {
                                this.B0.putShort((short) (iY - i9));
                            } else {
                                this.B0.putInt(iY - i9);
                            }
                            i8++;
                            i9 = iY;
                        }
                        int i10 = (i - this.f1) - i9;
                        if (i2 % 2 == 1) {
                            this.B0.putInt(i10);
                        } else {
                            this.B0.putShort((short) i10);
                            this.B0.putInt(0);
                        }
                        byte[] bArrArray = this.B0.array();
                        wpa wpaVar4 = this.z0;
                        wpaVar4.E(i7, bArrArray);
                        yzeVar.b(wpaVar4, i7, 1);
                        this.g1 += i7;
                    }
                }
            } else {
                byte[] bArr = b28Var.i;
                if (bArr != null) {
                    wpaVar.E(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(b28Var.b) ? z : b28Var.f > 0) {
                this.b1 |= 268435456;
                this.A0.D(0);
                int i11 = (wpaVar.c + i) - this.f1;
                wpaVar2.D(4);
                byte[] bArr2 = wpaVar2.a;
                bArr2[0] = (byte) ((i11 >> 24) & 255);
                bArr2[1] = (byte) ((i11 >> 16) & 255);
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                yzeVar.b(wpaVar2, 4, 2);
                this.g1 += 4;
            }
            this.i1 = true;
        }
        int i12 = i + wpaVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(b28Var.b) && !"V_MPEGH/ISO/HEVC".equals(b28Var.b)) {
            if (b28Var.U != null) {
                fm9.k(wpaVar.c == 0);
                b28Var.U.f(sa4Var);
            }
            while (true) {
                int i13 = this.f1;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                int iA = wpaVar.a();
                if (iA > 0) {
                    iC2 = Math.min(i14, iA);
                    yzeVar.b(wpaVar, iC2, 0);
                } else {
                    iC2 = yzeVar.c(sa4Var, i14, false);
                }
                this.f1 += iC2;
                this.g1 += iC2;
            }
        } else {
            wpa wpaVar5 = this.s0;
            byte[] bArr3 = wpaVar5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i15 = b28Var.Z;
            int i16 = 4 - i15;
            while (this.f1 < i12) {
                int i17 = this.h1;
                if (i17 == 0) {
                    int iMin = Math.min(i15, wpaVar.a());
                    sa4Var.h(bArr3, i16 + iMin, i15 - iMin, false);
                    if (iMin > 0) {
                        wpaVar.e(i16, bArr3, iMin);
                    }
                    this.f1 += i15;
                    wpaVar5.G(0);
                    this.h1 = wpaVar5.y();
                    wpa wpaVar6 = this.Z;
                    wpaVar6.G(0);
                    yzeVar.b(wpaVar6, 4, 0);
                    this.g1 += 4;
                } else {
                    int iA2 = wpaVar.a();
                    if (iA2 > 0) {
                        iC = Math.min(i17, iA2);
                        yzeVar.b(wpaVar, iC, 0);
                    } else {
                        iC = yzeVar.c(sa4Var, i17, false);
                    }
                    this.f1 += iC;
                    this.g1 += iC;
                    this.h1 -= iC;
                }
            }
        }
        if ("A_VORBIS".equals(b28Var.b)) {
            wpa wpaVar7 = this.u0;
            wpaVar7.G(0);
            yzeVar.b(wpaVar7, 4, 0);
            this.g1 += 4;
        }
        int i18 = this.g1;
        h();
        return i18;
    }

    public final void k(sa4 sa4Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        wpa wpaVar = this.x0;
        byte[] bArr2 = wpaVar.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            wpaVar.E(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        sa4Var.h(wpaVar.a, bArr.length, i, false);
        wpaVar.G(0);
        wpaVar.F(length);
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) throws EOFException, InterruptedIOException {
        sh0 sh0Var = new sh0(20, (byte) 0);
        long j = ((sa4) na5Var).c;
        long j2 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (j != -1 && j <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j2 = j;
        }
        int i = (int) j2;
        wpa wpaVar = (wpa) sh0Var.c;
        sa4 sa4Var = (sa4) na5Var;
        sa4Var.q(wpaVar.a, 0, 4, false);
        sh0Var.b = 4;
        for (long jW = wpaVar.w(); jW != 440786851; jW = ((jW << 8) & (-256)) | (wpaVar.a[0] & 255)) {
            int i2 = sh0Var.b + 1;
            sh0Var.b = i2;
            if (i2 == i) {
                return false;
            }
            sa4Var.q(wpaVar.a, 0, 1, false);
        }
        long jY = sh0Var.y(sa4Var);
        long j3 = sh0Var.b;
        if (jY == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + jY >= j) {
            return false;
        }
        while (true) {
            long j4 = sh0Var.b;
            long j5 = j3 + jY;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (sh0Var.y(sa4Var) == Long.MIN_VALUE) {
                return false;
            }
            long jY2 = sh0Var.y(sa4Var);
            if (jY2 < 0 || jY2 > 2147483647L) {
                return false;
            }
            if (jY2 != 0) {
                int i3 = (int) jY2;
                sa4Var.b(i3, false);
                sh0Var.b += i3;
            }
        }
    }

    @Override // defpackage.la5
    public final void release() {
    }
}
