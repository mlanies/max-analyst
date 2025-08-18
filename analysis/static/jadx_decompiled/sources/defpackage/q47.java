package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class q47 extends wp3 implements hua {
    public static final /* synthetic */ int t0 = 0;
    public final String Z;
    public final pne s0;

    public q47(long j, String str, long j2, long j3, pne pneVar) {
        super(1, j, j2, Collections.singletonList(Long.valueOf(j3)));
        this.Z = str;
        this.s0 = pneVar;
    }

    @Override // defpackage.hua
    public final int c() {
        au8 au8VarP = p();
        pne pneVar = this.s0;
        cu8 cu8VarQ = au8VarP.q(pneVar.a);
        if (cu8VarQ != null) {
            if (cu8VarQ.v0 != vx8.DELETED && cu8VarQ.u()) {
                return 1;
            }
        }
        StringBuilder sb = new StringBuilder("onPreExecute: messageId ");
        long j = pneVar.a;
        sb.append(j);
        sb.append(" is wrong");
        hm9.n("q47", sb.toString());
        w(cu8VarQ);
        l().c(new to4(j));
        return 3;
    }

    @Override // defpackage.hua
    public final void d() {
        hm9.n("q47", "onMaxFailCount");
        t().d(this.a);
        au8 au8VarP = p();
        pne pneVar = this.s0;
        w(au8VarP.q(pneVar.a));
        l().c(new to4(pneVar.a));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.FileDownload fileDownload = new Tasks.FileDownload();
        pne pneVar = this.s0;
        fileDownload.messageId = pneVar.a;
        fileDownload.attachId = pneVar.b;
        fileDownload.videoId = pneVar.c;
        fileDownload.audioId = pneVar.d;
        fileDownload.mp4GifId = pneVar.e;
        fileDownload.stickerId = pneVar.f;
        fileDownload.fileId = pneVar.j;
        fileDownload.fileName = pneVar.k;
        fileDownload.url = pneVar.g;
        fileDownload.notifyProgress = pneVar.h;
        fileDownload.checkAutoloadConnection = pneVar.i;
        fileDownload.invalidateCount = pneVar.l;
        fileDownload.useOriginalExtension = pneVar.m;
        fileDownload.notCopyVideoToGallery = pneVar.n;
        Tasks.InvalidateAndDownloadAudio invalidateAndDownloadAudio = new Tasks.InvalidateAndDownloadAudio();
        invalidateAndDownloadAudio.requestId = this.a;
        invalidateAndDownloadAudio.outputPath = this.Z;
        invalidateAndDownloadAudio.chatServerId = this.X;
        invalidateAndDownloadAudio.serverMessageId = ((Number) ((List) this.Y).get(0)).longValue();
        invalidateAndDownloadAudio.fileDownload = fileDownload;
        return qw8.toByteArray(invalidateAndDownloadAudio);
    }

    @Override // defpackage.wp3, defpackage.lme
    public final void g(pke pkeVar) {
        super.g(pkeVar);
        if (f46.U(pkeVar.b)) {
            return;
        }
        hm9.p("q47", "Can't update msg", null);
        d();
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.O0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.wp3, defpackage.lme
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void e(xe9 xe9Var) {
        String str;
        super.e(xe9Var);
        hm9.n("q47", "Receive msg get response");
        au8 au8VarP = p();
        pne pneVar = this.s0;
        cu8 cu8VarQ = au8VarP.q(pneVar.a);
        if (cu8VarQ == null || !cu8VarQ.u()) {
            hm9.p("q47", "No message after msg get", null);
            d();
            return;
        }
        hm9.n("q47", "messageDb = " + cu8VarQ + ", forwardLink = " + (cu8VarQ.p() ? cu8VarQ.C0 : null));
        i10 i10VarC = cu8VarQ.c();
        if (i10VarC == null || (str = i10VarC.b) == null) {
            return;
        }
        one oneVar = new one();
        oneVar.a = pneVar.a;
        oneVar.b = pneVar.b;
        oneVar.c = pneVar.c;
        oneVar.d = pneVar.d;
        oneVar.e = pneVar.e;
        oneVar.f = pneVar.f;
        oneVar.j = pneVar.j;
        oneVar.k = pneVar.k;
        oneVar.h = pneVar.h;
        oneVar.i = pneVar.i;
        oneVar.m = pneVar.m;
        oneVar.n = pneVar.n;
        oneVar.l = pneVar.l + 1;
        oneVar.g = str;
        pne pneVar2 = new pne(oneVar);
        pl plVar = this.c;
        ((rf5) (plVar != null ? plVar : null).H.getValue()).a(pneVar2);
    }

    public final void w(cu8 cu8Var) {
        if (cu8Var != null) {
            if (cu8Var.v0 != vx8.DELETED) {
                pne pneVar = this.s0;
                l20 l20VarA = s5c.A(cu8Var, pneVar.b);
                if (l20VarA != null) {
                    if (l20VarA.o.a()) {
                        pl plVar = this.c;
                        if (plVar == null) {
                            plVar = null;
                        }
                        ((gq6) plVar.G.getValue()).a.a(new File(this.Z), pneVar.b);
                        return;
                    }
                    p().v(cu8Var.b, l20VarA.r, new ig5(26));
                    l().c(new l6f(cu8Var.t0, cu8Var.b, 0));
                }
            }
        }
    }
}
