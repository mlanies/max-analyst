package ru.ok.android.externcalls.sdk.video;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B1\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u001c\u0010\b\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R*\u0010\b\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/video/VideoSinkWrapper;", "Lorg/webrtc/VideoSink;", "T", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "key", "", "", "delegates", "<init>", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Ljava/util/Map;)V", "Lorg/webrtc/VideoFrame;", "frame", "Le5f;", "onFrame", "(Lorg/webrtc/VideoFrame;)V", "", "toString", "()Ljava/lang/String;", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Ljava/util/Map;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class VideoSinkWrapper<T extends VideoSink> implements VideoSink {
    private final Map<ConversationVideoTrackParticipantKey, List<T>> delegates;
    private final ConversationVideoTrackParticipantKey key;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoSinkWrapper(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, Map<ConversationVideoTrackParticipantKey, ? extends List<? extends T>> map) {
        this.key = conversationVideoTrackParticipantKey;
        this.delegates = map;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame frame) {
        List<T> list = this.delegates.get(this.key);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((VideoSink) it.next()).onFrame(frame);
            }
        }
    }

    public String toString() {
        return this.key.getParticipantId() + "[" + hashCode() + "]";
    }
}
