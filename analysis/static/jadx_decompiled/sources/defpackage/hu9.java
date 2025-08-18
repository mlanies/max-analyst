package defpackage;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;

/* loaded from: classes.dex */
public final class hu9 extends pu9 {
    public int[] e;
    public MediaSessionCompat.Token f;

    @Override // defpackage.pu9
    public final void b(m5d m5dVar) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) m5dVar.c;
        if (i >= 34) {
            pt9.d(builder, pt9.b(vt9.a(pt9.a(), null, 0, null, Boolean.FALSE), this.e, this.f));
        } else {
            pt9.d(builder, pt9.b(pt9.a(), this.e, this.f));
        }
    }

    @Override // defpackage.pu9
    public final RemoteViews h() {
        return null;
    }

    @Override // defpackage.pu9
    public final RemoteViews i() {
        return null;
    }
}
