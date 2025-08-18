package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class jt3 implements a95, ke7 {
    public static o9e c;
    public static o9e o;
    public final Object a;
    public volatile Object b;

    public /* synthetic */ jt3(Object obj) {
        this.a = obj;
    }

    public Uri a(fl flVar) {
        Uri uri = flVar.getUri();
        if (!tpa.f(uri.getScheme(), "ok")) {
            return uri;
        }
        Uri uriP = ((vp6) this.b).p(uri.getAuthority());
        Uri.Builder builderEncodedAuthority = uri.buildUpon().scheme(uriP.getScheme()).encodedAuthority(uriP.getEncodedAuthority());
        String encodedPath = uriP.getEncodedPath();
        String encodedPath2 = uri.getEncodedPath();
        if (encodedPath == null || encodedPath.length() == 0 || encodedPath.equals("/")) {
            encodedPath = encodedPath2;
        } else if (encodedPath2 != null && encodedPath2.length() != 0 && !encodedPath2.equals("/")) {
            if (encodedPath.charAt(encodedPath.length() - 1) == '/') {
                encodedPath = encodedPath.substring(0, encodedPath.length() - 1);
            }
            encodedPath = encodedPath.concat(encodedPath2);
        }
        Uri.Builder builderEncodedPath = builderEncodedAuthority.encodedPath(encodedPath);
        String encodedQuery = uriP.getEncodedQuery();
        String encodedQuery2 = uri.getEncodedQuery();
        if (encodedQuery != null && encodedQuery.length() != 0) {
            if (encodedQuery2 != null && encodedQuery.length() != 0) {
                encodedQuery = encodedQuery + '&' + encodedQuery2;
            }
            encodedQuery2 = encodedQuery;
        }
        return builderEncodedPath.encodedQuery(encodedQuery2).build();
    }

    @Override // defpackage.a95
    public void b() {
        ((se3) this.a).setSessionInfo(null);
        this.b = null;
    }

    @Override // defpackage.a95
    public jxc c() {
        String str;
        String str2;
        if (((jxc) this.b) == null) {
            re3 sessionInfo = ((se3) this.a).getSessionInfo();
            jxc jxcVarD = jxc.c.b(((se3) this.a).getAppKey()).d(Uri.parse(((se3) this.a).getBaseEndpoint()));
            if (sessionInfo != null && (str = sessionInfo.a) != null && (str2 = sessionInfo.b) != null) {
                jxcVarD = jxcVarD.c(str, str2);
            }
            this.b = jxcVarD;
        }
        return (jxc) this.b;
    }

    @Override // defpackage.a95
    public void d(jxc jxcVar) {
        this.b = jxcVar;
        Uri uriA = ((jxc) this.b).a();
        ((se3) this.a).setSessionInfo(new re3(((jxc) this.b).a.d, ((jxc) this.b).a.e, uriA == null ? null : uriA.toString(), ((jxc) this.b).a.c));
    }

    public Logger e() {
        Logger logger = (Logger) this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = (Logger) this.b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.a);
                this.b = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.io.OutputStream r11, defpackage.fl r12, defpackage.wk r13, int r14) throws java.io.IOException, ru.ok.android.api.core.ApiRequestException {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt3.f(java.io.OutputStream, fl, wk, int):void");
    }

    @Override // defpackage.ke7
    public Object get() {
        Object obj = this.b;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == null) {
                        obj = ((lde) this.a).get();
                        this.b = obj;
                    }
                } finally {
                }
            }
        }
        return obj;
    }

    public jt3(Class cls) {
        this.a = cls.getName();
    }

    public jt3(int i) {
        switch (i) {
            case 2:
                this.b = vp6.x;
                this.a = new ArrayList();
                break;
            default:
                this.a = new CopyOnWriteArraySet();
                break;
        }
    }
}
