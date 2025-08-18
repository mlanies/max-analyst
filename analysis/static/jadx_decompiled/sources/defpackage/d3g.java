package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.webapp.settings.WebAppsSettingScreen;

/* loaded from: classes2.dex */
public final class d3g implements x2g {
    public final /* synthetic */ WebAppsSettingScreen a;

    public d3g(WebAppsSettingScreen webAppsSettingScreen) {
        this.a = webAppsSettingScreen;
    }

    @Override // defpackage.x2g
    public final void a(w2g w2gVar) {
        bc7[] bc7VarArr = WebAppsSettingScreen.X;
        g3g g3gVar = (g3g) this.a.b.getValue();
        g3gVar.getClass();
        if ((w2gVar instanceof u2g) || (w2gVar instanceof t2g)) {
            return;
        }
        if (!(w2gVar instanceof v2g)) {
            throw new NoWhenBranchMatchedException();
        }
        pnf.o(g3gVar.Z, ((v2g) w2gVar).b);
    }
}
