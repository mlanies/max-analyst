package defpackage;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class gp7 implements nte {
    public final Executor a;
    public final y7g b;
    public final ContentResolver c;

    public gp7(Executor executor, y7g y7gVar, ContentResolver contentResolver) {
        this.a = executor;
        this.b = y7gVar;
        this.c = contentResolver;
    }

    @Override // defpackage.dab
    public final void a(fi0 fi0Var, eab eabVar) {
        oj0 oj0Var = (oj0) eabVar;
        hab habVar = oj0Var.c;
        oj0Var.h("local", "exif");
        ep7 ep7Var = new ep7(this, fi0Var, habVar, eabVar, oj0Var.a);
        oj0Var.a(new fp7(ep7Var, 0));
        this.a.execute(ep7Var);
    }

    @Override // defpackage.nte
    public final boolean b(jic jicVar) {
        return tu0.p(512, 512, jicVar);
    }
}
