package defpackage;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class e36 {
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, j4b j4bVar) {
        h4b h4bVar = j4bVar.b;
        h4bVar.getClass();
        LogSessionId logSessionId = h4bVar.a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        xs3.e(playbackComponent).setLogSessionId(logSessionId);
    }
}
