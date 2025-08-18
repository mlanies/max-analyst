package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* loaded from: classes.dex */
public abstract /* synthetic */ class cr1 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CallsAudioManager.AudioDeviceType.values().length];
        try {
            iArr[CallsAudioManager.AudioDeviceType.EARPIECE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CallsAudioManager.AudioDeviceType.SPEAKER_PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
