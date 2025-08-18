package defpackage;

import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;

/* loaded from: classes.dex */
public interface um1 extends ConversationEventsListener, qm1, MediaConnectionListener {
    @Override // defpackage.qm1
    default void a(String str) {
    }

    default void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
    }

    default void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }
}
