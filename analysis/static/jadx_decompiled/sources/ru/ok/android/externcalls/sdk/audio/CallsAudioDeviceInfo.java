package ru.ok.android.externcalls.sdk.audio;

import defpackage.tpa;
import defpackage.ys;
import defpackage.z84;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J#\u0010\u0013\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0015\"\u00020\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "", "deviceType", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "name", "", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;Ljava/lang/String;)V", "getDeviceType", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "oneOf", "devices", "", "oneOf$calls_audiomanager_release", "([Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)Z", "toString", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CallsAudioDeviceInfo {
    public static final String BLUETOOTH = "wireless headset";
    public static final String EARPIECE = "earpiece";
    public static final String NO_NAME_DEVICE = "";
    public static final String SPEAKERPHONE = "speakerphone";
    public static final String USB_HEADSET = "usb headset";
    public static final String WIRED_HEADPHONES = "wired headphones";
    public static final String WIRED_HEADSET = "wired headset";
    private final CallsAudioManager.AudioDeviceType deviceType;
    private final String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CallsAudioDeviceInfo NONE = new CallsAudioDeviceInfo(CallsAudioManager.AudioDeviceType.NONE, "");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo$Companion;", "", "()V", "BLUETOOTH", "", "EARPIECE", "NONE", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "getNONE", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "NO_NAME_DEVICE", "SPEAKERPHONE", "USB_HEADSET", "WIRED_HEADPHONES", "WIRED_HEADSET", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final CallsAudioDeviceInfo getNONE() {
            return CallsAudioDeviceInfo.NONE;
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    public CallsAudioDeviceInfo(CallsAudioManager.AudioDeviceType audioDeviceType, String str) {
        this.deviceType = audioDeviceType;
        this.name = str;
    }

    public static /* synthetic */ CallsAudioDeviceInfo copy$default(CallsAudioDeviceInfo callsAudioDeviceInfo, CallsAudioManager.AudioDeviceType audioDeviceType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            audioDeviceType = callsAudioDeviceInfo.deviceType;
        }
        if ((i & 2) != 0) {
            str = callsAudioDeviceInfo.name;
        }
        return callsAudioDeviceInfo.copy(audioDeviceType, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CallsAudioManager.AudioDeviceType getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final CallsAudioDeviceInfo copy(CallsAudioManager.AudioDeviceType deviceType, String name) {
        return new CallsAudioDeviceInfo(deviceType, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallsAudioDeviceInfo)) {
            return false;
        }
        CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) other;
        return this.deviceType == callsAudioDeviceInfo.deviceType && tpa.f(this.name, callsAudioDeviceInfo.name);
    }

    public final CallsAudioManager.AudioDeviceType getDeviceType() {
        return this.deviceType;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.deviceType.hashCode() * 31);
    }

    public final boolean oneOf$calls_audiomanager_release(CallsAudioManager.AudioDeviceType... devices) {
        return ys.T(devices, this.deviceType);
    }

    public String toString() {
        return "CallsAudioDeviceInfo(deviceType=" + this.deviceType + ", name=" + this.name + ")";
    }
}
