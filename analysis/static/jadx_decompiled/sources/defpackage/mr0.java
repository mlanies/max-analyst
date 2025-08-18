package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.b;
import androidx.media3.common.util.GlUtil$GlException;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public abstract class mr0 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] h = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int[] i = {12445, 13120, 12344, 12344};
    public static final int[] j = {12445, 13632, 12344, 12344};
    public static final int[] k = {12344};
    public static final int[] l = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static sfg m;

    public static EGLDisplay A() throws GlUtil$GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        g("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        g("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        f();
        return eGLDisplayEglGetDisplay;
    }

    public static EGLConfig B(EGLDisplay eGLDisplay, int[] iArr) throws GlUtil$GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new GlUtil$GlException("eglChooseConfig failed.");
    }

    public static final Field C(Field field, String str) {
        try {
            Field declaredField = ExecutorsRegistrar.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            field.setInt(declaredField, declaredField.getModifiers() & (-17));
            return declaredField;
        } catch (Throwable th) {
            hm9.p("ReplaceExecutorRegistrarLogic", "fail to fetch executor field ".concat(str), th);
            return null;
        }
    }

    public static int E() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] == 0) {
            return 0;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
        int[] iArr3 = new int[1];
        GLES20.glGetIntegerv(3379, iArr3, 0);
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
        return iArr3[0];
    }

    public static int[] F(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i2 = iIndexOf5 + 2;
        if (i2 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i2) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static final void G(uu3 uu3Var) {
        Activity activity = uu3Var.getActivity();
        if (activity != null) {
            H(activity);
        }
    }

    public static final void H(Activity activity) {
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

    public static final void I(View view) {
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        view.clearFocus();
        try {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Throwable unused) {
        }
    }

    public static boolean J(int i2) {
        return i2 != 0 && s63.e(i2) > 0.5d;
    }

    public static boolean K(int i2, boolean z) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z) {
            return true;
        }
        int[] iArr = l;
        for (int i3 = 0; i3 < 29; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean L(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static boolean M() {
        return nr0.d;
    }

    public static int N(int i2, float f2, int i3) {
        return s63.g(s63.i(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    public static final void O(Context context) {
        LinkedHashMap linkedHashMapSingletonMap;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            a14.u().n(i7g.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(qk.a.a(context), "androidx.work.workdb");
            String[] strArr = i7g.b;
            int iZ = mz7.Z(strArr.length);
            if (iZ < 16) {
                iZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iZ);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath.getPath() + str), new File(file.getPath() + str));
            }
            if (linkedHashMap.isEmpty()) {
                linkedHashMapSingletonMap = Collections.singletonMap(databasePath, file);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath, file);
                linkedHashMapSingletonMap = linkedHashMap2;
            }
            for (Map.Entry entry : linkedHashMapSingletonMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        a14.u().R(i7g.a, "Over-writing contents of " + file3);
                    }
                    a14.u().n(i7g.a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static String Q(int i2, int i3, StringBuilder sb) {
        int i4;
        int iLastIndexOf;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i5 = i2;
        int i6 = i5;
        while (i5 <= i3) {
            if (i5 == i3) {
                i4 = i5;
            } else if (sb.charAt(i5) == '/') {
                i4 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i4);
                i3 -= i4 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = iLastIndexOf > i2 ? iLastIndexOf : i2;
                    sb.delete(i8, i4);
                    i3 -= i4 - i8;
                } else {
                    iLastIndexOf = i5 + 1;
                }
                i6 = iLastIndexOf;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    public static String R(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrF = F(str2);
        if (iArrF[0] != -1) {
            sb.append(str2);
            Q(iArrF[1], iArrF[2], sb);
            return sb.toString();
        }
        int[] iArrF2 = F(str);
        if (iArrF[3] == 0) {
            sb.append((CharSequence) str, 0, iArrF2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrF[2] == 0) {
            sb.append((CharSequence) str, 0, iArrF2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i2 = iArrF[1];
        if (i2 != 0) {
            int i3 = iArrF2[0] + 1;
            sb.append((CharSequence) str, 0, i3);
            sb.append(str2);
            return Q(iArrF[1] + i3, i3 + iArrF[2], sb);
        }
        if (str2.charAt(i2) == '/') {
            sb.append((CharSequence) str, 0, iArrF2[1]);
            sb.append(str2);
            int i4 = iArrF2[1];
            return Q(i4, iArrF[2] + i4, sb);
        }
        int i5 = iArrF2[0] + 2;
        int i6 = iArrF2[1];
        if (i5 >= i6 || i6 != iArrF2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrF2[2] - 1);
            int i7 = iLastIndexOf == -1 ? iArrF2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i7);
            sb.append(str2);
            return Q(iArrF2[1], i7 + iArrF[2], sb);
        }
        sb.append((CharSequence) str, 0, i6);
        sb.append('/');
        sb.append(str2);
        int i8 = iArrF2[1];
        return Q(i8, iArrF[2] + i8 + 1, sb);
    }

    public static Uri S(String str, String str2) {
        return Uri.parse(R(str, str2));
    }

    public static final void T(Field field, k56 k56Var) throws IllegalAccessException, IllegalArgumentException {
        field.set(null, new le7(new bc3(3, k56Var)));
    }

    public static void U(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static void V(View view) {
        if (view != null) {
            view.requestFocus();
            view.post(new vs5(view, 10, view));
        }
    }

    public static iud W(na5 na5Var, boolean z, boolean z2) {
        int i2;
        long j2;
        long jO;
        int i3;
        int i4;
        boolean z3;
        int[] iArr;
        long j3;
        boolean z4 = true;
        long jX = na5Var.x();
        long j4 = -1;
        long j5 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (jX != -1 && jX <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j5 = jX;
        }
        int i5 = (int) j5;
        wpa wpaVar = new wpa(64);
        int i6 = 0;
        int i7 = 0;
        boolean z5 = false;
        while (i7 < i5) {
            wpaVar.D(8);
            if (!na5Var.q(wpaVar.a, i6, 8, z4)) {
                break;
            }
            long jW = wpaVar.w();
            int iG = wpaVar.g();
            if (jW == 1) {
                na5Var.l(8, wpaVar.a, 8);
                i3 = 16;
                wpaVar.F(16);
                jO = wpaVar.o();
                j2 = jX;
            } else {
                if (jW == 0) {
                    long jX2 = na5Var.x();
                    if (jX2 != j4) {
                        jW = (jX2 - na5Var.r()) + 8;
                    }
                }
                j2 = jX;
                jO = jW;
                i3 = 8;
            }
            long j6 = i3;
            if (jO < j6) {
                return new buc();
            }
            i7 += i3;
            if (iG == 1836019574) {
                i5 += (int) jO;
                if (jX == -1 || i5 <= j2) {
                    j3 = j2;
                } else {
                    j3 = j2;
                    i5 = (int) j3;
                }
                jX = j3;
                z4 = true;
            } else {
                if (iG == 1836019558 || iG == 1836475768) {
                    i2 = 1;
                    break;
                }
                if (iG == 1835295092) {
                    z5 = true;
                }
                if ((i7 + jO) - j6 >= i5) {
                    i2 = 0;
                    break;
                }
                int i8 = (int) (jO - j6);
                i7 += i8;
                if (iG != 1718909296) {
                    i4 = 0;
                    z3 = true;
                    if (i8 != 0) {
                        na5Var.s(i8);
                    }
                } else {
                    if (i8 < 8) {
                        return new buc();
                    }
                    wpaVar.D(i8);
                    i4 = 0;
                    na5Var.l(0, wpaVar.a, i8);
                    if (K(wpaVar.g(), z2)) {
                        z5 = true;
                    }
                    wpaVar.H(4);
                    int iA = wpaVar.a() / 4;
                    if (!z5 && iA > 0) {
                        iArr = new int[iA];
                        int i9 = 0;
                        while (true) {
                            if (i9 >= iA) {
                                z3 = true;
                                break;
                            }
                            int iG2 = wpaVar.g();
                            iArr[i9] = iG2;
                            if (K(iG2, z2)) {
                                z3 = true;
                                z5 = true;
                                break;
                            }
                            i9++;
                        }
                    } else {
                        z3 = true;
                        iArr = null;
                    }
                    if (!z5) {
                        qx7 qx7Var = new qx7(18);
                        if (iArr != null) {
                            int i10 = uw6.c;
                            if (iArr.length != 0) {
                                new uw6(Arrays.copyOf(iArr, iArr.length));
                            }
                        } else {
                            int i11 = uw6.c;
                        }
                        return qx7Var;
                    }
                }
                i6 = i4;
                z4 = z3;
                jX = j2;
            }
            j4 = -1;
        }
        i2 = i6;
        if (!z5) {
            return lq9.X;
        }
        if (z != i2) {
            return i2 != 0 ? yxc.Y : yxc.Z;
        }
        return null;
    }

    public static void X(String str, k56 k56Var) {
        hka hkaVar = new hka(k56Var);
        hkaVar.setDaemon(true);
        if (str != null) {
            hkaVar.setName(str);
        }
        hkaVar.start();
    }

    public static final String Y(String str) {
        int i2 = 0;
        int i3 = -1;
        if (!w9e.p0(str, ":", false)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char cCharAt = lowerCase.charAt(i4);
                    if (tpa.m(cCharAt, 31) <= 0 || tpa.m(cCharAt, 127) >= 0 || w9e.z0(" #%/:?@[\\]", cCharAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressR = (eae.o0(str, "[", false) && str.endsWith("]")) ? r(1, str.length() - 1, str) : r(0, str.length(), str);
        if (inetAddressR == null) {
            return null;
        }
        byte[] address = inetAddressR.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressR.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i3 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        bt0 bt0Var = new bt0();
        while (i2 < address.length) {
            if (i2 == i3) {
                bt0Var.u0(58);
                i2 += i6;
                if (i2 == 16) {
                    bt0Var.u0(58);
                }
            } else {
                if (i2 > 0) {
                    bt0Var.u0(58);
                }
                byte b2 = address[i2];
                byte[] bArr = naf.a;
                bt0Var.w0(((b2 & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return bt0Var.p0();
    }

    public static final void Z(y5f y5fVar) {
        y5fVar.e(rff.class, new b6a(21));
        y5fVar.e(f4b.class, new b6a(22));
        y5fVar.e(jrd.class, new b6a(23));
        y5fVar.e(n65.class, new b6a(24));
        y5fVar.e(gw0.class, new b6a(25));
        y5fVar.e(ief.class, new b6a(26));
        y5fVar.e(wrc.class, new uza(1));
        y5fVar.e(n4b.class, new b6a(27));
    }

    public static void a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    public static final void a0(y5f y5fVar) {
        y5fVar.c(b64.class, new lxc(8));
        y5fVar.c(pi4.class, new lxc(9));
    }

    public static void b(int i2, int i3) throws GlUtil$GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i4 = iArr[0];
        fm9.j("Create a OpenGL context first or run the GL methods on an OpenGL thread.", i4 > 0);
        if (i2 < 0 || i3 < 0) {
            throw new GlUtil$GlException("width or height is less than 0");
        }
        if (i2 > i4 || i3 > i4) {
            throw new GlUtil$GlException(zr6.h(i4, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
    }

    public static final void b0(y5f y5fVar) {
        y5fVar.c(b64.class, new lxc(16));
    }

    public static znc c(Activity activity, w12 w12Var, Bundle bundle) {
        ft.e();
        wg7 wg7VarA = zg7.a(activity, true);
        wg7 wg7Var = wg7VarA;
        if (wg7VarA == null) {
            if (activity instanceof b) {
                AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = new AndroidXLifecycleHandlerImpl();
                n16 n16VarS = ((b) activity).S();
                n16VarS.getClass();
                he0 he0Var = new he0(n16VarS);
                he0Var.f(0, androidXLifecycleHandlerImpl, "LifecycleHandler", 1);
                he0Var.d(false);
                wg7Var = androidXLifecycleHandlerImpl;
            } else {
                w2b w2bVar = new w2b();
                activity.getFragmentManager().beginTransaction().add(w2bVar, "LifecycleHandler").commit();
                wg7Var = w2bVar;
            }
        }
        wg7Var.H(activity);
        b8 b8VarE = wg7Var.e(w12Var, bundle);
        b8VarE.I();
        b8VarE.e = 1;
        return b8VarE;
    }

    public static void d(int i2, int i3, int i4) throws GlUtil$GlException {
        GLES20.glBindTexture(i2, i3);
        f();
        GLES20.glTexParameteri(i2, 10240, i4);
        f();
        GLES20.glTexParameteri(i2, 10241, i4);
        f();
        GLES20.glTexParameteri(i2, 10242, 33071);
        f();
        GLES20.glTexParameteri(i2, 10243, 33071);
        f();
    }

    public static void e(String str) throws GlUtil$GlException {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbO = rh4.o(str, ", error code: 0x");
        sbO.append(Integer.toHexString(iEglGetError));
        throw new GlUtil$GlException(sbO.toString());
    }

    public static void f() throws GlUtil$GlException {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new GlUtil$GlException(sb.toString());
        }
    }

    public static void g(String str, boolean z) throws GlUtil$GlException {
        if (!z) {
            throw new GlUtil$GlException(str);
        }
    }

    public static void h() throws GlUtil$GlException {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        f();
    }

    public static void i(t24 t24Var) {
        if (t24Var != null) {
            try {
                t24Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int j(int i2, int i3) {
        return s63.i(i2, (Color.alpha(i2) * i3) / 255);
    }

    public static long k(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static float[] l() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static EGLContext m(EGLContext eGLContext, EGLDisplay eGLDisplay, int i2, int[] iArr) throws GlUtil$GlException {
        boolean z = true;
        fm9.f(Arrays.equals(iArr, g) || Arrays.equals(iArr, h));
        if (i2 != 2 && i2 != 3) {
            z = false;
        }
        fm9.f(z);
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, B(eGLDisplay, iArr), eGLContext, new int[]{12440, i2, 12344}, 0);
        if (eGLContextEglCreateContext != null) {
            f();
            return eGLContextEglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new GlUtil$GlException(zr6.h(i2, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
    }

    public static EGLSurface o(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil$GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        int[] iArr = g;
        if (L("EGL_KHR_surfaceless_context")) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, B(eGLDisplay, iArr), new int[]{12375, 1, 12374, 1, 12344}, 0);
            e("Error creating a new EGL Pbuffer surface");
        }
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext);
        e("Error making context current");
        u(0, 1, 1);
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static long p() throws GlUtil$GlException {
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, new int[1], 0);
        f();
        if (r0[0] < 3) {
            return 0L;
        }
        long jGlFenceSync = GLES30.glFenceSync(37143, 0);
        f();
        GLES20.glFlush();
        f();
        return jGlFenceSync;
    }

    public static float[] q(List list) {
        float[] fArr = new float[list.size() * 4];
        for (int i2 = 0; i2 < list.size(); i2++) {
            System.arraycopy(list.get(i2), 0, fArr, i2 * 4, 4);
        }
        return fArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d2, code lost:
    
        if (r7 == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d4, code lost:
    
        if (r8 != (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d7, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ea, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c A[LOOP:2: B:25:0x004b->B:50:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009f A[EDGE_INSN: B:86:0x009f->B:54:0x009f BREAK  A[LOOP:2: B:25:0x004b->B:50:0x008c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress r(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr0.r(int, int, java.lang.String):java.net.InetAddress");
    }

    public static void s(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil$GlException {
        if (eGLDisplay == null) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        e("Error releasing context");
        if (eGLContext != null) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            e("Error destroying context");
        }
        EGL14.eglReleaseThread();
        e("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        e("Error terminating display");
    }

    public static void u(int i2, int i3, int i4) throws GlUtil$GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i2) {
            GLES20.glBindFramebuffer(36160, i2);
        }
        f();
        GLES20.glViewport(0, 0, i3, i4);
        f();
    }

    public static int v(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = b[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + f[i4]) * 2;
        }
        int i6 = e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static final tg w(View view) {
        return ((y8a) ((ed3) ((vl) ((ug) view.getContext().getApplicationContext())).c.getValue())).c();
    }

    public static int x(int i2, int i3, Context context) {
        Integer numValueOf;
        TypedValue typedValueC = kq0.C(context, i2);
        if (typedValueC != null) {
            int i4 = typedValueC.resourceId;
            numValueOf = Integer.valueOf(i4 != 0 ? lt3.a(context, i4) : typedValueC.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3;
    }

    public static int y(int i2, Context context, String str) {
        TypedValue typedValueG = kq0.G(i2, context, str);
        int i3 = typedValueG.resourceId;
        return i3 != 0 ? lt3.a(context, i3) : typedValueG.data;
    }

    public static int z(View view, int i2) {
        Context context = view.getContext();
        TypedValue typedValueG = kq0.G(i2, view.getContext(), view.getClass().getCanonicalName());
        int i3 = typedValueG.resourceId;
        return i3 != 0 ? lt3.a(context, i3) : typedValueG.data;
    }

    public abstract HashMap D(hf5 hf5Var, int i2);

    public abstract void P(hf5 hf5Var);

    public abstract hf5 n(fi0 fi0Var, eab eabVar);

    public abstract void t(hf5 hf5Var, h7b h7bVar);
}
