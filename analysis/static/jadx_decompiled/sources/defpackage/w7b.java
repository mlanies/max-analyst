package defpackage;

import android.content.Context;
import android.text.SpannableString;
import androidx.work.WorkRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class w7b implements gbd {
    public static final /* synthetic */ bc7[] w0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final av0 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final ContextScope s0;
    public final kld t0 = lld.b(0, 0, 0, 7);
    public final w4d u0 = mqd.D();
    public final AtomicBoolean v0 = new AtomicBoolean(false);

    static {
        oi9 oi9Var = new oi9(w7b.class, "presencesJob", "getPresencesJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        w0 = new bc7[]{oi9Var};
    }

    public w7b(je7 je7Var, je7 je7Var2, je7 je7Var3, av0 av0Var, je7 je7Var4, je7 je7Var5, kke kkeVar, khe kheVar) {
        this.a = av0Var;
        this.b = je7Var;
        this.c = je7Var2;
        this.o = je7Var3;
        this.X = kheVar;
        this.Y = je7Var4;
        this.Z = je7Var5;
        this.s0 = j1e.a(((w9a) kkeVar).a());
    }

    public final CharSequence a(long j, boolean z, r7b r7bVar) {
        je7 je7Var = this.c;
        if (!z) {
            return ((ida) je7Var.getValue()).a.getString(dpc.m);
        }
        if (d().e(j)) {
            ida idaVar = (ida) je7Var.getValue();
            int i = c2c.tt_contact_status_online;
            Context context = idaVar.a;
            String string = context.getString(i);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new mse(qp4.u0.b(context).i(), new ww9(10)), 0, string.length(), 33);
            return spannableString;
        }
        if (r7bVar == null) {
            r7bVar = d().b(j);
        }
        ida idaVar2 = (ida) je7Var.getValue();
        t33 t33Var = idaVar2.c;
        b11 b11VarO = ay7.o(r7bVar.b * 1000, t33Var.n());
        Locale localeV = t33Var.v();
        String[] strArr = are.b;
        int i2 = b11VarO.b;
        int iS = au1.s(i2);
        Context context2 = idaVar2.a;
        long j2 = b11VarO.c;
        switch (iS) {
            case 0:
                return context2.getString(c2c.tt_dates_right_now);
            case 1:
                return context2.getString(c2c.tt_dates_minutes_last_seen, Integer.valueOf((int) j2));
            case 2:
                return context2.getString(c2c.tt_dates_hours_last_seen, Integer.valueOf((int) j2));
            case 3:
                return j2 == 0 ? context2.getString(c2c.tt_dates_yesterday_at_last_seen_no_time) : String.format(context2.getString(c2c.tt_dates_yesterday_at), ay7.k(context2, j2, localeV));
            case 4:
                return context2.getString(c2c.tt_dates_days_last_seen, Integer.valueOf((int) j2));
            case 5:
                return context2.getString(c2c.tt_dates_weeks_last_seen, Integer.valueOf((int) j2));
            case 6:
                return context2.getString(c2c.tt_dates_months_last_seen, Integer.valueOf((int) j2));
            case 7:
            case 8:
                return context2.getString(c2c.tt_dates_full_last_seen_u, ay7.r(localeV, j2, au1.c(i2, 8)));
            case 9:
                return context2.getString(c2c.presence_unknown_date);
            default:
                return "";
        }
    }

    public final CharSequence b(uj3 uj3Var) {
        return a(uj3Var.n(), uj3Var.c(), null);
    }

    @Override // defpackage.gbd
    public final void c(int i) {
        AtomicBoolean atomicBoolean = this.v0;
        if (i != 1) {
            atomicBoolean.set(true);
        } else if (atomicBoolean.get()) {
            g();
            atomicBoolean.set(false);
        }
    }

    public final u7b d() {
        return (u7b) this.b.getValue();
    }

    public final q33 e() {
        return (q33) this.o.getValue();
    }

    public final x77 f() {
        return (x77) this.u0.T0(this, w0[0]);
    }

    public final void g() {
        hm9.n("PresenceController", "moveOnlineToLastSeen");
        us usVar = new us(0);
        int iN = (int) (((hyc) e()).n() / 1000);
        Iterator it = ((ps) d().d().entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            long jLongValue = ((Number) entry.getKey()).longValue();
            if (((r7b) entry.getValue()).a != 0) {
                usVar.put(Long.valueOf(jLongValue), new r7b(0, iN));
            }
        }
        h(0L, usVar);
    }

    public final void h(long j, Map map) {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "PresenceController", zr6.h(map.size(), "onContactPresence, presence.count() = "), null);
        }
        if (!map.isEmpty()) {
            k(map);
            if (j > 0) {
                hyc hycVar = (hyc) e();
                if (j > hycVar.f("user.presenceLastSync", 0L)) {
                    hycVar.l("user.presenceLastSync", Long.valueOf(j));
                }
            }
        }
    }

    public final void i(HashMap map, long j) {
        if (!map.containsKey(Long.valueOf(((hyc) e()).t()))) {
            map.put(Long.valueOf(((hyc) e()).t()), r7b.d);
        }
        h(j, map);
    }

    public final void j(xs9 xs9Var) {
        int i;
        x77 x77VarF;
        x77 x77VarF2;
        ConcurrentHashMap concurrentHashMap = d().o;
        if (concurrentHashMap.isEmpty()) {
            i = 0;
        } else {
            Iterator it = concurrentHashMap.entrySet().iterator();
            i = 0;
            while (it.hasNext()) {
                if (((ti9) ((Map.Entry) it.next()).getValue()).getValue() != null) {
                    i++;
                }
            }
        }
        long j = i < 500 ? 0L : i < 1000 ? MultiFileUploader.UPLOAD_NEXT_INTERVAL : WorkRequest.MIN_BACKOFF_MILLIS;
        if (j > 0 && (f() == null || ((x77VarF2 = f()) != null && !x77VarF2.isActive()))) {
            this.u0.o1(this, w0[0], j47.T(this.s0, null, vx3.b, new v7b(this, j, null), 1));
        }
        if (f() != null && (x77VarF = f()) != null && x77VarF.isActive()) {
            hm9.n("PresenceController", "onNotifPresence: post to subject");
            this.t0.g(xs9Var);
            return;
        }
        List<xs9> listSingletonList = Collections.singletonList(xs9Var);
        if (listSingletonList.isEmpty()) {
            return;
        }
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "PresenceController", "onNotifPresence: " + listSingletonList + ".size", null);
        }
        us usVar = new us(listSingletonList.size());
        long j2 = 0;
        for (xs9 xs9Var2 : listSingletonList) {
            usVar.put(Long.valueOf(xs9Var2.c), iz7.l(xs9Var2.o));
            long j3 = xs9Var2.X;
            if (j3 > j2) {
                j2 = j3;
            }
        }
        hyc hycVar = (hyc) e();
        if (j2 > hycVar.f("user.presenceLastSync", 0L)) {
            hycVar.l("user.presenceLastSync", Long.valueOf(j2));
        }
        k(usVar);
    }

    public final void k(Map map) {
        if (!this.v0.get()) {
            us usVar = new us(map.size());
            for (Map.Entry entry : map.entrySet()) {
                usVar.put(Long.valueOf(((Number) entry.getKey()).longValue()), new r7b(0, ((r7b) entry.getValue()).b));
            }
            map = usVar;
        }
        u7b u7bVarD = d();
        u7bVarD.getClass();
        gi9 gi9Var = new gi9(map.size());
        for (Map.Entry entry2 : map.entrySet()) {
            long jLongValue = ((Number) entry2.getKey()).longValue();
            r7b r7bVar = (r7b) entry2.getValue();
            gi9Var.a(jLongValue);
            u7bVarD.f(jLongValue, r7bVar);
        }
        ((Executor) u7bVarD.c.getValue()).execute(new do9(u7bVarD, 13, gi9Var));
        this.a.c(new ps3(map.keySet()));
    }
}
