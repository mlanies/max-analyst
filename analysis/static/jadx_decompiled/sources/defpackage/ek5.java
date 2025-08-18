package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class ek5 implements kq6 {
    public static final rl8 d;
    public static final rl8 e;
    public static final Pattern f;
    public final je7 a;
    public final khe b;
    public final w0f c;

    static {
        rl8 rl8VarA;
        Pattern pattern = rl8.d;
        rl8 rl8VarA2 = null;
        try {
            rl8VarA = fm9.A("application/x-binary; charset=x-user-defined");
        } catch (IllegalArgumentException unused) {
            rl8VarA = null;
        }
        d = rl8VarA;
        try {
            rl8VarA2 = fm9.A("application/octet-stream");
        } catch (IllegalArgumentException unused2) {
        }
        e = rl8VarA2;
        try {
            fm9.A("multipart/form-data");
        } catch (IllegalArgumentException unused3) {
        }
        f = Pattern.compile("^([0-9]+)-([0-9]+)/([0-9]+)");
    }

    public ek5(je7 je7Var, w0f w0fVar) {
        this.a = je7Var;
        this.c = w0fVar;
        this.b = new khe(new z30(13, je7Var));
    }

    public static void a(ek5 ek5Var, pad padVar, boolean z, String str) {
        padVar.d = z;
        padVar.e = str;
        w0f w0fVar = ek5Var.c;
        padVar.g = w0fVar.b();
        w0fVar.a(padVar.a());
    }

    public static long c(yic yicVar) throws ck5 {
        String strA;
        try {
            strA = yicVar.Y.a("X-Reason");
        } catch (Exception unused) {
        }
        if (strA == null) {
            strA = null;
        }
        eq6 eq6VarJ = nu0.j(yicVar.o, strA);
        if (nu0.b.equals(eq6VarJ) || nu0.c.equals(eq6VarJ)) {
            hm9.k0("ek5", null, "getErrorUploadPositionFromResponse not loaded yet, starting upload from 0", Arrays.copyOf(new Object[0], 0));
            return 0L;
        }
        if (nu0.Z.equals(eq6VarJ) || nu0.X.equals(eq6VarJ)) {
            hm9.k0("ek5", null, "getErrorUploadPositionFromResponse forbidden or bad request", Arrays.copyOf(new Object[]{eq6VarJ}, 1));
            return -1L;
        }
        hm9.k0("ek5", null, "getErrorUploadPositionFromResponse", Arrays.copyOf(new Object[]{eq6VarJ}, 1));
        throw new ck5(eq6VarJ);
    }

    public static long e(yic yicVar) {
        cj6 cj6Var = yicVar.Y;
        String strA = cj6Var.a("X-Last-Known-Byte");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return 0L;
        }
        String strA2 = cj6Var.a("X-Last-Known-Byte");
        try {
            return Long.parseLong(strA2 != null ? strA2 : null) + 1;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static void f(tq6 tq6Var) {
        if (tq6Var.s0.get()) {
            return;
        }
        tq6Var.Y.b(new nn6(1, tq6Var));
    }

    public final mhc b(File file, String str, vq6 vq6Var, rl8 rl8Var, long j, pad padVar, tq6 tq6Var, int i) {
        l84 l84Var = new l84();
        l84Var.a = vq6Var;
        l84Var.Q(UUID.randomUUID().toString());
        int i2 = bh3.$EnumSwitchMapping$0[this.c.c().ordinal()];
        dk5 dk5Var = new dk5(file, rl8Var, j, padVar, tq6Var, (i2 == 1 || i2 == 2) ? 32768 : i2 != 3 ? 4096 : 16384);
        if (i != 5) {
            String string = TextUtils.isEmpty(str) ? Integer.toString(file.getName().hashCode()) : Uri.encode(str);
            Locale locale = Locale.ENGLISH;
            long length = file.length();
            StringBuilder sbK = au1.k(j, "bytes ", "-/");
            sbK.append(length);
            String string2 = sbK.toString();
            String strI = wg0.i("attachment; filename=", string);
            ((bj6) l84Var.c).a("Content-Range", string2);
            ((bj6) l84Var.c).a("Content-Disposition", strI);
            l84Var.G(HttpPost.METHOD_NAME, dk5Var);
            return l84Var.r();
        }
        String name = TextUtils.isEmpty(str) ? file.getName() : Uri.encode(str);
        String string3 = UUID.randomUUID().toString();
        aw0 aw0Var = new aw0(string3.getBytes(a52.a));
        aw0Var.b = string3;
        rl8 rl8Var2 = rg9.l;
        ArrayList arrayList = new ArrayList();
        rl8 rl8Var3 = rg9.l;
        if (!tpa.f(rl8Var3.b, "multipart")) {
            throw new IllegalArgumentException(("multipart != " + rl8Var3).toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=");
        mr0.a(sb, "file");
        if (name != null) {
            sb.append("; filename=");
            mr0.a(sb, name);
        }
        String string4 = sb.toString();
        ArrayList arrayList2 = new ArrayList(20);
        ngg.l("Content-Disposition");
        arrayList2.add("Content-Disposition");
        arrayList2.add(w9e.b1(string4).toString());
        Object[] array = arrayList2.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        cj6 cj6Var = new cj6((String[]) array);
        if (cj6Var.a(HTTP.CONTENT_TYPE) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
        }
        if (cj6Var.a(HTTP.CONTENT_LEN) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
        }
        arrayList.add(new qg9(cj6Var, dk5Var));
        if (!(!arrayList.isEmpty())) {
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }
        rg9 rg9Var = new rg9(aw0Var, rl8Var3, naf.w(arrayList));
        Locale locale2 = Locale.ENGLISH;
        String strI2 = wg0.i("attachment; filename=", name);
        ((bj6) l84Var.c).a("Content-type", rl8Var3.a);
        ((bj6) l84Var.c).a("Content-Disposition", strI2);
        l84Var.G(HttpPost.METHOD_NAME, rg9Var);
        return l84Var.r();
    }

    public final long d(vq6 vq6Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList(20);
        String string = UUID.randomUUID().toString();
        if (string == null) {
            linkedHashMap.remove(Object.class);
        } else {
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put(Object.class, Object.class.cast(string));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        cj6 cj6Var = new cj6((String[]) array);
        byte[] bArr = naf.a;
        yic yicVarF = ((u2a) this.a.getValue()).b(new mhc(vq6Var, HttpGet.METHOD_NAME, cj6Var, null, linkedHashMap.isEmpty() ? oz4.a : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)))).f();
        i8c i8cVar = yicVarF.Z;
        try {
            if (!yicVarF.m() || i8cVar == null) {
                long jC = c(yicVarF);
                if (i8cVar != null) {
                    i8cVar.close();
                }
                return jC;
            }
            String strU = i8cVar.U();
            hm9.n("ek5", "getUploadPosition body result: ".concat(strU));
            Matcher matcher = f.matcher(strU);
            if (matcher.find()) {
                long j = Long.parseLong(matcher.group(2));
                hm9.n("ek5", "getUploadPosition result: ".concat(strU));
                i8cVar.close();
                return j;
            }
            hm9.p("ek5", "getUploadPosition unexpected response from server, range not found: ".concat(strU), null);
            this.c.d("unexpected range header: ".concat(strU));
            i8cVar.close();
            return -1L;
        } catch (Throwable th) {
            if (i8cVar != null) {
                try {
                    i8cVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final long g(vq6 vq6Var) {
        l84 l84Var = new l84();
        l84Var.a = vq6Var;
        l84Var.Q(UUID.randomUUID().toString());
        l84Var.G(HttpPost.METHOD_NAME, new ak5(0));
        yic yicVarF = ((u2a) this.a.getValue()).b(l84Var.r()).f();
        i8c i8cVar = yicVarF.Z;
        try {
            if (yicVarF.m()) {
                return e(yicVarF);
            }
            long jC = c(yicVarF);
            if (i8cVar != null) {
                i8cVar.close();
            }
            return jC;
        } finally {
            if (i8cVar != null) {
                i8cVar.close();
            }
        }
    }
}
