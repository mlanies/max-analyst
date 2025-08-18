package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import defpackage.qy5;

/* loaded from: classes.dex */
public final class AudioSink$ConfigurationException extends Exception {
    public final qy5 a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, qy5 qy5Var) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.a = qy5Var;
    }

    public AudioSink$ConfigurationException(qy5 qy5Var, String str) {
        super(str);
        this.a = qy5Var;
    }
}
