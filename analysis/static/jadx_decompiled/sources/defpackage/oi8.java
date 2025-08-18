package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;

/* loaded from: classes.dex */
public abstract class oi8 {
    public static void a(bi8 bi8Var, ComponentName componentName) {
        MediaSession mediaSession = bi8Var.a.a;
        mediaSession.getClass();
        mediaSession.setMediaButtonBroadcastReceiver(componentName);
    }
}
