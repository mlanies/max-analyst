package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class p74 {
    public static void a(AudioTrack audioTrack, i4b i4bVar) {
        g4b g4bVar = i4bVar.a;
        g4bVar.getClass();
        LogSessionId logSessionId = g4bVar.a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
