package com.google.android.exoplayer2.drm;

import java.io.IOException;

/* loaded from: classes.dex */
public class DrmSession$DrmSessionException extends IOException {
    public final int a;

    public DrmSession$DrmSessionException(Throwable th, int i) {
        super(th);
        this.a = i;
    }
}
