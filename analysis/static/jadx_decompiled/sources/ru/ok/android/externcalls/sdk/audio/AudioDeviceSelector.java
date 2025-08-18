package ru.ok.android.externcalls.sdk.audio;

import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001Jh\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "", "selectPreferableDevice", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "state", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "bluetooth", "", "respectSpeakerEnabled", "hasWiredHeadset", "hasEarpiece", "disabledSpeakerOnce", "disabledBluetoothOnce", "availableAudioDevices", "", "currentDevice", "videoTracker", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "proximityTracker", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AudioDeviceSelector {
    CallsAudioManager.AudioDeviceType selectPreferableDevice(CallsAudioManager.State state, boolean bluetooth, boolean respectSpeakerEnabled, boolean hasWiredHeadset, boolean hasEarpiece, boolean disabledSpeakerOnce, boolean disabledBluetoothOnce, Set<? extends CallsAudioManager.AudioDeviceType> availableAudioDevices, CallsAudioManager.AudioDeviceType currentDevice, VideoTracker videoTracker, ProximityTracker proximityTracker);
}
