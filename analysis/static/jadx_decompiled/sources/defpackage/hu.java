package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public final class hu extends th0 {
    public final long[] X;
    public final long Y;

    public hu(long j, int i, long[] jArr, long j2) {
        super(j, i);
        this.X = jArr;
        this.Y = j2;
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.AssetsListModify assetsListModify = new Tasks.AssetsListModify();
        assetsListModify.assetType = b.p(this.o);
        assetsListModify.requestId = this.a;
        assetsListModify.ids = this.X;
        assetsListModify.modifyTime = this.Y;
        return qw8.toByteArray(assetsListModify);
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.T0;
    }

    @Override // defpackage.ol
    public final dle i() {
        au auVar = new au((sla) null, 3);
        int i = this.o;
        if (i == 0) {
            throw new IllegalArgumentException("type must not be null");
        }
        long[] jArr = this.X;
        if (jArr == null) {
            throw new IllegalArgumentException("ids must not be null");
        }
        auVar.p("type", au1.d(i));
        auVar.h("ids", jArr);
        long j = this.Y;
        if (j >= 0) {
            auVar.i(j, "updateTime");
        }
        return auVar;
    }

    @Override // defpackage.th0
    public final void u(gle gleVar) {
        iu iuVar = (iu) gleVar;
        if (!iuVar.c) {
            g(new pke("asset.task.failed", "failed to modify asset list", null));
            return;
        }
        v(iuVar.o);
        pl plVar = this.c;
        (plVar != null ? plVar : null).b().c(new ju(this.a));
    }
}
