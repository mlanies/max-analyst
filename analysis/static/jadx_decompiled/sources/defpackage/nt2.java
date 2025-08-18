package defpackage;

import java.util.List;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class nt2 extends ol implements lme, hua {
    public final int X;
    public final long Y;
    public final long o;

    public nt2(int i, long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = i;
        this.Y = j3;
    }

    @Override // defpackage.hua
    public final int c() {
        return 1;
    }

    @Override // defpackage.hua
    public final void d() {
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) throws Throwable {
        st2 st2Var = (st2) gleVar;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "ChatsListApiTask", "onSuccess " + st2Var, null);
        }
        try {
            q().n(st2Var.c);
        } catch (TamErrorException unused) {
        }
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.X, "ChatsListApiTask", "chats.storeChatsFromServer", null);
        }
        p82 p82VarM = m();
        List list = st2Var.c;
        p82VarM.getClass();
        pl plVar = this.c;
        ((hyc) ((q33) (plVar != null ? plVar : null).e.getValue())).l("app.last.chat.marker", Long.valueOf(st2Var.o));
        if (st2Var.o > 0) {
            pk pkVarJ = j();
            long j = st2Var.o;
            long j2 = this.Y;
            z7d z7dVar = ((p7b) r()).b;
            z7dVar.getClass();
            k4a k4aVar = (k4a) pkVarJ;
            ome.d(k4aVar.z(), new nt2((int) z7dVar.q(PmsKey.f24chatspagesize, 50), ((p7b) k4aVar.y()).a.o(), j, j2), false, 0, 12);
        }
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ChatsList chatsList = new Tasks.ChatsList();
        chatsList.requestId = this.a;
        chatsList.marker = this.o;
        chatsList.count = this.X;
        chatsList.chatsSync = this.Y;
        return qw8.toByteArray(chatsList);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.t0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        tq2 tq2Var = new tq2((sla) null, 3);
        tq2Var.i(this.o, "marker");
        tq2Var.e(this.X, NewHtcHomeBadger.COUNT);
        return tq2Var;
    }

    @Override // defpackage.ol
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatsListApiTask(id = ");
        sb.append(this.a);
        sb.append(", marker=");
        sb.append(this.o);
        sb.append(", count=");
        sb.append(this.X);
        sb.append(", chatsSync=");
        return zr6.k(sb, this.Y, ")");
    }
}
