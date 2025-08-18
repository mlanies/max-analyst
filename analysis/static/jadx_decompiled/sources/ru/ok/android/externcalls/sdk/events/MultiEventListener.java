package ru.ok.android.externcalls.sdk.events;

import defpackage.dg1;
import defpackage.f46;
import defpackage.rb7;
import defpackage.vi9;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\f\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u0003B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0096\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u001e\u0010\u0013\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\nJ\u001e\u0010\u001a\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ\u001e\u0010\u001b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u0011J\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u0011J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010\u0011J\u000f\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u0011J\u000f\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010\u0011J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u00020\u000f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020+01H\u0016¢\u0006\u0004\b;\u00105J\u001d\u0010<\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020+01H\u0016¢\u0006\u0004\b<\u00105J\u001d\u0010=\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020+01H\u0016¢\u0006\u0004\b=\u00105J\u001d\u0010>\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020+0\u000bH\u0016¢\u0006\u0004\b>\u0010\u0006J1\u0010B\u001a\u00020\u000f2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020+012\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002020@H\u0016¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020+01H\u0016¢\u0006\u0004\bD\u00105J\u0017\u0010F\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020+H\u0016¢\u0006\u0004\bF\u0010GJ!\u0010I\u001a\u00020\u000f2\b\u0010E\u001a\u0004\u0018\u00010+2\u0006\u0010H\u001a\u00020\bH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\bH\u0016¢\u0006\u0004\bL\u0010#J\u0017\u0010O\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bQ\u0010PJ\u0017\u0010S\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\bH\u0016¢\u0006\u0004\bS\u0010#J\u0017\u0010U\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\bH\u0016¢\u0006\u0004\bU\u0010#J\u0017\u0010W\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\bH\u0016¢\u0006\u0004\bW\u0010#J\u0017\u0010Y\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020XH\u0016¢\u0006\u0004\bY\u0010ZJ\u001b\u0010\\\u001a\u0004\u0018\u0001022\b\u0010[\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u000fH\u0016¢\u0006\u0004\b^\u0010\u0011J\u000f\u0010_\u001a\u00020\u000fH\u0016¢\u0006\u0004\b_\u0010\u0011J\u000f\u0010`\u001a\u00020\u000fH\u0016¢\u0006\u0004\b`\u0010\u0011J\u0017\u0010c\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u000fH\u0016¢\u0006\u0004\be\u0010\u0011J\u0017\u0010h\u001a\u00020\u000f2\u0006\u0010g\u001a\u00020fH\u0016¢\u0006\u0004\bh\u0010iJ\u0017\u0010h\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020jH\u0016¢\u0006\u0004\bh\u0010lJ\u0017\u0010n\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020mH\u0016¢\u0006\u0004\bn\u0010oJ\u0019\u0010q\u001a\u00020\u000f2\b\u0010p\u001a\u0004\u0018\u00010aH\u0016¢\u0006\u0004\bq\u0010dJ\u0017\u0010q\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020rH\u0016¢\u0006\u0004\bq\u0010sJ\u0017\u0010u\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020tH\u0016¢\u0006\u0004\bu\u0010vR\u001e\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010wR\u0014\u0010{\u001a\u00020x8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006|"}, d2 = {"Lru/ok/android/externcalls/sdk/events/MultiEventListener;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "", "Lru/ok/android/externcalls/sdk/events/ListenersCollection;", "container", "<init>", "(Ljava/util/Collection;)V", "element", "", "add", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Le5f;", "clear", "()V", "contains", "containsAll", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "retainAll", "onOpponentMediaChanged", "onLocalMediaChanged", "onCameraChanged", "onCameraBusy", "onMicrophoneForciblyMuted", "mute", "onMicChanged", "(Z)V", "onCallAccepted", "onCallAcceptedForAll", "onOpponentRegistered", "Lorg/json/JSONObject;", "data", "onCustomData", "(Lorg/json/JSONObject;)V", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "id", "Ldg1;", "newState", "onStateChanged", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Ldg1;)V", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", ApiProtocol.PARAM_EXTERNAL_IDS, "onCallStartResolutionFailed", "(Ljava/util/List;)V", "", "fingerprint", "onOpponentFingerprintChanged", "(J)V", "participants", "onParticipantsAdded", "onParticipantsChanged", "onParticipantsRemoved", "onParticipantsUpdated", "deAnonymizedlParticipants", "", "deAnonymizedToOriginalIds", "onParticipantsDeAnonymized", "(Ljava/util/List;Ljava/util/Map;)V", "onCallParticipantsNetworkStatusChanged", "conversationParticipant", "onRolesChanged", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "byMe", "onPinChanged", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Z)V", "recurring", "onRecurringChanged", "Lvi9;", "muteEvent", "onMuteStateInitialized", "(Lvi9;)V", "onMuteChanged", "isAnonJoinForbidden", "onAnonJoinForbiddenChanged", "isEnabled", "onWaitingRoomEnabledChanged", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "onWaitingRoomParticipantsChanged", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;)V", "participant", "onExternalByInternalResolution", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Lru/ok/android/externcalls/sdk/id/ParticipantId;", "onConnected", "onCallSignalingConnected", "onMigratedToServerTopology", "", "link", "onJoinLinkUpdated", "(Ljava/lang/String;)V", "onDisconnected", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener$CallEndInfo;", "endInfo", "onCallEnded", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener$CallEndInfo;)V", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndInfo;", "info", "(Lru/ok/android/externcalls/sdk/events/end/ConversationEndInfo;)V", "Lru/ok/android/webrtc/SignalingErrors$CallIsUnfeasibleError;", "onCallIsUnfeasibleError", "(Lru/ok/android/webrtc/SignalingErrors$CallIsUnfeasibleError;)V", "reason", "onDestroyed", "Lru/ok/android/externcalls/sdk/events/destroy/ConversationDestroyedInfo;", "(Lru/ok/android/externcalls/sdk/events/destroy/ConversationDestroyedInfo;)V", "Lru/ok/android/externcalls/sdk/rate/RateCallData;", "onRateCall", "(Lru/ok/android/externcalls/sdk/rate/RateCallData;)V", "Ljava/util/Collection;", "", "getSize", "()I", "size", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MultiEventListener implements ConversationEventsListener, Collection<ConversationEventsListener>, rb7 {
    private final Collection<ConversationEventsListener> container;

    public MultiEventListener(Collection<ConversationEventsListener> collection) {
        this.container = collection;
    }

    @Override // java.util.Collection
    public boolean add(ConversationEventsListener element) {
        return this.container.add(element);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends ConversationEventsListener> elements) {
        return this.container.addAll(elements);
    }

    @Override // java.util.Collection
    public void clear() {
        this.container.clear();
    }

    public boolean contains(ConversationEventsListener element) {
        return this.container.contains(element);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        return this.container.containsAll(elements);
    }

    public int getSize() {
        return this.container.size();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.container.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<ConversationEventsListener> iterator() {
        return this.container.iterator();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onAnonJoinForbiddenChanged(boolean isAnonJoinForbidden) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onAnonJoinForbiddenChanged(isAnonJoinForbidden);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallAccepted() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallAccepted();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallAcceptedForAll() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallAcceptedForAll();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallEnded(ConversationEventsListener.CallEndInfo endInfo) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallEnded(endInfo);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallIsUnfeasibleError(SignalingErrors$CallIsUnfeasibleError data) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallIsUnfeasibleError(data);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallParticipantsNetworkStatusChanged(List<? extends ConversationParticipant> participants) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallParticipantsNetworkStatusChanged(participants);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallSignalingConnected() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallSignalingConnected();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallStartResolutionFailed(List<ParticipantId> externalIds) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallStartResolutionFailed(externalIds);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCameraBusy() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCameraBusy();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCameraChanged() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCameraChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onConnected() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onConnected();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCustomData(JSONObject data) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCustomData(data);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onDestroyed(String reason) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onDestroyed(reason);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onDisconnected() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onDisconnected();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public ParticipantId onExternalByInternalResolution(ConversationParticipant participant) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            ParticipantId participantIdOnExternalByInternalResolution = it.next().onExternalByInternalResolution(participant);
            if (participantIdOnExternalByInternalResolution != null) {
                return participantIdOnExternalByInternalResolution;
            }
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onJoinLinkUpdated(String link) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onJoinLinkUpdated(link);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onLocalMediaChanged() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onLocalMediaChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMeInWaitingRoomChanged(boolean isMeInWaitingRoom) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMeInWaitingRoomChanged(isMeInWaitingRoom);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMicChanged(boolean mute) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMicChanged(mute);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMicrophoneForciblyMuted() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMicrophoneForciblyMuted();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMigratedToServerTopology() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMigratedToServerTopology();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMuteChanged(vi9 muteEvent) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMuteChanged(muteEvent);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMuteStateInitialized(vi9 muteEvent) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMuteStateInitialized(muteEvent);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onOpponentFingerprintChanged(long fingerprint) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onOpponentFingerprintChanged(fingerprint);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onOpponentMediaChanged() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onOpponentMediaChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onOpponentRegistered() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onOpponentRegistered();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsAdded(List<? extends ConversationParticipant> participants) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsAdded(participants);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsChanged(List<? extends ConversationParticipant> participants) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsChanged(participants);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsDeAnonymized(List<? extends ConversationParticipant> deAnonymizedlParticipants, Map<ParticipantId, ParticipantId> deAnonymizedToOriginalIds) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsDeAnonymized(deAnonymizedlParticipants, deAnonymizedToOriginalIds);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsRemoved(List<? extends ConversationParticipant> participants) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsRemoved(participants);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsUpdated(Collection<? extends ConversationParticipant> participants) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsUpdated(participants);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onPinChanged(ConversationParticipant conversationParticipant, boolean byMe) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onPinChanged(conversationParticipant, byMe);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onRateCall(RateCallData data) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onRateCall(data);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onRecurringChanged(boolean recurring) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onRecurringChanged(recurring);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onRolesChanged(ConversationParticipant conversationParticipant) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onRolesChanged(conversationParticipant);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onStateChanged(ConversationParticipant id, dg1 newState) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(id, newState);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onWaitingRoomEnabledChanged(boolean isEnabled) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onWaitingRoomEnabledChanged(isEnabled);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate data) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onWaitingRoomParticipantsChanged(data);
        }
    }

    public boolean remove(ConversationEventsListener element) {
        return this.container.remove(element);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        return this.container.removeAll(elements);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        return this.container.retainAll(elements);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return f46.d0(this);
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ConversationEventsListener) {
            return contains((ConversationEventsListener) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ConversationEventsListener) {
            return remove((ConversationEventsListener) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) f46.e0(this, tArr);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallEnded(ConversationEndInfo info) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallEnded(info);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onDestroyed(ConversationDestroyedInfo info) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onDestroyed(info);
        }
    }
}
