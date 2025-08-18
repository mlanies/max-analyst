package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Xml;
import android.view.View;
import androidx.work.WorkRequest;
import com.facebook.animated.gif.GifImage;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpStatus;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes.dex */
public abstract class c37 {
    public static Context a;
    public static Boolean b;
    public static final long[] c = {WorkRequest.MIN_BACKOFF_MILLIS, 15000};
    public static final float[][] d = {new float[]{1.0f, 0.0f, 0.0f, 1.0f}, new float[]{-1.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f, 1.0f}, new float[]{0.0f, -1.0f, 0.0f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, -1.0f, 1.0f}};
    public static final int[] e = {R.attr.stateListAnimator};
    public static ruc f;
    public static boolean g;
    public static final /* synthetic */ int h = 0;
    public static volatile String i;

    public static void A(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static void B(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final String C(String str) {
        return (str == null || str.length() == 0) ? "" : w9e.b1(w9e.K0(str, "https://max.ru/joincall/")).toString();
    }

    public static final String D(String str) {
        return (str == null || str.length() == 0) ? "" : wg0.i("https://max.ru/joincall/", str);
    }

    public static ffc E(float[] fArr, zw6 zw6Var) {
        ww6 ww6Var = new ww6();
        for (int i2 = 0; i2 < zw6Var.size(); i2++) {
            float[] fArr2 = new float[4];
            Matrix.multiplyMV(fArr2, 0, fArr, 0, (float[]) zw6Var.get(i2), 0);
            float f2 = fArr2[0];
            float f3 = fArr2[3];
            fArr2[0] = f2 / f3;
            fArr2[1] = fArr2[1] / f3;
            fArr2[2] = fArr2[2] / f3;
            fArr2[3] = 1.0f;
            ww6Var.d(fArr2);
        }
        return ww6Var.j();
    }

    public static String F(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static zt0 a(int i2, int i3, int i4) {
        zt0 sg3Var;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if (i2 != -2) {
            if (i2 == -1) {
                if (i3 == 1) {
                    return new sg3(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i2 != 0) {
                return i2 != Integer.MAX_VALUE ? i3 == 1 ? new zt0(i2, null) : new sg3(i2, i3, null) : new zt0(Integer.MAX_VALUE, null);
            }
            sg3Var = i3 == 1 ? new zt0(0, null) : new sg3(1, i3, null);
        } else if (i3 == 1) {
            e32.l.getClass();
            sg3Var = new zt0(d32.b, null);
        } else {
            sg3Var = new sg3(1, i3, null);
        }
        return sg3Var;
    }

    public static int b(int i2, double d2) {
        return (Double.hashCode(d2) + i2) * 31;
    }

    public static final kq1 c(r1a r1aVar) {
        return od2.g(new wpc(r1aVar, null));
    }

    public static final Long d(long j) {
        return new Long(j);
    }

    public static void e(j43 j43Var, l20 l20Var) throws Throwable {
        a8g a8gVar;
        if (l20Var.f()) {
            File fileL = ((y8a) vl.b()).h().l(l20Var.r);
            if (fileL.exists()) {
                return;
            }
            synchronized (j43Var) {
                a8gVar = j43Var.o;
            }
            GifImage gifImage = (GifImage) a8gVar.a;
            if (gifImage != null) {
                x10 x10Var = l20Var.b;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(x10Var.c, x10Var.o, Bitmap.Config.ARGB_8888);
                gifImage.d(0).g(x10Var.c, x10Var.o, bitmapCreateBitmap);
                j47.i0(fileL.getAbsolutePath(), bitmapCreateBitmap, vl.o.a().b);
                bitmapCreateBitmap.recycle();
            }
        }
    }

    public static float[] f(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        fm9.e("Expecting 4 plane parameters", fArr2.length == 4);
        float f2 = fArr[0];
        float f3 = fArr3[0];
        float f4 = fArr2[0];
        float f5 = fArr[1];
        float f6 = fArr3[1];
        float f7 = fArr2[1];
        float f8 = fArr[2];
        float f9 = fArr3[2];
        float f10 = fArr2[2];
        float f11 = ((f8 - f9) * f10) + ((f5 - f6) * f7) + ((f2 - f3) * f4);
        float f12 = fArr4[0] - f3;
        float f13 = fArr4[1] - f6;
        float f14 = fArr4[2] - f9;
        float f15 = f11 / ((f10 * f14) + ((f7 * f13) + (f4 * f12)));
        return new float[]{(f12 * f15) + f3, (f13 * f15) + f6, (f14 * f15) + f9, 1.0f};
    }

    public static lsd g(List list, int i2, int i3) {
        fm9.e("inputWidth must be positive", i2 > 0);
        fm9.e("inputHeight must be positive", i3 > 0);
        lsd lsdVar = new lsd(i2, i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            lsdVar = ((z18) list.get(i4)).d(lsdVar.a, lsdVar.b);
        }
        return lsdVar;
    }

    public static a20 h(RectF rectF) {
        if (rectF == null) {
            return null;
        }
        return new a20(rectF.left, rectF.top, rectF.right, rectF.bottom, 2);
    }

    public static String i(String str, Rect rect, y7d y7dVar) throws Throwable {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, null);
        if (bitmapDecodeFile == null) {
            hm9.p("c37", "cropImage: failed, no file at path ".concat(str), null);
            return null;
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int iWidth = rect.width();
        int iHeight = rect.height();
        hm9.m("c37", "cropImage: sourceWidth=%d, sourceHeight=%d, x=%d, y=%d, width=%d, height=%d", Integer.valueOf(bitmapDecodeFile.getWidth()), Integer.valueOf(bitmapDecodeFile.getHeight()), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(iWidth), Integer.valueOf(iHeight));
        if (i2 + iWidth > bitmapDecodeFile.getWidth() || i3 + iHeight > bitmapDecodeFile.getHeight()) {
            ((cba) ((y8a) vl.b()).g()).c(new HandledException("wrong image crop params"), true);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, i2, i3, iWidth, iHeight);
        if (bitmapCreateBitmap != bitmapDecodeFile) {
            bitmapDecodeFile.recycle();
        }
        qyc qycVar = (qyc) y7dVar;
        qycVar.getClass();
        int iQ = (int) qycVar.q(PmsKey.f83minimagesidesize, 64);
        if (bitmapCreateBitmap.getWidth() < iQ || bitmapCreateBitmap.getHeight() < iQ) {
            hm9.p("c37", "Crop width and height must be >= 64", null);
            Locale locale = Locale.ENGLISH;
            ((cba) ((y8a) vl.b()).g()).c(new HandledException("Crop rect = " + rect + " doesn't fit. Crop width and height must be >= 64"), true);
            double d2 = iQ;
            int iMax = Math.max((int) Math.ceil(d2 / bitmapCreateBitmap.getWidth()), (int) Math.ceil(d2 / bitmapCreateBitmap.getHeight()));
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmapCreateBitmap.getWidth() * iMax, bitmapCreateBitmap.getHeight() * iMax, false);
            if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                bitmapCreateBitmap.recycle();
            }
            bitmapCreateBitmap = bitmapCreateScaledBitmap;
        }
        kk5 kk5VarH = ((y8a) vl.b()).h();
        kk5VarH.getClass();
        File fileO = kk5VarH.o(null, "jpg");
        j47.i0(fileO.getAbsolutePath(), bitmapCreateBitmap, vl.o.a().b);
        return fileO.getAbsolutePath();
    }

    public static Object j(hg4 hg4Var, long j, Continuation continuation) {
        e5f e5fVar = e5f.a;
        if (j <= 0) {
            return e5fVar;
        }
        sy1 sy1Var = new sy1(1, v3c.u(continuation));
        sy1Var.n();
        hg4Var.mo21scheduleResumeAfterDelay(j, sy1Var);
        Object objM = sy1Var.m();
        return objM == tx3.a ? objM : e5fVar;
    }

    public static boolean k(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static glc l(l20 l20Var) {
        k20 k20Var = l20Var.d;
        String str = l20Var.s;
        if (k20Var != null && k20Var.a > 0) {
            String str2 = k20Var.h;
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return new glc(str2, 13);
            }
        }
        File file = !TextUtils.isEmpty(str) ? new File(str) : null;
        if (file != null) {
            boolean zExists = file.exists();
            if (!zExists && (k20Var == null || k20Var.a == 0)) {
                return new glc(Boolean.TRUE);
            }
            if (zExists) {
                return new glc(file);
            }
        }
        if (k20Var != null) {
            File fileS = ((y8a) vl.b()).h().s(k20Var.a);
            if (fileS.exists()) {
                return new glc(fileS);
            }
        }
        return new glc(Boolean.FALSE);
    }

    public static String m(String str) {
        Uri uri = Uri.parse(str);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            if (str2.equals(ApiProtocol.KEY_TOKEN)) {
                builderClearQuery.appendQueryParameter(str2, "<HIDDEN>");
            } else {
                builderClearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        return builderClearQuery.build().toString();
    }

    public static String n(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(ApiProtocol.PARAM_JOIN_LINK)) {
                jSONObject.put(ApiProtocol.PARAM_JOIN_LINK, "<HIDDEN>");
            }
            if (jSONObject.has("conversation")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("conversation");
                if (jSONObject2.has(ApiProtocol.PARAM_JOIN_LINK)) {
                    jSONObject2.put(ApiProtocol.PARAM_JOIN_LINK, "<HIDDEN>");
                }
            }
            if (jSONObject.has(ApiProtocol.KEY_ENDPOINT)) {
                jSONObject.put(ApiProtocol.KEY_ENDPOINT, m(jSONObject.getString(ApiProtocol.KEY_ENDPOINT)));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    public static Bitmap o(Uri uri) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = vl.o.getContentResolver();
        ParcelFileDescriptor parcelFileDescriptor = null;
        bitmapDecodeFile = null;
        bitmapDecodeFile = null;
        Bitmap bitmapDecodeFile = null;
        try {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                try {
                    FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                    ph4 ph4Var = j47.X;
                    int iE = new c65(fileDescriptor).e(1, "Orientation");
                    parcelFileDescriptorOpenFileDescriptor.close();
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = contentResolver.openFileDescriptor(uri, "r");
                    Point pointD = j47.D(parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor(), iE);
                    parcelFileDescriptorOpenFileDescriptor2.close();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = j47.I(pointD, 2048, 2048);
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    int iK = j47.K(iE);
                    if (iK == 0) {
                        s5c.m(parcelFileDescriptorOpenFileDescriptor);
                        return bitmapDecodeFileDescriptor;
                    }
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    matrix.setRotate(iK);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFileDescriptor, 0, 0, bitmapDecodeFileDescriptor.getWidth(), bitmapDecodeFileDescriptor.getHeight(), matrix, true);
                    bitmapDecodeFileDescriptor.recycle();
                    s5c.m(parcelFileDescriptorOpenFileDescriptor);
                    return bitmapCreateBitmap;
                } catch (IOException e2) {
                    e = e2;
                    if (e instanceof FileNotFoundException) {
                        String string = uri.toString();
                        try {
                            if (new File(string).exists()) {
                                bitmapDecodeFile = BitmapFactory.decodeFile(string, new BitmapFactory.Options());
                            } else {
                                hm9.k0("c37", null, "file by path %s not exists", Arrays.copyOf(new Object[]{string}, 1));
                            }
                        } catch (Throwable th) {
                            hm9.l0("c37", "getBitmapFromExternalStorage fail", th);
                        }
                    } else {
                        hm9.p("c37", "getBitmapFromPath: failed to get bitmap", e);
                    }
                    s5c.m(parcelFileDescriptorOpenFileDescriptor);
                    return bitmapDecodeFile;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                s5c.m(parcelFileDescriptor);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            parcelFileDescriptorOpenFileDescriptor = null;
        } catch (Throwable th3) {
            th = th3;
            s5c.m(parcelFileDescriptor);
            throw th;
        }
    }

    public static final Uri p(Cursor cursor, int i2) {
        Object njcVar;
        try {
            njcVar = cursor.getString(i2);
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            njcVar = null;
        }
        String str = (String) njcVar;
        if (str != null && str.length() != 0) {
            try {
                if (pag.l(str)) {
                    return j47.N(str);
                }
                return null;
            } catch (Throwable th2) {
                hm9.l0("LocalMediaRepository:Cursor:getUri", "Failure Uri.fromFile(File(" + str + "))", th2);
            }
        }
        return null;
    }

    public static final String q() {
        String str = i;
        if (str != null) {
            return str;
        }
        String processName = Application.getProcessName();
        i = processName;
        return processName;
    }

    public static cm4 r(long j, Runnable runnable, lx3 lx3Var) {
        return qa4.a.invokeOnTimeout(j, runnable, lx3Var);
    }

    public static boolean s(float[] fArr, float[] fArr2) {
        fm9.e("Expecting 4 plane parameters", fArr2.length == 4);
        return (fArr2[2] * fArr[2]) + ((fArr2[1] * fArr[1]) + (fArr2[0] * fArr[0])) <= fArr2[3];
    }

    public static void t(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static jde u(jde jdeVar) {
        if ((jdeVar instanceof pde) || (jdeVar instanceof ode)) {
            return jdeVar;
        }
        if (jdeVar instanceof Serializable) {
            return new ode(jdeVar);
        }
        pde pdeVar = new pde();
        pdeVar.a = jdeVar;
        return pdeVar;
    }

    public static int v(byte[] bArr, int i2, int i3, boolean z) {
        int i4;
        if (z) {
            i2 += i3 - 1;
            i4 = -1;
        } else {
            i4 = 1;
        }
        int i5 = 0;
        while (true) {
            int i6 = i3 - 1;
            if (i3 <= 0) {
                return i5;
            }
            i5 = (bArr[i2] & 255) | (i5 << 8);
            i2 += i4;
            i3 = i6;
        }
    }

    public static rx5 w(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            A(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), k3c.FontFamily);
        String string = typedArrayObtainAttributes.getString(k3c.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(k3c.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(k3c.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(k3c.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(k3c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(k3c.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = typedArrayObtainAttributes.getString(k3c.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                A(xmlResourceParser);
            }
            return new ux5(new bg4(string, string2, string3, x(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), k3c.FontFamilyFont);
                    int i2 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(k3c.FontFamilyFont_fontWeight) ? k3c.FontFamilyFont_fontWeight : k3c.FontFamilyFont_android_fontWeight, HttpStatus.SC_BAD_REQUEST);
                    boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(k3c.FontFamilyFont_fontStyle) ? k3c.FontFamilyFont_fontStyle : k3c.FontFamilyFont_android_fontStyle, 0);
                    int i3 = typedArrayObtainAttributes2.hasValue(k3c.FontFamilyFont_ttcIndex) ? k3c.FontFamilyFont_ttcIndex : k3c.FontFamilyFont_android_ttcIndex;
                    String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(k3c.FontFamilyFont_fontVariationSettings) ? k3c.FontFamilyFont_fontVariationSettings : k3c.FontFamilyFont_android_fontVariationSettings);
                    int i4 = typedArrayObtainAttributes2.getInt(i3, 0);
                    int i5 = typedArrayObtainAttributes2.hasValue(k3c.FontFamilyFont_font) ? k3c.FontFamilyFont_font : k3c.FontFamilyFont_android_font;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i5, 0);
                    String string6 = typedArrayObtainAttributes2.getString(i5);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        A(xmlResourceParser);
                    }
                    arrayList.add(new tx5(i2, i4, resourceId2, string6, string5, z));
                } else {
                    A(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new sx5((tx5[]) arrayList.toArray(new tx5[0]));
    }

    public static List x(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (qx5.a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void y(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(z7b.h(15, i2, "csd-"), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    public static void z(View view, float f2) {
        int integer = view.getResources().getInteger(jyb.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, tsb.state_liftable, -tsb.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f2).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
