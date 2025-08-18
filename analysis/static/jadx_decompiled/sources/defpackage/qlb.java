package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.profile.ProfileScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class qlb extends ppd {
    public final plb X;
    public final gaa Y;

    public qlb(ExecutorService executorService, plb plbVar) {
        super(executorService);
        this.X = plbVar;
        this.Y = new gaa(this);
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(gmb gmbVar, int i) {
        View.OnClickListener olbVar;
        View.OnLongClickListener zl0Var;
        dec decVar;
        cjb cjbVar = (cjb) ((ol7) C(i));
        if (cjbVar instanceof lib) {
            final int i2 = 0;
            olbVar = new View.OnClickListener(this) { // from class: mlb
                public final /* synthetic */ qlb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            cnb cnbVarR0 = ((ProfileScreen) this.b.X).r0();
                            j47.T(cnbVarR0.a, ((w9a) cnbVarR0.u()).a(), null, new smb(cnbVarR0, null), 2);
                            break;
                        case 1:
                            cnb cnbVarR02 = ((ProfileScreen) this.b.X).r0();
                            Long lI = cnbVarR02.O0.i();
                            if (lI != null) {
                                pnf.o(cnbVarR02.A0, new lkb(lI.longValue()));
                                break;
                            }
                            break;
                        case 2:
                            cnb cnbVarR03 = ((ProfileScreen) this.b.X).r0();
                            Long lI2 = cnbVarR03.O0.i();
                            if (lI2 != null) {
                                pnf.o(cnbVarR03.A0, new hkb(lI2.longValue(), ek2.ADMIN));
                                break;
                            }
                            break;
                        case 3:
                            cnb cnbVarR04 = ((ProfileScreen) this.b.X).r0();
                            vxd vxdVarT = j47.T(cnbVarR04.a, ((w9a) cnbVarR04.u()).b(), null, new lmb(cnbVarR04, null), 2);
                            cnbVarR04.C0.o1(cnbVarR04, cnb.S0[1], vxdVarT);
                            break;
                        case 4:
                            cnb cnbVarR05 = ((ProfileScreen) this.b.X).r0();
                            pnf.o(cnbVarR05.z0, new ylb((List) ((zcb) cnbVarR05.F0.getValue()).l.getValue()));
                            break;
                        default:
                            cnb cnbVarR06 = ((ProfileScreen) this.b.X).r0();
                            Long lI3 = cnbVarR06.O0.i();
                            if (lI3 != null) {
                                pnf.o(cnbVarR06.A0, new hkb(lI3.longValue(), ek2.MEMBER));
                                break;
                            }
                            break;
                    }
                }
            };
        } else if (cjbVar instanceof pib) {
            final int i3 = 1;
            olbVar = new View.OnClickListener(this) { // from class: mlb
                public final /* synthetic */ qlb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            cnb cnbVarR0 = ((ProfileScreen) this.b.X).r0();
                            j47.T(cnbVarR0.a, ((w9a) cnbVarR0.u()).a(), null, new smb(cnbVarR0, null), 2);
                            break;
                        case 1:
                            cnb cnbVarR02 = ((ProfileScreen) this.b.X).r0();
                            Long lI = cnbVarR02.O0.i();
                            if (lI != null) {
                                pnf.o(cnbVarR02.A0, new lkb(lI.longValue()));
                                break;
                            }
                            break;
                        case 2:
                            cnb cnbVarR03 = ((ProfileScreen) this.b.X).r0();
                            Long lI2 = cnbVarR03.O0.i();
                            if (lI2 != null) {
                                pnf.o(cnbVarR03.A0, new hkb(lI2.longValue(), ek2.ADMIN));
                                break;
                            }
                            break;
                        case 3:
                            cnb cnbVarR04 = ((ProfileScreen) this.b.X).r0();
                            vxd vxdVarT = j47.T(cnbVarR04.a, ((w9a) cnbVarR04.u()).b(), null, new lmb(cnbVarR04, null), 2);
                            cnbVarR04.C0.o1(cnbVarR04, cnb.S0[1], vxdVarT);
                            break;
                        case 4:
                            cnb cnbVarR05 = ((ProfileScreen) this.b.X).r0();
                            pnf.o(cnbVarR05.z0, new ylb((List) ((zcb) cnbVarR05.F0.getValue()).l.getValue()));
                            break;
                        default:
                            cnb cnbVarR06 = ((ProfileScreen) this.b.X).r0();
                            Long lI3 = cnbVarR06.O0.i();
                            if (lI3 != null) {
                                pnf.o(cnbVarR06.A0, new hkb(lI3.longValue(), ek2.MEMBER));
                                break;
                            }
                            break;
                    }
                }
            };
        } else if (cjbVar instanceof nib) {
            final int i4 = 2;
            olbVar = new View.OnClickListener(this) { // from class: mlb
                public final /* synthetic */ qlb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            cnb cnbVarR0 = ((ProfileScreen) this.b.X).r0();
                            j47.T(cnbVarR0.a, ((w9a) cnbVarR0.u()).a(), null, new smb(cnbVarR0, null), 2);
                            break;
                        case 1:
                            cnb cnbVarR02 = ((ProfileScreen) this.b.X).r0();
                            Long lI = cnbVarR02.O0.i();
                            if (lI != null) {
                                pnf.o(cnbVarR02.A0, new lkb(lI.longValue()));
                                break;
                            }
                            break;
                        case 2:
                            cnb cnbVarR03 = ((ProfileScreen) this.b.X).r0();
                            Long lI2 = cnbVarR03.O0.i();
                            if (lI2 != null) {
                                pnf.o(cnbVarR03.A0, new hkb(lI2.longValue(), ek2.ADMIN));
                                break;
                            }
                            break;
                        case 3:
                            cnb cnbVarR04 = ((ProfileScreen) this.b.X).r0();
                            vxd vxdVarT = j47.T(cnbVarR04.a, ((w9a) cnbVarR04.u()).b(), null, new lmb(cnbVarR04, null), 2);
                            cnbVarR04.C0.o1(cnbVarR04, cnb.S0[1], vxdVarT);
                            break;
                        case 4:
                            cnb cnbVarR05 = ((ProfileScreen) this.b.X).r0();
                            pnf.o(cnbVarR05.z0, new ylb((List) ((zcb) cnbVarR05.F0.getValue()).l.getValue()));
                            break;
                        default:
                            cnb cnbVarR06 = ((ProfileScreen) this.b.X).r0();
                            Long lI3 = cnbVarR06.O0.i();
                            if (lI3 != null) {
                                pnf.o(cnbVarR06.A0, new hkb(lI3.longValue(), ek2.MEMBER));
                                break;
                            }
                            break;
                    }
                }
            };
        } else if (cjbVar instanceof oib) {
            final int i5 = 3;
            olbVar = new View.OnClickListener(this) { // from class: mlb
                public final /* synthetic */ qlb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            cnb cnbVarR0 = ((ProfileScreen) this.b.X).r0();
                            j47.T(cnbVarR0.a, ((w9a) cnbVarR0.u()).a(), null, new smb(cnbVarR0, null), 2);
                            break;
                        case 1:
                            cnb cnbVarR02 = ((ProfileScreen) this.b.X).r0();
                            Long lI = cnbVarR02.O0.i();
                            if (lI != null) {
                                pnf.o(cnbVarR02.A0, new lkb(lI.longValue()));
                                break;
                            }
                            break;
                        case 2:
                            cnb cnbVarR03 = ((ProfileScreen) this.b.X).r0();
                            Long lI2 = cnbVarR03.O0.i();
                            if (lI2 != null) {
                                pnf.o(cnbVarR03.A0, new hkb(lI2.longValue(), ek2.ADMIN));
                                break;
                            }
                            break;
                        case 3:
                            cnb cnbVarR04 = ((ProfileScreen) this.b.X).r0();
                            vxd vxdVarT = j47.T(cnbVarR04.a, ((w9a) cnbVarR04.u()).b(), null, new lmb(cnbVarR04, null), 2);
                            cnbVarR04.C0.o1(cnbVarR04, cnb.S0[1], vxdVarT);
                            break;
                        case 4:
                            cnb cnbVarR05 = ((ProfileScreen) this.b.X).r0();
                            pnf.o(cnbVarR05.z0, new ylb((List) ((zcb) cnbVarR05.F0.getValue()).l.getValue()));
                            break;
                        default:
                            cnb cnbVarR06 = ((ProfileScreen) this.b.X).r0();
                            Long lI3 = cnbVarR06.O0.i();
                            if (lI3 != null) {
                                pnf.o(cnbVarR06.A0, new hkb(lI3.longValue(), ek2.MEMBER));
                                break;
                            }
                            break;
                    }
                }
            };
        } else if (cjbVar instanceof ajb) {
            final int i6 = 4;
            olbVar = new View.OnClickListener(this) { // from class: mlb
                public final /* synthetic */ qlb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i6) {
                        case 0:
                            cnb cnbVarR0 = ((ProfileScreen) this.b.X).r0();
                            j47.T(cnbVarR0.a, ((w9a) cnbVarR0.u()).a(), null, new smb(cnbVarR0, null), 2);
                            break;
                        case 1:
                            cnb cnbVarR02 = ((ProfileScreen) this.b.X).r0();
                            Long lI = cnbVarR02.O0.i();
                            if (lI != null) {
                                pnf.o(cnbVarR02.A0, new lkb(lI.longValue()));
                                break;
                            }
                            break;
                        case 2:
                            cnb cnbVarR03 = ((ProfileScreen) this.b.X).r0();
                            Long lI2 = cnbVarR03.O0.i();
                            if (lI2 != null) {
                                pnf.o(cnbVarR03.A0, new hkb(lI2.longValue(), ek2.ADMIN));
                                break;
                            }
                            break;
                        case 3:
                            cnb cnbVarR04 = ((ProfileScreen) this.b.X).r0();
                            vxd vxdVarT = j47.T(cnbVarR04.a, ((w9a) cnbVarR04.u()).b(), null, new lmb(cnbVarR04, null), 2);
                            cnbVarR04.C0.o1(cnbVarR04, cnb.S0[1], vxdVarT);
                            break;
                        case 4:
                            cnb cnbVarR05 = ((ProfileScreen) this.b.X).r0();
                            pnf.o(cnbVarR05.z0, new ylb((List) ((zcb) cnbVarR05.F0.getValue()).l.getValue()));
                            break;
                        default:
                            cnb cnbVarR06 = ((ProfileScreen) this.b.X).r0();
                            Long lI3 = cnbVarR06.O0.i();
                            if (lI3 != null) {
                                pnf.o(cnbVarR06.A0, new hkb(lI3.longValue(), ek2.MEMBER));
                                break;
                            }
                            break;
                    }
                }
            };
        } else if (cjbVar instanceof zib) {
            final int i7 = 5;
            olbVar = new View.OnClickListener(this) { // from class: mlb
                public final /* synthetic */ qlb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            cnb cnbVarR0 = ((ProfileScreen) this.b.X).r0();
                            j47.T(cnbVarR0.a, ((w9a) cnbVarR0.u()).a(), null, new smb(cnbVarR0, null), 2);
                            break;
                        case 1:
                            cnb cnbVarR02 = ((ProfileScreen) this.b.X).r0();
                            Long lI = cnbVarR02.O0.i();
                            if (lI != null) {
                                pnf.o(cnbVarR02.A0, new lkb(lI.longValue()));
                                break;
                            }
                            break;
                        case 2:
                            cnb cnbVarR03 = ((ProfileScreen) this.b.X).r0();
                            Long lI2 = cnbVarR03.O0.i();
                            if (lI2 != null) {
                                pnf.o(cnbVarR03.A0, new hkb(lI2.longValue(), ek2.ADMIN));
                                break;
                            }
                            break;
                        case 3:
                            cnb cnbVarR04 = ((ProfileScreen) this.b.X).r0();
                            vxd vxdVarT = j47.T(cnbVarR04.a, ((w9a) cnbVarR04.u()).b(), null, new lmb(cnbVarR04, null), 2);
                            cnbVarR04.C0.o1(cnbVarR04, cnb.S0[1], vxdVarT);
                            break;
                        case 4:
                            cnb cnbVarR05 = ((ProfileScreen) this.b.X).r0();
                            pnf.o(cnbVarR05.z0, new ylb((List) ((zcb) cnbVarR05.F0.getValue()).l.getValue()));
                            break;
                        default:
                            cnb cnbVarR06 = ((ProfileScreen) this.b.X).r0();
                            Long lI3 = cnbVarR06.O0.i();
                            if (lI3 != null) {
                                pnf.o(cnbVarR06.A0, new hkb(lI3.longValue(), ek2.MEMBER));
                                break;
                            }
                            break;
                    }
                }
            };
        } else {
            olbVar = cjbVar instanceof uib ? new olb(cjbVar, this) : cjbVar instanceof xib ? new olb(this, cjbVar) : null;
        }
        if (cjbVar instanceof ajb) {
            zl0Var = new zl0(8, this);
        } else {
            boolean z = cjbVar instanceof uib;
            zl0Var = null;
        }
        gmbVar.A(cjbVar);
        if ((cjbVar instanceof qib) || (cjbVar instanceof wib)) {
            gmbVar.F(this.Y);
        } else if (cjbVar instanceof pib) {
            decVar = gmbVar instanceof b42 ? (b42) gmbVar : null;
            if (decVar != null) {
                final int i8 = 0;
                ((z32) decVar.a).setOnShareLinkClickListener(new a42(0, new m56(this) { // from class: nlb
                    public final /* synthetic */ qlb b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.m56
                    public final Object invoke(Object obj) {
                        String str;
                        vlb vlbVar;
                        vlb vlbVarC;
                        switch (i8) {
                            case 0:
                                cnb cnbVarR0 = ((ProfileScreen) this.b.X).r0();
                                String strH = cnbVarR0.O0.h();
                                if (strH != null) {
                                    pnf.o(cnbVarR0.z0, new rlb(new gqe(yoc.i, ys.m0(new Object[]{strH}))));
                                }
                                return e5f.a;
                            default:
                                int iIntValue = ((Integer) obj).intValue();
                                ProfileScreen profileScreen = (ProfileScreen) this.b.X;
                                profileScreen.getClass();
                                if (iIntValue == wea.l) {
                                    profileScreen.r0().w(false);
                                } else if (iIntValue == wea.q1) {
                                    profileScreen.r0().w(true);
                                } else if (iIntValue == wea.m1) {
                                    cnb cnbVarR02 = profileScreen.r0();
                                    Long lI = cnbVarR02.O0.i();
                                    if (lI != null) {
                                        pnf.o(cnbVarR02.A0, new qkb(lI.longValue()));
                                    }
                                } else if (iIntValue == wea.W0) {
                                    cnb cnbVarR03 = profileScreen.r0();
                                    gcb gcbVar = (gcb) cnbVarR03.G0.getValue();
                                    gcbVar.getClass();
                                    eqe eqeVar = new eqe(yea.v2);
                                    kl7 kl7VarL = j1e.l();
                                    kl7VarL.add(new mg3(wea.S0, new eqe(yea.x2), 3, false));
                                    kl7VarL.add(new mg3(wea.T0, new eqe(yea.y2), 3, false));
                                    kl7VarL.add(new mg3(wea.R0, new eqe(yea.w2), 3, false));
                                    kl7VarL.add(new mg3(wea.U0, new eqe(yea.z2), 1, false));
                                    kl7VarL.add(gcbVar.b());
                                    pnf.o(cnbVarR03.z0, new vlb(eqeVar, null, j1e.d(kl7VarL), null));
                                } else if (iIntValue == wea.V0) {
                                    cnb cnbVarR04 = profileScreen.r0();
                                    Long lI2 = cnbVarR04.O0.i();
                                    if (lI2 != null) {
                                        ((jz2) cnbVarR04.t()).l().g0(lI2.longValue());
                                        pnf.o(cnbVarR04.z0, new zlb(new eqe(yea.B2), Integer.valueOf(woc.n)));
                                    }
                                } else if (iIntValue == wea.o1) {
                                    cnb cnbVarR05 = profileScreen.r0();
                                    j47.T(cnbVarR05.a, ((w9a) cnbVarR05.u()).a(), null, new wmb(cnbVarR05, null), 2);
                                } else if (iIntValue == wea.n1) {
                                    cnb cnbVarR06 = profileScreen.r0();
                                    j47.T(cnbVarR06.a, ((w9a) cnbVarR06.u()).b(), null, new zmb(cnbVarR06, null), 2);
                                } else if (iIntValue == wea.p1) {
                                    cnb cnbVarR07 = profileScreen.r0();
                                    j47.T(cnbVarR07.a, ((w9a) cnbVarR07.u()).b(), null, new bnb(cnbVarR07, null), 2);
                                } else if (iIntValue == wea.H0) {
                                    cnb cnbVarR08 = profileScreen.r0();
                                    Long lJ = cnbVarR08.O0.j();
                                    if (lJ != null) {
                                        pnf.o(cnbVarR08.A0, new ekb(lJ.longValue()));
                                    }
                                } else {
                                    if (iIntValue == wea.J0) {
                                        cnb cnbVarR09 = profileScreen.r0();
                                        pab pabVar = cnbVarR09.O0;
                                        pabVar.getClass();
                                        if (pabVar instanceof nq0) {
                                            cnbVarR09.q();
                                        } else {
                                            tab tabVar = (tab) cnbVarR09.M0.getValue();
                                            Object obj2 = tabVar != null ? tabVar.e : null;
                                            str = obj2 != null ? obj2 : "";
                                            int iK = pabVar.k();
                                            if (iK != 0) {
                                                gcb gcbVar2 = (gcb) cnbVarR09.G0.getValue();
                                                gcbVar2.getClass();
                                                int iS = au1.s(iK);
                                                if (iS == 0) {
                                                    gqe gqeVar = new gqe(yea.D0, ys.m0(new Object[]{str}));
                                                    kl7 kl7VarL2 = j1e.l();
                                                    kl7VarL2.add(new mg3(wea.x, new eqe(yea.z0), 1, false));
                                                    kl7VarL2.add(gcbVar2.b());
                                                    vlbVar = new vlb(gqeVar, null, j1e.d(kl7VarL2), null);
                                                } else if (iS == 1) {
                                                    eqe eqeVar2 = new eqe(yea.A0);
                                                    gqe gqeVar2 = new gqe(yea.C0, ys.m0(new Object[]{str}));
                                                    kl7 kl7VarL3 = j1e.l();
                                                    kl7VarL3.add(new mg3(wea.x, new eqe(yea.z0), 1, false));
                                                    kl7VarL3.add(gcbVar2.b());
                                                    vlbVar = new vlb(eqeVar2, gqeVar2, j1e.d(kl7VarL3), null);
                                                } else if (iS == 2) {
                                                    eqe eqeVar3 = new eqe(yea.y0);
                                                    eqe eqeVar4 = new eqe(yea.x0);
                                                    kl7 kl7VarL4 = j1e.l();
                                                    kl7VarL4.add(new mg3(wea.x, new eqe(yea.z0), 1, false));
                                                    kl7VarL4.add(gcbVar2.b());
                                                    vlbVar = new vlb(eqeVar3, eqeVar4, j1e.d(kl7VarL4), null);
                                                } else {
                                                    if (iS != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    vlbVarC = gcbVar2.c();
                                                    pnf.o(cnbVarR09.z0, vlbVarC);
                                                }
                                                vlbVarC = vlbVar;
                                                pnf.o(cnbVarR09.z0, vlbVarC);
                                            }
                                        }
                                    } else if (iIntValue == wea.P0) {
                                        cnb cnbVarR010 = profileScreen.r0();
                                        Long lI3 = cnbVarR010.O0.i();
                                        if (lI3 != null) {
                                            long jLongValue = lI3.longValue();
                                            ckb.c.getClass();
                                            pnf.o(cnbVarR010.A0, new c64(":complaint?chat_id=" + jLongValue));
                                        }
                                    } else if (iIntValue == wea.I0) {
                                        cnb cnbVarR011 = profileScreen.r0();
                                        tab tabVar2 = (tab) cnbVarR011.M0.getValue();
                                        Object obj3 = tabVar2 != null ? tabVar2.e : null;
                                        str = obj3 != null ? obj3 : "";
                                        gcb gcbVar3 = (gcb) cnbVarR011.G0.getValue();
                                        gcbVar3.getClass();
                                        gqe gqeVar3 = new gqe(yea.V, ys.m0(new Object[]{str}));
                                        eqe eqeVar5 = new eqe(yea.U);
                                        kl7 kl7VarL5 = j1e.l();
                                        kl7VarL5.add(new mg3(wea.m, new eqe(yea.T), 1, false));
                                        kl7VarL5.add(gcbVar3.b());
                                        pnf.o(cnbVarR011.z0, new vlb(gqeVar3, eqeVar5, j1e.d(kl7VarL5), null));
                                    } else {
                                        int i9 = wea.K0;
                                        if (iIntValue == i9) {
                                            profileScreen.r0().B();
                                        } else if (iIntValue == wea.Q0) {
                                            cnb cnbVarR012 = profileScreen.r0();
                                            cnbVarR012.getClass();
                                            pnf.o(cnbVarR012.z0, new ulb(new eqe(yea.H2), new imb(cnbVarR012, 1)));
                                        } else if (iIntValue == wea.M0) {
                                            profileScreen.r0().A();
                                        } else if (iIntValue == wea.L0 || iIntValue == i9) {
                                            pab pabVar2 = profileScreen.r0().O0;
                                            pabVar2.getClass();
                                            if (pabVar2 instanceof nq0) {
                                                profileScreen.r0().C(false);
                                            } else {
                                                profileScreen.r0().B();
                                            }
                                        } else if (iIntValue == wea.O0 || iIntValue == wea.N0) {
                                            cnb cnbVarR013 = profileScreen.r0();
                                            amb ambVarY = cnbVarR013.O0.y();
                                            if (ambVarY != null) {
                                                pnf.o(cnbVarR013.z0, ambVarY);
                                            }
                                        }
                                    }
                                }
                                return e5f.a;
                        }
                    }
                }));
            }
        } else if (cjbVar instanceof kib) {
            decVar = gmbVar instanceof p7a ? (p7a) gmbVar : null;
            if (decVar != null) {
                final int i9 = 1;
                ((o7a) decVar.a).setListener(new wp(5, new m56(this) { // from class: nlb
                    public final /* synthetic */ qlb b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.m56
                    public final Object invoke(Object obj) {
                        String str;
                        vlb vlbVar;
                        vlb vlbVarC;
                        switch (i9) {
                            case 0:
                                cnb cnbVarR0 = ((ProfileScreen) this.b.X).r0();
                                String strH = cnbVarR0.O0.h();
                                if (strH != null) {
                                    pnf.o(cnbVarR0.z0, new rlb(new gqe(yoc.i, ys.m0(new Object[]{strH}))));
                                }
                                return e5f.a;
                            default:
                                int iIntValue = ((Integer) obj).intValue();
                                ProfileScreen profileScreen = (ProfileScreen) this.b.X;
                                profileScreen.getClass();
                                if (iIntValue == wea.l) {
                                    profileScreen.r0().w(false);
                                } else if (iIntValue == wea.q1) {
                                    profileScreen.r0().w(true);
                                } else if (iIntValue == wea.m1) {
                                    cnb cnbVarR02 = profileScreen.r0();
                                    Long lI = cnbVarR02.O0.i();
                                    if (lI != null) {
                                        pnf.o(cnbVarR02.A0, new qkb(lI.longValue()));
                                    }
                                } else if (iIntValue == wea.W0) {
                                    cnb cnbVarR03 = profileScreen.r0();
                                    gcb gcbVar = (gcb) cnbVarR03.G0.getValue();
                                    gcbVar.getClass();
                                    eqe eqeVar = new eqe(yea.v2);
                                    kl7 kl7VarL = j1e.l();
                                    kl7VarL.add(new mg3(wea.S0, new eqe(yea.x2), 3, false));
                                    kl7VarL.add(new mg3(wea.T0, new eqe(yea.y2), 3, false));
                                    kl7VarL.add(new mg3(wea.R0, new eqe(yea.w2), 3, false));
                                    kl7VarL.add(new mg3(wea.U0, new eqe(yea.z2), 1, false));
                                    kl7VarL.add(gcbVar.b());
                                    pnf.o(cnbVarR03.z0, new vlb(eqeVar, null, j1e.d(kl7VarL), null));
                                } else if (iIntValue == wea.V0) {
                                    cnb cnbVarR04 = profileScreen.r0();
                                    Long lI2 = cnbVarR04.O0.i();
                                    if (lI2 != null) {
                                        ((jz2) cnbVarR04.t()).l().g0(lI2.longValue());
                                        pnf.o(cnbVarR04.z0, new zlb(new eqe(yea.B2), Integer.valueOf(woc.n)));
                                    }
                                } else if (iIntValue == wea.o1) {
                                    cnb cnbVarR05 = profileScreen.r0();
                                    j47.T(cnbVarR05.a, ((w9a) cnbVarR05.u()).a(), null, new wmb(cnbVarR05, null), 2);
                                } else if (iIntValue == wea.n1) {
                                    cnb cnbVarR06 = profileScreen.r0();
                                    j47.T(cnbVarR06.a, ((w9a) cnbVarR06.u()).b(), null, new zmb(cnbVarR06, null), 2);
                                } else if (iIntValue == wea.p1) {
                                    cnb cnbVarR07 = profileScreen.r0();
                                    j47.T(cnbVarR07.a, ((w9a) cnbVarR07.u()).b(), null, new bnb(cnbVarR07, null), 2);
                                } else if (iIntValue == wea.H0) {
                                    cnb cnbVarR08 = profileScreen.r0();
                                    Long lJ = cnbVarR08.O0.j();
                                    if (lJ != null) {
                                        pnf.o(cnbVarR08.A0, new ekb(lJ.longValue()));
                                    }
                                } else {
                                    if (iIntValue == wea.J0) {
                                        cnb cnbVarR09 = profileScreen.r0();
                                        pab pabVar = cnbVarR09.O0;
                                        pabVar.getClass();
                                        if (pabVar instanceof nq0) {
                                            cnbVarR09.q();
                                        } else {
                                            tab tabVar = (tab) cnbVarR09.M0.getValue();
                                            Object obj2 = tabVar != null ? tabVar.e : null;
                                            str = obj2 != null ? obj2 : "";
                                            int iK = pabVar.k();
                                            if (iK != 0) {
                                                gcb gcbVar2 = (gcb) cnbVarR09.G0.getValue();
                                                gcbVar2.getClass();
                                                int iS = au1.s(iK);
                                                if (iS == 0) {
                                                    gqe gqeVar = new gqe(yea.D0, ys.m0(new Object[]{str}));
                                                    kl7 kl7VarL2 = j1e.l();
                                                    kl7VarL2.add(new mg3(wea.x, new eqe(yea.z0), 1, false));
                                                    kl7VarL2.add(gcbVar2.b());
                                                    vlbVar = new vlb(gqeVar, null, j1e.d(kl7VarL2), null);
                                                } else if (iS == 1) {
                                                    eqe eqeVar2 = new eqe(yea.A0);
                                                    gqe gqeVar2 = new gqe(yea.C0, ys.m0(new Object[]{str}));
                                                    kl7 kl7VarL3 = j1e.l();
                                                    kl7VarL3.add(new mg3(wea.x, new eqe(yea.z0), 1, false));
                                                    kl7VarL3.add(gcbVar2.b());
                                                    vlbVar = new vlb(eqeVar2, gqeVar2, j1e.d(kl7VarL3), null);
                                                } else if (iS == 2) {
                                                    eqe eqeVar3 = new eqe(yea.y0);
                                                    eqe eqeVar4 = new eqe(yea.x0);
                                                    kl7 kl7VarL4 = j1e.l();
                                                    kl7VarL4.add(new mg3(wea.x, new eqe(yea.z0), 1, false));
                                                    kl7VarL4.add(gcbVar2.b());
                                                    vlbVar = new vlb(eqeVar3, eqeVar4, j1e.d(kl7VarL4), null);
                                                } else {
                                                    if (iS != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    vlbVarC = gcbVar2.c();
                                                    pnf.o(cnbVarR09.z0, vlbVarC);
                                                }
                                                vlbVarC = vlbVar;
                                                pnf.o(cnbVarR09.z0, vlbVarC);
                                            }
                                        }
                                    } else if (iIntValue == wea.P0) {
                                        cnb cnbVarR010 = profileScreen.r0();
                                        Long lI3 = cnbVarR010.O0.i();
                                        if (lI3 != null) {
                                            long jLongValue = lI3.longValue();
                                            ckb.c.getClass();
                                            pnf.o(cnbVarR010.A0, new c64(":complaint?chat_id=" + jLongValue));
                                        }
                                    } else if (iIntValue == wea.I0) {
                                        cnb cnbVarR011 = profileScreen.r0();
                                        tab tabVar2 = (tab) cnbVarR011.M0.getValue();
                                        Object obj3 = tabVar2 != null ? tabVar2.e : null;
                                        str = obj3 != null ? obj3 : "";
                                        gcb gcbVar3 = (gcb) cnbVarR011.G0.getValue();
                                        gcbVar3.getClass();
                                        gqe gqeVar3 = new gqe(yea.V, ys.m0(new Object[]{str}));
                                        eqe eqeVar5 = new eqe(yea.U);
                                        kl7 kl7VarL5 = j1e.l();
                                        kl7VarL5.add(new mg3(wea.m, new eqe(yea.T), 1, false));
                                        kl7VarL5.add(gcbVar3.b());
                                        pnf.o(cnbVarR011.z0, new vlb(gqeVar3, eqeVar5, j1e.d(kl7VarL5), null));
                                    } else {
                                        int i92 = wea.K0;
                                        if (iIntValue == i92) {
                                            profileScreen.r0().B();
                                        } else if (iIntValue == wea.Q0) {
                                            cnb cnbVarR012 = profileScreen.r0();
                                            cnbVarR012.getClass();
                                            pnf.o(cnbVarR012.z0, new ulb(new eqe(yea.H2), new imb(cnbVarR012, 1)));
                                        } else if (iIntValue == wea.M0) {
                                            profileScreen.r0().A();
                                        } else if (iIntValue == wea.L0 || iIntValue == i92) {
                                            pab pabVar2 = profileScreen.r0().O0;
                                            pabVar2.getClass();
                                            if (pabVar2 instanceof nq0) {
                                                profileScreen.r0().C(false);
                                            } else {
                                                profileScreen.r0().B();
                                            }
                                        } else if (iIntValue == wea.O0 || iIntValue == wea.N0) {
                                            cnb cnbVarR013 = profileScreen.r0();
                                            amb ambVarY = cnbVarR013.O0.y();
                                            if (ambVarY != null) {
                                                pnf.o(cnbVarR013.z0, ambVarY);
                                            }
                                        }
                                    }
                                }
                                return e5f.a;
                        }
                    }
                }));
            }
        }
        if (olbVar != null) {
            gmbVar.G(olbVar);
        }
        if (zl0Var != null) {
            gmbVar.H(zl0Var);
        }
    }

    @Override // defpackage.ppd, defpackage.hdc
    public final int l(int i) {
        return ((cjb) ((ol7) C(i))).getI0();
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (lz7.i(i2, 1)) {
            o7a o7aVar = new o7a(viewGroup.getContext());
            p7a p7aVar = new p7a(o7aVar);
            o7aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return p7aVar;
        }
        if (lz7.i(i2, 2)) {
            OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), null);
            p20 p20Var = new p20(oneMeButton, 6);
            oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return p20Var;
        }
        if (lz7.i(i2, 4)) {
            return new p20(viewGroup.getContext());
        }
        if (lz7.i(i2, 65536)) {
            return new p20(new eq3(viewGroup.getContext()), 3);
        }
        if (lz7.i(i2, 8)) {
            return new p20(new en2(viewGroup.getContext()), 1);
        }
        if (lz7.i(i2, 16)) {
            ufd ufdVar = new ufd(viewGroup.getContext(), null);
            p20 p20Var2 = new p20(ufdVar, 7);
            ufdVar.setId(wea.c1);
            return p20Var2;
        }
        if (lz7.i(i2, 4096)) {
            TextView textView = new TextView(viewGroup.getContext());
            p20 p20Var3 = new p20(textView, 4);
            p20Var3.E();
            textView.setId(wea.z);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            textView.setGravity(16);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            i4f.l.b(textView, du4.b);
            v3c.y(new v9(3, null, 11), textView);
            return p20Var3;
        }
        if (lz7.i(i2, 32)) {
            TextView textView2 = new TextView(viewGroup.getContext());
            p20 p20Var4 = new p20(textView2, 5);
            p20Var4.E();
            textView2.setId(wea.T);
            textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            textView2.setTextAlignment(5);
            textView2.setMaxLines(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            i4f.l.b(textView2, du4.b);
            Drawable drawableB = kt3.b(textView2.getContext(), woc.V1);
            float f = 20;
            drawableB.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
            textView2.setCompoundDrawablePadding(tu0.G(4 * fk4.d().getDisplayMetrics().density));
            textView2.setCompoundDrawablesRelative(null, null, drawableB, null);
            v3c.y(new c3(drawableB, null, 14), textView2);
            return p20Var4;
        }
        if (lz7.i(i2, 32768)) {
            return new b42(new z32(viewGroup.getContext()));
        }
        if (lz7.i(i2, 64)) {
            return new cc(viewGroup.getContext(), 0);
        }
        if (lz7.i(i2, 256)) {
            ufd ufdVar2 = new ufd(viewGroup.getContext(), null);
            p20 p20Var5 = new p20(ufdVar2, 0);
            ufdVar2.setModelItem(new vfd(256, 0, new eqe(yea.i), null, new eqe(yea.j), Integer.valueOf(woc.i1), cfd.a, null, null, 0, null, 1800));
            return p20Var5;
        }
        if (lz7.i(i2, 128)) {
            return new cc(viewGroup.getContext(), 1);
        }
        if (lz7.i(i2, 512)) {
            lk3 lk3Var = new lk3(viewGroup.getContext(), null);
            p20 p20Var6 = new p20(lk3Var, 2);
            v3c.y(new a93(3, null, 0), lk3Var);
            return p20Var6;
        }
        if (lz7.i(i2, 2048)) {
            return new cc(viewGroup.getContext(), 2);
        }
        if (lz7.i(i2, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) {
            amd amdVar = new amd(viewGroup.getContext());
            amdVar.setShimmerBackground(zld.a);
            return new p20(amdVar, 9);
        }
        throw new IllegalStateException(("unknown item view type " + i + "}").toString());
    }
}
