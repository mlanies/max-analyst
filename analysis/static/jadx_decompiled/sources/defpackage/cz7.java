package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* loaded from: classes.dex */
public abstract /* synthetic */ class cz7 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CallsAudioManager.AudioDeviceType.values().length];
        try {
            iArr[CallsAudioManager.AudioDeviceType.WIRED_HEADSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CallsAudioManager.AudioDeviceType.EARPIECE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CallsAudioManager.AudioDeviceType.BLUETOOTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CallsAudioManager.AudioDeviceType.BLUETOOTH_INTENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CallsAudioManager.AudioDeviceType.SPEAKER_PHONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
