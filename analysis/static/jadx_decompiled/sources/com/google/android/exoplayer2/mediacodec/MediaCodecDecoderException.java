package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.DecoderException;
import defpackage.maf;
import defpackage.x78;

/* loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {
    /* JADX WARN: Illegal instructions before constructor call */
    public MediaCodecDecoderException(IllegalStateException illegalStateException, x78 x78Var) {
        String strValueOf = String.valueOf(x78Var == null ? null : x78Var.a);
        super(strValueOf.length() != 0 ? "Decoder failed: ".concat(strValueOf) : new String("Decoder failed: "), illegalStateException);
        if (maf.a < 21 || !(illegalStateException instanceof MediaCodec.CodecException)) {
            return;
        }
        ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
    }
}
