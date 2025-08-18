package defpackage;

/* loaded from: classes2.dex */
public final class rk4 {
    public final je7 a;

    public rk4(je7 je7Var) {
        this.a = je7Var;
    }

    public final void a(long j, Long l, Long l2) {
        hm9.n("rk4", "execute: chatId=" + l + ", contactId=" + l2 + ", serverTime=" + j);
        je7 je7Var = this.a;
        e52 e52VarF = (l == null || l.longValue() == 0) ? (l2 == null || l2.longValue() == 0) ? null : ((p82) je7Var.getValue()).F(l2.longValue()) : ((p82) je7Var.getValue()).z(l.longValue());
        if (e52VarF == null) {
            hm9.m0("rk4", "Chat is null. Ignore", new Object[0]);
            return;
        }
        uaa uaaVar = e52VarF.b.f0;
        if (uaaVar == null) {
            hm9.G("rk4", "draft is null, ignore", null);
            return;
        }
        Long lB = uaaVar.b();
        if ((lB != null ? lB.longValue() : 0L) > j) {
            hm9.m0("rk4", "try to rewrite draft by old, ignore it!", new Object[0]);
        } else {
            hm9.n("rk4", "Discard server draft");
            ((p82) je7Var.getValue()).p(e52VarF.a);
        }
    }
}
