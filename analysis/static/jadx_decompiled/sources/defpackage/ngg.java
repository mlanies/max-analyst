package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.util.Property;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class ngg {
    public static final pz2 a = new pz2(21);
    public static final ai0 b = new ai0(15);
    public static final Object c = new Object();

    public static final ArrayList A(int i) {
        j37 j37Var = new j37(i, 59, 1);
        ArrayList arrayList = new ArrayList(z53.S(j37Var, 10));
        Iterator it = j37Var.iterator();
        while (((i37) it).c) {
            arrayList.add(new qte(((i37) it).a()));
        }
        return arrayList;
    }

    public static Set B() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static cj6 C(String... strArr) throws CloneNotSupportedException {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
        Object objClone = strArr.clone();
        if (objClone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        String[] strArr2 = (String[]) objClone;
        int length = strArr2.length;
        for (int i = 0; i < length; i++) {
            String str = strArr2[i];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null".toString());
            }
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            strArr2[i] = w9e.b1(str).toString();
        }
        h37 h37VarX = ote.X(new j37(0, strArr2.length - 1, 1), 2);
        int i2 = h37VarX.a;
        int i3 = h37VarX.b;
        int i4 = h37VarX.c;
        if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
            while (true) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                l(str2);
                n(str3, str2);
                if (i2 == i3) {
                    break;
                }
                i2 += i4;
            }
        }
        return new cj6(strArr2);
    }

    public static void D(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                j47.Z(new IllegalStateException(ey8.h(j3, "More produced than requested: ")));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    public static int E(int i, yaf yafVar) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return yafVar.v() + 1;
            case 7:
                return yafVar.A() + 1;
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

    public static final kl7 F(View view, float f, float f2, long j, long j2) {
        kl7 kl7VarL = j1e.l();
        kl7VarL.add(e(view, View.SCALE_X, f, f2, j, j2, 96));
        kl7VarL.add(e(view, View.SCALE_Y, f, f2, j, j2, 96));
        return j1e.d(kl7VarL);
    }

    public static final void G(Drawable drawable, int i) {
        if (drawable != null) {
            aq4.g(drawable, i);
            aq4.i(drawable, PorterDuff.Mode.SRC_IN);
        }
    }

    public static final void H(ProgressBar progressBar, int i) {
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            indeterminateDrawable = progressBar.getProgressDrawable();
        }
        if (indeterminateDrawable != null) {
            G(indeterminateDrawable, i);
        }
    }

    public static ArrayList I(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(Long.valueOf(jSONArray.getLong(i)));
            }
            return arrayList;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static RectF J(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i = 1; i < fArr.length; i += 2) {
            float fRound = Math.round(fArr[i - 1] * 10.0f) / 10.0f;
            float fRound2 = Math.round(fArr[i] * 10.0f) / 10.0f;
            float f = rectF.left;
            if (fRound < f) {
                f = fRound;
            }
            rectF.left = f;
            float f2 = rectF.top;
            if (fRound2 < f2) {
                f2 = fRound2;
            }
            rectF.top = f2;
            float f3 = rectF.right;
            if (fRound <= f3) {
                fRound = f3;
            }
            rectF.right = fRound;
            float f4 = rectF.bottom;
            if (fRound2 <= f4) {
                fRound2 = f4;
            }
            rectF.bottom = fRound2;
        }
        rectF.sort();
        return rectF;
    }

    public static final void K(y5f y5fVar) {
        y5fVar.c(b64.class, new xsf(1));
    }

    public static void L(String str, Writer writer) throws IOException {
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\\' || cCharAt == '\"' || cCharAt <= 31) {
                if (i2 > i) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(92);
                if (cCharAt == '\f') {
                    writer.write(HttpStatus.SC_PROCESSING);
                } else if (cCharAt == '\r') {
                    writer.write(114);
                } else if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            writer.write(98);
                            break;
                        case '\t':
                            writer.write(116);
                            break;
                        case '\n':
                            writer.write(110);
                            break;
                        default:
                            writer.write(117);
                            writer.write(z7.F((cCharAt >> '\f') & 15));
                            writer.write(z7.F((cCharAt >> '\b') & 15));
                            writer.write(z7.F((cCharAt >> 4) & 15));
                            writer.write(z7.F(cCharAt & 15));
                            break;
                    }
                } else {
                    writer.write(cCharAt);
                }
                i = i2 + 1;
            }
        }
        if (length > i) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    public static Parcelable M(String str, Bundle bundle) {
        ClassLoader classLoader = ngg.class.getClassLoader();
        fp3.n(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void N(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable parcelableM = M("MapOptions", bundle);
        if (parcelableM != null) {
            O(bundle2, "MapOptions", parcelableM);
        }
        Parcelable parcelableM2 = M("StreetViewPanoramaOptions", bundle);
        if (parcelableM2 != null) {
            O(bundle2, "StreetViewPanoramaOptions", parcelableM2);
        }
        Parcelable parcelableM3 = M("camera", bundle);
        if (parcelableM3 != null) {
            O(bundle2, "camera", parcelableM3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void O(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = ngg.class.getClassLoader();
        fp3.n(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    public static ua3 a() {
        return new ua3(null);
    }

    public static long b(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, c(j2, j)));
        return j2;
    }

    public static long c(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static final ObjectAnimator d(View view, Property property, float f, float f2, long j, long j2, int i, int i2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f, f2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setRepeatMode(i);
        objectAnimatorOfFloat.setRepeatCount(i2);
        return objectAnimatorOfFloat;
    }

    public static /* synthetic */ ObjectAnimator e(View view, Property property, float f, float f2, long j, long j2, int i) {
        return d(view, property, f, f2, j, (i & 16) != 0 ? 0L : j2, 1, 0);
    }

    public static void f(sme smeVar, TextView textView, int i) {
        int i2 = smeVar.k;
        int i3 = smeVar.l;
        textView.setBackground(hm9.f(i2, smeVar.i, ote.b0(i2, 0.3f), i));
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{-16842910}, new int[0]}, new int[]{i3, i3, i3}));
    }

    public static final void g(sme smeVar, Menu menu, Integer num) {
        if (menu == null) {
            return;
        }
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            Drawable icon = menu.getItem(i).getIcon();
            if (icon != null) {
                G(icon, num != null ? num.intValue() : smeVar.w);
            }
        }
    }

    public static final void h(sme smeVar, SwitchCompat switchCompat) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        switchCompat.setTextColor(smeVar.F);
        if (smeVar.equals(ee4.e0) || (num = smeVar.W) == null || (num2 = smeVar.V) == null || (num3 = smeVar.Y) == null || (num4 = smeVar.X) == null) {
            return;
        }
        switchCompat.setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{num.intValue(), num2.intValue()}));
        switchCompat.setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{num3.intValue(), num4.intValue()}));
    }

    public static final void i(sme smeVar, Toolbar toolbar, TextView textView, TextView textView2, int i, int i2) {
        if (toolbar != null) {
            toolbar.setPopupTheme(smeVar.j);
            toolbar.setBackgroundColor(smeVar.N);
            Drawable navigationIcon = toolbar.getNavigationIcon();
            int i3 = smeVar.w;
            if (navigationIcon != null) {
                navigationIcon.mutate();
                navigationIcon.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
            }
            Drawable overflowIcon = toolbar.getOverflowIcon();
            if (overflowIcon != null) {
                G(overflowIcon, i3);
            }
            try {
                Field declaredField = Toolbar.class.getDeclaredField("t0");
                declaredField.setAccessible(true);
                ((Drawable) declaredField.get(toolbar)).mutate().setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
            } catch (Exception e) {
                hm9.p("ThemeHelper", "applyToToolbar: ", e);
            }
        }
        if (textView != null) {
            textView.setTextColor(i);
        }
        if (textView2 != null) {
            textView2.setTextColor(i2);
        }
    }

    public static int j(int i) {
        if (i < 3) {
            wmd.i(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean k(defpackage.yaf r20, defpackage.qm5 r21, int r22, defpackage.lh4 r23) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngg.k(yaf, qm5, int, lh4):boolean");
    }

    public static void l(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty".toString());
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || '~' < cCharAt) {
                throw new IllegalArgumentException(naf.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static int m(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strD = fp.d(str);
        if (strD != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
                AppOpsManager appOpsManagerC = gp.c(context);
                iC = gp.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                if (iC == 0) {
                    iC = gp.a(appOpsManagerC, strD, iMyUid, gp.b(context));
                }
            } else {
                iC = fp.c((AppOpsManager) fp.a(context, AppOpsManager.class), strD, packageName);
            }
            if (iC != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static void n(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || '~' < cCharAt)) {
                StringBuilder sb = new StringBuilder();
                sb.append(naf.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                sb.append(naf.p(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static e0a o(OneMeRoomDatabase oneMeRoomDatabase, String[] strArr, Callable callable) {
        int i = 0;
        Executor executor = oneMeRoomDatabase.b;
        if (executor == null) {
            executor = null;
        }
        trd trdVar = muc.a;
        f55 f55Var = new f55(executor, false);
        t28 t28Var = new t28(callable);
        return new e0a(new s1a(new hb3(2, new ypc(strArr, i, oneMeRoomDatabase)).r(f55Var), f55Var, 1).n(f55Var), new yt8(29, t28Var), i);
    }

    public static final void p(k36 k36Var) {
        kl7 kl7VarL = j1e.l();
        Cursor cursorQ0 = k36Var.q0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorQ0.moveToNext()) {
            try {
                kl7VarL.add(cursorQ0.getString(0));
            } finally {
            }
        }
        v3c.i(cursorQ0, null);
        ListIterator listIterator = j1e.d(kl7VarL).listIterator(0);
        while (true) {
            il7 il7Var = (il7) listIterator;
            if (!il7Var.hasNext()) {
                return;
            }
            String str = (String) il7Var.next();
            if (eae.o0(str, "room_fts_content_sync_", false)) {
                k36Var.U("DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static boolean q(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean r(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static ybd s(Set set, a7b a7bVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof ybd)) {
                set.getClass();
                return new ybd(set, a7bVar);
            }
            ybd ybdVar = (ybd) set;
            a7b a7bVar2 = ybdVar.b;
            a7bVar2.getClass();
            return new ybd((Set) ybdVar.a, new e7b(Arrays.asList(a7bVar2, a7bVar)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof ybd)) {
            set2.getClass();
            return new zbd(set2, a7bVar);
        }
        ybd ybdVar2 = (ybd) set2;
        a7b a7bVar3 = ybdVar2.b;
        a7bVar3.getClass();
        return new zbd((SortedSet) ybdVar2.a, new e7b(Arrays.asList(a7bVar3, a7bVar)));
    }

    public static float[] t(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        return new float[]{f, f2, f3, f2, f3, f4, f, f4};
    }

    public static final Drawable u(int i, int i2, Context context) {
        Drawable drawableB = kt3.b(context, i);
        if (drawableB == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Drawable drawableMutate = drawableB.mutate();
        G(drawableMutate, i2);
        return drawableMutate;
    }

    public static int v(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static final ArrayList w(int i) {
        j37 j37Var = new j37(i, 23, 1);
        ArrayList arrayList = new ArrayList(z53.S(j37Var, 10));
        Iterator it = j37Var.iterator();
        while (((i37) it).c) {
            arrayList.add(new qte(((i37) it).a()));
        }
        return arrayList;
    }

    public static int x(Integer num) {
        int iIntValue = num.intValue();
        int[] iArrV = au1.v(9);
        int length = iArrV.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = iArrV[i2];
            if (au1.s(i3) == iIntValue) {
                i = i3;
                break;
            }
            i2++;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public static xbd y(Set set, jx6 jx6Var) {
        z04.l(set, "set1");
        z04.l(jx6Var, "set2");
        return new xbd(set, jx6Var);
    }

    public static boolean z(dx1 dx1Var, String str) throws InitializationException {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) dx1Var.a(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(new CameraUnavailableException(e));
        }
    }
}
