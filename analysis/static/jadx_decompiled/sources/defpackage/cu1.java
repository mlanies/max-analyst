package defpackage;

import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.my.tracker.campaign.CampaignService;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.VpxDecoderWrapper;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class cu1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cu1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                du1 du1Var = (du1) this.b;
                if (du1Var.b) {
                    return;
                }
                c54.p(null, ((eu1) du1Var.o).f.S0 == 7 || ((eu1) du1Var.o).f.S0 == 6);
                if (((eu1) du1Var.o).c()) {
                    ((eu1) du1Var.o).f.I(true);
                    return;
                } else {
                    ((eu1) du1Var.o).f.J(true);
                    return;
                }
            case 1:
                ((su1) this.b).i.c();
                return;
            case 2:
                ((eu6) this.b).clear();
                return;
            case 3:
                kw1 kw1Var = (kw1) this.b;
                lw1 lw1Var = kw1Var.c;
                cdc cdcVar = (cdc) lw1Var.h.remove(kw1Var);
                if (cdcVar == null || lw1Var.g != cdcVar) {
                    return;
                }
                lw1Var.g = null;
                return;
            case 4:
                yt1 yt1Var = (yt1) ((tx1) this.b);
                if (yt1Var.c.S0 == 4) {
                    yt1Var.c.J(false);
                    return;
                }
                return;
            case 5:
                ey1 ey1Var = (ey1) this.b;
                if (((fu1) ey1Var.b).S0 == 9) {
                    ((fu1) ey1Var.b).B();
                    return;
                }
                return;
            case 6:
                ((CampaignService) this.b).stopSelf();
                return;
            case 7:
                x9b x9bVar = (x9b) ((l84) ((oz1) this.b).b).a;
                if (x9bVar != null) {
                    yhc yhcVar = x9bVar.f;
                    yhcVar.getClass();
                    kq0.e();
                    if (yhcVar.g || yhcVar.h) {
                        return;
                    }
                    yhcVar.h = true;
                    ey1 ey1Var2 = yhcVar.a.c;
                    return;
                }
                return;
            case 8:
                sz1 sz1Var = (sz1) this.b;
                synchronized (sz1Var.a) {
                    if (sz1Var.b.isEmpty()) {
                        return;
                    }
                    try {
                        sz1Var.i(sz1Var.b);
                        return;
                    } finally {
                        sz1Var.b.clear();
                    }
                }
            case 9:
                for (ihe iheVar : (LinkedHashSet) this.b) {
                    iheVar.getClass();
                    iheVar.c(iheVar);
                }
                return;
            case 10:
                ((CarouselLayoutManager) this.b).p0();
                return;
            case 11:
                m62 m62Var = (m62) this.b;
                m62Var.O0 = false;
                m62Var.requestLayout();
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                bc7[] bc7VarArr = ChatScreen.k1;
                ((ChatScreen) this.b).N0().f(true);
                return;
            case 13:
                bc7[] bc7VarArr2 = ChatsListSearchScreen.J0;
                ((ChatsListSearchScreen) this.b).q0();
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((h33) this.b).t(true);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                vb3 vb3Var = (vb3) this.b;
                Runnable runnable = vb3Var.b;
                if (runnable != null) {
                    runnable.run();
                    vb3Var.b = null;
                    return;
                }
                return;
            case 16:
                ac3.a((ac3) this.b);
                return;
            case LangUtils.HASH_SEED /* 17 */:
                cd3 cd3Var = (cd3) this.b;
                int i = cd3Var.x0 - 1;
                cd3Var.x0 = i;
                if (i > 0) {
                    return;
                }
                if (i < 0) {
                    throw new IllegalStateException(String.valueOf(cd3Var.x0));
                }
                cd3Var.o.a();
                return;
            case 18:
                Iterator it = ((lh3) this.b).i.iterator();
                while (it.hasNext()) {
                    ((fh3) it.next()).b();
                }
                return;
            case 19:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.b;
                if (constraintTrackingWorker.o.a instanceof r0) {
                    return;
                }
                String strE = constraintTrackingWorker.getInputData().e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                a14 a14VarU = a14.u();
                if (strE == null || strE.length() == 0) {
                    a14VarU.q(gj3.a, "No worker to delegate to.");
                    constraintTrackingWorker.o.j(fm7.a());
                    return;
                }
                gm7 gm7VarB = constraintTrackingWorker.getWorkerFactory().b(constraintTrackingWorker.getApplicationContext(), strE, constraintTrackingWorker.a);
                constraintTrackingWorker.X = gm7VarB;
                if (gm7VarB == null) {
                    a14VarU.n(gj3.a, "No worker to delegate to.");
                    constraintTrackingWorker.o.j(fm7.a());
                    return;
                }
                s7g s7gVarD = s7g.d(constraintTrackingWorker.getApplicationContext());
                h8g h8gVarL = s7gVarD.c.y().l(constraintTrackingWorker.getId().toString());
                if (h8gVarL == null) {
                    dcd dcdVar = constraintTrackingWorker.o;
                    String str = gj3.a;
                    dcdVar.j(fm7.a());
                    return;
                }
                adb adbVar = new adb(s7gVarD.j, constraintTrackingWorker);
                adbVar.w(Collections.singletonList(h8gVarL));
                if (!adbVar.b(constraintTrackingWorker.getId().toString())) {
                    a14VarU.n(gj3.a, "Constraints not met for delegate " + strE + ". Requesting retry.");
                    constraintTrackingWorker.o.j(new dm7());
                    return;
                }
                a14VarU.n(gj3.a, "Constraints met for delegate ".concat(strE));
                try {
                    bm7 bm7VarStartWork = constraintTrackingWorker.X.startWork();
                    bm7VarStartWork.d(new wt1(constraintTrackingWorker, 13, bm7VarStartWork), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    String str2 = gj3.a;
                    a14VarU.o(str2, zr6.i("Delegated worker ", strE, " threw exception in startWork."), th);
                    synchronized (constraintTrackingWorker.b) {
                        try {
                            if (!constraintTrackingWorker.c) {
                                constraintTrackingWorker.o.j(fm7.a());
                                return;
                            } else {
                                a14VarU.n(str2, "Constraints were unmet, Retrying.");
                                constraintTrackingWorker.o.j(new dm7());
                                return;
                            }
                        } finally {
                        }
                    }
                }
            case 20:
                Iterator it2 = ((rr3) this.b).j.iterator();
                if (it2.hasNext()) {
                    au1.r(it2.next());
                    throw null;
                }
                return;
            case 21:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.b;
                if (coroutineWorker.b.a instanceof r0) {
                    coroutineWorker.a.cancel((CancellationException) null);
                    return;
                }
                return;
            case 22:
                int andSet = ((AtomicInteger) ((ty2) this.b).Z).getAndSet(8) - 8;
                kye kyeVar = kye.a;
                js4 js4VarB = kye.b();
                js4VarB.getClass();
                js4VarB.a(Collections.singletonList(new ls4("non_fatal", "max_non_fatals_per_session_reached", andSet)));
                return;
            case 23:
                ((VpxDecoderWrapper) this.b).close();
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                i74 i74Var = (i74) this.b;
                fd fdVarB = i74Var.b();
                i74Var.I(fdVarB, 1028, new v64(fdVarB));
                i74Var.Y.d();
                return;
            case 25:
                e84 e84Var = (e84) this.b;
                if (e84Var.k0 >= 300000) {
                    ((v78) e84Var.s.b).b2 = true;
                    e84Var.k0 = 0L;
                    return;
                }
                return;
            case 26:
                y94 y94Var = (y94) this.b;
                if (y94Var.c) {
                    return;
                }
                er4 er4Var = y94Var.b;
                if (er4Var != null) {
                    er4Var.f(y94Var.a);
                }
                y94Var.o.n.remove(y94Var);
                y94Var.c = true;
                return;
            case 27:
                z94 z94Var = (z94) this.b;
                if (z94Var.c) {
                    return;
                }
                fr4 fr4Var = z94Var.b;
                if (fr4Var != null) {
                    fr4Var.f(z94Var.a);
                }
                z94Var.o.n.remove(z94Var);
                z94Var.c = true;
                return;
            case 28:
                ((w94) this.b).f(null);
                return;
            default:
                ((x94) this.b).f(null);
                return;
        }
    }
}
