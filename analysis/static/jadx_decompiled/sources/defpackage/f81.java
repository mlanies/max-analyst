package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* loaded from: classes.dex */
public final class f81 extends p04 {
    public final String w0;
    public List x0;

    public f81(uu3 uu3Var) {
        super(uu3Var, 1);
        this.w0 = f81.class.getName();
        this.x0 = nz4.a;
    }

    @Override // defpackage.p04
    public final void E(znc zncVar, int i) {
        CallHistoryPageScreen callHistoryPageScreen;
        if (zncVar.n()) {
            return;
        }
        int iOrdinal = ((w81) this.x0.get(i)).c.ordinal();
        if (iOrdinal == 0) {
            buc bucVar = CallHistoryPageScreen.u0;
            v81 v81Var = v81.c;
            bucVar.getClass();
            callHistoryPageScreen = new CallHistoryPageScreen(v81Var);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            buc bucVar2 = CallHistoryPageScreen.u0;
            v81 v81Var2 = v81.o;
            bucVar2.getClass();
            callHistoryPageScreen = new CallHistoryPageScreen(v81Var2);
        }
        CallHistoryPageScreen callHistoryPageScreen2 = callHistoryPageScreen;
        callHistoryPageScreen2.setRetainViewMode(tu3.b);
        zncVar.R(new coc(callHistoryPageScreen2, null, null, null, false, -1));
    }

    @Override // defpackage.p04, defpackage.hdc
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void y(eoc eocVar) {
        eocVar.G0 = null;
        super.y(eocVar);
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.x0.size();
    }
}
