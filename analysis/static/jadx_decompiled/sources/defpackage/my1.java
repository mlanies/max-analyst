package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class my1 extends ny1 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ s7g c;
    public final /* synthetic */ String o;

    public my1(s7g s7gVar, String str, boolean z) {
        this.c = s7gVar;
        this.o = str;
        this.X = z;
    }

    @Override // defpackage.ny1
    public final void c() {
        s7g s7gVar = this.c;
        WorkDatabase workDatabase = s7gVar.c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.y().k(this.o).iterator();
            while (it.hasNext()) {
                ny1.b(s7gVar, (String) it.next());
            }
            workDatabase.r();
            workDatabase.l();
            if (this.X) {
                nuc.a(s7gVar.b, s7gVar.c, s7gVar.e);
            }
        } catch (Throwable th) {
            workDatabase.l();
            throw th;
        }
    }
}
