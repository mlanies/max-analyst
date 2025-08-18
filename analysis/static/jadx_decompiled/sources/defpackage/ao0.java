package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public interface ao0 {
    bm7 B(byte[] bArr);

    bm7 u(Uri uri);

    default bm7 v(gd8 gd8Var) {
        byte[] bArr = gd8Var.k;
        if (bArr != null) {
            return B(bArr);
        }
        Uri uri = gd8Var.m;
        if (uri != null) {
            return u(uri);
        }
        return null;
    }
}
