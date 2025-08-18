package defpackage;

import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.WindowInsets;
import com.google.android.exoplayer2.ParserException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.ServiceConfigurationError;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.util.LangUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class br7 {
    public static String a;
    public static final bkb c;
    public static bkb o;
    public static volatile kl7 s0;
    public static final String[] b = {"com.sec.android.app.sbrowser"};
    public static final String[] X = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] Y = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] Z = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    static {
        Object obj = null;
        c = new bkb(obj, obj, obj);
    }

    public static final int A(je7 je7Var) {
        if (je7Var.a()) {
            return ((View) je7Var.getValue()).getMeasuredHeight();
        }
        return 0;
    }

    public static final int B(je7 je7Var) {
        if (je7Var.a()) {
            return ((View) je7Var.getValue()).getMeasuredWidth();
        }
        return 0;
    }

    public static final cc7 C() {
        s9e s9eVar = s9e.a;
        s9e s9eVar2 = s9e.a;
        return new by9();
    }

    public static final int D(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static final Integer E(View view) {
        Insets insetsIgnoringVisibility;
        if (Build.VERSION.SDK_INT < 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                return Integer.valueOf(rootWindowInsets.getStableInsetTop());
            }
            return null;
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        if (rootWindowInsets2 == null || (insetsIgnoringVisibility = rootWindowInsets2.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars())) == null) {
            return null;
        }
        return Integer.valueOf(insetsIgnoringVisibility.top);
    }

    public static final void F(ViewStub viewStub, View view, k56 k56Var) {
        if (G(viewStub)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(viewStub);
        viewGroup.removeViewInLayout(viewStub);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        layoutParams.height = view.getLayoutParams().height;
        layoutParams.width = view.getLayoutParams().width;
        view.setId(viewStub.getId());
        viewGroup.addView(view, iIndexOfChild, layoutParams);
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    public static final boolean G(ViewStub viewStub) {
        return viewStub.getParent() == null;
    }

    public static final boolean H(je7 je7Var) {
        return je7Var.a() && ((View) je7Var.getValue()).getVisibility() == 0;
    }

    public static ArrayList I(Object... objArr) {
        int length = objArr.length;
        wmd.i(length, "arraySize");
        ArrayList arrayList = new ArrayList(s5c.Y(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static tc9 L(String str) throws XmlPullParserException, IOException, NumberFormatException {
        long j;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!z04.P(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a(null, "Couldn't find xmp metadata");
        }
        ls5 ls5Var = zw6.b;
        ffc ffcVarM = ffc.X;
        long j2 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (z04.P(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = X;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break loop0;
                    }
                    String strX = z04.x(xmlPullParserNewPullParser, strArr[i2]);
                    if (strX == null) {
                        i2++;
                    } else if (Integer.parseInt(strX) == 1) {
                        String[] strArr2 = Y;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 4) {
                                break;
                            }
                            String strX2 = z04.x(xmlPullParserNewPullParser, strArr2[i3]);
                            if (strX2 != null) {
                                j = Long.parseLong(strX2);
                                if (j == -1) {
                                    break;
                                }
                            } else {
                                i3++;
                            }
                        }
                        j = -9223372036854775807L;
                        String[] strArr3 = Z;
                        while (true) {
                            if (i >= 2) {
                                ls5 ls5Var2 = zw6.b;
                                ffcVarM = ffc.X;
                                break;
                            }
                            String strX3 = z04.x(xmlPullParserNewPullParser, strArr3[i]);
                            if (strX3 != null) {
                                ffcVarM = zw6.o(new rc9(0L, "image/jpeg", 0L), new rc9(Long.parseLong(strX3), "video/mp4", 0L));
                                break;
                            }
                            i++;
                        }
                        j2 = j;
                    }
                }
                return null;
            }
            if (z04.P(xmlPullParserNewPullParser, "Container:Directory")) {
                ffcVarM = M(xmlPullParserNewPullParser, "Container", "Item");
            } else if (z04.P(xmlPullParserNewPullParser, "GContainer:Directory")) {
                ffcVarM = M(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!z04.L(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (ffcVarM.isEmpty()) {
            return null;
        }
        return new tc9(j2, ffcVarM);
    }

    public static ffc M(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ww6 ww6VarI = zw6.i();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (z04.P(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strX = z04.x(xmlPullParser, strConcat3);
                String strX2 = z04.x(xmlPullParser, strConcat4);
                String strX3 = z04.x(xmlPullParser, strConcat5);
                String strX4 = z04.x(xmlPullParser, strConcat6);
                if (strX == null || strX2 == null) {
                    return ffc.X;
                }
                ww6VarI.a(new rc9(strX3 != null ? Long.parseLong(strX3) : 0L, strX, strX4 != null ? Long.parseLong(strX4) : 0L));
            }
        } while (!z04.L(xmlPullParser, strConcat2));
        return ww6VarI.j();
    }

    public static final void N(View view, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            runnable.run();
            return;
        }
        Handler handler = view.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(runnable);
        } else {
            view.post(runnable);
        }
    }

    public static boolean O(Parcel parcel, int i) {
        h0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte P(Parcel parcel, int i) {
        h0(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static float R(Parcel parcel, int i) {
        h0(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float S(Parcel parcel, int i) {
        int iW = W(parcel, i);
        if (iW == 0) {
            return null;
        }
        f0(parcel, iW);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder T(Parcel parcel, int i) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iW);
        return strongBinder;
    }

    public static int U(Parcel parcel, int i) {
        h0(parcel, i, 4);
        return parcel.readInt();
    }

    public static long V(Parcel parcel, int i) {
        h0(parcel, i, 8);
        return parcel.readLong();
    }

    public static int W(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void X(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + W(parcel, i));
    }

    public static zie Y(int i, fka fkaVar) {
        int iS = au1.s(i);
        if (iS == 0) {
            bs6 icon = fkaVar.getIcon();
            xoe text = fkaVar.getText();
            return new zie(icon.f, text.e, fkaVar.b().a.m, true);
        }
        if (iS != 1) {
            if (iS == 2) {
                return new zie(fkaVar.d().b.a.f, fkaVar.d().c.b.e, fkaVar.d().c.b.e, false);
            }
            throw new NoWhenBranchMatchedException();
        }
        bs6 icon2 = fkaVar.getIcon();
        xoe text2 = fkaVar.getText();
        return new zie(icon2.j, text2.g, fkaVar.b().a.g, true);
    }

    public static AbstractList Z(w56 w56Var, List list) {
        return list instanceof RandomAccess ? new sm7(w56Var, list) : new tm7(w56Var, list);
    }

    public static boolean a0(r1a r1aVar, f2a f2aVar, b66 b66Var) {
        if (!(r1aVar instanceof kde)) {
            return false;
        }
        try {
            Object obj = ((kde) r1aVar).get();
            if (obj == null) {
                iz4.a(f2aVar);
                return true;
            }
            try {
                Object objMo131apply = b66Var.mo131apply(obj);
                Objects.requireNonNull(objMo131apply, "The mapper returned a null ObservableSource");
                r1a r1aVar2 = (r1a) objMo131apply;
                if (r1aVar2 instanceof kde) {
                    try {
                        Object obj2 = ((kde) r1aVar2).get();
                        if (obj2 == null) {
                            iz4.a(f2aVar);
                            return true;
                        }
                        p1a p1aVar = new p1a(f2aVar, obj2);
                        f2aVar.c(p1aVar);
                        p1aVar.run();
                    } catch (Throwable th) {
                        c37.B(th);
                        iz4.b(th, f2aVar);
                        return true;
                    }
                } else {
                    r1aVar2.a(f2aVar);
                }
                return true;
            } catch (Throwable th2) {
                c37.B(th2);
                iz4.b(th2, f2aVar);
                return true;
            }
        } catch (Throwable th3) {
            c37.B(th3);
            iz4.b(th3, f2aVar);
            return true;
        }
    }

    public static final void b(ViewGroup viewGroup, View view, Integer num) {
        if (view.getParent() == null) {
            viewGroup.addView(view, num != null ? num.intValue() : -1);
        }
    }

    public static boolean b0(lr1 lr1Var) {
        if (Looper.myLooper() == null) {
            khe kheVar = bi4.c;
            if (((ThreadLocal) kheVar.getValue()) != null) {
                ThreadLocal threadLocal = (ThreadLocal) kheVar.getValue();
                bi4 bi4Var = new bi4(threadLocal);
                Looper looper = bi4Var.b;
                try {
                    lr1Var.invoke(bi4Var);
                    if (!tpa.f(looper.getThread(), Thread.currentThread())) {
                        throw new IllegalStateException("Illegal thread".toString());
                    }
                    threadLocal.remove();
                    return true;
                } catch (Throwable th) {
                    if (!tpa.f(looper.getThread(), Thread.currentThread())) {
                        throw new IllegalStateException("Illegal thread".toString());
                    }
                    bi4Var.a.remove();
                    throw th;
                }
            }
        }
        return false;
    }

    public static final void c0(y5f y5fVar) {
        y5fVar.c(b64.class, new it7(27));
        y5fVar.e(d83.class, new uza(2));
        y5fVar.c(pi4.class, new it7(28));
        y5fVar.e(ehb.class, new uza(3));
        y5fVar.e(ecb.class, new uza(4));
        y5fVar.e(pb.class, new uza(5));
        y5fVar.e(fcb.class, new uza(6));
        y5fVar.c(pi4.class, new it7(29));
        y5fVar.c(pi4.class, new dcb(0));
    }

    public static final void d(View view, x27 x27Var, m56 m56Var) {
        yq0 yq0Var = x27Var.b;
        int i = yq0Var != null ? yq0Var.b : 0;
        int i2 = i == 0 ? -1 : z27.$EnumSwitchMapping$0[au1.s(i)];
        if (i2 == -1 || i2 == 1) {
            new g1e(view, x27Var, m56Var);
        } else if (i2 == 2) {
            new hf(view, x27Var, m56Var);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            new C0005if(view, x27Var, 1, m56Var, 40);
        }
    }

    public static int d0(Parcel parcel) {
        int i = parcel.readInt();
        int iW = W(parcel, i);
        char c2 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new SafeParcelReader$ParseException(parcel, "Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))));
        }
        int i2 = iW + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new SafeParcelReader$ParseException(parcel, rh4.h("Size read is invalid start=", iDataPosition, i2, " end="));
        }
        return i2;
    }

    public static void e(View view) {
        d(view, new x27(3, null, 2), null);
    }

    public static byte e0(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static final us f(kpa... kpaVarArr) {
        us usVar = new us(kpaVarArr.length);
        for (kpa kpaVar : kpaVarArr) {
            usVar.put(kpaVar.a, kpaVar.b);
        }
        return usVar;
    }

    public static void f0(Parcel parcel, int i) {
        if (i == 4) {
            return;
        }
        throw new SafeParcelReader$ParseException(parcel, "Expected size 4 got " + i + " (0x" + Integer.toHexString(i) + ")");
    }

    public static void g(yde ydeVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                ydeVar.W(i);
            } else if (obj instanceof byte[]) {
                ydeVar.k(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                ydeVar.h(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                ydeVar.h(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                ydeVar.j(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                ydeVar.j(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                ydeVar.j(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                ydeVar.j(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                ydeVar.f(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                ydeVar.j(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static Boolean g0(byte b2) {
        if (b2 == 0) {
            return Boolean.FALSE;
        }
        if (b2 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static String h(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    public static void h0(Parcel parcel, int i, int i2) {
        int iW = W(parcel, i);
        if (iW == i2) {
            return;
        }
        throw new SafeParcelReader$ParseException(parcel, zr6.l(wg0.j("Expected size ", i2, " got ", iW, " (0x"), Integer.toHexString(iW), ")"));
    }

    public static void i(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static tt3 j(g52 g52Var) {
        switch (g52Var.ordinal()) {
            case 0:
                return new tt3(p8a.x, new eqe(yoc.j), Integer.valueOf(woc.c), Integer.valueOf(wfa.Q), 4);
            case 1:
                return new tt3(p8a.L, new eqe(yoc.w), Integer.valueOf(woc.c), Integer.valueOf(wfa.Q), 4);
            case 2:
                return new tt3(p8a.w, new eqe(yoc.t), Integer.valueOf(woc.E1), Integer.valueOf(wfa.Q), 4);
            case 3:
                return new tt3(p8a.K, new eqe(yoc.u), Integer.valueOf(woc.C1), Integer.valueOf(wfa.Q), 4);
            case 4:
                return new tt3(p8a.H, new eqe(yoc.s), Integer.valueOf(woc.m1), Integer.valueOf(wfa.Q), 4);
            case 5:
                return new tt3(p8a.G, new eqe(yoc.r), Integer.valueOf(woc.m1), Integer.valueOf(wfa.Q), 4);
            case 6:
                return new tt3(p8a.J, new eqe(yoc.v), Integer.valueOf(woc.v1), Integer.valueOf(wfa.Q), 4);
            case 7:
                return new tt3(p8a.P, new eqe(yoc.C), Integer.valueOf(woc.w1), Integer.valueOf(wfa.Q), 4);
            case 8:
                return new tt3(p8a.F, new eqe(yoc.q), Integer.valueOf(wfa.U), Integer.valueOf(woc.B), Integer.valueOf(wfa.P));
            case 9:
                return new tt3(p8a.F, new eqe(yoc.p), Integer.valueOf(wfa.U), Integer.valueOf(woc.B), Integer.valueOf(wfa.P));
            case 10:
                return new tt3(p8a.F, new eqe(yoc.D), Integer.valueOf(wfa.U), Integer.valueOf(woc.B), Integer.valueOf(wfa.P));
            case 11:
                return new tt3(p8a.D, new eqe(yoc.n), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            case 13:
                return new tt3(p8a.E, new eqe(yoc.o), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new tt3(p8a.y, new eqe(yoc.k), Integer.valueOf(wfa.U), Integer.valueOf(woc.S), Integer.valueOf(wfa.P));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new tt3(p8a.M, new eqe(yoc.y), Integer.valueOf(woc.l), Integer.valueOf(wfa.Q), 4);
            case 16:
                return new tt3(xoc.a, new eqe(yoc.x), Integer.valueOf(woc.N0), Integer.valueOf(wfa.Q), 4);
            case LangUtils.HASH_SEED /* 17 */:
                return new tt3(p8a.z, new eqe(yoc.l), Integer.valueOf(woc.C0), Integer.valueOf(wfa.Q), 4);
            case 18:
                return new tt3(p8a.O, new eqe(yoc.B), Integer.valueOf(wfa.U), Integer.valueOf(woc.p1), Integer.valueOf(wfa.P));
            case 19:
                return new tt3(p8a.N, new eqe(yoc.A), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case 20:
                return new tt3(p8a.A, new eqe(yoc.m), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] k(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static void l(x55 x55Var, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int iMin = Math.min(i, 8192);
            int i2 = x55Var.read(bArr, 0, iMin);
            if (i2 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i -= i2;
            outputStream.write(bArr, 0, i2);
        }
    }

    public static void m(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static Bundle n(Parcel parcel, int i) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iW);
        return bundle;
    }

    public static Parcelable o(Parcel parcel, int i, Parcelable.Creator creator) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iW);
        return parcelable;
    }

    public static String p(Parcel parcel, int i) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iW);
        return string;
    }

    public static Object[] q(Parcel parcel, int i, Parcelable.Creator creator) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iW);
        return objArrCreateTypedArray;
    }

    public static ArrayList r(Parcel parcel, int i, Parcelable.Creator creator) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iW);
        return arrayListCreateTypedArrayList;
    }

    public static void s(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(parcel, zr6.h(i, "Overread allowed size end="));
        }
    }

    public static final View t(View view, int i) {
        if (view.getId() == i) {
            return view;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                View view2 = (View) parent;
                if (view2.getId() == i) {
                    return view2;
                }
            }
        }
        return null;
    }

    public static final zye u(String str) {
        kl7 kl7VarD = s0;
        if (kl7VarD == null) {
            kl7 kl7VarL = j1e.l();
            try {
                Iterator it = Arrays.asList(new mye()).iterator();
                while (it.hasNext()) {
                    kl7VarL.add(it.next());
                }
                s0 = kl7VarL;
                kl7VarD = j1e.d(kl7VarL);
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
        if (kl7VarD.getSize() > 1) {
            throw new IllegalStateException("More then one manifest found: ".concat(x53.n0(kl7VarD, null, null, null, n71.y0, 31)).toString());
        }
        if (kl7VarD.getSize() != 1) {
            return null;
        }
        zye zyeVar = (zye) kl7VarD.get(0);
        if (tpa.f(zyeVar.a(), str)) {
            return zyeVar;
        }
        throw new IllegalStateException(("Unexpected " + zyeVar.getClass().getName() + ".applicationId()").toString());
    }

    public static final Integer v(View view) {
        Insets insets;
        if (Build.VERSION.SDK_INT < 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                return Integer.valueOf(rootWindowInsets.getSystemWindowInsetBottom());
            }
            return null;
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        if (rootWindowInsets2 == null || (insets = rootWindowInsets2.getInsets(8)) == null) {
            return null;
        }
        return Integer.valueOf(insets.bottom);
    }

    public static final Integer x(View view) {
        Insets insetsIgnoringVisibility;
        if (Build.VERSION.SDK_INT < 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                return Integer.valueOf(rootWindowInsets.getStableInsetBottom());
            }
            return null;
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        if (rootWindowInsets2 == null || (insetsIgnoringVisibility = rootWindowInsets2.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars())) == null) {
            return null;
        }
        return Integer.valueOf(insetsIgnoringVisibility.bottom);
    }

    public static final View z(je7 je7Var) {
        if (H(je7Var)) {
            return (View) je7Var.getValue();
        }
        return null;
    }

    public abstract View J(int i);

    public abstract boolean K();
}
