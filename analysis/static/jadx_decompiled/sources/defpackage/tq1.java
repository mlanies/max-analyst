package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* loaded from: classes.dex */
public final class tq1 implements CallsAudioManager.DisabledAudioDeviceUsagePolicy {
    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager.DisabledAudioDeviceUsagePolicy
    public final boolean isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType audioDeviceType) {
        return audioDeviceType == CallsAudioManager.AudioDeviceType.BLUETOOTH;
    }
}
