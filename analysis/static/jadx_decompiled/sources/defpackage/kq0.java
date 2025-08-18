package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public abstract class kq0 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final g76 g = new g76();
    public static final Object h = new Object();
    public static Constructor i;
    public static Method j;
    public static Method k;

    public static String A(int i2, int i3, StringBuilder sb) {
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

    public static final Object B(gh7 gh7Var, fg7 fg7Var, a66 a66Var, Continuation continuation) {
        Object objK;
        if (fg7Var == fg7.b) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        }
        fg7 fg7Var2 = gh7Var.d;
        fg7 fg7Var3 = fg7.a;
        e5f e5fVar = e5f.a;
        return (fg7Var2 != fg7Var3 && (objK = j1e.k(new rgc(gh7Var, fg7Var, a66Var, null), continuation)) == tx3.a) ? objK : e5fVar;
    }

    public static TypedValue C(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static String D(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrP = p(str2);
        if (iArrP[0] != -1) {
            sb.append(str2);
            A(iArrP[1], iArrP[2], sb);
            return sb.toString();
        }
        int[] iArrP2 = p(str);
        if (iArrP[3] == 0) {
            sb.append((CharSequence) str, 0, iArrP2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrP[2] == 0) {
            sb.append((CharSequence) str, 0, iArrP2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i2 = iArrP[1];
        if (i2 != 0) {
            int i3 = iArrP2[0] + 1;
            sb.append((CharSequence) str, 0, i3);
            sb.append(str2);
            return A(iArrP[1] + i3, i3 + iArrP[2], sb);
        }
        if (str2.charAt(i2) == '/') {
            sb.append((CharSequence) str, 0, iArrP2[1]);
            sb.append(str2);
            int i4 = iArrP2[1];
            return A(i4, iArrP[2] + i4, sb);
        }
        int i5 = iArrP2[0] + 2;
        int i6 = iArrP2[1];
        if (i5 >= i6 || i6 != iArrP2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrP2[2] - 1);
            int i7 = iLastIndexOf == -1 ? iArrP2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i7);
            sb.append(str2);
            return A(iArrP2[1], i7 + iArrP[2], sb);
        }
        sb.append((CharSequence) str, 0, i6);
        sb.append('/');
        sb.append(str2);
        int i8 = iArrP2[1];
        return A(i8, iArrP[2] + i8 + 1, sb);
    }

    public static boolean E(int i2, Context context, boolean z) {
        TypedValue typedValueC = C(context, i2);
        return (typedValueC == null || typedValueC.type != 18) ? z : typedValueC.data != 0;
    }

    public static Uri F(String str, String str2) {
        return Uri.parse(D(str, str2));
    }

    public static TypedValue G(int i2, Context context, String str) {
        TypedValue typedValueC = C(context, i2);
        if (typedValueC != null) {
            return typedValueC;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static void H(Runnable runnable) {
        if (t()) {
            runnable.run();
        } else {
            c54.p("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static void I(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static nl7 J(ArrayList arrayList) {
        return new nl7(new ArrayList(arrayList), false, ju0.k());
    }

    public static k12 K(bm7 bm7Var, wu wuVar, Executor executor) {
        k12 k12Var = new k12(wuVar, bm7Var);
        bm7Var.d(k12Var, executor);
        return k12Var;
    }

    public static final void L(y5f y5fVar) {
        y5fVar.c(b64.class, new lxc(6));
        y5fVar.c(pi4.class, new lxc(7));
    }

    public static final void M(y5f y5fVar) {
        y5fVar.c(b64.class, new lxc(15));
    }

    public static void a(bm7 bm7Var, a76 a76Var, Executor executor) {
        a76Var.getClass();
        bm7Var.d(new i76(bm7Var, 0, a76Var), executor);
    }

    public static nl7 b(Collection collection) {
        return new nl7(new ArrayList(collection), true, ju0.k());
    }

    public static w1b d(Context context, float f2, float f3, int i2, int i3, j1b j1bVar) {
        ivc ivcVarU = tpa.u(context);
        float f4 = 16;
        return new w1b((-f2) + tu0.G(fk4.d().getDisplayMetrics().density * f4), ((ivcVarU.b - f2) - i2) - tu0.G(fk4.d().getDisplayMetrics().density * f4), (-f3) + tu0.G(fk4.d().getDisplayMetrics().density * f4) + ivcVarU.c + j1bVar.a, ((((ivcVarU.a - ivcVarU.d) - f3) - i3) - tu0.G(f4 * fk4.d().getDisplayMetrics().density)) - j1bVar.b);
    }

    public static void e() {
        c54.p("Not in application's main thread", t());
    }

    public static void f(r24 r24Var) {
        if (r24Var != null) {
            try {
                r24Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static qnf h(Class cls) {
        try {
            return (qnf) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    public static String i(dx1 dx1Var, Integer num, List list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) dx1Var.a("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) dx1Var.a("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
    
        if (r7 != 4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] j(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq0.j(java.lang.String):byte[]");
    }

    public static byte[] k(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = oh0.j;
        int i2 = (length / 3) * 4;
        if (length % 3 > 0) {
            i2 += 4;
        }
        if (length > 0) {
            i2 += ((length - 1) / 57) + 1;
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        int i4 = 19;
        int i5 = 0;
        while (true) {
            int i6 = i3 + 3;
            if (i6 > length) {
                break;
            }
            int i7 = (bArr[i3 + 2] & 255) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 8);
            bArr3[i5] = bArr2[(i7 >> 18) & 63];
            bArr3[i5 + 1] = bArr2[(i7 >> 12) & 63];
            bArr3[i5 + 2] = bArr2[(i7 >> 6) & 63];
            bArr3[i5 + 3] = bArr2[i7 & 63];
            int i8 = i5 + 4;
            i4--;
            if (i4 == 0) {
                i5 += 5;
                bArr3[i8] = 10;
                i4 = 19;
            } else {
                i5 = i8;
            }
            i3 = i6;
        }
        if (i3 == length - 1) {
            int i9 = (bArr[i3] & 255) << 4;
            bArr3[i5] = bArr2[(i9 >> 6) & 63];
            bArr3[i5 + 1] = bArr2[i9 & 63];
            bArr3[i5 + 2] = 61;
            bArr3[i5 + 3] = 61;
            bArr3[i5 + 4] = 10;
        } else if (i3 == length - 2) {
            int i10 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
            bArr3[i5] = bArr2[(i10 >> 12) & 63];
            bArr3[i5 + 1] = bArr2[(i10 >> 6) & 63];
            bArr3[i5 + 2] = bArr2[i10 & 63];
            bArr3[i5 + 3] = 61;
            bArr3[i5 + 4] = 10;
        } else if (i5 > 0 && i4 != 19) {
            bArr3[i5] = 10;
        }
        return bArr3;
    }

    public static int m(int i2, int i3) {
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

    public static Object n(Future future) {
        c54.p("Future was expected to be done, " + future, future.isDone());
        return o(future);
    }

    public static Object o(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static int[] p(String str) {
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

    public static dw6 r(Object obj) {
        return obj == null ? dw6.c : new dw6(0, obj);
    }

    public static boolean s(ync yncVar) {
        Boolean bool;
        try {
            bool = (Boolean) yncVar.b(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException unused) {
            if (zi4.a.e(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
            } else {
                String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
            }
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean t() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static final void u(yx4 yx4Var, List list) {
        yx4Var.b("history↓");
        if (list.isEmpty()) {
            yx4Var.b("empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        vk6 vk6VarH = ft.h(list);
        if (vk6VarH != null) {
            sb.append(vk6VarH.getA());
            sb.append(" ");
        }
        sb.append("║║");
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            vk6 vk6Var = (vk6) list.get(i2);
            if (vk6Var instanceof uk6) {
                sb.append(" GAP ║║");
            } else {
                vk6 vk6Var2 = i2 > 0 ? (vk6) list.get(i2 - 1) : null;
                if ((vk6Var2 instanceof uk6) || vk6Var2 == null) {
                    sb.append(" ");
                    sb.append(yx4.a(vk6Var.getC()));
                    sb.append(" - ");
                    i3 = 0;
                }
                i3++;
                vk6 vk6Var3 = i2 < list.size() + (-1) ? (vk6) list.get(i2 + 1) : null;
                if ((vk6Var3 instanceof uk6) || vk6Var3 == null) {
                    sb.append(yx4.a(vk6Var.getC()));
                    sb.append(" (" + i3 + ")");
                    sb.append(" ║║");
                }
            }
            i2++;
        }
        vk6 vk6VarO = ft.o(list);
        if (vk6VarO != null) {
            sb.append(" ");
            sb.append(vk6VarO.getA());
        }
        yx4Var.b(sb.toString());
    }

    public static final void v(yx4 yx4Var, sk6 sk6Var) {
        yx4Var.b("bounds↓");
        StringBuilder sb = new StringBuilder("firstId: ");
        sb.append(sk6Var.g());
        sb.append(" ║║ lastId: ");
        sb.append(sk6Var.h());
        sb.append(" ║║ chunks: ");
        if (sk6Var.i().isEmpty()) {
            sb.append("empty");
        } else {
            sb.append("║║");
            for (i13 i13Var : sk6Var.i()) {
                sb.append(" ");
                sb.append(yx4.a(i13Var.a()));
                sb.append(" - ");
                sb.append(yx4.a(i13Var.b()));
                sb.append(" ║║");
            }
        }
        yx4Var.b(sb.toString());
    }

    public static bm7 w(bm7 bm7Var) {
        bm7Var.getClass();
        return bm7Var.isDone() ? bm7Var : f8.g(new f76(bm7Var, 1));
    }

    public static final void x(ViewGroup viewGroup, View view, View view2, View view3, float f2) {
        if (view2 != null) {
            view2.setTranslationY(viewGroup.getContext().getResources().getDisplayMetrics().heightPixels * f2);
        }
        if (view3 != null) {
            view3.setAlpha(1.0f - Math.abs(f2));
        }
        float fAbs = Math.abs(f2) * 3;
        if (fAbs > 1.0f) {
            fAbs = 1.0f;
        }
        if (view != null) {
            view.setPivotX(view.getWidth() / 2.0f);
        }
        if (view != null) {
            view.setPivotY(view.getHeight() / 2.0f);
        }
        if (view != null) {
            view.setScaleX(((1 - fAbs) * 0.1f) + 1.0f);
        }
        if (view != null) {
            view.setScaleY(((1 - fAbs) * 0.1f) + 1.0f);
        }
    }

    public static void y(bm7 bm7Var, lq1 lq1Var) {
        z(true, bm7Var, lq1Var, ju0.k());
    }

    public static void z(boolean z, bm7 bm7Var, lq1 lq1Var, ok4 ok4Var) {
        bm7Var.getClass();
        lq1Var.getClass();
        ok4Var.getClass();
        a(bm7Var, new va8(lq1Var), ok4Var);
        if (z) {
            lq1Var.a(new re(26, bm7Var), ju0.k());
        }
    }

    public sh0 c() {
        wmd.i(2, "expectedValuesPerKey");
        return new sh0(this);
    }

    public abstract Map g();

    public abstract pma l();

    public abstract xm7 q();
}
