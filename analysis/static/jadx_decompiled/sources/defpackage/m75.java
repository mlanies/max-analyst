package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* loaded from: classes.dex */
public abstract class m75 {
    public static j4b a(Context context, u75 u75Var, boolean z, String str) {
        MediaMetricsManager mediaMetricsManagerG = xs3.g(context.getSystemService("media_metrics"));
        kd8 kd8Var = mediaMetricsManagerG == null ? null : new kd8(context, mediaMetricsManagerG.createPlaybackSession());
        if (kd8Var == null) {
            z04.c0("MediaMetricsService unavailable.");
            return new j4b(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z) {
            u75Var.getClass();
            i74 i74Var = u75Var.D0;
            i74Var.getClass();
            i74Var.Y.a(kd8Var);
        }
        return new j4b(kd8Var.c.getSessionId(), str);
    }
}
