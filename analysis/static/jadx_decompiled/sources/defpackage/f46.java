package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.text.TextUtils;
import android.util.Rational;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import org.webrtc.RTCStats;
import org.webrtc.SessionDescription;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public abstract class f46 {
    public static e46 a;
    public static final Object[] b = new Object[0];
    public static final float[] c = new float[9];
    public static final qx7 d = new qx7(17);
    public static String e;
    public static final /* synthetic */ int f = 0;

    public static final void A() {
        I();
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static final void C(View view, int i, int i2) {
        Rect rect = new Rect();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new cye(view, rect, i, i2));
            return;
        }
        view.getHitRect(rect);
        if (rect.width() < i) {
            int iWidth = (i - rect.width()) / 2;
            rect.left -= iWidth;
            rect.right += iWidth;
        }
        if (rect.height() < i2) {
            int iHeight = (i2 - rect.height()) / 2;
            rect.top -= iHeight;
            rect.bottom += iHeight;
        }
        view.setTouchDelegate(new o85(rect, view));
    }

    public static void D(int i, View view, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        viewGroup.post(new uc3(view, 0, 0, i, 0, viewGroup, 1));
    }

    public static bg1 E(JSONObject jSONObject) {
        long jOptLong = jSONObject.optLong("participantId");
        String strOptString = jSONObject.optString("participantType");
        return new bg1("GROUP".equals(strOptString) ? 2 : 1, jSONObject.optInt("deviceIdx"), jOptLong);
    }

    public static bg1 F(JSONObject jSONObject) {
        long jOptLong = jSONObject.optLong("id");
        String strOptString = jSONObject.optString("idType");
        return new bg1("GROUP".equals(strOptString) ? 2 : 1, jSONObject.optInt("deviceIdx"), jOptLong);
    }

    public static ssa G(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        usa usaVarA = null;
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        int iOptInt = jSONObjectOptJSONObject.optInt("maxDimension");
        int iOptInt2 = jSONObjectOptJSONObject.optInt("maxBitrateK");
        int iOptInt3 = jSONObjectOptJSONObject.optInt("maxFramerate");
        String strOptString = jSONObjectOptJSONObject.optString("degradationPreference");
        try {
            usaVarA = usa.a(jSONObjectOptJSONObject.getJSONObject("bitrates"));
        } catch (Exception unused) {
        }
        return new ssa(iOptInt, iOptInt, iOptInt2, iOptInt3, strOptString, usaVarA, 1, 0, "");
    }

    public static String H(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str = null;
        for (Map.Entry entry : map.entrySet()) {
            int iQ = Q((String) entry.getKey());
            if (iQ != 0 && (str == null || iQ > Q(str))) {
                str = (String) entry.getKey();
            }
        }
        if (str != null) {
            return (String) map.get(str);
        }
        return null;
    }

    public static e46 I() {
        qq9 qq9Var;
        e46 e46Var = a;
        if (e46Var != null) {
            return e46Var;
        }
        synchronized (f46.class) {
            qq9Var = new qq9();
            a = qq9Var;
        }
        return qq9Var;
    }

    public static final rg7 J(eh7 eh7Var) {
        rg7 rg7Var;
        gh7 gh7VarQ = eh7Var.Q();
        loop0: while (true) {
            AtomicReference atomicReference = gh7VarQ.a;
            rg7Var = (rg7) atomicReference.get();
            if (rg7Var == null) {
                hde hdeVarA = a();
                jd4 jd4Var = ql4.a;
                rg7Var = new rg7(gh7VarQ, hdeVarA.plus(MainDispatcherLoader.dispatcher.getImmediate()));
                while (!atomicReference.compareAndSet(null, rg7Var)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                jd4 jd4Var2 = ql4.a;
                j47.T(rg7Var, MainDispatcherLoader.dispatcher.getImmediate(), null, new qg7(rg7Var, null), 2);
                break loop0;
            }
            break;
        }
        return rg7Var;
    }

    public static float K(Matrix matrix) {
        double dPow = Math.pow(L(matrix, 0), 2.0d);
        matrix.getValues(c);
        return (float) Math.sqrt(Math.pow(r4[3], 2.0d) + dPow);
    }

    public static float L(Matrix matrix, int i) {
        float[] fArr = c;
        matrix.getValues(fArr);
        return fArr[i];
    }

    public static String M(rd8 rd8Var) {
        if (rd8Var == null) {
            return null;
        }
        int i = uh6.a[rd8Var.ordinal()];
        if (i == 1) {
            return "UNMUTE";
        }
        if (i == 2) {
            return "MUTE";
        }
        if (i == 3) {
            return "MUTE_PERMANENT";
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalArgumentException("Unknown media option state: " + rd8Var);
    }

    public static ArrayList N(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                bg1 bg1VarB = bg1.b(jSONArrayOptJSONArray.getString(i));
                if (bg1VarB != null) {
                    arrayList.add(bg1VarB);
                }
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    public static Rational O(int i, Rational rational) {
        return (i == 90 || i == 270) ? rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator()) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static String P(m7d m7dVar) {
        String str;
        String str2;
        cd9 cd9Var = m7dVar.a.c;
        if (cd9Var != null) {
            str = ":m" + cd9Var.a;
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        fp1 fp1Var = m7dVar.a;
        sb.append(fp1Var.b.c());
        sb.append(":");
        int i = uh6.b[fp1Var.a.ordinal()];
        if (i == 1) {
            str2 = "sCAMERA";
        } else if (i == 2) {
            str2 = "sSCREEN";
        } else if (i == 3) {
            str2 = "sMOVIE";
        } else if (i == 4) {
            str2 = "sSTREAM";
        } else {
            if (i != 5) {
                throw new RuntimeException("Unknown VideoTrackType");
            }
            str2 = "sANIMOJI";
        }
        return zr6.l(sb, str2, str);
    }

    public static int Q(String str) {
        if (oag.t(str)) {
            return 0;
        }
        if (!str.startsWith("MP4") && !str.startsWith("mp4")) {
            return 0;
        }
        try {
            return Integer.parseInt(str.split("_")[1]);
        } catch (Exception e2) {
            hm9.p("f46", "failed to parse mp4 video key: ".concat(str), e2);
            return 0;
        }
    }

    public static final k43 R(qnf qnfVar) {
        k43 k43Var;
        synchronized (d) {
            k43Var = (k43) qnfVar.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (k43Var == null) {
                lx3 immediate = hz4.a;
                try {
                    jd4 jd4Var = ql4.a;
                    immediate = MainDispatcherLoader.dispatcher.getImmediate();
                } catch (IllegalStateException | jr9 unused) {
                }
                k43 k43Var2 = new k43(immediate.plus(a()));
                qnfVar.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", k43Var2);
                k43Var = k43Var2;
            }
        }
        return k43Var;
    }

    public static final void S(lx3 lx3Var, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            j47.Z(th);
        } catch (Throwable th2) {
            j47.e(th, th2);
            wmd.v(lx3Var, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:255:0x0284 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.hv5 T(defpackage.gy8 r22) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f46.T(gy8):hv5");
    }

    public static boolean U(String str) {
        return "service.unavailable".equals(str) || "io.exception".equals(str) || "service.timeout".equals(str);
    }

    public static boolean V(int i) {
        return i == 256 || i == 4101;
    }

    public static final boolean W() {
        I();
        return false;
    }

    public static final boolean X(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static HashSet Y(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        gi6 gi6Var;
        if (!"hungup".equals(jSONObject.optString("notification")) || (jSONArrayOptJSONArray = jSONObject.optJSONArray("errors")) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            int iOptInt = jSONArrayOptJSONArray.optInt(i, Integer.MIN_VALUE);
            if (iOptInt != Integer.MIN_VALUE) {
                gi6[] gi6VarArrValues = gi6.values();
                int length = gi6VarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        gi6Var = null;
                        break;
                    }
                    gi6Var = gi6VarArrValues[i2];
                    gi6Var.getClass();
                    if (iOptInt == 1) {
                        break;
                    }
                    i2++;
                }
                if (gi6Var != null) {
                    hashSet.add(gi6Var);
                }
            }
        }
        return hashSet;
    }

    public static fp1 Z(String str) {
        String[] strArrSplit = str.split(":");
        olf olfVar = olf.a;
        olf olfVar2 = olfVar;
        bg1 bg1VarB = null;
        cd9 cd9Var = null;
        for (String str2 : strArrSplit) {
            if (str2 != null) {
                if (str2.startsWith("u") || str2.startsWith("g")) {
                    bg1VarB = bg1.b(str);
                }
                if (str2.startsWith("s")) {
                    switch (str2) {
                        case "sANIMOJI":
                            olfVar2 = olf.c;
                            break;
                        case "sMOVIE":
                            olfVar2 = olf.o;
                            break;
                        case "sCAMERA":
                            olfVar2 = olfVar;
                            break;
                        case "sSCREEN":
                            olfVar2 = olf.b;
                            break;
                        case "sSTREAM":
                            olfVar2 = olf.X;
                            break;
                        default:
                            throw new RuntimeException("Unknown video track type");
                    }
                }
                if (str2.startsWith("m")) {
                    cd9Var = new cd9(Long.parseLong(str2.substring(1)));
                }
            }
        }
        if (bg1VarB == null) {
            return null;
        }
        adb adbVar = new adb(3);
        adbVar.a = bg1VarB;
        adbVar.b = olfVar2;
        adbVar.c = cd9Var;
        return adbVar.c();
    }

    public static hde a() {
        return new hde(null);
    }

    public static bg1 a0(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("video-") || str.length() == 6) {
            return null;
        }
        return bg1.b(str.substring(6));
    }

    public static ka6 b(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("command", str);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            return new ka6(jSONObject2);
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static oq1 b0(List list, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(kq0.w(((xf4) it.next()).c()));
        }
        return f8.g(new u00(f8.g(new x72(kq0.J(arrayList), scheduledExecutorService, MultiFileUploader.UPLOAD_NEXT_INTERVAL, 7)), executor, list, 6));
    }

    public static Object c(RTCStats rTCStats, String str) {
        return rTCStats.getMembers().get(str);
    }

    public static final int c0(int i) {
        switch (au1.s(i)) {
            case 0:
            case 1:
            case 2:
                return 2;
            case 3:
            case 4:
                return 1;
            case 5:
            case 6:
                return 3;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static void d(bg1 bg1Var, JSONObject jSONObject, boolean z) {
        jSONObject.put("participantId", bg1Var.a);
        jSONObject.put("participantType", wg0.n(bg1Var.b));
        if (z) {
            jSONObject.put("deviceIdx", bg1Var.c);
        }
    }

    public static final Object[] d0(Collection collection) {
        int size = collection.size();
        Object[] objArr = b;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            i = i2;
        }
    }

    public static final void e(String str) {
        I();
    }

    public static final Object[] e0(Collection collection, Object[] objArr) {
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                if (objArrCopyOf != objArr) {
                    return Arrays.copyOf(objArrCopyOf, i2);
                }
                objArr[i2] = null;
                return objArr;
            }
            i = i2;
        }
    }

    public static ka6 f(Collection collection, Boolean bool, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bg1 bg1Var = (bg1) it.next();
            jSONArray.put(String.valueOf(wg0.b(bg1Var.b)) + bg1Var.a);
        }
        jSONObject.put("participantIds", jSONArray);
        if (bool != null && bool.booleanValue()) {
            jSONObject.put("unban", true);
        }
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("show_chat_history", true);
            jSONObject.put(ApiProtocol.PARAM_PAYLOAD, jSONObject2.toString());
        }
        return b(jSONObject, "add-participant");
    }

    public static final void f0(y5f y5fVar) {
        y5fVar.e(k29.class, new x4(8));
        y5fVar.e(fwa.class, new x4(9));
        y5fVar.e(uva.class, new x4(10));
        y5fVar.e(xcf.class, new x4(11));
        y5fVar.e(vz.class, new x4(12));
        y5fVar.e(dt8.class, new x4(13));
        y5fVar.e(tpe.class, new cl(1));
        y5fVar.e(u9a.class, new x4(14));
        y5fVar.e(z3b.class, new cl(2));
        y5fVar.e(i00.class, new cl(3));
        y5fVar.e(w80.class, new cl(4));
        y5fVar.c(pi4.class, new g(1));
        y5fVar.e(nif.class, new cl(5));
        y5fVar.e(pb6.class, new cl(6));
        y5fVar.e(jhf.class, new cl(7));
        y5fVar.e(vhf.class, new cl(8));
    }

    public static Bitmap g(ov6 ov6Var) {
        int iK0 = ov6Var.k0();
        if (iK0 == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ov6Var.getWidth(), ov6Var.getHeight(), Bitmap.Config.ARGB_8888);
            ov6Var.v()[0].t().rewind();
            ImageProcessingUtil.e(bitmapCreateBitmap, ov6Var.v()[0].t(), ov6Var.v()[0].A());
            return bitmapCreateBitmap;
        }
        if (iK0 == 35) {
            return ImageProcessingUtil.b(ov6Var);
        }
        if (iK0 != 256 && iK0 != 4101) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + ov6Var.k0() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
        if (!V(ov6Var.k0())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + ov6Var.k0());
        }
        ByteBuffer byteBufferT = ov6Var.v()[0].t();
        int iCapacity = byteBufferT.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferT.rewind();
        byteBufferT.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static final Object g0(lx3 lx3Var, Object obj, Object obj2, a66 a66Var, Continuation continuation) {
        Object objInvoke;
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(lx3Var, obj2);
        try {
            mxd mxdVar = new mxd(lx3Var, continuation);
            if (a66Var instanceof gi0) {
                f8.c(2, a66Var);
                objInvoke = a66Var.invoke(obj, mxdVar);
            } else {
                objInvoke = v3c.H(a66Var, obj, mxdVar);
            }
            ThreadContextKt.restoreThreadContext(lx3Var, objUpdateThreadContext);
            return objInvoke;
        } catch (Throwable th) {
            ThreadContextKt.restoreThreadContext(lx3Var, objUpdateThreadContext);
            throw th;
        }
    }

    public static ka6 h(Set set, Set set2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    jSONObject.put(((oy0) it.next()).name(), true);
                }
            }
            if (set2 != null) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    jSONObject.put(((oy0) it2.next()).name(), false);
                }
            }
            ka6 ka6VarB = b(null, "change-options");
            ka6VarB.a.put("options", jSONObject);
            return ka6VarB;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static byte[] h0(ov6 ov6Var, Rect rect, int i, int i2) throws ImageUtil$CodecFailedException {
        if (ov6Var.k0() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + ov6Var.k0());
        }
        sy4 sy4Var = ov6Var.v()[0];
        sy4 sy4Var2 = ov6Var.v()[1];
        sy4 sy4Var3 = ov6Var.v()[2];
        ByteBuffer byteBufferT = sy4Var.t();
        ByteBuffer byteBufferT2 = sy4Var2.t();
        ByteBuffer byteBufferT3 = sy4Var3.t();
        byteBufferT.rewind();
        byteBufferT2.rewind();
        byteBufferT3.rewind();
        int iRemaining = byteBufferT.remaining();
        byte[] bArr = new byte[((ov6Var.getHeight() * ov6Var.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i3 = 0; i3 < ov6Var.getHeight(); i3++) {
            byteBufferT.get(bArr, width, ov6Var.getWidth());
            width += ov6Var.getWidth();
            byteBufferT.position(Math.min(iRemaining, sy4Var.A() + (byteBufferT.position() - ov6Var.getWidth())));
        }
        int height = ov6Var.getHeight() / 2;
        int width2 = ov6Var.getWidth() / 2;
        int iA = sy4Var3.A();
        int iA2 = sy4Var2.A();
        int iW = sy4Var3.w();
        int iW2 = sy4Var2.w();
        byte[] bArr2 = new byte[iA];
        byte[] bArr3 = new byte[iA2];
        for (int i4 = 0; i4 < height; i4++) {
            byteBufferT3.get(bArr2, 0, Math.min(iA, byteBufferT3.remaining()));
            byteBufferT2.get(bArr3, 0, Math.min(iA2, byteBufferT2.remaining()));
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < width2; i7++) {
                int i8 = width + 1;
                bArr[width] = bArr2[i5];
                width += 2;
                bArr[i8] = bArr3[i6];
                i5 += iW;
                i6 += iW2;
            }
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, ov6Var.getWidth(), ov6Var.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g65[] g65VarArr = u55.c;
        t55 t55Var = new t55(ByteOrder.BIG_ENDIAN);
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = t55Var.a;
        t55Var.c("Orientation", strValueOf, arrayList);
        t55Var.c("XResolution", "72/1", arrayList);
        t55Var.c("YResolution", "72/1", arrayList);
        t55Var.c("ResolutionUnit", String.valueOf(2), arrayList);
        t55Var.c("YCbCrPositioning", String.valueOf(1), arrayList);
        t55Var.c("Make", Build.MANUFACTURER, arrayList);
        t55Var.c("Model", Build.MODEL, arrayList);
        if (ov6Var.getImageInfo() != null) {
            ov6Var.getImageInfo().b(t55Var);
        }
        t55Var.d(i2);
        t55Var.c("ImageWidth", String.valueOf(ov6Var.getWidth()), arrayList);
        t55Var.c("ImageLength", String.valueOf(ov6Var.getHeight()), arrayList);
        ArrayList list = Collections.list(new s55(t55Var));
        if (!((Map) list.get(1)).isEmpty()) {
            t55Var.b("ExposureProgram", String.valueOf(0), list);
            t55Var.b("ExifVersion", "0230", list);
            t55Var.b("ComponentsConfiguration", "1,2,3,0", list);
            t55Var.b("MeteringMode", String.valueOf(0), list);
            t55Var.b("LightSource", String.valueOf(0), list);
            t55Var.b("FlashpixVersion", "0100", list);
            t55Var.b("FocalPlaneResolutionUnit", String.valueOf(2), list);
            t55Var.b("FileSource", String.valueOf(3), list);
            t55Var.b("SceneType", String.valueOf(1), list);
            t55Var.b("CustomRendered", String.valueOf(0), list);
            t55Var.b("SceneCaptureType", String.valueOf(0), list);
            t55Var.b("Contrast", String.valueOf(0), list);
            t55Var.b("Saturation", String.valueOf(0), list);
            t55Var.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(2)).isEmpty()) {
            t55Var.b("GPSVersionID", "2300", list);
            t55Var.b("GPSSpeedRef", "K", list);
            t55Var.b("GPSTrackRef", "T", list);
            t55Var.b("GPSImgDirectionRef", "T", list);
            t55Var.b("GPSDestBearingRef", "T", list);
            t55Var.b("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, ov6Var.getWidth(), ov6Var.getHeight()) : rect, i, new f65(byteArrayOutputStream, new u55(t55Var.b, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new ImageUtil$CodecFailedException("YuvImage failed to encode jpeg.");
    }

    public static ka6 i(Map map, bg1 bg1Var) {
        try {
            ka6 ka6VarB = b(null, "change-participant-state");
            JSONObject jSONObject = ka6VarB.a;
            jSONObject.put("participantState", new JSONObject().put("state", new JSONObject((Map<?, ?>) map)));
            if (bg1Var != null) {
                jSONObject.put("participantId", bg1Var.c());
            }
            return ka6VarB;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static ka6 j(bg1 bg1Var, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("participantId", bg1Var.a);
            jSONObject2.put("participantType", wg0.n(bg1Var.b));
            jSONObject2.put("deviceIdx", bg1Var.c);
            jSONObject2.put("data", jSONObject);
            return b(jSONObject2, "custom-data");
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static o61 k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            int iOptInt = jSONObject.optInt("deviceIdx", 0);
            if (jSONObject.has("decorativeExternalParticipantId")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("decorativeExternalParticipantId");
                if (jSONObject2 == null) {
                    return null;
                }
                String string = jSONObject2.getString("id");
                String lowerCase = jSONObject2.getString("type").toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return new o61(string, lowerCase.equals("anonym") ? 3 : !lowerCase.equals("vk") ? 1 : 2, iOptInt);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("externalId");
            if (jSONObject3 == null) {
                return null;
            }
            String string2 = jSONObject3.getString("id");
            String lowerCase2 = jSONObject3.getString("type").toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            return new o61(string2, lowerCase2.equals("anonym") ? 3 : !lowerCase2.equals("vk") ? 1 : 2, iOptInt);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONObject l(bg1 bg1Var, SessionDescription sessionDescription) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        d(bg1Var, jSONObject, true);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", sessionDescription.type.canonicalForm());
        jSONObject2.put("sdp", sessionDescription.description);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("sdp", jSONObject2);
        jSONObject.put("data", jSONObject3);
        return jSONObject;
    }

    public static rd8 m(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("UNMUTE")) {
            return rd8.a;
        }
        if (str.equals("MUTE")) {
            return rd8.b;
        }
        if (str.equals("MUTE_PERMANENT")) {
            return rd8.c;
        }
        return null;
    }

    public static HashMap n(JSONObject jSONObject) {
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("muteStates");
        if (jSONObjectOptJSONObject != null) {
            map.put(qd8.a, m(jSONObjectOptJSONObject.optString("AUDIO")));
            map.put(qd8.b, m(jSONObjectOptJSONObject.optString("VIDEO")));
            map.put(qd8.c, m(jSONObjectOptJSONObject.optString("SCREEN_SHARING")));
            map.put(qd8.o, m(jSONObjectOptJSONObject.optString("MOVIE_SHARING")));
        }
        return map;
    }

    public static ji9 o(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediaSettings");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new ji9(jSONObjectOptJSONObject.optBoolean("isAudioEnabled", false), jSONObjectOptJSONObject.optBoolean("isVideoEnabled", false), jSONObjectOptJSONObject.optBoolean("isScreenSharingEnabled", false), jSONObjectOptJSONObject.optBoolean("isAnimojiEnabled", false));
    }

    public static JSONObject p(dpd dpdVar, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isVideoEnabled", dpdVar.a);
            jSONObject.put("isAudioEnabled", dpdVar.b);
            jSONObject.put("isScreenSharingEnabled", dpdVar.c);
            jSONObject.put("isAnimojiEnabled", dpdVar.e);
            if (z) {
                jSONObject.put("isFastScreenSharingEnabled", dpdVar.d);
            }
            if (z2) {
                jSONObject.put("isAudioSharingEnabled", dpdVar.f);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static kpa q(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(ApiProtocol.PARAM_PEER_ID);
        if (jSONObjectOptJSONObject != null) {
            return new kpa(jSONObjectOptJSONObject.getString("id"), jSONObjectOptJSONObject.optString("type", "WEB_SOCKET"));
        }
        return null;
    }

    public static ka6 r(bg1 bg1Var, boolean z) {
        try {
            ka6 ka6VarB = b(null, "promote-participant");
            JSONObject jSONObject = ka6VarB.a;
            jSONObject.put("demote", !z);
            jSONObject.put("participantId", bg1Var.c());
            return ka6VarB;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static ka6 s(bg1 bg1Var, Boolean bool, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        d(bg1Var, jSONObject, false);
        if (bool != null && bool.booleanValue()) {
            jSONObject.put("unban", true);
        }
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("show_chat_history", true);
            jSONObject.put(ApiProtocol.PARAM_PAYLOAD, jSONObject2.toString());
        }
        return b(jSONObject, "add-participant");
    }

    public static ka6 t(int i, Integer num, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, boolean z7, boolean z8, boolean z9) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("maxH264Decoders", i);
        if (num != null) {
            jSONObject.put("estimatedPerformanceIndex", num);
        }
        jSONObject.put("producerNotificationDataChannelVersion", 7);
        jSONObject.put("producerCommandDataChannelVersion", i2);
        jSONObject.put("audioMix", true);
        jSONObject.put("consumerUpdate", z);
        jSONObject.put("onDemandTracks", z2);
        jSONObject.put("singleSession", true);
        jSONObject.put("unifiedPlan", true);
        jSONObject.put("fastScreenShare", true);
        if (z3) {
            jSONObject.put("producerScreenDataChannelVersion", 1);
        }
        if (z4) {
            jSONObject.put("consumerScreenDataChannelVersion", 1);
        }
        if (z6) {
            jSONObject.put("animojiDataChannelVersion", 2);
        }
        if (z7) {
            jSONObject.put("asrDataChannelVersion", 1);
        }
        if (z8) {
            jSONObject.put("consumerFastScreenShare", true);
        }
        jSONObject.put("consumerFastScreenShareQualityOnDemand", true);
        if (z9) {
            jSONObject.put("audioShare", true);
        }
        jSONObject.put("red", z5);
        if (i3 > 0) {
            jSONObject.put("videoTracksCount", i3);
            jSONObject.put("csrcAccessible", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("capabilities", jSONObject);
        return b(jSONObject2, "allocate-consumer");
    }

    public static ka6 u(bg1 bg1Var, List list, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", bg1Var.c());
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((eg1) it.next());
        }
        jSONObject.put("roles", jSONArray);
        jSONObject.put("revoke", z);
        return b(jSONObject, "grant-roles");
    }

    public static ka6 v(bg1 bg1Var, zad zadVar, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", bg1Var.c());
        if (zadVar instanceof yad) {
            jSONObject.put("roomId", ((yad) zadVar).a);
        }
        jSONObject.put("unpin", !z);
        return b(jSONObject, "pin-participant");
    }

    public static ka6 w(bg1 bg1Var, IceCandidate iceCandidate) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("candidate", iceCandidate.sdp.replaceAll("(raddr|rport)\\s.+?\\s", ""));
        jSONObject.put("sdpMid", iceCandidate.sdpMid);
        jSONObject.put("sdpMLineIndex", iceCandidate.sdpMLineIndex);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("candidate", jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        d(bg1Var, jSONObject3, true);
        jSONObject3.put("data", jSONObject2);
        return b(jSONObject3, "transmit-data");
    }

    public static ka6 x(bg1 bg1Var, IceCandidate[] iceCandidateArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (IceCandidate iceCandidate : iceCandidateArr) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("candidate", iceCandidate.sdp.replaceAll("(raddr|rport)\\s.+?\\s", ""));
            jSONObject.put("sdpMid", iceCandidate.sdpMid);
            jSONObject.put("sdpMLineIndex", iceCandidate.sdpMLineIndex);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("candidates-removed", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        d(bg1Var, jSONObject3, true);
        jSONObject3.put("data", jSONObject2);
        return b(jSONObject3, "transmit-data");
    }

    public static ArrayList y(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("roles")) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    arrayList.add(eg1.valueOf(jSONArrayOptJSONArray.getString(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return arrayList;
    }

    public static ka6 z(zge zgeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "switch-room");
        if (zgeVar == null) {
            return new ka6(jSONObject);
        }
        zad zadVar = zgeVar.a;
        if (zadVar != null && (zadVar instanceof yad)) {
            jSONObject.put("toRoomId", ((yad) zadVar).a);
        }
        bg1 bg1Var = zgeVar.b;
        if (bg1Var != null) {
            jSONObject.put("participantId", bg1Var.c());
        }
        return new ka6(jSONObject);
    }
}
