package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class m9b {
    public static final /* synthetic */ bc7[] d = {new hob(m9b.class, "discardServerDraftUseCase", "getDiscardServerDraftUseCase()Lru/ok/tamtam/draft/DiscardServerDraftUseCase;", 0), zr6.e(nec.a, m9b.class, "downloadDraftUseCase", "getDownloadDraftUseCase()Lru/ok/tamtam/draft/DownloadDraftUseCase;", 0)};
    public static final String e = m9b.class.getName();
    public final m7b a;
    public final rm4 b;
    public final rm4 c;

    public m9b(m7b m7bVar, rm4 rm4Var, rm4 rm4Var2) {
        this.a = m7bVar;
        this.b = rm4Var;
        this.c = rm4Var2;
    }

    public final void a(vp4 vp4Var, long j) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        String str = e;
        hm9.n(str, "execute: draftsNews=" + vp4Var + ", serverTime=" + j + "ms");
        p7b p7bVar = (p7b) this.a;
        p7bVar.a.l("user.draftsLastSync", Long.valueOf(j));
        if (!p7bVar.b.u()) {
            hm9.n(str, "Drafts sync disabled");
            return;
        }
        if (vp4Var == null) {
            return;
        }
        kp4 kp4Var = vp4Var.a;
        Map map5 = kp4Var != null ? kp4Var.a : null;
        rm4 rm4Var = this.b;
        bc7[] bc7VarArr = d;
        if (map5 != null && !map5.isEmpty() && kp4Var != null && (map4 = kp4Var.a) != null) {
            for (Map.Entry entry : map4.entrySet()) {
                bc7 bc7Var = bc7VarArr[0];
                ((rk4) rm4Var.get()).a(((Number) entry.getValue()).longValue(), (Long) entry.getKey(), null);
            }
        }
        kp4 kp4Var2 = vp4Var.b;
        Map map6 = kp4Var2 != null ? kp4Var2.a : null;
        if (map6 != null && !map6.isEmpty() && kp4Var2 != null && (map3 = kp4Var2.a) != null) {
            for (Map.Entry entry2 : map3.entrySet()) {
                bc7 bc7Var2 = bc7VarArr[0];
                ((rk4) rm4Var.get()).a(((Number) entry2.getValue()).longValue(), null, (Long) entry2.getKey());
            }
        }
        Map map7 = kp4Var != null ? kp4Var.b : null;
        rm4 rm4Var2 = this.c;
        if (map7 != null && !map7.isEmpty() && kp4Var != null && (map2 = kp4Var.b) != null) {
            for (Map.Entry entry3 : map2.entrySet()) {
                bc7 bc7Var3 = bc7VarArr[1];
                ((gn4) rm4Var2.get()).a((Long) entry3.getKey(), null, (n7d) entry3.getValue());
            }
        }
        Map map8 = kp4Var2 != null ? kp4Var2.b : null;
        if (map8 == null || map8.isEmpty() || kp4Var2 == null || (map = kp4Var2.b) == null) {
            return;
        }
        for (Map.Entry entry4 : map.entrySet()) {
            long jLongValue = ((Number) entry4.getKey()).longValue();
            n7d n7dVar = (n7d) entry4.getValue();
            bc7 bc7Var4 = bc7VarArr[1];
            ((gn4) rm4Var2.get()).a(null, Long.valueOf(jLongValue), n7dVar);
        }
    }
}
