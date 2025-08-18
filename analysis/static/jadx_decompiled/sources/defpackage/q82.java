package defpackage;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class q82 extends ol implements lme, hua {
    public final int X;
    public final long Y;
    public final long Z;
    public final long o;
    public final String s0;

    public q82(long j, long j2, int i, long j3, String str, long j4) {
        super(j);
        this.o = j2;
        this.X = i;
        this.Y = j3;
        this.Z = j4;
        this.s0 = str == null ? "" : str;
    }

    @Override // defpackage.hua
    public final int c() {
        return 1;
    }

    @Override // defpackage.hua
    public final void d() {
        t().d(this.a);
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        zfc zfcVar = (zfc) plVar.M.getValue();
        p82 p82Var = (p82) zfcVar.a.getValue();
        p82Var.getClass();
        long j = this.o;
        cqc.a(new i82(p82Var, j, 0), p82Var.z, null, new un0(19), null);
        ConcurrentHashMap concurrentHashMap = ((p7c) zfcVar.b.getValue()).i;
        cqc.b((zl4) concurrentHashMap.get(0L));
        concurrentHashMap.remove(0L);
        l().c(new vz2(Collections.singletonList(Long.valueOf(j)), true, false, null, null, 124));
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        f52 f52Var = ((r82) gleVar).c;
        if (f52Var == null) {
            return;
        }
        m().c0(Collections.singletonList(f52Var));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ChatCreate chatCreate = new Tasks.ChatCreate();
        chatCreate.requestId = this.a;
        int i = this.X;
        if (i != 0) {
            chatCreate.chatType = ms2.a(i);
        }
        chatCreate.chatId = this.o;
        chatCreate.groupId = this.Y;
        chatCreate.startPayload = this.s0;
        chatCreate.cid = this.Z;
        return qw8.toByteArray(chatCreate);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        if (f46.U(pkeVar.b)) {
            return;
        }
        d();
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.C0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        au auVar = new au((sla) null, 17);
        int i = this.X;
        if (i != 0 && i != 1) {
            auVar.p("chatType", ms2.a(i));
        }
        long j = this.Y;
        if (j != 0) {
            auVar.i(j, "groupId");
        }
        String str = this.s0;
        if (!oag.t(str)) {
            auVar.p("startPayload", str);
        }
        long j2 = this.Z;
        if (j2 != 0) {
            auVar.i(j2, "cid");
        }
        return auVar;
    }
}
