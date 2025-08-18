package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class lpb implements x7d {
    public final je7 a;
    public final je7 b;

    public lpb(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    @Override // defpackage.x7d
    public final void a(String str, String str2) {
        hm9.n("lpb", "onProxyEnableChange: oldValue=" + str + ", newValue=" + str2);
        ((tke) this.a.getValue()).f(str2);
        if (str2 == null || str2.length() == 0) {
            return;
        }
        ((ty3) this.b.getValue()).b("proxy", str2);
    }

    @Override // defpackage.x7d
    public final void b(List list, List list2) {
        hm9.n("lpb", "onProxyDomainsChanged: oldValue=" + list + ", newValue=" + list2);
        tke tkeVar = (tke) this.a.getValue();
        synchronized (tkeVar) {
            tkeVar.g = list2;
        }
        if (!list2.isEmpty()) {
            ((ty3) this.b.getValue()).b("proxyDomains", x53.n0(list2, null, null, null, null, 63));
        }
    }
}
