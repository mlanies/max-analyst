package org.webrtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.media.projection.MediaProjection;
import android.os.Process;
import defpackage.u24;
import defpackage.wg0;
import defpackage.zr6;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.webrtc.CalledByNative;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes2.dex */
public class WebRtcAudioRecord {
    private static final int AUDIO_RECORD_START = 0;
    private static final int AUDIO_RECORD_STOP = 1;
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int CHECK_REC_STATUS_DELAY_MS = 100;
    public static final int DEFAULT_AUDIO_FORMAT = 2;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    private static final String TAG = "WebRtcAudioRecordExternal";
    private static final AtomicInteger nextSchedulerId = new AtomicInteger(0);
    private final int audioFormat;
    private final AudioManager audioManager;
    private final JavaAudioDeviceModule.AudioRecordSampleHook audioRecordSampleHook;
    private final JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private final AtomicReference<Boolean> audioSourceMatchesRecordingSessionRef;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private final Context context;
    private volatile AudioRecord deviceAudioRecord;
    private ByteBuffer deviceByteBuffer;
    private final WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;
    private final ScheduledExecutorService executor;
    private ScheduledFuture<String> future;
    private volatile int initChannels;
    private volatile int initSampleRate;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    private final boolean isSilenceProviderSupported;
    private MediaProjection mediaProjection;
    private volatile boolean microphoneMute;
    private long nativeAudioRecord;
    private AudioDeviceInfo preferredDevice;
    private volatile RecordState recordState;
    private final Object recordSwapLock;
    private volatile WebRtcSilenceProvider silenceProvider;
    private final JavaAudioDeviceModule.AudioRecordStateCallback stateCallback;
    private volatile AudioRecord voiceAudioRecord;

    /* renamed from: org.webrtc.audio.WebRtcAudioRecord$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState;

        static {
            int[] iArr = new int[RecordState.values().length];
            $SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState = iArr;
            try {
                iArr[RecordState.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState[RecordState.INITED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState[RecordState.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState[RecordState.RELEASED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState[RecordState.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;
        private volatile boolean startReported;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
            this.startReported = true;
        }

        private void trySendAudioSamples(AudioTimestamp audioTimestamp) {
            int i;
            int audioFormat;
            int channelCount;
            int sampleRate;
            long j;
            synchronized (WebRtcAudioRecord.this.recordSwapLock) {
                try {
                    if (WebRtcAudioRecord.this.voiceAudioRecord != null) {
                        audioFormat = WebRtcAudioRecord.this.voiceAudioRecord.getAudioFormat();
                        channelCount = WebRtcAudioRecord.this.voiceAudioRecord.getChannelCount();
                        sampleRate = WebRtcAudioRecord.this.voiceAudioRecord.getSampleRate();
                        i = WebRtcAudioRecord.this.voiceAudioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                    } else if (WebRtcAudioRecord.this.silenceProvider != null) {
                        audioFormat = WebRtcAudioRecord.this.silenceProvider.getAudioFormat();
                        channelCount = WebRtcAudioRecord.this.silenceProvider.getChannelCount();
                        sampleRate = WebRtcAudioRecord.this.silenceProvider.getSampleRate();
                        i = WebRtcAudioRecord.this.silenceProvider.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                    } else {
                        i = -3;
                        audioFormat = 0;
                        channelCount = 0;
                        sampleRate = 0;
                    }
                    long j2 = 0;
                    try {
                        if (WebRtcAudioRecord.this.voiceAudioRecord != null && WebRtcAudioRecord.this.voiceAudioRecord.getTimestamp(audioTimestamp, 0) == 0) {
                            j2 = audioTimestamp.nanoTime;
                        }
                    } catch (IllegalStateException unused) {
                    }
                    j = j2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i != WebRtcAudioRecord.this.byteBuffer.capacity()) {
                int i2 = i;
                String str = "AudioRecord.read failed: " + i2;
                Logging.e(WebRtcAudioRecord.TAG, str);
                if (i2 == -3) {
                    this.keepAlive = false;
                    WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                    return;
                }
                return;
            }
            if (WebRtcAudioRecord.this.audioRecordSampleHook != null) {
                WebRtcAudioRecord.this.audioRecordSampleHook.onWebRtcAudioRecordSamplesReady(audioFormat, channelCount, sampleRate, WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), i);
            }
            if (WebRtcAudioRecord.this.audioSamplesReadyCallback != null) {
                WebRtcAudioRecord.this.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(audioFormat, channelCount, sampleRate, Arrays.copyOfRange(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), WebRtcAudioRecord.this.byteBuffer.arrayOffset() + WebRtcAudioRecord.this.byteBuffer.capacity())));
            }
            if (WebRtcAudioRecord.this.microphoneMute) {
                WebRtcAudioRecord.this.byteBuffer.clear();
                WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
            }
            if (this.keepAlive) {
                WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                webRtcAudioRecord.nativeDataIsRecorded(webRtcAudioRecord.nativeAudioRecord, i, j);
            }
        }

        private void trySendDeviceAudioSamples(AudioTimestamp audioTimestamp) {
            int i;
            long j;
            if (WebRtcAudioRecord.this.deviceAudioRecord != null && WebRtcAudioRecord.this.deviceAudioRecord.getRecordingState() == 3) {
                synchronized (WebRtcAudioRecord.this.recordSwapLock) {
                    if (WebRtcAudioRecord.this.deviceAudioRecord != null) {
                        WebRtcAudioRecord.this.deviceAudioRecord.getAudioFormat();
                        WebRtcAudioRecord.this.deviceAudioRecord.getChannelCount();
                        WebRtcAudioRecord.this.deviceAudioRecord.getSampleRate();
                        i = WebRtcAudioRecord.this.deviceAudioRecord.read(WebRtcAudioRecord.this.deviceByteBuffer, WebRtcAudioRecord.this.deviceByteBuffer.capacity());
                    } else {
                        i = -3;
                    }
                    j = 0;
                    try {
                        if (WebRtcAudioRecord.this.deviceAudioRecord != null && WebRtcAudioRecord.this.deviceAudioRecord.getTimestamp(audioTimestamp, 0) == 0) {
                            j = audioTimestamp.nanoTime;
                        }
                    } catch (IllegalStateException unused) {
                    }
                }
                if (i == WebRtcAudioRecord.this.deviceByteBuffer.capacity()) {
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDeviceDataIsRecorded(webRtcAudioRecord.nativeAudioRecord, i, j);
                        return;
                    }
                    return;
                }
                String str = "device AudioRecord.read failed: " + i;
                Logging.e(WebRtcAudioRecord.TAG, str);
                if (i == -3) {
                    WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioRecord.TAG, "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            synchronized (WebRtcAudioRecord.this.recordSwapLock) {
                try {
                    if (WebRtcAudioRecord.this.voiceAudioRecord == null && WebRtcAudioRecord.this.silenceProvider == null) {
                        return;
                    }
                    WebRtcAudioRecord.assertTrue(WebRtcAudioRecord.this.silenceProvider != null || (WebRtcAudioRecord.this.voiceAudioRecord != null && WebRtcAudioRecord.this.voiceAudioRecord.getRecordingState() == 3));
                    WebRtcAudioRecord.this.doAudioRecordStateCallback(0);
                    System.nanoTime();
                    AudioTimestamp audioTimestamp = new AudioTimestamp();
                    AudioTimestamp audioTimestamp2 = new AudioTimestamp();
                    while (this.keepAlive) {
                        if (WebRtcAudioRecord.this.voiceAudioRecord == null && WebRtcAudioRecord.this.silenceProvider == null) {
                            Logging.e(WebRtcAudioRecord.TAG, "AudioRecordThread: null record and silence provider");
                        } else {
                            trySendDeviceAudioSamples(audioTimestamp2);
                            trySendAudioSamples(audioTimestamp);
                        }
                    }
                    WebRtcAudioRecord.this.doAudioRecordStop(false);
                    WebRtcAudioRecord.this.doAudioRecordStop(true);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public enum RecordState {
        NONE,
        INITED,
        STARTED,
        STOPPED,
        RELEASED
    }

    @CalledByNative
    public WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, newDefaultScheduler(), audioManager, 7, 2, null, null, null, null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private static String audioStateToString(int i) {
        return i != 0 ? i != 1 ? "INVALID" : "STOP" : "START";
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    @TargetApi(SavedMessagesIconDrawable.NORMAL_ICON_SIZE)
    private static boolean checkDeviceMatch(AudioDeviceInfo audioDeviceInfo, AudioDeviceInfo audioDeviceInfo2) {
        return audioDeviceInfo.getId() == audioDeviceInfo2.getId() && audioDeviceInfo.getType() == audioDeviceInfo2.getType();
    }

    private static AudioRecord createAudioRecordOnLowerThanM(int i, int i2, int i3, int i4, int i5) {
        Logging.d(TAG, "createAudioRecordOnLowerThanM");
        return new AudioRecord(i, i2, i3, i4, i5);
    }

    @TargetApi(23)
    private static AudioRecord createAudioRecordOnMOrHigher(int i, int i2, int i3, int i4, int i5) {
        Logging.d(TAG, "createAudioRecordOnMOrHigher");
        return new AudioRecord.Builder().setAudioSource(i).setAudioFormat(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i2).setChannelMask(i3).build()).setBufferSizeInBytes(i5).build();
    }

    private boolean doAudioRecordInit(int i, int i2) {
        synchronized (this.recordSwapLock) {
            int iChannelCountToConfiguration = channelCountToConfiguration(i2);
            int minBufferSize = AudioRecord.getMinBufferSize(i, iChannelCountToConfiguration, this.audioFormat);
            if (minBufferSize != -1 && minBufferSize != -2) {
                Logging.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
                int iMax = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
                Logging.d(TAG, "bufferSizeInBytes: " + iMax);
                try {
                    this.voiceAudioRecord = createAudioRecordOnMOrHigher(this.audioSource, i, iChannelCountToConfiguration, this.audioFormat, iMax);
                    this.audioSourceMatchesRecordingSessionRef.set(null);
                    AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
                    if (audioDeviceInfo != null) {
                        setPreferredDevice(audioDeviceInfo);
                    }
                } catch (IllegalArgumentException | UnsupportedOperationException e) {
                    if (this.silenceProvider == null) {
                        Logging.d(TAG, "Silence provider is null");
                        reportWebRtcAudioRecordInitError(e.getMessage());
                        releaseAudioResources(false);
                        return true;
                    }
                    releaseAudioResources(false);
                }
                if (this.voiceAudioRecord != null && this.voiceAudioRecord.getState() == 1) {
                    this.effects.enable(this.voiceAudioRecord.getAudioSessionId());
                } else {
                    if (this.silenceProvider == null) {
                        Logging.d(TAG, "Silence provider is null");
                        reportWebRtcAudioRecordInitError("Creation or initialization of audio recorder failed.");
                        releaseAudioResources(false);
                        return true;
                    }
                    releaseAudioResources(false);
                }
                this.recordState = RecordState.INITED;
                return false;
            }
            reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            return true;
        }
    }

    private void doAudioRecordRelease() {
        synchronized (this.recordSwapLock) {
            this.effects.release();
            releaseAudioResources(false);
            releaseAudioResources(true);
            this.recordState = RecordState.RELEASED;
        }
    }

    private boolean doAudioRecordStart() {
        synchronized (this.recordSwapLock) {
            try {
                if (doAudioRecordStartImpl(this.voiceAudioRecord) && this.silenceProvider == null) {
                    return true;
                }
                this.recordState = RecordState.STARTED;
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean doAudioRecordStartImpl(AudioRecord audioRecord) throws IllegalStateException {
        if (audioRecord == null) {
            return true;
        }
        try {
            audioRecord.startRecording();
            if (audioRecord.getRecordingState() == 3) {
                return false;
            }
            reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, zr6.h(audioRecord.getRecordingState(), "AudioRecord.startRecording failed - incorrect state: "));
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, wg0.i("AudioRecord.startRecording failed: ", e.getMessage()));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioRecordStateCallback(int i) {
        Logging.d(TAG, "doAudioRecordStateCallback: " + audioStateToString(i));
        JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = this.stateCallback;
        if (audioRecordStateCallback != null) {
            if (i == 0) {
                audioRecordStateCallback.onWebRtcAudioRecordStart();
            } else if (i == 1) {
                audioRecordStateCallback.onWebRtcAudioRecordStop();
            } else {
                Logging.e(TAG, "Invalid audio state");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[Catch: all -> 0x0015, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0010, B:14:0x002d, B:15:0x0031, B:13:0x0018), top: B:19:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void doAudioRecordStop(boolean r5) {
        /*
            r4 = this;
            java.lang.String r0 = "AudioRecord.stop failed: "
            java.lang.Object r1 = r4.recordSwapLock
            monitor-enter(r1)
            android.media.AudioRecord r2 = r4.voiceAudioRecord     // Catch: java.lang.Throwable -> L15 java.lang.IllegalStateException -> L17
            if (r2 == 0) goto L2d
            android.media.AudioRecord r2 = r4.voiceAudioRecord     // Catch: java.lang.Throwable -> L15 java.lang.IllegalStateException -> L17
            r2.stop()     // Catch: java.lang.Throwable -> L15 java.lang.IllegalStateException -> L17
            if (r5 != 0) goto L2d
            r5 = 1
            r4.doAudioRecordStateCallback(r5)     // Catch: java.lang.Throwable -> L15 java.lang.IllegalStateException -> L17
            goto L2d
        L15:
            r4 = move-exception
            goto L33
        L17:
            r5 = move-exception
            java.lang.String r2 = "WebRtcAudioRecordExternal"
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L15
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L15
            r3.append(r5)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L15
            org.webrtc.Logging.e(r2, r5)     // Catch: java.lang.Throwable -> L15
        L2d:
            org.webrtc.audio.WebRtcAudioRecord$RecordState r5 = org.webrtc.audio.WebRtcAudioRecord.RecordState.STOPPED     // Catch: java.lang.Throwable -> L15
            r4.recordState = r5     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            return
        L33:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.audio.WebRtcAudioRecord.doAudioRecordStop(boolean):void");
    }

    @CalledByNative
    private boolean enableBuiltInAEC(boolean z) {
        Logging.d(TAG, "enableBuiltInAEC(" + z + ")");
        return this.effects.setAEC(z);
    }

    @CalledByNative
    private boolean enableBuiltInNS(boolean z) {
        Logging.d(TAG, "enableBuiltInNS(" + z + ")");
        return this.effects.setNS(z);
    }

    private static int getBytesPerSample(int i) {
        int i2 = 1;
        if (i != 1 && i != 2) {
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    if (i != 13) {
                        throw new IllegalArgumentException(zr6.h(i, "Bad audio format "));
                    }
                }
            }
            return i2;
        }
        return 2;
    }

    @CalledByNative
    private int initRecording(int i, int i2) throws IllegalStateException {
        this.initSampleRate = i;
        this.initChannels = i2;
        Logging.d(TAG, wg0.h("initRecording(sampleRate=", i, ", channels=", i2, ")"));
        if (this.voiceAudioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i3 = i / 100;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(getBytesPerSample(this.audioFormat) * i2 * i3);
        this.byteBuffer = byteBufferAllocateDirect;
        if (!byteBufferAllocateDirect.hasArray()) {
            reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
            return -1;
        }
        Logging.d(TAG, "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
        if (this.isSilenceProviderSupported) {
            this.silenceProvider = new WebRtcSilenceProvider(this.audioFormat, i, i2, i3, this.byteBuffer.capacity(), this.emptyBytes);
        }
        if (doAudioRecordInit(i, i2)) {
            return -1;
        }
        logMainParameters(this.voiceAudioRecord);
        logMainParametersExtended(this.voiceAudioRecord);
        int iLogRecordingConfigurations = logRecordingConfigurations(this.voiceAudioRecord, false);
        if (iLogRecordingConfigurations != 0) {
            Logging.w(TAG, "Potential microphone conflict. Active sessions: " + iLogRecordingConfigurations);
        }
        if (this.mediaProjection != null && this.deviceAudioRecord == null) {
            initDeviceAudioRecord(this.mediaProjection);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$scheduleLogRecordingConfigurationsTask$0(AudioRecord audioRecord) throws Exception {
        if (this.voiceAudioRecord == audioRecord) {
            logRecordingConfigurations(audioRecord, true);
            return "Scheduled task is done";
        }
        Logging.d(TAG, "audio record has changed");
        return "Scheduled task is done";
    }

    @TargetApi(SavedMessagesIconDrawable.NORMAL_ICON_SIZE)
    private static boolean logActiveRecordingConfigs(int i, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        Logging.d(TAG, "AudioRecordingConfigurations: ");
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            StringBuilder sb = new StringBuilder("  client audio source=");
            sb.append(WebRtcAudioUtils.audioSourceToString(audioRecordingConfiguration.getClientAudioSource()));
            sb.append(", client session id=");
            sb.append(audioRecordingConfiguration.getClientAudioSessionId());
            sb.append(" (");
            sb.append(i);
            sb.append(")\n  Device AudioFormat: channel count=");
            AudioFormat format = audioRecordingConfiguration.getFormat();
            sb.append(format.getChannelCount());
            sb.append(", channel index mask=");
            sb.append(format.getChannelIndexMask());
            sb.append(", channel mask=");
            sb.append(WebRtcAudioUtils.channelMaskToString(format.getChannelMask()));
            sb.append(", encoding=");
            sb.append(WebRtcAudioUtils.audioEncodingToString(format.getEncoding()));
            sb.append(", sample rate=");
            sb.append(format.getSampleRate());
            sb.append("\n  Client AudioFormat: channel count=");
            AudioFormat clientFormat = audioRecordingConfiguration.getClientFormat();
            sb.append(clientFormat.getChannelCount());
            sb.append(", channel index mask=");
            sb.append(clientFormat.getChannelIndexMask());
            sb.append(", channel mask=");
            sb.append(WebRtcAudioUtils.channelMaskToString(clientFormat.getChannelMask()));
            sb.append(", encoding=");
            sb.append(WebRtcAudioUtils.audioEncodingToString(clientFormat.getEncoding()));
            sb.append(", sample rate=");
            sb.append(clientFormat.getSampleRate());
            sb.append("\n");
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null) {
                assertTrue(audioDevice.isSource());
                sb.append("  AudioDevice: type=");
                sb.append(WebRtcAudioUtils.deviceTypeToString(audioDevice.getType()));
                sb.append(", id=");
                sb.append(audioDevice.getId());
            }
            Logging.d(TAG, sb.toString());
        }
        return true;
    }

    private void logMainParameters(AudioRecord audioRecord) {
        if (audioRecord == null) {
            return;
        }
        int audioSessionId = audioRecord.getAudioSessionId();
        int channelCount = audioRecord.getChannelCount();
        int sampleRate = audioRecord.getSampleRate();
        StringBuilder sbJ = wg0.j("AudioRecord: session ID: ", audioSessionId, ", channels: ", channelCount, ", sample rate: ");
        sbJ.append(sampleRate);
        Logging.d(TAG, sbJ.toString());
    }

    @TargetApi(23)
    private void logMainParametersExtended(AudioRecord audioRecord) {
        if (audioRecord == null) {
            return;
        }
        Logging.d(TAG, "AudioRecord: buffer size in frames: " + audioRecord.getBufferSizeInFrames());
    }

    @TargetApi(SavedMessagesIconDrawable.NORMAL_ICON_SIZE)
    private int logRecordingConfigurations(AudioRecord audioRecord, boolean z) {
        if (audioRecord == null) {
            return 0;
        }
        List<AudioRecordingConfiguration> activeRecordingConfigurations = this.audioManager.getActiveRecordingConfigurations();
        int size = activeRecordingConfigurations.size();
        Logging.d(TAG, "Number of active recording sessions: " + size);
        if (size > 0) {
            logActiveRecordingConfigs(audioRecord.getAudioSessionId(), activeRecordingConfigurations);
            if (z) {
                this.audioSourceMatchesRecordingSessionRef.set(Boolean.valueOf(verifyAudioConfig(audioRecord.getAudioSource(), audioRecord.getAudioSessionId(), audioRecord.getFormat(), audioRecord.getRoutedDevice(), activeRecordingConfigurations)));
            }
        }
        return size;
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(long j, int i, long j2);

    private native void nativeDeviceCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDeviceDataIsRecorded(long j, int i, long j2);

    public static ScheduledExecutorService newDefaultScheduler() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        return Executors.newScheduledThreadPool(0, new ThreadFactory() { // from class: org.webrtc.audio.WebRtcAudioRecord.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("WebRtcAudioRecordScheduler-" + WebRtcAudioRecord.nextSchedulerId.getAndIncrement() + "-" + atomicInteger.getAndIncrement());
                return threadNewThread;
            }
        });
    }

    private void releaseAudioResources(boolean z) {
        Logging.d(TAG, "releaseAudioResources");
        if (z) {
            if (this.deviceAudioRecord != null) {
                this.deviceAudioRecord.release();
                this.deviceAudioRecord = null;
            }
        } else if (this.voiceAudioRecord != null) {
            this.voiceAudioRecord.release();
            this.voiceAudioRecord = null;
        }
        this.audioSourceMatchesRecordingSessionRef.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        Logging.e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.voiceAudioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.voiceAudioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private void scheduleLogRecordingConfigurationsTask(AudioRecord audioRecord) {
        if (audioRecord == null) {
            Logging.d(TAG, "scheduleLogRecordingConfigurationsTask: null audio record, ignore");
            return;
        }
        Logging.d(TAG, "scheduleLogRecordingConfigurationsTask");
        u24 u24Var = new u24(this, 10, audioRecord);
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.future.cancel(true);
        }
        this.future = this.executor.schedule(u24Var, 100L, TimeUnit.MILLISECONDS);
    }

    private void startAudioStuff(RecordState recordState) {
        int i = AnonymousClass2.$SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState[recordState.ordinal()];
        if (i == 1) {
            if (doAudioRecordInit(this.initSampleRate, this.initChannels)) {
                Logging.e(TAG, "init failed");
                return;
            } else {
                if (doAudioRecordStart()) {
                    Logging.e(TAG, "start failed");
                    return;
                }
                return;
            }
        }
        if (i == 2) {
            if (doAudioRecordInit(this.initSampleRate, this.initChannels)) {
                Logging.e(TAG, "init failed");
            }
        } else {
            if (i != 3) {
                return;
            }
            if (doAudioRecordInit(this.initSampleRate, this.initChannels)) {
                Logging.e(TAG, "init failed");
            } else if (doAudioRecordStart()) {
                Logging.e(TAG, "start failed");
            } else {
                doAudioRecordStop(false);
            }
        }
    }

    @CalledByNative
    private boolean startRecording() {
        Logging.d(TAG, "startRecording");
        assertTrue((this.voiceAudioRecord == null && this.silenceProvider == null) ? false : true);
        assertTrue(this.audioThread == null);
        if (doAudioRecordStart()) {
            return false;
        }
        AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
        this.audioThread = audioRecordThread;
        audioRecordThread.start();
        scheduleLogRecordingConfigurationsTask(this.voiceAudioRecord);
        return true;
    }

    private void stopAudioStuff() {
        int i = AnonymousClass2.$SwitchMap$org$webrtc$audio$WebRtcAudioRecord$RecordState[this.recordState.ordinal()];
        if (i == 1) {
            doAudioRecordStop(true);
        } else if (i != 2 && i != 3) {
            return;
        }
        doAudioRecordRelease();
    }

    @CalledByNative
    private boolean stopRecording() {
        Logging.d(TAG, "stopRecording");
        assertTrue(this.audioThread != null);
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.future.cancel(true);
            }
            this.future = null;
        }
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        this.audioThread = null;
        doAudioRecordRelease();
        return true;
    }

    @TargetApi(SavedMessagesIconDrawable.NORMAL_ICON_SIZE)
    private static boolean verifyAudioConfig(int i, int i2, AudioFormat audioFormat, AudioDeviceInfo audioDeviceInfo, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null && audioRecordingConfiguration.getClientAudioSource() == i && audioRecordingConfiguration.getClientAudioSessionId() == i2 && audioRecordingConfiguration.getClientFormat().getEncoding() == audioFormat.getEncoding() && audioRecordingConfiguration.getClientFormat().getSampleRate() == audioFormat.getSampleRate() && audioRecordingConfiguration.getClientFormat().getChannelMask() == audioFormat.getChannelMask() && audioRecordingConfiguration.getClientFormat().getChannelIndexMask() == audioFormat.getChannelIndexMask() && audioRecordingConfiguration.getFormat().getEncoding() != 0 && audioRecordingConfiguration.getFormat().getSampleRate() > 0 && (audioRecordingConfiguration.getFormat().getChannelMask() != 0 || audioRecordingConfiguration.getFormat().getChannelIndexMask() != 0)) {
                if (checkDeviceMatch(audioDevice, audioDeviceInfo)) {
                    Logging.d(TAG, "verifyAudioConfig: PASS");
                    return true;
                }
            }
        }
        Logging.e(TAG, "verifyAudioConfig: FAILED");
        return false;
    }

    @TargetApi(29)
    public void initDeviceAudioRecord(MediaProjection mediaProjection) throws IllegalStateException {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((this.initSampleRate / 100) * this.initChannels * getBytesPerSample(this.audioFormat));
        this.deviceByteBuffer = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        nativeDeviceCacheDirectBufferAddress(this.nativeAudioRecord, this.deviceByteBuffer);
        int iChannelCountToConfiguration = channelCountToConfiguration(this.initChannels);
        int minBufferSize = AudioRecord.getMinBufferSize(this.initSampleRate, iChannelCountToConfiguration, this.audioFormat);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError(zr6.h(minBufferSize, "AudioRecord.getMinBufferSize failed: "));
            return;
        }
        int iMax = Math.max(minBufferSize * 2, this.deviceByteBuffer.capacity());
        try {
            AudioPlaybackCaptureConfiguration.Builder builder = new AudioPlaybackCaptureConfiguration.Builder(mediaProjection);
            builder.addMatchingUsage(1);
            builder.addMatchingUsage(14);
            AudioRecord.Builder builder2 = new AudioRecord.Builder();
            builder2.setAudioPlaybackCaptureConfig(builder.build());
            builder2.setAudioFormat(new AudioFormat.Builder().setChannelMask(iChannelCountToConfiguration).setSampleRate(this.initSampleRate).setEncoding(2).build());
            builder2.setBufferSizeInBytes(iMax);
            this.deviceAudioRecord = builder2.build();
            this.mediaProjection = mediaProjection;
            if (this.deviceAudioRecord == null || this.deviceAudioRecord.getState() != 1) {
                reportWebRtcAudioRecordInitError("Failed to create a new device AudioRecord instance");
                releaseAudioResources(true);
                return;
            }
            try {
                this.deviceAudioRecord.startRecording();
                if (this.deviceAudioRecord.getRecordingState() != 3) {
                    reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, zr6.h(this.deviceAudioRecord.getRecordingState(), "device AudioRecord.startRecording failed - incorrect state :"));
                }
            } catch (IllegalStateException e) {
                reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, wg0.i("device AudioRecord.startRecording failed: ", e.getMessage()));
            }
        } catch (Throwable th) {
            reportWebRtcAudioRecordInitError(wg0.i("device AudioRecord ctor error: ", th.getMessage()));
            releaseAudioResources(true);
        }
    }

    @CalledByNative
    public boolean isAcousticEchoCancelerSupported() {
        return this.isAcousticEchoCancelerSupported;
    }

    @CalledByNative
    public boolean isAudioConfigVerified() {
        return this.audioSourceMatchesRecordingSessionRef.get() != null;
    }

    @CalledByNative
    public boolean isAudioSourceMatchingRecordingSession() {
        Boolean bool = this.audioSourceMatchesRecordingSessionRef.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        Logging.w(TAG, "Audio configuration has not yet been verified");
        return false;
    }

    @CalledByNative
    public boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
    }

    public void restartAudioRecording() {
        synchronized (this.recordSwapLock) {
            if (this.voiceAudioRecord == null && this.silenceProvider != null) {
                Logging.d(TAG, "Try to restart audio recording. Target state is " + this.recordState);
                synchronized (this.recordSwapLock) {
                    RecordState recordState = this.recordState;
                    stopAudioStuff();
                    startAudioStuff(recordState);
                }
                return;
            }
            Logging.d(TAG, "Audio record is initialized already (" + (this.voiceAudioRecord != null) + ") or silence provider was not created (" + (this.silenceProvider == null) + ")");
        }
    }

    public void setMicrophoneMute(boolean z) {
        Logging.w(TAG, "setMicrophoneMute(" + z + ")");
        this.microphoneMute = z;
    }

    @CalledByNative
    public void setNativeAudioRecord(long j) {
        this.nativeAudioRecord = j;
    }

    public boolean setNoiseSuppressorEnabled(boolean z) {
        if (!WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            Logging.e(TAG, "Noise suppressor is not supported.");
            return false;
        }
        Logging.w(TAG, "SetNoiseSuppressorEnabled(" + z + ")");
        return this.effects.toggleNS(z);
    }

    public void setOneAnnNoiseSuppressorEnabled(boolean z) {
        if (this.effects.nsEnabled() == z) {
            return;
        }
        synchronized (this.recordSwapLock) {
            RecordState recordState = this.recordState;
            stopAudioStuff();
            enableBuiltInNS(z);
            startAudioStuff(recordState);
        }
    }

    @TargetApi(23)
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        Logging.d(TAG, "setPreferredDevice " + (audioDeviceInfo != null ? Integer.valueOf(audioDeviceInfo.getId()) : null));
        this.preferredDevice = audioDeviceInfo;
        if (this.voiceAudioRecord == null || this.voiceAudioRecord.setPreferredDevice(audioDeviceInfo)) {
            return;
        }
        Logging.e(TAG, "setPreferredDevice failed");
    }

    @TargetApi(29)
    public void stopDeviceAudioRecord() {
        this.mediaProjection = null;
        if (this.deviceAudioRecord == null) {
            return;
        }
        try {
            this.deviceAudioRecord.stop();
        } catch (Throwable unused) {
            Logging.d(TAG, "error stopDeviceAudioRecord");
        }
        releaseAudioResources(true);
    }

    public WebRtcAudioRecord(Context context, ScheduledExecutorService scheduledExecutorService, AudioManager audioManager, int i, int i2, JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback, JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, JavaAudioDeviceModule.AudioRecordSampleHook audioRecordSampleHook, boolean z, boolean z2, boolean z3) {
        this.effects = new WebRtcAudioEffects();
        this.audioSourceMatchesRecordingSessionRef = new AtomicReference<>();
        this.recordState = RecordState.NONE;
        this.recordSwapLock = new Object();
        if (z && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            throw new IllegalArgumentException("HW AEC not supported");
        }
        if (z2 && !WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            throw new IllegalArgumentException("HW NS not supported");
        }
        this.context = context;
        this.executor = scheduledExecutorService;
        this.audioManager = audioManager;
        this.audioSource = i;
        this.audioFormat = i2;
        this.errorCallback = audioRecordErrorCallback;
        this.stateCallback = audioRecordStateCallback;
        this.audioSamplesReadyCallback = samplesReadyCallback;
        this.audioRecordSampleHook = audioRecordSampleHook;
        this.isAcousticEchoCancelerSupported = z;
        this.isNoiseSuppressorSupported = z2;
        this.isSilenceProviderSupported = z3;
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }
}
