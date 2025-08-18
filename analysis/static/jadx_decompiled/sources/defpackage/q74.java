package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class q74 {
    public static void a(AudioTrack audioTrack, j4b j4bVar) {
        h4b h4bVar = j4bVar.b;
        h4bVar.getClass();
        LogSessionId logSessionId = h4bVar.a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
