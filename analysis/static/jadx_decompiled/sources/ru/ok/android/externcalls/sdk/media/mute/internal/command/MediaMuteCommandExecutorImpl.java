package ru.ok.android.externcalls.sdk.media.mute.internal.command;

import defpackage.bg1;
import defpackage.hi9;
import defpackage.k56;
import defpackage.m56;
import defpackage.mt;
import defpackage.nt;
import defpackage.old;
import defpackage.py0;
import defpackage.qd8;
import defpackage.qld;
import defpackage.rd8;
import defpackage.rod;
import defpackage.sd8;
import defpackage.ud8;
import defpackage.zad;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\"\u0010\f\u001a\u001e\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010Jc\u0010\u001b\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u000e\u0010\u0015\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ]\u0010\u001f\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\u000e\u0010\u0015\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J_\u0010!\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\n\u0010\u0015\u001a\u00060\bj\u0002`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b!\u0010\u001cJS\u0010\"\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\"\u0010#JY\u0010$\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\n\u0010\u0015\u001a\u00060\bj\u0002`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b$\u0010 JM\u0010%\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020'2\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R0\u0010\f\u001a\u001e\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lkotlin/Function0;", "Lpy0;", "getCall", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getInternalId", "Lzad;", "getActiveRoomId", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lk56;Lm56;Lk56;)V", "", "Lqd8;", "Lrd8;", "statesToUpdate", "participantId", "roomId", "Le5f;", "onSuccess", "", "onError", "updateMediaOptions", "(Ljava/util/Map;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzad;Lk56;Lm56;)V", "", "mediaOptions", "requestToEnableMedia", "(Ljava/util/Set;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzad;Lk56;Lm56;)V", "updateMediaOptionsForParticipant", "updateMediaOptionsForAll", "(Ljava/util/Map;Lzad;Lk56;Lm56;)V", "requestToEnableMediaForParticipant", "requestToEnableMediaForAll", "(Ljava/util/Set;Lzad;Lk56;Lm56;)V", "Lsd8;", "getMediaOptionsForCall", "(Lzad;)Lsd8;", "getMediaOptionsForCurrentUser", "()Lsd8;", "", "mute", "setAudioPlayoutMuted", "(Z)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lk56;", "Lm56;", "Lud8;", "paramsCreator", "Lud8;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MediaMuteCommandExecutorImpl implements MediaMuteCommandExecutor {
    private final k56 getActiveRoomId;
    private final k56 getCall;
    private final m56 getInternalId;
    private final ud8 paramsCreator = new ud8();
    private final SignalingProvider signalingProvider;

    public MediaMuteCommandExecutorImpl(SignalingProvider signalingProvider, k56 k56Var, m56 m56Var, k56 k56Var2) {
        this.signalingProvider = signalingProvider;
        this.getCall = k56Var;
        this.getInternalId = m56Var;
        this.getActiveRoomId = k56Var2;
    }

    private final void requestToEnableMedia(Set<? extends qd8> mediaOptions, ParticipantId participantId, zad roomId, k56 onSuccess, m56 onError) {
        rod rodVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (rodVar == null) {
            return;
        }
        bg1 bg1Var = (bg1) this.getInternalId.invoke(participantId);
        if (participantId != null && bg1Var == null) {
            if (onError != null) {
                onError.invoke(new IllegalStateException("Participant is not prepared"));
                return;
            }
            return;
        }
        try {
            ud8 ud8Var = this.paramsCreator;
            if (roomId == null) {
                roomId = (zad) this.getActiveRoomId.invoke();
            }
            ud8Var.getClass();
            rodVar.j(ud8.a(mediaOptions, bg1Var, roomId), new mt(5, onSuccess), new nt(7, onError));
        } catch (JSONException e) {
            if (onError != null) {
                onError.invoke(new RuntimeException("Error while creating params", e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestToEnableMedia$lambda$2(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestToEnableMedia$lambda$3(m56 m56Var, JSONObject jSONObject) {
        if (m56Var != null) {
            m56Var.invoke(new RuntimeException("Error response " + jSONObject));
        }
    }

    private final void updateMediaOptions(Map<qd8, ? extends rd8> statesToUpdate, ParticipantId participantId, zad roomId, k56 onSuccess, m56 onError) {
        rod rodVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (rodVar == null) {
            return;
        }
        bg1 bg1Var = (bg1) this.getInternalId.invoke(participantId);
        if (participantId != null && bg1Var == null) {
            if (onError != null) {
                onError.invoke(new IllegalStateException("Participant is not prepared"));
                return;
            }
            return;
        }
        try {
            ud8 ud8Var = this.paramsCreator;
            if (roomId == null) {
                roomId = (zad) this.getActiveRoomId.invoke();
            }
            ud8Var.getClass();
            rodVar.j(ud8.b(statesToUpdate, bg1Var, roomId), new mt(6, onSuccess), new nt(8, onError));
        } catch (JSONException e) {
            if (onError != null) {
                onError.invoke(new RuntimeException("Error while creating params", e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMediaOptions$lambda$0(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMediaOptions$lambda$1(m56 m56Var, JSONObject jSONObject) {
        if (m56Var != null) {
            m56Var.invoke(new RuntimeException("Error response " + jSONObject));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public sd8 getMediaOptionsForCall(zad roomId) {
        sd8 sd8Var;
        py0 py0Var = (py0) this.getCall.invoke();
        if (roomId == null) {
            roomId = (zad) this.getActiveRoomId.invoke();
        }
        if (py0Var != null) {
            hi9 hi9VarH = py0Var.L1.h(roomId);
            sd8Var = new sd8(hi9VarH.a, hi9VarH.b, hi9VarH.c, hi9VarH.d);
        } else {
            sd8Var = null;
        }
        return sd8Var == null ? new sd8() : sd8Var;
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public sd8 getMediaOptionsForCurrentUser() {
        sd8 sd8Var;
        py0 py0Var = (py0) this.getCall.invoke();
        if (py0Var != null) {
            hi9 hi9Var = py0Var.L1.i;
            sd8Var = new sd8(hi9Var.a, hi9Var.b, hi9Var.c, hi9Var.d);
        } else {
            sd8Var = null;
        }
        return sd8Var == null ? new sd8() : sd8Var;
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void requestToEnableMediaForAll(Set<? extends qd8> mediaOptions, zad roomId, k56 onSuccess, m56 onError) {
        requestToEnableMedia(mediaOptions, null, roomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void requestToEnableMediaForParticipant(Set<? extends qd8> mediaOptions, ParticipantId participantId, zad roomId, k56 onSuccess, m56 onError) {
        requestToEnableMedia(mediaOptions, participantId, roomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void setAudioPlayoutMuted(boolean mute) {
        py0 py0Var = (py0) this.getCall.invoke();
        if (py0Var != null) {
            qld qldVar = py0Var.k1;
            qldVar.getClass();
            qldVar.a.execute(new old(qldVar, mute, 1));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void updateMediaOptionsForAll(Map<qd8, ? extends rd8> statesToUpdate, zad roomId, k56 onSuccess, m56 onError) {
        updateMediaOptions(statesToUpdate, null, roomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void updateMediaOptionsForParticipant(Map<qd8, ? extends rd8> statesToUpdate, ParticipantId participantId, zad roomId, k56 onSuccess, m56 onError) {
        updateMediaOptions(statesToUpdate, participantId, roomId, onSuccess, onError);
    }
}
