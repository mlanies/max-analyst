package ru.ok.android.externcalls.sdk.watch_together.internal.listener;

import android.os.Handler;
import android.os.Looper;
import defpackage.cd9;
import defpackage.dd9;
import defpackage.ed9;
import defpackage.fd9;
import defpackage.fp1;
import defpackage.fre;
import defpackage.id9;
import defpackage.jd9;
import defpackage.kd9;
import defpackage.ld9;
import defpackage.md9;
import defpackage.nd9;
import defpackage.oz4;
import defpackage.qd9;
import defpackage.tpa;
import defpackage.zc9;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\nJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantsStorage", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "listener", "Le5f;", "sendActualState", "(Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;)V", "sendActualStateToAll", "()V", "Lmd9;", "updates", "updateState", "(Lmd9;)V", "", "position", "Lfd9;", "getPosition", "(Ljava/lang/Long;)Lfd9;", "Lkd9;", "startInfo", "onVideoStarted", "(Lkd9;)V", "onVideoStatesUpdatedChanged", "Lnd9;", "stopInfo", "onVideoStopped", "(Lnd9;)V", "addListener", "removeListener", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "getMovieStates", "()Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "movieStates", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class WatchTogetherListenerManagerImpl implements WatchTogetherListenerManager {
    private final ParticipantStore participantsStorage;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private volatile MovieStates movieStates = new MovieStates(oz4.a);
    private final CopyOnWriteArraySet<WatchTogetherListener> listeners = new CopyOnWriteArraySet<>();

    public WatchTogetherListenerManagerImpl(ParticipantStore participantStore) {
        this.participantsStorage = participantStore;
    }

    private final fd9 getPosition(Long position) {
        return (position == null || position.longValue() < 0) ? ed9.a : new dd9(position.longValue(), TimeUnit.SECONDS);
    }

    private final void sendActualState(WatchTogetherListener listener) {
        this.mainHandler.post(new fre(this, 18, listener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendActualState$lambda$5(WatchTogetherListenerManagerImpl watchTogetherListenerManagerImpl, WatchTogetherListener watchTogetherListener) {
        if (watchTogetherListenerManagerImpl.listeners.contains(watchTogetherListener) && (!watchTogetherListenerManagerImpl.movieStates.getStates().isEmpty())) {
            watchTogetherListener.onVideoStatesChanged(watchTogetherListenerManagerImpl.movieStates);
        }
    }

    private final void sendActualStateToAll() {
        Iterator<WatchTogetherListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoStatesChanged(this.movieStates);
        }
    }

    private final void updateState(md9 updates) {
        HashMap map = new HashMap();
        for (ld9 ld9Var : updates.a) {
            ConversationParticipant byInternal = this.participantsStorage.getByInternal(ld9Var.a.b);
            if (byInternal != null) {
                ParticipantId externalId = byInternal.getExternalId();
                fp1 fp1Var = ld9Var.a;
                cd9 cd9Var = fp1Var.c;
                if (cd9Var != null) {
                    int i = jd9.$EnumSwitchMapping$1[fp1Var.a.ordinal()];
                    Object obj = null;
                    id9 id9Var = i != 1 ? i != 2 ? null : id9.b : id9.a;
                    if (id9Var != null) {
                        Iterator<T> it = byInternal.getMovies().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            zc9 zc9Var = (zc9) next;
                            if (zc9Var.d == id9Var && tpa.f(zc9Var.a, cd9Var)) {
                                obj = next;
                                break;
                            }
                        }
                        zc9 zc9Var2 = (zc9) obj;
                        fd9 position = getPosition(ld9Var.d);
                        boolean z = !ld9Var.c;
                        float f = ld9Var.b;
                        qd9.a(f);
                        map.put(cd9Var, new MovieState(externalId, position, z, f, ld9Var.e, zc9Var2, null));
                        if (!this.movieStates.getStates().containsKey(cd9Var) && zc9Var2 != null) {
                            MovieStartedData movieStartedData = new MovieStartedData(externalId, this.participantsStorage.getActiveRoomId(), zc9Var2);
                            Iterator<T> it2 = this.listeners.iterator();
                            while (it2.hasNext()) {
                                ((WatchTogetherListener) it2.next()).onVideoStarted(movieStartedData);
                            }
                        }
                    }
                }
            }
        }
        this.movieStates = this.movieStates.copy(map);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public void addListener(WatchTogetherListener listener) {
        this.listeners.add(listener);
        sendActualState(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public MovieStates getMovieStates() {
        return this.movieStates;
    }

    public final void onVideoStarted(kd9 startInfo) {
        ConversationParticipant byInternal = this.participantsStorage.getByInternal(startInfo.a);
        if (byInternal != null) {
            zc9 zc9Var = startInfo.c;
            ParticipantId externalId = byInternal.getExternalId();
            MovieStates movieStates = this.movieStates;
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.movieStates.getStates());
            cd9 cd9Var = zc9Var.a;
            ed9 ed9Var = ed9.a;
            float f = qd9.a;
            linkedHashMap.put(cd9Var, new MovieState(externalId, ed9Var, true, 0.0f, true, zc9Var, null));
            this.movieStates = movieStates.copy(linkedHashMap);
            MovieStartedData movieStartedData = new MovieStartedData(byInternal.getExternalId(), startInfo.b, zc9Var);
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((WatchTogetherListener) it.next()).onVideoStarted(movieStartedData);
            }
        }
    }

    public final void onVideoStatesUpdatedChanged(md9 updates) {
        updateState(updates);
        sendActualStateToAll();
    }

    public final void onVideoStopped(nd9 stopInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.movieStates.getStates());
        MovieState movieState = (MovieState) linkedHashMap.remove(stopInfo.c);
        this.movieStates = this.movieStates.copy(linkedHashMap);
        if (movieState != null) {
            MovieStoppedData movieStoppedData = new MovieStoppedData(movieState.getParticipantId(), stopInfo.b, stopInfo.c, stopInfo.d);
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((WatchTogetherListener) it.next()).onVideoStopped(movieStoppedData);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public void removeListener(WatchTogetherListener listener) {
        this.listeners.remove(listener);
    }
}
