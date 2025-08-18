package defpackage;

import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class b88 {
    public static void a(n78 n78Var, i4b i4bVar) {
        g4b g4bVar = i4bVar.a;
        g4bVar.getClass();
        LogSessionId logSessionId = g4bVar.a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        n78Var.b.setString("log-session-id", logSessionId.getStringId());
    }
}
