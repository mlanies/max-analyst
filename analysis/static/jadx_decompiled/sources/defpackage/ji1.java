package defpackage;

import java.util.ArrayList;
import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final class ji1 implements yu3 {
    public final /* synthetic */ CallScreen a;

    public ji1(CallScreen callScreen) {
        this.a = callScreen;
    }

    @Override // defpackage.yu3
    public final void a(uu3 uu3Var, uu3 uu3Var2, boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yu3
    public final void b(uu3 uu3Var, uu3 uu3Var2, boolean z) {
        q0e q0eVar;
        Object value;
        yxc yxcVar = CallScreen.R0;
        CallScreen callScreen = this.a;
        el1 el1VarD0 = callScreen.D0();
        uu3 parentController = callScreen;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        foc focVar = parentController instanceof foc ? (foc) parentController : null;
        znc zncVarT = focVar != null ? focVar.T() : null;
        ArrayList arrayListE = zncVarT != null ? zncVarT.e() : null;
        boolean z2 = true ^ (arrayListE == null || arrayListE.isEmpty());
        do {
            q0eVar = el1VarD0.I0;
            value = q0eVar.getValue();
            ((Boolean) value).getClass();
        } while (!q0eVar.c(value, Boolean.valueOf(z2)));
    }
}
