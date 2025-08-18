package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;

/* loaded from: classes.dex */
public final class os1 implements ConversationEventsListener, qm1, MediaConnectionListener {
    public final khe a = new khe(new dk1(19));
    public final khe b = new khe(new dk1(20));

    @Override // defpackage.qm1
    public final void a(String str) {
        Iterator it = ((CopyOnWriteArraySet) this.b.getValue()).iterator();
        while (it.hasNext()) {
            ((qm1) it.next()).a(str);
        }
    }

    public final CopyOnWriteArraySet b() {
        return (CopyOnWriteArraySet) this.a.getValue();
    }

    public final void c(um1 um1Var) {
        b().remove(um1Var);
    }

    public final void d(um1 um1Var) {
        b().add(um1Var);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onAnonJoinForbiddenChanged(boolean z) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onAnonJoinForbiddenChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallAccepted() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onCallAccepted();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallAcceptedForAll() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onCallAcceptedForAll();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onCallEnded(conversationEndInfo);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallIsUnfeasibleError(SignalingErrors$CallIsUnfeasibleError signalingErrors$CallIsUnfeasibleError) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onCallIsUnfeasibleError(signalingErrors$CallIsUnfeasibleError);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallParticipantsNetworkStatusChanged(List list) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onCallParticipantsNetworkStatusChanged(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallSignalingConnected() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onCallSignalingConnected();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallStartResolutionFailed(List list) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onCallStartResolutionFailed(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCameraBusy() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onCameraBusy();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCameraChanged() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onCameraChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCustomData(JSONObject jSONObject) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onCustomData(jSONObject);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onDestroyed();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onJoinLinkUpdated(String str) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onJoinLinkUpdated(str);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onLocalMediaChanged() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onLocalMediaChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMeInWaitingRoomChanged(boolean z) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onMeInWaitingRoomChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onMediaConnected(connectedInfo);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onMediaDisconnected(disconnectedInfo);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMicChanged(boolean z) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onMicChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMicrophoneForciblyMuted() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onMicrophoneForciblyMuted();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMigratedToServerTopology() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onMigratedToServerTopology();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMuteChanged(vi9 vi9Var) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onMuteChanged(vi9Var);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMuteStateInitialized(vi9 vi9Var) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onMuteStateInitialized(vi9Var);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onOpponentFingerprintChanged(long j) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onOpponentFingerprintChanged(j);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onOpponentMediaChanged() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onOpponentMediaChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onOpponentRegistered() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onOpponentRegistered();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsAdded(List list) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onParticipantsAdded(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsChanged(List list) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onParticipantsChanged(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsDeAnonymized(List list, Map map) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onParticipantsDeAnonymized(list, map);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsRemoved(List list) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onParticipantsRemoved(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsUpdated(Collection collection) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onParticipantsUpdated(collection);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onPinChanged(ConversationParticipant conversationParticipant, boolean z) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onPinChanged(conversationParticipant, z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRateCall(RateCallData rateCallData) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onRateCall(rateCallData);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRecurringChanged(boolean z) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onRecurringChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onRolesChanged(conversationParticipant);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onStateChanged(ConversationParticipant conversationParticipant, dg1 dg1Var) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onStateChanged(conversationParticipant, dg1Var);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onWaitingRoomEnabledChanged(boolean z) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onWaitingRoomEnabledChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(String str) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onDestroyed(str);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((um1) it.next()).onDestroyed(conversationDestroyedInfo);
        }
    }
}
