package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.net.ProtocolException;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class m8c implements j3g, l3g {
    public static final List x = Collections.singletonList(sob.HTTP_1_1);
    public final String a;
    public b8c b;
    public l8c c;
    public m3g d;
    public n3g e;
    public final coe f;
    public String g;
    public e8c h;
    public long k;
    public boolean l;
    public String n;
    public boolean o;
    public int p;
    public boolean q;
    public final mhc r;
    public final frf s;
    public final Random t;
    public final long u;
    public final long w;
    public k3g v = null;
    public final ArrayDeque i = new ArrayDeque();
    public final ArrayDeque j = new ArrayDeque();
    public int m = -1;

    public m8c(foe foeVar, mhc mhcVar, frf frfVar, Random random, long j, long j2) {
        this.r = mhcVar;
        this.s = frfVar;
        this.t = random;
        this.u = j;
        this.w = j2;
        this.f = foeVar.f();
        String str = mhcVar.c;
        if (!HttpGet.METHOD_NAME.equals(str)) {
            throw new IllegalArgumentException(wg0.i("Request must be GET: ", str).toString());
        }
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.a = oq9.k(bArr).a();
    }

    public final void a(yic yicVar, od odVar) {
        int i = yicVar.o;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(rh4.m(sb, yicVar.c, '\''));
        }
        cj6 cj6Var = yicVar.Y;
        String strA = cj6Var.a(HTTP.CONN_DIRECTIVE);
        if (strA == null) {
            strA = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strA)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strA + '\'');
        }
        String strA2 = cj6Var.a("Upgrade");
        if (strA2 == null) {
            strA2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strA2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strA2 + '\'');
        }
        String strA3 = cj6Var.a("Sec-WebSocket-Accept");
        String str = strA3 != null ? strA3 : null;
        String strA4 = new aw0(MessageDigest.getInstance("SHA-1").digest(zr6.l(new StringBuilder(), this.a, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes(a52.a))).a();
        if (!(!tpa.f(strA4, str))) {
            if (odVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA4 + "' but was '" + str + '\'');
    }

    public final boolean b(int i, String str) {
        String str2;
        synchronized (this) {
            aw0 aw0Var = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || 1006 < i) && (1015 > i || 2999 < i)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    aw0Var = new aw0(str.getBytes(a52.a));
                    aw0Var.b = str;
                    if (r1.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.o && !this.l) {
                    this.l = true;
                    this.j.add(new j8c(i, aw0Var));
                    f();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public final void c(Exception exc) {
        synchronized (this) {
            if (this.o) {
                return;
            }
            this.o = true;
            e8c e8cVar = this.h;
            this.h = null;
            m3g m3gVar = this.d;
            this.d = null;
            n3g n3gVar = this.e;
            this.e = null;
            this.f.e();
            try {
                hrf hrfVar = ((grf) this.s.a).b;
                hrfVar.q.o("handleWebSocketFailure");
                hrfVar.n.onFailedByException(exc);
                hrfVar.d();
            } finally {
                if (e8cVar != null) {
                    naf.c(e8cVar);
                }
                if (m3gVar != null) {
                    naf.c(m3gVar);
                }
                if (n3gVar != null) {
                    naf.c(n3gVar);
                }
            }
        }
    }

    public final void d(String str, e8c e8cVar) {
        k3g k3gVar = this.v;
        synchronized (this) {
            try {
                this.g = str;
                this.h = e8cVar;
                this.e = new n3g((x7c) e8cVar.b, this.t, k3gVar.a, k3gVar.c, this.w);
                this.c = new l8c(this);
                long j = this.u;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.f.c(new ap6(str.concat(" ping"), nanos, this), nanos);
                }
                if (!this.j.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = new m3g((y7c) e8cVar.a, this, k3gVar.a, k3gVar.e);
    }

    public final void e() {
        while (this.m == -1) {
            m3g m3gVar = this.d;
            m3gVar.n();
            if (!m3gVar.X) {
                int i = m3gVar.b;
                if (i != 1 && i != 2) {
                    byte[] bArr = naf.a;
                    throw new ProtocolException("Unknown opcode: ".concat(Integer.toHexString(i)));
                }
                while (!m3gVar.a) {
                    long j = m3gVar.c;
                    if (j > 0) {
                        m3gVar.v0.Q(m3gVar.s0, j);
                    }
                    if (m3gVar.o) {
                        if (m3gVar.Y) {
                            eu8 eu8Var = m3gVar.t0;
                            if (eu8Var == null) {
                                eu8Var = new eu8(m3gVar.y0, 1);
                                m3gVar.t0 = eu8Var;
                            }
                            bt0 bt0Var = m3gVar.s0;
                            bt0 bt0Var2 = eu8Var.b;
                            if (bt0Var2.b != 0) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            boolean z = eu8Var.c;
                            Inflater inflater = (Inflater) eu8Var.o;
                            if (z) {
                                inflater.reset();
                            }
                            bt0Var2.t0(bt0Var);
                            bt0Var2.x0(65535);
                            long bytesRead = inflater.getBytesRead() + bt0Var2.b;
                            do {
                                ((c07) eu8Var.X).a(bt0Var, Long.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        if (i == 1) {
                            l3g l3gVar = m3gVar.w0;
                            String strP0 = m3gVar.s0.p0();
                            hrf hrfVar = ((grf) ((m8c) l3gVar).s.a).b;
                            b9b b9bVar = hrfVar.q;
                            if (((b4c) b9bVar.c).shouldHideSensitiveInformation()) {
                                ((a4c) b9bVar.b).log("OKWSSignaling", wg0.i(" <- ", c37.n(strP0)));
                            } else {
                                ((a4c) b9bVar.b).log("OKWSSignaling", " <- ".concat(strP0));
                            }
                            hrfVar.n.onMessageReceived();
                            if (hrfVar.r > 0) {
                                hrfVar.d.removeMessages(2);
                                synchronized (hrfVar.b) {
                                    try {
                                        if (hrfVar.c != null) {
                                            hrfVar.d.sendEmptyMessageDelayed(2, hrfVar.r);
                                        }
                                    } finally {
                                    }
                                }
                            }
                            if (strP0.equals("ping")) {
                                synchronized (hrfVar.b) {
                                    try {
                                        if (hrfVar.c != null) {
                                            hrfVar.j = SystemClock.elapsedRealtime();
                                            ((m8c) hrfVar.c).g("pong");
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                try {
                                    JSONObject jSONObject = new JSONObject(strP0);
                                    String strOptString = jSONObject.optString("type", null);
                                    String strOptString2 = jSONObject.optString("error", null);
                                    if ("error".equals(strOptString) && "conversation-ended".equals(strOptString2)) {
                                        hrfVar.b();
                                    }
                                    long jOptLong = jSONObject.optLong("stamp", 0L);
                                    if (jOptLong > 0) {
                                        synchronized (hrfVar.b) {
                                            hrfVar.l = Math.max(jOptLong, hrfVar.l);
                                        }
                                    }
                                    sy4 sy4Var = hrfVar.m;
                                    if (sy4Var != null) {
                                        ((rod) sy4Var.b).f(jSONObject);
                                    }
                                    String strOptString3 = jSONObject.optString("notification", null);
                                    String strOptString4 = jSONObject.optString(ApiProtocol.KEY_ENDPOINT, null);
                                    if ("notification".equals(strOptString) && "connection".equals(strOptString3) && strOptString4 != null) {
                                        synchronized (hrfVar.b) {
                                            hrfVar.h = hrf.c(Uri.parse(strOptString4).buildUpon(), hrfVar.p);
                                        }
                                    }
                                } catch (JSONException e) {
                                    ((a4c) hrfVar.q.b).reportException("OKWSSignaling", "ws.signaling.json", e);
                                } catch (Throwable th) {
                                    ((a4c) hrfVar.q.b).reportException("OKWSSignaling", "ws.signaling.unexpected_throwable", th);
                                }
                            }
                        } else {
                            l3g l3gVar2 = m3gVar.w0;
                            bt0 bt0Var3 = m3gVar.s0;
                            bt0Var3.e(bt0Var3.b);
                            ((m8c) l3gVar2).s.getClass();
                        }
                    } else {
                        while (!m3gVar.a) {
                            m3gVar.n();
                            if (!m3gVar.X) {
                                break;
                            } else {
                                m3gVar.m();
                            }
                        }
                        if (m3gVar.b != 0) {
                            int i2 = m3gVar.b;
                            byte[] bArr2 = naf.a;
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(Integer.toHexString(i2)));
                        }
                    }
                }
                throw new IOException("closed");
            }
            m3gVar.m();
        }
    }

    public final void f() {
        byte[] bArr = naf.a;
        l8c l8cVar = this.c;
        if (l8cVar != null) {
            this.f.c(l8cVar, 0L);
        }
    }

    public final boolean g(String str) {
        aw0 aw0Var = new aw0(str.getBytes(a52.a));
        aw0Var.b = str;
        synchronized (this) {
            if (!this.o && !this.l) {
                long j = this.k;
                if (r1.length + j > 16777216) {
                    b(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, null);
                    return false;
                }
                this.k = j + r1.length;
                this.j.add(new k8c(aw0Var));
                f();
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:32:0x0083, B:33:0x0088, B:36:0x008e, B:37:0x0097, B:39:0x00a4, B:44:0x00ab, B:45:0x00ac, B:46:0x00ad, B:47:0x00b4, B:48:0x00b5, B:51:0x00bb, B:81:0x0131, B:83:0x0135, B:92:0x014b, B:93:0x014d, B:69:0x00e6, B:73:0x010b, B:74:0x0114, B:70:0x00fa, B:75:0x0115, B:77:0x011f, B:78:0x0126, B:94:0x014e, B:95:0x0155, B:96:0x0156, B:97:0x015b, B:80:0x012e, B:38:0x0098), top: B:107:0x007f, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0141 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0146 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [n3g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8c.h():boolean");
    }
}
