package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ihc extends khc {
    public final String Y;
    public final q4c Z;
    public final re6 s0;

    public ihc(long j, oy5 oy5Var, List list, t2d t2dVar, ArrayList arrayList) {
        super(oy5Var, list, t2dVar, arrayList);
        Uri.parse(((lk0) list.get(0)).a);
        long j2 = t2dVar.e;
        q4c q4cVar = j2 <= 0 ? null : new q4c(t2dVar.d, null, j2);
        this.Z = q4cVar;
        this.Y = null;
        this.s0 = q4cVar == null ? new re6(27, new q4c(0L, null, -1L)) : null;
    }

    @Override // defpackage.khc
    public final String a() {
        return this.Y;
    }

    @Override // defpackage.khc
    public final z14 c() {
        return this.s0;
    }

    @Override // defpackage.khc
    public final q4c d() {
        return this.Z;
    }
}
