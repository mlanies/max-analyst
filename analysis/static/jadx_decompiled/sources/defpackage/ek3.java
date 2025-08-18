package defpackage;

import android.view.View;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class ek3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk3 b;

    public /* synthetic */ ek3(fk3 fk3Var, int i) {
        this.a = i;
        this.b = fk3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fk3 fk3Var = this.b;
        switch (this.a) {
            case 0:
                o9g o9gVar = fk3Var.P0;
                if (o9gVar != null) {
                    long j = fk3Var.R0;
                    buc bucVar = CallHistoryPageScreen.u0;
                    CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) o9gVar.b;
                    if (!((s81) callHistoryPageScreen.o0().s0.getValue()).a) {
                        al6 al6VarQ = callHistoryPageScreen.p0().q(j);
                        if (al6VarQ != null) {
                            if (!(al6VarQ instanceof yk6)) {
                                if (!((Boolean) callHistoryPageScreen.o0().Y.getValue()).booleanValue()) {
                                    eqe eqeVar = new eqe(t7a.r);
                                    wha whaVar = new wha(callHistoryPageScreen);
                                    whaVar.g(eqeVar);
                                    whaVar.i();
                                    break;
                                } else if (!(al6VarQ instanceof wk6)) {
                                    if (al6VarQ instanceof xk6) {
                                        xk6 xk6Var = (xk6) al6VarQ;
                                        z71.c.Z1(Long.valueOf(xk6Var.b), xk6Var.a, xk6Var.c);
                                        break;
                                    }
                                } else {
                                    wk6 wk6Var = (wk6) al6VarQ;
                                    z71.c.a2(wk6Var.b, ((Number) x53.g0(wk6Var.d)).longValue());
                                    break;
                                }
                            } else {
                                yk6 yk6Var = (yk6) al6VarQ;
                                z71.c.a2(yk6Var.b, ((Number) x53.g0(yk6Var.c)).longValue());
                                break;
                            }
                        }
                    } else {
                        al6 al6VarQ2 = callHistoryPageScreen.p0().q(j);
                        if (al6VarQ2 != null) {
                            callHistoryPageScreen.o0().q(j, al6VarQ2);
                            break;
                        }
                    }
                }
                break;
            case 1:
                o9g o9gVar2 = fk3Var.P0;
                if (o9gVar2 != null) {
                    o9gVar2.B(fk3Var.R0, true);
                    break;
                }
                break;
            default:
                o9g o9gVar3 = fk3Var.P0;
                if (o9gVar3 != null) {
                    o9gVar3.B(fk3Var.R0, false);
                    break;
                }
                break;
        }
    }
}
