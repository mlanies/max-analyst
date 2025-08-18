package defpackage;

/* loaded from: classes2.dex */
public enum ks4 {
    DO_NOT_DISTURB_MODE("do_not_disturb_mode"),
    CHAT_MUTED("chat_muted"),
    SKIPPED_NOTIF_MESSAGE("skipped_notif_message"),
    NOTIFICATIONS_LIMIT("notifications_limit"),
    MESSAGES_LIMIT("messages_limit"),
    NOTIFICATION_CHANNEL_DISABLED("notif_channel_disabled"),
    NOTIFICATION_GROUP_CHANNEL_DISABLED("notif_group_channel_disabled"),
    SYSTEM_APP_NOTIF_DISABLED("system_app_notif_disabled");

    public static final ks4[] b = values();
    public final String a;

    ks4(String str) {
        this.a = str;
    }
}
