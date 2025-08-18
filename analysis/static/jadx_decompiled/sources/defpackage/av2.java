package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Binder;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import one.me.chats.search.ChatsListSearchScreen;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes.dex */
public final /* synthetic */ class av2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ av2(y9b y9bVar, l7g l7gVar) {
        this.a = 2;
        this.c = y9bVar;
        this.o = l7gVar;
        this.b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [rt1, ws5] */
    @Override // java.lang.Runnable
    public final void run() {
        xff xffVar;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ChatsListSearchScreen.J0;
                boolean z = this.b;
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.c;
                if (z) {
                    chatsListSearchScreen.q0();
                }
                chatsListSearchScreen.D0.E((List) ((bh0) chatsListSearchScreen.s0.getValue()).s0.a.getValue());
                it6 it6Var = (it6) this.o;
                List list = it6Var.b;
                chatsListSearchScreen.w0.E(true ^ list.isEmpty() ? Collections.singletonList(r9c.a) : nz4.a);
                chatsListSearchScreen.x0.E(list);
                chatsListSearchScreen.y0.E(it6Var.c);
                return;
            case 1:
                final xs5 xs5Var = (xs5) this.c;
                boolean z2 = this.b;
                final lq1 lq1Var = (lq1) this.o;
                ((HashSet) xs5Var.a.b.b).remove(xs5Var.w);
                xs5Var.v = z2;
                if (!xs5Var.d) {
                    if (lq1Var != null) {
                        lq1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
                        return;
                    }
                    return;
                } else {
                    final long jA = xs5Var.a.A();
                    ?? r3 = new rt1() { // from class: ws5
                        @Override // defpackage.rt1
                        public final boolean a(TotalCaptureResult totalCaptureResult) {
                            xs5 xs5Var2 = xs5Var;
                            xs5Var2.getClass();
                            if ((((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5) != xs5Var2.v || !st1.x(totalCaptureResult, jA)) {
                                return false;
                            }
                            lq1 lq1Var2 = lq1Var;
                            if (lq1Var2 != null) {
                                lq1Var2.b(null);
                            }
                            return true;
                        }
                    };
                    xs5Var.w = r3;
                    xs5Var.a.p(r3);
                    return;
                }
            case 2:
                ((y9b) this.c).b((l7g) this.o, this.b);
                return;
            case 3:
                Context context = (Context) this.c;
                qne qneVar = (qne) this.o;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor editorEdit = v3c.q(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.b) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        context.getPackageName();
                    }
                    return;
                } finally {
                    qneVar.d(null);
                }
            case 4:
                Collection collection = (Collection) this.o;
                boolean z3 = this.b;
                ike ikeVar = (ike) this.c;
                ikeVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    ikeVar.g(collection, z3);
                } catch (Exception e) {
                    hm9.p("ike", "sync exception", e);
                    ((cba) ikeVar.j).c(new HandledException(e), true);
                }
                hm9.m("ike", "syncWorker: sync %d ids done for %d", Integer.valueOf(collection.size()), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                return;
            case 5:
                ((bye) this.c).a((lq1) this.o, this.b);
                return;
            case 6:
                nx0 nx0Var = (nx0) this.c;
                boolean z4 = this.b;
                xff xffVar2 = (xff) this.o;
                nx0Var.getClass();
                try {
                    synchronized (nx0Var.Z) {
                        try {
                            if (!nx0Var.Y || z4) {
                                while (true) {
                                    synchronized (nx0Var.Z) {
                                        xffVar = (xff) ((ArrayDeque) nx0Var.s0).poll();
                                    }
                                    if (xffVar == null) {
                                        xffVar2.run();
                                    } else {
                                        xffVar.run();
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Exception e2) {
                    nx0Var.d(e2);
                    return;
                }
            default:
                koc kocVar = ((pbg) this.c).a;
                e24 e24Var = (e24) kocVar.b.get();
                if (kocVar.j.get() || e24Var != ((e24) this.o)) {
                    return;
                }
                if (this.b) {
                    kocVar.b();
                    return;
                } else {
                    kocVar.a();
                    return;
                }
        }
    }

    public /* synthetic */ av2(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = z;
    }

    public /* synthetic */ av2(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.o = obj2;
    }

    public /* synthetic */ av2(boolean z, ChatsListSearchScreen chatsListSearchScreen, it6 it6Var) {
        this.a = 0;
        this.b = z;
        this.c = chatsListSearchScreen;
        this.o = it6Var;
    }
}
