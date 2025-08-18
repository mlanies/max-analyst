package ru.ok.android.externcalls.sdk.audio.internal;

import defpackage.flc;
import defpackage.k56;
import defpackage.py0;
import defpackage.qld;
import defpackage.tb2;
import defpackage.z99;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R$\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/MicrophoneManagerImpl;", "Lru/ok/android/externcalls/sdk/audio/MicrophoneManager;", "Lpy0;", "call", "Lkotlin/Function0;", "", "isPrepared", "<init>", "(Lpy0;Lk56;)V", "", "delay", "Lz99;", "callback", "Le5f;", "registerAudioSampleCallback", "(JLz99;)V", "removeAudioSampleCallback", "(Lz99;)V", "Lpy0;", "Lk56;", "value", "isMicEnabled", "()Z", "setMicEnabled", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MicrophoneManagerImpl implements MicrophoneManager {
    private final py0 call;
    private final k56 isPrepared;

    public MicrophoneManagerImpl(py0 py0Var, k56 k56Var) {
        this.call = py0Var;
        this.isPrepared = k56Var;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.MicrophoneManager
    public boolean isMicEnabled() {
        return this.call.y1.e;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.MicrophoneManager
    public void registerAudioSampleCallback(long delay, z99 callback) {
        qld qldVar = this.call.k1;
        qldVar.getClass();
        qldVar.a.execute(new tb2(qldVar, callback, delay, 6));
    }

    @Override // ru.ok.android.externcalls.sdk.audio.MicrophoneManager
    public void removeAudioSampleCallback(z99 callback) {
        qld qldVar = this.call.k1;
        qldVar.getClass();
        qldVar.a.execute(new flc(qldVar, 17, callback));
    }

    @Override // ru.ok.android.externcalls.sdk.audio.MicrophoneManager
    public void setMicEnabled(boolean z) {
        if (((Boolean) this.isPrepared.invoke()).booleanValue()) {
            this.call.E(!z);
        }
    }
}
