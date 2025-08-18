package defpackage;

/* loaded from: classes2.dex */
public enum e0e {
    callStart("callStart"),
    /* JADX INFO: Fake field, exist only in values array */
    callSpecError("callSpecError"),
    callError("callError"),
    callDevices("callDevices"),
    callIceConnectionState("callIceConnectionState"),
    /* JADX INFO: Fake field, exist only in values array */
    callIceRestart("callIceRestart"),
    /* JADX INFO: Fake field, exist only in values array */
    callPush("callPush"),
    callAcceptedOutgoing("callAcceptedOutgoing"),
    callAcceptIncoming("callAcceptIncoming"),
    callAcceptConcurrent("callAcceptConcurrent"),
    /* JADX INFO: Fake field, exist only in values array */
    callMediaStatus("callMediaStatus"),
    /* JADX INFO: Fake field, exist only in values array */
    callDeviceChanged("callDeviceChanged"),
    /* JADX INFO: Fake field, exist only in values array */
    callSelectAudioDevice("callSelectAudioDevice"),
    /* JADX INFO: Fake field, exist only in values array */
    callUiAction("callUiAction"),
    callPreferH264Sdp("callPreferH264Sdp"),
    /* JADX INFO: Fake field, exist only in values array */
    callSignalingConnected("callSocketAction"),
    callHangup("callHangup"),
    /* JADX INFO: Fake field, exist only in values array */
    callSignalingConnected("callDeclineIncoming"),
    app_event("app_event"),
    /* JADX INFO: Fake field, exist only in values array */
    callSignalingConnected("rtc_enc_avg"),
    /* JADX INFO: Fake field, exist only in values array */
    callPoorConnection("rtc_adapt"),
    /* JADX INFO: Fake field, exist only in values array */
    callSignalingConnected("rtc_br_tr"),
    /* JADX INFO: Fake field, exist only in values array */
    callPoorConnection("rtc_br_rtr"),
    /* JADX INFO: Fake field, exist only in values array */
    callSignalingConnected("rtc_br_enc"),
    /* JADX INFO: Fake field, exist only in values array */
    callPoorConnection("rtc_lost_video"),
    /* JADX INFO: Fake field, exist only in values array */
    callSignalingConnected("rtc_lost_audio"),
    /* JADX INFO: Fake field, exist only in values array */
    callPoorConnection("rtc_rtt"),
    /* JADX INFO: Fake field, exist only in values array */
    callSignalingConnected("rtc_transport"),
    /* JADX INFO: Fake field, exist only in values array */
    callPoorConnection("callJoinConversation"),
    callStartMultiparty("callStartMultiparty"),
    /* JADX INFO: Fake field, exist only in values array */
    callPoorConnection("callPoorConnection"),
    /* JADX INFO: Fake field, exist only in values array */
    callSignalingConnected("callSignalingConnected"),
    callReconnect("callReconnect"),
    switches_to_bad_net("switches_to_bad_net"),
    switches_to_good_net("switches_to_good_net"),
    /* JADX INFO: Fake field, exist only in values array */
    callEventualStat("callEventualStat");

    public final String a;

    e0e(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
