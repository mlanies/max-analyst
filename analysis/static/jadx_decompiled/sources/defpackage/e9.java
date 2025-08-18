package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.members.list.MembersListWidget;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;

/* loaded from: classes2.dex */
public final class e9 extends p04 {
    public final long w0;
    public final String x0;
    public final List y0;

    public e9(long j, String str, List list, uu3 uu3Var) {
        super(uu3Var, 1);
        this.w0 = j;
        this.x0 = str;
        this.y0 = list;
    }

    @Override // defpackage.p04
    public final void E(znc zncVar, int i) {
        uu3 membersListWidget;
        if (zncVar.n()) {
            return;
        }
        int iS = au1.s(((g9) this.y0.get(i)).c);
        String str = this.x0;
        if (iS == 0) {
            membersListWidget = new MembersListWidget(str, new go8(this.w0, ek2.MEMBER, (Integer) null, 12), null);
        } else {
            if (iS != 1) {
                throw new NoWhenBranchMatchedException();
            }
            membersListWidget = new AdminsFromContactsScreen(str, this.w0, null);
        }
        uu3 uu3Var = membersListWidget;
        uu3Var.setRetainViewMode(tu3.b);
        zncVar.R(new coc(uu3Var, null, null, null, false, -1));
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.y0.size();
    }
}
