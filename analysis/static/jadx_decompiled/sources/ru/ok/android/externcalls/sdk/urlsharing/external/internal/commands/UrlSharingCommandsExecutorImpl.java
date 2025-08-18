package ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands;

import defpackage.k56;
import defpackage.m56;
import defpackage.mt;
import defpackage.nt;
import defpackage.rod;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/internal/commands/UrlSharingCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/urlsharing/external/internal/commands/UrlSharingCommandsExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "Lkotlin/Function1;", "", "Le5f;", "onError", "Lrod;", "getSignalingOrPassExceptionToOnError", "(Lm56;)Lrod;", "", "url", "Lkotlin/Function0;", "onSuccess", "start", "(Ljava/lang/String;Lk56;Lm56;)V", "stop", "(Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class UrlSharingCommandsExecutorImpl implements UrlSharingCommandsExecutor {
    private final SignalingProvider signalingProvider;

    public UrlSharingCommandsExecutorImpl(SignalingProvider signalingProvider) {
        this.signalingProvider = signalingProvider;
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
    public static final void start$lambda$0(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(m56 m56Var, JSONObject jSONObject) {
        if (m56Var != null) {
            m56Var.invoke(new RuntimeException("Start url sharing error " + jSONObject));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$2(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$3(m56 m56Var, JSONObject jSONObject) {
        if (m56Var != null) {
            m56Var.invoke(new RuntimeException("Stop url sharing error " + jSONObject));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutor
    public void start(String url, k56 onSuccess, m56 onError) throws JSONException {
        rod signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "start-url-sharing");
        jSONObject.put("sharedUrl", url);
        signalingOrPassExceptionToOnError.j(jSONObject, new mt(16, onSuccess), new nt(10, onError));
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutor
    public void stop(k56 onSuccess, m56 onError) throws JSONException {
        rod signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "stop-url-sharing");
        signalingOrPassExceptionToOnError.j(jSONObject, new mt(17, onSuccess), new nt(11, onError));
    }
}
