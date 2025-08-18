package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ly1 extends ny1 {
    public final /* synthetic */ s7g c;
    public final /* synthetic */ UUID o;

    public ly1(s7g s7gVar, UUID uuid) {
        this.c = s7gVar;
        this.o = uuid;
    }

    @Override // defpackage.ny1
    public final void c() {
        s7g s7gVar = this.c;
        WorkDatabase workDatabase = s7gVar.c;
        workDatabase.c();
        try {
            ny1.b(s7gVar, this.o.toString());
            workDatabase.r();
            workDatabase.l();
            nuc.a(s7gVar.b, s7gVar.c, s7gVar.e);
        } catch (Throwable th) {
            workDatabase.l();
            throw th;
        }
    }
}
