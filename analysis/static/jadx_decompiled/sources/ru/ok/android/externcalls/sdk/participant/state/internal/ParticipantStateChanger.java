package ru.ok.android.externcalls.sdk.participant.state.internal;

import defpackage.bg1;
import defpackage.f46;
import defpackage.qod;
import defpackage.rod;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\r\u001a\u00020\f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0012\u001a\u00020\f2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStateChanger;", "", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "", "", "newState", "Lqod;", "listener", "errorListener", "Le5f;", "changeMyState", "(Ljava/util/Map;Lqod;Lqod;)V", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantId", "changeParticipantState", "(Lbg1;Ljava/util/Map;Lqod;Lqod;)V", "lowerHandForAll", "(Lqod;Lqod;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ParticipantStateChanger {
    private final SignalingProvider signalingProvider;

    public ParticipantStateChanger(SignalingProvider signalingProvider) {
        this.signalingProvider = signalingProvider;
    }

    public static /* synthetic */ void changeMyState$default(ParticipantStateChanger participantStateChanger, Map map, qod qodVar, qod qodVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            qodVar2 = null;
        }
        participantStateChanger.changeMyState(map, qodVar, qodVar2);
    }

    public static /* synthetic */ void changeParticipantState$default(ParticipantStateChanger participantStateChanger, bg1 bg1Var, Map map, qod qodVar, qod qodVar2, int i, Object obj) {
        if ((i & 8) != 0) {
            qodVar2 = null;
        }
        participantStateChanger.changeParticipantState(bg1Var, map, qodVar, qodVar2);
    }

    public static /* synthetic */ void lowerHandForAll$default(ParticipantStateChanger participantStateChanger, qod qodVar, qod qodVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            qodVar2 = null;
        }
        participantStateChanger.lowerHandForAll(qodVar, qodVar2);
    }

    public final void changeMyState(Map<String, String> map, qod qodVar) {
        changeMyState$default(this, map, qodVar, null, 4, null);
    }

    public final void changeParticipantState(bg1 bg1Var, Map<String, String> map, qod qodVar) {
        changeParticipantState$default(this, bg1Var, map, qodVar, null, 8, null);
    }

    public final void lowerHandForAll(qod listener, qod errorListener) {
        rod signaling = this.signalingProvider.getSignaling();
        if (signaling == null) {
            return;
        }
        signaling.d(f46.b(null, "put-hands-down"), false, listener, errorListener);
    }

    public final void changeMyState(Map<String, String> newState, qod listener, qod errorListener) {
        rod signaling = this.signalingProvider.getSignaling();
        if (signaling == null) {
            return;
        }
        signaling.d(f46.i(newState, null), false, listener, errorListener);
    }

    public final void changeParticipantState(bg1 participantId, Map<String, String> newState, qod listener, qod errorListener) {
        rod signaling = this.signalingProvider.getSignaling();
        if (signaling == null) {
            return;
        }
        signaling.d(f46.i(newState, participantId), false, listener, errorListener);
    }
}
