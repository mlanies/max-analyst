package defpackage;

import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class xv6 {
    public static final HashSet s = new HashSet();
    public Uri a;
    public vv6 b;
    public int c;
    public jic d;
    public anc e;
    public ju6 f;
    public uv6 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public a9b k;
    public q6b l;
    public Boolean m;
    public uhc n;
    public Boolean o;
    public bp4 p;
    public int q;
    public String r;

    public static xv6 b(wv6 wv6Var) {
        xv6 xv6VarD = d(wv6Var.b);
        xv6VarD.f = wv6Var.h;
        wv6Var.getClass();
        xv6VarD.getClass();
        uv6 uv6Var = wv6Var.a;
        xv6VarD.g = uv6Var;
        xv6VarD.i = wv6Var.f;
        xv6VarD.j = wv6Var.g;
        xv6VarD.b = wv6Var.l;
        xv6VarD.c = wv6Var.m;
        if (uv6Var != uv6.c) {
            xv6VarD.r = null;
        }
        xv6VarD.l = wv6Var.q;
        xv6VarD.h = wv6Var.e;
        xv6VarD.k = wv6Var.k;
        xv6VarD.d = wv6Var.i;
        xv6VarD.n = wv6Var.r;
        xv6VarD.e = wv6Var.j;
        xv6VarD.m = wv6Var.p;
        xv6VarD.q = wv6Var.v;
        xv6VarD.r = wv6Var.u;
        xv6VarD.p = wv6Var.t;
        xv6VarD.o = wv6Var.s;
        return xv6VarD;
    }

    public static boolean c(Uri uri) {
        HashSet hashSet = s;
        if (hashSet != null && uri != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static xv6 d(Uri uri) {
        xv6 xv6Var = new xv6();
        xv6Var.a = null;
        xv6Var.b = vv6.FULL_FETCH;
        xv6Var.c = 0;
        xv6Var.d = null;
        xv6Var.e = null;
        xv6Var.f = ju6.c;
        xv6Var.g = uv6.b;
        xv6Var.h = false;
        xv6Var.i = false;
        xv6Var.j = false;
        xv6Var.k = a9b.c;
        xv6Var.l = null;
        xv6Var.m = null;
        xv6Var.o = null;
        xv6Var.p = null;
        xv6Var.r = null;
        uri.getClass();
        xv6Var.a = uri;
        return xv6Var;
    }

    public final wv6 a() throws NumberFormatException {
        Uri uri = this.a;
        if (uri == null) {
            final String str = "Source must be set!";
            throw new RuntimeException(str) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
                {
                    super("Invalid request builder: ".concat(str));
                }
            };
        }
        if ("res".equals(e9f.b(uri))) {
            if (!this.a.isAbsolute()) {
                final String str2 = "Resource URI path must be absolute.";
                throw new RuntimeException(str2) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
                    {
                        super("Invalid request builder: ".concat(str2));
                    }
                };
            }
            if (this.a.getPath().isEmpty()) {
                final String str3 = "Resource URI must not be empty";
                throw new RuntimeException(str3) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
                    {
                        super("Invalid request builder: ".concat(str3));
                    }
                };
            }
            try {
                Integer.parseInt(this.a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                final String str4 = "Resource URI path must be a resource id.";
                throw new RuntimeException(str4) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
                    {
                        super("Invalid request builder: ".concat(str4));
                    }
                };
            }
        }
        if (!"asset".equals(e9f.b(this.a)) || this.a.isAbsolute()) {
            return new wv6(this);
        }
        final String str5 = "Asset URI path must be absolute.";
        throw new RuntimeException(str5) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
            {
                super("Invalid request builder: ".concat(str5));
            }
        };
    }
}
