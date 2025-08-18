package ru.ok.android.externcalls.sdk.chat.internal.command;

import defpackage.bg1;
import defpackage.f46;
import defpackage.k56;
import defpackage.ka6;
import defpackage.m56;
import defpackage.mt;
import defpackage.nt;
import defpackage.rod;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.chat.message.OutboundMessage;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/internal/command/ChatCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/chat/internal/command/ChatCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantStore", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;", "message", "Lkotlin/Function0;", "Le5f;", "onSuccess", "Lkotlin/Function1;", "", "onError", "sendMessage", "(Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ChatCommandExecutorImpl implements ChatCommandExecutor {
    private final ParticipantStore participantStore;
    private final SignalingProvider signalingProvider;

    public ChatCommandExecutorImpl(SignalingProvider signalingProvider, ParticipantStore participantStore) {
        this.signalingProvider = signalingProvider;
        this.participantStore = participantStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendMessage$lambda$2(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendMessage$lambda$3(m56 m56Var, JSONObject jSONObject) {
        if (m56Var != null) {
            m56Var.invoke(new RuntimeException("Send message error " + jSONObject));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutor
    public void sendMessage(OutboundMessage message, k56 onSuccess, m56 onError) {
        ConversationParticipant byExternal;
        rod rodVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (rodVar == null) {
            return;
        }
        ParticipantId participantId = message.getParticipantId();
        JSONObject jSONObject = null;
        if (participantId != null) {
            byExternal = this.participantStore.getByExternal(participantId);
            if (byExternal == null) {
                if (onError != null) {
                    onError.invoke(new NullPointerException("Couldn't find a ConversationParticipant for participantId=" + participantId));
                    return;
                }
                return;
            }
        } else {
            byExternal = null;
        }
        bg1 internalId = byExternal != null ? byExternal.getInternalId() : null;
        String text = message.getText();
        if (internalId != null) {
            try {
                jSONObject = new JSONObject();
                f46.d(internalId, jSONObject, true);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        ka6 ka6VarB = f46.b(jSONObject, "chat-message");
        ka6VarB.a.put("message", text);
        int i = 2;
        rodVar.d(ka6VarB, false, new mt(i, onSuccess), new nt(i, onError));
    }
}
