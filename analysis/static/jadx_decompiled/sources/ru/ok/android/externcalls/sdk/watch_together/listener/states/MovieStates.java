package ru.ok.android.externcalls.sdk.watch_together.listener.states;

import defpackage.cd9;
import defpackage.tpa;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "", "", "Lcd9;", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieState;", "states", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getStates", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class MovieStates {
    private final Map<cd9, MovieState> states;

    public MovieStates(Map<cd9, MovieState> map) {
        this.states = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MovieStates copy$default(MovieStates movieStates, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = movieStates.states;
        }
        return movieStates.copy(map);
    }

    public final Map<cd9, MovieState> component1() {
        return this.states;
    }

    public final MovieStates copy(Map<cd9, MovieState> states) {
        return new MovieStates(states);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MovieStates) && tpa.f(this.states, ((MovieStates) other).states);
    }

    public final Map<cd9, MovieState> getStates() {
        return this.states;
    }

    public int hashCode() {
        return this.states.hashCode();
    }

    public String toString() {
        return "MovieStates(states=" + this.states + ")";
    }
}
