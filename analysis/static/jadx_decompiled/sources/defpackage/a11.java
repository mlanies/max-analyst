package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

/* loaded from: classes.dex */
public final class a11 implements z01 {
    public final uq1 a;
    public final je7 b;
    public final AtomicReference c = new AtomicReference();

    public a11(je7 je7Var, uq1 uq1Var) {
        this.a = uq1Var;
        this.b = je7Var;
    }

    public final void a(CallsAudioManager.State state) {
        CallsAudioManager callsAudioManager = (CallsAudioManager) this.c.get();
        if (callsAudioManager != null) {
            CallsAudioManager.changeStateAsync$default(callsAudioManager, state, null, null, 6, null);
        }
    }

    public final CallsAudioDeviceInfo b() {
        CallsAudioDeviceInfo usedDevice;
        CallsAudioManager callsAudioManager = (CallsAudioManager) this.c.get();
        return (callsAudioManager == null || (usedDevice = callsAudioManager.getCurrentDevice()) == null) ? CallsAudioDeviceInfo.INSTANCE.getNONE() : usedDevice;
    }

    public final MicrophoneManager c() {
        Conversation conversationA = ((fw3) this.b.getValue()).a();
        if (conversationA != null) {
            return conversationA.getMicrophoneManager();
        }
        return null;
    }

    public final boolean d() {
        MicrophoneManager microphoneManagerC = c();
        return microphoneManagerC != null && microphoneManagerC.isMicEnabled();
    }
}
