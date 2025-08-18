package defpackage;

import android.view.ViewGroup;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import one.me.profile.screens.invite.ProfileInviteScreen;

/* loaded from: classes2.dex */
public final class xhb extends ppd {
    public final whb X;

    public xhb(ExecutorService executorService, whb whbVar) {
        super(executorService);
        this.X = whbVar;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(gmb gmbVar, int i) {
        dec decVar;
        cjb cjbVar = (cjb) ((ol7) C(i));
        gmbVar.A(cjbVar);
        if (cjbVar instanceof yib) {
            decVar = gmbVar instanceof w47 ? (w47) gmbVar : null;
            if (decVar != null) {
                tu0.K(decVar.a, 300L, new m6(13, new zja(this, 7, cjbVar)));
                return;
            }
            return;
        }
        if (cjbVar instanceof rib) {
            boolean z = gmbVar instanceof cd2;
            cd2 cd2Var = z ? (cd2) gmbVar : null;
            if (cd2Var != null) {
                final int i2 = 0;
                tu0.K(cd2Var.a, 300L, new m6(4, new k56(this) { // from class: vhb
                    public final /* synthetic */ xhb b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.k56
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                jib jibVarM0 = ((ProfileInviteScreen) this.b.X).m0();
                                String strS = jibVarM0.s();
                                if (strS != null) {
                                    lhb lhbVar = new lhb(strS);
                                    s35 s35Var = jibVarM0.C0;
                                    pnf.o(s35Var, lhbVar);
                                    if (tpa.s()) {
                                        e52 e52VarR = jibVarM0.r();
                                        s35Var.b.g(new ohb(woc.r, new eqe((e52VarR == null || !e52VarR.I()) ? yea.S0 : yea.P0)));
                                    }
                                }
                                break;
                            default:
                                jib jibVarM02 = ((ProfileInviteScreen) this.b.X).m0();
                                jibVarM02.getClass();
                                pnf.o(jibVarM02.C0, new nhb(Collections.singletonList(new tt3(wea.K, new eqe(yea.V0), Integer.valueOf(wfa.U), Integer.valueOf(woc.O1), Integer.valueOf(wfa.P)))));
                                break;
                        }
                        return e5f.a;
                    }
                }));
            }
            decVar = z ? (cd2) gmbVar : null;
            if (decVar != null) {
                final int i3 = 1;
                ((xc2) decVar.a).setOnMoreActionsClickListener(new k56(this) { // from class: vhb
                    public final /* synthetic */ xhb b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.k56
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                jib jibVarM0 = ((ProfileInviteScreen) this.b.X).m0();
                                String strS = jibVarM0.s();
                                if (strS != null) {
                                    lhb lhbVar = new lhb(strS);
                                    s35 s35Var = jibVarM0.C0;
                                    pnf.o(s35Var, lhbVar);
                                    if (tpa.s()) {
                                        e52 e52VarR = jibVarM0.r();
                                        s35Var.b.g(new ohb(woc.r, new eqe((e52VarR == null || !e52VarR.I()) ? yea.S0 : yea.P0)));
                                    }
                                }
                                break;
                            default:
                                jib jibVarM02 = ((ProfileInviteScreen) this.b.X).m0();
                                jibVarM02.getClass();
                                pnf.o(jibVarM02.C0, new nhb(Collections.singletonList(new tt3(wea.K, new eqe(yea.V0), Integer.valueOf(wfa.U), Integer.valueOf(woc.O1), Integer.valueOf(wfa.P)))));
                                break;
                        }
                        return e5f.a;
                    }
                });
            }
        }
    }

    @Override // defpackage.ppd, defpackage.hdc
    public final int l(int i) {
        return ((cjb) ((ol7) C(i))).getI0();
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (lz7.i(i2, 8192)) {
            return new w47(new ufd(viewGroup.getContext(), null));
        }
        if (lz7.i(i2, 4)) {
            return new p20(viewGroup.getContext());
        }
        if (lz7.i(i2, 16384)) {
            return new cd2(new xc2(viewGroup.getContext(), null));
        }
        throw new IllegalStateException(("unknown item viewType: " + i).toString());
    }
}
