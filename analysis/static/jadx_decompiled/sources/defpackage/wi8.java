package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class wi8 {
    public yi8 a;

    public wi8(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        yi8 yi8Var = new yi8(str, i, i2);
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
        this.a = yi8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi8)) {
            return false;
        }
        return this.a.equals(((wi8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
