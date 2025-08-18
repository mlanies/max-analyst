package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* loaded from: classes2.dex */
public final class lqa implements VideoSink {
    public final Map a;
    public final o9g b;

    public lqa(ConcurrentHashMap concurrentHashMap, o9g o9gVar) {
        this.a = concurrentHashMap;
        this.b = o9gVar;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        Long compactParticipantId;
        List list;
        if ((videoFrame.getRotatedWidth() > 16 || videoFrame.getRotatedHeight() > 16) && (compactParticipantId = videoFrame.getCompactParticipantId()) != null) {
            fp1 fp1Var = (fp1) ((ConcurrentHashMap) this.b.b).get(Integer.valueOf((int) compactParticipantId.longValue()));
            if (fp1Var == null || (list = (List) this.a.get(fp1Var)) == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((VideoSink) it.next()).onFrame(videoFrame);
            }
        }
    }
}
