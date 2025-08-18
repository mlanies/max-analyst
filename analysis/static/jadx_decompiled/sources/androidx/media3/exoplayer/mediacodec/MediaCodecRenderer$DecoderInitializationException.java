package androidx.media3.exoplayer.mediacodec;

import defpackage.qy5;
import defpackage.y78;

/* loaded from: classes.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {
    public final String a;
    public final boolean b;
    public final y78 c;
    public final String o;

    public MediaCodecRenderer$DecoderInitializationException(qy5 qy5Var, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + qy5Var, mediaCodecUtil$DecoderQueryException, qy5Var.n, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, y78 y78Var, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = y78Var;
        this.o = str3;
    }
}
