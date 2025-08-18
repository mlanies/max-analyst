package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class g6f extends ol implements lme, hua {
    public static final /* synthetic */ int s0 = 0;
    public final long X;
    public final long Y;
    public final boolean Z;
    public final long o;

    public g6f(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = z;
    }

    @Override // defpackage.hua
    public final int c() {
        long j;
        long j2;
        Object next;
        List listH = t().h(this.a, iua.b1);
        ArrayList arrayList = new ArrayList();
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            g6f g6fVar = (g6f) ((une) it.next()).f;
            if (g6fVar != null) {
                arrayList.add(g6fVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            j = this.X;
            j2 = this.o;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it2.next();
            g6f g6fVar2 = (g6f) next;
            if (g6fVar2.o == j2 && g6fVar2.X == j) {
                break;
            }
        }
        if (((g6f) next) != null) {
            hm9.n("g6f", "onPreExecute: found later task, REMOVE");
            return 3;
        }
        cu8 cu8VarQ = p().q(j);
        e52 e52VarC = m().C(j2);
        if (cu8VarQ != null) {
            if (cu8VarQ.v0 != vx8.DELETED && e52VarC != null && (e52VarC.C() || e52VarC.R())) {
                if (cu8VarQ.c == 0) {
                    hm9.n("g6f", "onPreExecute: message serverId == 0, REMOVE");
                    return 3;
                }
                if (e52VarC.b.a != 0 || m().P(e52VarC)) {
                    return 1;
                }
                hm9.n("g6f", "onPreExecute: chat serverId == 0, SKIP");
                return 2;
            }
        }
        hm9.n("g6f", "onPreExecute: message or chat not found, REMOVE");
        return 3;
    }

    @Override // defpackage.hua
    public final void d() {
        t().d(this.a);
        cu8 cu8VarQ = p().q(this.X);
        if (cu8VarQ != null) {
            p().x(cu8VarQ, iu8.s0);
            l().c(new l6f(this.o, this.X, 0));
        }
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        hm9.n("g6f", "onSuccess: " + ((we9) gleVar));
        cu8 cu8VarQ = p().q(this.X);
        if (cu8VarQ == null) {
            return;
        }
        if (cu8VarQ.v0 == vx8.DELETED) {
            return;
        }
        p().x(cu8VarQ, iu8.Y);
        l().c(new l6f(this.o, this.X, 0));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.UpdateFireTimeProtoTask updateFireTimeProtoTask = new Tasks.UpdateFireTimeProtoTask();
        updateFireTimeProtoTask.requestId = this.a;
        updateFireTimeProtoTask.chatId = this.o;
        updateFireTimeProtoTask.messageId = this.X;
        updateFireTimeProtoTask.fireTime = this.Y;
        updateFireTimeProtoTask.notifySender = this.Z;
        return qw8.toByteArray(updateFireTimeProtoTask);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        hm9.m("g6f", "onFail", pkeVar);
        cu8 cu8VarQ = p().q(this.X);
        if (cu8VarQ == null) {
            return;
        }
        if (cu8VarQ.v0 == vx8.DELETED || f46.U(pkeVar.b)) {
            return;
        }
        d();
        l().c(new oi0(this.a, pkeVar));
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.b1;
    }

    @Override // defpackage.ol
    public final dle i() {
        e52 e52VarC;
        cu8 cu8VarQ = p().q(this.X);
        if (cu8VarQ == null || (e52VarC = m().C(this.o)) == null) {
            return null;
        }
        long j = e52VarC.b.a;
        wz wzVarF = iz7.f(cu8VarQ.z0);
        if (wzVarF == null) {
            wzVarF = new wz();
        }
        wz wzVar = wzVarF;
        List list = cu8VarQ.R0;
        return new tq2(j, cu8VarQ.c, cu8VarQ.s0, wzVar, list != null ? iz7.v(list) : null, new ng4(this.Y, this.Z));
    }
}
