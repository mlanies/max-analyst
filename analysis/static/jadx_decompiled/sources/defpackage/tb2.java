package defpackage;

import com.my.tracker.obfuscated.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.tamtam.android.services.NotificationTamService;

/* loaded from: classes2.dex */
public final /* synthetic */ class tb2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ tb2(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((zb2) this.c).k(this.b, (e52) this.o);
                return;
            case 1:
                ((jc2) this.c).b.c(this.b, (Collection) this.o);
                return;
            case 2:
                tq6 tq6Var = (tq6) this.c;
                if (tq6Var.s0.get()) {
                    return;
                }
                long j = this.b;
                Long lValueOf = Long.valueOf(j);
                String str = (String) this.o;
                hm9.m("uq6", "onFileUploadCompleted: completed upload. response =%s, totalBytes=%d", str, lValueOf);
                sq6 sq6Var = new sq6(true, str, 100.0f, j);
                f2a f2aVar = tq6Var.Z;
                f2aVar.e(sq6Var);
                f2aVar.b();
                tq6Var.a(false);
                return;
            case 3:
                NotificationTamService notificationTamService = (NotificationTamService) this.c;
                dt2 dt2VarC = ((elc) notificationTamService.Y.getValue()).c();
                long j2 = this.b;
                NotificationTamService.a(j2, (CharSequence) this.o, notificationTamService, dt2VarC.f(j2));
                return;
            case 4:
                die dieVar = (die) this.c;
                List list = (List) this.o;
                long j3 = this.b;
                synchronized (dieVar) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        fp1 fp1Var = ((u41) it.next()).a;
                        boolean z = fp1Var.a == olf.b;
                        LinkedHashMap linkedHashMap = (LinkedHashMap) dieVar.c;
                        bg1 bg1Var = fp1Var.b;
                        boolean zContainsKey = true ^ linkedHashMap.containsKey(bg1Var);
                        if (z && zContainsKey) {
                            linkedHashMap.put(bg1Var, Long.valueOf(j3));
                        }
                    }
                    dieVar.m(list);
                }
                return;
            case 5:
                ((n61) ((m61) ((die) this.c).a)).c("screen_share_first_frame", EventItemValueKt.toEventItemValue(this.b), new EventItemsMap((Map) this.o));
                return;
            case 6:
                fd7 fd7Var = ((qld) this.c).f;
                if (fd7Var != null) {
                    ((CopyOnWriteArraySet) fd7Var.a).add(new tag(this.b, (z99) this.o));
                    return;
                }
                return;
            case 7:
                wva wvaVar = (wva) this.c;
                wvaVar.getClass();
                int i = maf.a;
                t75 t75Var = ((n75) wvaVar.c).a;
                h74 h74Var = t75Var.C0;
                ed edVarP = h74Var.P();
                Object obj = this.o;
                h74Var.Q(edVarP, 26, new lt1(edVarP, obj, this.b));
                if (t75Var.X0 == obj) {
                    t75Var.x0.i(26, new ta4(19));
                    return;
                }
                return;
            case 8:
                aab aabVar = (aab) this.c;
                aabVar.getClass();
                int i2 = oaf.a;
                u75 u75Var = ((o75) aabVar.b).a;
                i74 i74Var = u75Var.D0;
                fd fdVarF = i74Var.F();
                Object obj2 = this.o;
                i74Var.I(fdVarF, 26, new x72(fdVarF, obj2, this.b, 4));
                if (u75Var.b1 == obj2) {
                    u75Var.x0.f(26, new ta4(20));
                    return;
                }
                return;
            default:
                ((t) this.c).a((String) this.o, this.b);
                return;
        }
    }

    public /* synthetic */ tb2(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = j;
    }
}
