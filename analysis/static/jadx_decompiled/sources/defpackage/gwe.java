package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.work.Worker;
import java.io.IOException;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class gwe implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gwe(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((Toolbar) this.b).w();
                return;
            case 1:
                mwe mweVar = (mwe) this.b;
                Window.Callback callback = mweVar.X;
                Menu menuC0 = mweVar.c0();
                wq8 wq8Var = menuC0 instanceof wq8 ? (wq8) menuC0 : null;
                if (wq8Var != null) {
                    wq8Var.w();
                }
                try {
                    menuC0.clear();
                    if (!callback.onCreatePanelMenu(0, menuC0) || !callback.onPreparePanel(0, null, menuC0)) {
                        menuC0.clear();
                    }
                    if (wq8Var != null) {
                        wq8Var.v();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (wq8Var != null) {
                        wq8Var.v();
                    }
                    throw th;
                }
            case 2:
                ((xu3) this.b).q();
                return;
            case 3:
                e4f e4fVar = (e4f) this.b;
                if (e4fVar.x0) {
                    e4fVar.invalidateSelf();
                    e4fVar.scheduleSelf(e4fVar.w0, SystemClock.uptimeMillis() + 8);
                    return;
                }
                return;
            case 4:
                ((dnf) this.b).m(0);
                return;
            case 5:
                ViewPager viewPager = (ViewPager) this.b;
                viewPager.setScrollState(0);
                viewPager.q();
                return;
            case 6:
                Worker worker = (Worker) this.b;
                try {
                    worker.a.j(worker.b());
                    return;
                } catch (Throwable th2) {
                    worker.a.k(th2);
                    return;
                }
            case 7:
                py0 py0Var = (py0) this.b;
                py0Var.V0.log("OKRTCCall", "💀 pc.timeout");
                ji6 ji6Var = ji6.a;
                py0Var.d(ji6Var);
                py0Var.Q0 = ji6Var;
                py0Var.k2.E(ConversationEndReason.PeerConnectionTimeout.INSTANCE);
                py0Var.k(w51.c, null);
                return;
            case 8:
                m5d m5dVar = (m5d) this.b;
                try {
                    ((kq7) m5dVar.X).g.execute(new ule(23, this));
                    return;
                } catch (Throwable th3) {
                    ((kq7) m5dVar.X).n.logException("OKRTCLmsAdapter", "Unexpected executor usage error", th3);
                    return;
                }
            case 9:
                ((kdg) this.b).e();
                return;
            case 10:
                ok okVar = ((kdg) ((y7f) this.b).b).d;
                okVar.b(okVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 11:
                ((xdg) this.b).j.i(new ph3(4));
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                throw null;
            case 13:
                orf orfVar = (orf) this.b;
                synchronized (orfVar.a) {
                    try {
                        if (orfVar.b()) {
                            String.valueOf(orfVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                            orfVar.d();
                            if (orfVar.b()) {
                                orfVar.c = 1;
                                orfVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((qne) this.b).c(new IOException("TIMEOUT"));
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                synchronized (((gig) this.b).c) {
                    try {
                        k3a k3aVar = (k3a) ((gig) this.b).o;
                        if (k3aVar != null) {
                            k3aVar.d();
                        }
                    } finally {
                    }
                }
                return;
            default:
                cjg cjgVar = (cjg) this.b;
                long j = cjg.i((Context) cjgVar.a).getLong("app_set_id_last_used_time", -1L);
                long j2 = j != -1 ? j + 33696000000L : -1L;
                if (j2 == -1 || System.currentTimeMillis() <= j2) {
                    return;
                }
                Context context = (Context) cjgVar.a;
                if (!cjg.i(context).edit().remove("app_set_id").commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    if (strValueOf.length() != 0) {
                        "Failed to clear app set ID generated for App ".concat(strValueOf);
                    }
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context.getPackageName());
                if (strValueOf2.length() != 0) {
                    "Failed to clear app set ID last used time for App ".concat(strValueOf2);
                    return;
                }
                return;
        }
    }

    public gwe(gdg gdgVar, sh0 sh0Var) {
        this.a = 12;
        this.b = sh0Var;
    }
}
