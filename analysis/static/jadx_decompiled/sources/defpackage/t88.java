package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public final class t88 extends g88 {
    public static final int[] w2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean x2;
    public static boolean y2;
    public final Context Q1;
    public final boolean R1;
    public final aab S1;
    public final int T1;
    public final boolean U1;
    public final cgf V1;
    public final l7 W1;
    public w3 X1;
    public boolean Y1;
    public boolean Z1;
    public bd3 a2;
    public boolean b2;
    public List c2;
    public Surface d2;
    public o2b e2;
    public lsd f2;
    public boolean g2;
    public int h2;
    public long i2;
    public int j2;
    public int k2;
    public int l2;
    public long m2;
    public int n2;
    public long o2;
    public jlf p2;
    public jlf q2;
    public int r2;
    public boolean s2;
    public int t2;
    public r88 u2;
    public q75 v2;

    public t88(Context context, q78 q78Var, Handler handler, o75 o75Var) {
        super(2, q78Var, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.Q1 = applicationContext;
        this.T1 = 50;
        this.S1 = new aab(handler, o75Var);
        this.R1 = true;
        this.V1 = new cgf(applicationContext, this);
        this.W1 = new l7(10);
        this.U1 = "NVIDIA".equals(oaf.c);
        this.f2 = lsd.c;
        this.h2 = 1;
        this.p2 = jlf.e;
        this.t2 = 0;
        this.q2 = null;
        this.r2 = -1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0(defpackage.y78 r11, defpackage.qy5 r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t88.A0(y78, qy5):int");
    }

    public static List B0(Context context, xw0 xw0Var, qy5 qy5Var, boolean z, boolean z2) {
        List listE;
        String str = qy5Var.n;
        if (str == null) {
            return ffc.X;
        }
        if (oaf.a >= 26 && "video/dolby-vision".equals(str) && !q88.a(context)) {
            String strB = p88.b(qy5Var);
            if (strB == null) {
                listE = ffc.X;
            } else {
                xw0Var.getClass();
                listE = p88.e(strB, z, z2);
            }
            if (!listE.isEmpty()) {
                return listE;
            }
        }
        return p88.g(xw0Var, qy5Var, z, z2);
    }

    public static int C0(y78 y78Var, qy5 qy5Var) {
        if (qy5Var.o == -1) {
            return A0(y78Var, qy5Var);
        }
        List list = qy5Var.q;
        int size = list.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) list.get(i)).length;
        }
        return qy5Var.o + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean z0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t88.z0(java.lang.String):boolean");
    }

    @Override // defpackage.g88, defpackage.vj0
    public final void C(float f, float f2) throws ExoPlaybackException {
        super.C(f, f2);
        bd3 bd3Var = this.a2;
        if (bd3Var == null) {
            cgf cgfVar = this.V1;
            if (f == cgfVar.k) {
                return;
            }
            cgfVar.k = f;
            kgf kgfVar = cgfVar.b;
            kgfVar.g = f;
            kgfVar.k = 0L;
            kgfVar.n = -1L;
            kgfVar.l = -1L;
            kgfVar.d(false);
            return;
        }
        lgf lgfVar = bd3Var.q.o;
        lgfVar.getClass();
        fm9.f(f > 0.0f);
        cgf cgfVar2 = lgfVar.b;
        if (f == cgfVar2.k) {
            return;
        }
        cgfVar2.k = f;
        kgf kgfVar2 = cgfVar2.b;
        kgfVar2.g = f;
        kgfVar2.k = 0L;
        kgfVar2.n = -1L;
        kgfVar2.l = -1L;
        kgfVar2.d(false);
    }

    public final void D0() {
        if (this.j2 > 0) {
            this.Z.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.i2;
            int i = this.j2;
            aab aabVar = this.S1;
            Handler handler = (Handler) aabVar.a;
            if (handler != null) {
                handler.post(new ykf(aabVar, i, j, 1));
            }
            this.j2 = 0;
            this.i2 = jElapsedRealtime;
        }
    }

    public final void E0(jlf jlfVar) {
        if (jlfVar.equals(jlf.e) || jlfVar.equals(this.q2)) {
            return;
        }
        this.q2 = jlfVar;
        this.S1.q(jlfVar);
    }

    public final void F0() {
        int i;
        s78 s78Var;
        if (!this.s2 || (i = oaf.a) < 23 || (s78Var = this.W0) == null) {
            return;
        }
        this.u2 = new r88(this, s78Var);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            s78Var.setParameters(bundle);
        }
    }

    @Override // defpackage.g88
    public final s54 G(y78 y78Var, qy5 qy5Var, qy5 qy5Var2) {
        s54 s54VarB = y78Var.b(qy5Var, qy5Var2);
        w3 w3Var = this.X1;
        w3Var.getClass();
        int i = qy5Var2.t;
        int i2 = w3Var.a;
        int i3 = s54VarB.e;
        if (i > i2 || qy5Var2.u > w3Var.b) {
            i3 |= 256;
        }
        if (C0(y78Var, qy5Var2) > w3Var.c) {
            i3 |= 64;
        }
        int i4 = i3;
        return new s54(y78Var.a, qy5Var, qy5Var2, i4 != 0 ? 0 : s54VarB.d, i4);
    }

    public final void G0() {
        Surface surface = this.d2;
        o2b o2bVar = this.e2;
        if (surface == o2bVar) {
            this.d2 = null;
        }
        if (o2bVar != null) {
            o2bVar.release();
            this.e2 = null;
        }
    }

    @Override // defpackage.g88
    public final MediaCodecDecoderException H(IllegalStateException illegalStateException, y78 y78Var) {
        Surface surface = this.d2;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, y78Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    public final void H0(s78 s78Var, int i) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        s78Var.releaseOutputBuffer(i, true);
        Trace.endSection();
        this.L1.f++;
        this.k2 = 0;
        if (this.a2 == null) {
            E0(this.p2);
            cgf cgfVar = this.V1;
            boolean z = cgfVar.e != 3;
            cgfVar.e = 3;
            cgfVar.l.getClass();
            cgfVar.g = oaf.S(SystemClock.elapsedRealtime());
            if (!z || (surface = this.d2) == null) {
                return;
            }
            aab aabVar = this.S1;
            Handler handler = (Handler) aabVar.a;
            if (handler != null) {
                handler.post(new tb2(aabVar, surface, SystemClock.elapsedRealtime(), 8));
            }
            this.g2 = true;
        }
    }

    public final void I0(s78 s78Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        s78Var.d(i, j);
        Trace.endSection();
        this.L1.f++;
        this.k2 = 0;
        if (this.a2 == null) {
            E0(this.p2);
            cgf cgfVar = this.V1;
            boolean z = cgfVar.e != 3;
            cgfVar.e = 3;
            cgfVar.l.getClass();
            cgfVar.g = oaf.S(SystemClock.elapsedRealtime());
            if (!z || (surface = this.d2) == null) {
                return;
            }
            aab aabVar = this.S1;
            Handler handler = (Handler) aabVar.a;
            if (handler != null) {
                handler.post(new tb2(aabVar, surface, SystemClock.elapsedRealtime(), 8));
            }
            this.g2 = true;
        }
    }

    public final boolean J0(y78 y78Var) {
        return oaf.a >= 23 && !this.s2 && !z0(y78Var.a) && (!y78Var.f || o2b.a(this.Q1));
    }

    public final void K0(s78 s78Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        s78Var.releaseOutputBuffer(i, false);
        Trace.endSection();
        this.L1.g++;
    }

    public final void L0(int i, int i2) {
        n54 n54Var = this.L1;
        n54Var.i += i;
        int i3 = i + i2;
        n54Var.h += i3;
        this.j2 += i3;
        int i4 = this.k2 + i3;
        this.k2 = i4;
        n54Var.j = Math.max(i4, n54Var.j);
        int i5 = this.T1;
        if (i5 <= 0 || this.j2 < i5) {
            return;
        }
        D0();
    }

    public final void M0(long j) {
        n54 n54Var = this.L1;
        n54Var.l += j;
        n54Var.m++;
        this.m2 += j;
        this.n2++;
    }

    @Override // defpackage.g88
    public final int Q(p54 p54Var) {
        return (oaf.a < 34 || !this.s2 || p54Var.Z >= this.w0) ? 0 : 32;
    }

    @Override // defpackage.g88
    public final boolean R() {
        return this.s2 && oaf.a < 23;
    }

    @Override // defpackage.g88
    public final float S(float f, qy5[] qy5VarArr) {
        float fMax = -1.0f;
        for (qy5 qy5Var : qy5VarArr) {
            float f2 = qy5Var.v;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // defpackage.g88
    public final ArrayList T(xw0 xw0Var, qy5 qy5Var, boolean z) {
        return p88.h(qy5Var, B0(this.Q1, xw0Var, qy5Var, z, this.s2));
    }

    @Override // defpackage.g88
    public final o78 U(y78 y78Var, qy5 qy5Var, MediaCrypto mediaCrypto, float f) {
        boolean z;
        i63 i63Var;
        w3 w3Var;
        Point point;
        float f2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z2;
        int i;
        char c;
        boolean z3;
        Surface surfaceJ;
        Pair pairD;
        int iA0;
        o2b o2bVar = this.e2;
        boolean z4 = y78Var.f;
        if (o2bVar != null && o2bVar.a != z4) {
            G0();
        }
        qy5[] qy5VarArr = this.u0;
        qy5VarArr.getClass();
        int iMax = qy5Var.t;
        int iC0 = C0(y78Var, qy5Var);
        int length = qy5VarArr.length;
        float f3 = qy5Var.v;
        int i2 = qy5Var.t;
        i63 i63Var2 = qy5Var.A;
        int i3 = qy5Var.u;
        if (length == 1) {
            if (iC0 != -1 && (iA0 = A0(y78Var, qy5Var)) != -1) {
                iC0 = Math.min((int) (iC0 * 1.5f), iA0);
            }
            w3Var = new w3(iMax, i3, iC0);
            z = z4;
            i63Var = i63Var2;
        } else {
            int length2 = qy5VarArr.length;
            int iMax2 = i3;
            int i4 = 0;
            boolean z5 = false;
            while (i4 < length2) {
                qy5 qy5Var2 = qy5VarArr[i4];
                qy5[] qy5VarArr2 = qy5VarArr;
                if (i63Var2 != null && qy5Var2.A == null) {
                    ny5 ny5VarA = qy5Var2.a();
                    ny5VarA.z = i63Var2;
                    qy5Var2 = new qy5(ny5VarA);
                }
                if (y78Var.b(qy5Var, qy5Var2).d != 0) {
                    int i5 = qy5Var2.u;
                    i = length2;
                    int i6 = qy5Var2.t;
                    z2 = z4;
                    c = 65535;
                    z5 |= i6 == -1 || i5 == -1;
                    iMax = Math.max(iMax, i6);
                    iMax2 = Math.max(iMax2, i5);
                    iC0 = Math.max(iC0, C0(y78Var, qy5Var2));
                } else {
                    z2 = z4;
                    i = length2;
                    c = 65535;
                }
                i4++;
                qy5VarArr = qy5VarArr2;
                length2 = i;
                z4 = z2;
            }
            z = z4;
            if (z5) {
                z04.c0("Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z6 = i3 > i2;
                int i7 = z6 ? i3 : i2;
                int i8 = z6 ? i2 : i3;
                float f4 = i8 / i7;
                int[] iArr = w2;
                i63Var = i63Var2;
                int i9 = 0;
                while (i9 < 9) {
                    int i10 = iArr[i9];
                    int[] iArr2 = iArr;
                    int i11 = (int) (i10 * f4);
                    if (i10 <= i7 || i11 <= i8) {
                        break;
                    }
                    int i12 = i7;
                    int i13 = i8;
                    if (oaf.a >= 21) {
                        int i14 = z6 ? i11 : i10;
                        if (!z6) {
                            i10 = i11;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = y78Var.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f2 = f4;
                            point = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f2 = f4;
                            point = new Point(oaf.g(i14, widthAlignment) * widthAlignment, oaf.g(i10, heightAlignment) * heightAlignment);
                        }
                        if (point != null && y78Var.f(point.x, point.y, f3)) {
                            break;
                        }
                        i9++;
                        iArr = iArr2;
                        i7 = i12;
                        i8 = i13;
                        f4 = f2;
                    } else {
                        f2 = f4;
                        try {
                            int iG = oaf.g(i10, 16) * 16;
                            int iG2 = oaf.g(i11, 16) * 16;
                            if (iG * iG2 <= p88.k()) {
                                int i15 = z6 ? iG2 : iG;
                                if (!z6) {
                                    iG = iG2;
                                }
                                point = new Point(i15, iG);
                            } else {
                                i9++;
                                iArr = iArr2;
                                i7 = i12;
                                i8 = i13;
                                f4 = f2;
                            }
                        } catch (MediaCodecUtil$DecoderQueryException unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    ny5 ny5VarA2 = qy5Var.a();
                    ny5VarA2.s = iMax;
                    ny5VarA2.t = iMax2;
                    iC0 = Math.max(iC0, A0(y78Var, new qy5(ny5VarA2)));
                    z04.c0("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                i63Var = i63Var2;
            }
            w3Var = new w3(iMax, iMax2, iC0);
        }
        this.X1 = w3Var;
        int i16 = this.s2 ? this.t2 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", y78Var.c);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i3);
        j47.k0(mediaFormat, qy5Var.q);
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        j47.X(mediaFormat, "rotation-degrees", qy5Var.w);
        j47.W(mediaFormat, i63Var);
        if ("video/dolby-vision".equals(qy5Var.n) && (pairD = p88.d(qy5Var)) != null) {
            j47.X(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", w3Var.a);
        mediaFormat.setInteger("max-height", w3Var.b);
        j47.X(mediaFormat, "max-input-size", w3Var.c);
        int i17 = oaf.a;
        if (i17 >= 23) {
            mediaFormat.setInteger(LogFactory.PRIORITY_KEY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.U1) {
            z3 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z3 = true;
        }
        if (i16 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z3);
            mediaFormat.setInteger("audio-session-id", i16);
        }
        if (i17 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.r2));
        }
        if (this.d2 == null) {
            if (!J0(y78Var)) {
                throw new IllegalStateException();
            }
            if (this.e2 == null) {
                this.e2 = o2b.b(this.Q1, z);
            }
            this.d2 = this.e2;
        }
        bd3 bd3Var = this.a2;
        if (bd3Var != null && !oaf.M(bd3Var.a)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        bd3 bd3Var2 = this.a2;
        if (bd3Var2 != null) {
            fm9.k(bd3Var2.c());
            bgf bgfVar = bd3Var2.e;
            fm9.l(bgfVar);
            SparseArray sparseArray = ((rf4) bgfVar).d.g;
            fm9.k(oaf.l(sparseArray, 1));
            surfaceJ = ((r27) sparseArray.get(1)).a.j();
        } else {
            surfaceJ = this.d2;
        }
        return new o78(y78Var, mediaFormat, qy5Var, surfaceJ, mediaCrypto);
    }

    @Override // defpackage.g88
    public final void V(p54 p54Var) {
        if (this.Z1) {
            ByteBuffer byteBuffer = p54Var.s0;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        s78 s78Var = this.W0;
                        s78Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        s78Var.setParameters(bundle);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [android.view.Surface] */
    @Override // defpackage.vj0, defpackage.q4b
    public final void a(int i, Object obj) throws ExoPlaybackException {
        Handler handler;
        cgf cgfVar = this.V1;
        if (i == 1) {
            o2b o2bVarB = obj instanceof Surface ? (Surface) obj : null;
            if (o2bVarB == null) {
                o2b o2bVar = this.e2;
                if (o2bVar != null) {
                    o2bVarB = o2bVar;
                } else {
                    y78 y78Var = this.d1;
                    if (y78Var != null && J0(y78Var)) {
                        o2bVarB = o2b.b(this.Q1, y78Var.f);
                        this.e2 = o2bVarB;
                    }
                }
            }
            Surface surface = this.d2;
            aab aabVar = this.S1;
            if (surface == o2bVarB) {
                if (o2bVarB == null || o2bVarB == this.e2) {
                    return;
                }
                jlf jlfVar = this.q2;
                if (jlfVar != null) {
                    aabVar.q(jlfVar);
                }
                Surface surface2 = this.d2;
                if (surface2 == null || !this.g2 || (handler = (Handler) aabVar.a) == null) {
                    return;
                }
                handler.post(new tb2(aabVar, surface2, SystemClock.elapsedRealtime(), 8));
                return;
            }
            this.d2 = o2bVarB;
            if (this.a2 == null) {
                cgfVar.h(o2bVarB);
            }
            this.g2 = false;
            int i2 = this.s0;
            s78 s78Var = this.W0;
            if (s78Var != null && this.a2 == null) {
                if (oaf.a < 23 || o2bVarB == null || this.Y1) {
                    n0();
                    Y();
                } else {
                    s78Var.j(o2bVarB);
                }
            }
            if (o2bVarB == null || o2bVarB == this.e2) {
                this.q2 = null;
                bd3 bd3Var = this.a2;
                if (bd3Var != null) {
                    cd3 cd3Var = bd3Var.q;
                    cd3Var.getClass();
                    lsd lsdVar = lsd.c;
                    cd3Var.a(null, lsdVar.a, lsdVar.b);
                    cd3Var.w0 = null;
                }
            } else {
                jlf jlfVar2 = this.q2;
                if (jlfVar2 != null) {
                    aabVar.q(jlfVar2);
                }
                if (i2 == 2) {
                    cgfVar.c(true);
                }
            }
            F0();
            return;
        }
        if (i == 7) {
            obj.getClass();
            q75 q75Var = (q75) obj;
            this.v2 = q75Var;
            bd3 bd3Var2 = this.a2;
            if (bd3Var2 != null) {
                bd3Var2.q.t0 = q75Var;
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.t2 != iIntValue) {
                this.t2 = iIntValue;
                if (this.s2) {
                    n0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.r2 = ((Integer) obj).intValue();
            s78 s78Var2 = this.W0;
            if (s78Var2 != null && oaf.a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.r2));
                s78Var2.setParameters(bundle);
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.h2 = iIntValue2;
            s78 s78Var3 = this.W0;
            if (s78Var3 != null) {
                s78Var3.h(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            kgf kgfVar = cgfVar.b;
            if (kgfVar.h == iIntValue3) {
                return;
            }
            kgfVar.h = iIntValue3;
            kgfVar.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.c2 = list;
            bd3 bd3Var3 = this.a2;
            if (bd3Var3 != null) {
                ArrayList arrayList = bd3Var3.c;
                if (arrayList.equals(list)) {
                    return;
                }
                arrayList.clear();
                arrayList.addAll(list);
                bd3Var3.d();
                return;
            }
            return;
        }
        if (i != 14) {
            if (i == 11) {
                this.R0 = (w75) obj;
                return;
            }
            return;
        }
        obj.getClass();
        lsd lsdVar2 = (lsd) obj;
        if (lsdVar2.a == 0 || lsdVar2.b == 0) {
            return;
        }
        this.f2 = lsdVar2;
        bd3 bd3Var4 = this.a2;
        if (bd3Var4 != null) {
            Surface surface3 = this.d2;
            fm9.l(surface3);
            bd3Var4.f(surface3, lsdVar2);
        }
    }

    @Override // defpackage.g88
    public final void a0(Exception exc) {
        z04.v("Video codec error", exc);
        aab aabVar = this.S1;
        Handler handler = (Handler) aabVar.a;
        if (handler != null) {
            handler.post(new fre(aabVar, 15, exc));
        }
    }

    @Override // defpackage.g88
    public final void b0(long j, String str, long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        aab aabVar = this.S1;
        Handler handler = (Handler) aabVar.a;
        if (handler != null) {
            handler.post(new v60(aabVar, str, j, j2, 3));
        }
        this.Y1 = z0(str);
        y78 y78Var = this.d1;
        y78Var.getClass();
        boolean z = false;
        if (oaf.a >= 29 && "video/x-vnd.on2.vp9".equals(y78Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = y78Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.Z1 = z;
        F0();
    }

    @Override // defpackage.g88
    public final void c0(String str) {
        aab aabVar = this.S1;
        Handler handler = (Handler) aabVar.a;
        if (handler != null) {
            handler.post(new fre(aabVar, 16, str));
        }
    }

    @Override // defpackage.g88
    public final s54 d0(y7g y7gVar) throws ExoPlaybackException {
        s54 s54VarD0 = super.d0(y7gVar);
        qy5 qy5Var = (qy5) y7gVar.c;
        qy5Var.getClass();
        aab aabVar = this.S1;
        Handler handler = (Handler) aabVar.a;
        if (handler != null) {
            handler.post(new ewc(aabVar, qy5Var, s54VarD0, 14));
        }
        return s54VarD0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    @Override // defpackage.g88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(defpackage.qy5 r10, android.media.MediaFormat r11) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t88.e0(qy5, android.media.MediaFormat):void");
    }

    @Override // defpackage.vj0
    public final void g() {
        bd3 bd3Var = this.a2;
        if (bd3Var != null) {
            cgf cgfVar = bd3Var.q.c;
            if (cgfVar.e == 0) {
                cgfVar.e = 1;
                return;
            }
            return;
        }
        cgf cgfVar2 = this.V1;
        if (cgfVar2.e == 0) {
            cgfVar2.e = 1;
        }
    }

    @Override // defpackage.g88
    public final void g0(long j) {
        super.g0(j);
        if (this.s2) {
            return;
        }
        this.l2--;
    }

    @Override // defpackage.g88
    public final void h0() {
        bd3 bd3Var = this.a2;
        if (bd3Var != null) {
            long j = this.M1.c;
            bd3Var.j |= (bd3Var.h == j && bd3Var.i == 0) ? false : true;
            bd3Var.h = j;
            bd3Var.i = 0L;
        } else {
            this.V1.d(2);
        }
        F0();
    }

    @Override // defpackage.g88
    public final void i0(p54 p54Var) {
        Surface surface;
        boolean z = this.s2;
        if (!z) {
            this.l2++;
        }
        if (oaf.a >= 23 || !z) {
            return;
        }
        long j = p54Var.Z;
        y0(j);
        E0(this.p2);
        this.L1.f++;
        cgf cgfVar = this.V1;
        boolean z2 = cgfVar.e != 3;
        cgfVar.e = 3;
        cgfVar.l.getClass();
        cgfVar.g = oaf.S(SystemClock.elapsedRealtime());
        if (z2 && (surface = this.d2) != null) {
            aab aabVar = this.S1;
            Handler handler = (Handler) aabVar.a;
            if (handler != null) {
                handler.post(new tb2(aabVar, surface, SystemClock.elapsedRealtime(), 8));
            }
            this.g2 = true;
        }
        g0(j);
    }

    @Override // defpackage.g88
    public final void j0(qy5 qy5Var) throws ExoPlaybackException {
        bd3 bd3Var = this.a2;
        if (bd3Var == null || bd3Var.c()) {
            return;
        }
        try {
            this.a2.b(qy5Var);
        } catch (VideoSink$VideoSinkException e) {
            throw e(e, qy5Var, false, 7000);
        }
    }

    @Override // defpackage.vj0
    public final String k() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    @Override // defpackage.g88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l0(long r17, long r19, defpackage.s78 r21, java.nio.ByteBuffer r22, int r23, int r24, int r25, long r26, boolean r28, boolean r29, defpackage.qy5 r30) throws androidx.media3.exoplayer.ExoPlaybackException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t88.l0(long, long, s78, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, qy5):boolean");
    }

    @Override // defpackage.vj0
    public final boolean m() {
        if (this.H1) {
            bd3 bd3Var = this.a2;
            if (bd3Var != null) {
                if (bd3Var.c()) {
                    long j = bd3Var.k;
                    if (j != -9223372036854775807L) {
                        cd3 cd3Var = bd3Var.q;
                        if (cd3Var.x0 == 0) {
                            long j2 = cd3Var.o.j;
                            if (j2 == -9223372036854775807L || j2 < j) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.g88, defpackage.vj0
    public final boolean o() {
        boolean z;
        o2b o2bVar;
        if (super.o()) {
            bd3 bd3Var = this.a2;
            if (bd3Var != null) {
                if (bd3Var.c()) {
                    cd3 cd3Var = bd3Var.q;
                    if (cd3Var.x0 != 0 || !cd3Var.o.b.b(true)) {
                    }
                }
                z = false;
            }
            z = true;
        } else {
            z = false;
        }
        if (z && (((o2bVar = this.e2) != null && this.d2 == o2bVar) || this.W0 == null || this.s2)) {
            return true;
        }
        return this.V1.b(z);
    }

    @Override // defpackage.g88, defpackage.vj0
    public final void p() {
        aab aabVar = this.S1;
        this.q2 = null;
        bd3 bd3Var = this.a2;
        if (bd3Var != null) {
            bd3Var.q.c.d(0);
        } else {
            this.V1.d(0);
        }
        F0();
        this.g2 = false;
        this.u2 = null;
        try {
            super.p();
            n54 n54Var = this.L1;
            aabVar.getClass();
            synchronized (n54Var) {
            }
            Handler handler = (Handler) aabVar.a;
            if (handler != null) {
                handler.post(new alf(aabVar, n54Var, 1));
            }
            aabVar.q(jlf.e);
        } catch (Throwable th) {
            n54 n54Var2 = this.L1;
            aabVar.getClass();
            synchronized (n54Var2) {
                Handler handler2 = (Handler) aabVar.a;
                if (handler2 != null) {
                    handler2.post(new alf(aabVar, n54Var2, 1));
                }
                aabVar.q(jlf.e);
                throw th;
            }
        }
    }

    @Override // defpackage.g88
    public final void p0() {
        super.p0();
        this.l2 = 0;
    }

    @Override // defpackage.vj0
    public final void q(boolean z, boolean z2) {
        this.L1 = new n54(1);
        lgc lgcVar = this.o;
        lgcVar.getClass();
        boolean z3 = lgcVar.b;
        fm9.k((z3 && this.t2 == 0) ? false : true);
        if (this.s2 != z3) {
            this.s2 = z3;
            n0();
        }
        n54 n54Var = this.L1;
        aab aabVar = this.S1;
        Handler handler = (Handler) aabVar.a;
        if (handler != null) {
            handler.post(new alf(aabVar, n54Var, 0));
        }
        boolean z4 = this.b2;
        cgf cgfVar = this.V1;
        if (!z4) {
            if ((this.c2 != null || !this.R1) && this.a2 == null) {
                Context context = this.Q1;
                od odVar = new od();
                odVar.b = context.getApplicationContext();
                odVar.c = cgfVar;
                odVar.Y = she.a;
                she sheVar = this.Z;
                sheVar.getClass();
                odVar.Y = sheVar;
                fm9.k(!odVar.a);
                if (((zc3) odVar.X) == null) {
                    if (((yc3) odVar.o) == null) {
                        odVar.o = new yc3();
                    }
                    odVar.X = new zc3((yc3) odVar.o);
                }
                cd3 cd3Var = new cd3(odVar);
                odVar.a = true;
                this.a2 = cd3Var.b;
            }
            this.b2 = true;
        }
        bd3 bd3Var = this.a2;
        if (bd3Var == null) {
            she sheVar2 = this.Z;
            sheVar2.getClass();
            cgfVar.l = sheVar2;
            cgfVar.e = z2 ? 1 : 0;
            return;
        }
        rxd rxdVar = new rxd(21, this);
        nk4 nk4Var = nk4.a;
        bd3Var.o = rxdVar;
        bd3Var.p = nk4Var;
        q75 q75Var = this.v2;
        if (q75Var != null) {
            bd3Var.q.t0 = q75Var;
        }
        if (this.d2 != null && !this.f2.equals(lsd.c)) {
            this.a2.f(this.d2, this.f2);
        }
        bd3 bd3Var2 = this.a2;
        float f = this.U0;
        lgf lgfVar = bd3Var2.q.o;
        lgfVar.getClass();
        fm9.f(f > 0.0f);
        cgf cgfVar2 = lgfVar.b;
        if (f != cgfVar2.k) {
            cgfVar2.k = f;
            kgf kgfVar = cgfVar2.b;
            kgfVar.g = f;
            kgfVar.k = 0L;
            kgfVar.n = -1L;
            kgfVar.l = -1L;
            kgfVar.d(false);
        }
        List list = this.c2;
        if (list != null) {
            bd3 bd3Var3 = this.a2;
            ArrayList arrayList = bd3Var3.c;
            if (!arrayList.equals(list)) {
                arrayList.clear();
                arrayList.addAll(list);
                bd3Var3.d();
            }
        }
        this.a2.q.c.e = z2 ? 1 : 0;
    }

    @Override // defpackage.g88, defpackage.vj0
    public final void r(long j, boolean z) throws ExoPlaybackException, InterruptedException {
        bd3 bd3Var = this.a2;
        if (bd3Var != null) {
            bd3Var.a(true);
            bd3 bd3Var2 = this.a2;
            long j2 = this.M1.c;
            bd3Var2.j |= (bd3Var2.h == j2 && bd3Var2.i == 0) ? false : true;
            bd3Var2.h = j2;
            bd3Var2.i = 0L;
        }
        super.r(j, z);
        bd3 bd3Var3 = this.a2;
        cgf cgfVar = this.V1;
        if (bd3Var3 == null) {
            kgf kgfVar = cgfVar.b;
            kgfVar.k = 0L;
            kgfVar.n = -1L;
            kgfVar.l = -1L;
            cgfVar.h = -9223372036854775807L;
            cgfVar.f = -9223372036854775807L;
            cgfVar.d(1);
            cgfVar.i = -9223372036854775807L;
        }
        if (z) {
            cgfVar.c(false);
        }
        F0();
        this.k2 = 0;
    }

    @Override // defpackage.vj0
    public final void s() {
        bd3 bd3Var = this.a2;
        if (bd3Var == null || !this.R1) {
            return;
        }
        cd3 cd3Var = bd3Var.q;
        if (cd3Var.y0 == 2) {
            return;
        }
        bie bieVar = cd3Var.u0;
        if (bieVar != null) {
            bieVar.a.removeCallbacksAndMessages(null);
        }
        s8b s8bVar = cd3Var.v0;
        if (s8bVar != null) {
            s8bVar.release();
        }
        cd3Var.w0 = null;
        cd3Var.y0 = 2;
    }

    @Override // defpackage.g88
    public final boolean t0(y78 y78Var) {
        return this.d2 != null || J0(y78Var);
    }

    @Override // defpackage.vj0
    public final void u() {
        try {
            try {
                J();
                n0();
                fr4 fr4Var = this.Q0;
                if (fr4Var != null) {
                    fr4Var.f(null);
                }
                this.Q0 = null;
            } catch (Throwable th) {
                fr4 fr4Var2 = this.Q0;
                if (fr4Var2 != null) {
                    fr4Var2.f(null);
                }
                this.Q0 = null;
                throw th;
            }
        } finally {
            this.b2 = false;
            if (this.e2 != null) {
                G0();
            }
        }
    }

    @Override // defpackage.vj0
    public final void v() {
        this.j2 = 0;
        this.Z.getClass();
        this.i2 = SystemClock.elapsedRealtime();
        this.m2 = 0L;
        this.n2 = 0;
        bd3 bd3Var = this.a2;
        if (bd3Var != null) {
            bd3Var.q.c.e();
        } else {
            this.V1.e();
        }
    }

    @Override // defpackage.g88
    public final int v0(xw0 xw0Var, qy5 qy5Var) {
        boolean z;
        int i = 0;
        if (!ia9.k(qy5Var.n)) {
            return vj0.b(0, 0, 0, 0);
        }
        boolean z2 = qy5Var.r != null;
        Context context = this.Q1;
        List listB0 = B0(context, xw0Var, qy5Var, z2, false);
        if (z2 && listB0.isEmpty()) {
            listB0 = B0(context, xw0Var, qy5Var, false, false);
        }
        if (listB0.isEmpty()) {
            return vj0.b(1, 0, 0, 0);
        }
        int i2 = qy5Var.K;
        if (i2 != 0 && i2 != 2) {
            return vj0.b(2, 0, 0, 0);
        }
        y78 y78Var = (y78) listB0.get(0);
        boolean zD = y78Var.d(qy5Var);
        if (zD) {
            z = true;
        } else {
            for (int i3 = 1; i3 < listB0.size(); i3++) {
                y78 y78Var2 = (y78) listB0.get(i3);
                if (y78Var2.d(qy5Var)) {
                    z = false;
                    zD = true;
                    y78Var = y78Var2;
                    break;
                }
            }
            z = true;
        }
        int i4 = zD ? 4 : 3;
        int i5 = y78Var.e(qy5Var) ? 16 : 8;
        int i6 = y78Var.g ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (oaf.a >= 26 && "video/dolby-vision".equals(qy5Var.n) && !q88.a(context)) {
            i7 = 256;
        }
        if (zD) {
            List listB02 = B0(context, xw0Var, qy5Var, z2, true);
            if (!listB02.isEmpty()) {
                y78 y78Var3 = (y78) p88.h(qy5Var, listB02).get(0);
                if (y78Var3.d(qy5Var) && y78Var3.e(qy5Var)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // defpackage.vj0
    public final void w() {
        D0();
        int i = this.n2;
        if (i != 0) {
            long j = this.m2;
            aab aabVar = this.S1;
            Handler handler = (Handler) aabVar.a;
            if (handler != null) {
                handler.post(new ule(aabVar, j, i, 14));
            }
            this.m2 = 0L;
            this.n2 = 0;
        }
        bd3 bd3Var = this.a2;
        if (bd3Var != null) {
            bd3Var.q.c.f();
        } else {
            this.V1.f();
        }
    }

    @Override // defpackage.g88, defpackage.vj0
    public final void z(long j, long j2) throws MediaCryptoException, ExoPlaybackException {
        super.z(j, j2);
        bd3 bd3Var = this.a2;
        if (bd3Var != null) {
            try {
                bd3Var.e(j, j2);
            } catch (VideoSink$VideoSinkException e) {
                throw e(e, e.a, false, 7001);
            }
        }
    }
}
