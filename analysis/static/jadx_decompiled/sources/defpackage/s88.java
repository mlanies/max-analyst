package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public final class s88 extends f88 {
    public static boolean A2;
    public static boolean B2;
    public static final int[] z2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public final Context Q1;
    public final kgf R1;
    public final wva S1;
    public final long T1;
    public final int U1;
    public final boolean V1;
    public w3 W1;
    public boolean X1;
    public boolean Y1;
    public Surface Z1;
    public ct4 a2;
    public boolean b2;
    public int c2;
    public boolean d2;
    public boolean e2;
    public boolean f2;
    public long g2;
    public long h2;
    public long i2;
    public int j2;
    public int k2;
    public int l2;
    public long m2;
    public long n2;
    public long o2;
    public int p2;
    public int q2;
    public int r2;
    public int s2;
    public float t2;
    public ilf u2;
    public boolean v2;
    public int w2;
    public r88 x2;
    public tff y2;

    public s88(Context context, p78 p78Var, xw0 xw0Var, long j, Handler handler, n75 n75Var) {
        super(2, p78Var, xw0Var, 30.0f);
        this.T1 = j;
        this.U1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.Q1 = applicationContext;
        this.R1 = new kgf(applicationContext, 0);
        this.S1 = new wva(handler, 14, n75Var);
        this.V1 = "NVIDIA".equals(maf.c);
        this.h2 = -9223372036854775807L;
        this.q2 = -1;
        this.r2 = -1;
        this.t2 = -1.0f;
        this.c2 = 1;
        this.w2 = 0;
        this.u2 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0845  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s0(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 3090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s88.s0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int t0(defpackage.x78 r11, defpackage.oy5 r12) {
        /*
            r0 = 4
            r1 = 3
            java.lang.String r2 = "video/hevc"
            java.lang.String r3 = "video/avc"
            r4 = 1
            r5 = 2
            int r6 = r12.B0
            r7 = -1
            if (r6 == r7) goto Lc1
            int r8 = r12.C0
            if (r8 != r7) goto L13
            goto Lc1
        L13:
            java.lang.String r9 = "video/dolby-vision"
            java.lang.String r10 = r12.w0
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L36
            android.util.Pair r12 = defpackage.o88.d(r12)
            if (r12 == 0) goto L35
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r9 = 512(0x200, float:7.17E-43)
            if (r12 == r9) goto L33
            if (r12 == r4) goto L33
            if (r12 != r5) goto L35
        L33:
            r10 = r3
            goto L36
        L35:
            r10 = r2
        L36:
            r10.getClass()
            int r12 = r10.hashCode()
            switch(r12) {
                case -1664118616: goto L73;
                case -1662541442: goto L6c;
                case 1187890754: goto L61;
                case 1331836730: goto L58;
                case 1599127256: goto L4d;
                case 1599127257: goto L42;
                default: goto L40;
            }
        L40:
            r4 = r7
            goto L7d
        L42:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L4b
            goto L40
        L4b:
            r4 = 5
            goto L7d
        L4d:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L56
            goto L40
        L56:
            r4 = r0
            goto L7d
        L58:
            boolean r12 = r10.equals(r3)
            if (r12 != 0) goto L5f
            goto L40
        L5f:
            r4 = r1
            goto L7d
        L61:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L6a
            goto L40
        L6a:
            r4 = r5
            goto L7d
        L6c:
            boolean r12 = r10.equals(r2)
            if (r12 != 0) goto L7d
            goto L40
        L73:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L7c
            goto L40
        L7c:
            r4 = 0
        L7d:
            switch(r4) {
                case 0: goto L81;
                case 1: goto Lbc;
                case 2: goto L81;
                case 3: goto L84;
                case 4: goto L81;
                case 5: goto Lbc;
                default: goto L80;
            }
        L80:
            return r7
        L81:
            int r6 = r6 * r8
        L82:
            r0 = r5
            goto Lbd
        L84:
            java.lang.String r12 = defpackage.maf.d
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto Lbb
            java.lang.String r0 = "Amazon"
            java.lang.String r2 = defpackage.maf.c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lad
            java.lang.String r0 = "KFSOWI"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto Lbb
            java.lang.String r0 = "AFTS"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto Lad
            boolean r11 = r11.f
            if (r11 == 0) goto Lad
            goto Lbb
        Lad:
            r11 = 16
            int r12 = defpackage.maf.g(r6, r11)
            int r11 = defpackage.maf.g(r8, r11)
            int r11 = r11 * r12
            int r6 = r11 * 256
            goto L82
        Lbb:
            return r7
        Lbc:
            int r6 = r6 * r8
        Lbd:
            int r6 = r6 * r1
            int r0 = r0 * r5
            int r6 = r6 / r0
            return r6
        Lc1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s88.t0(x78, oy5):int");
    }

    public static zw6 u0(xw0 xw0Var, oy5 oy5Var, boolean z, boolean z3) {
        String str = oy5Var.w0;
        if (str == null) {
            ls5 ls5Var = zw6.b;
            return ffc.X;
        }
        xw0Var.getClass();
        List listE = o88.e(str, z, z3);
        String strB = o88.b(oy5Var);
        if (strB == null) {
            return zw6.j(listE);
        }
        List listE2 = o88.e(strB, z, z3);
        ww6 ww6VarI = zw6.i();
        ww6VarI.e(listE);
        ww6VarI.e(listE2);
        return ww6VarI.j();
    }

    public static int v0(x78 x78Var, oy5 oy5Var) {
        if (oy5Var.x0 == -1) {
            return t0(x78Var, oy5Var);
        }
        List list = oy5Var.y0;
        int size = list.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) list.get(i)).length;
        }
        return oy5Var.x0 + length;
    }

    public final void A0(r78 r78Var, int i, long j) {
        y0();
        j47.k("releaseOutputBuffer");
        r78Var.d(i, j);
        j47.A();
        this.n2 = SystemClock.elapsedRealtime() * 1000;
        this.L1.f++;
        this.k2 = 0;
        x0();
    }

    public final boolean B0(x78 x78Var) {
        return maf.a >= 23 && !this.v2 && !s0(x78Var.a) && (!x78Var.f || ct4.b(this.Q1));
    }

    public final void C0(r78 r78Var, int i) {
        j47.k("skipVideoBuffer");
        r78Var.releaseOutputBuffer(i, false);
        j47.A();
        this.L1.g++;
    }

    @Override // defpackage.f88
    public final r54 D(x78 x78Var, oy5 oy5Var, oy5 oy5Var2) {
        r54 r54VarB = x78Var.b(oy5Var, oy5Var2);
        w3 w3Var = this.W1;
        int i = w3Var.a;
        int i2 = r54VarB.e;
        if (oy5Var2.B0 > i || oy5Var2.C0 > w3Var.b) {
            i2 |= 256;
        }
        if (v0(x78Var, oy5Var2) > this.W1.c) {
            i2 |= 64;
        }
        int i3 = i2;
        return new r54(x78Var.a, oy5Var, oy5Var2, i3 != 0 ? 0 : r54VarB.d, i3);
    }

    public final void D0(int i, int i2) {
        n54 n54Var = this.L1;
        n54Var.i += i;
        int i3 = i + i2;
        n54Var.h += i3;
        this.j2 += i3;
        int i4 = this.k2 + i3;
        this.k2 = i4;
        n54Var.j = Math.max(i4, n54Var.j);
        int i5 = this.U1;
        if (i5 <= 0 || this.j2 < i5) {
            return;
        }
        w0();
    }

    @Override // defpackage.f88
    public final MediaCodecDecoderException E(IllegalStateException illegalStateException, x78 x78Var) {
        Surface surface = this.Z1;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, x78Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    public final void E0(long j) {
        n54 n54Var = this.L1;
        n54Var.l += j;
        n54Var.m++;
        this.o2 += j;
        this.p2++;
    }

    @Override // defpackage.f88
    public final boolean M() {
        return this.v2 && maf.a < 23;
    }

    @Override // defpackage.f88
    public final float N(float f, oy5[] oy5VarArr) {
        float fMax = -1.0f;
        for (oy5 oy5Var : oy5VarArr) {
            float f2 = oy5Var.D0;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // defpackage.f88
    public final ArrayList O(xw0 xw0Var, oy5 oy5Var, boolean z) {
        zw6 zw6VarU0 = u0(xw0Var, oy5Var, z, this.v2);
        Pattern pattern = o88.a;
        ArrayList arrayList = new ArrayList(zw6VarU0);
        Collections.sort(arrayList, new ca3(4, new z16(19, oy5Var)));
        return arrayList;
    }

    @Override // defpackage.f88
    public final n78 Q(x78 x78Var, oy5 oy5Var, MediaCrypto mediaCrypto, float f) {
        h63 h63Var;
        w3 w3Var;
        Point point;
        float f2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        int i;
        char c;
        boolean z;
        Pair pairD;
        int iT0;
        ct4 ct4Var = this.a2;
        if (ct4Var != null && ct4Var.a != x78Var.f) {
            if (this.Z1 == ct4Var) {
                this.Z1 = null;
            }
            ct4Var.release();
            this.a2 = null;
        }
        String str = x78Var.c;
        oy5[] oy5VarArr = this.s0;
        oy5VarArr.getClass();
        int iMax = oy5Var.B0;
        int iV0 = v0(x78Var, oy5Var);
        int length = oy5VarArr.length;
        float f3 = oy5Var.D0;
        int i2 = oy5Var.B0;
        h63 h63Var2 = oy5Var.I0;
        int i3 = oy5Var.C0;
        if (length == 1) {
            if (iV0 != -1 && (iT0 = t0(x78Var, oy5Var)) != -1) {
                iV0 = Math.min((int) (iV0 * 1.5f), iT0);
            }
            w3Var = new w3(iMax, i3, iV0);
            h63Var = h63Var2;
        } else {
            int length2 = oy5VarArr.length;
            int iMax2 = i3;
            int i4 = 0;
            boolean z3 = false;
            while (i4 < length2) {
                oy5 oy5Var2 = oy5VarArr[i4];
                oy5[] oy5VarArr2 = oy5VarArr;
                if (h63Var2 != null && oy5Var2.I0 == null) {
                    my5 my5VarA = oy5Var2.a();
                    my5VarA.w = h63Var2;
                    oy5Var2 = new oy5(my5VarA);
                }
                if (x78Var.b(oy5Var, oy5Var2).d != 0) {
                    int i5 = oy5Var2.C0;
                    i = length2;
                    int i6 = oy5Var2.B0;
                    c = 65535;
                    z3 |= i6 == -1 || i5 == -1;
                    iMax = Math.max(iMax, i6);
                    iMax2 = Math.max(iMax2, i5);
                    iV0 = Math.max(iV0, v0(x78Var, oy5Var2));
                } else {
                    i = length2;
                    c = 65535;
                }
                i4++;
                oy5VarArr = oy5VarArr2;
                length2 = i;
            }
            if (z3) {
                boolean z4 = i3 > i2;
                int i7 = z4 ? i3 : i2;
                int i8 = z4 ? i2 : i3;
                float f4 = i8 / i7;
                int[] iArr = z2;
                h63Var = h63Var2;
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
                    if (maf.a >= 21) {
                        int i14 = z4 ? i11 : i10;
                        if (!z4) {
                            i10 = i11;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = x78Var.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f2 = f4;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f2 = f4;
                            point2 = new Point(maf.g(i14, widthAlignment) * widthAlignment, maf.g(i10, heightAlignment) * heightAlignment);
                        }
                        Point point3 = point2;
                        if (x78Var.e(point2.x, point2.y, f3)) {
                            point = point3;
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
                            int iG = maf.g(i10, 16) * 16;
                            int iG2 = maf.g(i11, 16) * 16;
                            if (iG * iG2 <= o88.i()) {
                                int i15 = z4 ? iG2 : iG;
                                if (!z4) {
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
                    my5 my5VarA2 = oy5Var.a();
                    my5VarA2.p = iMax;
                    my5VarA2.q = iMax2;
                    iV0 = Math.max(iV0, t0(x78Var, new oy5(my5VarA2)));
                }
            } else {
                h63Var = h63Var2;
            }
            w3Var = new w3(iMax, iMax2, iV0);
        }
        this.W1 = w3Var;
        int i16 = this.v2 ? this.w2 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i3);
        c37.y(mediaFormat, oy5Var.y0);
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        c37.t(mediaFormat, "rotation-degrees", oy5Var.E0);
        if (h63Var != null) {
            h63 h63Var3 = h63Var;
            c37.t(mediaFormat, "color-transfer", h63Var3.c);
            c37.t(mediaFormat, "color-standard", h63Var3.a);
            c37.t(mediaFormat, "color-range", h63Var3.b);
            byte[] bArr = h63Var3.o;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(oy5Var.w0) && (pairD = o88.d(oy5Var)) != null) {
            c37.t(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", w3Var.a);
        mediaFormat.setInteger("max-height", w3Var.b);
        c37.t(mediaFormat, "max-input-size", w3Var.c);
        if (maf.a >= 23) {
            mediaFormat.setInteger(LogFactory.PRIORITY_KEY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.V1) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i16 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i16);
        }
        if (this.Z1 == null) {
            if (!B0(x78Var)) {
                throw new IllegalStateException();
            }
            if (this.a2 == null) {
                this.a2 = ct4.c(this.Q1, x78Var.f);
            }
            this.Z1 = this.a2;
        }
        return new n78(x78Var, mediaFormat, oy5Var, this.Z1, mediaCrypto);
    }

    @Override // defpackage.f88
    public final void R(o54 o54Var) {
        if (this.Y1) {
            ByteBuffer byteBuffer = o54Var.Z;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    r78 r78Var = this.U0;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    r78Var.setParameters(bundle);
                }
            }
        }
    }

    @Override // defpackage.f88
    public final void V(Exception exc) {
        fm9.c("Video codec error", exc);
        wva wvaVar = this.S1;
        Handler handler = (Handler) wvaVar.b;
        if (handler != null) {
            handler.post(new fre(wvaVar, 14, exc));
        }
    }

    @Override // defpackage.f88
    public final void W(long j, String str, long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        wva wvaVar = this.S1;
        Handler handler = (Handler) wvaVar.b;
        if (handler != null) {
            handler.post(new v60(wvaVar, str, j, j2, 4));
        }
        this.X1 = s0(str);
        x78 x78Var = this.b1;
        x78Var.getClass();
        boolean z = false;
        if (maf.a >= 29 && "video/x-vnd.on2.vp9".equals(x78Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = x78Var.d;
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
        this.Y1 = z;
        if (maf.a < 23 || !this.v2) {
            return;
        }
        r78 r78Var = this.U0;
        r78Var.getClass();
        this.x2 = new r88(this, r78Var);
    }

    @Override // defpackage.f88
    public final void X(String str) {
        wva wvaVar = this.S1;
        Handler handler = (Handler) wvaVar.b;
        if (handler != null) {
            handler.post(new fre(wvaVar, 13, str));
        }
    }

    @Override // defpackage.f88
    public final r54 Y(imc imcVar) {
        r54 r54VarY = super.Y(imcVar);
        oy5 oy5Var = (oy5) imcVar.c;
        wva wvaVar = this.S1;
        Handler handler = (Handler) wvaVar.b;
        if (handler != null) {
            handler.post(new ewc(wvaVar, oy5Var, r54VarY, 15));
        }
        return r54VarY;
    }

    @Override // defpackage.f88
    public final void Z(oy5 oy5Var, MediaFormat mediaFormat) {
        r78 r78Var = this.U0;
        if (r78Var != null) {
            r78Var.h(this.c2);
        }
        if (this.v2) {
            this.q2 = oy5Var.B0;
            this.r2 = oy5Var.C0;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.q2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.r2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f = oy5Var.F0;
        this.t2 = f;
        int i = maf.a;
        int i2 = oy5Var.E0;
        if (i < 21) {
            this.s2 = i2;
        } else if (i2 == 90 || i2 == 270) {
            int i3 = this.q2;
            this.q2 = this.r2;
            this.r2 = i3;
            this.t2 = 1.0f / f;
        }
        kgf kgfVar = this.R1;
        kgfVar.d = oy5Var.D0;
        em5 em5Var = (em5) kgfVar.p;
        ((dm5) em5Var.e).c();
        ((dm5) em5Var.f).c();
        em5Var.b = false;
        em5Var.c = -9223372036854775807L;
        em5Var.d = 0;
        kgfVar.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [android.view.Surface] */
    @Override // defpackage.uj0, defpackage.p4b
    public final void a(int i, Object obj) throws Exception {
        Handler handler;
        Handler handler2;
        int iIntValue;
        kgf kgfVar = this.R1;
        if (i != 1) {
            if (i == 7) {
                this.y2 = (tff) obj;
                return;
            }
            if (i == 10) {
                int iIntValue2 = ((Integer) obj).intValue();
                if (this.w2 != iIntValue2) {
                    this.w2 = iIntValue2;
                    if (this.v2) {
                        g0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i != 4) {
                if (i == 5 && kgfVar.h != (iIntValue = ((Integer) obj).intValue())) {
                    kgfVar.h = iIntValue;
                    kgfVar.d(true);
                    return;
                }
                return;
            }
            int iIntValue3 = ((Integer) obj).intValue();
            this.c2 = iIntValue3;
            r78 r78Var = this.U0;
            if (r78Var != null) {
                r78Var.h(iIntValue3);
                return;
            }
            return;
        }
        ct4 ct4VarC = obj instanceof Surface ? (Surface) obj : null;
        if (ct4VarC == null) {
            ct4 ct4Var = this.a2;
            if (ct4Var != null) {
                ct4VarC = ct4Var;
            } else {
                x78 x78Var = this.b1;
                if (x78Var != null && B0(x78Var)) {
                    ct4VarC = ct4.c(this.Q1, x78Var.f);
                    this.a2 = ct4VarC;
                }
            }
        }
        Surface surface = this.Z1;
        wva wvaVar = this.S1;
        if (surface == ct4VarC) {
            if (ct4VarC == null || ct4VarC == this.a2) {
                return;
            }
            ilf ilfVar = this.u2;
            if (ilfVar != null && (handler = (Handler) wvaVar.b) != null) {
                handler.post(new fre(wvaVar, 11, ilfVar));
            }
            if (this.b2) {
                Surface surface2 = this.Z1;
                Handler handler3 = (Handler) wvaVar.b;
                if (handler3 != null) {
                    handler3.post(new tb2(wvaVar, surface2, SystemClock.elapsedRealtime(), 7));
                    return;
                }
                return;
            }
            return;
        }
        this.Z1 = ct4VarC;
        kgfVar.getClass();
        ct4 ct4Var2 = ct4VarC instanceof ct4 ? null : ct4VarC;
        if (kgfVar.c != ct4Var2) {
            kgfVar.b();
            kgfVar.c = ct4Var2;
            kgfVar.d(true);
        }
        this.b2 = false;
        int i2 = this.Y;
        r78 r78Var2 = this.U0;
        if (r78Var2 != null) {
            if (maf.a < 23 || ct4VarC == null || this.X1) {
                g0();
                T();
            } else {
                r78Var2.j(ct4VarC);
            }
        }
        if (ct4VarC == null || ct4VarC == this.a2) {
            this.u2 = null;
            r0();
            return;
        }
        ilf ilfVar2 = this.u2;
        if (ilfVar2 != null && (handler2 = (Handler) wvaVar.b) != null) {
            handler2.post(new fre(wvaVar, 11, ilfVar2));
        }
        r0();
        if (i2 == 2) {
            long j = this.T1;
            this.h2 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    @Override // defpackage.f88
    public final void a0(long j) {
        super.a0(j);
        if (this.v2) {
            return;
        }
        this.l2--;
    }

    @Override // defpackage.f88
    public final void b0() {
        r0();
    }

    @Override // defpackage.f88
    public final void c0(o54 o54Var) {
        boolean z = this.v2;
        if (!z) {
            this.l2++;
        }
        if (maf.a >= 23 || !z) {
            return;
        }
        long j = o54Var.Y;
        q0(j);
        y0();
        this.L1.f++;
        x0();
        a0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    @Override // defpackage.f88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e0(long r28, long r30, defpackage.r78 r32, java.nio.ByteBuffer r33, int r34, int r35, int r36, long r37, boolean r39, boolean r40, defpackage.oy5 r41) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s88.e0(long, long, r78, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, oy5):boolean");
    }

    @Override // defpackage.uj0
    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.f88
    public final void i0() {
        super.i0();
        this.l2 = 0;
    }

    @Override // defpackage.f88, defpackage.uj0
    public final boolean l() {
        ct4 ct4Var;
        if (super.l() && (this.d2 || (((ct4Var = this.a2) != null && this.Z1 == ct4Var) || this.U0 == null || this.v2))) {
            this.h2 = -9223372036854775807L;
            return true;
        }
        if (this.h2 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.h2) {
            return true;
        }
        this.h2 = -9223372036854775807L;
        return false;
    }

    @Override // defpackage.f88
    public final boolean l0(x78 x78Var) {
        return this.Z1 != null || B0(x78Var);
    }

    @Override // defpackage.uj0
    public final void m() {
        wva wvaVar = this.S1;
        this.u2 = null;
        r0();
        this.b2 = false;
        this.x2 = null;
        try {
            this.L0 = null;
            this.M1 = -9223372036854775807L;
            this.N1 = -9223372036854775807L;
            this.O1 = 0;
            K();
            n54 n54Var = this.L1;
            wvaVar.getClass();
            synchronized (n54Var) {
            }
            Handler handler = (Handler) wvaVar.b;
            if (handler != null) {
                handler.post(new zkf(wvaVar, n54Var, 0));
            }
        } catch (Throwable th) {
            n54 n54Var2 = this.L1;
            wvaVar.getClass();
            synchronized (n54Var2) {
                Handler handler2 = (Handler) wvaVar.b;
                if (handler2 != null) {
                    handler2.post(new zkf(wvaVar, n54Var2, 0));
                }
                throw th;
            }
        }
    }

    @Override // defpackage.uj0
    public final void n(boolean z, boolean z3) {
        this.L1 = new n54(0);
        kgc kgcVar = this.c;
        kgcVar.getClass();
        boolean z4 = kgcVar.a;
        np8.f((z4 && this.w2 == 0) ? false : true);
        if (this.v2 != z4) {
            this.v2 = z4;
            g0();
        }
        n54 n54Var = this.L1;
        wva wvaVar = this.S1;
        Handler handler = (Handler) wvaVar.b;
        if (handler != null) {
            handler.post(new zkf(wvaVar, n54Var, 1));
        }
        this.e2 = z3;
        this.f2 = false;
    }

    @Override // defpackage.f88
    public final int n0(xw0 xw0Var, oy5 oy5Var) {
        boolean z;
        int i = 4;
        int i2 = 0;
        if (!ha9.j(oy5Var.w0)) {
            return uj0.b(0, 0, 0);
        }
        boolean z3 = oy5Var.z0 != null;
        zw6 zw6VarU0 = u0(xw0Var, oy5Var, z3, false);
        if (z3 && zw6VarU0.isEmpty()) {
            zw6VarU0 = u0(xw0Var, oy5Var, false, false);
        }
        if (zw6VarU0.isEmpty()) {
            return uj0.b(1, 0, 0);
        }
        int i3 = oy5Var.P0;
        if (i3 != 0 && i3 != 2) {
            return uj0.b(2, 0, 0);
        }
        x78 x78Var = (x78) zw6VarU0.get(0);
        boolean zC = x78Var.c(oy5Var);
        if (zC) {
            z = true;
        } else {
            for (int i4 = 1; i4 < zw6VarU0.size(); i4++) {
                x78 x78Var2 = (x78) zw6VarU0.get(i4);
                if (x78Var2.c(oy5Var)) {
                    zC = true;
                    z = false;
                    x78Var = x78Var2;
                    break;
                }
            }
            z = true;
        }
        int i5 = zC ? 4 : 3;
        int i6 = x78Var.d(oy5Var) ? 16 : 8;
        int i7 = x78Var.g ? 64 : 0;
        int i8 = z ? 128 : 0;
        if (zC) {
            zw6 zw6VarU02 = u0(xw0Var, oy5Var, z3, true);
            if (!zw6VarU02.isEmpty()) {
                Pattern pattern = o88.a;
                ArrayList arrayList = new ArrayList(zw6VarU02);
                Collections.sort(arrayList, new ca3(i, new z16(19, oy5Var)));
                x78 x78Var3 = (x78) arrayList.get(0);
                if (x78Var3.c(oy5Var) && x78Var3.d(oy5Var)) {
                    i2 = 32;
                }
            }
        }
        return i5 | i6 | i2 | i7 | i8;
    }

    @Override // defpackage.f88, defpackage.uj0
    public final void o(long j, boolean z) {
        super.o(j, z);
        r0();
        kgf kgfVar = this.R1;
        kgfVar.k = 0L;
        kgfVar.n = -1L;
        kgfVar.l = -1L;
        this.m2 = -9223372036854775807L;
        this.g2 = -9223372036854775807L;
        this.k2 = 0;
        if (!z) {
            this.h2 = -9223372036854775807L;
        } else {
            long j2 = this.T1;
            this.h2 = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        }
    }

    @Override // defpackage.uj0
    public final void p() {
        try {
            try {
                F();
                g0();
                er4 er4Var = this.O0;
                if (er4Var != null) {
                    er4Var.f(null);
                }
                this.O0 = null;
            } catch (Throwable th) {
                er4 er4Var2 = this.O0;
                if (er4Var2 != null) {
                    er4Var2.f(null);
                }
                this.O0 = null;
                throw th;
            }
        } finally {
            ct4 ct4Var = this.a2;
            if (ct4Var != null) {
                if (this.Z1 == ct4Var) {
                    this.Z1 = null;
                }
                ct4Var.release();
                this.a2 = null;
            }
        }
    }

    @Override // defpackage.uj0
    public final void q() {
        this.j2 = 0;
        this.i2 = SystemClock.elapsedRealtime();
        this.n2 = SystemClock.elapsedRealtime() * 1000;
        this.o2 = 0L;
        this.p2 = 0;
        kgf kgfVar = this.R1;
        kgfVar.b = true;
        kgfVar.k = 0L;
        kgfVar.n = -1L;
        kgfVar.l = -1L;
        fgf fgfVar = kgfVar.q;
        if (fgfVar != null) {
            igf igfVar = (igf) kgfVar.r;
            igfVar.getClass();
            igfVar.b.sendEmptyMessage(1);
            fgfVar.b(new gte(11, kgfVar));
        }
        kgfVar.d(false);
    }

    @Override // defpackage.uj0
    public final void r() {
        this.h2 = -9223372036854775807L;
        w0();
        int i = this.p2;
        if (i != 0) {
            long j = this.o2;
            wva wvaVar = this.S1;
            Handler handler = (Handler) wvaVar.b;
            if (handler != null) {
                handler.post(new ule(wvaVar, j, i, 15));
            }
            this.o2 = 0L;
            this.p2 = 0;
        }
        kgf kgfVar = this.R1;
        kgfVar.b = false;
        fgf fgfVar = kgfVar.q;
        if (fgfVar != null) {
            fgfVar.c();
            igf igfVar = (igf) kgfVar.r;
            igfVar.getClass();
            igfVar.b.sendEmptyMessage(2);
        }
        kgfVar.b();
    }

    public final void r0() {
        r78 r78Var;
        this.d2 = false;
        if (maf.a < 23 || !this.v2 || (r78Var = this.U0) == null) {
            return;
        }
        this.x2 = new r88(this, r78Var);
    }

    public final void w0() {
        if (this.j2 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.i2;
            int i = this.j2;
            wva wvaVar = this.S1;
            Handler handler = (Handler) wvaVar.b;
            if (handler != null) {
                handler.post(new ykf(wvaVar, i, j, 0));
            }
            this.j2 = 0;
            this.i2 = jElapsedRealtime;
        }
    }

    public final void x0() {
        this.f2 = true;
        if (this.d2) {
            return;
        }
        this.d2 = true;
        Surface surface = this.Z1;
        wva wvaVar = this.S1;
        Handler handler = (Handler) wvaVar.b;
        if (handler != null) {
            handler.post(new tb2(wvaVar, surface, SystemClock.elapsedRealtime(), 7));
        }
        this.b2 = true;
    }

    public final void y0() {
        int i = this.q2;
        if (i == -1 && this.r2 == -1) {
            return;
        }
        ilf ilfVar = this.u2;
        if (ilfVar != null && ilfVar.a == i && ilfVar.b == this.r2 && ilfVar.c == this.s2 && ilfVar.o == this.t2) {
            return;
        }
        ilf ilfVar2 = new ilf(this.t2, i, this.r2, this.s2);
        this.u2 = ilfVar2;
        wva wvaVar = this.S1;
        Handler handler = (Handler) wvaVar.b;
        if (handler != null) {
            handler.post(new fre(wvaVar, 11, ilfVar2));
        }
    }

    @Override // defpackage.f88, defpackage.uj0
    public final void z(float f, float f2) throws Exception {
        super.z(f, f2);
        kgf kgfVar = this.R1;
        kgfVar.g = f;
        kgfVar.k = 0L;
        kgfVar.n = -1L;
        kgfVar.l = -1L;
        kgfVar.d(false);
    }

    public final void z0(r78 r78Var, int i) {
        y0();
        j47.k("releaseOutputBuffer");
        r78Var.releaseOutputBuffer(i, true);
        j47.A();
        this.n2 = SystemClock.elapsedRealtime() * 1000;
        this.L1.f++;
        this.k2 = 0;
        x0();
    }
}
