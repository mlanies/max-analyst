package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public final class nu extends th0 {
    public final long[] X;

    public nu(int i, long j, long[] jArr) {
        super(j, i);
        this.X = jArr;
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.AssetsRemove assetsRemove = new Tasks.AssetsRemove();
        assetsRemove.assetType = b.p(this.o);
        assetsRemove.ids = this.X;
        assetsRemove.requestId = this.a;
        return qw8.toByteArray(assetsRemove);
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.U0;
    }

    @Override // defpackage.ol
    public final dle i() {
        au auVar = new au((sla) null, 5);
        int i = this.o;
        if (i == 0) {
            throw new IllegalArgumentException("type must not be null");
        }
        long[] jArr = this.X;
        if (jArr == null || jArr.length == 0) {
            throw new IllegalArgumentException("ids must not be null or empty");
        }
        auVar.p("type", au1.d(i));
        auVar.h("ids", jArr);
        return auVar;
    }

    @Override // defpackage.th0
    public final void u(gle gleVar) {
        ou ouVar = (ou) gleVar;
        if (!ouVar.c) {
            g(new pke("asset.task.failed", "failed to remove asset", null));
            return;
        }
        v(ouVar.o);
        pl plVar = this.c;
        (plVar != null ? plVar : null).b().c(new pu(this.a));
    }
}
