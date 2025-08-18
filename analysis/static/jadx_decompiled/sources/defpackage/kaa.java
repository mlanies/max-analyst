package defpackage;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class kaa {
    public final Context a;
    public final xs b;
    public final xs c;
    public final xs d;
    public final khe e;

    public kaa(Context context, p84 p84Var) {
        this.a = context;
        p84Var.getClass();
        this.b = ay7.d("ru.oneme.app.dialogs", "ru.oneme.app.chats", "ru.oneme.app.inapp.2");
        this.c = ay7.d("ru.oneme.app.new.incomingCalls.", "ru.oneme.app.new.activeCalls");
        this.d = ay7.d("ru.oneme.app.misc", "ru.oneme.app.fileUpload", "ru.oneme.app.media");
        this.e = new khe(new zj7(17, this));
    }

    public final void a(int i, String str) {
        ((NotificationManager) this.e.getValue()).createNotificationChannelGroup(new NotificationChannelGroup(str, this.a.getString(i)));
    }

    public final String b(String str) {
        if (this.b.contains(str)) {
            return "ru.oneme.app.notifications.group.chats";
        }
        if (this.d.contains(str)) {
            return "ru.oneme.app.notifications.group.other";
        }
        if (this.c.contains(str)) {
            return "ru.oneme.app.notifications.group.calls";
        }
        return null;
    }
}
