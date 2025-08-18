package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class zv2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ gw2 Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv2(int i, gw2 gw2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = gw2Var;
        this.s0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zv2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zv2(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i;
        uj3 uj3VarL;
        tx3 tx3Var = tx3.a;
        int i2 = this.X;
        e5f e5fVar = e5f.a;
        if (i2 == 0) {
            od2.a0(obj);
            int i3 = uvb.oneme_chat_action_add_to_folder;
            gw2 gw2Var = this.Z;
            long j = this.s0;
            int i4 = this.Y;
            if (i4 == i3 || i4 == (i = uvb.oneme_chat_action_remove_from_folder)) {
                bc7[] bc7VarArr = gw2.Q0;
                e52 e52Var = (e52) ((jz2) gw2Var.s()).m(j).a.getValue();
                if (e52Var == null) {
                    return e5fVar;
                }
                pnf.o(gw2Var.H0, new vla(e52Var.b.a));
            } else if (i4 == i) {
                pnf.o(gw2Var.H0, new vla(j));
            } else if (i4 == uvb.oneme_chat_action_delete_channel) {
                bc7[] bc7VarArr2 = gw2.Q0;
                e52 e52Var2 = (e52) ((jz2) gw2Var.s()).m(j).a.getValue();
                if (e52Var2 == null) {
                    return e5fVar;
                }
                pnf.o(gw2Var.I0, e52Var2.c() ? h52.d(e52Var2) : h52.e(e52Var2));
            } else if (i4 == uvb.oneme_chat_action_delete_chat) {
                bc7[] bc7VarArr3 = gw2.Q0;
                e52 e52Var3 = (e52) ((jz2) gw2Var.s()).m(j).a.getValue();
                if (e52Var3 == null) {
                    return e5fVar;
                }
                pnf.o(gw2Var.I0, e52Var3.M() ? h52.g(e52Var3) : e52Var3.c() ? h52.f(e52Var3) : h52.e(e52Var3));
            } else if (i4 == uvb.oneme_chat_action_leave) {
                bc7[] bc7VarArr4 = gw2.Q0;
                e52 e52Var4 = (e52) ((jz2) gw2Var.s()).m(j).a.getValue();
                if (e52Var4 == null) {
                    return e5fVar;
                }
                pnf.o(gw2Var.I0, e52Var4.c() ? e52Var4.I() ? h52.i(e52Var4) : h52.k(e52Var4) : e52Var4.I() ? h52.h(e52Var4) : h52.j(e52Var4));
            } else if (i4 == uvb.oneme_chat_action_close_chat) {
                pnf.o(gw2Var.I0, h52.c(j));
            } else if (i4 == uvb.oneme_chat_action_close_channel) {
                pnf.o(gw2Var.I0, h52.b(j));
            } else if (i4 == uvb.oneme_chat_action_block) {
                bc7[] bc7VarArr5 = gw2.Q0;
                e52 e52Var5 = (e52) ((jz2) gw2Var.s()).m(j).a.getValue();
                if ((e52Var5 != null ? e52Var5.l() : null) != null) {
                    pnf.o(gw2Var.I0, h52.a(e52Var5));
                }
            } else if (i4 == uvb.oneme_chat_action_add_favorite) {
                bc7[] bc7VarArr6 = gw2.Q0;
                qyc qycVar = (qyc) ((y7d) gw2Var.u0.getValue());
                qycVar.getClass();
                int iQ = (int) qycVar.q(PmsKey.f67maxfavoritechats, 5);
                int iG = ((jz2) gw2Var.s()).l().G();
                s35 s35Var = gw2Var.I0;
                if (iG < iQ) {
                    p82 p82VarL = ((jz2) gw2Var.s()).l();
                    p82VarL.getClass();
                    hm9.n("p82", "addToFavorites: " + j);
                    p82VarL.Z(j, System.currentTimeMillis(), true);
                    pnf.o(s35Var, new exc());
                } else {
                    pnf.o(s35Var, new rnd(new gqe(jpc.b0, ys.m0(new Object[]{new Integer(iQ)}))));
                }
            } else if (i4 == uvb.oneme_chat_action_remove_favorite) {
                bc7[] bc7VarArr7 = gw2.Q0;
                ((jz2) gw2Var.s()).l().V(j, true);
            } else if (i4 == uvb.oneme_chat_action_mark_as_unread) {
                bc7[] bc7VarArr8 = gw2.Q0;
                e52 e52Var6 = (e52) ((jz2) gw2Var.s()).m(j).a.getValue();
                if (e52Var6 == null) {
                    return e5fVar;
                }
                p7c p7cVar = (p7c) gw2Var.z0.getValue();
                e52 e52VarZ = p7cVar.a().z(e52Var6.b.a);
                if (e52VarZ != null) {
                    p7cVar.c(e52VarZ);
                }
            } else if (i4 == uvb.oneme_chat_action_mark_as_read) {
                bc7[] bc7VarArr9 = gw2.Q0;
                e52 e52Var7 = (e52) ((jz2) gw2Var.s()).m(j).a.getValue();
                if (e52Var7 == null) {
                    return e5fVar;
                }
                ((p7c) gw2Var.z0.getValue()).b(e52Var7);
            } else if (i4 == uvb.oneme_chat_action_unmute) {
                bc7[] bc7VarArr10 = gw2.Q0;
                ((jz2) gw2Var.s()).l().g0(j);
            } else if (i4 == uvb.oneme_chat_action_mute) {
                bc7[] bc7VarArr11 = gw2.Q0;
                e52 e52Var8 = (e52) ((jz2) gw2Var.s()).m(j).a.getValue();
                if (e52Var8 == null) {
                    return e5fVar;
                }
                pnf.o(gw2Var.I0, h52.l(e52Var8));
            } else if (i4 == uvb.oneme_chat_action_select) {
                pnf.o(gw2Var.I0, h52.m());
            } else if (i4 == uvb.oneme_chat_action_move_rights_and_leave) {
                bc7[] bc7VarArr12 = gw2.Q0;
                e52 e52Var9 = (e52) ((jz2) gw2Var.s()).m(j).a.getValue();
                if (e52Var9 == null) {
                    return e5fVar;
                }
                boolean zI = e52Var9.I();
                s35 s35Var2 = gw2Var.H0;
                if (zI) {
                    pnf.o(s35Var2, new yc9(j));
                } else {
                    gy2.c.getClass();
                    wg0.k(":profile/change-owner?chat_id=" + j + "&leave_chat=true", s35Var2);
                }
            } else {
                int i5 = uvb.oneme_confirm_delete;
                long j2 = this.s0;
                if (i4 == i5 || i4 == uvb.oneme_confirm_delete_for_all) {
                    zfc.a((zfc) gw2Var.s0.getValue(), j2);
                } else if (i4 == uvb.oneme_confirm_leave) {
                    bc7[] bc7VarArr13 = gw2.Q0;
                    ((jz2) gw2Var.s()).l().Q(j);
                } else if (i4 == uvb.oneme_confirm_block) {
                    bc7[] bc7VarArr14 = gw2.Q0;
                    e52 e52Var10 = (e52) ((jz2) gw2Var.s()).m(j).a.getValue();
                    if (e52Var10 == null || (uj3VarL = e52Var10.l()) == null) {
                        return e5fVar;
                    }
                    ck3 ck3Var = (ck3) gw2Var.A0.getValue();
                    long jN = uj3VarL.n();
                    this.X = 1;
                    ck3Var.a(jN);
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                } else if (i4 == uvb.oneme_confirm_mute_1_hour) {
                    int i6 = ft4.o;
                    long jR = z7.R(1, kt4.HOURS);
                    this.X = 2;
                    gw2.q(gw2Var, j2, jR);
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                } else if (i4 == uvb.oneme_confirm_mute_4_hour) {
                    int i7 = ft4.o;
                    long jR2 = z7.R(4, kt4.HOURS);
                    this.X = 3;
                    gw2.q(gw2Var, j2, jR2);
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                } else if (i4 == uvb.oneme_confirm_mute_1_day) {
                    int i8 = ft4.o;
                    long jR3 = z7.R(1, kt4.DAYS);
                    this.X = 4;
                    gw2.q(gw2Var, j2, jR3);
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                } else if (i4 == uvb.oneme_confirm_mute_infinite) {
                    this.X = 5;
                    bc7[] bc7VarArr15 = gw2.Q0;
                    p82 p82VarL2 = ((jz2) gw2Var.s()).l();
                    e52 e52VarC = p82VarL2.C(j);
                    if (e52VarC != null) {
                        p82VarL2.l(-1L, e52VarC);
                        ((k4a) ((pk) p82VarL2.p.get())).r(e52VarC.a);
                    }
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                }
            }
        } else {
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
