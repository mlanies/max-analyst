package defpackage;

import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class iqa implements FrameDecorator {
    @Override // ru.ok.android.externcalls.sdk.ui.FrameDecorator
    public final VideoFrame apply(VideoFrame videoFrame) {
        return ParticipantVideoViewManager.setParticipantView$lambda$0(videoFrame);
    }
}
