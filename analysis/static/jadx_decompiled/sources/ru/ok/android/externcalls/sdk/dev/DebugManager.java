package ru.ok.android.externcalls.sdk.dev;

import defpackage.e0e;
import defpackage.m1e;
import defpackage.py0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/DebugManager;", "", "Le0e;", "operation", "", "param", "Le5f;", "report", "(Le0e;Ljava/lang/String;)V", "", "error", "reportError", "(Ljava/lang/Throwable;)V", "dumpPath", "enableFullAudioDump", "(Ljava/lang/String;)V", "Lm1e;", "listener", "", "period", "Ljava/util/concurrent/TimeUnit;", "unit", "registerStatListener", "(Lm1e;ILjava/util/concurrent/TimeUnit;)V", "removeStatListener", "(Lm1e;)V", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager;", "getMediaDumpManager", "()Lru/ok/android/externcalls/sdk/dev/MediaDumpManager;", "mediaDumpManager", "Lpy0;", "getUnderlyingCall", "()Lpy0;", "underlyingCall", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface DebugManager {
    void enableFullAudioDump(String dumpPath);

    MediaDumpManager getMediaDumpManager();

    py0 getUnderlyingCall();

    void registerStatListener(m1e listener, int period, TimeUnit unit);

    void removeStatListener(m1e listener);

    void report(e0e operation, String param);

    void reportError(Throwable error);
}
