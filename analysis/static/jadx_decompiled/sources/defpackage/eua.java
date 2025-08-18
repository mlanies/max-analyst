package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class eua {
    public static final String[] d = {"android.permission.READ_CONTACTS", "android.permission.GET_ACCOUNTS"};
    public static final String[] e = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.GET_ACCOUNTS"};
    public static final String[] f = {"android.permission.READ_CONTACTS"};
    public static final String[] g = {"android.permission.WRITE_CONTACTS"};
    public static final String[] h = {"android.permission.RECORD_AUDIO"};
    public static final String[] i = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE"};
    public static final String[] j = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public static final String[] k = {"android.permission.POST_NOTIFICATIONS"};
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final String[] o;
    public static final String[] p;
    public final Context a;
    public final acf b;
    public final imc c;

    static {
        String[] strArr;
        String[] strArr2 = {"android.permission.CAMERA"};
        l = strArr2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        } else if (i2 >= 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
        } else {
            uuc.a.getClass();
            strArr = tuc.c;
        }
        m = strArr;
        int length = strArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, length + 1);
        System.arraycopy(strArr2, 0, objArrCopyOf, length, 1);
        n = (String[]) objArrCopyOf;
        o = new String[]{"android.permission.USE_FULL_SCREEN_INTENT"};
        p = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
    }

    public eua(Context context, acf acfVar) {
        this.a = context;
        this.b = acfVar;
        this.c = new imc(context, 29);
    }

    public static boolean i(l5g l5gVar, String[] strArr) {
        for (String str : strArr) {
            if (l5gVar.f(str)) {
                return true;
            }
        }
        return false;
    }

    public static void j(l5g l5gVar, String[] strArr, int[] iArr, int i2, int i3) {
        int i4;
        zs zsVar = new zs(2, new ie(1, strArr));
        int iZ = mz7.Z(z53.S(zsVar, 10));
        if (iZ < 16) {
            iZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iZ);
        Iterator it = zsVar.iterator();
        while (true) {
            ms4 ms4Var = (ms4) it;
            boolean z = false;
            if (!ms4Var.b.hasNext()) {
                break;
            }
            yz6 yz6Var = (yz6) ms4Var.next();
            int i5 = yz6Var.a;
            String str = (String) yz6Var.b;
            if (iArr[i5] == 0) {
                z = true;
            }
            linkedHashMap.put(str, Boolean.valueOf(z));
        }
        Object obj = linkedHashMap.get("android.permission.READ_MEDIA_VIDEO");
        Boolean bool = Boolean.TRUE;
        if ((tpa.f(obj, bool) && tpa.f(linkedHashMap.get("android.permission.READ_MEDIA_IMAGES"), bool)) || tpa.f(linkedHashMap.get("android.permission.READ_MEDIA_VISUAL_USER_SELECTED"), bool)) {
            return;
        }
        uuc.a.getClass();
        for (String str2 : tuc.c) {
            if (!tpa.f(linkedHashMap.get("android.permission.READ_MEDIA_VIDEO"), Boolean.TRUE)) {
                l5gVar.g(i2, i3);
                return;
            }
        }
    }

    public static boolean k(l5g l5gVar, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3) {
        for (String str : strArr2) {
            int iG0 = ys.g0(strArr, str);
            Integer numValueOf = Integer.valueOf(iG0);
            if (iG0 < 0) {
                numValueOf = null;
            }
            if (numValueOf == null || iArr[numValueOf.intValue()] != 0) {
                if (i(l5gVar, strArr2)) {
                    hm9.n("eua", "some permissions denied");
                } else {
                    l5gVar.g(i2, i3);
                    hm9.n("eua", "some permissions denied forever");
                }
                return false;
            }
        }
        hm9.n("eua", "all permissions granted");
        return true;
    }

    public static /* synthetic */ boolean l(eua euaVar, l5g l5gVar, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3) {
        euaVar.getClass();
        return k(l5gVar, strArr, iArr, strArr2, i2, i3);
    }

    public final boolean a(boolean z, l5g l5gVar) {
        if (b(i)) {
            return true;
        }
        String[] strArr = h;
        if (!z && b(strArr)) {
            return true;
        }
        if (z) {
            String[] strArr2 = l;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, 2);
            System.arraycopy(strArr2, 0, objArrCopyOf, 1, 1);
            f(l5gVar, (String[]) objArrCopyOf, 178);
        } else {
            f(l5gVar, strArr, 178);
        }
        return false;
    }

    public final boolean b(String[] strArr) {
        for (String str : strArr) {
            if (z7.c(this.a, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        if (!b(m)) {
            if (!(Build.VERSION.SDK_INT >= 34 ? b(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"}) : false)) {
                return false;
            }
        }
        return true;
    }

    public final void d(l5g l5gVar, String[] strArr, int i2, int i3, int i4, int i5) {
        imc imcVar = this.c;
        imcVar.getClass();
        int length = strArr.length;
        boolean z = false;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                z = true;
                break;
            }
            if (!((SharedPreferences) ((khe) imcVar.c).getValue()).getBoolean(strArr[i6].concat("_req"), false)) {
                break;
            } else {
                i6++;
            }
        }
        if ((!z) || i(l5gVar, strArr)) {
            l5gVar.c(strArr, i2, i4, i3, i5);
        } else {
            f(l5gVar, strArr, i2);
        }
    }

    public final void e(l5g l5gVar) {
        d(l5gVar, e, 156, j1c.permissions_contacts_request_rationale, j1c.permissions_contacts_request, j1c.permissions_dialog_enable_access);
    }

    public final void f(l5g l5gVar, String[] strArr, int i2) {
        l5gVar.e(i2, strArr);
        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((khe) this.c.c).getValue()).edit();
        for (String str : strArr) {
            editorEdit.putBoolean(str + "_req", true);
        }
        editorEdit.apply();
    }

    public final void g(l5g l5gVar) {
        String[] strArr = l;
        int i2 = j1c.permissions_camera_request_photo;
        int i3 = oga.a;
        int i4 = oga.g;
        if (i(l5gVar, strArr)) {
            l5gVar.c(strArr, 158, i3, i2, i4);
        } else {
            f(l5gVar, strArr, 158);
        }
    }

    public final void h(l5g l5gVar) {
        String[] strArr = l;
        int i2 = j1c.permissions_camera_request_video;
        int i3 = oga.a;
        int i4 = oga.g;
        if (i(l5gVar, strArr)) {
            l5gVar.c(strArr, 159, i3, i2, i4);
        } else {
            f(l5gVar, strArr, 159);
        }
    }
}
