package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import defpackage.oaf;
import defpackage.y78;

/* loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final int a;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, y78 y78Var) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb.append(y78Var == null ? null : y78Var.a);
        super(sb.toString(), illegalStateException);
        int i = oaf.a;
        if (i >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.a = i >= 23 ? illegalStateException instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : oaf.y(diagnosticInfo);
    }
}
