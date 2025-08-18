package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class xx6 {
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final List p;
    public final boolean a;
    public final long b;
    public final q33 c;
    public final String d;
    public final je7 e;
    public final je7 f;
    public final SharedPreferences g;
    public final LinkedHashMap h;
    public ux6 i;
    public Integer j;
    public k56 k;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        l = timeUnit.toMillis(3L);
        m = timeUnit.toMillis(180L);
        n = timeUnit.toMillis(60L);
        o = timeUnit.toMillis(60L);
        p = y53.M(100, Integer.valueOf(HttpStatus.SC_MULTIPLE_CHOICES), 150, 450);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xx6(boolean z, long j) {
        tx6 tx6Var = tx6.a;
        q33 q33Var = (q33) tx6Var.getAccessor().c(q33.class);
        Context context = (Context) tx6Var.getAccessor().c(Context.class);
        khe kheVarD = tx6Var.getAccessor().d(ad.class);
        khe kheVarD2 = tx6Var.getAccessor().d(an9.class);
        this.a = z;
        this.b = j;
        this.c = q33Var;
        this.d = xx6.class.getName();
        this.e = kheVarD;
        this.f = kheVarD2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("in_app_review_prefs", 0);
        this.g = sharedPreferences;
        this.h = new LinkedHashMap();
        ux6 ux6Var = null;
        String string = sharedPreferences.getString("pref_current_condition", null);
        if (string != null) {
            Iterator it = ux6.v0.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    break;
                }
                Object next = u1Var.next();
                if (tpa.f(((ux6) next).a, string)) {
                    ux6Var = next;
                    break;
                }
            }
            ux6Var = ux6Var;
        }
        this.i = ux6Var;
    }

    public final void a() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((vx6) it.next()).getClass();
        }
        this.g.edit().putString("pref_current_condition", null).apply();
        this.i = null;
    }

    public final void b(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.g;
        if (i == 4) {
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_success_time", -1L).apply();
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_fail_time", jCurrentTimeMillis).apply();
            d(null);
        } else {
            sharedPreferences.edit().putLong("pref_last_in_app_review_time", jCurrentTimeMillis).apply();
        }
        a();
    }

    public final void c(int i, Integer num) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.g;
        if (i == 4) {
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_success_time", jCurrentTimeMillis).apply();
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_fail_time", -1L).apply();
            d(num);
        } else {
            sharedPreferences.edit().putLong("pref_last_in_app_review_time", jCurrentTimeMillis).apply();
        }
        a();
    }

    public final void d(Integer num) {
        Integer numD;
        ux6 ux6Var = this.i;
        if (ux6Var == null || (numD = this.j) == null) {
            return;
        }
        ky7 ky7Var = new ky7();
        q33 q33Var = this.c;
        ky7Var.put("session_id", Long.valueOf(((t33) q33Var).F()));
        if (ux6Var == ux6.t0) {
            numD = ((an9) this.f.getValue()).d();
        }
        ky7Var.put("screen_from", numD);
        ky7Var.put("trigger", ux6Var.a);
        if (num != null) {
            ky7Var.put("mark", Integer.valueOf(num.intValue()));
        }
        ky7 ky7VarB = ky7Var.b();
        e47 e47Var = new e47();
        e47Var.c = "APP_REVIEW";
        e47Var.o = "app_review";
        e47Var.b = ((hyc) q33Var).t();
        e47Var.a = System.currentTimeMillis();
        e47Var.b(ky7VarB);
        ((ad) this.e.getValue()).j(e47Var.c());
    }

    public final void e(Integer num) {
        if (this.i == null) {
            return;
        }
        if (num == null) {
            num = ((an9) this.f.getValue()).d();
        }
        if (x53.c0(p, num)) {
            this.j = num;
            if (this.a) {
                dy6.c.P1().b(":inAppReview/fake", null);
                return;
            }
            k56 k56Var = this.k;
            if (k56Var != null) {
                k56Var.invoke();
            }
        }
    }

    public final void f(Set set, wuc wucVar) {
        ux6 ux6Var = this.i;
        String str = this.d;
        if (ux6Var != null) {
            hm9.n(str, "InAppReviewConditionManager triggerCondition() currentCondition != null (" + ux6Var + ")");
            return;
        }
        t33 t33Var = (t33) this.c;
        boolean z = t33Var.g.getBoolean("app.disable_in_app_review_time_condition", false);
        SharedPreferences sharedPreferences = this.g;
        if (z) {
            hm9.n(str, "InAppReviewConditionManager isTimeAllowsStartInAppReview() clientPrefs.isDisableInAppReviewTimeCondition:" + t33Var.g.getBoolean("app.disable_in_app_review_time_condition", false));
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - l < this.b) {
                hm9.n(str, "InAppReviewConditionManager isTimeAllowsStartInAppReview() hadCrashInPrevious3Days");
                return;
            }
            long j = sharedPreferences.getLong("pref_last_fake_in_app_review_success_time", -1L);
            long j2 = sharedPreferences.getLong("pref_last_fake_in_app_review_fail_time", -1L);
            long j3 = sharedPreferences.getLong("pref_last_in_app_review_time", -1L);
            if ((j != -1 || j2 != -1 || j3 != -1) && ((j == -1 || jCurrentTimeMillis - j < m) && ((j2 == -1 || jCurrentTimeMillis - j2 < n) && (j3 == -1 || jCurrentTimeMillis - j3 < o)))) {
                StringBuilder sbK = au1.k(jCurrentTimeMillis, "InAppReviewConditionManager isTimeAllowsStartInAppReview() currentTime:", ", lastSuccessfulFakeReviewTime:");
                sbK.append(j);
                au1.q(j2, ", lastFailedFakeReviewTime:", ", lastReviewTime:", sbK);
                sbK.append(j3);
                hm9.n(str, sbK.toString());
                return;
            }
        }
        Iterator it = set.iterator();
        ux6 ux6Var2 = null;
        while (it.hasNext()) {
            wx6 wx6Var = (wx6) it.next();
            int iOrdinal = wx6Var.a.ordinal();
            int i = wx6Var.b;
            if (iOrdinal == 0) {
                int i2 = sharedPreferences.getInt("pref_sent_messages_count", 0) + i;
                if (i2 >= 5) {
                    sharedPreferences.edit().putInt("pref_sent_messages_count", 0).apply();
                    ux6Var2 = wx6Var.a;
                } else {
                    sharedPreferences.edit().putInt("pref_sent_messages_count", i2).apply();
                    hm9.n(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + wx6Var + ", sentMessagesCount:" + i2);
                }
            } else if (iOrdinal == 3) {
                int i3 = sharedPreferences.getInt("pref_reactions_count", 0) + i;
                if (i3 >= 2) {
                    sharedPreferences.edit().putInt("pref_reactions_count", 0).apply();
                    ux6Var2 = wx6Var.a;
                } else {
                    sharedPreferences.edit().putInt("pref_reactions_count", i3).apply();
                    hm9.n(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + wx6Var + ", addedReactionsCount:" + i3);
                }
            } else if (iOrdinal == 4) {
                int i4 = sharedPreferences.getInt("pref_sent_stickers_count", 0) + i;
                if (i4 >= 3) {
                    sharedPreferences.edit().putInt("pref_sent_stickers_count", 0).apply();
                    ux6Var2 = wx6Var.a;
                } else {
                    sharedPreferences.edit().putInt("pref_sent_stickers_count", i4).apply();
                    hm9.n(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + wx6Var + ", sentStickersCount:" + i4);
                }
            } else if (iOrdinal != 5) {
                if (iOrdinal == 6) {
                    int i5 = sharedPreferences.getInt("pref_made_pin_count", 0) + i;
                    if (i5 >= 2) {
                        sharedPreferences.edit().putInt("pref_made_pin_count", 0).apply();
                    } else {
                        sharedPreferences.edit().putInt("pref_made_pin_count", i5).apply();
                        hm9.n(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + wx6Var + ", madePinCount:" + i5);
                    }
                }
                ux6Var2 = wx6Var.a;
            } else {
                int i6 = sharedPreferences.getInt("pref_created_group_chats_count", 0) + i;
                if (i6 >= 2) {
                    sharedPreferences.edit().putInt("pref_created_group_chats_count", 0).apply();
                    ux6Var2 = wx6Var.a;
                } else {
                    sharedPreferences.edit().putInt("pref_created_group_chats_count", i6).apply();
                    hm9.n(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + wx6Var + ", createdGroupChatsCount:" + i6);
                }
            }
        }
        if (ux6Var2 == null || ((vx6) this.h.get(ux6Var2)) == null) {
            return;
        }
        this.i = ux6Var2;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        ux6 ux6Var3 = this.i;
        editorEdit.putString("pref_current_condition", ux6Var3 != null ? ux6Var3.a : null).apply();
        e(Integer.valueOf(wucVar.a));
    }
}
