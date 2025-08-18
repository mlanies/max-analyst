package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* loaded from: classes2.dex */
public final class jqa implements VideoSink {
    public final String a;
    public long b = -1;
    public final /* synthetic */ kqa c;

    public jqa(kqa kqaVar, String str) {
        this.c = kqaVar;
        this.a = str;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        Long compactParticipantId = videoFrame.getCompactParticipantId();
        if (compactParticipantId == null) {
            compactParticipantId = -1L;
        }
        if (compactParticipantId.longValue() != this.b) {
            this.b = compactParticipantId.longValue();
            if (compactParticipantId.longValue() == -1) {
                compactParticipantId = null;
            }
            kqa kqaVar = this.c;
            ConcurrentHashMap concurrentHashMap = kqaVar.v0;
            String str = this.a;
            fp1 fp1Var = (fp1) concurrentHashMap.get(str);
            ConcurrentHashMap concurrentHashMap2 = kqaVar.w0;
            ConcurrentHashMap concurrentHashMap3 = kqaVar.v0;
            if (fp1Var != null) {
                concurrentHashMap3.remove(str, fp1Var);
                concurrentHashMap2.remove(fp1Var, str);
            }
            if (compactParticipantId != null) {
                fp1 fp1Var2 = (fp1) ((ConcurrentHashMap) ((o9g) kqaVar.X).b).get(Integer.valueOf((int) compactParticipantId.longValue()));
                if (fp1Var2 != null) {
                    concurrentHashMap3.put(str, fp1Var2);
                    concurrentHashMap2.put(fp1Var2, str);
                }
            }
        }
    }
}
