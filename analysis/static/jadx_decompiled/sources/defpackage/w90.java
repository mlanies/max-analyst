package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w90 {
    public final Executor a;
    public final Handler b;

    public w90(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.b = handler;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w90)) {
            return false;
        }
        w90 w90Var = (w90) obj;
        return this.a.equals(w90Var.a) && this.b.equals(w90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}
