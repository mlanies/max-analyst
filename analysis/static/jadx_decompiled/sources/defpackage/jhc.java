package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class jhc extends lhc {
    public final String Y;
    public final r4c Z;
    public final fd7 s0;

    public jhc(long j, qy5 qy5Var, List list, u2d u2dVar, ArrayList arrayList) {
        super(qy5Var, list, u2dVar, arrayList);
        Uri.parse(((mk0) list.get(0)).a);
        long j2 = u2dVar.e;
        r4c r4cVar = j2 <= 0 ? null : new r4c(u2dVar.d, null, j2);
        this.Z = r4cVar;
        this.Y = null;
        this.s0 = r4cVar == null ? new fd7(new r4c(0L, null, -1L)) : null;
    }

    @Override // defpackage.lhc
    public final String a() {
        return this.Y;
    }

    @Override // defpackage.lhc
    public final a24 c() {
        return this.s0;
    }

    @Override // defpackage.lhc
    public final r4c d() {
        return this.Z;
    }
}
