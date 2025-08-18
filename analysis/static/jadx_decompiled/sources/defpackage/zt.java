package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public final class zt extends th0 {
    public final long X;

    public zt(int i, long j, long j2) {
        super(j, i);
        this.X = j2;
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.AssetsAdd assetsAdd = new Tasks.AssetsAdd();
        assetsAdd.assetType = b.p(this.o);
        assetsAdd.id = this.X;
        assetsAdd.requestId = this.a;
        return qw8.toByteArray(assetsAdd);
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.S0;
    }

    @Override // defpackage.ol
    public final dle i() {
        au auVar = new au((sla) null, 0);
        int i = this.o;
        if (i == 0) {
            throw new IllegalArgumentException("type must not be null");
        }
        long j = this.X;
        if (j == 0) {
            throw new IllegalArgumentException("id must not be null or empty");
        }
        auVar.p("type", au1.d(i));
        auVar.i(j, "id");
        return auVar;
    }

    @Override // defpackage.th0
    public final void u(gle gleVar) {
        bu buVar = (bu) gleVar;
        if (!buVar.c) {
            g(new pke("asset.task.failed", "failed to add asset", null));
            return;
        }
        v(buVar.o);
        pl plVar = this.c;
        (plVar != null ? plVar : null).b().c(new cu(this.a));
    }
}
