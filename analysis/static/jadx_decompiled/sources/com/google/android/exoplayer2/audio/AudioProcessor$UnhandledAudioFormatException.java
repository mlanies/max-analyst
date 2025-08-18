package com.google.android.exoplayer2.audio;

import defpackage.i60;

/* loaded from: classes.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public AudioProcessor$UnhandledAudioFormatException(i60 i60Var) {
        String strValueOf = String.valueOf(i60Var);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
        sb.append("Unhandled format: ");
        sb.append(strValueOf);
        super(sb.toString());
    }
}
