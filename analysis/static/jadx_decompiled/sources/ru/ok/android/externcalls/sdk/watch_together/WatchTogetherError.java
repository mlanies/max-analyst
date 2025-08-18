package ru.ok.android.externcalls.sdk.watch_together;

import defpackage.u25;
import defpackage.v25;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherError;", "", "(Ljava/lang/String;I)V", "LIMIT_EXCEEDED", "MOVIE_NOT_FOUND", "PLAY_NOT_ALLOWED", "CANT_PARSE_MOVIE_TYPE", "PLAY_PARSE_ERROR", "UNKNOWN_ERROR", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WatchTogetherError {
    private static final /* synthetic */ u25 $ENTRIES;
    private static final /* synthetic */ WatchTogetherError[] $VALUES;
    public static final WatchTogetherError LIMIT_EXCEEDED = new WatchTogetherError("LIMIT_EXCEEDED", 0);
    public static final WatchTogetherError MOVIE_NOT_FOUND = new WatchTogetherError("MOVIE_NOT_FOUND", 1);
    public static final WatchTogetherError PLAY_NOT_ALLOWED = new WatchTogetherError("PLAY_NOT_ALLOWED", 2);
    public static final WatchTogetherError CANT_PARSE_MOVIE_TYPE = new WatchTogetherError("CANT_PARSE_MOVIE_TYPE", 3);
    public static final WatchTogetherError PLAY_PARSE_ERROR = new WatchTogetherError("PLAY_PARSE_ERROR", 4);
    public static final WatchTogetherError UNKNOWN_ERROR = new WatchTogetherError("UNKNOWN_ERROR", 5);

    private static final /* synthetic */ WatchTogetherError[] $values() {
        return new WatchTogetherError[]{LIMIT_EXCEEDED, MOVIE_NOT_FOUND, PLAY_NOT_ALLOWED, CANT_PARSE_MOVIE_TYPE, PLAY_PARSE_ERROR, UNKNOWN_ERROR};
    }

    static {
        WatchTogetherError[] watchTogetherErrorArr$values = $values();
        $VALUES = watchTogetherErrorArr$values;
        $ENTRIES = new v25(watchTogetherErrorArr$values);
    }

    private WatchTogetherError(String str, int i) {
    }

    public static u25 getEntries() {
        return $ENTRIES;
    }

    public static WatchTogetherError valueOf(String str) {
        return (WatchTogetherError) Enum.valueOf(WatchTogetherError.class, str);
    }

    public static WatchTogetherError[] values() {
        return (WatchTogetherError[]) $VALUES.clone();
    }
}
