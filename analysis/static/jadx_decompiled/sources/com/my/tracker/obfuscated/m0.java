package com.my.tracker.obfuscated;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.c0;
import defpackage.b46;
import defpackage.bj6;
import defpackage.fm9;
import defpackage.i8c;
import defpackage.l84;
import defpackage.mhc;
import defpackage.rl8;
import defpackage.yic;
import java.io.ByteArrayOutputStream;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class m0 extends c0 {
    static final rl8 d;
    final c0.a a;
    final MyTrackerConfig.OkHttpClientProvider b;
    final boolean c;

    static {
        rl8 rl8VarA;
        Pattern pattern = rl8.d;
        try {
            rl8VarA = fm9.A("application/octet-stream");
        } catch (IllegalArgumentException unused) {
            rl8VarA = null;
        }
        d = rl8VarA;
    }

    public m0(c0.a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {
        this.a = aVar;
        this.b = okHttpClientProvider;
        this.c = z;
    }

    @Override // com.my.tracker.obfuscated.c0
    public c0.b a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        c0.b bVarC = c0.b.c();
        yic yicVar = null;
        try {
            y0.a("OkHttpPostRequest: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    if (this.c) {
                        y0.a("OkHttpPostRequest: populating post request body using gzip");
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            this.a.a(gZIPOutputStream);
                            gZIPOutputStream.finish();
                        } catch (Throwable th) {
                            th = th;
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                    } else {
                        y0.a("OkHttpPostRequest: populating post request body without using gzip");
                        this.a.a(byteArrayOutputStream);
                        byteArrayOutputStream.flush();
                        gZIPOutputStream = null;
                    }
                    l84 l84Var = new l84();
                    l84Var.S(str);
                    ((bj6) l84Var.c).h(HTTP.CONTENT_ENCODING, "gzip");
                    l84Var.G(HttpPost.METHOD_NAME, b46.n(byteArrayOutputStream.toByteArray(), d, 6));
                    mhc mhcVarR = l84Var.r();
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    byteArrayOutputStream.close();
                    yic yicVarF = this.b.getOkHttpClient().b(mhcVarR).f();
                    try {
                        int i = yicVarF.o;
                        if (i == 200 || i == 204) {
                            y0.a("OkHttpPostRequest: response successfully received");
                            bVarC.a = true;
                        } else {
                            y0.a("OkHttpPostRequest error: response code " + i);
                            bVarC.a = false;
                        }
                        if (i == 200) {
                            y0.a("OkHttpPostRequest: processing server response");
                            i8c i8cVar = yicVarF.Z;
                            String strU = i8cVar != null ? i8cVar.U() : null;
                            if (TextUtils.isEmpty(strU)) {
                                y0.a("OkHttpPostRequest: response data is empty");
                            } else {
                                bVarC.b = strU;
                            }
                        }
                        yicVarF.close();
                        return bVarC;
                    } catch (Throwable th2) {
                        yicVar = yicVarF;
                        th = th2;
                        try {
                            y0.a("OkHttpPostRequest error: error while sending data", th);
                            bVarC.a = false;
                            bVarC.c = "OkHttpPostRequest error: error while sending data";
                            return bVarC;
                        } finally {
                            if (yicVar != null) {
                                yicVar.close();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
                gZIPOutputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
