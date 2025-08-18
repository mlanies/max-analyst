package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class qh5 {
    public final Context a;
    public final bea b;
    public final tda c;
    public final p84 d;
    public final int e = c2c.tt_notification_file_downloading_title;
    public final int f = c2c.tt_worker_draft_sync;
    public final int g = c2c.tt_worker_gif_upload;
    public final int h = c2c.tt_worker_attach_upload;

    public qh5(Context context, bea beaVar, tda tdaVar, p84 p84Var) {
        this.a = context;
        this.b = beaVar;
        this.c = tdaVar;
        this.d = p84Var;
    }

    public final Notification a(String str, String str2, Long l, boolean z, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        bea beaVar = this.b;
        beaVar.c();
        this.d.getClass();
        bu9 bu9VarH = beaVar.h("ru.oneme.app.fileUpload", true, true);
        bu9VarH.e = bu9.c(str);
        bu9VarH.f = bu9.c(str2);
        long jLongValue = l != null ? l.longValue() : 0L;
        Notification notification = bu9VarH.F;
        notification.when = jLongValue;
        this.c.getClass();
        notification.icon = z ? gpc.q0 : gpc.m0;
        boolean z2 = i == -1;
        bu9VarH.o = 100;
        bu9VarH.p = i;
        bu9VarH.q = z2;
        bu9VarH.k = 0;
        bu9VarH.g(0);
        bu9VarH.p(null);
        bu9VarH.i(2, true);
        bu9VarH.i(16, false);
        bu9VarH.b.add(new nt9(0, this.a.getString(c2c.tt_worker_cancel), pendingIntent2));
        bu9VarH.v = "progress";
        bu9VarH.g = pendingIntent;
        return bu9VarH.b();
    }

    public final Notification b(long j, Long l, Long l2, String str, String str2, int i, boolean z, PendingIntent pendingIntent) {
        Intent intentK;
        int iHashCode = Long.hashCode(j);
        bea beaVar = this.b;
        if (j == 0) {
            intentK = beaVar.f(false);
        } else {
            long jLongValue = l != null ? l.longValue() : 0L;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            beaVar.getClass();
            vw7 vw7Var = vw7.c;
            Long lValueOf = Long.valueOf(jLongValue);
            Long lValueOf2 = Long.valueOf(jLongValue2);
            vw7Var.getClass();
            intentK = beaVar.k(vw7.Z1(j, lValueOf, lValueOf2));
        }
        return a(str, str2, l, z, i, oag.p(this.a, iHashCode, intentK), pendingIntent);
    }
}
