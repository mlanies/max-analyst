package defpackage;

import java.util.Collections;
import java.util.Map;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class yjf extends ol implements lme, hua {
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final String s0;
    public final boolean t0;
    public final boolean u0;
    public final String v0;
    public final boolean w0;
    public final String x0;
    public final khe y0;

    public yjf(long j, long j2, long j3, long j4, long j5, String str, boolean z, boolean z2, String str2, boolean z3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.s0 = str;
        this.t0 = z;
        this.u0 = z2;
        this.v0 = str2;
        this.w0 = z3;
        this.x0 = yjf.class.getName();
        this.y0 = new khe(new rzd(13, this));
    }

    @Override // defpackage.hua
    public final int c() {
        long j = this.Z;
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
        zjf zjfVar = (zjf) gleVar;
        if (!this.t0) {
            l().c(new akf(this.a, this.o, this.Z, this.s0, zjfVar.c));
            return;
        }
        Map map = zjfVar.c;
        int i = f46.f;
        if (map.size() == 1 && map.containsKey("EXTERNAL")) {
            return;
        }
        one oneVar = new one();
        oneVar.a = this.Z;
        oneVar.b = this.s0;
        oneVar.c = this.o;
        oneVar.g = f46.H(zjfVar.c);
        oneVar.h = true;
        oneVar.n = !this.u0;
        pne pneVar = new pne(oneVar);
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((rf5) plVar.H.getValue()).a(pneVar);
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.VideoPlay videoPlay = new Tasks.VideoPlay();
        videoPlay.requestId = this.a;
        videoPlay.videoId = this.o;
        videoPlay.chatServerId = this.X;
        videoPlay.messageServerId = this.Y;
        videoPlay.messageId = this.Z;
        String str = this.s0;
        if (str != null) {
            videoPlay.attachLocalId = str;
        }
        videoPlay.startDownload = this.t0;
        videoPlay.saveToGallery = this.u0;
        videoPlay.token = this.v0;
        return qw8.toByteArray(videoPlay);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        cu8 cu8VarQ = p().q(this.Z);
        if (cu8VarQ == null || cu8VarQ.v0 == vx8.DELETED) {
            l().c(new oi0(this.a, pkeVar));
            d();
            return;
        }
        if ("attachment.token.expired".equals(pkeVar.b)) {
            hm9.p(this.x0, "videoPlayCmd failed with token expired, retry videoPlayCmd", null);
            if (this.w0) {
                l().c(new oi0(this.a, pkeVar));
            } else {
                bkf bkfVar = (bkf) this.y0.getValue();
                synchronized (bkfVar) {
                    if (bkfVar.b == -1) {
                        bkfVar.a.l().d(bkfVar);
                        pk pkVarJ = bkfVar.a.j();
                        yjf yjfVar = bkfVar.a;
                        bkfVar.b = ((k4a) pkVarJ).D(yjfVar.X, Collections.singletonList(Long.valueOf(yjfVar.Y)));
                    }
                }
            }
        } else if ("video.not.found".equals(pkeVar.b)) {
            hm9.p(this.x0, "videoPlayCmd failed, set attach status to ERROR", null);
            p().v(this.Z, this.s0, new n2f(22));
            l().c(new l6f(cu8VarQ.t0, cu8VarQ.b, 0));
        }
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
        return iua.w0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        return new gs9(this.v0, this.o, this.X, this.Y);
    }
}
