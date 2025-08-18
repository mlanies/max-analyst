package ru.ok.android.externcalls.sdk.video;

import defpackage.oe1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.EglBase;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u001a\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\r2\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H'¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/video/VideoRenderManager;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "participantId", "", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "", "Lorg/webrtc/VideoSink;", "getRenderers", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Ljava/util/Map;", "key", "renderers", "Le5f;", "setRenderers", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Ljava/util/List;)V", "Loe1;", "getCallRenderer", "()Loe1;", "callRenderer", "Lorg/webrtc/EglBase$Context;", "getEglBaseContext", "()Lorg/webrtc/EglBase$Context;", "eglBaseContext", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface VideoRenderManager {
    oe1 getCallRenderer();

    EglBase.Context getEglBaseContext();

    Map<ConversationVideoTrackParticipantKey, List<VideoSink>> getRenderers(ParticipantId participantId);

    void setRenderers(ConversationVideoTrackParticipantKey key, List<VideoSink> renderers);
}
