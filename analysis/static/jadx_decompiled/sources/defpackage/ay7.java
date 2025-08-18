package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.io.StringReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public abstract class ay7 {
    public static volatile Handler a;
    public static SimpleDateFormat b;
    public static SimpleDateFormat d;
    public static SimpleDateFormat f;
    public static SimpleDateFormat h;
    public static SimpleDateFormat j;
    public static SimpleDateFormat l;
    public static SimpleDateFormat n;
    public static SimpleDateFormat q;
    public static SimpleDateFormat r;
    public static Boolean s;
    public static SimpleDateFormat u;
    public static final Object c = new Object();
    public static final Object e = new Object();
    public static final Object g = new Object();
    public static final Object i = new Object();
    public static final Object k = new Object();
    public static final Object m = new Object();
    public static final Object o = new Object();
    public static final Object p = new Object();
    public static final Object t = new Object();
    public static final Object v = new Object();
    public static final String[] w = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] x = {44100, 48000, 32000};
    public static final int[] y = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] z = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] A = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] B = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] C = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final String[] D = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] E = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] F = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static boolean A(n34 n34Var, n34 n34Var2) {
        return n34Var.c.equals(n34Var2.c) && n34Var.b.equals(n34Var2.b) && n34Var.a.equals(n34Var2.a);
    }

    public static final int B(Context context) {
        return Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
    }

    public static tc9 C(String str) throws XmlPullParserException, IOException, NumberFormatException {
        long j2;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!a14.D(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a(null, "Couldn't find xmp metadata");
        }
        ls5 ls5Var = zw6.b;
        ffc ffcVarD = ffc.X;
        long j3 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (a14.D(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = D;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= 4) {
                        break loop0;
                    }
                    String strV = a14.v(xmlPullParserNewPullParser, strArr[i3]);
                    if (strV == null) {
                        i3++;
                    } else if (Integer.parseInt(strV) == 1) {
                        String[] strArr2 = E;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= 4) {
                                break;
                            }
                            String strV2 = a14.v(xmlPullParserNewPullParser, strArr2[i4]);
                            if (strV2 != null) {
                                j2 = Long.parseLong(strV2);
                                if (j2 == -1) {
                                    break;
                                }
                            } else {
                                i4++;
                            }
                        }
                        j2 = -9223372036854775807L;
                        String[] strArr3 = F;
                        while (true) {
                            if (i2 >= 2) {
                                ls5 ls5Var2 = zw6.b;
                                ffcVarD = ffc.X;
                                break;
                            }
                            String strV3 = a14.v(xmlPullParserNewPullParser, strArr3[i2]);
                            if (strV3 != null) {
                                ffcVarD = zw6.o(new sc9(0L, "image/jpeg", 0L), new sc9(Long.parseLong(strV3), "video/mp4", 0L));
                                break;
                            }
                            i2++;
                        }
                        j3 = j2;
                    }
                }
                return null;
            }
            if (a14.D(xmlPullParserNewPullParser, "Container:Directory")) {
                ffcVarD = D(xmlPullParserNewPullParser, "Container", "Item");
            } else if (a14.D(xmlPullParserNewPullParser, "GContainer:Directory")) {
                ffcVarD = D(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!a14.B(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (ffcVarD.isEmpty()) {
            return null;
        }
        return new tc9(j3, ffcVarD);
    }

    public static ffc D(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ww6 ww6VarI = zw6.i();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (a14.D(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strV = a14.v(xmlPullParser, strConcat3);
                String strV2 = a14.v(xmlPullParser, strConcat4);
                String strV3 = a14.v(xmlPullParser, strConcat5);
                String strV4 = a14.v(xmlPullParser, strConcat6);
                if (strV == null || strV2 == null) {
                    return ffc.X;
                }
                ww6VarI.a(new sc9(strV3 != null ? Long.parseLong(strV3) : 0L, strV, strV4 != null ? Long.parseLong(strV4) : 0L));
            }
        } while (!a14.B(xmlPullParser, strConcat2));
        return ww6VarI.j();
    }

    public static int E(int i2) {
        int i3;
        int i4;
        if (!((i2 & (-2097152)) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        if (i4 == 1) {
            return i3 == 3 ? 1152 : 576;
        }
        if (i4 == 2) {
            return 1152;
        }
        if (i4 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static final Activity F(znc zncVar) {
        Activity activityD = zncVar.d();
        if (activityD != null) {
            return activityD;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final Uri G(Uri uri, tb8 tb8Var) {
        String strValueOf;
        Uri.Builder builderBuildUpon = uri.buildUpon();
        ub8.a.getClass();
        Integer num = tb8Var.d.H;
        if (num == null || (strValueOf = num.toString()) == null) {
            strValueOf = String.valueOf(0);
        }
        return builderBuildUpon.appendQueryParameter("MediaItemType", strValueOf).build();
    }

    public static up7 H(zp7 zp7Var) {
        int i2;
        int iS = au1.s(zp7Var.w0);
        if (iS != 0) {
            i2 = 1;
            if (iS != 1 && iS != 2) {
                i2 = 3;
                if (iS != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            i2 = 0;
        }
        String string = zp7Var.b.toString();
        Integer num = zp7Var.Y;
        int iIntValue = num != null ? num.intValue() : 0;
        Long l2 = zp7Var.Z;
        return new up7(i2, zp7Var.a, string, zp7Var.v0.toString(), iIntValue, l2 != null ? l2.longValue() : 0L, zp7Var.c, zp7Var.X, zp7Var.b);
    }

    public static final zp7 I(up7 up7Var) {
        Uri uri;
        String strF;
        int iF0;
        int i2;
        Uri uri2;
        String str = up7Var.c;
        String str2 = up7Var.o;
        if (str2 == null || (uri = Uri.parse(str2)) == null) {
            uri = Uri.parse(str);
        }
        Uri uri3 = uri;
        Uri uri4 = (str == null || (uri2 = Uri.parse(str)) == null) ? uri3 : uri2;
        String str3 = up7Var.Z;
        if (str3 == null) {
            int i3 = 2;
            if (str != null && (iF0 = w9e.F0(".", str, 6)) != -1) {
                try {
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(iF0, str.length()).toLowerCase(Locale.getDefault()));
                    if (mimeTypeFromExtension != null && mimeTypeFromExtension.length() != 0) {
                        int[] iArrV = au1.v(11);
                        int length = iArrV.length;
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i2 = 0;
                                break;
                            }
                            i2 = iArrV[i5];
                            if (ey8.f(i2).equalsIgnoreCase(mimeTypeFromExtension)) {
                                break;
                            }
                            i5++;
                        }
                        if (i2 == 0) {
                            i2 = 1;
                        }
                        String strF2 = ey8.f(i2);
                        if ((strF2.length() != 0 && eae.o0(strF2, "image/", true) && !w9e.p0(strF2, "djvu", true)) || (strF2.length() != 0 && eae.o0(strF2, "video/", true))) {
                            i4 = i2;
                        }
                        if (i4 != 0) {
                            i3 = i4;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            strF = ey8.f(i3);
        } else {
            strF = str3;
        }
        return new zp7(up7Var.b, uri4, strF, -1, up7Var.s0, Integer.valueOf(up7Var.X), Long.valueOf(up7Var.Y), 0, 0, 0L, uri3);
    }

    public static final String J(Bitmap bitmap) {
        return "Bitmap" + zr6.h(System.identityHashCode(bitmap), "@") + "(" + bitmap.getWidth() + "x" + bitmap.getHeight() + (bitmap.isRecycled() ? "|recycled" : "") + "|genId=" + bitmap.getGenerationId() + ")";
    }

    public static final void K(y5f y5fVar) {
        y5fVar.c(b64.class, new dcb(1));
        y5fVar.e(dfb.class, new uza(7));
        y5fVar.e(qab.class, new dcb(6));
        y5fVar.c(pi4.class, new dcb(2));
        y5fVar.c(pi4.class, new dcb(3));
        y5fVar.c(pi4.class, new dcb(4));
        y5fVar.c(pi4.class, new dcb(5));
        y5fVar.e(ea.class, new uza(8));
    }

    public static final void L(y5f y5fVar) {
        y5fVar.c(pi4.class, new lxc(12));
    }

    public static void M(Parcel parcel, int i2, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iT = T(parcel, i2);
        parcel.writeBundle(bundle);
        W(parcel, iT);
    }

    public static void N(Parcel parcel, int i2, Float f2) {
        if (f2 == null) {
            return;
        }
        X(parcel, i2, 4);
        parcel.writeFloat(f2.floatValue());
    }

    public static void O(Parcel parcel, int i2, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iT = T(parcel, i2);
        parcel.writeStrongBinder(iBinder);
        W(parcel, iT);
    }

    public static void P(Parcel parcel, int i2, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int iT = T(parcel, i2);
        parcelable.writeToParcel(parcel, i3);
        W(parcel, iT);
    }

    public static void Q(Parcel parcel, int i2, String str) {
        if (str == null) {
            return;
        }
        int iT = T(parcel, i2);
        parcel.writeString(str);
        W(parcel, iT);
    }

    public static void R(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int iT = T(parcel, i2);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        W(parcel, iT);
    }

    public static void S(Parcel parcel, List list, int i2) {
        if (list == null) {
            return;
        }
        int iT = T(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        W(parcel, iT);
    }

    public static int T(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void U(int i2) {
        boolean z2 = true;
        if (i2 != 100 && i2 != 102 && i2 != 104) {
            if (i2 == 105) {
                i2 = 105;
            } else {
                z2 = false;
            }
        }
        fp3.h(z2, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i2));
    }

    public static String V(int i2) {
        if (i2 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i2 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i2 == 104) {
            return "LOW_POWER";
        }
        if (i2 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    public static void W(Parcel parcel, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(iDataPosition - i2);
        parcel.setDataPosition(iDataPosition);
    }

    public static void X(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    public static final void a(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        if (view.getParent() == null) {
            viewGroup.addView(view, layoutParams);
        }
    }

    public static final void b(ViewGroup viewGroup, View view, Integer num) {
        if (view.getParent() == null) {
            viewGroup.addView(view, num != null ? num.intValue() : -1);
        }
    }

    public static final xs d(Object... objArr) {
        xs xsVar = new xs(objArr.length);
        for (Object obj : objArr) {
            xsVar.add(obj);
        }
        return xsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.lang.Integer[]] */
    public static final Bundle e(Collection collection) {
        Bundle bundle = new Bundle((collection.size() * 5) + 1);
        bundle.putInt("size", collection.size());
        int[] iArr = new int[collection.size()];
        ?? r2 = new Integer[collection.size()];
        ?? r3 = new Integer[collection.size()];
        ?? r4 = new Integer[collection.size()];
        int i2 = 0;
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                y53.R();
                throw null;
            }
            tt3 tt3Var = (tt3) obj;
            iArr[i2] = tt3Var.a;
            bundle.putParcelable(zr6.h(i2, "text_"), tt3Var.b);
            r2[i2] = tt3Var.c;
            r3[i2] = tt3Var.d;
            r4[i2] = tt3Var.e;
            i2 = i3;
        }
        bundle.putIntArray("ids", iArr);
        bundle.putSerializable("textColors", r2);
        bundle.putSerializable("icons", r3);
        bundle.putSerializable("iconColors", r4);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [njc] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    public static final List f(Bundle bundle) {
        ?? njcVar;
        int i2;
        int[] intArray;
        try {
            i2 = bundle.getInt("size");
            intArray = bundle.getIntArray("ids");
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (intArray == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Integer[] numArr = (Integer[]) bundle.getSerializable("textColors");
        Integer[] numArr2 = (Integer[]) bundle.getSerializable("icons");
        Integer[] numArr3 = (Integer[]) bundle.getSerializable("iconColors");
        j37 j37VarY = ote.Y(0, i2);
        njcVar = new ArrayList(z53.S(j37VarY, 10));
        Iterator it = j37VarY.iterator();
        while (((i37) it).c) {
            int iA = ((i37) it).a();
            int i3 = intArray[iA];
            Parcelable parcelable = bundle.getParcelable("text_" + iA);
            if (parcelable == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            njcVar.add(new tt3(i3, (jqe) parcelable, numArr[iA], numArr2[iA], numArr3[iA]));
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            thA.printStackTrace();
        }
        boolean z2 = njcVar instanceof njc;
        List list = njcVar;
        if (z2) {
            list = null;
        }
        List list2 = list;
        return list2 == null ? nz4.a : list2;
    }

    public static Object g(b8c b8cVar, hu3 hu3Var) {
        sy1 sy1Var = new sy1(1, v3c.u(hu3Var));
        sy1Var.n();
        b8cVar.e(new h7b(sy1Var, null, false, 27));
        sy1Var.d(new c01(6, b8cVar));
        return sy1Var.m();
    }

    public static ty4 h(m85 m85Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = m85Var.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (m85Var.s(i3, jElapsedRealtime)) {
                i2++;
            }
        }
        return new ty4(1, 0, length, i2, 1);
    }

    public static boolean i(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i2 < str.length()) {
                    char cCharAt = str.charAt(i2);
                    int i5 = i4 + 1;
                    if (i4 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt != '(') {
                        if (cCharAt == ')' && i3 - 1 == 0 && i4 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i3++;
                    }
                    i2++;
                    i4 = i5;
                } else if (i3 == 0) {
                    return tpa.f(w9e.b1(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static String j(Context context, Locale locale, long j2, long j3, boolean z2) {
        long j4 = j3 - j2;
        n34 n34VarG = n34.g(j2, TimeZone.getDefault());
        if (j4 < 86400000) {
            return A(n34.g(j3, TimeZone.getDefault()), n34.g(j2, TimeZone.getDefault())) ? k(context, j2, locale) : z2 ? j4 < 14400000 ? k(context, j2, locale) : context.getString(c2c.tt_dates_yesterday) : String.format(context.getString(c2c.tt_dates_yesterday_at), k(context, j2, locale));
        }
        n34 n34VarG2 = n34.g(j3, TimeZone.getDefault());
        n34VarG.f();
        Integer num = n34VarG.c;
        n34VarG.f();
        n34 n34VarL = new n34(n34VarG.a, n34VarG.b, num, 0, 0, 0, 0).l(1);
        n34VarG2.f();
        Integer num2 = n34VarG2.c;
        n34VarG2.f();
        return n34VarL.equals(new n34(n34VarG2.a, n34VarG2.b, num2, 0, 0, 0, 0)) ? z2 ? context.getString(c2c.tt_dates_yesterday) : String.format(context.getString(c2c.tt_dates_yesterday_at), k(context, j2, locale)) : n34VarG.a.equals(n34VarG2.a) ? r(locale, j2, false) : r(locale, j2, true);
    }

    public static String k(Context context, long j2, Locale locale) {
        String str;
        synchronized (c) {
            str = n(context, locale).format(Long.valueOf(j2));
        }
        return str;
    }

    public static String l(long j2) {
        int i2 = ((int) j2) / 60;
        long j3 = j2 - (i2 * 60);
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(":");
        sb.append(j3 < 10 ? "0" : "");
        sb.append(j3);
        return sb.toString();
    }

    public static String m(int i2, int i3, Context context) {
        String[] strArr = are.b;
        return String.format(context.getResources().getQuantityString(i2, i3), Integer.valueOf(i3));
    }

    public static DateFormat n(Context context, Locale locale) {
        boolean zBooleanValue;
        if (b == null) {
            synchronized (t) {
                try {
                    if (s == null) {
                        s = Boolean.valueOf(android.text.format.DateFormat.is24HourFormat(context));
                    }
                    zBooleanValue = s.booleanValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            b = new SimpleDateFormat(zBooleanValue ? "HH:mm" : "h:mm a", locale);
        }
        return b;
    }

    public static b11 o(long j2, long j3) {
        long j4 = 0;
        int i2 = 10;
        if (j2 <= 0) {
            return new b11(j4, i2, 1, false);
        }
        long j5 = j3 - j2;
        if (j5 < 0) {
            return new b11(j4, i2, 1, false);
        }
        int i3 = 2;
        if (A(n34.g(j3, TimeZone.getDefault()), n34.g(j2, TimeZone.getDefault()))) {
            if (j5 < 60000) {
                return new b11(j4, 1, 1, false);
            }
            if (j5 < 3600000) {
                return new b11((int) (j5 / 60000), i3, 1, false);
            }
            if (j5 < 86400000) {
                return new b11((int) (j5 / 3600000), 3, 1, false);
            }
        }
        if (j5 < 3600000) {
            return new b11((int) (j5 / 60000), i3, 1, false);
        }
        int i4 = 4;
        if (j5 < 86400000) {
            return new b11(j2, i4, 1, false);
        }
        if (j5 < 129600000) {
            return new b11(j4, i4, 1, false);
        }
        return n34.g(j2, TimeZone.getDefault()).a.equals(n34.g(j3, TimeZone.getDefault()).a) ? new b11(j2, 9, 1, false) : new b11(j2, 8, 1, false);
    }

    public static int p(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!((i2 & (-2097152)) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = x[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? y[i5 - 1] : z[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? A[i5 - 1] : B[i5 - 1] : C[i5 - 1];
        if (i3 == 3) {
            return ((i9 * 144) / i7) + i8;
        }
        return (((i4 == 1 ? 72 : 144) * i9) / i7) + i8;
    }

    public static String q(Locale locale, long j2, boolean z2) {
        String str;
        if (z2) {
            synchronized (k) {
                if (j == null) {
                    j = new SimpleDateFormat("d MMM yyyy", locale);
                }
                str = j.format(Long.valueOf(j2));
            }
        } else {
            synchronized (i) {
                if (h == null) {
                    h = new SimpleDateFormat("d MMM", locale);
                }
                str = h.format(Long.valueOf(j2));
            }
        }
        return str;
    }

    public static String r(Locale locale, long j2, boolean z2) {
        String str;
        String str2;
        if (z2) {
            synchronized (g) {
                if (f == null) {
                    f = new SimpleDateFormat("d MMM yyyy", locale);
                }
                str2 = f.format(Long.valueOf(j2));
            }
            return str2;
        }
        synchronized (e) {
            if (d == null) {
                d = new SimpleDateFormat("d MMM", locale);
            }
            str = d.format(Long.valueOf(j2));
        }
        return str;
    }

    public static String s(Context context, Locale locale, long j2, boolean z2) {
        String strQ;
        String string = context.getString(c2c.tt_at);
        if (z2) {
            synchronized (m) {
                if (l == null) {
                    l = new SimpleDateFormat("dd.MM.yy", locale);
                }
                strQ = l.format(Long.valueOf(j2));
            }
        } else {
            strQ = q(locale, j2, false);
        }
        return String.format(string, strQ, k(context, j2, locale));
    }

    public static Handler t() {
        if (a != null) {
            return a;
        }
        synchronized (ay7.class) {
            try {
                if (a == null) {
                    a = Handler.createAsync(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public static final ViewGroup u(View view) {
        ViewGroup viewGroupU;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && (viewGroupU = u(viewGroup)) != null) {
            return viewGroupU;
        }
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public static Object v(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ou0.a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final int w(xs xsVar, Object obj, int i2) {
        int i3 = xsVar.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iL = j47.l(i3, i2, xsVar.a);
            if (iL < 0 || tpa.f(obj, xsVar.b[iL])) {
                return iL;
            }
            int i4 = iL + 1;
            while (i4 < i3 && xsVar.a[i4] == i2) {
                if (tpa.f(obj, xsVar.b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iL - 1; i5 >= 0 && xsVar.a[i5] == i2; i5--) {
                if (tpa.f(obj, xsVar.b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final yh9 x(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        yh9 yh9Var = new yh9();
        yh9Var.e(1, i2);
        yh9Var.e(131072, i3);
        yh9Var.e(2, i4);
        yh9Var.e(4, i5);
        yh9Var.e(8, i6);
        yh9Var.e(16, i7);
        yh9Var.e(64, i8);
        yh9Var.e(128, i9);
        yh9Var.e(256, i10);
        yh9Var.e(i11, i12);
        yh9Var.e(i13, i14);
        yh9Var.e(2048, i15);
        yh9Var.e(8192, i16);
        yh9Var.e(65536, i17);
        return yh9Var;
    }

    public static final yh9 y(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        yh9 yh9Var = new yh9();
        yh9Var.e(1, i2);
        yh9Var.e(2, i3);
        yh9Var.e(4, i4);
        yh9Var.e(8, i5);
        yh9Var.e(65536, i6);
        yh9Var.e(16, i7);
        yh9Var.e(32768, i8);
        yh9Var.e(32, i9);
        yh9Var.e(64, i10);
        yh9Var.e(256, i11);
        yh9Var.e(128, i12);
        yh9Var.e(i13, i14);
        yh9Var.e(i15, i16);
        yh9Var.e(i17, i18);
        yh9Var.e(2048, i19);
        return yh9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:464:0x06ce A[Catch: all -> 0x06db, LOOP:28: B:462:0x06c8->B:464:0x06ce, LOOP_END, TryCatch #27 {all -> 0x06db, blocks: (B:461:0x06bd, B:462:0x06c8, B:464:0x06ce, B:467:0x06dd, B:471:0x06e8, B:472:0x06ed, B:473:0x06ee), top: B:544:0x06bd }] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0709 A[LOOP:29: B:477:0x0703->B:479:0x0709, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x072c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x072e A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0600 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x06e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x06f1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qa2 z(defpackage.gy8 r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay7.z(gy8):qa2");
    }
}
