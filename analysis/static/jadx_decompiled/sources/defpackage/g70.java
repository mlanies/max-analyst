package defpackage;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g70 extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ h70 a;

    public g70(h70 h70Var) {
        this.a = h70Var;
    }

    @Override // android.media.AudioManager.AudioRecordingCallback
    public final void onRecordingConfigChanged(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
            int clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
            h70 h70Var = this.a;
            if (clientAudioSessionId == h70Var.a.getAudioSessionId()) {
                h70Var.d(audioRecordingConfiguration.isClientSilenced());
                return;
            }
        }
    }
}
