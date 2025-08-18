package org.webrtc.audio;

import android.media.projection.MediaProjection;

/* loaded from: classes2.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void restartAudioRecording();

    void setMicrophoneMute(boolean z);

    default boolean setNoiseSuppressorEnabled(boolean z) {
        return false;
    }

    void setOneAnnNoiseSuppressorEnabled(boolean z);

    default boolean setPreferredMicrophoneFieldDimension(float f) {
        return false;
    }

    void setSpeakerMute(boolean z);

    void startDeviceAudioShare(MediaProjection mediaProjection);

    void stopDeviceAudioShare();
}
