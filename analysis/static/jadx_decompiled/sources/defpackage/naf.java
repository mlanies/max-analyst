package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.http.auth.AUTH;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public abstract class naf {
    public static final byte[] a;
    public static final cj6 b = ngg.C(new String[0]);
    public static final i8c c;
    public static final vma d;
    public static final TimeZone e;
    public static final qec f;
    public static final String g;

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0137, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.naf.<clinit>():void");
    }

    public static final boolean a(vq6 vq6Var, vq6 vq6Var2) {
        return tpa.f(vq6Var.e, vq6Var2.e) && vq6Var.f == vq6Var2.f && tpa.f(vq6Var.b, vq6Var2.b);
    }

    public static final int b(TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(10L);
        if (millis > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) throws IOException {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!tpa.f(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(char c2, int i, int i2, String str) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (w9e.q0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int g(String str, char c2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return e(c2, i, i2, str);
    }

    public static final String h(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(yic yicVar) {
        String strA = yicVar.Y.a(HTTP.CONTENT_LEN);
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        return Collections.unmodifiableList(y53.M(Arrays.copyOf(objArr2, objArr2.length)));
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (tpa.m(cCharAt, 31) <= 0 || tpa.m(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int n(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean p(String str) {
        return str.equalsIgnoreCase(AUTH.WWW_AUTH_RESP) || str.equalsIgnoreCase(SM.COOKIE) || str.equalsIgnoreCase(AUTH.PROXY_AUTH_RESP) || str.equalsIgnoreCase(SM.SET_COOKIE);
    }

    public static final int q(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        return -1;
    }

    public static final Charset r(fu0 fu0Var, Charset charset) {
        Charset charsetForName;
        int iD0 = fu0Var.d0(d);
        if (iD0 == -1) {
            return charset;
        }
        if (iD0 == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iD0 == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iD0 == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iD0 == 3) {
            Charset charset2 = a52.a;
            charsetForName = a52.d;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32BE");
                a52.d = charsetForName;
            }
        } else {
            if (iD0 != 4) {
                throw new AssertionError();
            }
            Charset charset3 = a52.a;
            charsetForName = a52.c;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32LE");
                a52.c = charsetForName;
            }
        }
        return charsetForName;
    }

    public static final int s(fu0 fu0Var) {
        return (fu0Var.readByte() & 255) | ((fu0Var.readByte() & 255) << 16) | ((fu0Var.readByte() & 255) << 8);
    }

    public static final boolean t(yud yudVar, int i, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        long jC = yudVar.p().e() ? yudVar.p().c() - jNanoTime : Long.MAX_VALUE;
        yudVar.p().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            bt0 bt0Var = new bt0();
            while (yudVar.c(bt0Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                bt0Var.m();
            }
            if (jC == Long.MAX_VALUE) {
                yudVar.p().a();
            } else {
                yudVar.p().d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                yudVar.p().a();
            } else {
                yudVar.p().d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                yudVar.p().a();
            } else {
                yudVar.p().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final cj6 u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vi6 vi6Var = (vi6) it.next();
            String strJ = vi6Var.b.j();
            String strJ2 = vi6Var.c.j();
            arrayList.add(strJ);
            arrayList.add(w9e.b1(strJ2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new cj6((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String v(defpackage.vq6 r3, boolean r4) {
        /*
            java.lang.String r0 = r3.e
            r1 = 0
            java.lang.String r2 = ":"
            boolean r1 = defpackage.w9e.p0(r0, r2, r1)
            if (r1 == 0) goto L1e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r1.<init>(r2)
            r1.append(r0)
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L1e:
            int r1 = r3.f
            if (r4 != 0) goto L4c
            java.lang.String r3 = r3.b
            int r4 = r3.hashCode()
            r2 = 3213448(0x310888, float:4.503E-39)
            if (r4 == r2) goto L3e
            r2 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r4 == r2) goto L33
            goto L49
        L33:
            java.lang.String r4 = "https"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L49
            r3 = 443(0x1bb, float:6.21E-43)
            goto L4a
        L3e:
            java.lang.String r4 = "http"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L49
            r3 = 80
            goto L4a
        L49:
            r3 = -1
        L4a:
            if (r1 == r3) goto L60
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r4 = 58
            r3.append(r4)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.naf.v(vq6, boolean):java.lang.String");
    }

    public static final List w(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static final int x(int i, String str) {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String y(int i, int i2, String str) {
        int iM = m(i, i2, str);
        return str.substring(iM, n(iM, i2, str));
    }

    public static final void z(Exception exc, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j47.e(exc, (Exception) it.next());
        }
    }
}
