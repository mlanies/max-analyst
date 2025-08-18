package defpackage;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class tu9 {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }
}
