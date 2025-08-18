package defpackage;

import android.net.Uri;
import java.io.File;

/* loaded from: classes2.dex */
public final class j00 extends up7 {
    public static final /* synthetic */ int z0 = 0;
    public l20 u0;
    public final long v0;
    public final long w0;
    public File x0;
    public final Uri y0;

    /* JADX WARN: Illegal instructions before constructor call */
    public j00(l20 l20Var, x10 x10Var, long j, long j2, Uri uri) {
        String strA;
        String str;
        long jHashCode = l20Var.r.hashCode();
        String str2 = l20Var.s;
        String strA2 = (str2 == null || str2.length() == 0) ? x10Var.a() : j47.O(str2);
        boolean z = x10Var.X;
        String str3 = x10Var.v0;
        if (z) {
            if (str3 == null) {
                strA = x10Var.a();
                str = strA;
            }
            str = str3;
        } else {
            if (str2 == null || str2.length() == 0) {
                if (str3 == null) {
                    strA = x10Var.a();
                }
                str = str3;
            } else {
                strA = j47.O(str2);
            }
            str = strA;
        }
        super(1, jHashCode, strA2, str, 0, 0L, x10Var.X ? "image/gif" : "image/jpeg", 0L, null);
        this.u0 = l20Var;
        this.v0 = j;
        this.w0 = j2;
        this.y0 = uri;
    }

    @Override // defpackage.up7, defpackage.o2
    public final String a() {
        Uri uri = this.y0;
        if (uri != null) {
            return String.valueOf(uri);
        }
        File file = this.x0;
        if (file == null) {
            return super.a();
        }
        String path = file.getPath();
        if (path != null) {
            return path;
        }
        Uri uriC = c();
        if (uriC != null) {
            return uriC.getPath();
        }
        return null;
    }

    @Override // defpackage.up7
    public final Uri c() {
        Uri uri = this.y0;
        if (uri != null) {
            return uri;
        }
        Uri uriN = j47.N(this.u0.s);
        return uriN != null ? uriN : super.c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j00(l20 l20Var, k20 k20Var, int i, long j, long j2, Uri uri, boolean z) {
        String string;
        int i2 = (z && i == 2) ? 11 : 3;
        long jHashCode = l20Var.r.hashCode();
        String str = l20Var.s;
        if (str != null && str.length() != 0) {
            string = Uri.fromFile(new File(str)).toString();
        } else {
            string = k20Var.h;
        }
        super(i2, jHashCode, string, k20Var.d, 0, k20Var.c, "video/mp4", 0L, null);
        this.u0 = l20Var;
        this.v0 = j;
        this.w0 = j2;
        this.y0 = uri;
    }
}
