package ru.ok.android.externcalls.sdk.contacts;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.contacts.listener.ContactCallListener;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/contacts/ContactCallManager;", "", "Lru/ok/android/externcalls/sdk/contacts/listener/ContactCallListener;", "listener", "Le5f;", "addContactCallListener", "(Lru/ok/android/externcalls/sdk/contacts/listener/ContactCallListener;)V", "removeContactCallListener", "", "getIWasInitiallyAnonymous", "()Z", "iWasInitiallyAnonymous", "getIAmAnonymous", "iAmAnonymous", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface ContactCallManager {
    void addContactCallListener(ContactCallListener listener);

    boolean getIAmAnonymous();

    boolean getIWasInitiallyAnonymous();

    void removeContactCallListener(ContactCallListener listener);
}
