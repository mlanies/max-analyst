package ru.ok.android.externcalls.sdk.chat.internal;

import defpackage.k56;
import defpackage.m56;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.chat.ChatManager;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutor;
import ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManager;
import ru.ok.android.externcalls.sdk.chat.listener.ChatManagerListener;
import ru.ok.android.externcalls.sdk.chat.message.OutboundMessage;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J>\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/internal/ChatManagerImpl;", "Lru/ok/android/externcalls/sdk/chat/ChatManager;", "Lru/ok/android/externcalls/sdk/chat/internal/command/ChatCommandExecutor;", "Lru/ok/android/externcalls/sdk/chat/internal/listener/ChatListenerManager;", "commandExecutor", "listenerManager", "<init>", "(Lru/ok/android/externcalls/sdk/chat/internal/command/ChatCommandExecutor;Lru/ok/android/externcalls/sdk/chat/internal/listener/ChatListenerManager;)V", "Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;", "message", "Lkotlin/Function0;", "Le5f;", "onSuccess", "Lkotlin/Function1;", "", "onError", "sendMessage", "(Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/chat/listener/ChatManagerListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/chat/listener/ChatManagerListener;)V", "removeListener", "Lru/ok/android/externcalls/sdk/chat/internal/command/ChatCommandExecutor;", "Lru/ok/android/externcalls/sdk/chat/internal/listener/ChatListenerManager;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ChatManagerImpl implements ChatManager, ChatCommandExecutor, ChatListenerManager {
    private final ChatCommandExecutor commandExecutor;
    private final ChatListenerManager listenerManager;

    public ChatManagerImpl(ChatCommandExecutor chatCommandExecutor, ChatListenerManager chatListenerManager) {
        this.commandExecutor = chatCommandExecutor;
        this.listenerManager = chatListenerManager;
    }

    @Override // ru.ok.android.externcalls.sdk.chat.ChatManager, ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManager
    public void addListener(ChatManagerListener listener) {
        this.listenerManager.addListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.chat.ChatManager, ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManager
    public void removeListener(ChatManagerListener listener) {
        this.listenerManager.removeListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.chat.ChatManager, ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutor
    public void sendMessage(OutboundMessage message, k56 onSuccess, m56 onError) {
        this.commandExecutor.sendMessage(message, onSuccess, onError);
    }
}
