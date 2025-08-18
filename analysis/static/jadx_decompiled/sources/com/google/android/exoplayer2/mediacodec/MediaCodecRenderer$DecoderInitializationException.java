package com.google.android.exoplayer2.mediacodec;

import defpackage.oy5;
import defpackage.x78;

/* loaded from: classes.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {
    public final String a;
    public final boolean b;
    public final x78 c;
    public final String o;

    public MediaCodecRenderer$DecoderInitializationException(oy5 oy5Var, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        String strValueOf = String.valueOf(oy5Var);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(strValueOf);
        String string = sb.toString();
        String str = oy5Var.w0;
        String str2 = i < 0 ? "neg_" : "";
        int iAbs = Math.abs(i);
        StringBuilder sb2 = new StringBuilder(str2.length() + 71);
        sb2.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
        sb2.append(str2);
        sb2.append(iAbs);
        this(string, mediaCodecUtil$DecoderQueryException, str, z, null, sb2.toString());
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, x78 x78Var, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = x78Var;
        this.o = str3;
    }
}
