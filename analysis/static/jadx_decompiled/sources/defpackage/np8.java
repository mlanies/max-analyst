package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.location.Location;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import java.io.CharConversionException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import one.me.android.OneMeApplication;

/* loaded from: classes2.dex */
public abstract class np8 {
    public static final xk0 a = new xk0(0);
    public static final byte[] b = {0, 0, 0, 1};
    public static final float[] c = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object d = new Object();
    public static int[] e = new int[10];
    public static final pe5 f;
    public static final pe5[] g;
    public static Boolean h;
    public static Boolean i;
    public static Boolean j;
    public static Boolean k;
    public static Field l;
    public static Integer m;
    public static Integer n;
    public static Integer o;

    static {
        pe5 pe5Var = new pe5("app_set_id", 1L);
        f = pe5Var;
        g = new pe5[]{pe5Var};
    }

    public static boolean A(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (h == null) {
            h = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        h.booleanValue();
        if (i == null) {
            i = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return i.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static float B(zw6 zw6Var, qy5 qy5Var) {
        int i2 = qy5Var.w;
        int i3 = i2 % 180;
        int i4 = qy5Var.u;
        int i5 = qy5Var.t;
        int i6 = i3 == 0 ? i5 : i4;
        int i7 = i2 % 180 == 0 ? i4 : i5;
        float f2 = 0.0f;
        for (int i8 = 0; i8 < zw6Var.size(); i8++) {
            z18 z18Var = (z18) zw6Var.get(i8);
            if (!(z18Var instanceof z18)) {
                return -1.0f;
            }
            if (z18Var instanceof osc) {
                osc oscVar = (osc) z18Var;
                oscVar.getClass();
                float f3 = oscVar.a;
                if (f3 % 90.0f != 0.0f) {
                    return -1.0f;
                }
                f2 += f3;
                float f4 = f2 % 180.0f;
                i6 = f4 == 0.0f ? i5 : i4;
                i7 = f4 == 0.0f ? i4 : i5;
            } else if (!z18Var.c(i6, i7)) {
                return -1.0f;
            }
        }
        float f5 = f2 % 360.0f;
        if (f5 % 90.0f == 0.0f) {
            return f5;
        }
        return -1.0f;
    }

    public static void C(hj9 hj9Var, zw6 zw6Var, qy5 qy5Var) {
        float fB = B(zw6Var, qy5Var);
        if (fB == 90.0f || fB == 180.0f || fB == 270.0f) {
            int iRound = 360 - Math.round(fB);
            fm9.j("The additional rotation cannot be changed after adding track formats.", hj9Var.e.size() == 0 || hj9Var.v == iRound);
            hj9Var.v = iRound;
        }
    }

    public static final jyc D(Context context) {
        ((OneMeApplication) ((eke) context.getApplicationContext())).getClass();
        return jyc.a;
    }

    public static wl9 E(int i2, byte[] bArr, int i3) {
        s02 s02Var = new s02(i2 + 2, i3, 3, bArr);
        int i4 = 4;
        s02Var.t(4);
        int i5 = s02Var.i(3);
        s02Var.s();
        int i6 = s02Var.i(2);
        boolean zH = s02Var.h();
        int i7 = s02Var.i(5);
        int i8 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (s02Var.h()) {
                i8 |= 1 << i9;
            }
        }
        int i10 = 6;
        int[] iArr = new int[6];
        for (int i11 = 0; i11 < 6; i11++) {
            iArr[i11] = s02Var.i(8);
        }
        int i12 = s02Var.i(8);
        int i13 = 0;
        for (int i14 = 0; i14 < i5; i14++) {
            if (s02Var.h()) {
                i13 += 89;
            }
            if (s02Var.h()) {
                i13 += 8;
            }
        }
        s02Var.t(i13);
        if (i5 > 0) {
            s02Var.t((8 - i5) * 2);
        }
        s02Var.m();
        int iM = s02Var.m();
        if (iM == 3) {
            s02Var.s();
        }
        int iM2 = s02Var.m();
        int iM3 = s02Var.m();
        if (s02Var.h()) {
            int iM4 = s02Var.m();
            int iM5 = s02Var.m();
            int iM6 = s02Var.m();
            int iM7 = s02Var.m();
            iM2 -= (iM4 + iM5) * ((iM == 1 || iM == 2) ? 2 : 1);
            iM3 -= (iM6 + iM7) * (iM == 1 ? 2 : 1);
        }
        int i15 = iM3;
        int i16 = iM2;
        s02Var.m();
        s02Var.m();
        int iM8 = s02Var.m();
        for (int i17 = s02Var.h() ? 0 : i5; i17 <= i5; i17++) {
            s02Var.m();
            s02Var.m();
            s02Var.m();
        }
        s02Var.m();
        s02Var.m();
        s02Var.m();
        s02Var.m();
        s02Var.m();
        s02Var.m();
        if (s02Var.h() && s02Var.h()) {
            int i18 = 0;
            while (i18 < i4) {
                int i19 = 0;
                while (i19 < i10) {
                    if (s02Var.h()) {
                        int iMin = Math.min(64, 1 << ((i18 << 1) + 4));
                        if (i18 > 1) {
                            s02Var.n();
                        }
                        for (int i20 = 0; i20 < iMin; i20++) {
                            s02Var.n();
                        }
                    } else {
                        s02Var.m();
                    }
                    i19 += i18 == 3 ? 3 : 1;
                    i10 = 6;
                }
                i18++;
                i4 = 4;
                i10 = 6;
            }
        }
        s02Var.t(2);
        if (s02Var.h()) {
            s02Var.t(8);
            s02Var.m();
            s02Var.m();
            s02Var.s();
        }
        int iM9 = s02Var.m();
        boolean zH2 = false;
        int i21 = 0;
        for (int i22 = 0; i22 < iM9; i22++) {
            if (i22 != 0) {
                zH2 = s02Var.h();
            }
            if (zH2) {
                s02Var.s();
                s02Var.m();
                for (int i23 = 0; i23 <= i21; i23++) {
                    if (!s02Var.h()) {
                        s02Var.s();
                    }
                }
            } else {
                int iM10 = s02Var.m();
                int iM11 = s02Var.m();
                int i24 = iM10 + iM11;
                for (int i25 = 0; i25 < iM10; i25++) {
                    s02Var.m();
                    s02Var.s();
                }
                for (int i26 = 0; i26 < iM11; i26++) {
                    s02Var.m();
                    s02Var.s();
                }
                i21 = i24;
            }
        }
        if (s02Var.h()) {
            for (int i27 = 0; i27 < s02Var.m(); i27++) {
                s02Var.t(iM8 + 5);
            }
        }
        s02Var.t(2);
        float f2 = 1.0f;
        if (s02Var.h()) {
            if (s02Var.h()) {
                int i28 = s02Var.i(8);
                if (i28 == 255) {
                    int i29 = s02Var.i(16);
                    int i30 = s02Var.i(16);
                    if (i29 != 0 && i30 != 0) {
                        f2 = i29 / i30;
                    }
                } else if (i28 < 17) {
                    f2 = c[i28];
                }
            }
            if (s02Var.h()) {
                s02Var.s();
            }
            if (s02Var.h()) {
                s02Var.t(4);
                if (s02Var.h()) {
                    s02Var.t(24);
                }
            }
            if (s02Var.h()) {
                s02Var.m();
                s02Var.m();
            }
            s02Var.s();
            if (s02Var.h()) {
                i15 *= 2;
            }
        }
        return new wl9(i6, zH, i7, i8, iArr, i12, i16, i15, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.am9 F(int r22, byte[] r23, int r24) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np8.F(int, byte[], int):am9");
    }

    public static void G(String str) throws CharConversionException {
        throw new CharConversionException(zr6.i("Unsupported UCS-4 endianness (", str, ") detected"));
    }

    public static boolean H(qy5 qy5Var, dd3 dd3Var, int i2, f1f f1fVar, v43 v43Var, hj9 hj9Var) {
        f99 f99Var;
        if (dd3Var.a.size() <= 1) {
            zw6 zw6Var = dd3Var.a;
            if (((mv4) zw6Var.get(i2)).a.size() <= 1) {
                if (v43Var.c()) {
                    return true;
                }
                String str = f1fVar.b;
                if (str != null && !str.equals(qy5Var.n)) {
                    return true;
                }
                if (f1fVar.b == null && !hj9Var.h(qy5Var.n)) {
                    return true;
                }
                lv4 lv4Var = (lv4) ((mv4) zw6Var.get(i2)).a.get(0);
                if (lv4Var.d && (f99Var = qy5Var.k) != null) {
                    int i3 = 0;
                    while (true) {
                        d99[] d99VarArr = f99Var.a;
                        if (i3 >= d99VarArr.length) {
                            break;
                        }
                        if (d99VarArr[i3] instanceof itd) {
                            return true;
                        }
                        i3++;
                    }
                }
                return (lv4Var.g.a.isEmpty() && dd3Var.c.a.isEmpty()) ? false : true;
            }
        }
        return !dd3Var.e;
    }

    public static boolean I(qy5 qy5Var, dd3 dd3Var, int i2, f1f f1fVar, v43 v43Var, hj9 hj9Var) {
        if (dd3Var.a.size() <= 1) {
            zw6 zw6Var = dd3Var.a;
            if (((mv4) zw6Var.get(i2)).a.size() <= 1) {
                lv4 lv4Var = (lv4) ((mv4) zw6Var.get(i2)).a.get(0);
                if (v43Var.a() || f1fVar.d != 0) {
                    return true;
                }
                String str = f1fVar.c;
                if (str != null && !str.equals(qy5Var.n)) {
                    return true;
                }
                if ((str == null && !hj9Var.h(qy5Var.n)) || qy5Var.x != 1.0f) {
                    return true;
                }
                zw6 zw6Var2 = lv4Var.g.b;
                return !zw6Var2.isEmpty() && B(zw6Var2, qy5Var) == -1.0f;
            }
        }
        return !dd3Var.f;
    }

    public static void J(int i2, hj3 hj3Var, dob dobVar, boolean z) {
        float f2 = hj3Var.d0;
        oi3 oi3Var = hj3Var.I;
        int iD = oi3Var.f.d();
        oi3 oi3Var2 = hj3Var.K;
        int iD2 = oi3Var2.f.d();
        int iE = oi3Var.e() + iD;
        int iE2 = iD2 - oi3Var2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = hj3Var.q();
        int i3 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i3 = (iD - iD2) - iQ;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + iD;
        int i5 = i4 + iQ;
        if (iD > iD2) {
            i5 = i4 - iQ;
        }
        hj3Var.J(i4, i5);
        z(i2 + 1, hj3Var, dobVar, z);
    }

    public static void K(int i2, hj3 hj3Var, dob dobVar, hj3 hj3Var2, boolean z) {
        float f2 = hj3Var2.d0;
        oi3 oi3Var = hj3Var2.I;
        int iE = oi3Var.e() + oi3Var.f.d();
        oi3 oi3Var2 = hj3Var2.K;
        int iD = oi3Var2.f.d() - oi3Var2.e();
        if (iD >= iE) {
            int iQ = hj3Var2.q();
            if (hj3Var2.g0 != 8) {
                int i3 = hj3Var2.r;
                if (i3 == 2) {
                    iQ = (int) (hj3Var2.d0 * 0.5f * (hj3Var instanceof ij3 ? hj3Var.q() : hj3Var.T.q()));
                } else if (i3 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(hj3Var2.u, iQ);
                int i4 = hj3Var2.v;
                if (i4 > 0) {
                    iQ = Math.min(i4, iQ);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iQ)) + 0.5f));
            hj3Var2.J(i5, iQ + i5);
            z(i2 + 1, hj3Var2, dobVar, z);
        }
    }

    public static void L(int i2, hj3 hj3Var, dob dobVar) {
        float f2 = hj3Var.e0;
        oi3 oi3Var = hj3Var.J;
        int iD = oi3Var.f.d();
        oi3 oi3Var2 = hj3Var.L;
        int iD2 = oi3Var2.f.d();
        int iE = oi3Var.e() + iD;
        int iE2 = iD2 - oi3Var2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = hj3Var.k();
        int i3 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i3 = (iD - iD2) - iK;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = iD + i4;
        int i6 = i5 + iK;
        if (iD > iD2) {
            i5 = iD - i4;
            i6 = i5 - iK;
        }
        hj3Var.K(i5, i6);
        P(i2 + 1, hj3Var, dobVar);
    }

    public static void M(int i2, hj3 hj3Var, dob dobVar, hj3 hj3Var2) {
        float f2 = hj3Var2.e0;
        oi3 oi3Var = hj3Var2.J;
        int iE = oi3Var.e() + oi3Var.f.d();
        oi3 oi3Var2 = hj3Var2.L;
        int iD = oi3Var2.f.d() - oi3Var2.e();
        if (iD >= iE) {
            int iK = hj3Var2.k();
            if (hj3Var2.g0 != 8) {
                int i3 = hj3Var2.s;
                if (i3 == 2) {
                    iK = (int) (f2 * 0.5f * (hj3Var instanceof ij3 ? hj3Var.k() : hj3Var.T.k()));
                } else if (i3 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(hj3Var2.x, iK);
                int i4 = hj3Var2.y;
                if (i4 > 0) {
                    iK = Math.min(i4, iK);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iK)) + 0.5f));
            hj3Var2.K(i5, iK + i5);
            P(i2 + 1, hj3Var2, dobVar);
        }
    }

    public static zf8 N(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        vq7 vq7Var = new vq7(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
        int connectionState = mediaRoute2Info.getConnectionState();
        Bundle bundle = (Bundle) vq7Var.b;
        bundle.putInt("connectionState", connectionState);
        bundle.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
        bundle.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
        bundle.putInt("volume", mediaRoute2Info.getVolume());
        Bundle extras = mediaRoute2Info.getExtras();
        if (extras == null) {
            bundle.putBundle("extras", null);
        } else {
            bundle.putBundle("extras", new Bundle(extras));
        }
        bundle.putBoolean("enabled", true);
        bundle.putBoolean("canDisconnect", false);
        CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            bundle.putString("status", description.toString());
        }
        Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            bundle.putString("iconUri", iconUri.toString());
        }
        Bundle extras2 = mediaRoute2Info.getExtras();
        if (extras2 == null || !extras2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        Bundle bundle2 = extras2.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
        if (bundle2 == null) {
            bundle.putBundle("extras", null);
        } else {
            bundle.putBundle("extras", new Bundle(bundle2));
        }
        bundle.putInt("deviceType", extras2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        bundle.putInt("playbackType", extras2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            vq7Var.h(parcelableArrayList);
        }
        return vq7Var.k();
    }

    public static int O(int i2, byte[] bArr) {
        int i3;
        synchronized (d) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = e;
                    if (iArr.length <= i5) {
                        e = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    e[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = e[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static void P(int i2, hj3 hj3Var, dob dobVar) {
        oi3 oi3Var;
        oi3 oi3Var2;
        oi3 oi3Var3;
        oi3 oi3Var4;
        oi3 oi3Var5;
        if (hj3Var.n) {
            return;
        }
        if (!(hj3Var instanceof ij3) && hj3Var.z() && b(hj3Var)) {
            ij3.V(hj3Var, dobVar, new xk0(0));
        }
        oi3 oi3VarI = hj3Var.i(3);
        oi3 oi3VarI2 = hj3Var.i(5);
        int iD = oi3VarI.d();
        int iD2 = oi3VarI2.d();
        HashSet hashSet = oi3VarI.a;
        if (hashSet != null && oi3VarI.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                oi3 oi3Var6 = (oi3) it.next();
                hj3 hj3Var2 = oi3Var6.d;
                int i3 = i2 + 1;
                boolean zB = b(hj3Var2);
                if (hj3Var2.z() && zB) {
                    ij3.V(hj3Var2, dobVar, new xk0(0));
                }
                oi3 oi3Var7 = hj3Var2.J;
                oi3 oi3Var8 = hj3Var2.L;
                boolean z = (oi3Var6 == oi3Var7 && (oi3Var5 = oi3Var8.f) != null && oi3Var5.c) || (oi3Var6 == oi3Var8 && (oi3Var4 = oi3Var7.f) != null && oi3Var4.c);
                int i4 = hj3Var2.p0[1];
                if (i4 != 3 || zB) {
                    if (!hj3Var2.z()) {
                        if (oi3Var6 == oi3Var7 && oi3Var8.f == null) {
                            int iE = oi3Var7.e() + iD;
                            hj3Var2.K(iE, hj3Var2.k() + iE);
                            P(i3, hj3Var2, dobVar);
                        } else if (oi3Var6 == oi3Var8 && oi3Var7.f == null) {
                            int iE2 = iD - oi3Var8.e();
                            hj3Var2.K(iE2 - hj3Var2.k(), iE2);
                            P(i3, hj3Var2, dobVar);
                        } else if (z && !hj3Var2.y()) {
                            L(i3, hj3Var2, dobVar);
                        }
                    }
                } else if (i4 == 3 && hj3Var2.y >= 0 && hj3Var2.x >= 0 && (hj3Var2.g0 == 8 || (hj3Var2.s == 0 && hj3Var2.W == 0.0f))) {
                    if (!hj3Var2.y() && !hj3Var2.F && z && !hj3Var2.y()) {
                        M(i3, hj3Var, dobVar, hj3Var2);
                    }
                }
            }
        }
        if (hj3Var instanceof fh6) {
            return;
        }
        HashSet hashSet2 = oi3VarI2.a;
        if (hashSet2 != null && oi3VarI2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                oi3 oi3Var9 = (oi3) it2.next();
                hj3 hj3Var3 = oi3Var9.d;
                int i5 = i2 + 1;
                boolean zB2 = b(hj3Var3);
                if (hj3Var3.z() && zB2) {
                    ij3.V(hj3Var3, dobVar, new xk0(0));
                }
                oi3 oi3Var10 = hj3Var3.J;
                oi3 oi3Var11 = hj3Var3.L;
                boolean z2 = (oi3Var9 == oi3Var10 && (oi3Var3 = oi3Var11.f) != null && oi3Var3.c) || (oi3Var9 == oi3Var11 && (oi3Var2 = oi3Var10.f) != null && oi3Var2.c);
                int i6 = hj3Var3.p0[1];
                if (i6 != 3 || zB2) {
                    if (!hj3Var3.z()) {
                        if (oi3Var9 == oi3Var10 && oi3Var11.f == null) {
                            int iE3 = oi3Var10.e() + iD2;
                            hj3Var3.K(iE3, hj3Var3.k() + iE3);
                            P(i5, hj3Var3, dobVar);
                        } else if (oi3Var9 == oi3Var11 && oi3Var10.f == null) {
                            int iE4 = iD2 - oi3Var11.e();
                            hj3Var3.K(iE4 - hj3Var3.k(), iE4);
                            P(i5, hj3Var3, dobVar);
                        } else if (z2 && !hj3Var3.y()) {
                            L(i5, hj3Var3, dobVar);
                        }
                    }
                } else if (i6 == 3 && hj3Var3.y >= 0 && hj3Var3.x >= 0) {
                    if (hj3Var3.g0 != 8) {
                        if (hj3Var3.s == 0) {
                            if (hj3Var3.W == 0.0f) {
                            }
                        }
                    }
                    if (!hj3Var3.y() && !hj3Var3.F && z2 && !hj3Var3.y()) {
                        M(i5, hj3Var, dobVar, hj3Var3);
                    }
                }
            }
        }
        oi3 oi3VarI3 = hj3Var.i(6);
        if (oi3VarI3.a != null && oi3VarI3.c) {
            int iD3 = oi3VarI3.d();
            Iterator it3 = oi3VarI3.a.iterator();
            while (it3.hasNext()) {
                oi3 oi3Var12 = (oi3) it3.next();
                hj3 hj3Var4 = oi3Var12.d;
                int i7 = i2 + 1;
                boolean zB3 = b(hj3Var4);
                if (hj3Var4.z() && zB3) {
                    ij3.V(hj3Var4, dobVar, new xk0(0));
                }
                if (hj3Var4.p0[1] != 3 || zB3) {
                    if (!hj3Var4.z() && oi3Var12 == (oi3Var = hj3Var4.M)) {
                        int iE5 = oi3Var12.e() + iD3;
                        if (hj3Var4.E) {
                            int i8 = iE5 - hj3Var4.a0;
                            int i9 = hj3Var4.V + i8;
                            hj3Var4.Z = i8;
                            hj3Var4.J.l(i8);
                            hj3Var4.L.l(i9);
                            oi3Var.l(iE5);
                            hj3Var4.l = true;
                        }
                        P(i7, hj3Var4, dobVar);
                    }
                }
            }
        }
        hj3Var.n = true;
    }

    public static final Iterator Q(Iterator it, int i2, int i3, boolean z) {
        return !it.hasNext() ? mz4.a : m6d.u(new ctd(i2, i3, it, z, null));
    }

    public static String R(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append("@");
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string2), (Throwable) e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(name2.length() + string2.length() + 8 + 1);
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i3] = string;
            i3++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (iIndexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i4, iIndexOf);
            sb3.append(objArr[i2]);
            i4 = iIndexOf + 2;
            i2++;
        }
        sb3.append((CharSequence) str, i4, str.length());
        if (i2 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb3.append(", ");
                sb3.append(objArr[i5]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static final ma9 a(m07 m07Var, wz7 wz7Var) {
        long j2 = m07Var.a;
        String str = m07Var.b;
        String str2 = m07Var.c;
        String str3 = str2.length() == 0 ? null : str2;
        String str4 = m07Var.d;
        q07[] q07VarArr = m07Var.q;
        q07[] q07VarArr2 = (q07VarArr.length == 0) ^ true ? q07VarArr : null;
        String str5 = m07Var.p;
        String str6 = str5.length() == 0 ? null : str5;
        String str7 = m07Var.e;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = str7;
        long j3 = m07Var.f;
        int i2 = m07Var.g;
        int i3 = m07Var.h;
        boolean z = m07Var.i;
        boolean z2 = m07Var.j;
        boolean z3 = m07Var.k;
        long j4 = m07Var.l;
        long j5 = m07Var.m;
        Long lValueOf = j5 > 0 ? Long.valueOf(j5) : null;
        long j6 = m07Var.r;
        String str9 = m07Var.n;
        String str10 = str9.length() == 0 ? null : str9;
        byte[] bArr = m07Var.o;
        return new ma9(j2, str, str3, str4, q07VarArr2, str6, str8, j3, i2, i3, z, z2, z3, j4, lValueOf, j6, m07Var.s, str10, (bArr.length == 0) ^ true ? bArr : null, (CharSequence) wz7Var.invoke(m07Var), m07Var.t);
    }

    public static boolean b(hj3 hj3Var) {
        int[] iArr = hj3Var.p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        hj3 hj3Var2 = hj3Var.T;
        ij3 ij3Var = hj3Var2 != null ? (ij3) hj3Var2 : null;
        if (ij3Var != null) {
            int i4 = ij3Var.p0[0];
        }
        if (ij3Var != null) {
            int i5 = ij3Var.p0[1];
        }
        boolean z = i2 == 1 || hj3Var.A() || i2 == 2 || (i2 == 3 && hj3Var.r == 0 && hj3Var.W == 0.0f && hj3Var.t(0)) || (i2 == 3 && hj3Var.r == 1 && hj3Var.u(0, hj3Var.q()));
        boolean z2 = i3 == 1 || hj3Var.B() || i3 == 2 || (i3 == 3 && hj3Var.s == 0 && hj3Var.W == 0.0f && hj3Var.t(1)) || (i3 == 3 && hj3Var.s == 1 && hj3Var.u(1, hj3Var.k()));
        if (hj3Var.W <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    public static void c(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void g(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static final void h(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException((i2 != i3 ? wg0.h("Both size ", i2, " and step ", i3, " must be greater than zero.") : wg0.g(i2, "size ", " must be greater than zero.")).toString());
        }
    }

    public static void i(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int j(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static boolean k(String str) {
        HashMap map = zu3.c;
        vu3 vu3Var = (vu3) map.get(str);
        if (vu3Var == null) {
            return false;
        }
        vu3Var.a.a();
        map.remove(str);
        return true;
    }

    public static fjb l(Collection collection, jqe jqeVar, jqe jqeVar2) {
        return new fjb(jqeVar, jqeVar2, y53.M(new mg3(wea.A0, new eqe(yea.f2), 1, false), new mg3(wea.C0, new eqe(yea.g2), 2, false)), dy7.g(new kpa("profile:memberslist:ids_to_delete", x53.E0(collection))));
    }

    public static fjb m(Collection collection, jqe jqeVar, jqe jqeVar2) {
        return new fjb(jqeVar, jqeVar2, y53.M(new mg3(wea.B0, new eqe(yea.f2), 1, false), new mg3(wea.D0, new eqe(yea.h2), 1, false), new mg3(wea.C0, new eqe(yea.g2), 2, false)), dy7.g(new kpa("profile:memberslist:ids_to_delete", x53.E0(collection))));
    }

    public static final aof n(TextView textView) {
        aof aofVar = new aof(textView);
        textView.addTextChangedListener(aofVar);
        textView.addOnAttachStateChangeListener(aofVar);
        h2a h2aVar = textView instanceof h2a ? (h2a) textView : null;
        if (h2aVar != null) {
            h2aVar.setObserverSpanListener(aofVar);
        }
        return aofVar;
    }

    public static int o(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        f(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            i(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            i(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            i(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    i(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
    
        r1 = r4.getString("ControllerChangeHandler.className");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zu3 p(android.os.Bundle r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "ControllerChangeHandler.className"
            java.lang.String r1 = r4.getString(r1)
            if (r1 != 0) goto Ld
            return r0
        Ld:
            java.lang.String r2 = "ControllerChangeHandler.savedState"
            android.os.Bundle r4 = r4.getBundle(r2)
            if (r4 != 0) goto L16
            return r0
        L16:
            r2 = 1
            java.lang.Class r2 = defpackage.ema.j(r1, r2)     // Catch: java.lang.Exception -> L22
            if (r2 == 0) goto L24
            java.lang.Object r1 = r2.newInstance()     // Catch: java.lang.Exception -> L22
            goto L25
        L22:
            r4 = move-exception
            goto L2e
        L24:
            r1 = r0
        L25:
            zu3 r1 = (defpackage.zu3) r1
            if (r1 == 0) goto L2d
            r1.h(r4)
            r0 = r1
        L2d:
            return r0
        L2e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "An exception occurred while creating a new instance of "
            java.lang.String r3 = ". "
            java.lang.StringBuilder r1 = defpackage.au1.m(r2, r1, r3)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np8.p(android.os.Bundle):zu3");
    }

    public static ne5 q(String str) {
        ne5 ne5Var;
        ne5[] ne5VarArr = ne5.b;
        int length = ne5VarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                ne5Var = null;
                break;
            }
            ne5Var = ne5VarArr[i2];
            if (tpa.f(ne5Var.a, str)) {
                break;
            }
            i2++;
        }
        return ne5Var == null ? ne5.UNKNOWN : ne5Var;
    }

    public static /* synthetic */ mn5 r(y66 y66Var, lx3 lx3Var, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            lx3Var = hz4.a;
        }
        if ((i4 & 2) != 0) {
            i2 = -3;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return y66Var.e(lx3Var, i2, i3);
    }

    public static Field s() throws NoSuchFieldException, SecurityException {
        if (l == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            l = declaredField;
            declaredField.setAccessible(true);
        }
        return l;
    }

    public static int t() throws NoSuchFieldException, SecurityException {
        if (n == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            n = Integer.valueOf(declaredField.getInt(null));
        }
        return n.intValue();
    }

    public static int u() throws NoSuchFieldException, SecurityException {
        if (m == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            m = Integer.valueOf(declaredField.getInt(null));
        }
        return m.intValue();
    }

    public static int v() throws NoSuchFieldException, SecurityException {
        if (o == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            o = Integer.valueOf(declaredField.getInt(null));
        }
        return o.intValue();
    }

    public static int w(String str) {
        int iG = ia9.g(str);
        if (iG == 4) {
            return 2;
        }
        return iG;
    }

    public static ArrayList x(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoI = c4.i(it.next());
            if (mediaRoute2InfoI != null) {
                arrayList.add(mediaRoute2InfoI.getId());
            }
        }
        return arrayList;
    }

    public static Matrix y(jt jtVar, jt jtVar2, int i2) {
        int iS = au1.s(i2);
        int i3 = jtVar.c;
        int i4 = jtVar.b;
        int i5 = jtVar2.c;
        int i6 = jtVar2.b;
        if (iS == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(i4 / i6, i3 / i5, 0.0f, 0.0f);
            return matrix;
        }
        if (iS == 1) {
            float f2 = i6 / i4;
            float f3 = i5;
            float f4 = f3 / i3;
            float fMin = Math.min(f2, f4);
            Matrix matrix2 = new Matrix();
            matrix2.setScale(fMin / f2, fMin / f4, i6 / 2.0f, f3 / 2.0f);
            return matrix2;
        }
        if (iS != 2) {
            throw new IllegalArgumentException("Unknown scale type = ".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "CENTER_CROP" : "FIT_CENTER" : "NONE"));
        }
        float f5 = i6 / i4;
        float f6 = i5;
        float f7 = f6 / i3;
        float fMax = Math.max(f5, f7);
        Matrix matrix3 = new Matrix();
        matrix3.setScale(fMax / f5, fMax / f7, i6 / 2.0f, f6 / 2.0f);
        return matrix3;
    }

    public static void z(int i2, hj3 hj3Var, dob dobVar, boolean z) {
        oi3 oi3Var;
        oi3 oi3Var2;
        oi3 oi3Var3;
        oi3 oi3Var4;
        if (hj3Var.m) {
            return;
        }
        if (!(hj3Var instanceof ij3) && hj3Var.z() && b(hj3Var)) {
            ij3.V(hj3Var, dobVar, new xk0(0));
        }
        oi3 oi3VarI = hj3Var.i(2);
        oi3 oi3VarI2 = hj3Var.i(4);
        int iD = oi3VarI.d();
        int iD2 = oi3VarI2.d();
        HashSet hashSet = oi3VarI.a;
        char c2 = 0;
        if (hashSet != null && oi3VarI.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                oi3 oi3Var5 = (oi3) it.next();
                hj3 hj3Var2 = oi3Var5.d;
                int i3 = i2 + 1;
                boolean zB = b(hj3Var2);
                if (hj3Var2.z() && zB) {
                    ij3.V(hj3Var2, dobVar, new xk0(0));
                }
                oi3 oi3Var6 = hj3Var2.I;
                oi3 oi3Var7 = hj3Var2.K;
                char c3 = ((oi3Var5 == oi3Var6 && (oi3Var4 = oi3Var7.f) != null && oi3Var4.c) || (oi3Var5 == oi3Var7 && (oi3Var3 = oi3Var6.f) != null && oi3Var3.c)) ? (char) 1 : c2;
                int i4 = hj3Var2.p0[c2];
                if (i4 != 3 || zB) {
                    if (!hj3Var2.z()) {
                        if (oi3Var5 == oi3Var6 && oi3Var7.f == null) {
                            int iE = oi3Var6.e() + iD;
                            hj3Var2.J(iE, hj3Var2.q() + iE);
                            z(i3, hj3Var2, dobVar, z);
                        } else if (oi3Var5 == oi3Var7 && oi3Var6.f == null) {
                            int iE2 = iD - oi3Var7.e();
                            hj3Var2.J(iE2 - hj3Var2.q(), iE2);
                            z(i3, hj3Var2, dobVar, z);
                        } else if (c3 != 0 && !hj3Var2.x()) {
                            J(i3, hj3Var2, dobVar, z);
                        }
                    }
                } else if (i4 == 3 && hj3Var2.v >= 0 && hj3Var2.u >= 0 && ((hj3Var2.g0 == 8 || (hj3Var2.r == 0 && hj3Var2.W == 0.0f)) && !hj3Var2.x() && !hj3Var2.F && c3 != 0 && !hj3Var2.x())) {
                    K(i3, hj3Var, dobVar, hj3Var2, z);
                }
                c2 = 0;
            }
        }
        if (hj3Var instanceof fh6) {
            return;
        }
        HashSet hashSet2 = oi3VarI2.a;
        if (hashSet2 != null && oi3VarI2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                oi3 oi3Var8 = (oi3) it2.next();
                hj3 hj3Var3 = oi3Var8.d;
                int i5 = i2 + 1;
                boolean zB2 = b(hj3Var3);
                if (hj3Var3.z() && zB2) {
                    ij3.V(hj3Var3, dobVar, new xk0(0));
                }
                oi3 oi3Var9 = hj3Var3.I;
                oi3 oi3Var10 = hj3Var3.K;
                boolean z2 = (oi3Var8 == oi3Var9 && (oi3Var2 = oi3Var10.f) != null && oi3Var2.c) || (oi3Var8 == oi3Var10 && (oi3Var = oi3Var9.f) != null && oi3Var.c);
                int i6 = hj3Var3.p0[0];
                if (i6 != 3 || zB2) {
                    if (!hj3Var3.z()) {
                        if (oi3Var8 == oi3Var9 && oi3Var10.f == null) {
                            int iE3 = oi3Var9.e() + iD2;
                            hj3Var3.J(iE3, hj3Var3.q() + iE3);
                            z(i5, hj3Var3, dobVar, z);
                        } else if (oi3Var8 == oi3Var10 && oi3Var9.f == null) {
                            int iE4 = iD2 - oi3Var10.e();
                            hj3Var3.J(iE4 - hj3Var3.q(), iE4);
                            z(i5, hj3Var3, dobVar, z);
                        } else if (z2 && !hj3Var3.x()) {
                            J(i5, hj3Var3, dobVar, z);
                        }
                    }
                } else if (i6 == 3 && hj3Var3.v >= 0 && hj3Var3.u >= 0) {
                    if (hj3Var3.g0 != 8) {
                        if (hj3Var3.r == 0) {
                            if (hj3Var3.W == 0.0f) {
                            }
                        }
                    }
                    if (!hj3Var3.x() && !hj3Var3.F && z2 && !hj3Var3.x()) {
                        K(i5, hj3Var, dobVar, hj3Var3, z);
                    }
                }
            }
        }
        hj3Var.m = true;
    }
}
