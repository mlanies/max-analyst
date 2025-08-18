package androidx.media3.common;

import android.os.Bundle;
import defpackage.oaf;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public class PlaybackException extends Exception {
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String o;
    public static final String s0;
    public static final String t0;
    public final int a;
    public final long b;
    public final Bundle c;

    static {
        int i = oaf.a;
        o = Integer.toString(0, 36);
        X = Integer.toString(1, 36);
        Y = Integer.toString(2, 36);
        Z = Integer.toString(3, 36);
        s0 = Integer.toString(4, 36);
        t0 = Integer.toString(5, 36);
    }

    public PlaybackException(String str, Throwable th, int i, Bundle bundle, long j) {
        super(str, th);
        this.a = i;
        this.c = bundle;
        this.b = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r3 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(androidx.media3.common.PlaybackException r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L60
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L12
            goto L60
        L12:
            java.lang.Throwable r2 = r6.getCause()
            java.lang.Throwable r3 = r7.getCause()
            if (r2 == 0) goto L3c
            if (r3 == 0) goto L3c
            java.lang.String r4 = r2.getMessage()
            java.lang.String r5 = r3.getMessage()
            boolean r4 = defpackage.oaf.a(r4, r5)
            if (r4 != 0) goto L2d
            return r1
        L2d:
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r3 = r3.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            return r1
        L3c:
            if (r2 != 0) goto L60
            if (r3 == 0) goto L41
            goto L60
        L41:
            int r2 = r6.a
            int r3 = r7.a
            if (r2 != r3) goto L5e
            java.lang.String r2 = r6.getMessage()
            java.lang.String r3 = r7.getMessage()
            boolean r2 = defpackage.oaf.a(r2, r3)
            if (r2 == 0) goto L5e
            long r2 = r6.b
            long r6 = r7.b
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 != 0) goto L5e
            goto L5f
        L5e:
            r0 = r1
        L5f:
            return r0
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.PlaybackException.a(androidx.media3.common.PlaybackException):boolean");
    }

    public final String b() {
        int i = this.a;
        if (i == -100) {
            return "ERROR_CODE_DISCONNECTED";
        }
        if (i == -6) {
            return "ERROR_CODE_NOT_SUPPORTED";
        }
        if (i == -4) {
            return "ERROR_CODE_PERMISSION_DENIED";
        }
        if (i == -3) {
            return "ERROR_CODE_BAD_VALUE";
        }
        if (i == -2) {
            return "ERROR_CODE_INVALID_STATE";
        }
        if (i == 7000) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        }
        if (i == 7001) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        switch (i) {
            case -110:
                return "ERROR_CODE_CONTENT_ALREADY_PLAYING";
            case -109:
                return "ERROR_CODE_END_OF_PLAYLIST";
            case -108:
                return "ERROR_CODE_SETUP_REQUIRED";
            case -107:
                return "ERROR_CODE_SKIP_LIMIT_REACHED";
            case -106:
                return "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
            case -105:
                return "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
            case -104:
                return "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
            case -103:
                return "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
            case -102:
                return "ERROR_CODE_AUTHENTICATION_EXPIRED";
            default:
                switch (i) {
                    case 1000:
                        return "ERROR_CODE_UNSPECIFIED";
                    case MultiFileUploader.MSG_TRY_UPLOAD_NEXT /* 1001 */:
                        return "ERROR_CODE_REMOTE_ERROR";
                    case 1002:
                        return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                    case 1003:
                        return "ERROR_CODE_TIMEOUT";
                    case 1004:
                        return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                    default:
                        switch (i) {
                            case 2000:
                                return "ERROR_CODE_IO_UNSPECIFIED";
                            case 2001:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                            case 2002:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                            case 2003:
                                return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                            case 2004:
                                return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                            case 2005:
                                return "ERROR_CODE_IO_FILE_NOT_FOUND";
                            case 2006:
                                return "ERROR_CODE_IO_NO_PERMISSION";
                            case 2007:
                                return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                            case 2008:
                                return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                            default:
                                switch (i) {
                                    case 3001:
                                        return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                    case 3002:
                                        return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                    case 3003:
                                        return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                    case 3004:
                                        return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                    default:
                                        switch (i) {
                                            case 4001:
                                                return "ERROR_CODE_DECODER_INIT_FAILED";
                                            case 4002:
                                                return "ERROR_CODE_DECODER_QUERY_FAILED";
                                            case 4003:
                                                return "ERROR_CODE_DECODING_FAILED";
                                            case 4004:
                                                return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                            case 4005:
                                                return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                            case 4006:
                                                return "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                            default:
                                                switch (i) {
                                                    case 5001:
                                                        return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                    case 5002:
                                                        return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                    case 5003:
                                                        return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                    case 5004:
                                                        return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                    default:
                                                        switch (i) {
                                                            case 6000:
                                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                                            case 6001:
                                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                            case 6002:
                                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                            case 6003:
                                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                            case 6004:
                                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                            case 6005:
                                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                            case 6006:
                                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                            case 6007:
                                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                            case 6008:
                                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                            default:
                                                                return i >= 1000000 ? "custom error code" : "invalid error code";
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(o, this.a);
        bundle.putLong(X, this.b);
        bundle.putString(Y, getMessage());
        bundle.putBundle(t0, this.c);
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(Z, cause.getClass().getName());
            bundle.putString(s0, cause.getMessage());
        }
        return bundle;
    }
}
