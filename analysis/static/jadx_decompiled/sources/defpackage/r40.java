package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;

/* loaded from: classes2.dex */
public final /* synthetic */ class r40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioFocusRequestHelper b;

    public /* synthetic */ r40(AudioFocusRequestHelper audioFocusRequestHelper, int i) {
        this.a = i;
        this.b = audioFocusRequestHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AudioFocusRequestHelper audioFocusRequestHelper = this.b;
        switch (i) {
            case 0:
                AudioFocusRequestHelper.muteForever$lambda$6(audioFocusRequestHelper);
                break;
            case 1:
                AudioFocusRequestHelper.mute$lambda$4(audioFocusRequestHelper);
                break;
            default:
                AudioFocusRequestHelper.unmute$lambda$8(audioFocusRequestHelper);
                break;
        }
    }
}
