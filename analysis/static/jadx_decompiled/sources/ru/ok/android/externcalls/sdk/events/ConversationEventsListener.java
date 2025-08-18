package ru.ok.android.externcalls.sdk.events;

import defpackage.dg1;
import defpackage.ji6;
import defpackage.vi9;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;

/* loaded from: classes2.dex */
public interface ConversationEventsListener extends RecordEventListener {

    public static class CallEndInfo {
        public final String explanationHtml;
        public final Set<HangupHint> hints;
        public final ji6 reason;

        public CallEndInfo(ji6 ji6Var, Set<HangupHint> set, String str) {
            this.reason = ji6Var;
            this.hints = set;
            this.explanationHtml = str;
        }
    }

    default void onAnonJoinForbiddenChanged(boolean z) {
    }

    default void onCallAccepted() {
    }

    default void onCallAcceptedForAll() {
    }

    @Deprecated
    default void onCallEnded(CallEndInfo callEndInfo) {
    }

    default void onCallIsUnfeasibleError(SignalingErrors$CallIsUnfeasibleError signalingErrors$CallIsUnfeasibleError) {
    }

    default void onCallParticipantsNetworkStatusChanged(List<ConversationParticipant> list) {
    }

    default void onCallSignalingConnected() {
    }

    default void onCallStartResolutionFailed(List<ParticipantId> list) {
    }

    default void onCameraBusy() {
    }

    default void onCameraChanged() {
    }

    @Deprecated
    default void onConnected() {
    }

    default void onCustomData(JSONObject jSONObject) {
    }

    @Deprecated
    default void onDestroyed() {
    }

    @Deprecated
    default void onDisconnected() {
    }

    default ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant) {
        return null;
    }

    default void onJoinLinkUpdated(String str) {
    }

    default void onLocalMediaChanged() {
    }

    default void onMeInWaitingRoomChanged(boolean z) {
    }

    default void onMicChanged(boolean z) {
    }

    default void onMicrophoneForciblyMuted() {
    }

    @Deprecated
    default void onMigratedToServerTopology() {
    }

    @Deprecated
    default void onMuteChanged(vi9 vi9Var) {
    }

    @Deprecated
    default void onMuteStateInitialized(vi9 vi9Var) {
    }

    default void onOpponentFingerprintChanged(long j) {
    }

    @Deprecated
    default void onOpponentMediaChanged() {
    }

    default void onOpponentRegistered() {
    }

    default void onParticipantsAdded(List<ConversationParticipant> list) {
    }

    default void onParticipantsChanged(List<ConversationParticipant> list) {
    }

    default void onParticipantsDeAnonymized(List<ConversationParticipant> list, Map<ParticipantId, ParticipantId> map) {
    }

    default void onParticipantsRemoved(List<ConversationParticipant> list) {
    }

    default void onParticipantsUpdated(Collection<ConversationParticipant> collection) {
    }

    default void onPinChanged(ConversationParticipant conversationParticipant, boolean z) {
    }

    default void onRateCall(RateCallData rateCallData) {
    }

    default void onRecurringChanged(boolean z) {
    }

    default void onRolesChanged(ConversationParticipant conversationParticipant) {
    }

    default void onStateChanged(ConversationParticipant conversationParticipant, dg1 dg1Var) {
    }

    default void onWaitingRoomEnabledChanged(boolean z) {
    }

    default void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
    }

    default void onCallEnded(ConversationEndInfo conversationEndInfo) {
    }

    default void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
    }

    @Deprecated
    default void onDestroyed(String str) {
        onDestroyed();
    }
}
