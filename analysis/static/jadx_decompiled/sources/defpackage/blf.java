package defpackage;

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* loaded from: classes2.dex */
public final class blf implements VideoSink {
    public volatile VideoSink a;

    public final void a(VideoFrame videoFrame) {
        VideoSink videoSink = this.a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        a(videoFrame);
    }
}
