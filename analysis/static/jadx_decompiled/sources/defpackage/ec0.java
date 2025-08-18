package defpackage;

import androidx.camera.core.ImageCaptureException;

/* loaded from: classes.dex */
public final class ec0 {
    public final int a;
    public final ImageCaptureException b;

    public ec0(int i, ImageCaptureException imageCaptureException) {
        this.a = i;
        this.b = imageCaptureException;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ec0)) {
            return false;
        }
        ec0 ec0Var = (ec0) obj;
        return this.a == ec0Var.a && this.b.equals(ec0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.a + ", imageCaptureException=" + this.b + "}";
    }
}
