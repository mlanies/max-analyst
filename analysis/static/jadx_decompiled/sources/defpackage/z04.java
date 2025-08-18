package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class z04 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Object b = new Object();
    public static final c32 c = new c32(18, 0);
    public static xig d;

    public static String I(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        synchronized (b) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    z = false;
                    break;
                }
                try {
                    if (cause instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    cause = cause.getCause();
                } finally {
                }
            }
            if (z) {
                return "UnknownHostException (no network)";
            }
            return Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    public static void J(String str) {
        synchronized (b) {
            c(str, null);
        }
    }

    public static boolean L(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean O(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean P(XmlPullParser xmlPullParser, String str) {
        return O(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static String R(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static xo9 S(gy8 gy8Var) {
        int iN;
        String strP;
        String strP2;
        try {
            iN = lz7.N(gy8Var);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int iS = au1.s(k7d.a);
            if (iS != 0) {
                if (iS != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
            iN = 0;
        }
        if (iN == 0) {
            return null;
        }
        nz4 nz4Var = nz4.a;
        String str = null;
        List listE0 = nz4Var;
        for (int i = 0; i < iN; i++) {
            try {
                strP = lz7.P(gy8Var);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int iS2 = au1.s(k7d.a);
                if (iS2 != 0) {
                    if (iS2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
                strP = null;
            }
            if (strP != null) {
                if (strP.equals("name")) {
                    try {
                        strP2 = lz7.P(gy8Var);
                    } catch (Throwable th3) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = u7d.a.iterator();
                        while (it3.hasNext()) {
                            ((r4a) it3.next()).getClass();
                            r4a.a(th3);
                        }
                        int iS3 = au1.s(k7d.a);
                        if (iS3 != 0) {
                            if (iS3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                        strP2 = null;
                    }
                    if (strP2 != null) {
                        str = strP2;
                    }
                } else if (strP.equals("avatars")) {
                    ArrayList arrayListW = lz7.W(gy8Var, new jj9(16));
                    listE0 = arrayListW != null ? x53.e0(arrayListW) : null;
                    if (listE0 == null) {
                        listE0 = nz4Var;
                    }
                } else {
                    try {
                        gy8Var.z();
                    } catch (Throwable th4) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = u7d.a.iterator();
                        while (it4.hasNext()) {
                            ((r4a) it4.next()).getClass();
                            r4a.a(th4);
                        }
                        int iS4 = au1.s(k7d.a);
                        if (iS4 != 0) {
                            if (iS4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        if (str == null || str.length() == 0 || listE0.isEmpty()) {
            return null;
        }
        if (str != null) {
            return new xo9(str, listE0);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.e T(defpackage.gy8 r13) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z04.T(gy8):e");
    }

    public static void U(bbe bbeVar, int i, pj3 pj3Var) {
        long jI = bbeVar.i(i);
        List listP = bbeVar.p(jI);
        if (listP.isEmpty()) {
            return;
        }
        if (i == bbeVar.u() - 1) {
            throw new IllegalStateException();
        }
        long jI2 = bbeVar.i(i + 1) - bbeVar.i(i);
        if (jI2 > 0) {
            pj3Var.accept(new b04(jI, jI2, listP));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Y(defpackage.bbe r13, defpackage.nbe r14, defpackage.pj3 r15) {
        /*
            long r0 = r14.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r13.g(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r13.u()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r13.i(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L52
            int r2 = r13.u()
            if (r4 >= r2) goto L52
            java.util.List r11 = r13.p(r0)
            long r2 = r13.i(r4)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L52
            long r7 = r14.b
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L52
            b04 r12 = new b04
            long r9 = r2 - r7
            r6 = r12
            r6.<init>(r7, r9, r11)
            r15.accept(r12)
            r2 = 1
            goto L53
        L52:
            r2 = r5
        L53:
            r3 = r4
        L54:
            int r6 = r13.u()
            if (r3 >= r6) goto L60
            U(r13, r3, r15)
            int r3 = r3 + 1
            goto L54
        L60:
            boolean r14 = r14.a
            if (r14 == 0) goto L89
            if (r2 == 0) goto L68
            int r4 = r4 + (-1)
        L68:
            if (r5 >= r4) goto L70
            U(r13, r5, r15)
            int r5 = r5 + 1
            goto L68
        L70:
            if (r2 == 0) goto L89
            b04 r14 = new b04
            java.util.List r11 = r13.p(r0)
            long r7 = r13.i(r4)
            long r2 = r13.i(r4)
            long r9 = r0 - r2
            r6 = r14
            r6.<init>(r7, r9, r11)
            r15.accept(r14)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z04.Y(bbe, nbe, pj3):void");
    }

    public static final Set Z(String str) {
        if (str.length() == 0) {
            return null;
        }
        int iA0 = w9e.A0(str, ",", 0, false, 4);
        if (iA0 == -1) {
            return Collections.singleton(str);
        }
        xs xsVar = new xs(10);
        int i = 0;
        do {
            xsVar.add(str.substring(i, iA0));
            i = iA0 + 1;
            iA0 = w9e.A0(str, ",", i, false, 4);
        } while (iA0 != -1);
        xsVar.add(str.substring(i, str.length()));
        return xsVar;
    }

    public static final int a(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.jte r4, defpackage.c66 r5, java.lang.Throwable r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.ap5
            if (r0 == 0) goto L13
            r0 = r7
            ap5 r0 = (defpackage.ap5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ap5 r0 = new ap5
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.o
            defpackage.od2.a0(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.od2.a0(r7)
            r0.o = r6     // Catch: java.lang.Throwable -> L29
            r0.Y = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            goto L43
        L41:
            e5f r1 = defpackage.e5f.a
        L43:
            return r1
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            defpackage.j47.e(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z04.b(jte, c66, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void c(String str, Throwable th) {
        String strI = I(th);
        if (TextUtils.isEmpty(strI)) {
            return;
        }
        strI.replace("\n", "\n  ");
    }

    public static void c0(String str) {
        synchronized (b) {
            c(str, null);
        }
    }

    public static String d(int i, int i2, String str) {
        if (i < 0) {
            return i24.t("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return i24.t("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(zr6.h(i2, "negative size: "));
    }

    public static void d0(String str, Throwable th) {
        synchronized (b) {
            c(str, th);
        }
    }

    public static final Object e0(ilc ilcVar, m56 m56Var, Continuation continuation) {
        llc llcVar = new llc(ilcVar, m56Var, null);
        v0f v0fVar = (v0f) continuation.getContext().get(v0f.c);
        iu3 iu3Var = v0fVar != null ? v0fVar.a : null;
        if (iu3Var != null) {
            return j47.t0(iu3Var, llcVar, continuation);
        }
        lx3 context = continuation.getContext();
        sy1 sy1Var = new sy1(1, v3c.u(continuation));
        sy1Var.n();
        try {
            qm qmVar = ilcVar.c;
            if (qmVar == null) {
                qmVar = null;
            }
            qmVar.execute(new r8g(5, context, sy1Var, ilcVar, llcVar, false));
        } catch (RejectedExecutionException e) {
            sy1Var.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        return sy1Var.m();
    }

    public static void g(StringBuilder sb, Object obj) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void j(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(i24.t(str, Long.valueOf(j)));
        }
    }

    public static void k(int i, int i2) {
        String strT;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strT = i24.t("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(zr6.h(i2, "negative size: "));
                }
                strT = i24.t("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strT);
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void m(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(d(i, i2, "index"));
        }
    }

    public static void n(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? d(i, i3, "start index") : (i2 < 0 || i2 > i3) ? d(i2, i3, "end index") : i24.t("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static float o(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int p(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static void q(long j, wpa wpaVar, yze[] yzeVarArr) {
        int i;
        while (true) {
            if (wpaVar.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (wpaVar.a() == 0) {
                    i = -1;
                    break;
                }
                int iU = wpaVar.u();
                i2 += iU;
                if (iU != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (wpaVar.a() == 0) {
                    i3 = -1;
                    break;
                }
                int iU2 = wpaVar.u();
                i3 += iU2;
                if (iU2 != 255) {
                    break;
                }
            }
            int i4 = wpaVar.b + i3;
            if (i3 == -1 || i3 > wpaVar.a()) {
                c0("Skipping remainder of malformed SEI NAL unit.");
                i4 = wpaVar.c;
            } else if (i == 4 && i3 >= 8) {
                int iU3 = wpaVar.u();
                int iA = wpaVar.A();
                int iG = iA == 49 ? wpaVar.g() : 0;
                int iU4 = wpaVar.u();
                if (iA == 47) {
                    wpaVar.H(1);
                }
                boolean z = iU3 == 181 && (iA == 49 || iA == 47) && iU4 == 3;
                if (iA == 49) {
                    z &= iG == 1195456820;
                }
                if (z) {
                    r(j, wpaVar, yzeVarArr);
                }
            }
            wpaVar.G(i4);
        }
    }

    public static void r(long j, wpa wpaVar, yze[] yzeVarArr) {
        int iU = wpaVar.u();
        if ((iU & 64) != 0) {
            wpaVar.H(1);
            int i = (iU & 31) * 3;
            int i2 = wpaVar.b;
            for (yze yzeVar : yzeVarArr) {
                wpaVar.G(i2);
                yzeVar.b(wpaVar, i, 0);
                fm9.k(j != -9223372036854775807L);
                yzeVar.a(j, 1, i, 0, null);
            }
        }
    }

    public static void s(Exception exc, String str) {
        synchronized (b) {
            c(str, exc);
        }
    }

    public static void t(String str) {
        synchronized (b) {
            c(str, null);
        }
    }

    public static void u(String str) {
        synchronized (b) {
            c(str, null);
        }
    }

    public static void v(String str, Throwable th) {
        synchronized (b) {
            c(str, th);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static awe w(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return awe.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return awe.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return awe.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return awe.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return awe.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static String x(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static String y(uj3 uj3Var, n10 n10Var) {
        String strD;
        if (uj3Var != null && (strD = uj3Var.d()) != null && strD.length() != 0) {
            String strD2 = uj3Var.d();
            return strD2 == null ? "" : strD2;
        }
        if (n10Var.d.length() <= 0) {
            return "Unknown";
        }
        String str = n10Var.d;
        String str2 = n10Var.e;
        return (str2 == null || str2.isEmpty()) ? str : rh4.j(str, " ", str2);
    }

    public abstract int A();

    public abstract InputFilter[] B(InputFilter[] inputFilterArr);

    public abstract int C();

    public abstract int D();

    public abstract int E();

    public abstract int F(View view);

    public abstract int G(CoordinatorLayout coordinatorLayout);

    public abstract int H();

    public abstract boolean K();

    public abstract boolean M(float f);

    public abstract boolean N(View view);

    public abstract boolean Q(float f, float f2);

    public abstract void V(boolean z);

    public abstract void W(boolean z);

    public abstract boolean X(View view, float f);

    public abstract void a0(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    public abstract void b0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public ok e(Context context, Looper looper, kad kadVar, Object obj, ge6 ge6Var, he6 he6Var) {
        return f(context, looper, kadVar, obj, ge6Var, he6Var);
    }

    public ok f(Context context, Looper looper, kad kadVar, Object obj, ge6 ge6Var, he6 he6Var) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract TransformationMethod f0(TransformationMethod transformationMethod);

    public abstract int h(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float i(int i);

    public abstract int z(ViewGroup.MarginLayoutParams marginLayoutParams);
}
