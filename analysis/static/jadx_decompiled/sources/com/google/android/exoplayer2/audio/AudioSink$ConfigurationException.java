package com.google.android.exoplayer2.audio;

import defpackage.oy5;

/* loaded from: classes.dex */
public final class AudioSink$ConfigurationException extends Exception {
    public final oy5 a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, oy5 oy5Var) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.a = oy5Var;
    }

    public AudioSink$ConfigurationException(String str, oy5 oy5Var) {
        super(str);
        this.a = oy5Var;
    }
}
