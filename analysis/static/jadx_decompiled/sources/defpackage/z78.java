package defpackage;

/* loaded from: classes.dex */
public abstract class z78 {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        r5 = new android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r6 >= r1.size()) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        if (r1.get(r6).covers(r5) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (r7 != 1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.media.MediaCodecInfo.VideoCapabilities r4, int r5, int r6, double r7) {
        /*
            java.util.List r4 = r4.getSupportedPerformancePoints()
            r0 = 0
            if (r4 == 0) goto Lc3
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Lf
            goto Lc3
        Lf:
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r1 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
            int r7 = (int) r7
            r1.<init>(r5, r6, r7)
            r5 = r0
        L16:
            int r6 = r4.size()
            r7 = 2
            r8 = 1
            if (r5 >= r6) goto L2f
            java.lang.Object r6 = r4.get(r5)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r6 = (android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint) r6
            boolean r6 = r6.covers(r1)
            if (r6 == 0) goto L2c
            r4 = r7
            goto L30
        L2c:
            int r5 = r5 + 1
            goto L16
        L2f:
            r4 = r8
        L30:
            if (r4 != r8) goto Lc2
            java.lang.Boolean r5 = defpackage.s36.g
            if (r5 != 0) goto Lc2
            int r5 = defpackage.oaf.a
            r6 = 35
            if (r5 < r6) goto L3f
        L3c:
            r8 = r0
            goto Lb9
        L3f:
            ny5 r5 = new ny5     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            r5.<init>()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            java.lang.String r6 = "video/avc"
            java.lang.String r6 = defpackage.ia9.l(r6)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            r5.m = r6     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            qy5 r6 = new qy5     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            r6.<init>(r5)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            java.lang.String r5 = r6.n     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            if (r5 == 0) goto Lb9
            xw0 r5 = defpackage.xw0.Z     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            ffc r5 = defpackage.p88.g(r5, r6, r0, r0)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            r6 = r0
        L5c:
            int r1 = r5.o     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            if (r6 >= r1) goto Lb9
            java.lang.Object r1 = r5.get(r6)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            y78 r1 = (defpackage.y78) r1     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            android.media.MediaCodecInfo$CodecCapabilities r1 = r1.d     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = r5.get(r6)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            y78 r1 = (defpackage.y78) r1     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            android.media.MediaCodecInfo$CodecCapabilities r1 = r1.d     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            android.media.MediaCodecInfo$VideoCapabilities r1 = r1.getVideoCapabilities()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = r5.get(r6)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            y78 r1 = (defpackage.y78) r1     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            android.media.MediaCodecInfo$CodecCapabilities r1 = r1.d     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            android.media.MediaCodecInfo$VideoCapabilities r1 = r1.getVideoCapabilities()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            java.util.List r1 = r1.getSupportedPerformancePoints()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            if (r1 == 0) goto Lb6
            boolean r2 = r1.isEmpty()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            if (r2 != 0) goto Lb6
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r5 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            r6 = 1280(0x500, float:1.794E-42)
            r2 = 720(0x2d0, float:1.009E-42)
            r3 = 60
            r5.<init>(r6, r2, r3)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            r6 = r0
        L9c:
            int r2 = r1.size()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            if (r6 >= r2) goto Lb2
            java.lang.Object r2 = r1.get(r6)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r2 = (android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint) r2     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            boolean r2 = r2.covers(r5)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException -> Lb9
            if (r2 == 0) goto Laf
            goto Lb3
        Laf:
            int r6 = r6 + 1
            goto L9c
        Lb2:
            r7 = r8
        Lb3:
            if (r7 != r8) goto L3c
            goto Lb9
        Lb6:
            int r6 = r6 + 1
            goto L5c
        Lb9:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            defpackage.s36.g = r5
            if (r8 == 0) goto Lc2
            return r0
        Lc2:
            return r4
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z78.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }
}
