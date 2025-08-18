package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class tke implements x7d {
    public static final /* synthetic */ int j = 0;
    public final ri4 a;
    public final o45 b;
    public volatile boolean c;
    public final boolean d;
    public final je7 e;
    public volatile String f;
    public volatile List g;
    public final String h;
    public u2a i;

    public tke(ri4 ri4Var, o45 o45Var, y7d y7dVar, khe kheVar) {
        this.a = ri4Var;
        this.b = o45Var;
        qyc qycVar = (qyc) y7dVar;
        qycVar.getClass();
        this.d = v44.a((int) qycVar.q(PmsKey.f27debugmode, (long) 0)) != v44.DISABLED;
        this.e = kheVar;
        f(mqd.a(qycVar.w(PmsKey.proxy, null)));
        List listH = qycVar.h(PmsKey.f101proxydomains.name(), nz4.a);
        synchronized (this) {
            this.g = listH;
        }
        StringBuilder sb = new StringBuilder("OKMessages/");
        sb.append(ri4Var.h().b);
        sb.append(" (");
        sb.append(ri4Var.h().e);
        sb.append("; ");
        sb.append(ri4Var.h().h);
        sb.append("; ");
        String strL = zr6.l(sb, ri4Var.h().i, ")");
        try {
            this.h = URLEncoder.encode(strL, Charset.defaultCharset().name());
        } catch (UnsupportedEncodingException unused) {
            this.h = strL;
        }
    }

    public static void c(tke tkeVar, od3 od3Var, boolean z) {
        if (oag.t(tkeVar.f)) {
            tkeVar.b.a(new IllegalStateException("proxy is null or empty!"));
            od3Var.k(z ? 443 : 80);
        } else {
            od3Var.h(tkeVar.f);
            od3Var.k(z ? 443 : 80);
        }
    }

    @Override // defpackage.x7d
    public final void a(String str, String str2) {
        f(str2);
    }

    @Override // defpackage.x7d
    public final void b(List list, List list2) {
        synchronized (this) {
            this.g = list2;
        }
    }

    public final boolean d(String str) {
        if (oag.t(str)) {
            return false;
        }
        for (String str2 : this.g) {
            if (str.equals(str2)) {
                return true;
            }
            if (str.endsWith("." + str2)) {
                return true;
            }
        }
        return false;
    }

    public final u2a e() {
        int i = 1;
        if (this.i == null) {
            t2a t2aVar = new t2a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            t2aVar.y = naf.b(timeUnit);
            t2aVar.z = naf.b(timeUnit);
            ExecutorService executorService = (ExecutorService) this.e.getValue();
            a8g a8gVar = new a8g(7);
            a8gVar.a = executorService;
            t2aVar.a = a8gVar;
            t2aVar.x = naf.b(timeUnit);
            t2aVar.c.add(new ske(this, i));
            ske skeVar = new ske(this, 0);
            ArrayList arrayList = t2aVar.d;
            arrayList.add(skeVar);
            if (this.d) {
                arrayList.add(new ur0(i, "tke"));
            } else {
                this.a.e();
            }
            this.i = new u2a(t2aVar);
        }
        return this.i;
    }

    public final synchronized void f(String str) {
        this.c = !oag.t(str);
        this.f = str;
    }
}
