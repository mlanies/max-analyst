package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class big extends a {
    public final GoogleSignInOptions K0;

    public big(Context context, Looper looper, kad kadVar, GoogleSignInOptions googleSignInOptions, ge6 ge6Var, he6 he6Var) {
        s04 s04Var;
        super(context, looper, 91, kadVar, ge6Var, he6Var);
        if (googleSignInOptions != null) {
            s04Var = new s04();
            s04Var.d = new HashSet();
            s04Var.h = new HashMap();
            s04Var.d = new HashSet(googleSignInOptions.b);
            s04Var.a = googleSignInOptions.X;
            s04Var.b = googleSignInOptions.Y;
            s04Var.c = googleSignInOptions.o;
            s04Var.e = googleSignInOptions.Z;
            s04Var.f = googleSignInOptions.c;
            s04Var.g = googleSignInOptions.s0;
            s04Var.h = GoogleSignInOptions.c(googleSignInOptions.t0);
            s04Var.i = googleSignInOptions.u0;
        } else {
            s04Var = new s04();
            s04Var.d = new HashSet();
            s04Var.h = new HashMap();
        }
        byte[] bArr = new byte[16];
        yfg.a.nextBytes(bArr);
        s04Var.i = Base64.encodeToString(bArr, 11);
        Set<Scope> set = (Set) kadVar.c;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = (HashSet) s04Var.d;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.K0 = s04Var.b();
    }

    @Override // defpackage.ok
    public final int g() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof wkg ? (wkg) iInterfaceQueryLocalInterface : new wkg(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 4);
    }

    @Override // com.google.android.gms.common.internal.a
    public final String p() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
