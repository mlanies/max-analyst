package ru.ok.android.externcalls.sdk.audio.internal;

import defpackage.z84;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.AudioDeviceSelector;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Jh\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/DefaultAudioDeviceSelector;", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "logger", "Lru/ok/android/externcalls/sdk/audio/Logger;", "(Lru/ok/android/externcalls/sdk/audio/Logger;)V", "selectPreferableDevice", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "state", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "bluetooth", "", "respectSpeakerEnabled", "hasWiredHeadset", "hasEarpiece", "disabledSpeakerOnce", "disabledBluetoothOnce", "availableAudioDevices", "", "currentDevice", "videoTracker", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "proximityTracker", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultAudioDeviceSelector implements AudioDeviceSelector {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "DefaultAudioDeviceSelector";
    private final Logger logger;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/DefaultAudioDeviceSelector$Companion;", "", "()V", "LOG_TAG", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    public DefaultAudioDeviceSelector(Logger logger) {
        this.logger = logger;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.AudioDeviceSelector
    public CallsAudioManager.AudioDeviceType selectPreferableDevice(CallsAudioManager.State state, boolean bluetooth, boolean respectSpeakerEnabled, boolean hasWiredHeadset, boolean hasEarpiece, boolean disabledSpeakerOnce, boolean disabledBluetoothOnce, Set<? extends CallsAudioManager.AudioDeviceType> availableAudioDevices, CallsAudioManager.AudioDeviceType currentDevice, VideoTracker videoTracker, ProximityTracker proximityTracker) {
        CallsAudioManager.AudioDeviceType audioDeviceType;
        CallsAudioManager.AudioDeviceType audioDeviceType2;
        boolean z = bluetooth && availableAudioDevices.contains(CallsAudioManager.AudioDeviceType.BLUETOOTH);
        boolean z2 = (respectSpeakerEnabled && currentDevice == CallsAudioManager.AudioDeviceType.SPEAKER_PHONE) || videoTracker.preferSpeakerOverEarpiece();
        this.logger.v(LOG_TAG, "selecting the best device: bt: " + bluetooth + ", respectSpeaker: " + respectSpeakerEnabled + ", bt available: " + z + ", speaker: " + z2);
        if (hasWiredHeadset) {
            audioDeviceType = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
        } else if (z && (currentDevice == (audioDeviceType2 = CallsAudioManager.AudioDeviceType.BLUETOOTH) || !disabledBluetoothOnce)) {
            audioDeviceType = audioDeviceType2;
        } else if ((!disabledSpeakerOnce && proximityTracker.getCanUseSpeaker() && z2) || !hasEarpiece) {
            audioDeviceType = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        } else if (state == CallsAudioManager.State.RINGING) {
            this.logger.v(LOG_TAG, "select speaker phone because of RINGING state");
            audioDeviceType = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        } else {
            audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
        }
        this.logger.v(LOG_TAG, "prefer " + audioDeviceType);
        return audioDeviceType;
    }
}
