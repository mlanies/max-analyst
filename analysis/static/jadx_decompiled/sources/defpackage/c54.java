package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import androidx.media3.common.ParserException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.camerax.vms.processor.VideoMessageProcessorException;
import one.me.sdk.richvector.VectorPath;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

/* loaded from: classes.dex */
public abstract class c54 {
    public static t4f d;
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Object c = new Object();
    public static final Object e = new Object();

    public static void A(yg7 yg7Var, Bundle bundle) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        if (bundle == null) {
            return;
        }
        xg7 xg7VarC = yg7Var.getL1();
        t9e t9eVar = (t9e) bundle.getParcelable("LifecycleHandler.permissionRequests");
        if (t9eVar == null || (sparseArray = t9eVar.a) == null) {
            sparseArray = new SparseArray();
        }
        xg7VarC.g = sparseArray;
        xg7 xg7VarC2 = yg7Var.getL1();
        t9e t9eVar2 = (t9e) bundle.getParcelable("LifecycleHandler.activityRequests");
        if (t9eVar2 == null || (sparseArray2 = t9eVar2.a) == null) {
            sparseArray2 = new SparseArray();
        }
        xg7VarC2.h = sparseArray2;
        xg7 xg7VarC3 = yg7Var.getL1();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("LifecycleHandler.pendingPermissionRequests");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        xg7VarC3.i = parcelableArrayList;
    }

    public static void B(yg7 yg7Var) {
        Activity activity = yg7Var.getL1().b;
        if (activity != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(yg7Var);
            zg7.a.remove(activity);
            r(yg7Var, false);
            yg7Var.getL1().b = null;
        }
        yg7Var.getL1().j.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean C(defpackage.yg7 r1, android.view.MenuItem r2, defpackage.k56 r3) {
        /*
            java.util.List r1 = w(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            goto L22
        Lb:
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.next()
            b8 r0 = (defpackage.b8) r0
            boolean r0 = r0.w(r2)
            if (r0 == 0) goto Lf
            goto L2e
        L22:
            java.lang.Object r1 = r3.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L30
        L2e:
            r1 = 1
            goto L31
        L30:
            r1 = 0
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c54.C(yg7, android.view.MenuItem, k56):boolean");
    }

    public static void D(yg7 yg7Var, int i, String[] strArr, int[] iArr) {
        String str = (String) yg7Var.getL1().g.get(i);
        if (str != null) {
            Iterator it = w(yg7Var).iterator();
            while (it.hasNext()) {
                uu3 uu3VarF = ((b8) it.next()).f(str);
                if (uu3VarF != null) {
                    uu3VarF.requestPermissionsResult(i, strArr, iArr);
                }
            }
        }
    }

    public static void E(yg7 yg7Var, Bundle bundle) {
        bundle.putParcelable("LifecycleHandler.permissionRequests", new t9e(yg7Var.getL1().g));
        bundle.putParcelable("LifecycleHandler.activityRequests", new t9e(yg7Var.getL1().h));
        bundle.putParcelableArrayList("LifecycleHandler.pendingPermissionRequests", yg7Var.getL1().i);
    }

    public static void F(yg7 yg7Var, Activity activity, wg7 wg7Var) {
        yg7Var.getL1().b = activity;
        if (yg7Var.getL1().c) {
            return;
        }
        yg7Var.getL1().c = true;
        activity.getApplication().registerActivityLifecycleCallbacks(yg7Var);
        zg7.a.put(activity, wg7Var);
    }

    public static void G(yg7 yg7Var, String str, String[] strArr, int i) {
        if (!yg7Var.getL1().e) {
            yg7Var.getL1().i.add(new vsa(str, strArr, i));
        } else {
            yg7Var.getL1().g.put(i, str);
            yg7Var.requestPermissions(strArr, i);
        }
    }

    public static void H(yg7 yg7Var, String str) {
        int size = yg7Var.getL1().h.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (str.equals(yg7Var.getL1().h.get(yg7Var.getL1().h.keyAt(size)))) {
                yg7Var.getL1().h.removeAt(size);
            }
        }
    }

    public static final boolean I(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        Iterable j37Var = new j37(0, bArr2.length - 1, 1);
        if (!(j37Var instanceof Collection) || !((Collection) j37Var).isEmpty()) {
            Iterator it = j37Var.iterator();
            while (((i37) it).c) {
                int iA = ((i37) it).a();
                if (bArr[i + iA] != bArr2[iA]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean J(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static final boolean K(View view) {
        return view.getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static final void L(int i, int i2, int i3, int i4, View view, View view2) {
        if (K(view)) {
            view.layout(view2.getMeasuredWidth() - i3, i2, view2.getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    public static int M(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int N(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final List O(pua puaVar) throws IOException {
        Object next;
        List arrayList = puaVar.f;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Long) next).longValue() > 0) {
                break;
            }
        }
        if (next == null) {
            List<String> list = puaVar.e;
            arrayList = new ArrayList(z53.S(list, 10));
            for (String str : list) {
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                Long lF0 = dae.f0(sb.toString());
                arrayList.add(Long.valueOf(lF0 != null ? lF0.longValue() : 0L));
            }
        }
        return arrayList;
    }

    public static void P(yg7 yg7Var, Activity activity) {
        if (zg7.a(activity, yg7Var.getL1().a) == yg7Var) {
            yg7Var.getL1().b = activity;
            Iterator it = x53.D0(yg7Var.getL1().j.values()).iterator();
            while (it.hasNext()) {
                ((b8) it.next()).u();
            }
        }
    }

    public static void Q(yg7 yg7Var, Activity activity) {
        if (yg7Var.getL1().b == activity) {
            Iterator it = w(yg7Var).iterator();
            while (it.hasNext()) {
                ((b8) it.next()).q(activity);
            }
        }
    }

    public static void R(yg7 yg7Var, Activity activity) {
        if (yg7Var.getL1().b == activity) {
            Iterator it = w(yg7Var).iterator();
            while (it.hasNext()) {
                ((b8) it.next()).r(activity);
            }
        }
    }

    public static void S(yg7 yg7Var, Activity activity, Bundle bundle) {
        if (yg7Var.getL1().b == activity) {
            X(yg7Var);
            for (b8 b8Var : w(yg7Var)) {
                Bundle bundle2 = new Bundle();
                b8Var.O(bundle2);
                StringBuilder sb = new StringBuilder("LifecycleHandler.routerState");
                ViewGroup viewGroup = b8Var.i;
                sb.append(viewGroup != null ? viewGroup.getId() : 0);
                bundle.putBundle(sb.toString(), bundle2);
            }
        }
    }

    public static void T(yg7 yg7Var, Activity activity) {
        if (yg7Var.getL1().b == activity) {
            yg7Var.getL1().f = false;
            Iterator it = w(yg7Var).iterator();
            while (it.hasNext()) {
                ((b8) it.next()).s(activity);
            }
        }
    }

    public static void U(yg7 yg7Var, Activity activity) {
        if (yg7Var.getL1().b == activity) {
            X(yg7Var);
            Iterator it = w(yg7Var).iterator();
            while (it.hasNext()) {
                ((b8) it.next()).t(activity);
            }
        }
    }

    public static void V(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final void W(BottomSheetWidget bottomSheetWidget, String str, a66 a66Var) {
        vj7 vj7Var = (vj7) ehd.a.getAccessor().d(vj7.class).getValue();
        vj7Var.getClass();
        a66Var.invoke(new t03(new m58(vj7Var.e(Uri.parse(str)), 17), 11), new l(22, bottomSheetWidget));
    }

    public static void X(yg7 yg7Var) {
        if (yg7Var.getL1().f) {
            return;
        }
        yg7Var.getL1().f = true;
        Iterator it = w(yg7Var).iterator();
        while (it.hasNext()) {
            ((b8) it.next()).F();
        }
    }

    public static View Y(Context context, yka ykaVar, ala alaVar) {
        if (ykaVar instanceof vka) {
            OneMeButton oneMeButton = new OneMeButton(context, null);
            oneMeButton.d(Integer.valueOf(((vka) ykaVar).a), true);
            tu0.K(oneMeButton, 300L, new elb(10, ykaVar));
            return oneMeButton;
        }
        if (!(ykaVar instanceof wka)) {
            if (!(ykaVar instanceof xka)) {
                if (ykaVar == null) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            eha ehaVar = new eha(context);
            ehaVar.setPadding(0, 0, 0, 0);
            ehaVar.setListener(new cjg(ehaVar, alaVar, ykaVar));
            return ehaVar;
        }
        wka wkaVar = (wka) ykaVar;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(kt3.b(context, wkaVar.a));
        int iG = tu0.G(wkaVar.b * fk4.d().getDisplayMetrics().density);
        imageView.setPadding(iG, iG, iG, iG);
        float f = 32;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        imageView.setOutlineProvider(new ix3(wkaVar.c * fk4.d().getDisplayMetrics().density));
        tu0.K(imageView, 300L, new elb(11, wkaVar));
        return imageView;
    }

    public static final void Z(ubf ubfVar, String str, int i) {
        VectorPath vectorPathFindPath = ubfVar.findPath(str);
        if (vectorPathFindPath != null) {
            vectorPathFindPath.setFillColor(i);
            ubfVar.invalidatePath();
        }
    }

    public static final t4f a(Context context) {
        t4f t4fVar;
        t4f t4fVar2 = d;
        if (t4fVar2 != null) {
            return t4fVar2;
        }
        synchronized (e) {
            t4fVar = new t4f();
            d = t4fVar;
        }
        return t4fVar;
    }

    public static final String a0(Continuation continuation) {
        Object njcVar;
        if (continuation instanceof DispatchedContinuation) {
            return ((DispatchedContinuation) continuation).toString();
        }
        try {
            njcVar = continuation + '@' + u(continuation);
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (pjc.a(njcVar) != null) {
            njcVar = continuation.getClass().getName() + '@' + u(continuation);
        }
        return (String) njcVar;
    }

    public static void b(Appendable appendable, Object obj, m56 m56Var) {
        if (m56Var != null) {
            appendable.append((CharSequence) m56Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    public static final void c(View view) {
        char c2 = view.getContext().getResources().getConfiguration().getLayoutDirection() != 1 ? (char) 2 : (char) 1;
        int i = 1;
        if (c2 != 1) {
            if (c2 != 2) {
                throw null;
            }
            i = 0;
        }
        view.setLayoutDirection(i);
    }

    public static boolean d(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : bundle2 == null ? bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
    }

    public static final byte[] e(String str) {
        try {
            return str.getBytes(Charset.forName(HTTP.ASCII));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = g(r9, r10, r11)
            boolean r1 = g(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = M(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c54.f(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean g(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static Uri h(String str, String str2, String str3) {
        Uri.Builder builderEncodedPath = new Uri.Builder().scheme(str2).encodedAuthority(str3).encodedPath(w9e.W0(str, "?").toLowerCase(Locale.ROOT));
        StringBuilder sb = new StringBuilder();
        int iA0 = w9e.A0(str, "?", 0, false, 6);
        String strSubstring = iA0 == -1 ? "" : str.substring(iA0 + 1, str.length());
        int length = strSubstring.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strSubstring.charAt(i2) == '=') {
                j37 j37VarY = ote.Y(i, i2);
                sb.append(strSubstring.substring(j37VarY.a, j37VarY.b + 1).toLowerCase(Locale.ROOT));
            } else if (strSubstring.charAt(i2) == '&') {
                j37 j37VarY2 = ote.Y(i, i2);
                sb.append(strSubstring.substring(j37VarY2.a, j37VarY2.b + 1));
            } else {
                if (i2 == strSubstring.length() - 1) {
                    j37 j37VarY3 = ote.Y(i, i2 + 1);
                    sb.append(strSubstring.substring(j37VarY3.a, j37VarY3.b + 1));
                }
            }
            i = i2;
        }
        return builderEncodedPath.encodedQuery(sb.toString()).build();
    }

    public static String i(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        int i5 = oaf.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    public static void j(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void k(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void l(int i, String str, int i2, int i3) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    public static void m(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void n(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(zr6.h(i2, "at index "));
            }
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void p(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static Bitmap q(byte[] bArr, int i, BitmapFactory.Options options) throws IOException {
        int i2 = 0;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (bitmapDecodeByteArray == null) {
            throw ParserException.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            c65 c65Var = new c65(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (c65Var.e(1, "Orientation")) {
                case 3:
                case 4:
                    i2 = 180;
                    break;
                case 5:
                case 8:
                    i2 = 270;
                    break;
                case 6:
                case 7:
                    i2 = 90;
                    break;
            }
            if (i2 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i2);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void r(yg7 yg7Var, boolean z) {
        if (yg7Var.getL1().d) {
            return;
        }
        yg7Var.getL1().d = true;
        Activity activity = yg7Var.getL1().b;
        if (activity != null) {
            Iterator it = w(yg7Var).iterator();
            while (it.hasNext()) {
                ((b8) it.next()).p(activity, z);
            }
        }
    }

    public static void s(eu4 eu4Var) {
        if (eu4Var.equals(eu4.f)) {
            throw new VideoMessageProcessorException("The specified dynamic range=" + eu4Var + " is not supported yet", null);
        }
    }

    public static final ConversationEndReason t(bpd bpdVar) {
        switch (bpdVar == null ? -1 : sod.$EnumSwitchMapping$0[bpdVar.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return ConversationEndReason.Canceled.INSTANCE;
            case 2:
                return ConversationEndReason.Rejected.INSTANCE;
            case 3:
                return ConversationEndReason.Hangup.INSTANCE;
            case 4:
                return ConversationEndReason.Missed.INSTANCE;
            case 5:
                return ConversationEndReason.SignalingTimeout.INSTANCE;
            case 6:
                return ConversationEndReason.Busy.INSTANCE;
            case 7:
                return new ConversationEndReason.Error(new RuntimeException("Closed by the server error"));
            case 8:
                return ConversationEndReason.RemovedFromCall.INSTANCE;
            case 9:
                return ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE;
            case 10:
                return ConversationEndReason.EndedForAll.INSTANCE;
            case 11:
                return ConversationEndReason.CallTimeout.INSTANCE;
        }
    }

    public static final String u(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static b8 v(yg7 yg7Var, w12 w12Var, Bundle bundle, wg7 wg7Var) {
        Map map = yg7Var.getL1().j;
        LinkedHashMap linkedHashMap = zg7.a;
        b8 b8Var = (b8) map.get(Integer.valueOf(w12Var.getId()));
        if (b8Var != null) {
            b8Var.Z(wg7Var, w12Var);
            return b8Var;
        }
        b8 b8Var2 = new b8();
        b8Var2.Z(wg7Var, w12Var);
        if (bundle != null) {
            StringBuilder sb = new StringBuilder("LifecycleHandler.routerState");
            ViewGroup viewGroup = b8Var2.i;
            sb.append(viewGroup != null ? viewGroup.getId() : 0);
            Bundle bundle2 = bundle.getBundle(sb.toString());
            if (bundle2 != null) {
                b8Var2.N(bundle2);
            }
        }
        yg7Var.getL1().j.put(Integer.valueOf(w12Var.getId()), b8Var2);
        return b8Var2;
    }

    public static List w(yg7 yg7Var) {
        return x53.D0(yg7Var.getL1().j.values());
    }

    public static final int x(View view) {
        return K(view) ? view.getRight() : view.getLeft();
    }

    public static void y(yg7 yg7Var, int i, int i2, Intent intent) {
        String str = (String) yg7Var.getL1().h.get(i);
        if (str != null) {
            Iterator it = w(yg7Var).iterator();
            while (it.hasNext()) {
                uu3 uu3VarF = ((b8) it.next()).f(str);
                if (uu3VarF != null) {
                    uu3VarF.onActivityResult(i, i2, intent);
                }
            }
        }
    }

    public static void z(yg7 yg7Var, Context context) {
        if (context instanceof Activity) {
            yg7Var.getL1().b = (Activity) context;
        }
        yg7Var.getL1().d = false;
        if (yg7Var.getL1().e) {
            return;
        }
        yg7Var.getL1().e = true;
        int size = yg7Var.getL1().i.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                vsa vsaVar = (vsa) yg7Var.getL1().i.remove(size);
                yg7Var.j(vsaVar.a, vsaVar.b, vsaVar.c);
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        Iterator it = w(yg7Var).iterator();
        while (it.hasNext()) {
            ((b8) it.next()).u();
        }
    }
}
