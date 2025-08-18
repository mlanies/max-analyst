package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class ab4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb4 b;

    public /* synthetic */ ab4(bb4 bb4Var, int i) {
        this.a = i;
        this.b = bb4Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.a) {
            case 0:
                bb4 bb4Var = this.b;
                synchronized (bb4Var) {
                    try {
                        nj6 nj6Var = (nj6) bb4Var.a.get();
                        ArrayList arrayListC = nj6Var.c();
                        nj6Var.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListC.size(); i++) {
                            oa0 oa0Var = (oa0) arrayListC.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", oa0Var.a);
                            jSONObject.put("dates", new JSONArray((Collection<?>) oa0Var.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put(ClientCookie.VERSION_ATTR, "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return string;
            default:
                bb4 bb4Var2 = this.b;
                synchronized (bb4Var2) {
                    ((nj6) bb4Var2.a.get()).h(System.currentTimeMillis(), ((ef4) bb4Var2.c.get()).a());
                }
                return null;
        }
    }
}
