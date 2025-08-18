package com.google.android.exoplayer2.audio;

import defpackage.oy5;
import defpackage.z7b;

/* loaded from: classes.dex */
public final class AudioSink$WriteException extends Exception {
    public final boolean a;
    public final oy5 b;

    public AudioSink$WriteException(int i, oy5 oy5Var, boolean z) {
        super(z7b.h(36, i, "AudioTrack write failed: "));
        this.a = z;
        this.b = oy5Var;
    }
}
