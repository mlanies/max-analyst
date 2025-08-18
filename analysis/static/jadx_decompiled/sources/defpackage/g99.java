package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g99 {
    public final va8 a;
    public final iz3 b;
    public final HashMap c;

    public g99(Context context, iz3 iz3Var) {
        va8 va8Var = new va8(context, 25);
        this.c = new HashMap();
        this.a = va8Var;
        this.b = iz3Var;
    }

    public final synchronized k2f a(String str) {
        if (this.c.containsKey(str)) {
            return (k2f) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryV = this.a.v(str);
        if (cctBackendFactoryV == null) {
            return null;
        }
        iz3 iz3Var = this.b;
        k2f k2fVarCreate = cctBackendFactoryV.create(new ba0(iz3Var.a, iz3Var.b, iz3Var.c, str));
        this.c.put(str, k2fVarCreate);
        return k2fVarCreate;
    }
}
