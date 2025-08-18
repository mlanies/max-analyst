package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class vi8 {
    public final ti8 a;

    public vi8(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        ti8 ti8Var = new ti8(str, i, i2);
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
        this.a = ti8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi8)) {
            return false;
        }
        return this.a.equals(((vi8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public vi8(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                this.a = new ti8(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }
}
