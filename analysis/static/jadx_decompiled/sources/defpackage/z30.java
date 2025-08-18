package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.io.File;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class z30 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je7 b;

    public /* synthetic */ z30(int i, je7 je7Var) {
        this.a = i;
        this.b = je7Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        Object next;
        je7 je7Var = this.b;
        switch (this.a) {
            case 0:
                return j1e.a(((w9a) ((kke) je7Var.getValue())).e());
            case 1:
                return ((w9a) ((kke) je7Var.getValue())).a().limitedParallelism(1, "call_chat_observing");
            case 2:
                return tpa.u((Context) je7Var.getValue());
            case 3:
                return ((bea) je7Var.getValue()).j(true);
            case 4:
                return ((Context) je7Var.getValue()).getString(d0c.call_notification_name_temp);
            case 5:
                return ((Context) je7Var.getValue()).getString(d0c.call_notification_incoming_call);
            case 6:
                return ((Context) je7Var.getValue()).getString(d0c.call_notification_incoming_video_call);
            case 7:
                return ((Context) je7Var.getValue()).getString(d0c.call_notification_active_call);
            case 8:
                return ((w9a) ((kke) je7Var.getValue())).b();
            case 9:
                return ((OneMeRoomDatabase) ((pfa) je7Var.getValue()).m()).N();
            case 10:
                return Boolean.valueOf(((ge2) je7Var.getValue()).d());
            case 11:
                return ((w9a) ((kke) je7Var.getValue())).b();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((ct0) je7Var.getValue()).a(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            case 13:
                t2a t2aVarA = ((u2a) je7Var.getValue()).a();
                t2aVarA.f = false;
                return new u2a(t2aVarA);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((y7d) je7Var.getValue()).getClass();
                return t5c.c;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                qyc qycVar = (qyc) ((y7d) je7Var.getValue());
                qycVar.getClass();
                int iQ = (int) qycVar.q(PmsKey.f86msggetreactionspagesize, 40);
                return Integer.valueOf(iQ > 0 ? iQ : 40);
            case 16:
                qyc qycVar2 = (qyc) ((y7d) je7Var.getValue());
                qycVar2.getClass();
                List<Integer> listO = qycVar2.o(PmsKey.f4analyticspermissions, Collections.emptyList());
                EnumSet enumSetNoneOf = EnumSet.noneOf(gs7.class);
                for (Integer num : listO) {
                    pq9 pq9Var = gs7.a;
                    int iIntValue = num.intValue();
                    pq9Var.getClass();
                    Iterator it = gs7.o.iterator();
                    while (true) {
                        u1 u1Var = (u1) it;
                        if (u1Var.hasNext()) {
                            next = u1Var.next();
                            ((gs7) next).getClass();
                            if (10 == iIntValue) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    gs7 gs7Var = (gs7) next;
                    if (gs7Var != null) {
                        enumSetNoneOf.add(gs7Var);
                    }
                }
                return enumSetNoneOf;
            case LangUtils.HASH_SEED /* 17 */:
                return ((iba) je7Var.getValue()).c();
            case 18:
                return new zy(new File(((kk5) ((zi5) je7Var.getValue())).c(), "chats_v2"), null);
            case 19:
                return new zy(new File(((kk5) ((zi5) je7Var.getValue())).c(), "folders_v1"), null);
            case 20:
                return (SensorManager) ((Context) je7Var.getValue()).getSystemService("sensor");
            case 21:
                return (PowerManager) ((Context) je7Var.getValue()).getSystemService("power");
            case 22:
                return ((jle) ((hle) je7Var.getValue())).a();
            case 23:
                return (ScheduledExecutorService) ((iba) je7Var.getValue()).l.getValue();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return (ScheduledExecutorService) ((iba) je7Var.getValue()).l.getValue();
            case 25:
                iba ibaVar = (iba) je7Var.getValue();
                return ibaVar.h(ibaVar.f(1, "ONEME_FB_BLOCK", Runtime.getRuntime().availableProcessors(), 1), "ONEME_FB_BLOCK");
            case 26:
                return (ScheduledExecutorService) ((iba) je7Var.getValue()).n.getValue();
            case 27:
                return new mbd((yme) je7Var.getValue());
            case 28:
                return new f55((ScheduledExecutorService) ((iba) je7Var.getValue()).n.getValue(), true);
            default:
                iba ibaVar2 = (iba) je7Var.getValue();
                ibaVar2.getClass();
                bc7 bc7Var = iba.p[3];
                ExecutorService executorServiceE = ibaVar2.e(ibaVar2.i);
                trd trdVar = muc.a;
                return new f55(executorServiceE, false);
        }
    }
}
