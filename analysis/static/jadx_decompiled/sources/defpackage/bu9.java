package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bu9 {
    public String B;
    public final boolean E;
    public final Notification F;
    public final ArrayList G;
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public PendingIntent h;
    public IconCompat i;
    public int j;
    public int k;
    public boolean m;
    public pu9 n;
    public int o;
    public int p;
    public boolean q;
    public String r;
    public boolean s;
    public String t;
    public String v;
    public Bundle w;
    public String z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean l = true;
    public boolean u = false;
    public int x = 0;
    public int y = 0;
    public int A = 0;
    public int C = 0;
    public int D = 0;

    public bu9(Context context, String str) {
        Notification notification = new Notification();
        this.F = notification;
        this.a = context;
        this.z = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.k = 0;
        this.G = new ArrayList();
        this.E = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(nt9 nt9Var) {
        this.b.add(nt9Var);
    }

    public final Notification b() {
        Bundle bundle;
        RemoteViews remoteViewsH;
        m5d m5dVar = new m5d(this);
        bu9 bu9Var = (bu9) m5dVar.o;
        pu9 pu9Var = bu9Var.n;
        if (pu9Var != null) {
            pu9Var.b(m5dVar);
        }
        RemoteViews remoteViewsI = pu9Var != null ? pu9Var.i() : null;
        Notification notificationBuild = ((Notification.Builder) m5dVar.c).build();
        if (remoteViewsI != null) {
            notificationBuild.contentView = remoteViewsI;
        }
        if (pu9Var != null && (remoteViewsH = pu9Var.h()) != null) {
            notificationBuild.bigContentView = remoteViewsH;
        }
        if (pu9Var != null) {
            bu9Var.n.getClass();
        }
        if (pu9Var != null && (bundle = notificationBuild.extras) != null) {
            pu9Var.a(bundle);
        }
        return notificationBuild;
    }

    public final void d(PendingIntent pendingIntent) {
        this.g = pendingIntent;
    }

    public final void e(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void f(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void g(int i) {
        Notification notification = this.F;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void h(PendingIntent pendingIntent) {
        this.F.deleteIntent = pendingIntent;
    }

    public final void i(int i, boolean z) {
        Notification notification = this.F;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void j() {
        this.r = "media3_group_key";
    }

    public final void k(Bitmap bitmap) {
        this.i = bitmap == null ? null : IconCompat.b(bitmap);
    }

    public final void l() {
        i(2, false);
    }

    public final void m() {
        i(8, true);
    }

    public final void n(boolean z) {
        this.l = z;
    }

    public final void o(int i) {
        this.F.icon = i;
    }

    public final void p(Uri uri) {
        Notification notification = this.F;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = au9.a(au9.e(au9.c(au9.b(), 4), 5));
    }

    public final void q(pu9 pu9Var) {
        if (this.n != pu9Var) {
            this.n = pu9Var;
            if (pu9Var != null) {
                pu9Var.n(this);
            }
        }
    }

    public final void r(boolean z) {
        this.m = z;
    }

    public final void s() {
        this.y = 1;
    }

    public final void t(long j) {
        this.F.when = j;
    }
}
