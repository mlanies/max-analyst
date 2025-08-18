package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class wg5 extends ol implements lme, hua {
    public final String X;
    public final long Y;
    public final String Z;
    public final long o;
    public final String s0;

    public wg5(String str, String str2, long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = str;
        this.Y = j3;
        this.Z = str2;
        this.s0 = wg5.class.getName();
    }

    @Override // defpackage.hua
    public final int c() {
        long j = this.Y;
        if (j <= 0) {
            return 1;
        }
        cu8 cu8VarQ = p().q(j);
        if (cu8VarQ != null) {
            return cu8VarQ.v0 == vx8.DELETED ? 3 : 1;
        }
        return 3;
    }

    @Override // defpackage.hua
    public final void d() {
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        yg5 yg5Var = (yg5) gleVar;
        String str = this.s0;
        hm9.m(str, "onSuccess %s", yg5Var);
        l().c(new ah5(this.a, yg5Var.c));
        au8 au8VarP = p();
        long j = this.Y;
        cu8 cu8VarQ = au8VarP.q(j);
        if (cu8VarQ != null) {
            if (cu8VarQ.v0 == vx8.DELETED) {
                return;
            }
            one oneVar = new one();
            oneVar.a = j;
            oneVar.b = this.Z;
            oneVar.j = this.o;
            oneVar.k = this.X;
            oneVar.g = yg5Var.c;
            oneVar.h = true;
            pne pneVar = new pne(oneVar);
            hm9.m(str, "fileAttachDownloader.downloadAttach(%s)", pneVar);
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            ((rf5) plVar.H.getValue()).a(pneVar);
        }
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.FileDownloadCmd fileDownloadCmd = new Tasks.FileDownloadCmd();
        fileDownloadCmd.requestId = this.a;
        fileDownloadCmd.fileId = this.o;
        fileDownloadCmd.fileName = this.X;
        fileDownloadCmd.messageId = this.Y;
        String str = this.Z;
        if (str != null && str.length() != 0) {
            fileDownloadCmd.attachLocalId = str;
        }
        return qw8.toByteArray(fileDownloadCmd);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        String str;
        hm9.r(this.s0, pkeVar.X, "fail %s", pkeVar);
        cu8 cu8VarQ = p().q(this.Y);
        long j = this.a;
        if (cu8VarQ != null) {
            if (cu8VarQ.v0 != vx8.DELETED && (str = this.Z) != null) {
                boolean zEquals = "file.not.found".equals(pkeVar.b);
                p().v(cu8VarQ.b, str, new l01(zEquals, 5));
                l().c(new l6f(cu8VarQ.t0, this.Y, 0));
                if (zEquals) {
                    d();
                    l().c(new oi0(j, pkeVar));
                    return;
                }
                return;
            }
        }
        d();
        l().c(new oi0(j, pkeVar));
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.H0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        return new tq2(this.o, 14, (byte) 0);
    }
}
