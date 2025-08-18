package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xe2 implements cfe {
    public final /* synthetic */ ye2 a;

    public xe2(ye2 ye2Var) {
        this.a = ye2Var;
    }

    @Override // defpackage.cfe
    public final void a() {
        this.a.t(false);
    }

    @Override // defpackage.cfe
    public final Object c(float f, long j, long j2, Continuation continuation) {
        Object value;
        q0e q0eVar = this.a.w0;
        do {
            value = q0eVar.getValue();
            ((Number) value).floatValue();
        } while (!q0eVar.c(value, new Float(f)));
        return e5f.a;
    }

    @Override // defpackage.cfe
    public final void e(boolean z, boolean z2) {
        this.a.t(z2);
    }

    @Override // defpackage.cfe
    public final Object f(File file, Continuation continuation) {
        ye2 ye2Var = this.a;
        ne2 ne2Var = (ne2) ye2Var.z0.getAndUpdate(new oe2(1));
        e5f e5fVar = e5f.a;
        if (file != null && ne2Var != null) {
            ada adaVar = (ada) ((af8) ye2Var.t0.getValue());
            j47.T((sx3) adaVar.k.getValue(), null, null, new zca(adaVar, file, null), 3);
            kld kldVar = ye2Var.u0;
            Uri uriFromFile = Uri.fromFile(file);
            String string = uriFromFile.toString();
            int i = tfg.c;
            if (!string.startsWith("content://")) {
                zi5 zi5Var = (zi5) ye2Var.s0.getValue();
                uriFromFile = ((kk5) zi5Var).f(ye2Var.b, ft.A(uriFromFile));
            }
            kldVar.g(new jn4(uriFromFile, ne2Var.d));
        }
        return e5fVar;
    }

    @Override // defpackage.cfe
    public final String getDownloadContext() {
        ne2 ne2Var = (ne2) this.a.z0.get();
        if (ne2Var == null) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ne2Var.a);
        sb.append(ne2Var.b);
        return sb.toString();
    }
}
