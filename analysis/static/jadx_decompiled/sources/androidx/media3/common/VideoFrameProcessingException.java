package androidx.media3.common;

/* loaded from: classes.dex */
public final class VideoFrameProcessingException extends Exception {
    public static VideoFrameProcessingException a(Exception exc) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc);
    }
}
