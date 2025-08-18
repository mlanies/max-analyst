package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public final class ku extends th0 {
    public final long X;
    public final long Y;
    public final int Z;

    public ku(long j, int i, long j2, long j3, int i2) {
        super(j, i);
        this.X = j2;
        this.Y = j3;
        this.Z = i2;
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.AssetsMove assetsMove = new Tasks.AssetsMove();
        assetsMove.assetType = b.p(this.o);
        assetsMove.id = this.X;
        assetsMove.requestId = this.a;
        assetsMove.prevId = this.Y;
        assetsMove.position = this.Z;
        return qw8.toByteArray(assetsMove);
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.V0;
    }

    @Override // defpackage.ol
    public final dle i() {
        au auVar = new au((sla) null, 4);
        int i = this.o;
        if (i == 0) {
            throw new IllegalArgumentException("type must not be null");
        }
        long j = this.X;
        if (j == 0) {
            throw new IllegalArgumentException("id must not be null or empty");
        }
        long j2 = this.Y;
        int i2 = this.Z;
        if (j2 <= 0 && i2 < 0) {
            throw new IllegalArgumentException("prevId or position must be set");
        }
        auVar.p("type", au1.d(i));
        auVar.i(j, "id");
        if (j2 > 0) {
            auVar.i(j2, "prevId");
        } else {
            auVar.e(i2, "position");
        }
        return auVar;
    }

    @Override // defpackage.th0
    public final void u(gle gleVar) {
        lu luVar = (lu) gleVar;
        if (!luVar.c) {
            g(new pke("asset.task.failed", "failed to move asset", null));
            return;
        }
        v(luVar.o);
        pl plVar = this.c;
        (plVar != null ? plVar : null).b().c(new mu(this.a));
    }
}
