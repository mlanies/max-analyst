package ru.ok.android.externcalls.sdk.feature.internal.commands;

import defpackage.eg1;
import defpackage.k56;
import defpackage.m56;
import defpackage.mt;
import defpackage.nt;
import defpackage.rod;
import defpackage.u61;
import defpackage.w61;
import defpackage.wz4;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.feature.exception.ConversationFeatureException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013JK\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "Lkotlin/Function1;", "", "Le5f;", "onError", "Lkotlin/Function0;", "Lorg/json/JSONObject;", "createParamsAction", "createParamsOrPassExceptionToOnError", "(Lm56;Lk56;)Lorg/json/JSONObject;", "Lu61;", "feature", "onComplete", "enableFeatureForAll", "(Lu61;Lk56;Lm56;)V", "", "Leg1;", "roles", "enableFeatureForRoles", "(Lu61;Ljava/util/Set;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lw61;", "paramsCreator", "Lw61;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ConversationFeatureCommandExecutorImpl implements ConversationFeatureCommandExecutor {
    private final w61 paramsCreator = new w61();
    private final SignalingProvider signalingProvider;

    public ConversationFeatureCommandExecutorImpl(SignalingProvider signalingProvider) {
        this.signalingProvider = signalingProvider;
    }

    private final JSONObject createParamsOrPassExceptionToOnError(m56 onError, k56 createParamsAction) {
        try {
            return (JSONObject) createParamsAction.invoke();
        } catch (JSONException e) {
            if (onError == null) {
                return null;
            }
            onError.invoke(new ConversationFeatureException("Can't create params for the method", e));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableFeatureForRoles$lambda$0(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableFeatureForRoles$lambda$1(m56 m56Var, JSONObject jSONObject) {
        if (m56Var != null) {
            m56Var.invoke(new ConversationFeatureException("Command error " + jSONObject));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutor
    public void enableFeatureForAll(u61 feature, k56 onComplete, m56 onError) {
        enableFeatureForRoles(feature, wz4.a, onComplete, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutor
    public void enableFeatureForRoles(u61 feature, Set<? extends eg1> roles, k56 onComplete, m56 onError) {
        JSONObject jSONObjectCreateParamsOrPassExceptionToOnError;
        rod rodVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (rodVar == null || (jSONObjectCreateParamsOrPassExceptionToOnError = createParamsOrPassExceptionToOnError(onError, new ConversationFeatureCommandExecutorImpl$enableFeatureForRoles$params$1(this, feature, roles))) == null) {
            return;
        }
        rodVar.j(jSONObjectCreateParamsOrPassExceptionToOnError, new mt(3, onComplete), new nt(3, onError));
    }
}
