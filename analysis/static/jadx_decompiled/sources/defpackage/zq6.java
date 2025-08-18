package defpackage;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class zq6 extends mr0 {
    public final int n;
    public final ExecutorService o;
    public final hc9 p;

    public zq6() {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
        this.o = Executors.newFixedThreadPool(3);
        this.p = realtimeSinceBootClock;
        this.n = 30000;
    }

    @Override // defpackage.mr0
    public final HashMap D(hf5 hf5Var, int i) {
        yq6 yq6Var = (yq6) hf5Var;
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(yq6Var.e - yq6Var.d));
        map.put("fetch_time", Long.toString(yq6Var.f - yq6Var.e));
        map.put("total_time", Long.toString(yq6Var.f - yq6Var.d));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    @Override // defpackage.mr0
    public final void P(hf5 hf5Var) {
        ((yq6) hf5Var).f = this.p.now();
    }

    public final HttpURLConnection c0(Uri uri, int i) throws IOException {
        URL url;
        String str;
        Uri uri2 = e9f.a;
        if (uri == null) {
            url = null;
        } else {
            try {
                url = new URL(uri.toString());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.n);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return httpURLConnection;
        }
        if (responseCode != 307 && responseCode != 308) {
            switch (responseCode) {
                case HttpStatus.SC_MULTIPLE_CHOICES /* 300 */:
                case HttpStatus.SC_MOVED_PERMANENTLY /* 301 */:
                case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                case HttpStatus.SC_SEE_OTHER /* 303 */:
                    break;
                default:
                    httpURLConnection.disconnect();
                    throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
            }
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        Uri uri3 = headerField != null ? Uri.parse(headerField) : null;
        String scheme = uri.getScheme();
        if (i > 0 && uri3 != null && !j47.B(uri3.getScheme(), scheme)) {
            return c0(uri3, i - 1);
        }
        if (i == 0) {
            String string = uri.toString();
            Locale.getDefault();
            str = "URL " + string + " follows too many redirects";
        } else {
            str = String.format(Locale.getDefault(), "URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
        }
        throw new IOException(str);
    }

    @Override // defpackage.mr0
    public final hf5 n(fi0 fi0Var, eab eabVar) {
        return new yq6(fi0Var, eabVar);
    }

    @Override // defpackage.mr0
    public final void t(hf5 hf5Var, h7b h7bVar) {
        yq6 yq6Var = (yq6) hf5Var;
        yq6Var.d = this.p.now();
        ((oj0) yq6Var.b).a(new xq6(this.o.submit(new wi3(3, this, yq6Var, h7bVar, false)), 0, h7bVar));
    }
}
