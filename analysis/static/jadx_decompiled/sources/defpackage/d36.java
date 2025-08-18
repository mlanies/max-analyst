package defpackage;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class d36 {
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, i4b i4bVar) {
        g4b g4bVar = i4bVar.a;
        g4bVar.getClass();
        LogSessionId logSessionId = g4bVar.a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        xs3.e(playbackComponent).setLogSessionId(logSessionId);
    }
}
