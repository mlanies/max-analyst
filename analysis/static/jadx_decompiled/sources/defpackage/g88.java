package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class g88 extends vj0 {
    public static final byte[] P1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A1;
    public boolean B1;
    public final q78 C0;
    public boolean C1;
    public final xw0 D0;
    public boolean D1;
    public final boolean E0;
    public long E1;
    public final float F0;
    public long F1;
    public final p54 G0;
    public boolean G1;
    public final p54 H0;
    public boolean H1;
    public final p54 I0;
    public boolean I1;
    public final el0 J0;
    public boolean J1;
    public final MediaCodec.BufferInfo K0;
    public ExoPlaybackException K1;
    public final ArrayDeque L0;
    public n54 L1;
    public final l2a M0;
    public e88 M1;
    public qy5 N0;
    public long N1;
    public qy5 O0;
    public boolean O1;
    public fr4 P0;
    public fr4 Q0;
    public w75 R0;
    public MediaCrypto S0;
    public final long T0;
    public float U0;
    public float V0;
    public s78 W0;
    public qy5 X0;
    public MediaFormat Y0;
    public boolean Z0;
    public float a1;
    public ArrayDeque b1;
    public MediaCodecRenderer$DecoderInitializationException c1;
    public y78 d1;
    public int e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public long o1;
    public int p1;
    public int q1;
    public ByteBuffer r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public int y1;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g88(int i, q78 q78Var, float f) {
        super(i);
        xw0 xw0Var = xw0.Z;
        this.C0 = q78Var;
        this.D0 = xw0Var;
        this.E0 = false;
        this.F0 = f;
        this.G0 = new p54(0);
        this.H0 = new p54(0);
        this.I0 = new p54(2);
        el0 el0Var = new el0(2);
        el0Var.x0 = 32;
        this.J0 = el0Var;
        this.K0 = new MediaCodec.BufferInfo();
        this.U0 = 1.0f;
        this.V0 = 1.0f;
        this.T0 = -9223372036854775807L;
        this.L0 = new ArrayDeque();
        this.M1 = e88.e;
        el0Var.x(0);
        el0Var.X.order(ByteOrder.nativeOrder());
        l2a l2aVar = new l2a(0);
        l2aVar.o = m60.a;
        l2aVar.c = 0;
        l2aVar.b = 2;
        this.M0 = l2aVar;
        this.a1 = -1.0f;
        this.e1 = 0;
        this.y1 = 0;
        this.p1 = -1;
        this.q1 = -1;
        this.o1 = -9223372036854775807L;
        this.E1 = -9223372036854775807L;
        this.F1 = -9223372036854775807L;
        this.N1 = -9223372036854775807L;
        this.z1 = 0;
        this.A1 = 0;
        this.L1 = new n54(1);
    }

    @Override // defpackage.vj0
    public void C(float f, float f2) throws ExoPlaybackException {
        this.U0 = f;
        this.V0 = f2;
        w0(this.X0);
    }

    @Override // defpackage.vj0
    public final int D(qy5 qy5Var) throws ExoPlaybackException {
        try {
            return v0(this.D0, qy5Var);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw this.c(e, qy5Var);
        }
    }

    @Override // defpackage.vj0
    public final int E() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        r7 = r1;
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0324  */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(long r27, long r29) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.F(long, long):boolean");
    }

    public abstract s54 G(y78 y78Var, qy5 qy5Var, qy5 qy5Var2);

    public MediaCodecDecoderException H(IllegalStateException illegalStateException, y78 y78Var) {
        return new MediaCodecDecoderException(illegalStateException, y78Var);
    }

    public final void J() {
        this.w1 = false;
        this.J0.v();
        this.I0.v();
        this.v1 = false;
        this.u1 = false;
        l2a l2aVar = this.M0;
        l2aVar.getClass();
        l2aVar.o = m60.a;
        l2aVar.c = 0;
        l2aVar.b = 2;
    }

    public final boolean K() throws MediaCryptoException, ExoPlaybackException {
        if (this.B1) {
            this.z1 = 1;
            if (this.g1 || this.i1) {
                this.A1 = 3;
                return false;
            }
            this.A1 = 2;
        } else {
            x0();
        }
        return true;
    }

    public final boolean L(long j, long j2) throws MediaCryptoException, ExoPlaybackException {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean zL0;
        int iG;
        s78 s78Var = this.W0;
        s78Var.getClass();
        boolean z3 = this.q1 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.K0;
        if (!z3) {
            if (this.j1 && this.C1) {
                try {
                    iG = s78Var.g(bufferInfo2);
                } catch (IllegalStateException unused) {
                    k0();
                    if (this.H1) {
                        n0();
                    }
                    return false;
                }
            } else {
                iG = s78Var.g(bufferInfo2);
            }
            if (iG < 0) {
                if (iG != -2) {
                    if (this.n1 && (this.G1 || this.z1 == 2)) {
                        k0();
                    }
                    return false;
                }
                this.D1 = true;
                s78 s78Var2 = this.W0;
                s78Var2.getClass();
                MediaFormat outputFormat = s78Var2.getOutputFormat();
                if (this.e1 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.m1 = true;
                } else {
                    this.Y0 = outputFormat;
                    this.Z0 = true;
                }
                return true;
            }
            if (this.m1) {
                this.m1 = false;
                s78Var.releaseOutputBuffer(iG, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                k0();
                return false;
            }
            this.q1 = iG;
            ByteBuffer outputBuffer = s78Var.getOutputBuffer(iG);
            this.r1 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.r1.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.k1 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0 && this.E1 != -9223372036854775807L) {
                bufferInfo2.presentationTimeUs = this.F1;
            }
            long j3 = bufferInfo2.presentationTimeUs;
            this.s1 = j3 < this.w0;
            long j4 = this.F1;
            this.t1 = j4 != -9223372036854775807L && j4 <= j3;
            y0(j3);
        }
        if (this.j1 && this.C1) {
            try {
                ByteBuffer byteBuffer = this.r1;
                int i = this.q1;
                int i2 = bufferInfo2.flags;
                long j5 = bufferInfo2.presentationTimeUs;
                boolean z4 = this.s1;
                boolean z5 = this.t1;
                qy5 qy5Var = this.O0;
                qy5Var.getClass();
                z = true;
                z2 = false;
                try {
                    zL0 = l0(j, j2, s78Var, byteBuffer, i, i2, 1, j5, z4, z5, qy5Var);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    k0();
                    if (this.H1) {
                        n0();
                    }
                    return z2;
                }
            } catch (IllegalStateException unused3) {
                z2 = false;
            }
        } else {
            z = true;
            z2 = false;
            ByteBuffer byteBuffer2 = this.r1;
            int i3 = this.q1;
            int i4 = bufferInfo2.flags;
            long j6 = bufferInfo2.presentationTimeUs;
            boolean z6 = this.s1;
            boolean z7 = this.t1;
            qy5 qy5Var2 = this.O0;
            qy5Var2.getClass();
            bufferInfo = bufferInfo2;
            zL0 = l0(j, j2, s78Var, byteBuffer2, i3, i4, 1, j6, z6, z7, qy5Var2);
        }
        if (zL0) {
            g0(bufferInfo.presentationTimeUs);
            boolean z8 = (bufferInfo.flags & 4) != 0 ? z : z2;
            this.q1 = -1;
            this.r1 = null;
            if (!z8) {
                return z;
            }
            k0();
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [g88, vj0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [g88, vj0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    public final boolean M() throws MediaCryptoException, ExoPlaybackException {
        ?? r1 = this;
        s78 s78Var = r1.W0;
        if (s78Var == null || r1.z1 == 2 || r1.G1) {
            return false;
        }
        int i = r1.p1;
        p54 p54Var = r1.H0;
        if (i < 0) {
            int iE = s78Var.e();
            r1.p1 = iE;
            if (iE < 0) {
                return false;
            }
            p54Var.X = s78Var.getInputBuffer(iE);
            p54Var.v();
        }
        if (r1.z1 == 1) {
            if (!r1.n1) {
                r1.C1 = true;
                s78Var.a(0L, r1.p1, 0, 4);
                r1.p1 = -1;
                p54Var.X = null;
            }
            r1.z1 = 2;
            return false;
        }
        if (r1.l1) {
            r1.l1 = false;
            ByteBuffer byteBuffer = p54Var.X;
            byteBuffer.getClass();
            byteBuffer.put(P1);
            s78Var.a(0L, r1.p1, 38, 0);
            r1.p1 = -1;
            p54Var.X = null;
            r1.B1 = true;
            return true;
        }
        if (r1.y1 == 1) {
            int i2 = 0;
            while (true) {
                qy5 qy5Var = r1.X0;
                qy5Var.getClass();
                if (i2 >= qy5Var.q.size()) {
                    break;
                }
                byte[] bArr = (byte[]) r1.X0.q.get(i2);
                ByteBuffer byteBuffer2 = p54Var.X;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i2++;
            }
            r1.y1 = 2;
        }
        ByteBuffer byteBuffer3 = p54Var.X;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        y7g y7gVar = r1.c;
        y7gVar.t();
        try {
            int iY = r1.y(y7gVar, p54Var, 0);
            if (iY == -3) {
                if (l()) {
                    r1.F1 = r1.E1;
                }
                return false;
            }
            if (iY == -5) {
                if (r1.y1 == 2) {
                    p54Var.v();
                    r1.y1 = 1;
                }
                r1.d0(y7gVar);
                return true;
            }
            if (p54Var.f(4)) {
                r1.F1 = r1.E1;
                if (r1.y1 == 2) {
                    p54Var.v();
                    r1.y1 = 1;
                }
                r1.G1 = true;
                if (!r1.B1) {
                    k0();
                    return false;
                }
                try {
                    if (!r1.n1) {
                        r1.C1 = true;
                        s78Var.a(0L, r1.p1, 0, 4);
                        r1.p1 = -1;
                        p54Var.X = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw r1.e(e, r1.N0, false, oaf.x(e.getErrorCode()));
                }
            }
            if (!r1.B1 && !p54Var.f(1)) {
                p54Var.v();
                if (r1.y1 == 2) {
                    r1.y1 = 1;
                }
                return true;
            }
            boolean zF = p54Var.f(1073741824);
            if (zF) {
                rz3 rz3Var = p54Var.o;
                if (iPosition == 0) {
                    rz3Var.getClass();
                } else {
                    if (((int[]) rz3Var.d) == null) {
                        int[] iArr = new int[1];
                        rz3Var.d = iArr;
                        ((MediaCodec.CryptoInfo) rz3Var.i).numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = (int[]) rz3Var.d;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (r1.f1 && !zF) {
                ByteBuffer byteBuffer4 = p54Var.X;
                byteBuffer4.getClass();
                int iPosition2 = byteBuffer4.position();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i3 + 1;
                    if (i5 >= iPosition2) {
                        byteBuffer4.clear();
                        break;
                    }
                    int i6 = byteBuffer4.get(i3) & 255;
                    if (i4 == 3) {
                        if (i6 == 1 && (byteBuffer4.get(i5) & 31) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer4.duplicate();
                            byteBufferDuplicate.position(i3 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer4.position(0);
                            byteBuffer4.put(byteBufferDuplicate);
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
                ByteBuffer byteBuffer5 = p54Var.X;
                byteBuffer5.getClass();
                if (byteBuffer5.position() == 0) {
                    return true;
                }
                r1.f1 = false;
            }
            long j = p54Var.Z;
            if (r1.I1) {
                ArrayDeque arrayDeque = r1.L0;
                if (arrayDeque.isEmpty()) {
                    due dueVar = r1.M1.d;
                    qy5 qy5Var2 = r1.N0;
                    qy5Var2.getClass();
                    dueVar.a(j, qy5Var2);
                } else {
                    due dueVar2 = ((e88) arrayDeque.peekLast()).d;
                    qy5 qy5Var3 = r1.N0;
                    qy5Var3.getClass();
                    dueVar2.a(j, qy5Var3);
                }
                r1.I1 = false;
            }
            r1.E1 = Math.max(r1.E1, j);
            if (l() || p54Var.f(536870912)) {
                r1.F1 = r1.E1;
            }
            p54Var.y();
            if (p54Var.f(268435456)) {
                r1.V(p54Var);
            }
            r1.i0(p54Var);
            int iQ = r1.Q(p54Var);
            try {
                if (zF) {
                    s78Var.i(r1.p1, p54Var.o, j, iQ);
                } else {
                    int i7 = r1.p1;
                    ByteBuffer byteBuffer6 = p54Var.X;
                    byteBuffer6.getClass();
                    s78Var.a(j, i7, byteBuffer6.limit(), iQ);
                }
                r1.p1 = -1;
                p54Var.X = null;
                r1.B1 = true;
                r1.y1 = 0;
                n54 n54Var = r1.L1;
                r1 = n54Var.d + 1;
                n54Var.d = r1;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw r1.e(e2, r1.N0, false, oaf.x(e2.getErrorCode()));
            }
        } catch (DecoderInputBuffer$InsufficientCapacityException e3) {
            r1.a0(e3);
            r1.m0(0);
            N();
            return true;
        }
    }

    public final void N() {
        try {
            s78 s78Var = this.W0;
            fm9.l(s78Var);
            s78Var.flush();
        } finally {
            p0();
        }
    }

    public final boolean O() throws MediaCryptoException {
        if (this.W0 == null) {
            return false;
        }
        int i = this.A1;
        if (i == 3 || this.g1 || ((this.h1 && !this.D1) || (this.i1 && this.C1))) {
            n0();
            return true;
        }
        if (i == 2) {
            int i2 = oaf.a;
            fm9.k(i2 >= 23);
            if (i2 >= 23) {
                try {
                    x0();
                } catch (ExoPlaybackException e) {
                    z04.d0("Failed to update the DRM session, releasing the codec instead.", e);
                    n0();
                    return true;
                }
            }
        }
        N();
        return false;
    }

    public final List P(boolean z) {
        qy5 qy5Var = this.N0;
        qy5Var.getClass();
        xw0 xw0Var = this.D0;
        ArrayList arrayListT = T(xw0Var, qy5Var, z);
        if (arrayListT.isEmpty() && z) {
            arrayListT = T(xw0Var, qy5Var, false);
            if (!arrayListT.isEmpty()) {
                z04.c0("Drm session requires secure decoder for " + qy5Var.n + ", but no secure decoder available. Trying to proceed with " + arrayListT + ".");
            }
        }
        return arrayListT;
    }

    public int Q(p54 p54Var) {
        return 0;
    }

    public boolean R() {
        return false;
    }

    public abstract float S(float f, qy5[] qy5VarArr);

    public abstract ArrayList T(xw0 xw0Var, qy5 qy5Var, boolean z);

    public abstract o78 U(y78 y78Var, qy5 qy5Var, MediaCrypto mediaCrypto, float f);

    public abstract void V(p54 p54Var);

    /* JADX WARN: Removed duplicated region for block: B:115:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(defpackage.y78 r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.W(y78, android.media.MediaCrypto):void");
    }

    public final boolean X(long j, long j2) {
        qy5 qy5Var;
        return j2 < j && ((qy5Var = this.O0) == null || !Objects.equals(qy5Var.n, "audio/opus") || j - j2 > 80000);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2 A[Catch: MediaCodecRenderer$DecoderInitializationException -> 0x00bc, TryCatch #1 {MediaCodecRenderer$DecoderInitializationException -> 0x00bc, blocks: (B:56:0x00ae, B:58:0x00b2, B:64:0x00bf), top: B:76:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.Y():void");
    }

    public final void Z(MediaCrypto mediaCrypto, boolean z) throws MediaCodecRenderer$DecoderInitializationException {
        String diagnosticInfo;
        qy5 qy5Var = this.N0;
        qy5Var.getClass();
        if (this.b1 == null) {
            try {
                List listP = P(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.b1 = arrayDeque;
                if (this.E0) {
                    arrayDeque.addAll(listP);
                } else if (!listP.isEmpty()) {
                    this.b1.add((y78) listP.get(0));
                }
                this.c1 = null;
            } catch (MediaCodecUtil$DecoderQueryException e) {
                throw new MediaCodecRenderer$DecoderInitializationException(qy5Var, e, z, -49998);
            }
        }
        if (this.b1.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(qy5Var, null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.b1;
        arrayDeque2.getClass();
        while (this.W0 == null) {
            y78 y78Var = (y78) arrayDeque2.peekFirst();
            y78Var.getClass();
            if (!t0(y78Var)) {
                return;
            }
            try {
                W(y78Var, mediaCrypto);
            } catch (Exception e2) {
                z04.d0("Failed to initialize decoder: " + y78Var, e2);
                arrayDeque2.removeFirst();
                String str = "Decoder init failed: " + y78Var.a + ", " + qy5Var;
                if (oaf.a >= 21) {
                    diagnosticInfo = e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null;
                } else {
                    diagnosticInfo = null;
                }
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException(str, e2, qy5Var.n, z, y78Var, diagnosticInfo);
                a0(mediaCodecRenderer$DecoderInitializationException);
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.c1;
                if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                    this.c1 = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.c1 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.a, mediaCodecRenderer$DecoderInitializationException2.b, mediaCodecRenderer$DecoderInitializationException2.c, mediaCodecRenderer$DecoderInitializationException2.o);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.c1;
                }
            }
        }
        this.b1 = null;
    }

    public abstract void a0(Exception exc);

    public abstract void b0(long j, String str, long j2);

    public abstract void c0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
    
        if (r4.c(r3) != false) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.s54 d0(defpackage.y7g r13) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.d0(y7g):s54");
    }

    public abstract void e0(qy5 qy5Var, MediaFormat mediaFormat);

    public void f0() {
    }

    public void g0(long j) {
        this.N1 = j;
        while (true) {
            ArrayDeque arrayDeque = this.L0;
            if (arrayDeque.isEmpty() || j < ((e88) arrayDeque.peek()).a) {
                return;
            }
            e88 e88Var = (e88) arrayDeque.poll();
            e88Var.getClass();
            s0(e88Var);
            h0();
        }
    }

    public abstract void h0();

    public void i0(p54 p54Var) {
    }

    public void j0(qy5 qy5Var) {
    }

    public final void k0() throws MediaCryptoException, ExoPlaybackException {
        int i = this.A1;
        if (i == 1) {
            N();
            return;
        }
        if (i == 2) {
            N();
            x0();
        } else if (i != 3) {
            this.H1 = true;
            o0();
        } else {
            n0();
            Y();
        }
    }

    public abstract boolean l0(long j, long j2, s78 s78Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, qy5 qy5Var);

    public final boolean m0(int i) throws MediaCryptoException, ExoPlaybackException {
        y7g y7gVar = this.c;
        y7gVar.t();
        p54 p54Var = this.G0;
        p54Var.v();
        int iY = y(y7gVar, p54Var, i | 4);
        if (iY == -5) {
            d0(y7gVar);
            return true;
        }
        if (iY != -4 || !p54Var.f(4)) {
            return false;
        }
        this.G1 = true;
        k0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0() {
        try {
            s78 s78Var = this.W0;
            if (s78Var != null) {
                s78Var.release();
                this.L1.c++;
                y78 y78Var = this.d1;
                y78Var.getClass();
                c0(y78Var.a);
            }
            this.W0 = null;
            try {
                MediaCrypto mediaCrypto = this.S0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.W0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.S0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.vj0
    public boolean o() {
        boolean zD;
        if (this.N0 == null) {
            return false;
        }
        if (l()) {
            zD = this.y0;
        } else {
            grc grcVar = this.t0;
            grcVar.getClass();
            zD = grcVar.d();
        }
        if (!zD) {
            if (!(this.q1 >= 0)) {
                if (this.o1 == -9223372036854775807L) {
                    return false;
                }
                this.Z.getClass();
                if (SystemClock.elapsedRealtime() >= this.o1) {
                    return false;
                }
            }
        }
        return true;
    }

    public void o0() {
    }

    @Override // defpackage.vj0
    public void p() throws MediaCryptoException {
        this.N0 = null;
        s0(e88.e);
        this.L0.clear();
        O();
    }

    public void p0() {
        this.p1 = -1;
        this.H0.X = null;
        this.q1 = -1;
        this.r1 = null;
        this.o1 = -9223372036854775807L;
        this.C1 = false;
        this.B1 = false;
        this.l1 = false;
        this.m1 = false;
        this.s1 = false;
        this.t1 = false;
        this.E1 = -9223372036854775807L;
        this.F1 = -9223372036854775807L;
        this.N1 = -9223372036854775807L;
        this.z1 = 0;
        this.A1 = 0;
        this.y1 = this.x1 ? 1 : 0;
    }

    public final void q0() {
        p0();
        this.K1 = null;
        this.b1 = null;
        this.d1 = null;
        this.X0 = null;
        this.Y0 = null;
        this.Z0 = false;
        this.D1 = false;
        this.a1 = -1.0f;
        this.e1 = 0;
        this.f1 = false;
        this.g1 = false;
        this.h1 = false;
        this.i1 = false;
        this.j1 = false;
        this.k1 = false;
        this.n1 = false;
        this.x1 = false;
        this.y1 = 0;
    }

    @Override // defpackage.vj0
    public void r(long j, boolean z) throws ExoPlaybackException {
        this.G1 = false;
        this.H1 = false;
        this.J1 = false;
        if (this.u1) {
            this.J0.v();
            this.I0.v();
            this.v1 = false;
            l2a l2aVar = this.M0;
            l2aVar.getClass();
            l2aVar.o = m60.a;
            l2aVar.c = 0;
            l2aVar.b = 2;
        } else if (O()) {
            Y();
        }
        if (this.M1.d.h() > 0) {
            this.I1 = true;
        }
        this.M1.d.b();
        this.L0.clear();
    }

    public final void r0(fr4 fr4Var) {
        fr4 fr4Var2 = this.P0;
        if (fr4Var2 != fr4Var) {
            if (fr4Var != null) {
                fr4Var.g(null);
            }
            if (fr4Var2 != null) {
                fr4Var2.f(null);
            }
        }
        this.P0 = fr4Var;
    }

    public final void s0(e88 e88Var) {
        this.M1 = e88Var;
        if (e88Var.c != -9223372036854775807L) {
            this.O1 = true;
            f0();
        }
    }

    public boolean t0(y78 y78Var) {
        return true;
    }

    public boolean u0(qy5 qy5Var) {
        return false;
    }

    public abstract int v0(xw0 xw0Var, qy5 qy5Var);

    public final boolean w0(qy5 qy5Var) throws ExoPlaybackException {
        if (oaf.a >= 23 && this.W0 != null && this.A1 != 3 && this.s0 != 0) {
            float f = this.V0;
            qy5Var.getClass();
            qy5[] qy5VarArr = this.u0;
            qy5VarArr.getClass();
            float fS = S(f, qy5VarArr);
            float f2 = this.a1;
            if (f2 == fS) {
                return true;
            }
            if (fS == -1.0f) {
                if (this.B1) {
                    this.z1 = 1;
                    this.A1 = 3;
                    return false;
                }
                n0();
                Y();
                return false;
            }
            if (f2 == -1.0f && fS <= this.F0) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fS);
            s78 s78Var = this.W0;
            s78Var.getClass();
            s78Var.setParameters(bundle);
            this.a1 = fS;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r7 >= r5) goto L13;
     */
    @Override // defpackage.vj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(defpackage.qy5[] r13, long r14, long r16) {
        /*
            r12 = this;
            r0 = r12
            e88 r1 = r0.M1
            long r1 = r1.c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            e88 r1 = new e88
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.s0(r1)
            goto L63
        L20:
            java.util.ArrayDeque r1 = r0.L0
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L55
            long r5 = r0.E1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L38
            long r7 = r0.N1
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L55
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L55
        L38:
            e88 r1 = new e88
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.s0(r1)
            e88 r1 = r0.M1
            long r1 = r1.c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L63
            r12.h0()
            goto L63
        L55:
            e88 r9 = new e88
            long r3 = r0.E1
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.x(qy5[], long, long):void");
    }

    public final void x0() throws MediaCryptoException, ExoPlaybackException {
        fr4 fr4Var = this.Q0;
        fr4Var.getClass();
        qz3 qz3VarE = fr4Var.e();
        if (qz3VarE instanceof b36) {
            try {
                MediaCrypto mediaCrypto = this.S0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((b36) qz3VarE).b);
            } catch (MediaCryptoException e) {
                throw e(e, this.N0, false, 6006);
            }
        }
        r0(this.Q0);
        this.z1 = 0;
        this.A1 = 0;
    }

    public final void y0(long j) {
        qy5 qy5Var = (qy5) this.M1.d.f(j);
        if (qy5Var == null && this.O1 && this.Y0 != null) {
            qy5Var = (qy5) this.M1.d.e();
        }
        if (qy5Var != null) {
            this.O0 = qy5Var;
        } else if (!this.Z0 || this.O0 == null) {
            return;
        }
        qy5 qy5Var2 = this.O0;
        qy5Var2.getClass();
        e0(qy5Var2, this.Y0);
        this.Z0 = false;
        this.O1 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0075 A[LOOP:1: B:29:0x0050->B:39:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096 A[LOOP:2: B:40:0x0076->B:50:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0076 A[EDGE_INSN: B:87:0x0076->B:91:? BREAK  A[LOOP:1: B:29:0x0050->B:39:0x0075], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0097 A[EDGE_INSN: B:89:0x0097->B:51:0x0097 BREAK  A[LOOP:2: B:40:0x0076->B:50:0x0096], SYNTHETIC] */
    @Override // defpackage.vj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(long r12, long r14) throws android.media.MediaCryptoException, androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.z(long, long):void");
    }
}
