package ru.ok.android.externcalls.sdk.watch_together;

import defpackage.cd9;
import defpackage.gd9;
import defpackage.k56;
import defpackage.m56;
import defpackage.qd9;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jd\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u0015\u0010\u0014JA\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u0016\u0010\u0014JT\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b'\u0010&J\u000f\u0010)\u001a\u00020(H'¢\u0006\u0004\b)\u0010*ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006+À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "", "Lcd9;", "movieId", "Lqd9;", "volume", "Lgd9;", "meta", "", "moveToAdminOnHangup", "Lkotlin/Function0;", "Le5f;", "onSuccess", "Lkotlin/Function1;", "", "onError", "play-yj_a6ag", "(Lcd9;FLgd9;ZLk56;Lm56;)V", "play", "stop", "(Lcd9;Lk56;Lm56;)V", "pause", "resume", "isMuted", "setVolume-F2PwOSs", "(Lcd9;FZLk56;Lm56;)V", "setVolume", "setMuted", "(Lcd9;ZLk56;Lm56;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Lcd9;JLjava/util/concurrent/TimeUnit;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;)V", "removeListener", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "getMovieStates", "()Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface WatchTogetherPlayer {
    static /* synthetic */ void pause$default(WatchTogetherPlayer watchTogetherPlayer, cd9 cd9Var, k56 k56Var, m56 m56Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i & 2) != 0) {
            k56Var = null;
        }
        if ((i & 4) != 0) {
            m56Var = null;
        }
        watchTogetherPlayer.pause(cd9Var, k56Var, m56Var);
    }

    /* renamed from: play-yj_a6ag$default, reason: not valid java name */
    static void m123playyj_a6ag$default(WatchTogetherPlayer watchTogetherPlayer, cd9 cd9Var, float f, gd9 gd9Var, boolean z, k56 k56Var, m56 m56Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play-yj_a6ag");
        }
        if ((i & 2) != 0) {
            float f2 = qd9.a;
            f = qd9.a;
        }
        float f3 = f;
        gd9 gd9Var2 = (i & 4) != 0 ? null : gd9Var;
        if ((i & 8) != 0) {
            z = false;
        }
        watchTogetherPlayer.mo125playyj_a6ag(cd9Var, f3, gd9Var2, z, (i & 16) != 0 ? null : k56Var, (i & 32) != 0 ? null : m56Var);
    }

    static /* synthetic */ void resume$default(WatchTogetherPlayer watchTogetherPlayer, cd9 cd9Var, k56 k56Var, m56 m56Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
        }
        if ((i & 2) != 0) {
            k56Var = null;
        }
        if ((i & 4) != 0) {
            m56Var = null;
        }
        watchTogetherPlayer.resume(cd9Var, k56Var, m56Var);
    }

    static /* synthetic */ void setMuted$default(WatchTogetherPlayer watchTogetherPlayer, cd9 cd9Var, boolean z, k56 k56Var, m56 m56Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMuted");
        }
        if ((i & 4) != 0) {
            k56Var = null;
        }
        if ((i & 8) != 0) {
            m56Var = null;
        }
        watchTogetherPlayer.setMuted(cd9Var, z, k56Var, m56Var);
    }

    static /* synthetic */ void setPosition$default(WatchTogetherPlayer watchTogetherPlayer, cd9 cd9Var, long j, TimeUnit timeUnit, k56 k56Var, m56 m56Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPosition");
        }
        watchTogetherPlayer.setPosition(cd9Var, j, timeUnit, (i & 8) != 0 ? null : k56Var, (i & 16) != 0 ? null : m56Var);
    }

    /* renamed from: setVolume-F2PwOSs$default, reason: not valid java name */
    static /* synthetic */ void m124setVolumeF2PwOSs$default(WatchTogetherPlayer watchTogetherPlayer, cd9 cd9Var, float f, boolean z, k56 k56Var, m56 m56Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setVolume-F2PwOSs");
        }
        watchTogetherPlayer.mo126setVolumeF2PwOSs(cd9Var, f, z, (i & 8) != 0 ? null : k56Var, (i & 16) != 0 ? null : m56Var);
    }

    static /* synthetic */ void stop$default(WatchTogetherPlayer watchTogetherPlayer, cd9 cd9Var, k56 k56Var, m56 m56Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
        }
        if ((i & 2) != 0) {
            k56Var = null;
        }
        if ((i & 4) != 0) {
            m56Var = null;
        }
        watchTogetherPlayer.stop(cd9Var, k56Var, m56Var);
    }

    void addListener(WatchTogetherListener listener);

    MovieStates getMovieStates();

    void pause(cd9 movieId, k56 onSuccess, m56 onError);

    /* renamed from: play-yj_a6ag, reason: not valid java name */
    void mo125playyj_a6ag(cd9 movieId, float volume, gd9 meta, boolean moveToAdminOnHangup, k56 onSuccess, m56 onError);

    void removeListener(WatchTogetherListener listener);

    void resume(cd9 movieId, k56 onSuccess, m56 onError);

    void setMuted(cd9 movieId, boolean isMuted, k56 onSuccess, m56 onError);

    void setPosition(cd9 movieId, long position, TimeUnit unit, k56 onSuccess, m56 onError);

    /* renamed from: setVolume-F2PwOSs, reason: not valid java name */
    void mo126setVolumeF2PwOSs(cd9 movieId, float volume, boolean isMuted, k56 onSuccess, m56 onError);

    void stop(cd9 movieId, k56 onSuccess, m56 onError);
}
