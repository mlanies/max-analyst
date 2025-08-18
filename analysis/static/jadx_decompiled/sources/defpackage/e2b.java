package defpackage;

import android.content.Context;
import android.net.Uri;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import java.util.Set;

/* loaded from: classes.dex */
public final class e2b extends n0 {
    public final iv6 p;
    public final ty2 q;
    public ImagePerfDataListener r;

    public e2b(Context context, ty2 ty2Var, iv6 iv6Var, Set set, Set set2) {
        super(context, set, set2);
        this.p = iv6Var;
        this.q = ty2Var;
    }

    public final void c(Uri uri) {
        if (uri == null) {
            this.e = null;
            return;
        }
        xv6 xv6VarD = xv6.d(uri);
        xv6VarD.e = anc.c;
        this.e = xv6VarD.a();
    }
}
