package com.google.android.exoplayer2;

import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.ce8;
import defpackage.maf;
import defpackage.np8;
import defpackage.oy5;
import defpackage.rh4;

/* loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final int X;
    public final oy5 Y;
    public final int Z;
    public final int c;
    public final String o;
    public final ce8 s0;
    public final boolean t0;

    public ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    public final ExoPlaybackException a(ce8 ce8Var) {
        String message = getMessage();
        int i = maf.a;
        return new ExoPlaybackException(message, getCause(), this.a, this.c, this.o, this.X, this.Y, this.Z, ce8Var, this.b, this.t0);
    }

    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, oy5 oy5Var, int i4, ce8 ce8Var, long j, boolean z) {
        super(str, th, i, j);
        np8.d(!z || i2 == 1);
        np8.d(th != null || i2 == 3);
        this.c = i2;
        this.o = str2;
        this.X = i3;
        this.Y = oy5Var;
        this.Z = i4;
        this.s0 = ce8Var;
        this.t0 = z;
    }

    public ExoPlaybackException(int i, Throwable th, int i2, String str, int i3, oy5 oy5Var, int i4, boolean z) {
        String string;
        String str2;
        if (i == 0) {
            string = "Source error";
        } else if (i == 1) {
            String strValueOf = String.valueOf(oy5Var);
            int i5 = maf.a;
            if (i4 == 0) {
                str2 = "NO";
            } else if (i4 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str2 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i4 == 4) {
                str2 = "YES";
            } else {
                throw new IllegalStateException();
            }
            StringBuilder sb = new StringBuilder(str2.length() + strValueOf.length() + rh4.e(53, str));
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(str2);
            string = sb.toString();
        } else if (i != 3) {
            string = "Unexpected runtime error";
        } else {
            string = "Remote error";
        }
        if (!TextUtils.isEmpty(null)) {
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb2 = new StringBuilder("null".length() + strValueOf2.length() + 2);
            sb2.append(strValueOf2);
            sb2.append(": null");
            string = sb2.toString();
        }
        this(string, th, i2, i, str, i3, oy5Var, i4, null, SystemClock.elapsedRealtime(), z);
    }
}
