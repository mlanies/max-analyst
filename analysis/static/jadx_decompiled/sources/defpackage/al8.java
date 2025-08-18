package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class al8 extends pu9 {
    public final qh8 e;
    public int[] f;

    public al8(qh8 qh8Var) {
        this.e = qh8Var;
    }

    @Override // defpackage.pu9
    public final void b(m5d m5dVar) {
        if (oaf.a >= 21) {
            Notification.MediaStyle mediaStyleA = zk8.a();
            int[] iArr = this.f;
            qh8 qh8Var = this.e;
            Notification.MediaStyle mediaStyleB = zk8.b(mediaStyleA, iArr, qh8Var);
            Notification.Builder builder = (Notification.Builder) m5dVar.c;
            zk8.c(builder, mediaStyleB);
            Bundle bundle = new Bundle();
            bundle.putBundle("androidx.media3.session", qh8Var.a.j.b());
            builder.addExtras(bundle);
        }
    }

    @Override // defpackage.pu9
    public final RemoteViews h() {
        if (oaf.a >= 21) {
            return null;
        }
        int iMin = Math.min(((bu9) this.b).b.size(), 5);
        RemoteViews remoteViewsC = c(iMin <= 3 ? ryb.media3_notification_template_big_media_narrow : ryb.media3_notification_template_big_media);
        remoteViewsC.removeAllViews(cvb.media_actions);
        if (iMin > 0) {
            for (int i = 0; i < iMin; i++) {
                remoteViewsC.addView(cvb.media_actions, p((nt9) ((bu9) this.b).b.get(i)));
            }
        }
        remoteViewsC.setViewVisibility(cvb.cancel_action, 8);
        return remoteViewsC;
    }

    @Override // defpackage.pu9
    public final RemoteViews i() {
        if (oaf.a >= 21) {
            return null;
        }
        RemoteViews remoteViewsC = c(ryb.media3_notification_template_media);
        int size = ((bu9) this.b).b.size();
        int[] iArr = this.f;
        if (iArr != null) {
            int iMin = Math.min(iArr.length, 3);
            remoteViewsC.removeAllViews(cvb.media_actions);
            if (iMin > 0) {
                for (int i = 0; i < iMin; i++) {
                    if (i >= size) {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i), Integer.valueOf(size - 1)));
                    }
                    remoteViewsC.addView(cvb.media_actions, p((nt9) ((bu9) this.b).b.get(iArr[i])));
                }
            }
        }
        remoteViewsC.setViewVisibility(cvb.end_padder, 0);
        remoteViewsC.setViewVisibility(cvb.cancel_action, 8);
        return remoteViewsC;
    }

    public final RemoteViews p(nt9 nt9Var) {
        boolean z = nt9Var.j == null;
        RemoteViews remoteViews = new RemoteViews(((bu9) this.b).a.getPackageName(), ryb.media3_notification_media_action);
        IconCompat iconCompatA = nt9Var.a();
        if (iconCompatA != null) {
            remoteViews.setImageViewResource(cvb.action0, iconCompatA.e());
        }
        if (!z) {
            remoteViews.setOnClickPendingIntent(cvb.action0, nt9Var.j);
        }
        remoteViews.setContentDescription(cvb.action0, nt9Var.i);
        return remoteViews;
    }

    public final void q(int... iArr) {
        this.f = iArr;
    }
}
