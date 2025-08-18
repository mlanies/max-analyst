package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.view.KeyEvent;
import defpackage.k7d;
import defpackage.tpa;
import defpackage.z84;
import defpackage.zr6;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.Logger;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 62\u00020\u0001:\u000267B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\"\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u000e\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0\u001fH\u0003¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0007¢\u0006\u0004\b&\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0011\u00103\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00104\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager;", "", "Landroid/content/Context;", "context", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;", "callsAudioManager", "Lru/ok/android/externcalls/sdk/audio/Logger;", "logger", "<init>", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;Lru/ok/android/externcalls/sdk/audio/Logger;)V", "Landroid/content/BroadcastReceiver;", "broadcastReceiver", "Landroid/content/Intent;", "intent", "Le5f;", "onReceiveBroadcast", "(Landroid/content/BroadcastReceiver;Landroid/content/Intent;)V", "handleHeadsetPlugAction", "(Landroid/content/Intent;)V", "", "plugged", "action", "updateWiredHeadsetState", "(ZLandroid/content/Intent;)V", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "getWiredHeadsetStateSdk27", "()Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "", "pluggedDevicePort", "getWiredHeadsetStateSdk28", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "", "Landroid/media/AudioDeviceInfo;", "devices", "getDeviceNameByPortName", "(Ljava/lang/String;[Landroid/media/AudioDeviceInfo;)Ljava/lang/String;", "start", "()V", "stop", "Landroid/content/Context;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "wiredHeadsetState", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "headsetReceiver", "Landroid/content/BroadcastReceiver;", "getConnectedDeviceName", "()Ljava/lang/String;", "connectedDeviceName", "isWiredHeadsetPlugged", "()Z", "Companion", "WiredHeadsetState", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CallsWiredHeadsetManager {
    private static final String LOG_TAG = "CallsWiredHeadsetManager";
    private final AudioManager audioManager;
    private final CallsAudioManagerV2Impl callsAudioManager;
    private final Context context;
    private final Logger logger;
    private volatile WiredHeadsetState wiredHeadsetState = WiredHeadsetState.None.INSTANCE;
    private final BroadcastReceiver headsetReceiver = new BroadcastReceiver() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsWiredHeadsetManager$headsetReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.this$0.onReceiveBroadcast(this, intent);
        }
    };

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "", "None", "Plugged", "Unplugged", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$None;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$Plugged;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$Unplugged;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface WiredHeadsetState {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$None;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class None implements WiredHeadsetState {
            public static final None INSTANCE = new None();

            private None() {
            }

            public String toString() {
                return "Uninitialized";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$Plugged;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Plugged implements WiredHeadsetState {
            private final String name;

            /* JADX WARN: Multi-variable type inference failed */
            public Plugged() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Plugged copy$default(Plugged plugged, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = plugged.name;
                }
                return plugged.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final Plugged copy(String name) {
                return new Plugged(name);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Plugged) && tpa.f(this.name, ((Plugged) other).name);
            }

            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.name.hashCode();
            }

            public String toString() {
                return zr6.i("Plugged(name=", this.name, ")");
            }

            public Plugged(String str) {
                this.name = str;
            }

            public /* synthetic */ Plugged(String str, int i, z84 z84Var) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$Unplugged;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Unplugged implements WiredHeadsetState {
            public static final Unplugged INSTANCE = new Unplugged();

            private Unplugged() {
            }

            public String toString() {
                return "Unplugged";
            }
        }
    }

    public CallsWiredHeadsetManager(Context context, CallsAudioManagerV2Impl callsAudioManagerV2Impl, Logger logger) {
        this.context = context;
        this.callsAudioManager = callsAudioManagerV2Impl;
        this.logger = logger;
        this.audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    @TargetApi(23)
    private final String getDeviceNameByPortName(String pluggedDevicePort, AudioDeviceInfo[] devices) {
        String str = CallsAudioDeviceInfo.WIRED_HEADPHONES;
        if (pluggedDevicePort == null) {
            return CallsAudioDeviceInfo.WIRED_HEADPHONES;
        }
        this.logger.v(LOG_TAG, "Looking for a used wired device using port name ".concat(pluggedDevicePort));
        int length = devices.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            AudioDeviceInfo audioDeviceInfo = devices[i];
            if (tpa.f(audioDeviceInfo.getProductName(), pluggedDevicePort)) {
                int type = audioDeviceInfo.getType();
                if (type == 3) {
                    str = CallsAudioDeviceInfo.WIRED_HEADSET;
                } else if (type == 11 || type == 22) {
                    str = CallsAudioDeviceInfo.USB_HEADSET;
                }
                this.logger.v(LOG_TAG, "Matching device found " + audioDeviceInfo);
            } else {
                i++;
            }
        }
        return str;
    }

    private final WiredHeadsetState getWiredHeadsetStateSdk27() {
        return this.audioManager.isWiredHeadsetOn() ? new WiredHeadsetState.Plugged("") : WiredHeadsetState.Unplugged.INSTANCE;
    }

    @TargetApi(28)
    private final WiredHeadsetState getWiredHeadsetStateSdk28(String pluggedDevicePort) {
        try {
            AudioDeviceInfo[] devices = this.audioManager.getDevices(2);
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                int type = audioDeviceInfo.getType();
                if (type == 3) {
                    z2 = true;
                } else if (type == 4) {
                    z3 = true;
                } else if (type == 11 || type == 22) {
                    z = true;
                }
                if (z && z2 && z3) {
                    break;
                }
            }
            this.logger.v(LOG_TAG, "Wired device connectivity check: usb=" + z + " headset=" + z2 + " phones=" + z3);
            if (!z && !z3 && !z2) {
                return WiredHeadsetState.Unplugged.INSTANCE;
            }
            return new WiredHeadsetState.Plugged(((z2 || z3) && z) ? getDeviceNameByPortName(pluggedDevicePort, devices) : z ? CallsAudioDeviceInfo.USB_HEADSET : z2 ? CallsAudioDeviceInfo.WIRED_HEADSET : CallsAudioDeviceInfo.WIRED_HEADPHONES);
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Can't detect audio device name", th);
            return WiredHeadsetState.Unplugged.INSTANCE;
        }
    }

    private final void handleHeadsetPlugAction(Intent intent) {
        int intExtra = intent.getIntExtra("state", -1);
        if (intExtra == 0 || intExtra == 1) {
            updateWiredHeadsetState(intExtra == 1, intent);
        } else {
            this.logger.e(LOG_TAG, "unknown headset state received");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onReceiveBroadcast(BroadcastReceiver broadcastReceiver, Intent intent) {
        KeyEvent keyEvent;
        this.logger.v(LOG_TAG, "CAM got " + intent);
        String action = intent.getAction();
        if ("android.intent.action.HEADSET_PLUG".equals(action)) {
            handleHeadsetPlugAction(intent);
            return;
        }
        if ("android.intent.action.MEDIA_BUTTON".equals(action) && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 5 || keyCode == 6 || keyCode == 79 || keyCode == 126 || keyCode == 127) {
                try {
                    broadcastReceiver.abortBroadcast();
                } catch (Exception e) {
                    this.logger.e(LOG_TAG, "onReceiveBroadcast: failed to abort broadcast, e: " + e);
                }
            }
        }
    }

    private final void updateWiredHeadsetState(boolean plugged, Intent action) {
        String stringExtra = action.getStringExtra("name");
        String stringExtra2 = action.getStringExtra("portName");
        boolean z = action.getIntExtra("microphone", 0) == 1;
        if (plugged) {
            Logger logger = this.logger;
            StringBuilder sbK = k7d.k("Wired device plugged: name=", stringExtra, " port=", stringExtra2, " hasMic=");
            sbK.append(z);
            logger.v(LOG_TAG, sbK.toString());
        } else {
            Logger logger2 = this.logger;
            StringBuilder sbK2 = k7d.k("Wired device unplugged: name=", stringExtra, " port=", stringExtra2, " hasMic=");
            sbK2.append(z);
            logger2.v(LOG_TAG, sbK2.toString());
        }
        if (!plugged) {
            stringExtra2 = null;
        }
        this.wiredHeadsetState = getWiredHeadsetStateSdk28(stringExtra2);
        if (this.wiredHeadsetState instanceof WiredHeadsetState.Plugged) {
            this.callsAudioManager.setSpeakerEnabled$calls_audiomanager_release(false, false);
        } else {
            CallsAudioManagerV2Impl.selectPreferredAudioDevice$calls_audiomanager_release$default(this.callsAudioManager, false, 1, null);
        }
    }

    public final String getConnectedDeviceName() {
        WiredHeadsetState wiredHeadsetState = this.wiredHeadsetState;
        return wiredHeadsetState instanceof WiredHeadsetState.Plugged ? ((WiredHeadsetState.Plugged) wiredHeadsetState).getName() : "";
    }

    public final boolean isWiredHeadsetPlugged() {
        return this.wiredHeadsetState instanceof WiredHeadsetState.Plugged;
    }

    public final void start() {
        this.logger.v(LOG_TAG, "start tracking headset");
        if (!(this.wiredHeadsetState instanceof WiredHeadsetState.None)) {
            this.logger.e(LOG_TAG, "already started, ignore");
        } else {
            this.wiredHeadsetState = WiredHeadsetState.Unplugged.INSTANCE;
            this.context.registerReceiver(this.headsetReceiver, new IntentFilter("android.intent.action.HEADSET_PLUG"), null, this.callsAudioManager.getWorkerThreadHandler());
        }
    }

    public final void stop() {
        this.logger.v(LOG_TAG, "stop tracking headset");
        if (this.wiredHeadsetState instanceof WiredHeadsetState.None) {
            this.logger.e(LOG_TAG, "already stopped, ignore");
        } else {
            this.wiredHeadsetState = WiredHeadsetState.None.INSTANCE;
            this.context.unregisterReceiver(this.headsetReceiver);
        }
    }
}
