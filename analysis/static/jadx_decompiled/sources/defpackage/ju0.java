package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.MissingFieldException;
import org.apache.http.HttpStatus;
import org.xmlpull.v1.XmlPullParser;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public abstract class ju0 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, MultiFileUploader.MSG_TRY_UPLOAD_NEXT, 1000, 960, 800, 800, 480, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST, 2048};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final int[] c = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean A(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final boolean B(String str) {
        return eae.o0(str, "mailto:", false);
    }

    public static final boolean C(String str) {
        return eae.o0(str, "tel:", false);
    }

    public static zh6 D() {
        if (dy7.a != null) {
            return dy7.a;
        }
        synchronized (dy7.class) {
            try {
                if (dy7.a == null) {
                    dy7.a = new zh6(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dy7.a;
    }

    public static void E(Intent intent, ArrayList arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, (Uri) arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new ClipData.Item((Uri) arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.w3 F(defpackage.s02 r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = defpackage.ju0.a
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r8) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            w3 r1 = new w3
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.F(s02):w3");
    }

    public static boolean H(ma5 ma5Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        long jX = ma5Var.x();
        long j = -1;
        int i2 = (jX > (-1L) ? 1 : (jX == (-1L) ? 0 : -1));
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i2 != 0 && jX <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = jX;
        }
        int i3 = (int) j2;
        yaf yafVar = new yaf(64);
        boolean z7 = false;
        int i4 = 0;
        boolean z8 = false;
        while (i4 < i3) {
            yafVar.E(8);
            if (!ma5Var.q(yafVar.a, z7 ? 1 : 0, 8, true)) {
                break;
            }
            long jW = yafVar.w();
            int iH = yafVar.h();
            if (jW == 1) {
                ma5Var.l(8, yafVar.a, 8);
                yafVar.G(16);
                i = 16;
                jW = yafVar.p();
            } else {
                if (jW == 0) {
                    long jX2 = ma5Var.x();
                    if (jX2 != j) {
                        jW = (jX2 - ma5Var.r()) + 8;
                    }
                }
                i = 8;
            }
            long j3 = i;
            if (jW < j3) {
                return z7;
            }
            i4 += i;
            if (iH == 1836019574) {
                i3 += (int) jW;
                if (i2 != 0 && i3 > jX) {
                    i3 = (int) jX;
                }
            } else {
                if (iH == 1836019558 || iH == 1836475768) {
                    z3 = z7 ? 1 : 0;
                    z4 = true;
                    z5 = true;
                    break;
                }
                int i5 = i2;
                if ((i4 + jW) - j3 >= i3) {
                    z3 = false;
                    z4 = true;
                    break;
                }
                int i6 = (int) (jW - j3);
                i4 += i6;
                if (iH != 1718909296) {
                    z6 = false;
                    z8 = z8;
                    if (i6 != 0) {
                        ma5Var.s(i6);
                        z8 = z8;
                    }
                } else {
                    if (i6 < 8) {
                        return false;
                    }
                    yafVar.E(i6);
                    ma5Var.l(0, yafVar.a, i6);
                    int i7 = i6 / 4;
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (i8 != 1) {
                            int iH2 = yafVar.h();
                            if ((iH2 >>> 8) != 3368816 && (iH2 != 1751476579 || !z2)) {
                                int[] iArr = c;
                                for (int i9 = 0; i9 < 29; i9++) {
                                    if (iArr[i9] != iH2) {
                                    }
                                }
                            }
                            z8 = true;
                            break;
                        }
                        yafVar.I(4);
                    }
                    if (!z8) {
                        return false;
                    }
                    z6 = false;
                    z8 = z8;
                }
                z7 = z6;
                i2 = i5;
            }
            j = -1;
            z8 = z8;
        }
        z3 = z7 ? 1 : 0;
        z4 = true;
        z5 = z3;
        return (z8 && z == z5) ? z4 : z3;
    }

    public static final void I(int i, int i2, r6d r6dVar) {
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(r6dVar.g(i4));
            }
            i3 >>>= 1;
        }
        String strA = r6dVar.a();
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strA + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strA + "', but they were missing", null);
    }

    public static String J(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d)};
        int i2 = maf.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final void K(y5f y5fVar) {
        y5fVar.c(b64.class, new lxc(17));
    }

    public static final int a(ju0 ju0Var, XmlPullParser xmlPullParser, String str) {
        ju0Var.getClass();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean b(l7b l7bVar, String str) {
        Long l = (Long) ((Map) ((AtomicReference) ((khe) l7bVar.b).getValue()).get()).get(str);
        return l != null && System.currentTimeMillis() < l.longValue();
    }

    public static final boolean c(ju0 ju0Var, int i) {
        ju0Var.getClass();
        return i != -1;
    }

    public static final void d(ky7 ky7Var, String str, Long l) {
        Long lValueOf;
        if (l.longValue() <= 0) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(l.longValue() + System.currentTimeMillis());
        }
        ky7Var.put(str, lValueOf);
    }

    public static final void e(Appendable appendable, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            appendable.append("\t");
        }
    }

    public static final void f(Throwable th, Appendable appendable) throws IOException {
        g(th, appendable, 0, "", th.getStackTrace(), 0, new IdentityHashMap());
    }

    public static final void g(Throwable th, Appendable appendable, int i, String str, StackTraceElement[] stackTraceElementArr, int i2, IdentityHashMap identityHashMap) throws IOException {
        int i3 = 1;
        if (identityHashMap.containsKey(th)) {
            e(appendable, 1);
            appendable.append("[CIRCULAR REFERENCE: ").append(th.toString()).append("]").append('\n');
            return;
        }
        identityHashMap.put(th, e5f.a);
        e(appendable, i);
        appendable.append(str).append(th.toString()).append('\n');
        if (th instanceof StackOverflowError) {
            StackTraceElement stackTraceElement = stackTraceElementArr[0];
            int length = stackTraceElementArr.length;
            while (i3 < length) {
                if (tpa.f(stackTraceElement, stackTraceElementArr[i3])) {
                    break;
                } else {
                    i3++;
                }
            }
            i3 = 0;
        } else {
            i3 = 0;
        }
        int length2 = i3 > 0 ? i3 : stackTraceElementArr.length - i2;
        for (int i4 = 0; i4 < length2; i4++) {
            h(stackTraceElementArr[i4], appendable, i + 1, 4);
        }
        if (i3 > 0) {
            e(appendable, i + 1);
            appendable.append("... ").append(String.valueOf(i3)).append(" calls repeat").append('\n');
        } else if (i2 != 0) {
            e(appendable, i + 1);
            appendable.append("... ").append(String.valueOf(i2)).append(" more").append('\n');
        }
        for (Throwable th2 : th.getSuppressed()) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            g(th2, appendable, i + 1, "Suppressed: ", stackTrace, m(stackTraceElementArr, stackTrace), identityHashMap);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            g(cause, appendable, i, "Caused by: ", stackTrace2, m(stackTraceElementArr, stackTrace2), identityHashMap);
        }
    }

    public static void h(StackTraceElement stackTraceElement, Appendable appendable, int i, int i2) throws IOException {
        String fileName;
        if ((i2 & 2) != 0) {
            i = 1;
        }
        e(appendable, i);
        appendable.append("at ");
        if (stackTraceElement.isNativeMethod()) {
            fileName = "Native Method";
        } else {
            fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "Unknown Source";
            }
        }
        appendable.append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(fileName);
        if (stackTraceElement.getLineNumber() >= 0) {
            appendable.append(":").append(String.valueOf(stackTraceElement.getLineNumber()));
        }
        appendable.append(")").append('\n');
    }

    public static final void i(Animator animator) {
        animator.removeAllListeners();
        animator.cancel();
    }

    public static String j(String str) {
        StringBuilder sb = new StringBuilder(rh4.e(rh4.e(5, str), str));
        sb.append(".");
        sb.append(str);
        sb.append(",.");
        sb.append(str);
        sb.append(" *");
        return sb.toString();
    }

    public static ok4 k() {
        if (ok4.b != null) {
            return ok4.b;
        }
        synchronized (ok4.class) {
            try {
                if (ok4.b == null) {
                    ok4.b = new ok4(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ok4.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(Activity activity, eg7 eg7Var) {
        if (activity instanceof eh7) {
            gh7 gh7VarQ = ((eh7) activity).Q();
            if (gh7VarQ instanceof gh7) {
                gh7VarQ.d(eg7Var);
            }
        }
    }

    public static final int m(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int length = stackTraceElementArr.length - 1;
        for (int length2 = stackTraceElementArr2.length - 1; length >= 0 && length2 >= 0 && tpa.f(stackTraceElementArr[length], stackTraceElementArr2[length2]); length2--) {
            length--;
        }
        return (stackTraceElementArr.length - 1) - length;
    }

    public static final l7g n(h8g h8gVar) {
        return new l7g(h8gVar.a, h8gVar.t);
    }

    public static void o(int i, yaf yafVar) {
        yafVar.E(7);
        byte[] bArr = yafVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static ColorStateList p(Context context, k8g k8gVar, int i) {
        int resourceId;
        ColorStateList colorStateListN;
        TypedArray typedArray = (TypedArray) k8gVar.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListN = z7.n(context, resourceId)) == null) ? k8gVar.l(i) : colorStateListN;
    }

    public static ColorStateList q(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListN;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListN = z7.n(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListN;
    }

    public static int r(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable s(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableN;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableN = s36.n(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableN;
    }

    public static String t(String str, kk0 kk0Var, jk0 jk0Var) {
        int iOrdinal = kk0Var.ordinal();
        jk0 jk0Var2 = jk0.a;
        String str2 = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : jk0Var == jk0Var2 ? "sqr_720" : "w_1440" : jk0Var == jk0Var2 ? "sqr_480" : "w_1080" : jk0Var == jk0Var2 ? "sqr_192" : "w_480" : jk0Var == jk0Var2 ? "sqr_96" : "w_240" : jk0Var == jk0Var2 ? "sqr_64" : "w_180";
        if (oag.t(str)) {
            return null;
        }
        return rh4.j(str, "&fn=", str2);
    }

    public static final void v(Activity activity) {
        View currentFocus;
        if (activity == null || (currentFocus = activity.getWindow().getCurrentFocus()) == null) {
            return;
        }
        currentFocus.clearFocus();
        try {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        } catch (Throwable unused) {
        }
    }

    public static ck6 w() {
        if (ck6.c != null) {
            return ck6.c;
        }
        synchronized (ck6.class) {
            try {
                if (ck6.c == null) {
                    ck6.c = new ck6();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ck6.c;
    }

    public static ypd x(Throwable th) {
        ypd ypdVar = new ypd();
        th.getClass();
        ypdVar.j(th, null);
        return ypdVar;
    }

    public static void y(Activity activity) {
        ahc.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new ahc());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new bhc(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static q67 z() {
        if (q67.c != null) {
            return q67.c;
        }
        synchronized (q67.class) {
            try {
                if (q67.c == null) {
                    q67.c = new q67(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q67.c;
    }

    public abstract void G(Object obj, float f);

    public abstract float u(Object obj);
}
