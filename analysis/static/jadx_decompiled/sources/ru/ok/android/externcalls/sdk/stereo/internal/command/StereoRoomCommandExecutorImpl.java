package ru.ok.android.externcalls.sdk.stereo.internal.command;

import defpackage.a4c;
import defpackage.c2e;
import defpackage.c66;
import defpackage.cq1;
import defpackage.dq1;
import defpackage.f46;
import defpackage.hy0;
import defpackage.k56;
import defpackage.ka6;
import defpackage.kp1;
import defpackage.m56;
import defpackage.mt;
import defpackage.rod;
import defpackage.tpa;
import defpackage.z53;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;
import ru.ok.android.externcalls.sdk.stereo.exception.ParticipantNotFoundException;
import ru.ok.android.externcalls.sdk.stereo.exception.PromotedLimitExceeded;
import ru.ok.android.externcalls.sdk.stereo.exception.StereoRoomException;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00182\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010#\u001a\u00020\u000e2$\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0004\u0012\u00020\u000e0\u001e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "La4c;", "log", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;La4c;)V", "", "method", "Lorg/json/JSONObject;", "errorResponse", "Lkotlin/Function1;", "", "Le5f;", "onError", "parseErrorResponse", "(Ljava/lang/String;Lorg/json/JSONObject;Lm56;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;", "params", "Lkotlin/Function0;", "onSuccess", "promoteParticipant", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;", "requestPromotion", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;", "acceptPromotion", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;Lk56;Lm56;)V", "Lkotlin/Function3;", "", "", "", "Llp1;", "getHandsQueue", "(Lc66;Lm56;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "La4c;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class StereoRoomCommandExecutorImpl implements StereoRoomCommandExecutor {
    private final a4c log;
    private final SignalingProvider signalingProvider;

    public StereoRoomCommandExecutorImpl(SignalingProvider signalingProvider, a4c a4cVar) {
        this.signalingProvider = signalingProvider;
        this.log = a4cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void acceptPromotion$lambda$4(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHandsQueue$lambda$8(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, m56 m56Var, c66 c66Var, JSONObject jSONObject) {
        cq1 cq1VarA = new dq1(stereoRoomCommandExecutorImpl.log).a(jSONObject);
        if (cq1VarA == null) {
            if (m56Var != null) {
                m56Var.invoke(new StereoRoomException("getHandsQueue: missing response", null, 2, null));
                return;
            }
            return;
        }
        Object objValueOf = Integer.valueOf(cq1VarA.c);
        Object objValueOf2 = Boolean.valueOf(cq1VarA.b);
        List list = cq1VarA.a;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((kp1) it.next()).a);
        }
        c66Var.invoke(objValueOf, objValueOf2, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parseErrorResponse(String method, JSONObject errorResponse, m56 onError) {
        Object stereoRoomException;
        String strOptString = errorResponse.optString("error");
        if (tpa.f(strOptString, "chatRoom.partNotFound")) {
            stereoRoomException = new ParticipantNotFoundException("Participant not found, " + method + " command " + errorResponse);
        } else if (tpa.f(strOptString, "chatRoom.promotedLimit")) {
            stereoRoomException = new PromotedLimitExceeded();
        } else {
            stereoRoomException = new StereoRoomException("Error response for " + method + " command " + errorResponse, null, 2, null);
        }
        if (onError != null) {
            onError.invoke(stereoRoomException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void promoteParticipant$lambda$0(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestPromotion$lambda$2(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void acceptPromotion(StereoRoomCommandExecutor.AcceptPromotionParams params, k56 onSuccess, m56 onError) throws JSONException {
        rod rodVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (rodVar == null) {
            return;
        }
        boolean reject = params.getReject();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "accept-promotion");
        jSONObject.put("reject", reject);
        rodVar.d(new ka6(jSONObject), false, new mt(14, onSuccess), new c2e(this, onError, 2));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void getHandsQueue(c66 onSuccess, m56 onError) throws JSONException {
        rod rodVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (rodVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "get-hand-queue");
        rodVar.d(new ka6(jSONObject), false, new hy0(this, onError, onSuccess, 5), new c2e(this, onError, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void promoteParticipant(StereoRoomCommandExecutor.PromoteParticipantParams params, k56 onSuccess, m56 onError) {
        rod rodVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (rodVar == null) {
            return;
        }
        rodVar.d(f46.r(params.getParticipantId(), params.getPromote()), false, new mt(15, onSuccess), new c2e(this, onError, 3));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void requestPromotion(StereoRoomCommandExecutor.RequestPromotionParams params, k56 onSuccess, m56 onError) throws JSONException {
        rod rodVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (rodVar == null) {
            return;
        }
        boolean unrequest = params.getUnrequest();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "request-promotion");
        jSONObject.put("unrequest", unrequest);
        rodVar.d(new ka6(jSONObject), false, new mt(13, onSuccess), new c2e(this, onError, 1));
    }
}
