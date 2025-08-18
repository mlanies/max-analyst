package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bi8 {
    public static int d;
    public final wh8 a;
    public final qz7 b;
    public final ArrayList c = new ArrayList();

    public bi8(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null) {
            int i = dl8.b;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else {
                listQueryBroadcastReceivers.size();
                componentName = null;
            }
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        wh8 wh8Var = new wh8(context, str, bundle);
        this.a = wh8Var;
        Looper looperMyLooper = Looper.myLooper();
        wh8Var.c(new rh8(), new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper));
        wh8Var.a.setMediaButtonReceiver(pendingIntent);
        this.b = new qz7(context, wh8Var.c);
        if (d == 0) {
            d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = bi8.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public final vi8 b() {
        return new vi8(this.a.a.getCurrentControllerInfo());
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.AbstractCollection, java.util.List] */
    public final void c(i3b i3bVar) {
        wh8 wh8Var = this.a;
        wh8Var.g = i3bVar;
        synchronized (wh8Var.d) {
            for (int iBeginBroadcast = wh8Var.f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((mr6) wh8Var.f.getBroadcastItem(iBeginBroadcast)).f(i3bVar);
                } catch (RemoteException unused) {
                }
            }
            wh8Var.f.finishBroadcast();
        }
        MediaSession mediaSession = wh8Var.a;
        if (i3bVar.w0 == null) {
            PlaybackState.Builder builderD = e3b.d();
            e3b.x(builderD, i3bVar.a, i3bVar.b, i3bVar.o, i3bVar.s0);
            e3b.u(builderD, i3bVar.c);
            e3b.s(builderD, i3bVar.X);
            e3b.v(builderD, i3bVar.Z);
            for (h3b h3bVar : i3bVar.t0) {
                PlaybackState.CustomAction customActionB = h3bVar.X;
                if (customActionB == null) {
                    PlaybackState.CustomAction.Builder builderE = e3b.e(h3bVar.a, h3bVar.b, h3bVar.c);
                    e3b.w(builderE, h3bVar.o);
                    customActionB = e3b.b(builderE);
                }
                if (customActionB != null) {
                    e3b.a(builderD, customActionB);
                }
            }
            e3b.t(builderD, i3bVar.u0);
            f3b.b(builderD, i3bVar.v0);
            i3bVar.w0 = e3b.c(builderD);
        }
        mediaSession.setPlaybackState(i3bVar.w0);
    }
}
