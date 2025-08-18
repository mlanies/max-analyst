package ru.ok.android.externcalls.sdk.chat;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/ChatStateListener;", "", "", ApiProtocol.PARAM_CHAT_ID, "Le5f;", "onChatCreated", "(J)V", "onChatUpdated", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface ChatStateListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final ChatStateListener EMPTY = new ChatStateListener() { // from class: ru.ok.android.externcalls.sdk.chat.ChatStateListener$Companion$EMPTY$1
    };

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/ChatStateListener$Companion;", "", "()V", "EMPTY", "Lru/ok/android/externcalls/sdk/chat/ChatStateListener;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    default void onChatCreated(long chatId) {
    }

    default void onChatUpdated(long chatId) {
    }
}
