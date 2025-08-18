package ru.ok.android.externcalls.sdk.asr.internal.commands;

import defpackage.f46;
import defpackage.k56;
import defpackage.ka6;
import defpackage.m56;
import defpackage.mt;
import defpackage.nt;
import defpackage.rod;
import defpackage.yad;
import defpackage.zad;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.asr.exceptions.AsrException;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00132\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u0017\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00132\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ok/android/externcalls/sdk/asr/internal/commands/AsrCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/asr/internal/commands/AsrCommandsExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantStore", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lkotlin/Function1;", "", "Le5f;", "onError", "Lrod;", "getSignalingOrPassExceptionToOnError", "(Lm56;)Lrod;", "", "fileName", "Lzad;", "sessionRoomId", "Lkotlin/Function0;", "onSuccess", "startRecord", "(Ljava/lang/String;Lzad;Lk56;Lm56;)V", "stopRecord", "(Lzad;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "getActiveRoomId", "()Lzad;", "activeRoomId", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AsrCommandsExecutorImpl implements AsrCommandsExecutor {
    private final ParticipantStore participantStore;
    private final SignalingProvider signalingProvider;

    public AsrCommandsExecutorImpl(SignalingProvider signalingProvider, ParticipantStore participantStore) {
        this.signalingProvider = signalingProvider;
        this.participantStore = participantStore;
    }

    private final zad getActiveRoomId() {
        return this.participantStore.getActiveRoomId();
    }

    private final rod getSignalingOrPassExceptionToOnError(m56 onError) {
        rod signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            return signaling;
        }
        if (onError != null) {
            onError.invoke(new ConversationNotPreparedException());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecord$lambda$0(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecord$lambda$1(m56 m56Var, JSONObject jSONObject) {
        if (m56Var != null) {
            m56Var.invoke(new AsrException(jSONObject, null, null, 6, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopRecord$lambda$2(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopRecord$lambda$3(m56 m56Var, JSONObject jSONObject) {
        if (m56Var != null) {
            m56Var.invoke(new AsrException(jSONObject, null, null, 6, null));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutor
    public void startRecord(String fileName, zad sessionRoomId, k56 onSuccess, m56 onError) {
        if (sessionRoomId == null) {
            sessionRoomId = getActiveRoomId();
        }
        rod signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        try {
            ka6 ka6VarB = f46.b(null, "asr-start");
            ka6VarB.a.put("fileName", fileName);
            if (sessionRoomId instanceof yad) {
                ka6VarB.b(((yad) sessionRoomId).a, "roomId");
            }
            signalingOrPassExceptionToOnError.d(ka6VarB, false, new mt(0, onSuccess), new nt(0, onError));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutor
    public void stopRecord(zad sessionRoomId, k56 onSuccess, m56 onError) {
        if (sessionRoomId == null) {
            sessionRoomId = getActiveRoomId();
        }
        rod signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        try {
            ka6 ka6VarB = f46.b(null, "asr-stop");
            if (sessionRoomId instanceof yad) {
                ka6VarB.b(((yad) sessionRoomId).a, "roomId");
            }
            int i = 1;
            signalingOrPassExceptionToOnError.d(ka6VarB, false, new mt(i, onSuccess), new nt(i, onError));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
