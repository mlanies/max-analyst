package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import defpackage.au1;
import defpackage.fm9;
import defpackage.oaf;
import defpackage.qy5;
import defpackage.yj8;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public final boolean A0;
    public final int u0;
    public final String v0;
    public final int w0;
    public final qy5 x0;
    public final int y0;
    public final yj8 z0;

    static {
        int i = oaf.a;
        B0 = Integer.toString(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, 36);
        C0 = Integer.toString(1002, 36);
        D0 = Integer.toString(1003, 36);
        E0 = Integer.toString(1004, 36);
        F0 = Integer.toString(1005, 36);
        G0 = Integer.toString(1006, 36);
    }

    public ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    @Override // androidx.media3.common.PlaybackException
    public final boolean a(PlaybackException playbackException) {
        if (!super.a(playbackException)) {
            return false;
        }
        int i = oaf.a;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.u0 == exoPlaybackException.u0 && oaf.a(this.v0, exoPlaybackException.v0) && this.w0 == exoPlaybackException.w0 && oaf.a(this.x0, exoPlaybackException.x0) && this.y0 == exoPlaybackException.y0 && oaf.a(this.z0, exoPlaybackException.z0) && this.A0 == exoPlaybackException.A0;
    }

    @Override // androidx.media3.common.PlaybackException
    public final Bundle c() {
        Bundle bundleC = super.c();
        bundleC.putInt(B0, this.u0);
        bundleC.putString(C0, this.v0);
        bundleC.putInt(D0, this.w0);
        qy5 qy5Var = this.x0;
        if (qy5Var != null) {
            bundleC.putBundle(E0, qy5Var.d(false));
        }
        bundleC.putInt(F0, this.y0);
        bundleC.putBoolean(G0, this.A0);
        return bundleC;
    }

    public final ExoPlaybackException d(yj8 yj8Var) {
        String message = getMessage();
        int i = oaf.a;
        return new ExoPlaybackException(message, getCause(), this.a, this.u0, this.v0, this.w0, this.x0, this.y0, yj8Var, this.b, this.A0);
    }

    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, qy5 qy5Var, int i4, yj8 yj8Var, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        fm9.f(!z || i2 == 1);
        fm9.f(th != null || i2 == 3);
        this.u0 = i2;
        this.v0 = str2;
        this.w0 = i3;
        this.x0 = qy5Var;
        this.y0 = i4;
        this.z0 = yj8Var;
        this.A0 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, Throwable th, int i2, String str, int i3, qy5 qy5Var, int i4, boolean z) {
        String str2;
        if (i == 0) {
            str2 = "Source error";
        } else if (i == 1) {
            str2 = str + " error, index=" + i3 + ", format=" + qy5Var + ", format_supported=" + oaf.z(i4);
        } else if (i != 3) {
            str2 = "Unexpected runtime error";
        } else {
            str2 = "Remote error";
        }
        this(TextUtils.isEmpty(null) ? str2 : au1.g(str2, ": null"), th, i2, i, str, i3, qy5Var, i4, null, SystemClock.elapsedRealtime(), z);
    }
}
