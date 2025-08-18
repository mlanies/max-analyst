package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class x78 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public x78(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = ha9.j(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(maf.g(i, widthAlignment) * widthAlignment, maf.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.x78 g(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            x78 r13 = new x78
            r14 = 0
            r0 = 1
            if (r11 == 0) goto L3d
            int r1 = defpackage.maf.a
            r2 = 19
            if (r1 < r2) goto L3d
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L3d
            r2 = 22
            if (r1 > r2) goto L3b
            java.lang.String r1 = defpackage.maf.d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L2a
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L3b
        L2a:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L3d
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L3b
            goto L3d
        L3b:
            r6 = r0
            goto L3e
        L3d:
            r6 = r14
        L3e:
            r1 = 21
            if (r11 == 0) goto L4c
            int r2 = defpackage.maf.a
            if (r2 < r1) goto L4c
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L4c:
            if (r15 != 0) goto L5f
            if (r11 == 0) goto L5d
            int r15 = defpackage.maf.a
            if (r15 < r1) goto L5d
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L5d
            goto L5f
        L5d:
            r7 = r14
            goto L60
        L5f:
            r7 = r0
        L60:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x78.g(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):x78");
    }

    public final r54 b(oy5 oy5Var, oy5 oy5Var2) {
        int i = !maf.a(oy5Var.w0, oy5Var2.w0) ? 8 : 0;
        if (this.h) {
            if (oy5Var.E0 != oy5Var2.E0) {
                i |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            if (!this.e && (oy5Var.B0 != oy5Var2.B0 || oy5Var.C0 != oy5Var2.C0)) {
                i |= 512;
            }
            if (!maf.a(oy5Var.I0, oy5Var2.I0)) {
                i |= 2048;
            }
            if (maf.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !oy5Var.c(oy5Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new r54(this.a, oy5Var, oy5Var2, oy5Var.c(oy5Var2) ? 3 : 2, 0);
            }
        } else {
            if (oy5Var.J0 != oy5Var2.J0) {
                i |= 4096;
            }
            if (oy5Var.K0 != oy5Var2.K0) {
                i |= 8192;
            }
            if (oy5Var.L0 != oy5Var2.L0) {
                i |= 16384;
            }
            String str = this.b;
            if (i == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = o88.d(oy5Var);
                Pair pairD2 = o88.d(oy5Var2);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new r54(this.a, oy5Var, oy5Var2, 3, 0);
                    }
                }
            }
            if (!oy5Var.c(oy5Var2)) {
                i |= 32;
            }
            if ("audio/opus".equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new r54(this.a, oy5Var, oy5Var2, 1, 0);
            }
        }
        return new r54(this.a, oy5Var, oy5Var2, 0, i);
    }

    public final boolean c(oy5 oy5Var) {
        int i;
        Pair pairD;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        String str = oy5Var.w0;
        String str2 = this.b;
        if (!str2.equals(str) && !str2.equals(o88.b(oy5Var))) {
            return false;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        int i2 = 16;
        boolean z = this.h;
        String str3 = oy5Var.t0;
        if (str3 != null && (pairD = o88.d(oy5Var)) != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            int iIntValue2 = ((Integer) pairD.second).intValue();
            int i3 = 2;
            if ("video/dolby-vision".equals(oy5Var.w0)) {
                if ("video/avc".equals(str2)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(str2)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (z || iIntValue == 42) {
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (maf.a <= 23 && "video/x-vnd.on2.vp9".equals(str2) && codecProfileLevelArr.length == 0) {
                    int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i3 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    } else if (iIntValue3 >= 120000000) {
                        i3 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i3 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i3 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i3 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i3 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i3 = 16;
                    } else if (iIntValue3 >= 3600000) {
                        i3 = 8;
                    } else if (iIntValue3 >= 1800000) {
                        i3 = 4;
                    } else if (iIntValue3 < 800000) {
                        i3 = 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i3;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile != iIntValue || codecProfileLevel2.level < iIntValue2) {
                    }
                }
                int length = str3.length() + 22;
                String str4 = this.c;
                StringBuilder sb = new StringBuilder(rh4.e(length, str4));
                sb.append("codec.profileLevel, ");
                sb.append(str3);
                sb.append(", ");
                sb.append(str4);
                f(sb.toString());
                return false;
            }
        }
        if (z) {
            int i4 = oy5Var.B0;
            if (i4 <= 0 || (i = oy5Var.C0) <= 0) {
                return true;
            }
            if (maf.a >= 21) {
                return e(i4, i, oy5Var.D0);
            }
            boolean z2 = i4 * i <= o88.i();
            if (!z2) {
                StringBuilder sb2 = new StringBuilder(40);
                sb2.append("legacyFrameSize, ");
                sb2.append(i4);
                sb2.append("x");
                sb2.append(i);
                f(sb2.toString());
            }
            return z2;
        }
        int i5 = maf.a;
        if (i5 >= 21) {
            int i6 = oy5Var.K0;
            if (i6 != -1) {
                if (codecCapabilities == null) {
                    f("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    f("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i6)) {
                    StringBuilder sb3 = new StringBuilder(31);
                    sb3.append("sampleRate.support, ");
                    sb3.append(i6);
                    f(sb3.toString());
                    return false;
                }
            }
            int i7 = oy5Var.J0;
            if (i7 != -1) {
                if (codecCapabilities == null) {
                    f("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    f("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i5 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i2 = 6;
                    } else if (!"audio/eac3".equals(str2)) {
                        i2 = 30;
                    }
                    new StringBuilder(rh4.e(59, this.a));
                    maxInputChannelCount = i2;
                }
                if (maxInputChannelCount < i7) {
                    StringBuilder sb4 = new StringBuilder(33);
                    sb4.append("channelCount.support, ");
                    sb4.append(i7);
                    f(sb4.toString());
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean d(oy5 oy5Var) {
        if (this.h) {
            return this.e;
        }
        Pair pairD = o88.d(oy5Var);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final boolean e(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            f("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            f("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i, i2, d)) {
            return true;
        }
        if (i < i2) {
            String str = this.a;
            if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(maf.b)) && a(videoCapabilities, i2, i, d)) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.rotated, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d);
                String string = sb.toString();
                new StringBuilder(rh4.e(rh4.e(rh4.e(rh4.e(25, string), str), this.b), maf.e));
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder(69);
        sb2.append("sizeAndRate.support, ");
        sb2.append(i);
        sb2.append("x");
        sb2.append(i2);
        sb2.append("x");
        sb2.append(d);
        f(sb2.toString());
        return false;
    }

    public final void f(String str) {
        new StringBuilder(rh4.e(rh4.e(rh4.e(rh4.e(20, str), this.a), this.b), maf.e));
    }

    public final String toString() {
        return this.a;
    }
}
