package ru.ok.android.externcalls.sdk.dev.internal;

import defpackage.a4c;
import defpackage.e0e;
import defpackage.f5;
import defpackage.gw3;
import defpackage.hw3;
import defpackage.m1e;
import defpackage.py0;
import defpackage.qld;
import defpackage.z84;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 12\u00020\u0001:\u00011B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u001a\u0010-\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/internal/DebugManagerImpl;", "Lru/ok/android/externcalls/sdk/dev/DebugManager;", "Lpy0;", "underlyingCall", "Lru/ok/android/externcalls/sdk/log/ExtLogger;", "stat", "Lgw3;", "cidProvider", "La4c;", "log", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lpy0;Lru/ok/android/externcalls/sdk/log/ExtLogger;Lgw3;La4c;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "Le0e;", "operation", "", "param", "Le5f;", "report", "(Le0e;Ljava/lang/String;)V", "", "error", "reportError", "(Ljava/lang/Throwable;)V", "dumpPath", "enableFullAudioDump", "(Ljava/lang/String;)V", "Lm1e;", "listener", "", "period", "Ljava/util/concurrent/TimeUnit;", "unit", "registerStatListener", "(Lm1e;ILjava/util/concurrent/TimeUnit;)V", "removeStatListener", "(Lm1e;)V", "Lpy0;", "getUnderlyingCall", "()Lpy0;", "Lru/ok/android/externcalls/sdk/log/ExtLogger;", "Lgw3;", "La4c;", "Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "mediaDumpManager", "Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "getMediaDumpManager", "()Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DebugManagerImpl implements DebugManager {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "DebugManager";
    private final gw3 cidProvider;
    private final a4c log;
    private final MediaDumpManagerImpl mediaDumpManager;
    private final ExtLogger stat;
    private final py0 underlyingCall;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/internal/DebugManagerImpl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    public DebugManagerImpl(py0 py0Var, ExtLogger extLogger, gw3 gw3Var, a4c a4cVar, SignalingProvider signalingProvider) {
        this.underlyingCall = py0Var;
        this.stat = extLogger;
        this.cidProvider = gw3Var;
        this.log = a4cVar;
        this.mediaDumpManager = new MediaDumpManagerImpl(getUnderlyingCall(), signalingProvider);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void enableFullAudioDump(String dumpPath) {
        py0 underlyingCall = getUnderlyingCall();
        qld qldVar = underlyingCall.k1;
        if (qldVar == null) {
            return;
        }
        py0.o2.execute(new f5(underlyingCall, qldVar, dumpPath, 6));
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public py0 getUnderlyingCall() {
        return this.underlyingCall;
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void registerStatListener(m1e listener, int period, TimeUnit unit) {
        getUnderlyingCall().R1.c(listener, period, unit);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void removeStatListener(m1e listener) {
        ((HashMap) getUnderlyingCall().R1.d).remove(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void report(e0e operation, String param) {
        this.stat.logSimple(operation, ((hw3) this.cidProvider).a, param);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void reportError(Throwable error) {
        this.log.reportException(LOG_TAG, "error", error);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public MediaDumpManagerImpl getMediaDumpManager() {
        return this.mediaDumpManager;
    }
}
