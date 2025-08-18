package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class si8 extends t68 {
    public static final int q;
    public final m5d e;
    public final ii8 f;
    public final xi8 g;
    public final qi8 h;
    public final cy i;
    public final bi8 j;
    public final an k;
    public final ComponentName l;
    public v4b m;
    public volatile long n;
    public z66 o;
    public int p;

    static {
        q = oaf.a >= 31 ? 33554432 : 0;
    }

    public si8(ii8 ii8Var, Uri uri, Handler handler) {
        ComponentName componentName;
        ComponentName componentNameP;
        PendingIntent foregroundService;
        this.f = ii8Var;
        Context context = ii8Var.f;
        this.g = xi8.a(context);
        qi8 qi8Var = new qi8();
        qi8Var.X = this;
        qi8Var.a = gd8.J;
        qi8Var.b = "";
        qi8Var.o = -9223372036854775807L;
        this.h = qi8Var;
        m5d m5dVar = new m5d(ii8Var);
        this.e = m5dVar;
        this.n = 300000L;
        this.i = new cy(ii8Var.l.getLooper(), m5dVar);
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        boolean z = true;
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (!listQueryBroadcastReceivers.isEmpty()) {
                throw new IllegalStateException("Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + listQueryBroadcastReceivers.size());
            }
            componentName = null;
        }
        this.l = componentName;
        if (componentName == null || oaf.a < 31) {
            componentNameP = P(context, "androidx.media3.session.MediaLibraryService");
            componentNameP = componentNameP == null ? P(context, "androidx.media3.session.MediaSessionService") : componentNameP;
            if (componentNameP == null || componentNameP.equals(componentName)) {
                z = false;
            }
        } else {
            z = false;
            componentNameP = componentName;
        }
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (componentNameP == null) {
            an anVar = new an(7, this);
            this.k = anVar;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            intentFilter.addDataScheme(uri.getScheme());
            if (oaf.a < 33) {
                context.registerReceiver(anVar, intentFilter);
            } else {
                context.registerReceiver(anVar, intentFilter, 4);
            }
            intent2.setPackage(context.getPackageName());
            foregroundService = PendingIntent.getBroadcast(context, 0, intent2, q);
            componentNameP = new ComponentName(context, context.getClass());
        } else {
            intent2.setComponent(componentNameP);
            foregroundService = z ? oaf.a >= 26 ? PendingIntent.getForegroundService(context, 0, intent2, q) : PendingIntent.getService(context, 0, intent2, q) : PendingIntent.getBroadcast(context, 0, intent2, q);
            this.k = null;
        }
        String strJoin = TextUtils.join(".", new String[]{"androidx.media3.session.id", ii8Var.i});
        int i = oaf.a;
        bi8 bi8Var = new bi8(context, strJoin, i < 31 ? componentNameP : null, i < 31 ? foregroundService : null, ii8Var.j.a.getExtras());
        this.j = bi8Var;
        if (i >= 31 && componentName != null) {
            oi8.a(bi8Var, componentName);
        }
        PendingIntent pendingIntent = ii8Var.t;
        if (pendingIntent != null) {
            bi8Var.a.a.setSessionActivity(pendingIntent);
        }
        bi8Var.a.c(this, handler);
    }

    public static void J(bi8 bi8Var, hd8 hd8Var) {
        wh8 wh8Var = bi8Var.a;
        wh8Var.i = hd8Var;
        MediaMetadata mediaMetadata = hd8Var.b;
        if (mediaMetadata == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                hd8Var.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                MediaMetadata mediaMetadata2 = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
                hd8Var.b = mediaMetadata2;
                parcelObtain.recycle();
                mediaMetadata = mediaMetadata2;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        wh8Var.a.setMetadata(mediaMetadata);
    }

    public static void K(si8 si8Var, x4b x4bVar) {
        si8Var.getClass();
        int i = x4bVar.t1(20) ? 4 : 0;
        if (si8Var.p != i) {
            si8Var.p = i;
            si8Var.j.a.a.setFlags(i | 3);
        }
    }

    public static void L(bi8 bi8Var, ArrayList arrayList) {
        if (arrayList != null) {
            bi8Var.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yh8 yh8Var = (yh8) it.next();
                if (yh8Var == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                long j = yh8Var.b;
                if (hashSet.contains(Long.valueOf(j))) {
                    new IllegalArgumentException("id of each queue item should be unique");
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        wh8 wh8Var = bi8Var.a;
        wh8Var.h = arrayList;
        MediaSession mediaSession = wh8Var.a;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            yh8 yh8Var2 = (yh8) it2.next();
            MediaSession.QueueItem queueItemA = yh8Var2.c;
            if (queueItemA == null) {
                queueItemA = xh8.a(yh8Var2.a.b(), yh8Var2.b);
                yh8Var2.c = queueItemA;
            }
            queueItemA.getClass();
            arrayList2.add(queueItemA);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static tb8 M(String str, Uri uri, String str2, Bundle bundle) {
        za8 za8Var = new za8();
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        Collections.emptyList();
        ffc ffcVar2 = ffc.X;
        fb8 fb8Var = new fb8();
        lb8 lb8Var = lb8.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        nw4 nw4Var = new nw4(8);
        nw4Var.b = uri;
        nw4Var.c = str2;
        nw4Var.o = bundle;
        return new tb8(str3, new db8(za8Var), null, new hb8(fb8Var), gd8.J, new lb8(nw4Var));
    }

    public static ComponentName P(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override // defpackage.t68
    public final void A(int i) {
        N(15, new mi8(this, i, 0), this.j.b(), true);
    }

    @Override // defpackage.t68
    public final void B(int i) {
        N(14, new mi8(this, i, 1), this.j.b(), true);
    }

    @Override // defpackage.t68
    public final void C() {
        boolean zT1 = this.f.s.t1(9);
        bi8 bi8Var = this.j;
        if (zT1) {
            N(9, new ji8(this, 8), bi8Var.b(), true);
        } else {
            N(8, new ji8(this, 9), bi8Var.b(), true);
        }
    }

    @Override // defpackage.t68
    public final void D() {
        boolean zT1 = this.f.s.t1(7);
        bi8 bi8Var = this.j;
        if (zT1) {
            N(7, new ji8(this, 2), bi8Var.b(), true);
        } else {
            N(6, new ji8(this, 3), bi8Var.b(), true);
        }
    }

    @Override // defpackage.t68
    public final void E(long j) {
        if (j < 0) {
            return;
        }
        N(10, new ki8(this, j, 0), this.j.b(), true);
    }

    @Override // defpackage.t68
    public final void F() {
        N(3, new ji8(this, 6), this.j.b(), true);
    }

    public final void N(final int i, final ri8 ri8Var, final vi8 vi8Var, final boolean z) {
        ii8 ii8Var = this.f;
        if (ii8Var.i()) {
            return;
        }
        if (vi8Var != null) {
            oaf.W(ii8Var.l, new Runnable() { // from class: ni8
                @Override // java.lang.Runnable
                public final void run() {
                    si8 si8Var = this.a;
                    ii8 ii8Var2 = si8Var.f;
                    if (ii8Var2.i()) {
                        return;
                    }
                    boolean zIsActive = si8Var.j.a.a.isActive();
                    int i2 = i;
                    vi8 vi8Var2 = vi8Var;
                    if (!zIsActive) {
                        StringBuilder sbN = rh4.n(i2, "Ignore incoming player command before initialization. command=", ", pid=");
                        sbN.append(vi8Var2.a.b);
                        z04.c0(sbN.toString());
                        return;
                    }
                    oh8 oh8VarR = si8Var.R(vi8Var2);
                    if (!si8Var.e.G(oh8VarR, i2)) {
                        if (i2 != 1 || ii8Var2.s.u()) {
                            return;
                        }
                        z04.c0("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                        return;
                    }
                    ii8Var2.s(oh8VarR);
                    ii8Var2.e.getClass();
                    try {
                        ri8Var.b(oh8VarR);
                    } catch (RemoteException e) {
                        z04.d0("Exception in " + oh8VarR, e);
                    }
                    if (z) {
                        new SparseBooleanArray().append(i2, true);
                        ii8Var2.p(oh8VarR);
                    }
                }
            });
            return;
        }
        z04.t("RemoteUserInfo is null, ignoring command=" + i);
    }

    public final void O(y9d y9dVar, int i, ri8 ri8Var, vi8 vi8Var) {
        if (vi8Var != null) {
            oaf.W(this.f.l, new cy0(this, y9dVar, i, vi8Var, ri8Var, 3));
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object objValueOf = y9dVar;
        if (y9dVar == null) {
            objValueOf = Integer.valueOf(i);
        }
        sb.append(objValueOf);
        z04.t(sb.toString());
    }

    public final void Q(tb8 tb8Var, boolean z) {
        N(31, new xd5(this, tb8Var, z, 5), this.j.b(), false);
    }

    public final oh8 R(vi8 vi8Var) {
        oh8 oh8VarZ = this.e.z(vi8Var);
        if (oh8VarZ == null) {
            oh8VarZ = new oh8(vi8Var, 0, 0, this.g.b(vi8Var), new pi8(vi8Var), Bundle.EMPTY);
            mh8 mh8VarL = this.f.l(oh8VarZ);
            this.e.p(vi8Var, oh8VarZ, mh8VarL.a, mh8VarL.b);
        }
        cy cyVar = this.i;
        long j = this.n;
        cyVar.removeMessages(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, oh8VarZ);
        cyVar.sendMessageDelayed(cyVar.obtainMessage(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, oh8VarZ), j);
        return oh8VarZ;
    }

    public final void S(x4b x4bVar) {
        oaf.W(this.f.l, new li8(this, x4bVar, 1));
    }

    @Override // defpackage.t68
    public final void f(ja8 ja8Var) {
        if (ja8Var != null) {
            N(20, new ui0(this, ja8Var, -1, 10), this.j.b(), false);
        }
    }

    @Override // defpackage.t68
    public final void g(ja8 ja8Var, int i) {
        if (ja8Var != null) {
            if (i == -1 || i >= 0) {
                N(20, new ui0(this, ja8Var, i, 10), this.j.b(), false);
            }
        }
    }

    @Override // defpackage.t68
    public final void h(String str, Bundle bundle, ResultReceiver resultReceiver) {
        fm9.l(str);
        if (TextUtils.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN", str) && resultReceiver != null) {
            resultReceiver.send(0, this.f.j.b());
        } else {
            y9d y9dVar = new y9d(str, Bundle.EMPTY);
            O(y9dVar, 0, new u00(this, y9dVar, bundle, resultReceiver), this.j.b());
        }
    }

    @Override // defpackage.t68
    public final void i(String str, Bundle bundle) {
        y9d y9dVar = new y9d(str, Bundle.EMPTY);
        O(y9dVar, 0, new y98(this, y9dVar, bundle), this.j.b());
    }

    @Override // defpackage.t68
    public final void j() {
        N(12, new ji8(this, 0), this.j.b(), true);
    }

    @Override // defpackage.t68
    public final boolean k(Intent intent) {
        vi8 vi8VarB = this.j.b();
        vi8VarB.getClass();
        return this.f.n(new oh8(vi8VarB, 0, 0, false, null, Bundle.EMPTY), intent);
    }

    @Override // defpackage.t68
    public final void l() {
        N(1, new ji8(this, 11), this.j.b(), true);
    }

    @Override // defpackage.t68
    public final void m() {
        N(1, new ji8(this, 10), this.j.b(), false);
    }

    @Override // defpackage.t68
    public final void n(String str, Bundle bundle) {
        Q(M(str, null, null, bundle), true);
    }

    @Override // defpackage.t68
    public final void o(String str, Bundle bundle) {
        Q(M(null, null, str, bundle), true);
    }

    @Override // defpackage.t68
    public final void p(Uri uri, Bundle bundle) {
        Q(M(null, uri, null, bundle), true);
    }

    @Override // defpackage.t68
    public final void q() {
        N(2, new ji8(this, 5), this.j.b(), true);
    }

    @Override // defpackage.t68
    public final void r(String str, Bundle bundle) {
        Q(M(str, null, null, bundle), false);
    }

    @Override // defpackage.t68
    public final void s(String str, Bundle bundle) {
        Q(M(null, null, str, bundle), false);
    }

    @Override // defpackage.t68
    public final void t(Uri uri, Bundle bundle) {
        Q(M(null, uri, null, bundle), false);
    }

    @Override // defpackage.t68
    public final void u(ja8 ja8Var) {
        if (ja8Var == null) {
            return;
        }
        N(20, new y98(this, 4, ja8Var), this.j.b(), true);
    }

    @Override // defpackage.t68
    public final void v() {
        N(11, new ji8(this, 4), this.j.b(), true);
    }

    @Override // defpackage.t68
    public final void w(long j) {
        N(5, new ki8(this, j, 1), this.j.b(), true);
    }

    @Override // defpackage.t68
    public final void x(float f) {
        if (f <= 0.0f) {
            return;
        }
        N(13, new c74(this, f), this.j.b(), true);
    }

    @Override // defpackage.t68
    public final void y(h5c h5cVar) {
        z(h5cVar);
    }

    @Override // defpackage.t68
    public final void z(h5c h5cVar) {
        e5c e5cVarQ = gf7.q(h5cVar);
        if (e5cVarQ != null) {
            O(null, 40010, new ji8(this, e5cVarQ), this.j.b());
            return;
        }
        z04.c0("Ignoring invalid RatingCompat " + h5cVar);
    }
}
