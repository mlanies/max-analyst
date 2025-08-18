package ru.ok.android.externcalls.sdk.renderer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u0010\u0010\u0011R`\u0010\u0015\u001aN\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00130\u0012j&\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0013`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/sdk/renderer/ConversationRenderers;", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "key", "", "Lorg/webrtc/VideoSink;", "renderers", "Le5f;", "setRenderers", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Ljava/util/List;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "", "getRenderers", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Ljava/util/Map;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "renderersMap", "Ljava/util/HashMap;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ConversationRenderers {
    private final HashMap<ParticipantId, Map<ConversationVideoTrackParticipantKey, List<VideoSink>>> renderersMap = new HashMap<>();

    public final Map<ConversationVideoTrackParticipantKey, List<VideoSink>> getRenderers(ParticipantId participantId) {
        HashMap map = new HashMap();
        HashMap<ParticipantId, Map<ConversationVideoTrackParticipantKey, List<VideoSink>>> map2 = this.renderersMap;
        Map<ConversationVideoTrackParticipantKey, List<VideoSink>> map3 = map2.get(participantId);
        if (map3 == null) {
            map3 = new HashMap<>();
            map2.put(participantId, map3);
        }
        for (Map.Entry<ConversationVideoTrackParticipantKey, List<VideoSink>> entry : map3.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    public final void setRenderers(ConversationVideoTrackParticipantKey key, List<? extends VideoSink> renderers) {
        HashMap<ParticipantId, Map<ConversationVideoTrackParticipantKey, List<VideoSink>>> map = this.renderersMap;
        ParticipantId participantId = key.getParticipantId();
        Map<ConversationVideoTrackParticipantKey, List<VideoSink>> map2 = map.get(participantId);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(participantId, map2);
        }
        map2.put(key, renderers);
    }
}
