package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.exoplayer2.ParserException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.Symbol;
import org.json.JSONArray;
import ru.ok.messages.views.fragments.base.FrgBase;

/* loaded from: classes.dex */
public abstract class dy7 implements qsd {
    public static volatile zh6 a;
    public static volatile String c;
    public static final pe5 k;
    public static final pe5[] l;
    public static Context m;
    public static hhg n;
    public static final Object b = new Object();
    public static final String[] d = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] e = {44100, 48000, 32000};
    public static final int[] f = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] h = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] i = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] j = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    static {
        pe5 pe5Var = new pe5("CLIENT_TELEMETRY", 1L);
        k = pe5Var;
        l = new pe5[]{pe5Var};
    }

    public static final boolean A(int i2) {
        return (i2 & 536870912) != 0;
    }

    public static final boolean B(int i2) {
        return (i2 & Integer.MIN_VALUE) != 0;
    }

    public static final boolean C(int i2) {
        return (i2 & 1073741824) != 0;
    }

    public static final void D(im imVar, boolean z) {
        if (z) {
            imVar.getWindow().addFlags(128);
        } else {
            imVar.getWindow().clearFlags(128);
        }
        imVar.setShowWhenLocked(z);
        imVar.setTurnScreenOn(z);
    }

    public static final Drawable E(int i2, int i3, Context context) {
        Drawable drawableB = kt3.b(context, i2);
        ngg.G(drawableB, i3);
        return drawableB;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String F(android.content.Context r7) {
        /*
            java.lang.String r0 = "tracer"
            r1 = 0
            android.content.SharedPreferences r1 = r7.getSharedPreferences(r0, r1)
            java.lang.String r2 = "device_id"
            r3 = 0
            java.lang.String r4 = r1.getString(r2, r3)
            if (r4 != 0) goto L13
            java.lang.String r5 = "00000000-0000-0000-0000-000000000000"
            goto L14
        L13:
            r5 = r4
        L14:
            java.io.File r7 = r7.getFilesDir()     // Catch: java.io.IOException -> L7b
            java.io.File r7 = defpackage.lk5.J(r7, r0)     // Catch: java.io.IOException -> L7b
            defpackage.m6d.y(r7)     // Catch: java.io.IOException -> L7b
            java.lang.String r0 = "device_id.txt"
            java.io.File r7 = defpackage.lk5.J(r7, r0)
            boolean r0 = r7.exists()
            if (r0 != 0) goto L2d
        L2b:
            r0 = r3
            goto L3f
        L2d:
            java.lang.String r0 = defpackage.lk5.I(r7)     // Catch: java.io.IOException -> L2b
            java.lang.CharSequence r0 = defpackage.w9e.b1(r0)     // Catch: java.io.IOException -> L2b
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L2b
            int r6 = r0.length()     // Catch: java.io.IOException -> L2b
            if (r6 <= 0) goto L2b
        L3f:
            if (r0 == 0) goto L42
            return r0
        L42:
            if (r4 != 0) goto L4d
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            goto L4e
        L4d:
            r0 = r4
        L4e:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L7b
            r6.<init>(r7)     // Catch: java.io.IOException -> L7b
            java.nio.charset.Charset r7 = defpackage.a52.a     // Catch: java.lang.Throwable -> L74
            byte[] r7 = r0.getBytes(r7)     // Catch: java.lang.Throwable -> L74
            r6.write(r7)     // Catch: java.lang.Throwable -> L74
            java.io.FileDescriptor r7 = r6.getFD()     // Catch: java.lang.Throwable -> L74
            r7.sync()     // Catch: java.lang.Throwable -> L74
            defpackage.v3c.i(r6, r3)     // Catch: java.io.IOException -> L7b
            if (r4 == 0) goto L73
            android.content.SharedPreferences$Editor r7 = r1.edit()
            android.content.SharedPreferences$Editor r7 = r7.remove(r2)
            r7.apply()
        L73:
            return r0
        L74:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            defpackage.v3c.i(r6, r7)     // Catch: java.io.IOException -> L7b
            throw r0     // Catch: java.io.IOException -> L7b
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy7.F(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void G(y3d y3dVar, long j2, m56 m56Var) {
        z3a z3aVar = new z3a(j2);
        y3a y3aVar = y3a.a;
        f8.c(3, y3aVar);
        Symbol symbol = b4d.a;
        w3d w3dVar = new w3d(y3dVar, z3aVar, y3aVar, a4d.a, b4d.e, (ffe) m56Var, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y3d.Y;
        y3dVar.f(w3dVar, false);
    }

    public static final void H(View view, float f2) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new xq0(f2));
    }

    public static final EnumSet I(String str) {
        Object njcVar;
        JSONArray jSONArray = new JSONArray(str);
        EnumSet enumSetNoneOf = EnumSet.noneOf(pa2.class);
        Iterator it = ote.Y(0, jSONArray.length()).iterator();
        while (((i37) it).c) {
            try {
                njcVar = pa2.valueOf(jSONArray.getString(((i37) it).a()));
            } catch (Throwable th) {
                njcVar = new njc(th);
            }
            if (njcVar instanceof njc) {
                njcVar = null;
            }
            pa2 pa2Var = (pa2) njcVar;
            if (pa2Var != null) {
                enumSetNoneOf.add(pa2Var);
            }
        }
        return enumSetNoneOf;
    }

    public static String J(int i2) {
        return wg0.g(i2, "ProfileEditItemId(value=", ")");
    }

    public static final void K(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) == i2) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams2.bottomMargin = i2;
        view.setLayoutParams(marginLayoutParams2);
    }

    public static final void L(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) == i2) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams2.topMargin = i2;
        view.setLayoutParams(marginLayoutParams2);
    }

    public static final void M(ViewGroup viewGroup, boolean z) {
        int i2 = z ? 0 : 4;
        if (viewGroup.getVisibility() != i2) {
            viewGroup.setVisibility(i2);
        }
    }

    public static hhg N(Context context) throws GooglePlayServicesNotAvailableException, ClassNotFoundException {
        fp3.n(context);
        "preferredRenderer: ".concat("null");
        hhg hhgVar = n;
        if (hhgVar != null) {
            return hhgVar;
        }
        int i2 = pe6.e;
        int iA = pe6.a(context, 13400000);
        if (iA != 0) {
            throw new GooglePlayServicesNotAvailableException(iA);
        }
        hhg hhgVarP = P(context, 0);
        n = hhgVarP;
        try {
            Parcel parcelR = hhgVarP.R(hhgVarP.G0(), 9);
            int i3 = parcelR.readInt();
            parcelR.recycle();
            String packageName = context.getPackageName();
            if (i3 == 2 && !packageName.equals("com.google.android.apps.photos")) {
                try {
                    hhg hhgVar2 = n;
                    oy9 oy9Var = new oy9(O(context, 0));
                    Parcel parcelG0 = hhgVar2.G0();
                    agg.c(parcelG0, oy9Var);
                    hhgVar2.H0(parcelG0, 11);
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                } catch (UnsatisfiedLinkError unused) {
                    m = null;
                    n = P(context, 1);
                }
            }
            try {
                hhg hhgVar3 = n;
                oy9 oy9Var2 = new oy9(O(context, 0).getResources());
                Parcel parcelG02 = hhgVar3.G0();
                agg.c(parcelG02, oy9Var2);
                parcelG02.writeInt(19020000);
                hhgVar3.H0(parcelG02, 6);
                return n;
            } catch (RemoteException e3) {
                throw new RuntimeRemoteException(e3);
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public static Context O(Context context, int i2) throws PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        Context context2 = m;
        if (context2 != null) {
            return context2;
        }
        String str = i2 == 1 ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextCreatePackageContext = lu4.b(context, lu4.b, str).a;
        } catch (Exception unused) {
            try {
                if (str.equals("com.google.android.gms.maps_dynamite")) {
                    int i3 = pe6.e;
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        contextCreatePackageContext = lu4.b(context, lu4.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception unused2) {
                        int i4 = pe6.e;
                        contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                contextCreatePackageContext = null;
            }
        }
        m = contextCreatePackageContext;
        if (contextCreatePackageContext != null) {
            return contextCreatePackageContext;
        }
        throw new RuntimeException("Unable to load maps module, maps container context is null");
    }

    public static hhg P(Context context, int i2) throws ClassNotFoundException {
        ClassLoader classLoader = O(context, i2).getClassLoader();
        try {
            fp3.n(classLoader);
            Class<?> clsLoadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                try {
                    IBinder iBinder = (IBinder) clsLoadClass.newInstance();
                    if (iBinder == null) {
                        throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    return iInterfaceQueryLocalInterface instanceof hhg ? (hhg) iInterfaceQueryLocalInterface : new hhg(iBinder, "com.google.android.gms.maps.internal.ICreator", 3);
                } catch (IllegalAccessException e2) {
                    throw new IllegalStateException("Unable to call the default constructor of ".concat(clsLoadClass.getName()), e2);
                }
            } catch (InstantiationException e3) {
                throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(clsLoadClass.getName()), e3);
            }
        } catch (ClassNotFoundException e4) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e4);
        }
    }

    public static final qt3 c(int i2) {
        int i3 = yt3.$EnumSwitchMapping$0[au1.s(i2)];
        if (i3 == 1) {
            return new re6(10);
        }
        if (i3 == 2) {
            return new wt3();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void d(File file, List list) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), a52.a);
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                outputStreamWriter.write((String) it.next());
                outputStreamWriter.write(10);
            }
            v3c.i(outputStreamWriter, null);
        } finally {
        }
    }

    public static void e(n16 n16Var, int i2, FrgBase frgBase, String str) {
        n16Var.getClass();
        he0 he0Var = new he0(n16Var);
        he0Var.f(i2, frgBase, str, 1);
        he0Var.d(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.CharSequence f(java.lang.CharSequence r9, android.widget.TextView r10, int r11) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy7.f(java.lang.CharSequence, android.widget.TextView, int):java.lang.CharSequence");
    }

    public static final Bundle g(kpa... kpaVarArr) {
        Bundle bundle = new Bundle(kpaVarArr.length);
        for (kpa kpaVar : kpaVarArr) {
            String str = (String) kpaVar.a;
            Object obj = kpaVar.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                mu0.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                mu0.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final void h(View view, Rect rect, float f2) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new vnc(rect, f2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(Activity activity, boolean z) {
        y6g y6gVar;
        View decorView = activity.getWindow().getDecorView();
        pq9 pq9Var = qp4.u0;
        boolean z2 = pq9Var.b(activity).i().h() == l63.b;
        activity.getWindow().setNavigationBarColor(z ? pq9Var.o(activity).c.b().k : 0);
        Window window = activity.getWindow();
        o9g o9gVar = new o9g(decorView);
        if (Build.VERSION.SDK_INT >= 30) {
            z6g z6gVar = new z6g(window.getInsetsController(), o9gVar);
            z6gVar.k = window;
            y6gVar = z6gVar;
        } else {
            y6gVar = new y6g(window, o9gVar);
        }
        y6gVar.u((z || z2) ? false : true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(Activity activity, boolean z) {
        y6g y6gVar;
        View decorView = activity.getWindow().getDecorView();
        boolean z2 = qp4.u0.b(activity).i().h() == l63.b;
        Window window = activity.getWindow();
        o9g o9gVar = new o9g(decorView);
        if (Build.VERSION.SDK_INT >= 30) {
            z6g z6gVar = new z6g(window.getInsetsController(), o9gVar);
            z6gVar.k = window;
            y6gVar = z6gVar;
        } else {
            y6gVar = new y6g(window, o9gVar);
        }
        y6gVar.v((z || z2) ? false : true);
    }

    public static void k(String str, boolean z) throws ParserException {
        if (!z) {
            throw ParserException.a(null, str);
        }
    }

    public static long l(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final void m(int i2, int i3) {
        if (i2 > i3) {
            throw new IndexOutOfBoundsException(wg0.h("toIndex (", i2, ") is greater than size (", i3, ")."));
        }
    }

    public static ty4 n(n85 n85Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = n85Var.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (n85Var.q(i3, jElapsedRealtime)) {
                i2++;
            }
        }
        return new ty4(1, 0, length, i2, 2);
    }

    public static final boolean o(int i2, int i3) {
        return i2 == i3;
    }

    public static final String p(Collection collection) {
        ArrayList arrayList = new ArrayList(z53.S(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((pa2) it.next()).name());
        }
        return new JSONArray((Collection<?>) arrayList).toString();
    }

    public static final Map q(byte[] bArr) throws InvalidProtocolBufferNanoException {
        if (bArr == null) {
            return oz4.a;
        }
        zw5 zw5Var = new zw5(0);
        qw8.mergeFrom(zw5Var, bArr);
        EnumMap enumMap = new EnumMap(pa2.class);
        long[] jArr = (long[]) zw5Var.b;
        if (!(!(jArr.length == 0))) {
            return enumMap;
        }
        enumMap.put((EnumMap) pa2.A0, (pa2) jArr);
        return enumMap;
    }

    public static final Set r(byte[] bArr) throws InvalidProtocolBufferNanoException {
        if (bArr == null) {
            return wz4.a;
        }
        zw5 zw5Var = new zw5(1);
        qw8.mergeFrom(zw5Var, bArr);
        return xfg.m(zw5Var);
    }

    public static final List s(byte[] bArr) throws InvalidProtocolBufferNanoException {
        if (bArr == null) {
            return nz4.a;
        }
        zw5 zw5Var = new zw5(2);
        qw8.mergeFrom(zw5Var, bArr);
        return xfg.n(zw5Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:1023:0x0d75  */
    /* JADX WARN: Removed duplicated region for block: B:1041:0x0da5  */
    /* JADX WARN: Removed duplicated region for block: B:1059:0x0dd5  */
    /* JADX WARN: Removed duplicated region for block: B:1095:0x0e41  */
    /* JADX WARN: Removed duplicated region for block: B:1158:0x0ef6  */
    /* JADX WARN: Removed duplicated region for block: B:1220:0x0fb4  */
    /* JADX WARN: Removed duplicated region for block: B:1240:0x0ff2  */
    /* JADX WARN: Removed duplicated region for block: B:1340:0x111d  */
    /* JADX WARN: Removed duplicated region for block: B:1399:0x11e9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0269 A[PHI: r29
      0x0269: PHI (r29v2 double) = (r29v0 double), (r29v1 double), (r29v1 double), (r29v1 double), (r29v0 double), (r29v0 double) binds: [B:1759:0x1647, B:1293:0x1088, B:1298:0x109a, B:826:0x0ae3, B:177:0x02dd, B:130:0x0244] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:1445:0x1276  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:1491:0x1303  */
    /* JADX WARN: Removed duplicated region for block: B:1526:0x137a  */
    /* JADX WARN: Removed duplicated region for block: B:1552:0x13cd  */
    /* JADX WARN: Removed duplicated region for block: B:1581:0x1425  */
    /* JADX WARN: Removed duplicated region for block: B:1598:0x145a  */
    /* JADX WARN: Removed duplicated region for block: B:1619:0x1495  */
    /* JADX WARN: Removed duplicated region for block: B:1668:0x152d  */
    /* JADX WARN: Removed duplicated region for block: B:1698:0x158d  */
    /* JADX WARN: Removed duplicated region for block: B:1730:0x15f1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d2 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:1768:0x1665  */
    /* JADX WARN: Removed duplicated region for block: B:1796:0x16c3  */
    /* JADX WARN: Removed duplicated region for block: B:1813:0x16f8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f0 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e A[FALL_THROUGH, PHI: r47
      0x012e: PHI (r47v2 double) = 
      (r47v0 double)
      (r47v0 double)
      (r47v0 double)
      (r47v0 double)
      (r47v0 double)
      (r47v1 double)
      (r47v1 double)
      (r47v1 double)
      (r47v1 double)
      (r47v1 double)
      (r47v1 double)
      (r47v1 double)
      (r47v1 double)
      (r47v1 double)
      (r47v1 double)
      (r47v1 double)
      (r47v1 double)
      (r47v0 double)
      (r47v0 double)
      (r47v0 double)
      (r47v0 double)
     binds: [B:45:0x012b, B:1548:0x13be, B:1594:0x144b, B:1610:0x1477, B:1612:0x147c, B:1325:0x10f2, B:1320:0x10e1, B:1236:0x0fe3, B:1256:0x1018, B:1216:0x0fa6, B:1209:0x0f91, B:1005:0x0d3c, B:1078:0x0e08, B:839:0x0b0f, B:804:0x0aa9, B:788:0x0a7e, B:367:0x0548, B:51:0x0144, B:217:0x0356, B:237:0x038b, B:240:0x0394] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0733 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0764 A[FALL_THROUGH, PHI: r31
      0x0764: PHI (r31v1 double) = (r31v0 double), (r31v0 double), (r31v0 double), (r31v0 double), (r31v2 double), (r31v2 double), (r31v2 double) binds: [B:1764:0x1657, B:1385:0x11b3, B:1393:0x11d6, B:1388:0x11c1, B:1053:0x0dc2, B:1035:0x0d92, B:528:0x0760] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x07a7 A[FALL_THROUGH, PHI: r25
      0x07a7: PHI (r25v1 double) = (r25v0 double), (r25v0 double), (r25v0 double), (r25v2 double), (r25v2 double) binds: [B:1759:0x1647, B:1780:0x1682, B:1513:0x1349, B:826:0x0ae3, B:552:0x07a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x08bc A[FALL_THROUGH, PHI: r33
      0x08bc: PHI (r33v1 double) = 
      (r33v0 double)
      (r33v0 double)
      (r33v0 double)
      (r33v0 double)
      (r33v2 double)
      (r33v2 double)
      (r33v2 double)
      (r33v2 double)
      (r33v2 double)
      (r33v2 double)
     binds: [B:1714:0x15bc, B:1719:0x15ce, B:1365:0x116e, B:1333:0x1102, B:1114:0x0e72, B:1085:0x0e1d, B:1055:0x0dc7, B:1037:0x0d97, B:778:0x0a5c, B:649:0x08b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:652:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0170 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:810:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:845:0x0b21  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int t(java.lang.String r72, int r73, int r74, float r75) {
        /*
            Method dump skipped, instructions count: 7928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy7.t(java.lang.String, int, int, float):int");
    }

    public static final String u(Context context) {
        String str = c;
        if (str != null) {
            return str;
        }
        synchronized (b) {
            String str2 = c;
            if (str2 != null) {
                return str2;
            }
            String strF = F(context.getApplicationContext());
            c = strF;
            return strF;
        }
    }

    public static int v(Context context) throws Resources.NotFoundException {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z ? qtb.mr_dialog_fixed_width_minor : qtb.mr_dialog_fixed_width_major, typedValue, true);
        int i2 = typedValue.type;
        if (i2 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i2 != 6) {
                return -2;
            }
            int i3 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i3, i3);
        }
        return (int) fraction;
    }

    public static int w(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!((i2 & (-2097152)) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = e[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? f[i5 - 1] : g[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? h[i5 - 1] : i[i5 - 1] : j[i5 - 1];
        if (i3 == 3) {
            return ((i9 * 144) / i7) + i8;
        }
        return (((i4 == 1 ? 72 : 144) * i9) / i7) + i8;
    }

    public static final ArrayList x(p4d p4dVar) {
        aqd aqdVar;
        p4dVar.getClass();
        ArrayList arrayList = new ArrayList(p4dVar.a);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((r4d) next).f) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            r4d r4dVar = (r4d) it2.next();
            zp7 zp7VarI = ay7.I(r4dVar.a);
            String strF = p4dVar.f(r4dVar);
            up7 up7Var = r4dVar.a;
            if (strF == null) {
                aqdVar = p4dVar.l(r4dVar);
            } else {
                int i2 = up7Var.a;
                if (p4dVar.l == 2) {
                    i2 = 7;
                }
                aqdVar = new aqd(i2, strF);
            }
            Uri uriA = awa.b(r4dVar.c, up7Var) ? awa.a(r4dVar.c, up7Var) : zp7VarI.v0;
            boolean z = up7Var.a == 7;
            Uri uri = Uri.parse(aqdVar.b);
            awa awaVar = r4dVar.c;
            arrayList3.add(new q4d(zp7VarI, z, uri, uriA, null, null, null, awaVar != null ? awaVar.X : null));
        }
        return arrayList3;
    }

    public static final PointF y(Context context) {
        int iG = tpa.u(context).b - tu0.G(118 * fk4.d().getDisplayMetrics().density);
        float f2 = 16;
        return new PointF(rh4.q(f2, fk4.d().getDisplayMetrics().density, iG), rh4.q(f2, fk4.d().getDisplayMetrics().density, r4.a - tu0.G(174 * fk4.d().getDisplayMetrics().density)) - r4.d);
    }

    public static void z(File file, File file2) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file2));
            try {
                ema.l(fileInputStream, gZIPOutputStream, 8192);
                v3c.i(gZIPOutputStream, null);
                v3c.i(fileInputStream, null);
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.qsd
    public float b(View view, ViewGroup viewGroup) {
        return view.getTranslationY();
    }
}
