package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Size;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.apache.http.HttpHost;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public abstract class j47 {
    public static final /* synthetic */ int Z = 0;
    public static volatile qj3 s0;
    public static volatile b66 t0;
    public static volatile b66 u0;
    public static volatile b66 v0;
    public final /* synthetic */ int a;
    public static final int[] b = new int[0];
    public static final long[] c = new long[0];
    public static final Object[] o = new Object[0];
    public static final ph4 X = new ph4((Bundle) null);
    public static final int[] Y = new int[2];

    public /* synthetic */ j47(int i) {
        this.a = i;
    }

    public static void A() {
        if (maf.a >= 18) {
            Trace.endSection();
        }
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static yie C(String str) throws JSONException {
        Object njcVar;
        LinkedHashMap linkedHashMap;
        Set setA;
        String str2;
        String str3;
        String str4;
        String string;
        JSONObject jSONObject = new JSONObject(str);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
        JSONArray jSONArrayNames = jSONObject2.names();
        int length = jSONArrayNames != null ? jSONArrayNames.length() : 0;
        for (int i = 0; i < length; i++) {
            if (jSONArrayNames != null && (string = jSONArrayNames.getString(i)) != null) {
                linkedHashMap2.put(string, jSONObject2.getString(string));
            }
        }
        String str5 = "versionName";
        String string2 = jSONObject.getString("versionName");
        long j = jSONObject.getLong("versionCode");
        String str6 = "packageName";
        String strOptString = jSONObject.optString("packageName");
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        if (strOptString == null) {
            try {
                Context context = kye.d;
                if (context == null) {
                    context = null;
                }
                njcVar = context.getPackageName();
            } catch (Throwable th) {
                njcVar = new njc(th);
            }
            if (pjc.a(njcVar) != null) {
                njcVar = "NA";
            }
            strOptString = (String) njcVar;
        }
        String str7 = "environment";
        String strOptString2 = jSONObject.optString("environment");
        if (strOptString2.length() <= 0) {
            strOptString2 = null;
        }
        String strOptString3 = jSONObject.optString("buildUuid");
        if (strOptString3.length() <= 0) {
            strOptString3 = null;
        }
        String strOptString4 = jSONObject.optString("sessionUuid");
        if (strOptString4.length() <= 0) {
            strOptString4 = null;
        }
        if (strOptString4 == null) {
            strOptString4 = UUID.randomUUID().toString();
        }
        String string3 = jSONObject.getString("device");
        String string4 = jSONObject.getString("deviceId");
        String string5 = jSONObject.getString("vendor");
        String string6 = jSONObject.getString("osVersion");
        boolean z = jSONObject.getBoolean("inBackground");
        boolean z2 = jSONObject.getBoolean("isRooted");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("hostedLibrariesInfo");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            linkedHashMap = linkedHashMap2;
            setA = wz4.a;
        } else {
            wbd wbdVar = new wbd();
            int length2 = jSONArrayOptJSONArray.length();
            linkedHashMap = linkedHashMap2;
            int i2 = 0;
            while (i2 < length2) {
                int i3 = length2;
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i2);
                JSONArray jSONArray = jSONArrayOptJSONArray;
                String string7 = jSONObject3.getString(str6);
                String str8 = str6;
                String string8 = jSONObject3.getString(str5);
                String strOptString5 = jSONObject3.optString("buildUuid");
                if (strOptString5.length() > 0) {
                    str2 = str5;
                    str3 = strOptString5;
                } else {
                    str2 = str5;
                    str3 = null;
                }
                String strOptString6 = jSONObject3.optString(str7);
                if (strOptString6.length() > 0) {
                    str4 = str7;
                } else {
                    str4 = str7;
                    strOptString6 = null;
                }
                wbdVar.add(new po6(string7, string8, str3, strOptString6));
                i2++;
                length2 = i3;
                jSONArrayOptJSONArray = jSONArray;
                str6 = str8;
                str5 = str2;
                str7 = str4;
            }
            setA = z7.a(wbdVar);
        }
        return new yie(string2, j, strOptString, strOptString2, strOptString3, strOptString4, string3, string4, string5, string6, z, z2, linkedHashMap, setA);
    }

    public static Point D(FileDescriptor fileDescriptor, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        Point point = new Point(options.outWidth, options.outHeight);
        return (i == 6 || i == 8) ? new Point(point.y, point.x) : point;
    }

    public static Point E(String str, boolean z) {
        int iE;
        if (z) {
            try {
                iE = new c65(str).e(1, "Orientation");
            } catch (IOException unused) {
            }
        } else {
            iE = 1;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        Point point = new Point(options.outWidth, options.outHeight);
        return (iE == 6 || iE == 8) ? new Point(point.y, point.x) : point;
    }

    public static final nb7 F(r6d r6dVar) {
        if (r6dVar instanceof s6d) {
            return F(((s6d) r6dVar).a);
        }
        return null;
    }

    public static int[] G(int i, int i2, int i3, int i4) {
        float f = i4;
        float f2 = i3;
        int i5 = (int) ((f / f2) * i);
        if (i5 > i2) {
            i = (int) ((f2 / f) * i2);
        } else {
            i2 = i5;
        }
        Size size = new Size(i, i2);
        return new int[]{size.getWidth(), size.getHeight()};
    }

    public static final hg4 H(lx3 lx3Var) {
        jx3 jx3Var = lx3Var.get(vu4.b);
        hg4 hg4Var = jx3Var instanceof hg4 ? (hg4) jx3Var : null;
        return hg4Var == null ? qa4.a : hg4Var;
    }

    public static int I(Point point, int i, int i2) {
        int i3 = 1;
        while (true) {
            if (point.x / i3 <= i && point.y / i3 <= i2) {
                return i3;
            }
            i3 *= 2;
        }
    }

    public static int J(MediaFormat mediaFormat, String str, int i) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i;
    }

    public static int K(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    public static String L(Context context, String str) {
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", packageName);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static long M(m4b m4bVar, long j, long j2, long j3) {
        boolean zEquals = m4bVar.c.equals(qad.l);
        qad qadVar = m4bVar.c;
        boolean z = zEquals || j2 < qadVar.c;
        if (!m4bVar.v) {
            return (z || j == -9223372036854775807L) ? qadVar.a.f : j;
        }
        if (!z && j != -9223372036854775807L) {
            return j;
        }
        if (j3 == -9223372036854775807L) {
            j3 = SystemClock.elapsedRealtime() - qadVar.c;
        }
        long j4 = qadVar.a.f + ((long) (j3 * m4bVar.g.a));
        long j5 = qadVar.d;
        return j5 != -9223372036854775807L ? Math.min(j4, j5) : j4;
    }

    public static Uri N(String str) {
        String strO = O(str);
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        return Uri.parse(strO);
    }

    public static String O(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Pattern pattern = bre.a;
        return (str.regionMatches(true, 0, "file:", 0, 5) || str.regionMatches(true, 0, HttpHost.DEFAULT_SCHEME_NAME, 0, 4) || str.regionMatches(true, 0, "content", 0, 7) || str.regionMatches(true, 0, "android.resource:/", 0, 18) || str.regionMatches(true, 0, "res:/", 0, 5) || str.regionMatches(true, 0, "data", 0, 4)) ? str : "file:".concat(str);
    }

    public static final void P(qm0 qm0Var) {
        if (qm0Var.a()) {
            ((View) qm0Var.getValue()).setVisibility(8);
        }
    }

    public static void Q(View view, boolean z) {
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
    }

    public static k3b R(k3b k3bVar, k3b k3bVar2) {
        if (k3bVar == null || k3bVar2 == null) {
            return k3b.b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < k3bVar.e(); i++) {
            tm5 tm5Var = k3bVar.a;
            if (k3bVar2.a(tm5Var.b(i))) {
                int iB = tm5Var.b(i);
                fm9.k(!false);
                sparseBooleanArray.append(iB, true);
            }
        }
        fm9.k(!false);
        return new k3b(new tm5(sparseBooleanArray));
    }

    public static final vxd S(sx3 sx3Var, lx3 lx3Var, vx3 vx3Var, a66 a66Var) {
        lx3 lx3VarX = v3c.x(sx3Var, lx3Var);
        vx3Var.getClass();
        vxd qe7Var = vx3Var == vx3.b ? new qe7(lx3VarX, a66Var) : new vxd(lx3VarX, true, true);
        qe7Var.start(vx3Var, qe7Var, a66Var);
        return qe7Var;
    }

    public static /* synthetic */ vxd T(sx3 sx3Var, lx3 lx3Var, vx3 vx3Var, a66 a66Var, int i) {
        if ((i & 1) != 0) {
            lx3Var = hz4.a;
        }
        if ((i & 2) != 0) {
            vx3Var = vx3.a;
        }
        return S(sx3Var, lx3Var, vx3Var, a66Var);
    }

    public static void U(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.getMarginEnd() != i) {
            marginLayoutParams.setMarginEnd(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void V(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.getMarginStart() != i) {
            marginLayoutParams.setMarginStart(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void W(MediaFormat mediaFormat, i63 i63Var) {
        if (i63Var != null) {
            X(mediaFormat, "color-transfer", i63Var.c);
            X(mediaFormat, "color-standard", i63Var.a);
            X(mediaFormat, "color-range", i63Var.b);
            byte[] bArr = i63Var.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    public static void X(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static Pair Y(m4b m4bVar, k4b k4bVar, m4b m4bVar2, k4b k4bVar2, k3b k3bVar) {
        boolean z = k4bVar2.a;
        boolean z2 = k4bVar2.b;
        if (z && k3bVar.a(17) && !k4bVar.a) {
            m4bVar2 = m4bVar2.l(m4bVar.j);
            k4bVar2 = new k4b(false, z2);
        }
        if (z2 && k3bVar.a(30) && !k4bVar.b) {
            m4bVar2 = m4bVar2.b(m4bVar.D);
            k4bVar2 = new k4b(k4bVar2.a, false);
        }
        return new Pair(m4bVar2, k4bVar2);
    }

    public static void Z(Throwable th) {
        qj3 qj3Var = s0;
        if (th == null) {
            th = q45.b("onError called with a null Throwable.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof QueueOverflowException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new UndeliverableException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
        }
        if (qj3Var != null) {
            try {
                qj3Var.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            }
        }
        th.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final int a(int i, int i2, int i3) {
        int i4 = i - (i % 16);
        int i5 = i4 / i2;
        if (i5 == 9) {
            return i4;
        }
        int i6 = i2 * 9;
        int i7 = i6 % 16;
        if (i7 == 0) {
            return i6;
        }
        int i8 = i6 - i7;
        int i9 = 9 - i5;
        int i10 = i3 - i8;
        return (i9 <= 0 || i10 <= 0) ? i8 : i8 + (Math.min(i9, i10 / 16) * 16);
    }

    public static void a0(y7d y7dVar, String str) throws Throwable {
        int iK = K(new c65(str).e(1, "Orientation"));
        if (iK == 0) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iK);
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
        bitmapDecodeFile.recycle();
        i0(str, bitmapCreateBitmap, y7dVar);
        bitmapCreateBitmap.recycle();
    }

    public static final boolean b(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!tpa.f(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final void b0(int i, int i2, Object[] objArr) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final String c(Object[] objArr, int i, int i2, Collection collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static boolean c0(y7d y7dVar, String str, String str2) {
        qyc qycVar = (qyc) y7dVar;
        qycVar.getClass();
        long j = 1920;
        return d0(str, str2, (int) qycVar.q(PmsKey.f48imagewidth, j), (int) qycVar.q(PmsKey.f45imageheight, j), (int) (qycVar.g.getFloat(PmsKey.f46imagequality.name(), 0.8f) * 100));
    }

    public static boolean d0(String str, String str2, int i, int i2, int i3) {
        Point pointE = E(str, false);
        int i4 = pointE.x;
        int i5 = pointE.y;
        if (i4 > i5) {
            i2 = i;
            i = i2;
        }
        if (i4 <= i && i5 <= i2) {
            return false;
        }
        int iE = new c65(str).e(1, "Orientation");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = I(pointE, i, i2);
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        try {
            h0(str2, bitmapDecodeFile, i3, Bitmap.CompressFormat.JPEG);
            bitmapDecodeFile.recycle();
            c65 c65Var = new c65(str2);
            c65Var.F("Orientation", String.valueOf(iE));
            c65Var.B();
            return true;
        } catch (Throwable th) {
            if (bitmapDecodeFile != null) {
                bitmapDecodeFile.recycle();
            }
            throw th;
        }
    }

    public static void e(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (th != th2) {
            Integer num = q77.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = u2b.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static Bitmap e0(int i, int i2, Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        return (height < i || height > i2 || width < i || width > i2) ? (height < i || width < i) ? Bitmap.createScaledBitmap(bitmap, i, i, false) : Bitmap.createScaledBitmap(bitmap, i2, i2, false) : bitmap;
    }

    public static boolean f(qad qadVar, qad qadVar2) {
        p3b p3bVar = qadVar.a;
        int i = p3bVar.b;
        p3b p3bVar2 = qadVar2.a;
        return i == p3bVar2.b && p3bVar.e == p3bVar2.e && p3bVar.h == p3bVar2.h && p3bVar.i == p3bVar2.i;
    }

    public static final Object f0(lx3 lx3Var, a66 a66Var) throws Throwable {
        a45 a45VarA;
        lx3 lx3VarM;
        Thread threadCurrentThread = Thread.currentThread();
        kx3 kx3Var = vu4.b;
        iu3 iu3Var = (iu3) lx3Var.get(kx3Var);
        hz4 hz4Var = hz4.a;
        if (iu3Var == null) {
            a45VarA = use.a();
            lx3VarM = v3c.m(hz4Var, lx3Var.plus(a45VarA), true);
            jd4 jd4Var = ql4.a;
            if (lx3VarM != jd4Var && lx3VarM.get(kx3Var) == null) {
                lx3VarM = lx3VarM.plus(jd4Var);
            }
        } else {
            if (iu3Var instanceof a45) {
            }
            a45VarA = (a45) use.a.get();
            lx3VarM = v3c.m(hz4Var, lx3Var, true);
            jd4 jd4Var2 = ql4.a;
            if (lx3VarM != jd4Var2 && lx3VarM.get(kx3Var) == null) {
                lx3VarM = lx3VarM.plus(jd4Var2);
            }
        }
        jp0 jp0Var = new jp0(lx3VarM, threadCurrentThread, a45VarA);
        jp0Var.start(vx3.a, jp0Var, a66Var);
        a45 a45Var = jp0Var.b;
        if (a45Var != null) {
            int i = a45.o;
            a45Var.S(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jE0 = a45Var != null ? a45Var.e0() : Long.MAX_VALUE;
                if (jp0Var.isCompleted()) {
                    if (a45Var != null) {
                        int i2 = a45.o;
                        a45Var.d(false);
                    }
                    Object objA = a97.a(jp0Var.getState$kotlinx_coroutines_core());
                    lb3 lb3Var = objA instanceof lb3 ? (lb3) objA : null;
                    if (lb3Var == null) {
                        return objA;
                    }
                    throw lb3Var.a;
                }
                LockSupport.parkNanos(jp0Var, jE0);
            } catch (Throwable th) {
                if (a45Var != null) {
                    int i3 = a45.o;
                    a45Var.d(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        jp0Var.cancelCoroutine(interruptedException);
        throw interruptedException;
    }

    public static final zf4 g(sx3 sx3Var, lx3 lx3Var, vx3 vx3Var, a66 a66Var) {
        lx3 lx3VarX = v3c.x(sx3Var, lx3Var);
        vx3Var.getClass();
        zf4 me7Var = vx3Var == vx3.b ? new me7(lx3VarX, a66Var) : new zf4(lx3VarX, true, true);
        me7Var.start(vx3Var, me7Var, a66Var);
        return me7Var;
    }

    public static /* synthetic */ zf4 h(sx3 sx3Var, nx3 nx3Var, a66 a66Var, int i) {
        lx3 lx3Var = nx3Var;
        if ((i & 1) != 0) {
            lx3Var = hz4.a;
        }
        return g(sx3Var, lx3Var, vx3.a, a66Var);
    }

    public static void h0(String str, Bitmap bitmap, int i, Bitmap.CompressFormat compressFormat) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(str);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(compressFormat, i, fileOutputStream);
            hm9.m("j47", "save bitmap success! %s", str);
            s5c.m(fileOutputStream);
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            hm9.p("j47", "save bitmap failure!", e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            s5c.m(fileOutputStream2);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(kotlin.coroutines.Continuation r4) throws java.lang.Throwable {
        /*
            boolean r0 = r4 instanceof defpackage.ig4
            if (r0 == 0) goto L13
            r0 = r4
            ig4 r0 = (defpackage.ig4) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            ig4 r0 = new ig4
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            defpackage.od2.a0(r4)
            goto L47
        L2f:
            defpackage.od2.a0(r4)
            r0.X = r3
            sy1 r4 = new sy1
            kotlin.coroutines.Continuation r0 = defpackage.v3c.u(r0)
            r4.<init>(r3, r0)
            r4.n()
            java.lang.Object r4 = r4.m()
            if (r4 != r1) goto L47
            return
        L47:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j47.i(kotlin.coroutines.Continuation):void");
    }

    public static void i0(String str, Bitmap bitmap, y7d y7dVar) throws Throwable {
        try {
            qyc qycVar = (qyc) y7dVar;
            qycVar.getClass();
            h0(str, bitmap, (int) (qycVar.g.getFloat(PmsKey.f46imagequality.name(), 0.8f) * 100), Bitmap.CompressFormat.JPEG);
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.iab r4, defpackage.k56 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.cab
            if (r0 == 0) goto L13
            r0 = r6
            cab r0 = (defpackage.cab) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            cab r0 = new cab
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            k56 r5 = r0.o
            defpackage.od2.a0(r6)     // Catch: java.lang.Throwable -> L29
            goto L66
        L29:
            r4 = move-exception
            goto L6c
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.od2.a0(r6)
            c32 r6 = defpackage.c32.X
            lx3 r2 = r0.b
            jx3 r6 = r2.get(r6)
            if (r6 != r4) goto L70
            r0.getClass()     // Catch: java.lang.Throwable -> L29
            r0.o = r5     // Catch: java.lang.Throwable -> L29
            r0.Y = r3     // Catch: java.lang.Throwable -> L29
            sy1 r6 = new sy1     // Catch: java.lang.Throwable -> L29
            kotlin.coroutines.Continuation r0 = defpackage.v3c.u(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.n()     // Catch: java.lang.Throwable -> L29
            c01 r0 = new c01     // Catch: java.lang.Throwable -> L29
            r2 = 8
            r0.<init>(r2, r6)     // Catch: java.lang.Throwable -> L29
            fab r4 = (defpackage.fab) r4     // Catch: java.lang.Throwable -> L29
            r4.k(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.m()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L66
            return r1
        L66:
            r5.invoke()
            e5f r4 = defpackage.e5f.a
            return r4
        L6c:
            r5.invoke()
            throw r4
        L70:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j47.j(iab, k56, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Bitmap j0(int i, int i2, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Matrix matrix = new Matrix();
        matrix.setScale(i / bitmap.getWidth(), i2 / bitmap.getHeight(), 0.0f, 0.0f);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(2));
        return bitmapCreateBitmap;
    }

    public static void k(String str) {
        if (maf.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void k0(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(zr6.h(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static final int l(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static void l0(ViewGroup viewGroup) {
        viewGroup.setEnabled(false);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (childAt instanceof Spinner) {
                    Spinner spinner = (Spinner) childAt;
                    if (spinner.getSelectedView() != null) {
                        spinner.getSelectedView().setEnabled(false);
                    }
                } else if (childAt instanceof ViewGroup) {
                    l0((ViewGroup) childAt);
                }
                childAt.setEnabled(false);
            }
        }
    }

    public static final int m(int i, long j, long[] jArr) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static void m0(q3b q3bVar, ph8 ph8Var) {
        int i = ph8Var.b;
        zw6 zw6Var = ph8Var.a;
        if (i == -1) {
            if (q3bVar.t1(20)) {
                q3bVar.O0(zw6Var);
                return;
            } else {
                if (zw6Var.isEmpty()) {
                    return;
                }
                q3bVar.C0((tb8) zw6Var.get(0));
                return;
            }
        }
        boolean zT1 = q3bVar.t1(20);
        long j = ph8Var.c;
        if (zT1) {
            q3bVar.H0(ph8Var.b, j, zw6Var);
        } else {
            if (zw6Var.isEmpty()) {
                return;
            }
            q3bVar.t((tb8) zw6Var.get(0), j);
        }
    }

    public static int n(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return 0;
        }
        if (j2 == 0) {
            return 100;
        }
        return oaf.j((int) ((j * 100) / j2), 0, 100);
    }

    public static String n0(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static void o(View view, int i) {
        if (view.getPaddingBottom() != i) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
        }
    }

    public static Bitmap o0(int i, int i2, Context context) {
        Drawable drawableB = kt3.b(context, i);
        if (drawableB != null) {
            aq4.h(drawableB, ColorStateList.valueOf(i2));
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableB.getIntrinsicWidth(), drawableB.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableB.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableB.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static void p(View view, int i) {
        WeakHashMap weakHashMap = zmf.a;
        if (view.getPaddingEnd() != i) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
        }
    }

    public static final long p0(long j) {
        int i = ft4.o;
        boolean z = j > 0;
        if (z) {
            return ft4.e(ft4.h(j, z7.S(999999L, kt4.NANOSECONDS)));
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }

    public static void q(View view, int i) {
        WeakHashMap weakHashMap = zmf.a;
        if (view.getPaddingStart() != i) {
            view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    public static JSONObject q0(yie yieVar) throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("versionName", yieVar.a);
        jSONObject.put("versionCode", yieVar.b);
        jSONObject.put("packageName", yieVar.c);
        jSONObject.put("environment", yieVar.d);
        jSONObject.put("buildUuid", yieVar.e);
        jSONObject.put("sessionUuid", yieVar.f);
        jSONObject.put("device", yieVar.g);
        jSONObject.put("deviceId", yieVar.h);
        jSONObject.put("vendor", yieVar.i);
        jSONObject.put("osVersion", yieVar.j);
        jSONObject.put("inBackground", yieVar.k);
        jSONObject.put("isRooted", yieVar.l);
        jSONObject.put("properties", new JSONObject((Map<?, ?>) yieVar.m));
        Set<po6> set = yieVar.n;
        if (set == null || set.isEmpty()) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray();
            for (po6 po6Var : set) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("packageName", po6Var.a);
                jSONObject2.put("versionName", po6Var.b);
                jSONObject2.put("buildUuid", po6Var.c);
                jSONObject2.put("environment", po6Var.d);
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("hostedLibrariesInfo", jSONArray);
        return jSONObject;
    }

    public static void r(View view, int i) {
        if (view.getPaddingTop() != i) {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static nw4 r0(Object obj) {
        return new nw4(obj.getClass().getSimpleName());
    }

    public static void s(Rect rect, View view) {
        int[] iArr = Y;
        view.getLocationInWindow(iArr);
        int i = iArr[1];
        Rect rect2 = i < rect.top ? new Rect(0, rect.top - i, view.getWidth(), view.getHeight()) : null;
        if (view.getHeight() + i > rect.bottom) {
            int height = view.getHeight() - ((view.getHeight() + i) - rect.bottom);
            if (rect2 == null) {
                rect2 = new Rect(0, 0, view.getWidth(), height);
            } else {
                rect2.bottom = height;
            }
        }
        if (rect2 != null) {
            view.setClipBounds(rect2);
        } else {
            view.setClipBounds(null);
        }
    }

    public static final void s0(j5d j5dVar, Object obj) {
        Object objN = j5dVar.n(obj);
        if (!(objN instanceof h42)) {
        } else {
            Object obj2 = ((i42) f0(hz4.a, new k42(j5dVar, obj, null))).a;
        }
    }

    public static qy5 t(MediaFormat mediaFormat) {
        float integer;
        byte[] bArr;
        ny5 ny5Var = new ny5();
        ny5Var.m = ia9.l(mediaFormat.getString("mime"));
        ny5Var.d = mediaFormat.getString("language");
        ny5Var.h = J(mediaFormat, "max-bitrate", -1);
        ny5Var.g = J(mediaFormat, "bitrate", -1);
        ny5Var.i = mediaFormat.getString("codecs-string");
        if (mediaFormat.containsKey("frame-rate")) {
            try {
                integer = mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                integer = mediaFormat.getInteger("frame-rate");
            }
        } else {
            integer = -1.0f;
        }
        ny5Var.u = integer;
        ny5Var.s = J(mediaFormat, "width", -1);
        ny5Var.t = J(mediaFormat, "height", -1);
        ny5Var.w = (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : 1.0f;
        ny5Var.n = J(mediaFormat, "max-input-size", -1);
        int i = 0;
        ny5Var.v = J(mediaFormat, "rotation-degrees", 0);
        i63 i63Var = null;
        if (oaf.a >= 24) {
            int iJ = J(mediaFormat, "color-standard", -1);
            int iJ2 = J(mediaFormat, "color-range", -1);
            int iJ3 = J(mediaFormat, "color-transfer", -1);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            if (byteBuffer != null) {
                byte[] bArr2 = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr2);
                bArr = bArr2;
            } else {
                bArr = null;
            }
            if (iJ != -1 || iJ2 != -1 || iJ3 != -1 || bArr != null) {
                i63Var = new i63(iJ, iJ2, iJ3, -1, -1, bArr);
            }
        }
        ny5Var.z = i63Var;
        ny5Var.B = J(mediaFormat, "sample-rate", -1);
        ny5Var.A = J(mediaFormat, "channel-count", -1);
        ny5Var.C = J(mediaFormat, "pcm-encoding", -1);
        wmd.i(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-" + i);
            if (byteBuffer2 == null) {
                ny5Var.p = zw6.h(i2, objArrCopyOf);
                return new qy5(ny5Var);
            }
            byte[] bArr3 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr3);
            byteBuffer2.rewind();
            int i3 = i2 + 1;
            if (objArrCopyOf.length < i3) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, pw6.h(objArrCopyOf.length, i3));
            }
            objArrCopyOf[i2] = bArr3;
            i++;
            i2 = i3;
        }
    }

    public static final Object t0(lx3 lx3Var, a66 a66Var, Continuation continuation) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        lx3 context = continuation.getContext();
        lx3 lx3VarPlus = !((Boolean) lx3Var.fold(Boolean.FALSE, new ai0(11))).booleanValue() ? context.plus(lx3Var) : v3c.m(context, lx3Var, false);
        pag.j(lx3VarPlus);
        if (lx3VarPlus == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(lx3VarPlus, continuation);
            return oag.C(scopeCoroutine, scopeCoroutine, a66Var);
        }
        vu4 vu4Var = vu4.b;
        if (tpa.f(lx3VarPlus.get(vu4Var), context.get(vu4Var))) {
            z4f z4fVar = new z4f(lx3VarPlus, continuation);
            lx3 context2 = z4fVar.getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context2, null);
            try {
                return oag.C(z4fVar, z4fVar, a66Var);
            } finally {
                ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
            }
        }
        nl4 nl4Var = new nl4(lx3VarPlus, continuation);
        tu0.M(a66Var, nl4Var, nl4Var);
        do {
            atomicIntegerFieldUpdater = nl4.a;
            int i = atomicIntegerFieldUpdater.get(nl4Var);
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                Object objA = a97.a(nl4Var.getState$kotlinx_coroutines_core());
                if (objA instanceof lb3) {
                    throw ((lb3) objA).a;
                }
                return objA;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(nl4Var, 0, 1));
        return tx3.a;
    }

    public static MediaFormat u(qy5 qy5Var) {
        int i;
        MediaFormat mediaFormat = new MediaFormat();
        X(mediaFormat, "bitrate", qy5Var.i);
        X(mediaFormat, "max-bitrate", qy5Var.h);
        X(mediaFormat, "channel-count", qy5Var.B);
        W(mediaFormat, qy5Var.A);
        String str = qy5Var.n;
        if (str != null) {
            mediaFormat.setString("mime", str);
        }
        String str2 = qy5Var.j;
        if (str2 != null) {
            mediaFormat.setString("codecs-string", str2);
        }
        float f = qy5Var.v;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        X(mediaFormat, "width", qy5Var.t);
        X(mediaFormat, "height", qy5Var.u);
        k0(mediaFormat, qy5Var.q);
        int i2 = qy5Var.D;
        if (i2 != -1) {
            X(mediaFormat, "exo-pcm-encoding-int", i2);
            if (i2 == 0) {
                i = 0;
            } else if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    i = 4;
                    if (i2 != 4) {
                        i = 21;
                        if (i2 != 21) {
                            i = 22;
                            if (i2 == 22) {
                            }
                        }
                    }
                }
            } else {
                i = 2;
            }
            mediaFormat.setInteger("pcm-encoding", i);
        }
        String str3 = qy5Var.d;
        if (str3 != null) {
            mediaFormat.setString("language", str3);
        }
        X(mediaFormat, "max-input-size", qy5Var.o);
        X(mediaFormat, "sample-rate", qy5Var.C);
        X(mediaFormat, "caption-service-number", qy5Var.G);
        mediaFormat.setInteger("rotation-degrees", qy5Var.w);
        int i3 = qy5Var.e;
        int i4 = 1;
        mediaFormat.setInteger("is-autoselect", (i3 & 4) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-default", (i3 & 1) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-forced-subtitle", (i3 & 2) != 0 ? 1 : 0);
        mediaFormat.setInteger("encoder-delay", qy5Var.E);
        mediaFormat.setInteger("encoder-padding", qy5Var.F);
        float f2 = qy5Var.x;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f2);
        int i5 = 1073741824;
        if (f2 < 1.0f) {
            i4 = (int) (f2 * 1073741824);
        } else if (f2 > 1.0f) {
            i4 = 1073741824;
            i5 = (int) (1073741824 / f2);
        } else {
            i5 = 1;
        }
        mediaFormat.setInteger("sar-width", i4);
        mediaFormat.setInteger("sar-height", i5);
        return mediaFormat;
    }

    public static final Object x(long j, Continuation continuation) {
        e5f e5fVar = e5f.a;
        if (j <= 0) {
            return e5fVar;
        }
        sy1 sy1Var = new sy1(1, v3c.u(continuation));
        sy1Var.n();
        if (j < Long.MAX_VALUE) {
            H(sy1Var.getContext()).mo21scheduleResumeAfterDelay(j, sy1Var);
        }
        Object objM = sy1Var.m();
        return objM == tx3.a ? objM : e5fVar;
    }

    public static final Object y(long j, Continuation continuation) {
        Object objX = x(p0(j), continuation);
        return objX == tx3.a ? objX : e5f.a;
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return z().toString();
            default:
                return super.toString();
        }
    }

    public e99 v(j99 j99Var) {
        ByteBuffer byteBuffer = j99Var.o;
        byteBuffer.getClass();
        np8.d(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (j99Var.f(Integer.MIN_VALUE)) {
            return null;
        }
        return w(j99Var, byteBuffer);
    }

    public abstract e99 w(j99 j99Var, ByteBuffer byteBuffer);

    public abstract Object z();
}
