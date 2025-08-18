package defpackage;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.api.core.ApiResponseException;
import ru.ok.android.api.http.HttpStatusApiException;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonSyntaxException;

/* loaded from: classes2.dex */
public final class up6 implements vk {
    public final xxc a;
    public final jt3 b = new jt3(2);
    public final crd c = crd.s0;
    public final yxc d = mw3.a;
    public hl e = hl.a;

    public up6(xxc xxcVar) {
        this.a = xxcVar;
    }

    public final Object a(yk ykVar, wk wkVar) throws IOException, ApiException {
        lq6 lq6Var;
        lq6 lq6Var2;
        crd crdVar = this.c;
        try {
            this.e.debugApiRequest(this, ykVar, wkVar);
            a8g a8gVarB = b(ykVar, wkVar);
            zs zsVar = (zs) a8gVarB.c;
            this.a.getClass();
            rq6 rq6VarK = xxc.k(a8gVarB);
            zs zsVar2 = (zs) rq6VarK.c;
            int i = rq6VarK.b;
            try {
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    v3c.i(rq6VarK, th);
                    throw th2;
                }
            }
            if (i != 200) {
                throw new HttpStatusApiException(i);
            }
            try {
                k36 k36Var = (k36) rq6VarK.o;
                k36Var.getClass();
                eb7 eb7VarA = eb7.a(new BufferedInputStream(((HttpURLConnection) k36Var.b).getInputStream()));
                if (zsVar2.a(SM.SET_COOKIE)) {
                    yxc yxcVar = this.d;
                    mw3.a(zsVar2);
                    yxcVar.getClass();
                }
                if (zsVar2.a("Invocation-Error") || zsVar2.a("WMF-Invocation-Error")) {
                    try {
                        throw ((Throwable) ykVar.getFailParser().parse(this.e.debugApiResponseFail(this, ykVar, eb7VarA)));
                    } catch (JsonParseException e) {
                        throw new ApiResponseException(e);
                    }
                }
                int i2 = 0;
                try {
                    try {
                        Object obj = ykVar.getOkParser().parse(this.e.debugApiResponseOk(this, ykVar, eb7VarA));
                        lq6[] lq6VarArr = (lq6[]) zsVar.b;
                        int length = lq6VarArr.length;
                        while (true) {
                            if (i2 >= length) {
                                lq6Var2 = null;
                                break;
                            }
                            lq6Var2 = lq6VarArr[i2];
                            if (eae.k0(lq6Var2.a, "Geo-Position", true)) {
                                break;
                            }
                            i2++;
                        }
                        if ((lq6Var2 != null ? lq6Var2.b : null) != null) {
                            crdVar.getClass();
                        }
                        v3c.i(rq6VarK, null);
                        return obj;
                    } catch (Throwable th3) {
                        lq6[] lq6VarArr2 = (lq6[]) zsVar.b;
                        int length2 = lq6VarArr2.length;
                        while (true) {
                            if (i2 >= length2) {
                                lq6Var = null;
                                break;
                            }
                            lq6Var = lq6VarArr2[i2];
                            if (eae.k0(lq6Var.a, "Geo-Position", true)) {
                                break;
                            }
                            i2++;
                        }
                        if ((lq6Var != null ? lq6Var.b : null) != null) {
                            crdVar.getClass();
                        }
                        throw th3;
                    }
                } catch (JsonParseException e2) {
                    throw new ApiResponseException(e2);
                } catch (JsonSyntaxException e3) {
                    throw new ApiResponseException(e3);
                }
            } catch (JsonSyntaxException e4) {
                throw new ApiResponseException(e4);
            }
            throw th;
        } catch (IOException e5) {
            this.e.debugIoException(this, ykVar, e5);
            throw e5;
        } catch (ApiException e6) {
            this.e.debugApiException(this, ykVar, e6);
            throw e6;
        }
    }

    public final a8g b(fl flVar, wk wkVar) throws IOException, ApiRequestException {
        String string;
        pkg pkgVar;
        String str;
        ArrayList arrayList = new ArrayList();
        flVar.getPriority();
        boolean zShouldPost = flVar.shouldPost();
        jt3 jt3Var = this.b;
        if (zShouldPost) {
            string = jt3Var.a(flVar).toString();
            arrayList.add(new lq6(HTTP.CONTENT_TYPE, URLEncodedUtils.CONTENT_TYPE));
            if (flVar.shouldGzip()) {
                arrayList.add(new lq6(HTTP.CONTENT_ENCODING, "gzip"));
            }
            int i = (string.equals("https") || eae.o0(string, "https:", false)) ? 2 : 1;
            pkgVar = new pkg();
            pkgVar.o = this;
            pkgVar.a = flVar;
            pkgVar.c = wkVar;
            pkgVar.b = i;
            str = HttpPost.METHOD_NAME;
        } else {
            string = jt3Var.a(flVar).toString();
            int i2 = 3;
            if (wp6.$EnumSwitchMapping$0[au1.s(3)] == 1) {
                i2 = (string.equals("https") || eae.o0(string, "https:", false)) ? 2 : 1;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            jt3Var.f(byteArrayOutputStream, flVar, wkVar, i2);
            if (byteArrayOutputStream.size() != 0) {
                StringBuilder sbO = rh4.o(string, w9e.z0(string, '?', 0, false, 6) < 0 ? "?" : "&");
                sbO.append(byteArrayOutputStream.toString("UTF-8"));
                string = sbO.toString();
            }
            pkgVar = null;
            str = HttpGet.METHOD_NAME;
        }
        if (flVar instanceof bl0) {
            String str2 = ((bl0) flVar).a;
            if (str2 != null) {
                "batch.executeV2-".concat(str2);
            }
        } else {
            Uri uri = flVar.getUri();
            if (tpa.f(uri.getScheme(), "ok") && tpa.f(uri.getAuthority(), "api")) {
                sl.b(uri);
            } else {
                uri.getPath();
            }
        }
        if (tpa.f(flVar.getUri().getAuthority(), "api")) {
            this.c.getClass();
            this.d.getClass();
        }
        arrayList.add(new lq6("Accept", "application/json"));
        if (string != null) {
            return new a8g(str, string, new zs(1, (lq6[]) arrayList.toArray(new lq6[0])), pkgVar);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
