package org.webrtc.audio;

import android.media.AudioManager;
import androidx.work.WorkRequest;
import defpackage.wg0;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;

/* loaded from: classes2.dex */
class VolumeLogger {
    private static final String TAG = "VolumeLogger";
    private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    private final AudioManager audioManager;
    private Timer timer;

    public class LogVolumeTask extends TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        public LogVolumeTask(int i, int i2) {
            this.maxRingVolume = i;
            this.maxVoiceCallVolume = i2;
        }

        private int getStreamVolume(int i) {
            try {
                return VolumeLogger.this.audioManager.getStreamVolume(i);
            } catch (Exception unused) {
                return -1;
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int mode = VolumeLogger.this.audioManager.getMode();
            if (mode == 1) {
                Logging.d(VolumeLogger.TAG, wg0.h("STREAM_RING stream volume: ", getStreamVolume(2), " (max=", this.maxRingVolume, ")"));
            } else if (mode == 3) {
                Logging.d(VolumeLogger.TAG, wg0.h("VOICE_CALL stream volume: ", getStreamVolume(0), " (max=", this.maxVoiceCallVolume, ")"));
            }
        }
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void start() {
        Logging.d(TAG, "start" + WebRtcAudioUtils.getThreadInfo());
        if (this.timer != null) {
            return;
        }
        Logging.d(TAG, "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        Timer timer = new Timer(THREAD_NAME);
        this.timer = timer;
        try {
            timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        } catch (Exception unused) {
        }
    }

    public void stop() {
        Logging.d(TAG, "stop" + WebRtcAudioUtils.getThreadInfo());
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}
