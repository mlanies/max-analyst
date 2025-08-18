package ru.ok.android.externcalls.sdk.asr.internal;

import defpackage.k56;
import defpackage.m56;
import defpackage.zad;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.asr.AsrManager;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutor;
import ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager;
import ru.ok.android.externcalls.sdk.asr.listener.AsrRecordListener;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ok/android/externcalls/sdk/asr/internal/AsrManagerImpl;", "Lru/ok/android/externcalls/sdk/asr/AsrManager;", "Lru/ok/android/externcalls/sdk/asr/internal/commands/AsrCommandsExecutor;", "Lru/ok/android/externcalls/sdk/asr/internal/listeners/AsrListenerManager;", "commandExecutor", "listenerManager", "<init>", "(Lru/ok/android/externcalls/sdk/asr/internal/commands/AsrCommandsExecutor;Lru/ok/android/externcalls/sdk/asr/internal/listeners/AsrListenerManager;)V", "", "fileName", "Lzad;", "sessionRoomId", "Lkotlin/Function0;", "Le5f;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Ljava/lang/String;Lzad;Lk56;Lm56;)V", "stopRecord", "(Lzad;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/asr/listener/AsrRecordListener;", "listener", "addAsrRecordListener", "(Lru/ok/android/externcalls/sdk/asr/listener/AsrRecordListener;)V", "removeAsrRecordListener", "Lru/ok/android/externcalls/sdk/asr/internal/commands/AsrCommandsExecutor;", "Lru/ok/android/externcalls/sdk/asr/internal/listeners/AsrListenerManager;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AsrManagerImpl implements AsrManager, AsrCommandsExecutor, AsrListenerManager {
    private final AsrCommandsExecutor commandExecutor;
    private final AsrListenerManager listenerManager;

    public AsrManagerImpl(AsrCommandsExecutor asrCommandsExecutor, AsrListenerManager asrListenerManager) {
        this.commandExecutor = asrCommandsExecutor;
        this.listenerManager = asrListenerManager;
    }

    @Override // ru.ok.android.externcalls.sdk.asr.AsrManager, ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager
    public void addAsrRecordListener(AsrRecordListener listener) {
        this.listenerManager.addAsrRecordListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.asr.AsrManager, ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager
    public void removeAsrRecordListener(AsrRecordListener listener) {
        this.listenerManager.removeAsrRecordListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.asr.AsrManager, ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutor
    public void startRecord(String fileName, zad sessionRoomId, k56 onSuccess, m56 onError) {
        this.commandExecutor.startRecord(fileName, sessionRoomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.asr.AsrManager, ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutor
    public void stopRecord(zad sessionRoomId, k56 onSuccess, m56 onError) {
        this.commandExecutor.stopRecord(sessionRoomId, onSuccess, onError);
    }
}
