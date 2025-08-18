package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class mw2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ nx2 Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw2(int i, nx2 nx2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = nx2Var;
        this.s0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((mw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new mw2(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i;
        uj3 uj3VarL;
        int i2 = 1;
        int i3 = 2;
        tx3 tx3Var = tx3.a;
        int i4 = this.X;
        e5f e5fVar = e5f.a;
        if (i4 == 0) {
            od2.a0(obj);
            int i5 = uvb.oneme_chat_action_add_to_folder;
            nx2 nx2Var = this.Z;
            long j = this.s0;
            int i6 = this.Y;
            if (i6 == i5 || i6 == (i = uvb.oneme_chat_action_remove_from_folder)) {
                e52 e52Var = (e52) ((jz2) nx2.r(nx2Var)).m(j).a.getValue();
                if (e52Var == null) {
                    return e5fVar;
                }
                pnf.o(nx2Var.O0, new vla(e52Var.b.a));
            } else if (i6 == i) {
                pnf.o(nx2Var.O0, new vla(j));
            } else if (i6 == uvb.oneme_chat_action_delete_channel) {
                e52 e52Var2 = (e52) ((jz2) nx2.r(nx2Var)).m(j).a.getValue();
                if (e52Var2 == null) {
                    return e5fVar;
                }
                pnf.o(nx2Var.P0, e52Var2.c() ? h52.d(e52Var2) : h52.e(e52Var2));
            } else if (i6 == uvb.oneme_chat_action_delete_chat) {
                e52 e52Var3 = (e52) ((jz2) nx2.r(nx2Var)).m(j).a.getValue();
                if (e52Var3 == null) {
                    return e5fVar;
                }
                pnf.o(nx2Var.P0, e52Var3.M() ? h52.g(e52Var3) : e52Var3.c() ? h52.f(e52Var3) : h52.e(e52Var3));
            } else if (i6 == uvb.oneme_chat_action_leave) {
                e52 e52Var4 = (e52) ((jz2) nx2.r(nx2Var)).m(j).a.getValue();
                if (e52Var4 == null) {
                    return e5fVar;
                }
                pnf.o(nx2Var.P0, e52Var4.c() ? e52Var4.I() ? h52.i(e52Var4) : h52.k(e52Var4) : e52Var4.I() ? h52.h(e52Var4) : h52.j(e52Var4));
            } else if (i6 == uvb.oneme_chat_action_close_chat) {
                pnf.o(nx2Var.P0, h52.c(j));
            } else if (i6 == uvb.oneme_chat_action_close_channel) {
                pnf.o(nx2Var.P0, h52.b(j));
            } else if (i6 == uvb.oneme_chat_action_block) {
                e52 e52Var5 = (e52) ((jz2) nx2.r(nx2Var)).m(j).a.getValue();
                if ((e52Var5 != null ? e52Var5.l() : null) != null) {
                    pnf.o(nx2Var.P0, h52.a(e52Var5));
                }
            } else if (i6 == uvb.oneme_chat_action_add_favorite) {
                bc7[] bc7VarArr = nx2.X0;
                qyc qycVar = (qyc) ((y7d) nx2Var.t0.getValue());
                qycVar.getClass();
                int iQ = (int) qycVar.q(PmsKey.f67maxfavoritechats, 5);
                int iG = ((jz2) ((iy2) nx2Var.u0.getValue())).l().G();
                s35 s35Var = nx2Var.P0;
                if (iG < iQ) {
                    p82 p82VarT = nx2Var.t();
                    p82VarT.getClass();
                    hm9.n("p82", "addToFavorites: " + j);
                    p82VarT.Z(j, System.currentTimeMillis(), true);
                    pnf.o(s35Var, new exc());
                } else {
                    pnf.o(s35Var, new rnd(new gqe(jpc.b0, ys.m0(new Object[]{new Integer(iQ)}))));
                }
            } else if (i6 == uvb.oneme_chat_action_remove_favorite) {
                bc7[] bc7VarArr2 = nx2.X0;
                nx2Var.t().V(j, true);
            } else if (i6 == uvb.oneme_chat_action_mark_as_unread) {
                e52 e52Var6 = (e52) ((jz2) nx2.r(nx2Var)).m(j).a.getValue();
                if (e52Var6 != null) {
                    ((p7c) nx2Var.z0.getValue()).c(e52Var6);
                }
            } else if (i6 == uvb.oneme_chat_action_mark_as_read) {
                e52 e52Var7 = (e52) ((jz2) nx2.r(nx2Var)).m(j).a.getValue();
                if (e52Var7 == null) {
                    return e5fVar;
                }
                ((p7c) nx2Var.z0.getValue()).b(e52Var7);
            } else if (i6 == uvb.oneme_chat_action_unmute) {
                bc7[] bc7VarArr3 = nx2.X0;
                nx2Var.t().g0(j);
            } else if (i6 == uvb.oneme_chat_action_mute) {
                e52 e52Var8 = (e52) ((jz2) nx2.r(nx2Var)).m(j).a.getValue();
                if (e52Var8 == null) {
                    return e5fVar;
                }
                pnf.o(nx2Var.P0, h52.l(e52Var8));
            } else if (i6 == uvb.oneme_chat_action_select) {
                pnf.o(nx2Var.P0, h52.m());
            } else if (i6 == xoc.a) {
                s35 s35Var2 = nx2Var.O0;
                gy2.c.getClass();
                wg0.k(":complaint?chat_id=" + j, s35Var2);
            } else if (i6 == uvb.oneme_chat_action_clear_chat_history) {
                pnf.o(nx2Var.P0, new cnd(new eqe(r8a.g), new hw2(nx2Var, j, i3)));
            } else if (i6 == uvb.oneme_chat_action_suspend_bot) {
                bc7[] bc7VarArr4 = nx2.X0;
                nx2Var.getClass();
                pnf.o(nx2Var.P0, new cnd(new eqe(r8a.t), new hw2(nx2Var, j, 0)));
            } else if (i6 == uvb.oneme_chat_action_suspend_and_delete_bot) {
                bc7[] bc7VarArr5 = nx2.X0;
                nx2Var.getClass();
                pnf.o(nx2Var.P0, new cnd(new eqe(r8a.s), new hw2(nx2Var, j, i2)));
            } else if (i6 == uvb.oneme_chat_action_move_rights_and_leave) {
                e52 e52Var9 = (e52) ((jz2) nx2.r(nx2Var)).m(j).a.getValue();
                if (e52Var9 == null) {
                    return e5fVar;
                }
                boolean zI = e52Var9.I();
                s35 s35Var3 = nx2Var.O0;
                if (zI) {
                    pnf.o(s35Var3, new yc9(j));
                } else {
                    gy2.c.getClass();
                    wg0.k(":profile/change-owner?chat_id=" + j + "&leave_chat=true", s35Var3);
                }
            } else {
                int i7 = uvb.oneme_confirm_delete;
                long j2 = this.s0;
                if (i6 == i7 || i6 == uvb.oneme_confirm_delete_for_all) {
                    bc7[] bc7VarArr6 = nx2.X0;
                    zfc.a((zfc) nx2Var.Z.getValue(), j2);
                } else if (i6 == uvb.oneme_confirm_leave) {
                    bc7[] bc7VarArr7 = nx2.X0;
                    nx2Var.t().Q(j);
                } else if (i6 == uvb.oneme_confirm_block) {
                    e52 e52Var10 = (e52) ((jz2) nx2.r(nx2Var)).m(j).a.getValue();
                    if (e52Var10 == null || (uj3VarL = e52Var10.l()) == null) {
                        return e5fVar;
                    }
                    pnf.o(nx2Var.P0, new cnd(new eqe(r8a.F), new ga(nx2Var, 6, uj3VarL)));
                    ck3 ck3Var = (ck3) nx2Var.w0.getValue();
                    long jN = uj3VarL.n();
                    this.X = 1;
                    ck3Var.a(jN);
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                } else if (i6 == uvb.oneme_confirm_mute_1_hour) {
                    int i8 = ft4.o;
                    long jR = z7.R(1, kt4.HOURS);
                    this.X = 2;
                    nx2.s(nx2Var, j2, jR);
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                } else if (i6 == uvb.oneme_confirm_mute_4_hour) {
                    int i9 = ft4.o;
                    long jR2 = z7.R(4, kt4.HOURS);
                    this.X = 3;
                    nx2.s(nx2Var, j2, jR2);
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                } else if (i6 == uvb.oneme_confirm_mute_1_day) {
                    int i10 = ft4.o;
                    long jR3 = z7.R(1, kt4.DAYS);
                    this.X = 4;
                    nx2.s(nx2Var, j2, jR3);
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                } else if (i6 == uvb.oneme_confirm_mute_infinite) {
                    this.X = 5;
                    bc7[] bc7VarArr8 = nx2.X0;
                    p82 p82VarT2 = nx2Var.t();
                    e52 e52VarC = p82VarT2.C(j);
                    if (e52VarC != null) {
                        p82VarT2.l(-1L, e52VarC);
                        ((k4a) ((pk) p82VarT2.p.get())).r(e52VarC.a);
                    }
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                } else if (i6 == uvb.oneme_chat_action_clear_saved_messages) {
                    pnf.o(nx2Var.P0, new d33());
                }
            }
        } else {
            if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
