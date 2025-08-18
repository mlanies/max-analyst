package androidx.media3.common.audio;

import defpackage.j60;

/* loaded from: classes.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public final j60 a;

    public AudioProcessor$UnhandledAudioFormatException(j60 j60Var) {
        this("Unhandled input format:", j60Var);
    }

    public AudioProcessor$UnhandledAudioFormatException(String str, j60 j60Var) {
        super(str + " " + j60Var);
        this.a = j60Var;
    }
}
