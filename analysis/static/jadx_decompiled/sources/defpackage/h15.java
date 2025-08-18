package defpackage;

import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import android.util.Size;

/* loaded from: classes.dex */
public abstract class h15 {
    public static final ms a = new ms();

    public static int a(int i, int i2) {
        if (i % 10 != 1) {
            return Math.round(i / i2) * i2;
        }
        return (int) (Math.floor(i / i2) * i2);
    }

    public static int b(MediaCodecInfo mediaCodecInfo, String str, int i) {
        int iMax = -1;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i) {
                iMax = Math.max(iMax, codecProfileLevel.level);
            }
        }
        return iMax;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ffc c(int r7, java.lang.String r8) {
        /*
            r8.getClass()
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 6
            r4 = 7
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1662735862: goto L39;
                case -1662541442: goto L2e;
                case 1331836730: goto L25;
                case 1599127257: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = r5
            goto L43
        L1a:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L23
            goto L18
        L23:
            r0 = 3
            goto L43
        L25:
            java.lang.String r6 = "video/avc"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L43
            goto L18
        L2e:
            java.lang.String r0 = "video/hevc"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L37
            goto L18
        L37:
            r0 = 1
            goto L43
        L39:
            java.lang.String r0 = "video/av01"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L42
            goto L18
        L42:
            r0 = 0
        L43:
            switch(r0) {
                case 0: goto L71;
                case 1: goto L63;
                case 2: goto L56;
                case 3: goto L47;
                default: goto L46;
            }
        L46:
            goto L7f
        L47:
            if (r7 == r4) goto L4b
            if (r7 != r3) goto L7f
        L4b:
            r7 = 8192(0x2000, float:1.148E-41)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            ffc r7 = defpackage.zw6.o(r2, r7)
            return r7
        L56:
            if (r7 != r4) goto L7f
            r7 = 16
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            ffc r7 = defpackage.zw6.n(r7)
            return r7
        L63:
            if (r7 != r4) goto L6a
            ffc r7 = defpackage.zw6.n(r1)
            return r7
        L6a:
            if (r7 != r3) goto L7f
            ffc r7 = defpackage.zw6.n(r2)
            return r7
        L71:
            if (r7 != r4) goto L78
            ffc r7 = defpackage.zw6.n(r1)
            return r7
        L78:
            if (r7 != r3) goto L7f
            ffc r7 = defpackage.zw6.n(r2)
            return r7
        L7f:
            ls5 r7 = defpackage.zw6.b
            ffc r7 = defpackage.ffc.X
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h15.c(int, java.lang.String):ffc");
    }

    public static Range d(MediaCodecInfo mediaCodecInfo, String str) {
        return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getBitrateRange();
    }

    public static zw6 e(MediaCodecInfo mediaCodecInfo, String str) {
        return zw6.j(s5c.i(mediaCodecInfo.getCapabilitiesForType(str).colorFormats));
    }

    public static synchronized zw6 f(String str) {
        j();
        return zw6.j(a.f(lz7.T(str)));
    }

    public static ffc g(String str, i63 i63Var) {
        if (oaf.a < 33 || i63Var == null) {
            return zw6.m();
        }
        zw6 zw6VarF = f(str);
        ffc ffcVarC = c(i63Var.c, str);
        ww6 ww6Var = new ww6();
        for (int i = 0; i < zw6VarF.size(); i++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) zw6VarF.get(i);
            if (!mediaCodecInfo.isAlias() && mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("hdr-editing")) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                    if (ffcVarC.contains(Integer.valueOf(codecProfileLevel.profile))) {
                        ww6Var.d(mediaCodecInfo);
                    }
                }
            }
        }
        return ww6Var.j();
    }

    public static Size h(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int iA = a(i, widthAlignment);
        int iA2 = a(i2, heightAlignment);
        if (i(mediaCodecInfo, str, iA, iA2)) {
            return new Size(iA, iA2);
        }
        float[] fArr = {0.95f, 0.9f, 0.85f, 0.8f, 0.75f, 0.7f, 0.6666667f, 0.6f, 0.55f, 0.5f, 0.4f, 0.33333334f, 0.25f};
        for (int i3 = 0; i3 < 13; i3++) {
            float f = fArr[i3];
            int iA3 = a(Math.round(i * f), widthAlignment);
            int iA4 = a(Math.round(i2 * f), heightAlignment);
            if (i(mediaCodecInfo, str, iA3, iA4)) {
                return new Size(iA3, iA4);
            }
        }
        int iIntValue = ((Integer) videoCapabilities.getSupportedHeightsFor(((Integer) videoCapabilities.getSupportedWidths().clamp(Integer.valueOf(i))).intValue()).clamp(Integer.valueOf(i2))).intValue();
        if (iIntValue != i2) {
            i = a((int) Math.round((i * iIntValue) / i2), widthAlignment);
            i2 = a(iIntValue, heightAlignment);
        }
        if (i(mediaCodecInfo, str, i, i2)) {
            return new Size(i, i2);
        }
        return null;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        if (mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().isSizeSupported(i, i2)) {
            return true;
        }
        if (i == 1920 && i2 == 1080) {
            return CamcorderProfile.hasProfile(6);
        }
        if (i == 3840 && i2 == 2160) {
            return CamcorderProfile.hasProfile(8);
        }
        return false;
    }

    public static synchronized void j() {
        ms msVar = a;
        msVar.getClass();
        if (msVar.X == 0) {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                if (mediaCodecInfo.isEncoder()) {
                    for (String str : mediaCodecInfo.getSupportedTypes()) {
                        a.g(lz7.T(str), mediaCodecInfo);
                    }
                }
            }
        }
    }
}
