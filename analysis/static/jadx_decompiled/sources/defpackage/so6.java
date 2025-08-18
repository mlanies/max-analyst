package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes.dex */
public abstract class so6 {
    public static final vi6[] a;
    public static final Map b;

    static {
        vi6 vi6Var = new vi6(vi6.i, "");
        aw0 aw0Var = vi6.f;
        vi6 vi6Var2 = new vi6(aw0Var, HttpGet.METHOD_NAME);
        vi6 vi6Var3 = new vi6(aw0Var, HttpPost.METHOD_NAME);
        aw0 aw0Var2 = vi6.g;
        vi6 vi6Var4 = new vi6(aw0Var2, "/");
        vi6 vi6Var5 = new vi6(aw0Var2, "/index.html");
        aw0 aw0Var3 = vi6.h;
        vi6 vi6Var6 = new vi6(aw0Var3, HttpHost.DEFAULT_SCHEME_NAME);
        vi6 vi6Var7 = new vi6(aw0Var3, "https");
        aw0 aw0Var4 = vi6.e;
        vi6[] vi6VarArr = {vi6Var, vi6Var2, vi6Var3, vi6Var4, vi6Var5, vi6Var6, vi6Var7, new vi6(aw0Var4, "200"), new vi6(aw0Var4, "204"), new vi6(aw0Var4, "206"), new vi6(aw0Var4, "304"), new vi6(aw0Var4, "400"), new vi6(aw0Var4, "404"), new vi6(aw0Var4, "500"), new vi6("accept-charset", ""), new vi6("accept-encoding", "gzip, deflate"), new vi6("accept-language", ""), new vi6("accept-ranges", ""), new vi6("accept", ""), new vi6("access-control-allow-origin", ""), new vi6("age", ""), new vi6("allow", ""), new vi6("authorization", ""), new vi6("cache-control", ""), new vi6("content-disposition", ""), new vi6("content-encoding", ""), new vi6("content-language", ""), new vi6("content-length", ""), new vi6("content-location", ""), new vi6("content-range", ""), new vi6("content-type", ""), new vi6("cookie", ""), new vi6("date", ""), new vi6("etag", ""), new vi6("expect", ""), new vi6(ClientCookie.EXPIRES_ATTR, ""), new vi6("from", ""), new vi6("host", ""), new vi6("if-match", ""), new vi6("if-modified-since", ""), new vi6("if-none-match", ""), new vi6("if-range", ""), new vi6("if-unmodified-since", ""), new vi6("last-modified", ""), new vi6("link", ""), new vi6("location", ""), new vi6("max-forwards", ""), new vi6("proxy-authenticate", ""), new vi6("proxy-authorization", ""), new vi6("range", ""), new vi6("referer", ""), new vi6("refresh", ""), new vi6("retry-after", ""), new vi6("server", ""), new vi6("set-cookie", ""), new vi6("strict-transport-security", ""), new vi6("transfer-encoding", ""), new vi6("user-agent", ""), new vi6("vary", ""), new vi6("via", ""), new vi6("www-authenticate", "")};
        a = vi6VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(vi6VarArr[i].b)) {
                linkedHashMap.put(vi6VarArr[i].b, Integer.valueOf(i));
            }
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(aw0 aw0Var) throws IOException {
        int iC = aw0Var.c();
        for (int i = 0; i < iC; i++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte bF = aw0Var.f(i);
            if (b2 <= bF && b3 >= bF) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(aw0Var.j()));
            }
        }
    }
}
