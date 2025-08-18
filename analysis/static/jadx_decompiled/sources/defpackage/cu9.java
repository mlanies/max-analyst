package defpackage;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class cu9 {
    public static Notification.Builder a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    public static Notification.Builder b(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }
}
