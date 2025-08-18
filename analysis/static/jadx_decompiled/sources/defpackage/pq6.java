package defpackage;

import org.json.HTTP;

/* loaded from: classes2.dex */
public final class pq6 {
    public final qq6 a;
    public final String b;

    public pq6(String str, String str2, String str3, qq6 qq6Var) {
        this.a = qq6Var;
        StringBuilder sb = new StringBuilder();
        sb.append("Content-Disposition: form-data; name=");
        nq6.a(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            nq6.a(sb, str2);
        }
        sb.append(HTTP.CRLF);
        if (str3 != null) {
            sb.append("Content-Type: ");
            sb.append(str3);
            sb.append(HTTP.CRLF);
        }
        this.b = sb.toString();
    }
}
