package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class y78 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public y78(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = ia9.k(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(oaf.g(i, widthAlignment) * widthAlignment, oaf.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.y78 h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            y78 r13 = new y78
            r14 = 0
            r0 = 1
            if (r11 == 0) goto L39
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r11.isFeatureSupported(r1)
            if (r1 == 0) goto L39
            int r1 = defpackage.oaf.a
            r2 = 22
            if (r1 > r2) goto L37
            java.lang.String r1 = defpackage.oaf.d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L26
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L37
        L26:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L39
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L37
            goto L39
        L37:
            r6 = r0
            goto L3a
        L39:
            r6 = r14
        L3a:
            r1 = 21
            if (r11 == 0) goto L48
            int r2 = defpackage.oaf.a
            if (r2 < r1) goto L48
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L48:
            if (r15 != 0) goto L5b
            if (r11 == 0) goto L59
            int r15 = defpackage.oaf.a
            if (r15 < r1) goto L59
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L59
            goto L5b
        L59:
            r7 = r14
            goto L5c
        L5b:
            r7 = r0
        L5c:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y78.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):y78");
    }

    public final s54 b(qy5 qy5Var, qy5 qy5Var2) {
        int i = !oaf.a(qy5Var.n, qy5Var2.n) ? 8 : 0;
        if (this.h) {
            if (qy5Var.w != qy5Var2.w) {
                i |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            if (!this.e && (qy5Var.t != qy5Var2.t || qy5Var.u != qy5Var2.u)) {
                i |= 512;
            }
            i63 i63Var = qy5Var.A;
            boolean zF = i63.f(i63Var);
            i63 i63Var2 = qy5Var2.A;
            if ((!zF || !i63.f(i63Var2)) && !oaf.a(i63Var, i63Var2)) {
                i |= 2048;
            }
            if (oaf.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !qy5Var.c(qy5Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new s54(this.a, qy5Var, qy5Var2, qy5Var.c(qy5Var2) ? 3 : 2, 0);
            }
        } else {
            if (qy5Var.B != qy5Var2.B) {
                i |= 4096;
            }
            if (qy5Var.C != qy5Var2.C) {
                i |= 8192;
            }
            if (qy5Var.D != qy5Var2.D) {
                i |= 16384;
            }
            String str = this.b;
            if (i == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = p88.d(qy5Var);
                Pair pairD2 = p88.d(qy5Var2);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new s54(this.a, qy5Var, qy5Var2, 3, 0);
                    }
                }
            }
            if (!qy5Var.c(qy5Var2)) {
                i |= 32;
            }
            if ("audio/opus".equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new s54(this.a, qy5Var, qy5Var2, 1, 0);
            }
        }
        return new s54(this.a, qy5Var, qy5Var2, 0, i);
    }

    public final boolean c(qy5 qy5Var, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairD = p88.d(qy5Var);
        if (pairD == null) {
            return true;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        int iIntValue2 = ((Integer) pairD.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(qy5Var.n);
        int i = 8;
        String str = this.b;
        if (zEquals) {
            if ("video/avc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 8;
            } else if ("video/hevc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 2;
            }
        }
        if (!this.h && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (oaf.a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            } else if (iIntValue3 >= 120000000) {
                i = 512;
            } else if (iIntValue3 >= 60000000) {
                i = 256;
            } else if (iIntValue3 >= 30000000) {
                i = 128;
            } else if (iIntValue3 >= 18000000) {
                i = 64;
            } else if (iIntValue3 >= 12000000) {
                i = 32;
            } else if (iIntValue3 >= 7200000) {
                i = 16;
            } else if (iIntValue3 < 3600000) {
                i = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z)) {
                if ("video/hevc".equals(str) && 2 == iIntValue) {
                    String str2 = oaf.b;
                    if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        g("codec.profileLevel, " + qy5Var.j + ", " + this.c);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.qy5 r9) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y78.d(qy5):boolean");
    }

    public final boolean e(qy5 qy5Var) {
        if (this.h) {
            return this.e;
        }
        Pair pairD = p88.d(qy5Var);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final boolean f(int i, int i2, double d) {
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        int i3 = oaf.a;
        if (i3 >= 29) {
            int iA = (i3 < 29 || ((bool = s36.g) != null && bool.booleanValue())) ? 0 : z78.a(videoCapabilities, i, i2, d);
            if (iA == 2) {
                return true;
            }
            if (iA == 1) {
                StringBuilder sbJ = wg0.j("sizeAndRate.cover, ", i, "x", i2, "@");
                sbJ.append(d);
                g(sbJ.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(oaf.b)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder sbJ2 = wg0.j("sizeAndRate.rotated, ", i, "x", i2, "@");
                    sbJ2.append(d);
                    StringBuilder sbK = k7d.k("AssumedSupport [", sbJ2.toString(), "] [", str, ", ");
                    sbK.append(this.b);
                    sbK.append("] [");
                    sbK.append(oaf.e);
                    sbK.append("]");
                    z04.t(sbK.toString());
                }
            }
            StringBuilder sbJ3 = wg0.j("sizeAndRate.support, ", i, "x", i2, "@");
            sbJ3.append(d);
            g(sbJ3.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder sbM = au1.m("NoSupport [", str, "] [");
        sbM.append(this.a);
        sbM.append(", ");
        sbM.append(this.b);
        sbM.append("] [");
        sbM.append(oaf.e);
        sbM.append("]");
        z04.t(sbM.toString());
    }

    public final String toString() {
        return this.a;
    }
}
