package ru.ok.android.externcalls.sdk.watch_together.listener;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStartedData;", "startInfo", "Le5f;", "onVideoStarted", "(Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStartedData;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "states", "onVideoStatesChanged", "(Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStoppedData;", "stopInfo", "onVideoStopped", "(Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStoppedData;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface WatchTogetherListener {
    void onVideoStarted(MovieStartedData startInfo);

    void onVideoStatesChanged(MovieStates states);

    void onVideoStopped(MovieStoppedData stopInfo);
}
