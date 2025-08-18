package defpackage;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.net.URL;

/* loaded from: classes.dex */
public final class mx1 {
    public int a;
    public long b;
    public Object c;

    public mx1(long j, Exception exc) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof CameraValidator$CameraIdListIncorrectException) {
            this.a = 2;
            this.c = exc;
            return;
        }
        if (!(exc instanceof InitializationException)) {
            this.a = 0;
            this.c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.c = exc;
        if (exc instanceof CameraUnavailableException) {
            this.a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.a = 1;
        } else {
            this.a = 0;
        }
    }

    public mx1(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }
}
