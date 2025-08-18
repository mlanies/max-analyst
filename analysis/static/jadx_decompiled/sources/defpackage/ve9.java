package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public final class ve9 extends ol implements lme, hua {
    public static final /* synthetic */ int y0 = 0;
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final vx8 s0;
    public final List t0;
    public final List u0;
    public final boolean v0;
    public final String w0;
    public final String x0;

    public ve9(long j, long j2, long j3, long j4, long j5, String str, String str2, vx8 vx8Var, List list, List list2, boolean z) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.s0 = vx8Var;
        this.t0 = list;
        this.u0 = list2;
        this.v0 = z;
        this.w0 = str == null ? "" : str;
        this.x0 = str2 != null ? str2 : "";
    }

    @Override // defpackage.hua
    public final int c() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        au8 au8VarD = plVar.d();
        long j = this.X;
        cu8 cu8VarQ = au8VarD.q(j);
        pl plVar2 = this.c;
        if (plVar2 == null) {
            plVar2 = null;
        }
        p82 p82VarC = plVar2.c();
        long j2 = this.o;
        e52 e52VarC = p82VarC.C(j2);
        pl plVar3 = this.c;
        if (plVar3 == null) {
            plVar3 = null;
        }
        eoe eoeVarE = plVar3.e();
        iua iuaVar = iua.u0;
        long j3 = this.a;
        Iterator it = eoeVarE.h(j3, iuaVar).iterator();
        while (it.hasNext()) {
            ve9 ve9Var = (ve9) ((une) it.next()).f;
            if (ve9Var.o == j2 && ve9Var.X == j) {
                hm9.n("ve9", "onPreExecute: later edit task found, REMOVE");
                return 3;
            }
        }
        if (cu8VarQ != null) {
            if (cu8VarQ.v0 != vx8.DELETED && e52VarC != null && (e52VarC.C() || e52VarC.R())) {
                long j4 = this.Z;
                if (j4 == 0) {
                    hm9.n("ve9", "onPreExecute: message serverId == 0, REMOVE");
                    return 3;
                }
                k8g k8gVar = cu8VarQ.z0;
                String str = "onPreExecute: attaches not ready, SKIP";
                boolean z = this.v0;
                if (z && cu8VarQ.m(g20.c)) {
                    List<l20> list = k8gVar != null ? (List) k8gVar.a : null;
                    if (list == null) {
                        list = nz4.a;
                    }
                    for (l20 l20Var : list) {
                        if (l20Var.f()) {
                            x10 x10Var = l20Var.b;
                            String str2 = str;
                            if (x10Var.s0 != 0 && oag.t(x10Var.Z)) {
                                pl plVar4 = this.c;
                                if (plVar4 == null) {
                                    plVar4 = null;
                                }
                                if (plVar4.e().j(j3).c > 20) {
                                    hm9.n("ve9", "onPreExecute: taskDb.failsCount > 20, REMOVE");
                                    d();
                                    return 3;
                                }
                                pl plVar5 = this.c;
                                if (plVar5 == null) {
                                    plVar5 = null;
                                }
                                ((k4a) plVar5.a()).D(this.Y, Collections.singletonList(Long.valueOf(j4)));
                                pl plVar6 = this.c;
                                (plVar6 != null ? plVar6 : null).e().c(j3);
                                hm9.n("ve9", str2);
                                return 2;
                            }
                            str = str2;
                        }
                    }
                }
                String str3 = str;
                if (z) {
                    if (!((!cu8VarQ.p() && cu8VarQ.n()) ? t20.a(k8gVar) : true)) {
                        hm9.n("ve9", str3);
                        return 2;
                    }
                }
                return 1;
            }
        }
        hm9.n("ve9", "onPreExecute: message or chat not found, REMOVE");
        return 3;
    }

    @Override // defpackage.hua
    public final void d() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.e().d(this.a);
        pl plVar2 = this.c;
        if (plVar2 == null) {
            plVar2 = null;
        }
        cu8 cu8VarQ = plVar2.d().q(this.X);
        if (cu8VarQ != null) {
            pl plVar3 = this.c;
            if (plVar3 == null) {
                plVar3 = null;
            }
            plVar3.d().x(cu8VarQ, iu8.Y);
            pl plVar4 = this.c;
            ((bv4) (plVar4 != null ? plVar4 : null).E.getValue()).a(this.X, this.o, this.x0, this.u0, this.s0, this.t0, this.v0);
        }
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        fs8 fs8Var;
        we9 we9Var = (we9) gleVar;
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        au8 au8VarD = plVar.d();
        long j = this.X;
        cu8 cu8VarQ = au8VarD.q(j);
        if (cu8VarQ != null) {
            if (cu8VarQ.v0 == vx8.DELETED || (fs8Var = we9Var.c) == null) {
                return;
            }
            pl plVar2 = this.c;
            if (plVar2 == null) {
                plVar2 = null;
            }
            au8 au8VarD2 = plVar2.d();
            ((OneMeRoomDatabase) ((k24) au8VarD2.a).c.a.m()).p(new dlc(1, new bp(au8VarD2, fs8Var, cu8VarQ, this, 4)));
            pl plVar3 = this.c;
            if (plVar3 == null) {
                plVar3 = null;
            }
            p82 p82VarC = plVar3.c();
            long j2 = this.o;
            e52 e52VarC = p82VarC.C(j2);
            if (cu8VarQ.U0.b() && e52VarC != null && e52VarC.b.j == j) {
                pl plVar4 = this.c;
                if (plVar4 == null) {
                    plVar4 = null;
                }
                plVar4.c().w(j2);
            }
            pl plVar5 = this.c;
            (plVar5 != null ? plVar5 : null).b().c(new l6f(this.o, cu8VarQ.b, 0));
        }
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.MsgEdit msgEdit = new Tasks.MsgEdit();
        msgEdit.requestId = this.a;
        msgEdit.chatId = this.o;
        msgEdit.messageId = this.X;
        msgEdit.chatServerId = this.Y;
        msgEdit.messageServerId = this.Z;
        msgEdit.text = this.w0;
        msgEdit.oldText = this.x0;
        msgEdit.oldStatus = this.s0.a;
        msgEdit.editAttaches = this.v0;
        List list = this.t0;
        if (list != null) {
            m20 m20Var = new m20();
            m20Var.a = list;
            msgEdit.oldAttaches = b.f(m20Var.c());
        }
        List list2 = this.u0;
        if (list2 != null) {
            msgEdit.oldElements = ou8.c(list2);
        }
        return qw8.toByteArray(msgEdit);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        cu8 cu8VarQ = plVar.d().q(this.X);
        if (cu8VarQ != null) {
            if (cu8VarQ.v0 == vx8.DELETED) {
                return;
            }
            String str = pkeVar.b;
            if (!f46.U(str)) {
                if ("attachment.not.ready".equals(str)) {
                    pl plVar2 = this.c;
                    if (plVar2 == null) {
                        plVar2 = null;
                    }
                    ((t20) plVar2.C.getValue()).b(cu8VarQ);
                } else {
                    d();
                    pl plVar3 = this.c;
                    if (plVar3 == null) {
                        plVar3 = null;
                    }
                    plVar3.b().c(new oi0(this.a, pkeVar));
                }
            }
            pl plVar4 = this.c;
            (plVar4 != null ? plVar4 : null).b().c(new l6f(this.o, cu8VarQ.b, 0));
        }
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.u0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        wz wzVar;
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        e52 e52VarC = plVar.c().C(this.o);
        pl plVar2 = this.c;
        if (plVar2 == null) {
            plVar2 = null;
        }
        cu8 cu8VarQ = plVar2.d().q(this.X);
        if (e52VarC == null || cu8VarQ == null) {
            return null;
        }
        if (this.v0) {
            wz wzVarF = iz7.f(cu8VarQ.z0);
            if (wzVarF == null) {
                wzVarF = new wz();
            }
            wzVar = wzVarF;
        } else {
            wzVar = null;
        }
        List list = cu8VarQ.R0;
        return new tq2(e52VarC.b.a, this.Z, this.w0, wzVar, list != null ? iz7.v(list) : null, cu8VarQ.T0);
    }
}
