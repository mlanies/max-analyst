package defpackage;

/* loaded from: classes2.dex */
public enum cta {
    APP_INIT("app_init"),
    OPEN_CHATS_ROOT_SPAN("open_chats_to_render"),
    OPEN_CHAT_ROOT_SPAN("open_chat_to_render"),
    MAIN_ACTIVITY_INIT_TO_RENDER("main_activity_init_to_render"),
    FOLDERS_INIT_TO_RENDER("folders_init_to_render"),
    CHATS_INIT_TO_RENDER("chats_init_to_render"),
    CHAT_INIT_TO_RENDER("chat_init_to_render");

    public final String a;

    cta(String str) {
        this.a = str;
    }
}
