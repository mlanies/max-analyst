package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Space;
import androidx.lifecycle.SavedStateHandlesVM;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.exoplayer2.ParserException;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpStatus;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class z7 {
    public static final Object a = null;
    public static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final ye4 d = new ye4(4);
    public static final vu4 e = new vu4();
    public static final ob6 f = new ob6();
    public static final o84 g = new o84(16);

    public static int A(Context context) {
        int iG = (context.getResources().getDisplayMetrics().widthPixels - (tu0.G(12 * fk4.d().getDisplayMetrics().density) * 2)) / (tu0.G(81 * fk4.d().getDisplayMetrics().density) + tu0.G(4 * fk4.d().getDisplayMetrics().density));
        if (iG < 1) {
            return 1;
        }
        return iG;
    }

    public static String B(Context context, int i) {
        yq7 yq7VarA;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            Object systemService = context.getSystemService("locale");
            yq7VarA = systemService != null ? new yq7(new zq7(ar7.a(systemService))) : yq7.b;
        } else {
            yq7VarA = yq7.a(od2.Q(context));
        }
        if (i2 <= 32 && !yq7VarA.a.a.isEmpty()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            pe3.b(configuration, yq7VarA);
            context = context.createConfigurationContext(configuration);
        }
        return context.getString(i);
    }

    public static final ObjectAnimator C(View view, float f2) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), view.getTranslationY() + f2);
    }

    public static kpa D(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        int i = inputStream.read() & 255;
        int i2 = inputStream.read() & 255;
        int i3 = inputStream.read() & 255;
        if (i != 157 || i2 != 1 || i3 != 42) {
            return null;
        }
        return new kpa(Integer.valueOf((inputStream.read() & 255) | ((inputStream.read() & 255) << 8)), Integer.valueOf(((inputStream.read() & 255) << 8) | (inputStream.read() & 255)));
    }

    public static kpa E(InputStream inputStream) throws IOException {
        r(inputStream);
        if ((inputStream.read() & 255) != 47) {
            return null;
        }
        int i = inputStream.read() & 255;
        int i2 = inputStream.read();
        return new kpa(Integer.valueOf((i | ((i2 & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & 255) << 2) | ((i2 & 192) >> 6)) + 1));
    }

    public static int F(int i) {
        return i <= 9 ? i + 48 : i + 87;
    }

    public static wva G() {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Map mapH = kp.h(allStackTraces);
        Throwable th = null;
        try {
            Throwable th2 = null;
            Throwable th3 = null;
            Throwable th4 = null;
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                Thread key = entry.getKey();
                StackTraceElement[] value = entry.getValue();
                String str = key.getName() + " (state=" + key.getState() + ", pid=" + key.getId() + ")";
                if (eae.k0(key.getName(), "main", true)) {
                    th4 = new Throwable(str);
                    th4.setStackTrace(value);
                } else if (th3 != null) {
                    Throwable th5 = new Throwable(str, th3);
                    th5.setStackTrace(value);
                    th3 = th5;
                } else {
                    th2 = new Throwable(str);
                    th2.setStackTrace(value);
                    th3 = th2;
                }
            }
            if (th4 != null && th2 != null) {
                th2.initCause(th4);
            }
            th = th3;
        } catch (Throwable unused) {
        }
        return new wva(mapH, 11, th);
    }

    public static final boolean H(RecyclerView recyclerView, int i) {
        View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
        return childAt != null && RecyclerView.R(childAt) == i;
    }

    public static boolean I(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static e J(s02 s02Var, boolean z) throws ParserException {
        int i = s02Var.i(5);
        if (i == 31) {
            i = s02Var.i(6) + 32;
        }
        int iX = x(s02Var);
        int i2 = s02Var.i(4);
        String strH = z7b.h(19, i, "mp4a.40.");
        if (i == 5 || i == 29) {
            iX = x(s02Var);
            int i3 = s02Var.i(5);
            if (i3 == 31) {
                i3 = s02Var.i(6) + 32;
            }
            i = i3;
            if (i == 22) {
                i2 = s02Var.i(4);
            }
        }
        if (z) {
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7 && i != 17) {
                switch (i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Unsupported audio object type: ");
                        sb.append(i);
                        throw ParserException.c(sb.toString());
                }
            }
            s02Var.h();
            if (s02Var.h()) {
                s02Var.t(14);
            }
            boolean zH = s02Var.h();
            if (i2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i == 6 || i == 20) {
                s02Var.t(3);
            }
            if (zH) {
                if (i == 22) {
                    s02Var.t(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    s02Var.t(3);
                }
                s02Var.t(1);
            }
            switch (i) {
                case LangUtils.HASH_SEED /* 17 */:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i4 = s02Var.i(2);
                    if (i4 == 2 || i4 == 3) {
                        StringBuilder sb2 = new StringBuilder(33);
                        sb2.append("Unsupported epConfig: ");
                        sb2.append(i4);
                        throw ParserException.c(sb2.toString());
                    }
            }
        }
        int i5 = c[i2];
        if (i5 != -1) {
            return new e(iX, i5, strH);
        }
        throw ParserException.a(null, null);
    }

    public static int K(int i, wpa wpaVar) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return wpaVar.u() + 1;
            case 7:
                return wpaVar.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            case 13:
            case Protos.Attaches.Attach.LOCATION /* 14 */:
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String L(java.io.DataInputStream r10, defpackage.y7g r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.L(java.io.DataInputStream, y7g):java.lang.String");
    }

    public static final Object M(Object obj) {
        return obj instanceof lb3 ? new njc(((lb3) obj).a) : obj;
    }

    public static Intent N(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        int i2 = i & 2;
        if (i2 == 0 && (i & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i2 == 0 || (i & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? pt3.a(context, broadcastReceiver, intentFilter, str, null, i) : nt3.a(context, broadcastReceiver, intentFilter, str, null, i);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void O(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                throw new IllegalArgumentException(zr6.l(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof y7) {
            ((y7) activity).getClass();
        }
        v7.b(activity, strArr, i);
    }

    public static int P(int i, int i2, Context context) {
        TypedValue typedValueC = kq0.C(context, i);
        return (typedValueC == null || typedValueC.type != 16) ? i2 : typedValueC.data;
    }

    public static TimeInterpolator Q(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!I(strValueOf, "cubic-bezier") && !I(strValueOf, ClientCookie.PATH_ATTR)) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!I(strValueOf, "cubic-bezier")) {
            if (I(strValueOf, ClientCookie.PATH_ATTR)) {
                return rra.c(m6d.i(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return rra.b(s(0, strArrSplit), s(1, strArrSplit), s(2, strArrSplit), s(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static final long R(int i, kt4 kt4Var) {
        if (kt4Var.compareTo(kt4.SECONDS) > 0) {
            return S(i, kt4Var);
        }
        return j(kt4.NANOSECONDS.a.convert(i, kt4Var.a));
    }

    public static final long S(long j, kt4 kt4Var) {
        kt4 kt4Var2 = kt4.NANOSECONDS;
        long jConvert = kt4Var.a.convert(4611686018426999999L, kt4Var2.a);
        long j2 = -jConvert;
        TimeUnit timeUnit = kt4Var.a;
        return (j2 > j || j > jConvert) ? h(ote.f(kt4.MILLISECONDS.a.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L)) : j(kt4Var2.a.convert(j, timeUnit));
    }

    public static final Object T(Object obj, m56 m56Var) {
        Throwable thA = pjc.a(obj);
        return thA == null ? m56Var != null ? new mb3(obj, m56Var) : obj : new lb3(thA, false);
    }

    public static String U(int i) {
        switch (i) {
            case 0:
                return "eof";
            case 34:
                return "string";
            case 39:
                return "name";
            case 44:
                return "`,`";
            case 49:
                return "number";
            case 58:
                return "`:`";
            case 91:
                return "`[`";
            case 93:
                return "`]`";
            case 98:
                return "boolean";
            case 110:
                return "null";
            case 123:
                return "`{`";
            case 125:
                return "`}`";
            default:
                throw new AssertionError();
        }
    }

    public static final void V(DataOutputStream dataOutputStream, String str, z3f z3fVar) throws IOException {
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeByte(z3fVar.a);
    }

    public static final void W(DataOutputStream dataOutputStream, String str, z3f z3fVar, z3f z3fVar2, String str2, y7g y7gVar) throws IOException {
        int i;
        if (str2.length() < 21845) {
            V(dataOutputStream, str, z3fVar);
            dataOutputStream.writeUTF(str2);
            return;
        }
        V(dataOutputStream, str, z3fVar2);
        int length = str2.length();
        char[] cArr = (char[]) y7gVar.b;
        int length2 = cArr.length;
        if (length2 < length) {
            do {
                length2 <<= 1;
            } while (length2 < length);
            cArr = new char[length2];
            y7gVar.b = cArr;
        }
        str2.getChars(0, length, cArr, 0);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 3;
            if (i2 >= length) {
                break;
            }
            char c2 = cArr[i2];
            if (c2 <= 127) {
                i = 1;
            } else if (c2 <= 2047) {
                i = 2;
            }
            i3 += i;
            i2++;
        }
        int iA = z3fVar2.a();
        byte[] bArr = (byte[]) y7gVar.c;
        if (i3 <= 127) {
            bArr[0] = (byte) (iA | 8);
            bArr[1] = (byte) i3;
            i = 2;
        } else if (i3 <= 32767) {
            bArr[0] = (byte) (iA | 9);
            bArr[1] = (byte) (i3 >> 8);
            bArr[2] = (byte) i3;
        } else {
            bArr[0] = (byte) (iA | 10);
            bArr[1] = (byte) (i3 >> 24);
            bArr[2] = (byte) ((i3 >> 16) & 255);
            bArr[3] = (byte) ((i3 >> 8) & 255);
            bArr[4] = (byte) i3;
            i = 5;
        }
        dataOutputStream.write(bArr, 0, i);
        byte[] bArr2 = (byte[]) y7gVar.c;
        int length3 = bArr2.length;
        if (length3 < i3) {
            do {
                length3 <<= 1;
            } while (length3 < i3);
            bArr2 = new byte[length3];
            y7gVar.c = bArr2;
        }
        if (length == i3) {
            for (int i4 = 0; i4 < length; i4++) {
                bArr2[i4] = (byte) cArr[i4];
            }
        } else {
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                char c3 = cArr[i6];
                if (c3 <= 127) {
                    bArr2[i5] = (byte) c3;
                    i5++;
                } else if (c3 <= 2047) {
                    int i7 = i5 + 1;
                    bArr2[i5] = (byte) ((c3 >> 6) | 192);
                    i5 += 2;
                    bArr2[i7] = (byte) ((c3 & '?') | 128);
                } else {
                    bArr2[i5] = (byte) ((c3 >> '\f') | 224);
                    int i8 = i5 + 2;
                    bArr2[i5 + 1] = (byte) (((c3 >> 6) & 63) | 128);
                    i5 += 3;
                    bArr2[i8] = (byte) ((c3 & '?') | 128);
                }
            }
        }
        dataOutputStream.write(bArr2, 0, i3);
    }

    public static wbd a(wbd wbdVar) {
        ky7 ky7Var = wbdVar.a;
        ky7Var.b();
        return ky7Var.t0 > 0 ? wbdVar : wbd.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(defpackage.wpa r20, defpackage.qm5 r21, int r22, defpackage.lh4 r23) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.b(wpa, qm5, int, lh4):boolean");
    }

    public static int c(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : jv9.a(new pv9(context).b) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static boolean d(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        Iterable j37Var = new j37(0, bArr.length - 1, 1);
        if (!(j37Var instanceof Collection) || !((Collection) j37Var).isEmpty()) {
            Iterator it = j37Var.iterator();
            while (((i37) it).c) {
                int iA = ((i37) it).a();
                if (((byte) str.charAt(iA)) != bArr[iA]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final ka6 e(bg1 bg1Var, boolean z) {
        try {
            return f46.j(bg1Var, new JSONObject().put("sdk", new JSONObject().put("type", "bad-net").put("value", z)));
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static final csc f(wh9 wh9Var) {
        vu4 vu4Var = e;
        LinkedHashMap linkedHashMap = wh9Var.a;
        isc iscVar = (isc) linkedHashMap.get(vu4Var);
        if (iscVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ynf ynfVar = (ynf) linkedHashMap.get(f);
        if (ynfVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(g);
        String str = (String) linkedHashMap.get(xxc.Z);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        hsc hscVarD = iscVar.y().d();
        fsc fscVar = hscVarD instanceof fsc ? (fsc) hscVarD : null;
        if (fscVar == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        SavedStateHandlesVM savedStateHandlesVMY = y(ynfVar);
        csc cscVar = (csc) savedStateHandlesVMY.b.get(str);
        if (cscVar != null) {
            return cscVar;
        }
        Class[] clsArr = csc.f;
        fscVar.b();
        Bundle bundle2 = fscVar.c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = fscVar.c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = fscVar.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            fscVar.c = null;
        }
        csc cscVarH = lz7.h(bundle3, bundle);
        savedStateHandlesVMY.b.put(str, cscVarH);
        return cscVarH;
    }

    public static final rm4 g(k56 k56Var) {
        i45 i45Var = new i45(new rxd(11, k56Var), 1);
        rm4 rm4Var = new rm4();
        rm4Var.b = rm4.c;
        rm4Var.a = i45Var;
        return rm4Var;
    }

    public static final long h(long j) {
        long j2 = (j << 1) + 1;
        int i = ft4.o;
        int i2 = ht4.a;
        return j2;
    }

    public static final long i(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? h(ote.f(j, -4611686018427387903L, 4611686018427387903L)) : j(j * 1000000);
    }

    public static final long j(long j) {
        long j2 = j << 1;
        int i = ft4.o;
        int i2 = ht4.a;
        return j2;
    }

    public static final void k(isc iscVar) {
        fg7 fg7Var = iscVar.Q().d;
        if (fg7Var != fg7.b && fg7Var != fg7.c) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (iscVar.y().d() == null) {
            fsc fscVar = new fsc(iscVar.y(), (ynf) iscVar);
            iscVar.y().f("androidx.lifecycle.internal.SavedStateHandlesProvider", fscVar);
            iscVar.Q().a(new fdc(7, fscVar));
        }
    }

    public static final int l(RecyclerView recyclerView, float f2) {
        LinearLayoutManager linearLayoutManagerT = t(recyclerView);
        if (linearLayoutManagerT == null) {
            throw new IllegalStateException("Only LinearLayoutManager is supported");
        }
        if (f2 == 1.0f) {
            return linearLayoutManagerT.X0();
        }
        if (f2 == 0.0f) {
            return linearLayoutManagerT.Y0();
        }
        int iY0 = linearLayoutManagerT.Y0();
        View viewR = linearLayoutManagerT.r(iY0);
        return (viewR == null || ((float) (recyclerView.getMeasuredHeight() - viewR.getTop())) < ((float) viewR.getMeasuredHeight()) * f2) ? linearLayoutManagerT.X0() : iY0;
    }

    public static zwe m(RecyclerView recyclerView) {
        zwe zweVar = new zwe(new ae3(3));
        zweVar.v(recyclerView);
        return zweVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList n(android.content.Context r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            tic r1 = new tic
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.vic.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.vic.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            sic r5 = (defpackage.sic) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb0
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            goto Laf
        L55:
            java.lang.ThreadLocal r2 = defpackage.vic.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L7e
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.r63.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7e
        L7e:
            if (r4 == 0) goto Lab
            java.lang.Object r2 = defpackage.vic.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = defpackage.vic.b     // Catch: java.lang.Throwable -> L96
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L96
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L96
            if (r3 != 0) goto L98
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L96
            r3.<init>()     // Catch: java.lang.Throwable -> L96
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r8 = move-exception
            goto La9
        L98:
            sic r0 = new sic     // Catch: java.lang.Throwable -> L96
            android.content.res.Resources r1 = r1.a     // Catch: java.lang.Throwable -> L96
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L96
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L96
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L96
            r3 = r4
            goto Laf
        La9:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L96
            throw r8
        Lab:
            android.content.res.ColorStateList r3 = defpackage.ric.b(r0, r9, r8)
        Laf:
            return r3
        Lb0:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.n(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static final ObjectAnimator o(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        objectAnimatorOfFloat.addListener(new ag(view, z));
        return objectAnimatorOfFloat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Serializable, vx5[]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static sh0 p(Context context, bg4 bg4Var) throws PackageManager.NameNotFoundException {
        ?? Query;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) bg4Var.b;
        int i = 0;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(wg0.i("No package found for authority: ", str));
        }
        ?? r6 = providerInfoResolveContentProvider.packageName;
        String str2 = (String) bg4Var.c;
        if (!r6.equals(str2)) {
            throw new PackageManager.NameNotFoundException(rh4.k("Found content provider ", str, ", but package was not ", str2));
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        ye4 ye4Var = d;
        Collections.sort(arrayList, ye4Var);
        List listX = (List) bg4Var.X;
        if (listX == null) {
            listX = c37.x(resources, 0);
        }
        int i2 = 0;
        loop1: while (true) {
            Query = 0;
            Query = 0;
            Query = 0;
            if (i2 >= listX.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listX.get(i2));
            Collections.sort(arrayList2, ye4Var);
            if (arrayList.size() == arrayList2.size()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                        break;
                    }
                }
                break loop1;
            }
            i2++;
        }
        int i4 = 1;
        if (providerInfoResolveContentProvider == null) {
            return new sh0(i4, (Serializable) Query, 7);
        }
        String str3 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str3).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str3).appendPath("file").build();
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            String[] strArr2 = {(String) bg4Var.o};
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    Query = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                } catch (RemoteException unused) {
                }
            }
            if (Query != 0 && Query.getCount() > 0) {
                int columnIndex = Query.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = Query.getColumnIndex("_id");
                int columnIndex3 = Query.getColumnIndex("file_id");
                int columnIndex4 = Query.getColumnIndex("font_ttc_index");
                int columnIndex5 = Query.getColumnIndex("font_weight");
                int columnIndex6 = Query.getColumnIndex("font_italic");
                while (Query.moveToNext()) {
                    arrayList3.add(new vx5(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, Query.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, Query.getLong(columnIndex3)), columnIndex4 != -1 ? Query.getInt(columnIndex4) : 0, columnIndex5 != -1 ? Query.getInt(columnIndex5) : HttpStatus.SC_BAD_REQUEST, columnIndex6 != -1 && Query.getInt(columnIndex6) == 1, columnIndex != -1 ? Query.getInt(columnIndex) : 0));
                }
            }
            if (Query != 0) {
                Query.close();
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            return new sh0(i, (Serializable) arrayList3.toArray(new vx5[0]), 7);
        } catch (Throwable th) {
            if (Query != 0) {
                Query.close();
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            throw th;
        }
    }

    public static final GridLayoutManager q(RecyclerView recyclerView) {
        a layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return (GridLayoutManager) layoutManager;
        }
        return null;
    }

    public static void r(InputStream inputStream) throws IOException {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    public static float s(int i, String[] strArr) throws NumberFormatException {
        float f2 = Float.parseFloat(strArr[i]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static final LinearLayoutManager t(RecyclerView recyclerView) {
        a layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    public static ValueAnimator u(Space space, nv3 nv3Var, nv3 nv3Var2, int i) {
        if ((i & 1) != 0) {
            nv3Var = null;
        }
        if ((i & 2) != 0) {
            nv3Var2 = null;
        }
        kl7 kl7VarL = j1e.l();
        if (nv3Var != null) {
            int i2 = nv3Var.b - nv3Var.f;
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i3 = ((nv3Var.a ? 1 : -1) * i2) + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            kl7VarL.add(PropertyValuesHolder.ofInt("top", marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0, i3));
        }
        if (nv3Var2 != null) {
            int i4 = nv3Var2.b - nv3Var2.f;
            ViewGroup.LayoutParams layoutParams3 = space.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i5 = ((nv3Var2.a ? 1 : -1) * i4) + (marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
            ViewGroup.LayoutParams layoutParams4 = space.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            kl7VarL.add(PropertyValuesHolder.ofInt("bottom", marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0, i5));
        }
        PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) j1e.d(kl7VarL).toArray(new PropertyValuesHolder[0]);
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder((PropertyValuesHolder[]) Arrays.copyOf(propertyValuesHolderArr, propertyValuesHolderArr.length));
        valueAnimatorOfPropertyValuesHolder.addUpdateListener(new zf(space, 0));
        return valueAnimatorOfPropertyValuesHolder;
    }

    public static String v(String str) {
        if (oag.t(str)) {
            hm9.k0("z7", null, "getPhotoToken: response is empty or null", Arrays.copyOf(new Object[0], 0));
            return null;
        }
        try {
            ArrayList arrayListW = w(str);
            if (arrayListW.size() > 0) {
                return (String) arrayListW.get(0);
            }
            return null;
        } catch (Exception e2) {
            hm9.p("z7", "getPhotoToken: exception while getting photo token from response", e2);
            return null;
        }
    }

    public static ArrayList w(String str) throws Exception {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error_msg")) {
                hm9.m("z7", "getPhotoToken: got json error: %s", jSONObject.getString("error_msg"));
                return arrayList;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("photos");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                arrayList.add(jSONObject2.getJSONObject(itKeys.next()).getString(ApiProtocol.KEY_TOKEN));
            }
            return arrayList;
        } catch (Exception e2) {
            hm9.n("z7", "exception while parsing photo upload response: " + e2.getMessage());
            throw e2;
        }
    }

    public static int x(s02 s02Var) throws ParserException {
        int i = s02Var.i(4);
        if (i == 15) {
            return s02Var.i(24);
        }
        if (i < 13) {
            return b[i];
        }
        throw ParserException.a(null, null);
    }

    public static final SavedStateHandlesVM y(ynf ynfVar) {
        return (SavedStateHandlesVM) new k8g(ynfVar.w(), new esc(), ynfVar instanceof pi6 ? ((pi6) ynfVar).p() : jz3.b).s(nec.a(SavedStateHandlesVM.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static String z(String str) {
        if (oag.t(str)) {
            hm9.m0("z7", "getStickerToken: response is empty or null", new Object[0]);
            return null;
        }
        try {
            JSONObject jSONObject = new JSONArray(str).getJSONObject(0);
            if (jSONObject.has(ApiProtocol.KEY_TOKEN)) {
                return jSONObject.getString(ApiProtocol.KEY_TOKEN);
            }
            return null;
        } catch (JSONException e2) {
            hm9.p("z7", "getStickerToken: error", e2);
            return null;
        }
    }
}
