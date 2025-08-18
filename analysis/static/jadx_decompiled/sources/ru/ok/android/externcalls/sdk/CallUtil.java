package ru.ok.android.externcalls.sdk;

import defpackage.a4c;
import defpackage.ag1;
import defpackage.ar0;
import defpackage.b4c;
import defpackage.bg1;
import defpackage.imc;
import defpackage.xf1;
import defpackage.yf1;
import defpackage.zf1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

/* loaded from: classes2.dex */
public class CallUtil {
    static final a4c LOG = new a4c() { // from class: ru.ok.android.externcalls.sdk.CallUtil.1
        @Override // defpackage.a4c
        public /* bridge */ /* synthetic */ void log(String str, String str2) {
        }

        @Override // defpackage.a4c
        public /* bridge */ /* synthetic */ void logException(String str, String str2, Throwable th) {
        }

        @Override // defpackage.a4c
        public /* bridge */ /* synthetic */ void reportException(String str, String str2, Throwable th) {
        }
    };
    static final b4c LOG_CONFIGURATION = new b4c() { // from class: ru.ok.android.externcalls.sdk.CallUtil.2
        @Override // defpackage.b4c
        public /* bridge */ /* synthetic */ boolean shouldHideSensitiveInformation() {
            return false;
        }
    };

    public static List<String> collectOpponentExternalIds(ParticipantStore participantStore, ParticipantId participantId) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = participantStore.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next.getExternalId() != null && !next.getExternalId().equals(participantId)) {
                arrayList.add(next.getExternalId().id);
            }
        }
        return arrayList;
    }

    public static List<Long> collectOpponentInternalIds(ParticipantStore participantStore, bg1 bg1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = participantStore.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next.getInternalId() != null && !next.getInternalId().equals(bg1Var)) {
                arrayList.add(Long.valueOf(next.getInternalId().a));
            }
        }
        return arrayList;
    }

    public static xf1 createBitrates() {
        xf1 xf1Var = new xf1();
        xf1Var.a = 204800;
        xf1Var.b = 512000;
        xf1Var.c = 2048000;
        xf1Var.d = 2048000;
        xf1Var.e = 16384;
        xf1Var.f = 32768;
        xf1Var.g = 65536;
        xf1Var.h = 65536;
        return xf1Var;
    }

    public static ag1 createCallParams(ConversationBuilder conversationBuilder) {
        xf1 xf1VarCreateBitrates = conversationBuilder.bitrates;
        if (xf1VarCreateBitrates == null) {
            xf1VarCreateBitrates = createBitrates();
        }
        xf1 xf1Var = xf1VarCreateBitrates;
        yf1 yf1Var = conversationBuilder.experiments;
        zf1 zf1Var = yf1Var.f;
        if (zf1Var == null) {
            zf1Var = new zf1(conversationBuilder.mediaReceivingTimeoutMs);
        }
        ag1 ag1Var = new ag1(xf1Var, zf1Var, conversationBuilder.dnsResolverEnabled, conversationBuilder.isConsumerUpdateEnabled, conversationBuilder.isOnDemandTracksEnabled, conversationBuilder.enableLossRttBadConnectionHandling, conversationBuilder.additionalWhitelistedCodecPrefixes, conversationBuilder.isDataChannelScreenshareRecvEnabled, conversationBuilder.isDataChannelScreenshareSendEnabled, conversationBuilder.videoTracksCount, conversationBuilder.fastRecoverEnabled, conversationBuilder.sessionIdEnabled, conversationBuilder.isWaitingRoomActivated, conversationBuilder.isSignalingDefaultValuesFilteringEnabled, conversationBuilder.isWebRTCCodecFilteringEnabled, conversationBuilder.audioCodecs, conversationBuilder.videoCodecs, conversationBuilder.showLocalVideoInOriginalQuality, conversationBuilder.isSessionRoomsFeatureEnabled, new imc(new ar0(conversationBuilder.isMediaAdaptationFeatureEnabledForP2PCall, conversationBuilder.ptpCallMediaAdaptationConfig), new ar0(conversationBuilder.isMediaAdaptationFeatureEnabledForGroupCall, conversationBuilder.groupCallMediaAdaptationConfig), false, 7), conversationBuilder.isAsrOnlineEnabled, yf1Var, conversationBuilder.isAudienceModeEnabled, conversationBuilder.serverTopologySuspendBelowMinBitrate, conversationBuilder.isFastScreenCaptureEnabled, conversationBuilder.isDeviceAudioShareEnabled, conversationBuilder.badNetworkIndicatorConfig);
        ag1Var.c = true;
        return ag1Var;
    }
}
