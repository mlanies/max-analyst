package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class dhg implements Runnable {
    public static final jn c = new jn("RevokeAccessOperation", new String[0]);
    public final String a;
    public final a2e b;

    public dhg(String str) {
        fp3.j(str);
        this.a = str;
        this.b = new a2e(null);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        jn jnVar = c;
        Status status = Status.Z;
        try {
            String strValueOf = String.valueOf(this.a);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strValueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(strValueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty(HTTP.CONTENT_TYPE, URLEncodedUtils.CONTENT_TYPE);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.X;
            } else {
                jnVar.r("Unable to revoke access!", new Object[0]);
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            String string = sb.toString();
            Object[] objArr = new Object[0];
            if (jnVar.b <= 3) {
                jnVar.r(string, objArr);
            }
        } catch (IOException e) {
            String strValueOf2 = String.valueOf(e.toString());
            jnVar.r(strValueOf2.length() != 0 ? "IOException when revoking access: ".concat(strValueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            String strValueOf3 = String.valueOf(e2.toString());
            jnVar.r(strValueOf3.length() != 0 ? "Exception when revoking access: ".concat(strValueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.b.S(status);
    }
}
