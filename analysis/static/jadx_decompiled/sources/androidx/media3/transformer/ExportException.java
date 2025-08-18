package androidx.media3.transformer;

import android.os.SystemClock;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import defpackage.au1;
import defpackage.efc;
import defpackage.iw6;
import defpackage.qh3;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class ExportException extends Exception {
    public static final efc b;
    public final int a;

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
        iw6Var.J("ERROR_CODE_MUXING_TIMEOUT", 7002);
        iw6Var.J("ERROR_CODE_MUXING_APPEND", 7003);
        b = iw6Var.j();
    }

    public ExportException(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
        SystemClock.elapsedRealtime();
    }

    public static ExportException a(Throwable th, int i) {
        return new ExportException("Asset loader error", th, i);
    }

    public static ExportException b(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, String str) {
        StringBuilder sbM = au1.m("Audio error: ", str, ", audioFormat=");
        sbM.append(audioProcessor$UnhandledAudioFormatException.a);
        return new ExportException(sbM.toString(), audioProcessor$UnhandledAudioFormatException, 6001);
    }

    public static ExportException c(Throwable th, int i, qh3 qh3Var) {
        return new ExportException("Codec exception: " + qh3Var, th, i);
    }

    public static ExportException d(Exception exc, int i) {
        return new ExportException("Muxer error", exc, i);
    }

    public static ExportException e(Exception exc) {
        return exc instanceof RuntimeException ? new ExportException("Unexpected runtime error", exc, MultiFileUploader.MSG_TRY_UPLOAD_NEXT) : new ExportException("Unexpected error", exc, 1000);
    }
}
