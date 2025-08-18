package ru.ok.android.externcalls.sdk.audio;

import defpackage.z99;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/MicrophoneManager;", "", "", "delay", "Lz99;", "callback", "Le5f;", "registerAudioSampleCallback", "(JLz99;)V", "removeAudioSampleCallback", "(Lz99;)V", "", "isMicEnabled", "()Z", "setMicEnabled", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface MicrophoneManager {
    boolean isMicEnabled();

    void registerAudioSampleCallback(long delay, z99 callback);

    void removeAudioSampleCallback(z99 callback);

    void setMicEnabled(boolean z);
}
