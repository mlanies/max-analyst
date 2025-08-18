package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer$InsufficientCapacityException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f88 extends uj0 {
    public static final byte[] P1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final float A0;
    public int A1;
    public final o54 B0;
    public boolean B1;
    public final o54 C0;
    public boolean C1;
    public final o54 D0;
    public boolean D1;
    public final dl0 E0;
    public long E1;
    public final due F0;
    public long F1;
    public final ArrayList G0;
    public boolean G1;
    public final MediaCodec.BufferInfo H0;
    public boolean H1;
    public final long[] I0;
    public boolean I1;
    public final long[] J0;
    public boolean J1;
    public final long[] K0;
    public ExoPlaybackException K1;
    public oy5 L0;
    public n54 L1;
    public oy5 M0;
    public long M1;
    public er4 N0;
    public long N1;
    public er4 O0;
    public int O1;
    public MediaCrypto P0;
    public boolean Q0;
    public final long R0;
    public float S0;
    public float T0;
    public r78 U0;
    public oy5 V0;
    public MediaFormat W0;
    public boolean X0;
    public float Y0;
    public ArrayDeque Z0;
    public MediaCodecRenderer$DecoderInitializationException a1;
    public x78 b1;
    public int c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public dw0 n1;
    public long o1;
    public int p1;
    public int q1;
    public ByteBuffer r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public final p78 x0;
    public boolean x1;
    public final xw0 y0;
    public int y1;
    public final boolean z0;
    public int z1;

    public f88(int i, p78 p78Var, xw0 xw0Var, float f) {
        super(i);
        this.x0 = p78Var;
        xw0Var.getClass();
        this.y0 = xw0Var;
        this.z0 = false;
        this.A0 = f;
        this.B0 = new o54(0);
        this.C0 = new o54(0);
        this.D0 = new o54(2);
        dl0 dl0Var = new dl0(2);
        dl0Var.w0 = 32;
        this.E0 = dl0Var;
        this.F0 = new due(0);
        this.G0 = new ArrayList();
        this.H0 = new MediaCodec.BufferInfo();
        this.S0 = 1.0f;
        this.T0 = 1.0f;
        this.R0 = -9223372036854775807L;
        this.I0 = new long[10];
        this.J0 = new long[10];
        this.K0 = new long[10];
        this.M1 = -9223372036854775807L;
        this.N1 = -9223372036854775807L;
        dl0Var.x(0);
        dl0Var.o.order(ByteOrder.nativeOrder());
        this.Y0 = -1.0f;
        this.c1 = 0;
        this.y1 = 0;
        this.p1 = -1;
        this.q1 = -1;
        this.o1 = -9223372036854775807L;
        this.E1 = -9223372036854775807L;
        this.F1 = -9223372036854775807L;
        this.z1 = 0;
        this.A1 = 0;
    }

    @Override // defpackage.uj0
    public final int A(oy5 oy5Var) throws ExoPlaybackException {
        try {
            return n0(this.y0, oy5Var);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw this.c(e, oy5Var);
        }
    }

    @Override // defpackage.uj0
    public final int B() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final boolean C(long j, long j2) throws Exception {
        boolean z;
        dl0 dl0Var;
        np8.f(!this.H1);
        dl0 dl0Var2 = this.E0;
        int i = dl0Var2.v0;
        if (!(i > 0)) {
            z = 0;
            dl0Var = dl0Var2;
        } else {
            if (!e0(j, j2, null, dl0Var2.o, this.q1, 0, i, dl0Var2.Y, dl0Var2.f(Integer.MIN_VALUE), dl0Var2.f(4), this.M0)) {
                return false;
            }
            dl0Var = dl0Var2;
            a0(dl0Var.u0);
            dl0Var.v();
            z = 0;
        }
        if (this.G1) {
            this.H1 = true;
            return z;
        }
        boolean z2 = this.v1;
        o54 o54Var = this.D0;
        if (z2) {
            np8.f(dl0Var.z(o54Var));
            this.v1 = z;
        }
        if (this.w1) {
            if (dl0Var.v0 > 0) {
                return true;
            }
            F();
            this.w1 = z;
            T();
            if (!this.u1) {
                return z;
            }
        }
        np8.f(!this.G1);
        imc imcVar = this.b;
        imcVar.N();
        o54Var.v();
        while (true) {
            o54Var.v();
            int iV = v(imcVar, o54Var, z);
            if (iV == -5) {
                Y(imcVar);
                break;
            }
            if (iV != -4) {
                if (iV != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (o54Var.f(4)) {
                    this.G1 = true;
                    break;
                }
                if (this.I1) {
                    oy5 oy5Var = this.L0;
                    oy5Var.getClass();
                    this.M0 = oy5Var;
                    Z(oy5Var, null);
                    this.I1 = z;
                }
                o54Var.y();
                if (!dl0Var.z(o54Var)) {
                    this.v1 = true;
                    break;
                }
            }
        }
        if (dl0Var.v0 > 0) {
            dl0Var.y();
        }
        if (dl0Var.v0 > 0 || this.G1 || this.w1) {
            return true;
        }
        return z;
    }

    public abstract r54 D(x78 x78Var, oy5 oy5Var, oy5 oy5Var2);

    public MediaCodecDecoderException E(IllegalStateException illegalStateException, x78 x78Var) {
        return new MediaCodecDecoderException(illegalStateException, x78Var);
    }

    public final void F() {
        this.w1 = false;
        this.E0.v();
        this.D0.v();
        this.v1 = false;
        this.u1 = false;
    }

    public final boolean G() throws ExoPlaybackException, MediaCryptoException {
        if (this.B1) {
            this.z1 = 1;
            if (this.e1 || this.g1) {
                this.A1 = 3;
                return false;
            }
            this.A1 = 2;
        } else {
            p0();
        }
        return true;
    }

    public final boolean H(long j, long j2) throws Exception {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean zE0;
        int iG;
        boolean z3;
        boolean z4 = this.q1 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.H0;
        if (!z4) {
            if (this.h1 && this.C1) {
                try {
                    iG = this.U0.g(bufferInfo2);
                } catch (IllegalStateException unused) {
                    d0();
                    if (this.H1) {
                        g0();
                    }
                    return false;
                }
            } else {
                iG = this.U0.g(bufferInfo2);
            }
            if (iG < 0) {
                if (iG != -2) {
                    if (this.m1 && (this.G1 || this.z1 == 2)) {
                        d0();
                    }
                    return false;
                }
                this.D1 = true;
                MediaFormat outputFormat = this.U0.getOutputFormat();
                if (this.c1 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.l1 = true;
                } else {
                    if (this.j1) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    this.W0 = outputFormat;
                    this.X0 = true;
                }
                return true;
            }
            if (this.l1) {
                this.l1 = false;
                this.U0.releaseOutputBuffer(iG, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                d0();
                return false;
            }
            this.q1 = iG;
            ByteBuffer outputBuffer = this.U0.getOutputBuffer(iG);
            this.r1 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.r1.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.i1 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j3 = this.E1;
                if (j3 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j3;
                }
            }
            long j4 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.G0;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z3 = false;
                    break;
                }
                if (((Long) arrayList.get(i)).longValue() == j4) {
                    arrayList.remove(i);
                    z3 = true;
                    break;
                }
                i++;
            }
            this.s1 = z3;
            long j5 = this.F1;
            long j6 = bufferInfo2.presentationTimeUs;
            this.t1 = j5 == j6;
            q0(j6);
        }
        if (this.h1 && this.C1) {
            try {
                z = true;
                z2 = false;
            } catch (IllegalStateException unused2) {
                z2 = false;
            }
            try {
                zE0 = e0(j, j2, this.U0, this.r1, this.q1, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.s1, this.t1, this.M0);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                d0();
                if (this.H1) {
                    g0();
                }
                return z2;
            }
        } else {
            z = true;
            z2 = false;
            bufferInfo = bufferInfo2;
            zE0 = e0(j, j2, this.U0, this.r1, this.q1, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.s1, this.t1, this.M0);
        }
        if (zE0) {
            a0(bufferInfo.presentationTimeUs);
            boolean z5 = (bufferInfo.flags & 4) != 0 ? z : z2;
            this.q1 = -1;
            this.r1 = null;
            if (!z5) {
                return z;
            }
            d0();
        }
        return z2;
    }

    public final boolean I() throws Exception {
        boolean z;
        rz3 rz3Var;
        r78 r78Var = this.U0;
        if (r78Var == null || this.z1 == 2 || this.G1) {
            return false;
        }
        int i = this.p1;
        o54 o54Var = this.C0;
        if (i < 0) {
            int iE = r78Var.e();
            this.p1 = iE;
            if (iE < 0) {
                return false;
            }
            o54Var.o = this.U0.getInputBuffer(iE);
            o54Var.v();
        }
        if (this.z1 == 1) {
            if (!this.m1) {
                this.C1 = true;
                this.U0.a(0L, this.p1, 0, 4);
                this.p1 = -1;
                o54Var.o = null;
            }
            this.z1 = 2;
            return false;
        }
        if (this.k1) {
            this.k1 = false;
            o54Var.o.put(P1);
            this.U0.a(0L, this.p1, 38, 0);
            this.p1 = -1;
            o54Var.o = null;
            this.B1 = true;
            return true;
        }
        if (this.y1 == 1) {
            for (int i2 = 0; i2 < this.V0.y0.size(); i2++) {
                o54Var.o.put((byte[]) this.V0.y0.get(i2));
            }
            this.y1 = 2;
        }
        int iPosition = o54Var.o.position();
        imc imcVar = this.b;
        imcVar.N();
        try {
            int iV = v(imcVar, o54Var, 0);
            if (j()) {
                this.F1 = this.E1;
            }
            if (iV == -3) {
                return false;
            }
            if (iV == -5) {
                if (this.y1 == 2) {
                    o54Var.v();
                    this.y1 = 1;
                }
                Y(imcVar);
                return true;
            }
            if (o54Var.f(4)) {
                if (this.y1 == 2) {
                    o54Var.v();
                    this.y1 = 1;
                }
                this.G1 = true;
                if (!this.B1) {
                    d0();
                    return false;
                }
                try {
                    if (!this.m1) {
                        this.C1 = true;
                        this.U0.a(0L, this.p1, 0, 4);
                        this.p1 = -1;
                        o54Var.o = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw e(e, this.L0, false, maf.r(e.getErrorCode()));
                }
            }
            if (!this.B1 && !o54Var.f(1)) {
                o54Var.v();
                if (this.y1 == 2) {
                    this.y1 = 1;
                }
                return true;
            }
            boolean zF = o54Var.f(1073741824);
            rz3 rz3Var2 = o54Var.c;
            if (zF) {
                if (iPosition == 0) {
                    rz3Var2.getClass();
                } else {
                    if (((int[]) rz3Var2.d) == null) {
                        int[] iArr = new int[1];
                        rz3Var2.d = iArr;
                        ((MediaCodec.CryptoInfo) rz3Var2.i).numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = (int[]) rz3Var2.d;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (this.d1 && !zF) {
                ByteBuffer byteBuffer = o54Var.o;
                int iPosition2 = byteBuffer.position();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i3 + 1;
                    if (i5 >= iPosition2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i6 = byteBuffer.get(i3) & 255;
                    if (i4 == 3) {
                        if (i6 == 1 && (byteBuffer.get(i5) & 31) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                            byteBufferDuplicate.position(i3 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer.position(0);
                            byteBuffer.put(byteBufferDuplicate);
                            break;
                        }
                    } else if (i6 == 0) {
                        i4++;
                    }
                    if (i6 != 0) {
                        i4 = 0;
                    }
                    i3 = i5;
                }
                if (o54Var.o.position() == 0) {
                    return true;
                }
                this.d1 = false;
            }
            long jMax = o54Var.Y;
            dw0 dw0Var = this.n1;
            if (dw0Var != null) {
                oy5 oy5Var = this.L0;
                if (dw0Var.c == 0) {
                    dw0Var.b = jMax;
                }
                if (dw0Var.a) {
                    z = zF;
                    long j = this.E1;
                    dw0 dw0Var2 = this.n1;
                    oy5 oy5Var2 = this.L0;
                    dw0Var2.getClass();
                    rz3Var = rz3Var2;
                    this.E1 = Math.max(j, Math.max(0L, ((dw0Var2.c - 529) * 1000000) / oy5Var2.K0) + dw0Var2.b);
                } else {
                    ByteBuffer byteBuffer2 = o54Var.o;
                    byteBuffer2.getClass();
                    int i7 = 0;
                    int i8 = 0;
                    for (int i9 = 4; i7 < i9; i9 = 4) {
                        i8 = (i8 << 8) | (byteBuffer2.get(i7) & 255);
                        i7++;
                    }
                    int iE2 = ay7.E(i8);
                    if (iE2 == -1) {
                        dw0Var.a = true;
                        dw0Var.c = 0L;
                        jMax = o54Var.Y;
                        dw0Var.b = jMax;
                        z = zF;
                        long j2 = this.E1;
                        dw0 dw0Var22 = this.n1;
                        oy5 oy5Var22 = this.L0;
                        dw0Var22.getClass();
                        rz3Var = rz3Var2;
                        this.E1 = Math.max(j2, Math.max(0L, ((dw0Var22.c - 529) * 1000000) / oy5Var22.K0) + dw0Var22.b);
                    } else {
                        z = zF;
                        jMax = Math.max(0L, ((dw0Var.c - 529) * 1000000) / oy5Var.K0) + dw0Var.b;
                        dw0Var.c += iE2;
                        long j22 = this.E1;
                        dw0 dw0Var222 = this.n1;
                        oy5 oy5Var222 = this.L0;
                        dw0Var222.getClass();
                        rz3Var = rz3Var2;
                        this.E1 = Math.max(j22, Math.max(0L, ((dw0Var222.c - 529) * 1000000) / oy5Var222.K0) + dw0Var222.b);
                    }
                }
            } else {
                z = zF;
                rz3Var = rz3Var2;
            }
            if (o54Var.f(Integer.MIN_VALUE)) {
                this.G0.add(Long.valueOf(jMax));
            }
            if (this.I1) {
                this.F0.a(jMax, this.L0);
                this.I1 = false;
            }
            this.E1 = Math.max(this.E1, jMax);
            o54Var.y();
            if (o54Var.f(268435456)) {
                R(o54Var);
            }
            c0(o54Var);
            try {
                if (z) {
                    this.U0.k(this.p1, rz3Var, jMax);
                } else {
                    this.U0.a(jMax, this.p1, o54Var.o.limit(), 0);
                }
                this.p1 = -1;
                o54Var.o = null;
                this.B1 = true;
                this.y1 = 0;
                this.L1.d++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw e(e2, this.L0, false, maf.r(e2.getErrorCode()));
            }
        } catch (DecoderInputBuffer$InsufficientCapacityException e3) {
            V(e3);
            f0(0);
            J();
            return true;
        }
    }

    public final void J() {
        try {
            this.U0.flush();
        } finally {
            i0();
        }
    }

    public final boolean K() {
        if (this.U0 == null) {
            return false;
        }
        if (this.A1 == 3 || this.e1 || ((this.f1 && !this.D1) || (this.g1 && this.C1))) {
            g0();
            return true;
        }
        J();
        return false;
    }

    public final List L(boolean z) {
        oy5 oy5Var = this.L0;
        xw0 xw0Var = this.y0;
        ArrayList arrayListO = O(xw0Var, oy5Var, z);
        if (arrayListO.isEmpty() && z) {
            arrayListO = O(xw0Var, this.L0, false);
            if (!arrayListO.isEmpty()) {
                String str = this.L0.w0;
                String strValueOf = String.valueOf(arrayListO);
                new StringBuilder(strValueOf.length() + rh4.e(99, str));
            }
        }
        return arrayListO;
    }

    public boolean M() {
        return false;
    }

    public abstract float N(float f, oy5[] oy5VarArr);

    public abstract ArrayList O(xw0 xw0Var, oy5 oy5Var, boolean z);

    public final a36 P(er4 er4Var) throws ExoPlaybackException {
        pz3 pz3VarE = er4Var.e();
        if (pz3VarE == null || (pz3VarE instanceof a36)) {
            return (a36) pz3VarE;
        }
        String strValueOf = String.valueOf(pz3VarE);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 43);
        sb.append("Expecting FrameworkCryptoConfig but found: ");
        sb.append(strValueOf);
        throw e(new IllegalArgumentException(sb.toString()), this.L0, false, 6001);
    }

    public abstract n78 Q(x78 x78Var, oy5 oy5Var, MediaCrypto mediaCrypto, float f);

    public void R(o54 o54Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(defpackage.x78 r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f88.S(x78, android.media.MediaCrypto):void");
    }

    public final void T() throws Exception {
        oy5 oy5Var;
        if (this.U0 != null || this.u1 || (oy5Var = this.L0) == null) {
            return;
        }
        if (this.O0 == null && m0(oy5Var)) {
            oy5 oy5Var2 = this.L0;
            F();
            String str = oy5Var2.w0;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            dl0 dl0Var = this.E0;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                dl0Var.getClass();
                dl0Var.w0 = 32;
            } else {
                dl0Var.getClass();
                dl0Var.w0 = 1;
            }
            this.u1 = true;
            return;
        }
        k0(this.O0);
        String str2 = this.L0.w0;
        er4 er4Var = this.N0;
        if (er4Var != null) {
            if (this.P0 == null) {
                a36 a36VarP = P(er4Var);
                if (a36VarP != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(a36VarP.a, a36VarP.b);
                        this.P0 = mediaCrypto;
                        this.Q0 = !a36VarP.c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e) {
                        throw e(e, this.L0, false, 6006);
                    }
                } else if (this.N0.d() == null) {
                    return;
                }
            }
            if (a36.d) {
                int state = this.N0.getState();
                if (state == 1) {
                    DrmSession$DrmSessionException drmSession$DrmSessionExceptionD = this.N0.d();
                    drmSession$DrmSessionExceptionD.getClass();
                    throw e(drmSession$DrmSessionExceptionD, this.L0, false, drmSession$DrmSessionExceptionD.a);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            U(this.P0, this.Q0);
        } catch (MediaCodecRenderer$DecoderInitializationException e2) {
            throw e(e2, this.L0, false, 4001);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(android.media.MediaCrypto r12, boolean r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f88.U(android.media.MediaCrypto, boolean):void");
    }

    public abstract void V(Exception exc);

    public abstract void W(long j, String str, long j2);

    public abstract void X(String str);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
    
        if (r13 != false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.r54 Y(defpackage.imc r13) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f88.Y(imc):r54");
    }

    public abstract void Z(oy5 oy5Var, MediaFormat mediaFormat);

    public void a0(long j) {
        while (true) {
            int i = this.O1;
            if (i == 0) {
                return;
            }
            long[] jArr = this.K0;
            if (j < jArr[0]) {
                return;
            }
            long[] jArr2 = this.I0;
            this.M1 = jArr2[0];
            long[] jArr3 = this.J0;
            this.N1 = jArr3[0];
            int i2 = i - 1;
            this.O1 = i2;
            System.arraycopy(jArr2, 1, jArr2, 0, i2);
            System.arraycopy(jArr3, 1, jArr3, 0, this.O1);
            System.arraycopy(jArr, 1, jArr, 0, this.O1);
            b0();
        }
    }

    public abstract void b0();

    public abstract void c0(o54 o54Var);

    public final void d0() throws Exception {
        int i = this.A1;
        if (i == 1) {
            J();
            return;
        }
        if (i == 2) {
            J();
            p0();
        } else if (i != 3) {
            this.H1 = true;
            h0();
        } else {
            g0();
            T();
        }
    }

    public abstract boolean e0(long j, long j2, r78 r78Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, oy5 oy5Var);

    public final boolean f0(int i) throws Exception {
        imc imcVar = this.b;
        imcVar.N();
        o54 o54Var = this.B0;
        o54Var.v();
        int iV = v(imcVar, o54Var, i | 4);
        if (iV == -5) {
            Y(imcVar);
            return true;
        }
        if (iV != -4 || !o54Var.f(4)) {
            return false;
        }
        this.G1 = true;
        d0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g0() {
        try {
            r78 r78Var = this.U0;
            if (r78Var != null) {
                r78Var.release();
                this.L1.c++;
                X(this.b1.a);
            }
            this.U0 = null;
            try {
                MediaCrypto mediaCrypto = this.P0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.U0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.P0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void h0() {
    }

    public void i0() {
        this.p1 = -1;
        this.C0.o = null;
        this.q1 = -1;
        this.r1 = null;
        this.o1 = -9223372036854775807L;
        this.C1 = false;
        this.B1 = false;
        this.k1 = false;
        this.l1 = false;
        this.s1 = false;
        this.t1 = false;
        this.G0.clear();
        this.E1 = -9223372036854775807L;
        this.F1 = -9223372036854775807L;
        dw0 dw0Var = this.n1;
        if (dw0Var != null) {
            dw0Var.b = 0L;
            dw0Var.c = 0L;
            dw0Var.a = false;
        }
        this.z1 = 0;
        this.A1 = 0;
        this.y1 = this.x1 ? 1 : 0;
    }

    public final void j0() {
        i0();
        this.K1 = null;
        this.n1 = null;
        this.Z0 = null;
        this.b1 = null;
        this.V0 = null;
        this.W0 = null;
        this.X0 = false;
        this.D1 = false;
        this.Y0 = -1.0f;
        this.c1 = 0;
        this.d1 = false;
        this.e1 = false;
        this.f1 = false;
        this.g1 = false;
        this.h1 = false;
        this.i1 = false;
        this.j1 = false;
        this.m1 = false;
        this.x1 = false;
        this.y1 = 0;
        this.Q0 = false;
    }

    @Override // defpackage.uj0
    public boolean k() {
        return this.H1;
    }

    public final void k0(er4 er4Var) {
        er4 er4Var2 = this.N0;
        if (er4Var2 != er4Var) {
            if (er4Var != null) {
                er4Var.g(null);
            }
            if (er4Var2 != null) {
                er4Var2.f(null);
            }
        }
        this.N0 = er4Var;
    }

    @Override // defpackage.uj0
    public boolean l() {
        boolean zD;
        if (this.L0 == null) {
            return false;
        }
        if (j()) {
            zD = this.v0;
        } else {
            frc frcVar = this.Z;
            frcVar.getClass();
            zD = frcVar.d();
        }
        if (!zD) {
            if (!(this.q1 >= 0) && (this.o1 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.o1)) {
                return false;
            }
        }
        return true;
    }

    public boolean l0(x78 x78Var) {
        return true;
    }

    public boolean m0(oy5 oy5Var) {
        return false;
    }

    public abstract int n0(xw0 xw0Var, oy5 oy5Var);

    @Override // defpackage.uj0
    public void o(long j, boolean z) {
        int i;
        this.G1 = false;
        this.H1 = false;
        this.J1 = false;
        if (this.u1) {
            this.E0.v();
            this.D0.v();
            this.v1 = false;
        } else if (K()) {
            T();
        }
        due dueVar = this.F0;
        synchronized (dueVar) {
            i = dueVar.e;
        }
        if (i > 0) {
            this.I1 = true;
        }
        this.F0.b();
        int i2 = this.O1;
        if (i2 != 0) {
            int i3 = i2 - 1;
            this.N1 = this.J0[i3];
            this.M1 = this.I0[i3];
            this.O1 = 0;
        }
    }

    public final boolean o0(oy5 oy5Var) throws Exception {
        if (maf.a >= 23 && this.U0 != null && this.A1 != 3 && this.Y != 0) {
            float f = this.T0;
            oy5[] oy5VarArr = this.s0;
            oy5VarArr.getClass();
            float fN = N(f, oy5VarArr);
            float f2 = this.Y0;
            if (f2 == fN) {
                return true;
            }
            if (fN == -1.0f) {
                if (this.B1) {
                    this.z1 = 1;
                    this.A1 = 3;
                    return false;
                }
                g0();
                T();
                return false;
            }
            if (f2 == -1.0f && fN <= this.A0) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fN);
            this.U0.setParameters(bundle);
            this.Y0 = fN;
        }
        return true;
    }

    public final void p0() throws ExoPlaybackException, MediaCryptoException {
        try {
            this.P0.setMediaDrmSession(P(this.O0).b);
            k0(this.O0);
            this.z1 = 0;
            this.A1 = 0;
        } catch (MediaCryptoException e) {
            throw e(e, this.L0, false, 6006);
        }
    }

    public final void q0(long j) {
        Object objD;
        Object objG;
        due dueVar = this.F0;
        synchronized (dueVar) {
            objD = dueVar.d(j, true);
        }
        oy5 oy5Var = (oy5) objD;
        if (oy5Var == null && this.X0) {
            due dueVar2 = this.F0;
            synchronized (dueVar2) {
                objG = dueVar2.e == 0 ? null : dueVar2.g();
            }
            oy5Var = (oy5) objG;
        }
        if (oy5Var != null) {
            this.M0 = oy5Var;
        } else if (!this.X0 || this.M0 == null) {
            return;
        }
        Z(this.M0, this.W0);
        this.X0 = false;
    }

    @Override // defpackage.uj0
    public final void s(oy5[] oy5VarArr, long j, long j2) {
        if (this.N1 == -9223372036854775807L) {
            np8.f(this.M1 == -9223372036854775807L);
            this.M1 = j;
            this.N1 = j2;
            return;
        }
        int i = this.O1;
        long[] jArr = this.J0;
        if (i == jArr.length) {
            long j3 = jArr[i - 1];
        } else {
            this.O1 = i + 1;
        }
        int i2 = this.O1 - 1;
        this.I0[i2] = j;
        jArr[i2] = j2;
        this.K0[i2] = this.E1;
    }

    @Override // defpackage.uj0
    public final void w(long j, long j2) throws Exception {
        boolean z = false;
        if (this.J1) {
            this.J1 = false;
            d0();
        }
        ExoPlaybackException exoPlaybackException = this.K1;
        if (exoPlaybackException != null) {
            this.K1 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.H1) {
                h0();
                return;
            }
            if (this.L0 != null || f0(2)) {
                T();
                if (this.u1) {
                    j47.k("bypassRender");
                    while (C(j, j2)) {
                    }
                    j47.A();
                } else if (this.U0 != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    j47.k("drainAndFeed");
                    while (H(j, j2)) {
                        long j3 = this.R0;
                        if (!(j3 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j3)) {
                            break;
                        }
                    }
                    while (I()) {
                        long j4 = this.R0;
                        if (!(j4 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j4)) {
                            break;
                        }
                    }
                    j47.A();
                } else {
                    n54 n54Var = this.L1;
                    int i = n54Var.e;
                    frc frcVar = this.Z;
                    frcVar.getClass();
                    n54Var.e = i + frcVar.e(j - this.t0);
                    f0(1);
                }
                synchronized (this.L1) {
                }
            }
        } catch (IllegalStateException e) {
            int i2 = maf.a;
            if (i2 < 21 || !(e instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e;
                }
            }
            V(e);
            if (i2 >= 21) {
                if (e instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e).isRecoverable() : false) {
                    z = true;
                }
            }
            if (z) {
                g0();
            }
            throw e(E(e, this.b1), this.L0, z, 4003);
        }
    }

    @Override // defpackage.uj0
    public void z(float f, float f2) throws Exception {
        this.S0 = f;
        this.T0 = f2;
        o0(this.V0);
    }
}
