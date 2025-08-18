package defpackage;

import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class c88 {
    public static void a(o78 o78Var, j4b j4bVar) {
        h4b h4bVar = j4bVar.b;
        h4bVar.getClass();
        LogSessionId logSessionId = h4bVar.a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        o78Var.b.setString("log-session-id", logSessionId.getStringId());
    }
}
