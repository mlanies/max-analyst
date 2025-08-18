package ru.ok.android.externcalls.sdk.contacts.internal;

import defpackage.fg1;
import defpackage.q31;
import defpackage.r31;
import defpackage.tpa;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;
import ru.ok.android.externcalls.sdk.contacts.listener.ContactCallListener;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ok/android/externcalls/sdk/contacts/internal/ContactCallManagerImpl;", "Lru/ok/android/externcalls/sdk/contacts/ContactCallManager;", "Lr31;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantsStore", "", "iAmAnonymous", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Z)V", "Le5f;", "notifyContactCallStateChanged", "()V", "Lq31;", "info", "onDecorativeParticipantIdChanged", "(Lq31;)V", "Lru/ok/android/externcalls/sdk/contacts/listener/ContactCallListener;", "listener", "addContactCallListener", "(Lru/ok/android/externcalls/sdk/contacts/listener/ContactCallListener;)V", "removeContactCallListener", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "iWasInitiallyAnonymous", "Z", "getIWasInitiallyAnonymous", "()Z", "<set-?>", "getIAmAnonymous", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ContactCallManagerImpl implements ContactCallManager, r31 {
    private boolean iAmAnonymous;
    private final boolean iWasInitiallyAnonymous;
    private final CopyOnWriteArraySet<ContactCallListener> listeners = new CopyOnWriteArraySet<>();
    private final ParticipantStore participantsStore;

    public ContactCallManagerImpl(ParticipantStore participantStore, boolean z) {
        this.participantsStore = participantStore;
        this.iWasInitiallyAnonymous = z;
        this.iAmAnonymous = z;
    }

    private final void notifyContactCallStateChanged() {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((ContactCallListener) it.next()).onContactCallMyAnonChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.contacts.ContactCallManager
    public void addContactCallListener(ContactCallListener listener) {
        this.listeners.add(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.contacts.ContactCallManager
    public boolean getIAmAnonymous() {
        return this.iAmAnonymous;
    }

    @Override // ru.ok.android.externcalls.sdk.contacts.ContactCallManager
    public boolean getIWasInitiallyAnonymous() {
        return this.iWasInitiallyAnonymous;
    }

    @Override // defpackage.r31
    public void onDecorativeParticipantIdChanged(q31 info) {
        ConversationParticipant me2 = this.participantsStore.getMe();
        fg1 callParticipant = me2 != null ? me2.getCallParticipant() : null;
        if (callParticipant != null && getIAmAnonymous()) {
            if (tpa.f(info.a, callParticipant.a)) {
                this.iAmAnonymous = false;
                notifyContactCallStateChanged();
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.contacts.ContactCallManager
    public void removeContactCallListener(ContactCallListener listener) {
        this.listeners.remove(listener);
    }
}
