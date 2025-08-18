package defpackage;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zt9 extends pu9 {
    public final /* synthetic */ int e;
    public Object f;

    public /* synthetic */ zt9(int i) {
        this.e = i;
    }

    @Override // defpackage.pu9
    public final void b(m5d m5dVar) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) m5dVar.c).setBigContentTitle((CharSequence) this.c).bigText((CharSequence) this.f);
                if (this.a) {
                    bigTextStyleBigText.setSummaryText((CharSequence) this.d);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) m5dVar.c).setBigContentTitle((CharSequence) this.c);
                if (this.a) {
                    bigContentTitle.setSummaryText((CharSequence) this.d);
                }
                Iterator it = ((ArrayList) this.f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // defpackage.pu9
    public final String e() {
        switch (this.e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
