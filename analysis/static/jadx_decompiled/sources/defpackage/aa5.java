package defpackage;

import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class aa5 extends d8d implements hua {
    public static final /* synthetic */ int s0 = 0;
    public final long X;
    public final long Y;
    public final String Z;
    public final long b;
    public final String c;
    public final String o;

    public aa5(long j, long j2, String str, long j3, String str2, String str3) {
        this.b = j;
        this.c = str;
        this.o = str2;
        this.X = j2;
        this.Y = j3;
        this.Z = str3;
    }

    @Override // defpackage.hua
    public final int c() {
        long j = this.X;
        if (j <= 0) {
            return 1;
        }
        cu8 cu8VarQ = n().q(j);
        if (cu8VarQ != null) {
            return cu8VarQ.v0 == vx8.DELETED ? 3 : 1;
        }
        return 3;
    }

    @Override // defpackage.hua
    public final void d() {
        r().d(this.b);
        e52 e52VarC = b().C(this.Y);
        long j = this.X;
        if (e52VarC != null) {
            e8d e8dVar = this.a;
            if (e8dVar == null) {
                e8dVar = null;
            }
            sna snaVar = (sna) e8dVar.p.getValue();
            long j2 = e52VarC.b.a;
            snaVar.getClass();
            sna.b(j2, j);
        }
        cu8 cu8VarQ = n().q(j);
        if (cu8VarQ != null) {
            if (cu8VarQ.v0 != vx8.DELETED) {
                n().x(cu8VarQ, iu8.s0);
                t().c(new l6f(cu8VarQ.t0, cu8VarQ.b, 0));
                r9d.y(u());
                return;
            }
        }
        hm9.n("aa5", "onMaxFailCount: Message was deleted");
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ExternalVideoSend externalVideoSend = new Tasks.ExternalVideoSend();
        externalVideoSend.requestId = this.b;
        externalVideoSend.externalUrl = this.c;
        externalVideoSend.attachLocalId = this.o;
        externalVideoSend.messageId = this.X;
        externalVideoSend.chatId = this.Y;
        externalVideoSend.stickerId = this.Z;
        return qw8.toByteArray(externalVideoSend);
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.Q0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 5;
    }

    @Override // defpackage.d8d
    public final void x() {
        e8d e8dVar = this.a;
        if (e8dVar == null) {
            e8dVar = null;
        }
        dg5 dg5Var = (dg5) e8dVar.b.getValue();
        dg5Var.getClass();
        int iOrdinal = ((ag5) j47.f0(hz4.a, new cg5(dg5Var, this.b, this.c, this.o, this.X, this.Y, this.Z, null))).ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            return;
        }
        if (iOrdinal != 5) {
            throw new NoWhenBranchMatchedException();
        }
        d();
    }
}
