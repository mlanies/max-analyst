package ru.ok.android.externcalls.sdk.watch_together.internal.commands;

import defpackage.cd9;
import defpackage.gd9;
import defpackage.hi9;
import defpackage.id9;
import defpackage.k56;
import defpackage.ka6;
import defpackage.kd1;
import defpackage.m56;
import defpackage.mt;
import defpackage.rod;
import defpackage.sq1;
import defpackage.srf;
import defpackage.tpa;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherError;
import ru.ok.android.externcalls.sdk.watch_together.exceptions.WatchTogetherException;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JZ\u0010%\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J=\u0010&\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b&\u0010'J=\u0010(\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b(\u0010'J=\u0010)\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b)\u0010'JP\u0010-\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,JE\u0010.\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b.\u0010/JM\u00104\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lkotlin/Function0;", "Lkd1;", "mediaOptionsDelegate", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lk56;)V", "Lkotlin/Function1;", "", "Le5f;", "onError", "Lrod;", "getSignalingOrPassExceptionToOnError", "(Lm56;)Lrod;", "", "method", "Lorg/json/JSONObject;", "errorResponse", "parseErrorResponse", "(Ljava/lang/String;Lorg/json/JSONObject;Lm56;)V", "value", "Lid9;", "parseMovieType", "(Ljava/lang/String;)Lid9;", "Lcd9;", "movieId", "Lqd9;", "volume", "Lgd9;", "meta", "", "moveToAdminOnHangup", "onSuccess", "play-yj_a6ag", "(Lcd9;FLgd9;ZLk56;Lm56;)V", "play", "stop", "(Lcd9;Lk56;Lm56;)V", "pause", "resume", "isMuted", "setVolume-F2PwOSs", "(Lcd9;FZLk56;Lm56;)V", "setVolume", "setMuted", "(Lcd9;ZLk56;Lm56;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Lcd9;JLjava/util/concurrent/TimeUnit;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lk56;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class WatchTogetherCommandExecutorImpl implements WatchTogetherCommandsExecutor {
    private final k56 mediaOptionsDelegate;
    private final SignalingProvider signalingProvider;

    public WatchTogetherCommandExecutorImpl(SignalingProvider signalingProvider, k56 k56Var) {
        this.signalingProvider = signalingProvider;
        this.mediaOptionsDelegate = k56Var;
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
    public final void parseErrorResponse(String method, JSONObject errorResponse, m56 onError) {
        String strOptString = errorResponse.optString("error");
        WatchTogetherError watchTogetherError = (tpa.f(strOptString, "movie-limit-exceeded") || tpa.f(strOptString, "movie-not-found")) ? WatchTogetherError.LIMIT_EXCEEDED : WatchTogetherError.UNKNOWN_ERROR;
        WatchTogetherError watchTogetherError2 = watchTogetherError;
        if (onError != null) {
            onError.invoke(new WatchTogetherException(watchTogetherError2, "Error response for " + method + " command " + errorResponse, null, 4, null));
        }
    }

    private final id9 parseMovieType(String value) {
        if (tpa.f(value, "MOVIE")) {
            return id9.a;
        }
        if (tpa.f(value, "STREAM")) {
            return id9.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$4(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play_yj_a6ag$lambda$0(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$6(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMuted$lambda$10(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPosition$lambda$12(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVolume_F2PwOSs$lambda$8(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$2(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void pause(cd9 movieId, k56 onSuccess, m56 onError) throws JSONException {
        rod signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        long j = movieId.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put("movieId", j);
        jSONObject.put("pause", true);
        signalingOrPassExceptionToOnError.d(new ka6(jSONObject), false, new mt(20, onSuccess), new srf(this, onError, 1));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    /* renamed from: play-yj_a6ag */
    public void mo125playyj_a6ag(cd9 movieId, float volume, gd9 meta, boolean moveToAdminOnHangup, k56 onSuccess, m56 onError) throws JSONException {
        kd1 kd1Var = (kd1) this.mediaOptionsDelegate.invoke();
        if (kd1Var != null) {
            if (kd1.d(new sq1(0, 12, hi9.class, kd1Var.i, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                rod signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
                if (signalingOrPassExceptionToOnError == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("command", "add-movie");
                jSONObject.put("movieId", movieId.a);
                jSONObject.put("gain", volume);
                jSONObject.put("moveToAdminOnHangup", moveToAdminOnHangup);
                signalingOrPassExceptionToOnError.d(new ka6(jSONObject), false, new mt(22, onSuccess), new srf(this, onError, 4));
                return;
            }
        }
        if (onError != null) {
            onError.invoke(new WatchTogetherException(WatchTogetherError.PLAY_NOT_ALLOWED, "Play not allowed due to media option", null, 4, null));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void resume(cd9 movieId, k56 onSuccess, m56 onError) throws JSONException {
        rod signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        long j = movieId.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put("movieId", j);
        jSONObject.put("pause", false);
        signalingOrPassExceptionToOnError.d(new ka6(jSONObject), false, new mt(18, onSuccess), new srf(this, onError, 2));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void setMuted(cd9 movieId, boolean isMuted, k56 onSuccess, m56 onError) throws JSONException {
        rod signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put("movieId", movieId.a);
        jSONObject.put("mute", isMuted);
        signalingOrPassExceptionToOnError.d(new ka6(jSONObject), false, new mt(23, onSuccess), new srf(this, onError, 5));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void setPosition(cd9 movieId, long position, TimeUnit unit, k56 onSuccess, m56 onError) throws JSONException {
        rod signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put("movieId", movieId.a);
        jSONObject.put("offset", unit.toSeconds(position));
        signalingOrPassExceptionToOnError.d(new ka6(jSONObject), false, new mt(21, onSuccess), new srf(this, onError, 3));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    /* renamed from: setVolume-F2PwOSs */
    public void mo126setVolumeF2PwOSs(cd9 movieId, float volume, boolean isMuted, k56 onSuccess, m56 onError) throws JSONException {
        rod signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put("movieId", movieId.a);
        jSONObject.put("gain", volume);
        jSONObject.put("mute", isMuted);
        signalingOrPassExceptionToOnError.d(new ka6(jSONObject), false, new mt(19, onSuccess), new srf(this, onError, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void stop(cd9 movieId, k56 onSuccess, m56 onError) throws JSONException {
        rod signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "remove-movie");
        jSONObject.put("movieId", movieId.a);
        signalingOrPassExceptionToOnError.d(new ka6(jSONObject), false, new mt(24, onSuccess), new srf(this, onError, 6));
    }
}
