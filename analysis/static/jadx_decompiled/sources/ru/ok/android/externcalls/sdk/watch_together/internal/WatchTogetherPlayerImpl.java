package ru.ok.android.externcalls.sdk.watch_together.internal;

import defpackage.cd9;
import defpackage.gd9;
import defpackage.k56;
import defpackage.m56;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J>\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J[\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J>\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0011JF\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00162\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJN\u0010#\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b#\u0010$JQ\u0010'\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00162\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J>\u0010(\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b(\u0010\u0011J\u0018\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-H\u0097\u0001¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b0\u0010,R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/WatchTogetherPlayerImpl;", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;", "commandExecutor", "listenerManager", "<init>", "(Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;)V", "Lcd9;", "movieId", "Lkotlin/Function0;", "Le5f;", "onSuccess", "Lkotlin/Function1;", "", "onError", "pause", "(Lcd9;Lk56;Lm56;)V", "Lqd9;", "volume", "Lgd9;", "meta", "", "moveToAdminOnHangup", "play-yj_a6ag", "(Lcd9;FLgd9;ZLk56;Lm56;)V", "play", "resume", "isMuted", "setMuted", "(Lcd9;ZLk56;Lm56;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Lcd9;JLjava/util/concurrent/TimeUnit;Lk56;Lm56;)V", "setVolume-F2PwOSs", "(Lcd9;FZLk56;Lm56;)V", "setVolume", "stop", "Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "getMovieStates", "()Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "removeListener", "Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class WatchTogetherPlayerImpl implements WatchTogetherPlayer, WatchTogetherCommandsExecutor, WatchTogetherListenerManager {
    private final WatchTogetherCommandsExecutor commandExecutor;
    private final WatchTogetherListenerManager listenerManager;

    public WatchTogetherPlayerImpl(WatchTogetherCommandsExecutor watchTogetherCommandsExecutor, WatchTogetherListenerManager watchTogetherListenerManager) {
        this.commandExecutor = watchTogetherCommandsExecutor;
        this.listenerManager = watchTogetherListenerManager;
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public void addListener(WatchTogetherListener listener) {
        this.listenerManager.addListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public MovieStates getMovieStates() {
        return this.listenerManager.getMovieStates();
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void pause(cd9 movieId, k56 onSuccess, m56 onError) {
        this.commandExecutor.pause(movieId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    /* renamed from: play-yj_a6ag */
    public void mo125playyj_a6ag(cd9 movieId, float volume, gd9 meta, boolean moveToAdminOnHangup, k56 onSuccess, m56 onError) {
        this.commandExecutor.mo125playyj_a6ag(movieId, volume, meta, moveToAdminOnHangup, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public void removeListener(WatchTogetherListener listener) {
        this.listenerManager.removeListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void resume(cd9 movieId, k56 onSuccess, m56 onError) {
        this.commandExecutor.resume(movieId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void setMuted(cd9 movieId, boolean isMuted, k56 onSuccess, m56 onError) {
        this.commandExecutor.setMuted(movieId, isMuted, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void setPosition(cd9 movieId, long position, TimeUnit unit, k56 onSuccess, m56 onError) {
        this.commandExecutor.setPosition(movieId, position, unit, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    /* renamed from: setVolume-F2PwOSs */
    public void mo126setVolumeF2PwOSs(cd9 movieId, float volume, boolean isMuted, k56 onSuccess, m56 onError) {
        this.commandExecutor.mo126setVolumeF2PwOSs(movieId, volume, isMuted, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void stop(cd9 movieId, k56 onSuccess, m56 onError) {
        this.commandExecutor.stop(movieId, onSuccess, onError);
    }
}
