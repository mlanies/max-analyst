package ru.ok.android.externcalls.sdk.record.internal;

import defpackage.a4c;
import defpackage.aac;
import defpackage.bg1;
import defpackage.do9;
import defpackage.f46;
import defpackage.hy0;
import defpackage.k56;
import defpackage.ka6;
import defpackage.m56;
import defpackage.mh1;
import defpackage.nh1;
import defpackage.nl1;
import defpackage.occ;
import defpackage.oh1;
import defpackage.ol1;
import defpackage.ph1;
import defpackage.pl1;
import defpackage.qh1;
import defpackage.ql1;
import defpackage.rl1;
import defpackage.rod;
import defpackage.tpa;
import defpackage.u3c;
import defpackage.xad;
import defpackage.yad;
import defpackage.z84;
import defpackage.zad;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.RecordEventListener;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.record.RecordDescription;
import ru.ok.android.externcalls.sdk.record.RecordDescriptionHistory;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001eB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010%\u001a\u00020\u00152\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!2\u0006\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00152\u000e\u0010)\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00102J\u0017\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J=\u0010>\u001a\u00020\u00152\u0006\u00105\u001a\u0002082\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001092\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0015\u0018\u00010;H\u0016¢\u0006\u0004\b>\u0010?J=\u0010A\u001a\u00020\u00152\u0006\u00105\u001a\u00020@2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001092\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0015\u0018\u00010;H\u0016¢\u0006\u0004\bA\u0010BJ\u0011\u0010C\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\bC\u0010DJ\u001b\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020F0EH\u0016¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bK\u0010\u001bJ\u0017\u0010M\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010SR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010UR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010VR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000e0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R0\u0010`\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001d0^j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001d`_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR0\u0010b\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020F0^j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020F`_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010aR\u0016\u0010c\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006f"}, d2 = {"Lru/ok/android/externcalls/sdk/record/internal/RecordManagerImpl;", "Lru/ok/android/externcalls/sdk/record/RecordManager;", "Lrl1;", "Lqh1;", "La4c;", "logger", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantStore", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "deprecatedRecordListener", "<init>", "(La4c;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/events/RecordEventListener;)V", "Lzad;", "oldRoomId", "newRoomId", "Le5f;", "notifyListenersWhenActiveRoomChanged", "(Lzad;Lzad;)V", "Loh1;", "info", "applyRecordStarted", "(Loh1;)V", "Lmh1;", "Lru/ok/android/externcalls/sdk/record/RecordDescription;", "toRecordDescription", "(Lmh1;)Lru/ok/android/externcalls/sdk/record/RecordDescription;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "initiatorId", "sessionRoomId", "current", "setMyRecordHistory", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzad;Lru/ok/android/externcalls/sdk/record/RecordDescription;)V", "reportStarted", "()V", "whoStoppedRecordId", "reportStopped", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "", "description", "reportError", "(Ljava/lang/String;)V", "listener", "addRecordListener", "(Lru/ok/android/externcalls/sdk/events/RecordEventListener;)V", "removeRecordListener", "Lnl1;", "params", "onCurrentParticipantActiveRoomChanged", "(Lnl1;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "stopRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;Lk56;Lm56;)V", "getRecordDescription", "()Lru/ok/android/externcalls/sdk/record/RecordDescription;", "", "Lru/ok/android/externcalls/sdk/record/RecordDescriptionHistory;", "getRecordDescriptionHistory", "()Ljava/util/Map;", "getRecordAdmin", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "onRecordStarted", "Lph1;", "onRecordStopped", "(Lph1;)V", "Lnh1;", "onRecordError", "(Lnh1;)V", "La4c;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "Laac;", "commandParamsCreator", "Laac;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "sessionRoomToRecordInfo", "Ljava/util/HashMap;", "sessionRoomToRecordInfoHistory", "activeRoomId", "Lzad;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RecordManagerImpl implements RecordManager, rl1, qh1 {
    private static final Companion Companion = new Companion(null);
    private static final String KEY_REMOVE_ERROR = "removeError";
    private static final String LOG_TAG = "RecordManagerImpl";
    private final RecordEventListener deprecatedRecordListener;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final a4c logger;
    private final ParticipantStore participantStore;
    private final SignalingProvider signalingProvider;
    private final aac commandParamsCreator = new aac();
    private final CopyOnWriteArraySet<RecordEventListener> listeners = new CopyOnWriteArraySet<>();
    private final HashMap<zad, RecordDescription> sessionRoomToRecordInfo = new HashMap<>();
    private final HashMap<zad, RecordDescriptionHistory> sessionRoomToRecordInfoHistory = new HashMap<>();
    private zad activeRoomId = xad.a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/record/internal/RecordManagerImpl$Companion;", "", "()V", "KEY_REMOVE_ERROR", "", "LOG_TAG", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    public RecordManagerImpl(a4c a4cVar, ParticipantStore participantStore, IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper, SignalingProvider signalingProvider, RecordEventListener recordEventListener) {
        this.logger = a4cVar;
        this.participantStore = participantStore;
        this.idMappingResolver = idMappingResolver;
        this.idMappingWrapper = idMappingWrapper;
        this.signalingProvider = signalingProvider;
        this.deprecatedRecordListener = recordEventListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRecordStarted(oh1 info) {
        RecordDescription recordDescription = toRecordDescription(info.b);
        if (recordDescription == null) {
            return;
        }
        ParticipantId initiator = recordDescription.getInitiator();
        zad zadVar = info.a;
        setMyRecordHistory(initiator, zadVar, recordDescription);
        this.sessionRoomToRecordInfo.put(zadVar, recordDescription);
        if (tpa.f(zadVar, this.activeRoomId)) {
            reportStarted();
        }
    }

    private final void notifyListenersWhenActiveRoomChanged(zad oldRoomId, zad newRoomId) {
        if (this.sessionRoomToRecordInfo.get(oldRoomId) != null) {
            RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(oldRoomId);
            reportStopped(recordDescription != null ? recordDescription.getInitiator() : null);
        }
        if (this.sessionRoomToRecordInfo.get(newRoomId) != null) {
            reportStarted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRecordStarted$lambda$5(RecordManagerImpl recordManagerImpl) {
        recordManagerImpl.logger.log(LOG_TAG, "Can't resolve internal id");
    }

    private final void reportError(String description) {
        this.deprecatedRecordListener.onRecordError(description);
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((RecordEventListener) it.next()).onRecordError(description);
        }
    }

    private final void reportStarted() {
        this.deprecatedRecordListener.onRecordStarted();
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((RecordEventListener) it.next()).onRecordStarted();
        }
    }

    private final void reportStopped(ParticipantId whoStoppedRecordId) {
        ConversationParticipant byExternal = whoStoppedRecordId != null ? this.participantStore.getByExternal(whoStoppedRecordId) : null;
        this.deprecatedRecordListener.onRecordStopped(byExternal);
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((RecordEventListener) it.next()).onRecordStopped(byExternal);
        }
    }

    private final void setMyRecordHistory(ParticipantId initiatorId, zad sessionRoomId, RecordDescription current) {
        ConversationParticipant me2 = this.participantStore.getMe();
        if (tpa.f(initiatorId, me2 != null ? me2.getExternalId() : null)) {
            HashMap<zad, RecordDescriptionHistory> map = this.sessionRoomToRecordInfoHistory;
            RecordDescriptionHistory recordDescriptionHistory = map.get(sessionRoomId);
            map.put(sessionRoomId, new RecordDescriptionHistory(current, recordDescriptionHistory != null ? recordDescriptionHistory.getCurrentState() : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecord$lambda$0(RecordManager.StartParams startParams, k56 k56Var, JSONObject jSONObject) {
        if (startParams.getOnSuccess() != null) {
            startParams.getOnSuccess().invoke(new RecordManager.StartRecordInfo());
        } else if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecord$lambda$1(RecordManagerImpl recordManagerImpl, RecordManager.StartParams startParams, m56 m56Var, JSONObject jSONObject) {
        if ("error".equals(jSONObject.optString("type"))) {
            recordManagerImpl.reportError(jSONObject.optString("message"));
        }
        m56 onError = startParams.getOnError();
        if (onError != null) {
            m56Var = onError;
        }
        if (m56Var != null) {
            m56Var.invoke(new RuntimeException("Can't start record " + jSONObject));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopRecord$lambda$2(RecordManager.StopParams stopParams, k56 k56Var, JSONObject jSONObject) {
        if (stopParams.getOnSuccess() != null) {
            stopParams.getOnSuccess().invoke(new RecordManager.StopRecordInfo(stopParams.getRemoveRecord() ? jSONObject.has(KEY_REMOVE_ERROR) ? tpa.f(jSONObject.optString(KEY_REMOVE_ERROR), "record.remove_unsupported") ? RecordManager.StopRecordInfo.RemoveResult.NOT_SUPPORTED : RecordManager.StopRecordInfo.RemoveResult.NOT_REMOVED : RecordManager.StopRecordInfo.RemoveResult.REMOVED : RecordManager.StopRecordInfo.RemoveResult.NOT_REQUESTED));
        } else if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopRecord$lambda$3(RecordManagerImpl recordManagerImpl, RecordManager.StopParams stopParams, m56 m56Var, JSONObject jSONObject) {
        if ("error".equals(jSONObject.optString("type"))) {
            recordManagerImpl.reportError(jSONObject.optString("message"));
        }
        m56 onError = stopParams.getOnError();
        if (onError != null) {
            m56Var = onError;
        }
        if (m56Var != null) {
            m56Var.invoke(new RuntimeException("Can't stop record " + jSONObject));
        }
    }

    private final RecordDescription toRecordDescription(mh1 mh1Var) {
        ParticipantId byInternal;
        ConversationParticipant byInternal2 = this.participantStore.getByInternal(mh1Var.c);
        if ((byInternal2 == null || (byInternal = byInternal2.getExternalId()) == null) && (byInternal = this.idMappingWrapper.getByInternal(mh1Var.c)) == null) {
            return null;
        }
        return new RecordDescription(byInternal, mh1Var.b, mh1Var.d, mh1Var.a, mh1Var.e, mh1Var.f);
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public void addRecordListener(RecordEventListener listener) {
        this.listeners.add(listener);
    }

    public final ParticipantId getRecordAdmin() {
        RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(this.activeRoomId);
        if (recordDescription != null) {
            return recordDescription.getInitiator();
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public RecordDescription getRecordDescription() {
        return this.sessionRoomToRecordInfo.get(this.activeRoomId);
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public Map<zad, RecordDescriptionHistory> getRecordDescriptionHistory() {
        return this.sessionRoomToRecordInfoHistory;
    }

    @Override // defpackage.rl1
    public void onCurrentParticipantActiveRoomChanged(nl1 params) {
        zad zadVar = this.activeRoomId;
        zad zadVar2 = params.a;
        if (tpa.f(zadVar2, zadVar)) {
            return;
        }
        zad zadVar3 = this.activeRoomId;
        this.activeRoomId = zadVar2;
        notifyListenersWhenActiveRoomChanged(zadVar3, zadVar2);
    }

    @Override // defpackage.rl1
    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(ol1 ol1Var) {
    }

    public void onRecordError(nh1 info) {
        reportError(info.a);
    }

    @Override // defpackage.qh1
    public void onRecordStarted(oh1 info) {
        ParticipantStore participantStore = this.participantStore;
        mh1 mh1Var = info.b;
        if (participantStore.getByInternal(mh1Var.c) != null) {
            applyRecordStarted(info);
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(Collections.singletonList(mh1Var.c), new do9(this, 26, info), new u3c(3, this));
        }
    }

    @Override // defpackage.qh1
    public void onRecordStopped(ph1 info) {
        HashMap<zad, RecordDescription> map = this.sessionRoomToRecordInfo;
        zad zadVar = info.a;
        RecordDescription recordDescription = map.get(zadVar);
        setMyRecordHistory(recordDescription != null ? recordDescription.getInitiator() : null, zadVar, null);
        this.sessionRoomToRecordInfo.remove(zadVar);
        if (tpa.f(zadVar, this.activeRoomId)) {
            bg1 bg1Var = info.b;
            ConversationParticipant byInternal = bg1Var != null ? this.participantStore.getByInternal(bg1Var) : null;
            reportStopped(byInternal != null ? byInternal.getExternalId() : null);
        }
    }

    @Override // defpackage.rl1
    public /* bridge */ /* synthetic */ void onRoomRemoved(pl1 pl1Var) {
    }

    @Override // defpackage.rl1
    public /* bridge */ /* synthetic */ void onRoomUpdated(ql1 ql1Var) {
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public void removeRecordListener(RecordEventListener listener) {
        this.listeners.remove(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public void startRecord(RecordManager.StartParams params, k56 onSuccess, m56 onError) {
        rod rodVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (rodVar == null) {
            return;
        }
        aac aacVar = this.commandParamsCreator;
        boolean isStream = params.getIsStream();
        Long movieId = params.getMovieId();
        zad sessionRoomId = params.getSessionRoomId();
        if (sessionRoomId == null) {
            sessionRoomId = this.activeRoomId;
        }
        Long groupId = params.getGroupId();
        CharSequence name = params.getName();
        CharSequence description = params.getDescription();
        String privacy = params.getPrivacy();
        String albumId = params.getAlbumId();
        aacVar.getClass();
        Calendar calendar = Calendar.getInstance();
        if (name == null) {
            name = String.format(Locale.getDefault(), "%4d-%2d-%2d %2d:%2d:%2d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13))}, 6));
        }
        try {
            ka6 ka6VarB = f46.b(new JSONObject().put("movieId", movieId).put("name", name).put("description", description).put("privacy", privacy).put("groupId", groupId).put("albumId", albumId).put("streamMovie", isStream), "record-start");
            if (sessionRoomId instanceof yad) {
                ka6VarB.b(((yad) sessionRoomId).a, "roomId");
            }
            rodVar.d(ka6VarB, false, new occ(params, onSuccess, 1), new hy0(this, params, onError, 4));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public void stopRecord(RecordManager.StopParams params, k56 onSuccess, m56 onError) throws JSONException {
        rod rodVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (rodVar == null) {
            return;
        }
        aac aacVar = this.commandParamsCreator;
        zad sessionRoomId = params.getSessionRoomId();
        if (sessionRoomId == null) {
            sessionRoomId = this.activeRoomId;
        }
        boolean removeRecord = params.getRemoveRecord();
        aacVar.getClass();
        ka6 ka6VarB = f46.b(null, "record-stop");
        JSONObject jSONObject = ka6VarB.a;
        jSONObject.put("command", "record-stop");
        if (sessionRoomId instanceof yad) {
            ka6VarB.b(((yad) sessionRoomId).a, "roomId");
        }
        if (removeRecord) {
            jSONObject.put("remove", removeRecord);
        }
        rodVar.d(ka6VarB, false, new occ(params, onSuccess, 0), new hy0(this, params, onError, 3));
    }
}
