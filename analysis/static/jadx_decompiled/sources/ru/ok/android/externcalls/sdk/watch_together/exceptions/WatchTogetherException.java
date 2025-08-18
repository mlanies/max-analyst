package ru.ok.android.externcalls.sdk.watch_together.exceptions;

import defpackage.z84;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherError;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/exceptions/WatchTogetherException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "reason", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherError;", "message", "", "cause", "", "(Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherError;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "getReason", "()Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherError;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WatchTogetherException extends RuntimeException {
    private final Throwable cause;
    private final String message;
    private final WatchTogetherError reason;

    public WatchTogetherException(WatchTogetherError watchTogetherError) {
        this(watchTogetherError, null, null, 6, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final WatchTogetherError getReason() {
        return this.reason;
    }

    public WatchTogetherException(WatchTogetherError watchTogetherError, String str) {
        this(watchTogetherError, str, null, 4, null);
    }

    public /* synthetic */ WatchTogetherException(WatchTogetherError watchTogetherError, String str, Throwable th, int i, z84 z84Var) {
        this(watchTogetherError, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th);
    }

    public WatchTogetherException(WatchTogetherError watchTogetherError, String str, Throwable th) {
        super(str, th);
        this.reason = watchTogetherError;
        this.message = str;
        this.cause = th;
    }
}
