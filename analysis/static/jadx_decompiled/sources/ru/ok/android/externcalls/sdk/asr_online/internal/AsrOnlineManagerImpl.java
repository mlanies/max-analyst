package ru.ok.android.externcalls.sdk.asr_online.internal;

import defpackage.k56;
import defpackage.oy0;
import defpackage.py0;
import defpackage.s01;
import defpackage.st;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor;
import ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager;
import ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#¨\u0006$"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/internal/AsrOnlineManagerImpl;", "Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineManager;", "Ls01;", "Lru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManager;", "Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;", "commandExecutor", "Lru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManagerImpl;", "listenerManager", "Lkotlin/Function0;", "Lpy0;", "getCall", "<init>", "(Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;Lru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManagerImpl;Lk56;)V", "Lst;", "asrRecvDataPackage", "Le5f;", "onAsrDataPackage", "(Lst;)V", "Lru/ok/android/externcalls/sdk/asr_online/listener/AsrOnlineListener;", "listener", "addAsrOnlineListener", "(Lru/ok/android/externcalls/sdk/asr_online/listener/AsrOnlineListener;)V", "", "isAvailable", "onAsrAvailableChanged", "(Z)V", "removeAsrOnlineListener", "isEnabled", "enableAsrOnline", "onMigratedToServerCallTopology", "()V", "isAsrAvailable", "()Z", "Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;", "Lru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManagerImpl;", "Lk56;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AsrOnlineManagerImpl implements AsrOnlineManager, s01, AsrOnlineListenerManager, AsrOnlineCommandsExecutor {
    private final AsrOnlineCommandsExecutor commandExecutor;
    private final k56 getCall;
    private final AsrOnlineListenerManagerImpl listenerManager;

    public AsrOnlineManagerImpl(AsrOnlineCommandsExecutor asrOnlineCommandsExecutor, AsrOnlineListenerManagerImpl asrOnlineListenerManagerImpl, k56 k56Var) {
        this.commandExecutor = asrOnlineCommandsExecutor;
        this.listenerManager = asrOnlineListenerManagerImpl;
        this.getCall = k56Var;
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager, ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager
    public void addAsrOnlineListener(AsrOnlineListener listener) {
        this.listenerManager.addAsrOnlineListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager, ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor
    public void enableAsrOnline(boolean isEnabled) {
        this.commandExecutor.enableAsrOnline(isEnabled);
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager
    public boolean isAsrAvailable() {
        py0 py0Var = (py0) this.getCall.invoke();
        if (py0Var != null) {
            if (py0Var.z0.contains(oy0.Y)) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager
    public void onAsrAvailableChanged(boolean isAvailable) {
        this.listenerManager.onAsrAvailableChanged(isAvailable);
    }

    @Override // defpackage.s01
    public void onAsrDataPackage(st asrRecvDataPackage) {
        this.listenerManager.onAsrDataPackage(asrRecvDataPackage);
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor
    public void onMigratedToServerCallTopology() {
        this.commandExecutor.onMigratedToServerCallTopology();
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager, ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager
    public void removeAsrOnlineListener(AsrOnlineListener listener) {
        this.listenerManager.removeAsrOnlineListener(listener);
    }
}
