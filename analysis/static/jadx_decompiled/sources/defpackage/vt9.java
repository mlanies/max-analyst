package defpackage;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;

/* loaded from: classes.dex */
public abstract class vt9 {
    @SuppressLint({"MissingPermission"})
    public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i, pendingIntent);
        }
        return mediaStyle;
    }
}
