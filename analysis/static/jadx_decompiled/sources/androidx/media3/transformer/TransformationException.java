package androidx.media3.transformer;

import defpackage.iw6;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

@Deprecated
/* loaded from: classes.dex */
public final class TransformationException extends Exception {
    static {
        iw6 iw6Var = new iw6(4);
        iw6Var.J("ERROR_CODE_FAILED_RUNTIME_CHECK", Integer.valueOf(MultiFileUploader.MSG_TRY_UPLOAD_NEXT));
        iw6Var.J("ERROR_CODE_IO_UNSPECIFIED", 2000);
        iw6Var.J("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001);
        iw6Var.J("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002);
        iw6Var.J("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003);
        iw6Var.J("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004);
        iw6Var.J("ERROR_CODE_IO_FILE_NOT_FOUND", 2005);
        iw6Var.J("ERROR_CODE_IO_NO_PERMISSION", 2006);
        iw6Var.J("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007);
        iw6Var.J("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008);
        iw6Var.J("ERROR_CODE_DECODER_INIT_FAILED", 3001);
        iw6Var.J("ERROR_CODE_DECODING_FAILED", 3002);
        iw6Var.J("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003);
        iw6Var.J("ERROR_CODE_ENCODER_INIT_FAILED", 4001);
        iw6Var.J("ERROR_CODE_ENCODING_FAILED", 4002);
        iw6Var.J("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003);
        iw6Var.J("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001);
        iw6Var.J("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001);
        iw6Var.J("ERROR_CODE_MUXING_FAILED", 7001);
        iw6Var.j();
    }
}
