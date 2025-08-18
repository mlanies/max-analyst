package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.b;
import com.google.android.gms.common.SupportErrorDialogFragment;

/* loaded from: classes.dex */
public final class ee6 extends fe6 {
    public static final Object c = new Object();
    public static final ee6 d = new ee6();

    public static AlertDialog d(Context context, int i, keg kegVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(pdg.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = pdg.b(context, i);
        if (strB != null) {
            builder.setPositiveButton(strB, kegVar);
        }
        String strD = pdg.d(context, i);
        if (strD != null) {
            builder.setTitle(strD);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof b) {
                n16 n16VarS = ((b) activity).S();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                fp3.o(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                supportErrorDialogFragment.B1 = alertDialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.C1 = onCancelListener;
                }
                supportErrorDialogFragment.k1(n16VarS, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        x25 x25Var = new x25();
        fp3.o(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        x25Var.a = alertDialog;
        if (onCancelListener != null) {
            x25Var.b = onCancelListener;
        }
        x25Var.show(fragmentManager, str);
    }

    public final void c(Activity activity, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i, new zdg(activity, super.a(i, activity, "d")), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        e(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        new IllegalArgumentException();
        if (i == 18) {
            new ceg(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strF = i == 6 ? pdg.f(context, "common_google_play_services_resolution_required_title") : pdg.d(context, i);
        if (strF == null) {
            strF = context.getResources().getString(g2c.common_google_play_services_notification_ticker);
        }
        String strE = (i == 6 || i == 19) ? pdg.e(context, "common_google_play_services_resolution_required_text", pdg.a(context)) : pdg.c(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        fp3.n(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        bu9 bu9Var = new bu9(context, null);
        bu9Var.u = true;
        bu9Var.i(16, true);
        bu9Var.e = bu9.c(strF);
        zt9 zt9Var = new zt9(0);
        zt9Var.f = bu9.c(strE);
        bu9Var.q(zt9Var);
        PackageManager packageManager = context.getPackageManager();
        if (np8.h == null) {
            np8.h = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (np8.h.booleanValue()) {
            bu9Var.F.icon = context.getApplicationInfo().icon;
            bu9Var.k = 2;
            if (np8.A(context)) {
                bu9Var.b.add(new nt9(xub.common_full_open_on_phone, resources.getString(g2c.common_open_on_phone), pendingIntent));
            } else {
                bu9Var.g = pendingIntent;
            }
        } else {
            bu9Var.F.icon = R.drawable.stat_sys_warning;
            bu9Var.F.tickerText = bu9.c(resources.getString(g2c.common_google_play_services_notification_ticker));
            bu9Var.F.when = System.currentTimeMillis();
            bu9Var.g = pendingIntent;
            bu9Var.e(strE);
        }
        synchronized (c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(g2c.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        bu9Var.z = "com.google.android.gms.availability";
        Notification notificationB = bu9Var.b();
        if (i == 1 || i == 2 || i == 3) {
            pe6.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationB);
    }

    public final void g(Activity activity, vg7 vg7Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i, new feg(super.a(i, activity, "d"), vg7Var), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        e(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
