package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.view.View;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes2.dex */
public abstract class v3c {
    public static final String[][] a = {new String[]{":-)", "😊"}, new String[]{":)", "😊"}, new String[]{":-(", "😞"}, new String[]{":(", "😞"}, new String[]{";-)", "😉"}, new String[]{";)", "😉"}, new String[]{":-D", "😂"}, new String[]{":D", "😂"}, new String[]{":-@", "😞"}, new String[]{":@", "😞"}, new String[]{"^o)", "😑"}, new String[]{":-S", "🙈"}, new String[]{":S", "🙈"}, new String[]{"*-)", "😏"}, new String[]{"*)", "😏"}, new String[]{":-|", "😠"}, new String[]{":|", "😠"}, new String[]{"8oI", "😡"}, new String[]{";(", "😢"}, new String[]{":'(", "😢"}, new String[]{":-P", "😜"}, new String[]{":P", "😜"}, new String[]{":-$", "😊"}, new String[]{":$", "😊"}, new String[]{":-O", "😳"}, new String[]{":O", "😳"}, new String[]{"|-)", "😪"}, new String[]{"|)", "😪"}, new String[]{"(ch)", "😊"}, new String[]{"(lo)", "😍"}, new String[]{"(sr)", "😔"}, new String[]{"|-(", "😴"}, new String[]{"|(", "😴"}, new String[]{"(H)", "😎"}, new String[]{"(hu)", "😬"}, new String[]{"(tr)", "😞"}, new String[]{"(md)", "😵"}, new String[]{"(fr)", "😄"}, new String[]{"(dt)", "😟"}, new String[]{"(sc)", "😬"}, new String[]{"(Y)", "👍"}, new String[]{"(N)", "👎"}, new String[]{"(v)", "✌"}, new String[]{"(L)", "❤"}, new String[]{"(U)", "💔"}, new String[]{"(K)", "💋"}, new String[]{"(F)", "⚘"}, new String[]{"(*)", "★"}, new String[]{"(^)", "🎂"}, new String[]{"(G)", "🎁"}, new String[]{"(B)", "🍺"}, new String[]{"(D)", "🍸"}, new String[]{"(CC)", "☕"}, new String[]{"(pi)", "🍕"}, new String[]{"(pl)", "🍴"}, new String[]{"(ic)", "🍦"}, new String[]{"($)", "💰"}, new String[]{"(co)", "💻"}, new String[]{"(so)", "⚽"}, new String[]{"(te)", "🎾"}, new String[]{"(nt)", "♬"}, new String[]{"(I)", "💡"}, new String[]{"(E)", "✉"}, new String[]{"(Z)", "👦"}, new String[]{"(X)", "👧"}, new String[]{"(S)", "🌙"}};
    public static final boolean[] b = new boolean[3];
    public static final /* synthetic */ int c = 0;

    public static void A(Context context, es8 es8Var, l20 l20Var, au8 au8Var, kk5 kk5Var) {
        try {
            ((y8a) vl.b()).b().f("ACTION_FILE_OPEN_VIEWER");
            z(context, l20Var, kk5Var);
        } catch (FileNotFoundException unused) {
            hm9.p("v3c", "file attach file not found", null);
            a14.N(0, context, context.getString(jpc.c0));
            au8Var.u(es8Var.a, l20Var.r, d20.a);
        } catch (Exception e) {
            hm9.p("v3c", "cant open file attach.", e);
            a14.N(0, context, context.getString(jpc.t));
        }
    }

    public static void B(int i, int i2, int i3, int i4, ty4 ty4Var) {
        int i5;
        int i6;
        if (i3 > i4) {
            i6 = (int) ((i4 / i3) * i);
            i5 = i;
        } else {
            i5 = (int) ((i3 / i4) * i2);
            i6 = i2;
        }
        ty4Var.b = i;
        ty4Var.c = i2;
        ty4Var.d = i5;
        ty4Var.e = i6;
    }

    public static final void E(ol4 ol4Var, Continuation continuation, boolean z) {
        Object objTakeState$kotlinx_coroutines_core = ol4Var.takeState$kotlinx_coroutines_core();
        Throwable exceptionalResult$kotlinx_coroutines_core = ol4Var.getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        Object njcVar = exceptionalResult$kotlinx_coroutines_core != null ? new njc(exceptionalResult$kotlinx_coroutines_core) : ol4Var.getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        if (!z) {
            continuation.resumeWith(njcVar);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        Continuation<T> continuation2 = dispatchedContinuation.continuation;
        Object obj = dispatchedContinuation.countOrElement;
        lx3 context = continuation2.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
        z4f z4fVarG = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? G(continuation2, context, objUpdateThreadContext) : null;
        try {
            dispatchedContinuation.continuation.resumeWith(njcVar);
        } finally {
            if (z4fVarG == null || z4fVarG.H()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    public static final um5 F(c6d c6dVar, m56 m56Var, m56 m56Var2) {
        return new um5(c6dVar, new k5d(m56Var, 6, m56Var2), o6d.a);
    }

    public static final z4f G(Continuation continuation, lx3 lx3Var, Object obj) {
        z4f z4fVar = null;
        if (!(continuation instanceof ux3)) {
            return null;
        }
        if (lx3Var.get(a5f.a) != null) {
            ux3 callerFrame = (ux3) continuation;
            while (true) {
                if ((callerFrame instanceof nl4) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof z4f) {
                    z4fVar = (z4f) callerFrame;
                    break;
                }
            }
            if (z4fVar != null) {
                z4fVar.I(lx3Var, obj);
            }
        }
        return z4fVar;
    }

    public static Object H(a66 a66Var, Object obj, Continuation continuation) {
        lx3 context = continuation.getContext();
        Object m47Var = context == hz4.a ? new m47(continuation) : new n47(context, continuation);
        f8.c(2, a66Var);
        return a66Var.invoke(obj, m47Var);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static void b(long j, bt0 bt0Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        bt0 bt0Var2;
        long j2;
        int i8 = i;
        int i9 = 0;
        int i10 = 1;
        if (!(i2 < i3)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        for (int i11 = i2; i11 < i3; i11++) {
            if (((aw0) arrayList.get(i11)).c() < i8) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        aw0 aw0Var = (aw0) arrayList.get(i2);
        aw0 aw0Var2 = (aw0) arrayList.get(i3 - 1);
        int i12 = -1;
        if (i8 == aw0Var.c()) {
            int iIntValue = ((Number) arrayList2.get(i2)).intValue();
            int i13 = i2 + 1;
            aw0 aw0Var3 = (aw0) arrayList.get(i13);
            i4 = i13;
            i5 = iIntValue;
            aw0Var = aw0Var3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (aw0Var.f(i8) == aw0Var2.f(i8)) {
            int iMin = Math.min(aw0Var.c(), aw0Var2.c());
            for (int i14 = i8; i14 < iMin && aw0Var.f(i14) == aw0Var2.f(i14); i14++) {
                i9++;
            }
            long j3 = 4;
            long j4 = (bt0Var.b / j3) + j + 2 + i9 + 1;
            bt0Var.x0(-i9);
            bt0Var.x0(i5);
            int i15 = i8 + i9;
            while (i8 < i15) {
                bt0Var.x0(aw0Var.f(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (i15 != ((aw0) arrayList.get(i4)).c()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                bt0Var.x0(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                bt0 bt0Var3 = new bt0();
                bt0Var.x0(((int) ((bt0Var3.b / j3) + j4)) * (-1));
                b(j4, bt0Var3, i15, arrayList, i4, i3, arrayList2);
                bt0Var.t0(bt0Var3);
                return;
            }
        }
        for (int i16 = i4 + 1; i16 < i3; i16++) {
            if (((aw0) arrayList.get(i16 - 1)).f(i8) != ((aw0) arrayList.get(i16)).f(i8)) {
                i10++;
            }
        }
        long j5 = 4;
        long j6 = (i10 * 2) + (bt0Var.b / j5) + j + 2;
        bt0Var.x0(i10);
        bt0Var.x0(i5);
        for (int i17 = i4; i17 < i3; i17++) {
            int iF = ((aw0) arrayList.get(i17)).f(i8);
            if (i17 == i4 || iF != ((aw0) arrayList.get(i17 - 1)).f(i8)) {
                bt0Var.x0(iF & 255);
            }
        }
        bt0 bt0Var4 = new bt0();
        while (i4 < i3) {
            byte bF = ((aw0) arrayList.get(i4)).f(i8);
            int i18 = i4 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (bF != ((aw0) arrayList.get(i19)).f(i8)) {
                        i6 = i19;
                        break;
                    }
                    i19++;
                }
            }
            if (i18 == i6 && i8 + 1 == ((aw0) arrayList.get(i4)).c()) {
                bt0Var.x0(((Number) arrayList2.get(i4)).intValue());
                i7 = i6;
                bt0Var2 = bt0Var4;
                j2 = j5;
            } else {
                bt0Var.x0(((int) ((bt0Var4.b / j5) + j6)) * i12);
                i7 = i6;
                bt0Var2 = bt0Var4;
                j2 = j5;
                b(j6, bt0Var4, i8 + 1, arrayList, i4, i7, arrayList2);
            }
            bt0Var4 = bt0Var2;
            i4 = i7;
            j5 = j2;
            i12 = -1;
        }
        bt0Var.t0(bt0Var4);
    }

    public static void f(ij3 ij3Var, zh7 zh7Var, hj3 hj3Var) {
        hj3Var.o = -1;
        hj3Var.p = -1;
        int i = ij3Var.p0[0];
        int[] iArr = hj3Var.p0;
        if (i != 2 && iArr[0] == 4) {
            oi3 oi3Var = hj3Var.I;
            int i2 = oi3Var.g;
            int iQ = ij3Var.q();
            oi3 oi3Var2 = hj3Var.K;
            int i3 = iQ - oi3Var2.g;
            oi3Var.i = zh7Var.k(oi3Var);
            oi3Var2.i = zh7Var.k(oi3Var2);
            zh7Var.d(oi3Var.i, i2);
            zh7Var.d(oi3Var2.i, i3);
            hj3Var.o = 2;
            hj3Var.Y = i2;
            int i4 = i3 - i2;
            hj3Var.U = i4;
            int i5 = hj3Var.b0;
            if (i4 < i5) {
                hj3Var.U = i5;
            }
        }
        if (ij3Var.p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        oi3 oi3Var3 = hj3Var.J;
        int i6 = oi3Var3.g;
        int iK = ij3Var.k();
        oi3 oi3Var4 = hj3Var.L;
        int i7 = iK - oi3Var4.g;
        oi3Var3.i = zh7Var.k(oi3Var3);
        oi3Var4.i = zh7Var.k(oi3Var4);
        zh7Var.d(oi3Var3.i, i6);
        zh7Var.d(oi3Var4.i, i7);
        if (hj3Var.a0 > 0 || hj3Var.g0 == 8) {
            oi3 oi3Var5 = hj3Var.M;
            sud sudVarK = zh7Var.k(oi3Var5);
            oi3Var5.i = sudVarK;
            zh7Var.d(sudVarK, hj3Var.a0 + i6);
        }
        hj3Var.p = 2;
        hj3Var.Z = i6;
        int i8 = i7 - i6;
        hj3Var.V = i8;
        int i9 = hj3Var.c0;
        if (i8 < i9) {
            hj3Var.V = i9;
        }
    }

    public static final void g(File file) throws IOException {
        File parentFile;
        if (file.exists() && file.canWrite()) {
            return;
        }
        File parentFile2 = file.getParentFile();
        if (parentFile2 != null && !parentFile2.exists() && (parentFile = file.getParentFile()) != null && !parentFile.mkdirs()) {
            throw new IOException("Can't create log file parent dirs=" + file.getAbsoluteFile());
        }
        if (!file.createNewFile()) {
            throw new IOException(wg0.i("Can't create log file=", file.getAbsolutePath()));
        }
        if (!file.canWrite()) {
            throw new IOException(wg0.i("Can't write to file=", file.getAbsolutePath()));
        }
    }

    public static void h(int i, Collection collection) {
        boolean zContains = collection.contains(Integer.valueOf(i));
        Locale locale = Locale.US;
        String strO = o(i);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(o(((Integer) it.next()).intValue()));
        }
        c54.j(k7d.j("Effects target ", strO, " is not in the supported list ", "[" + String.join(", ", arrayList) + "]", "."), zContains);
    }

    public static final void i(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                j47.e(th, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation j(a66 a66Var, Object obj, Continuation continuation) {
        if (a66Var instanceof gi0) {
            return ((gi0) a66Var).n(obj, continuation);
        }
        lx3 context = continuation.getContext();
        return context == hz4.a ? new k47(a66Var, obj, continuation) : new l47(continuation, context, a66Var, obj);
    }

    public static final boolean k(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final lx3 m(lx3 lx3Var, lx3 lx3Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) lx3Var.fold(bool, new ai0(11))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) lx3Var2.fold(bool, new ai0(11))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return lx3Var.plus(lx3Var2);
        }
        hz4 hz4Var = hz4.a;
        lx3 lx3Var3 = (lx3) lx3Var.fold(hz4Var, new ai0(12));
        Object objFold = lx3Var2;
        if (zBooleanValue2) {
            objFold = lx3Var2.fold(hz4Var, new ai0(13));
        }
        return lx3Var3.plus((lx3) objFold);
    }

    public static Drawable n(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    public static String o(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    public static final String p(View view) {
        Object njcVar;
        try {
            njcVar = view.getResources().getResourceName(view.getId());
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (pjc.a(njcVar) != null) {
            njcVar = view.getClass().getName();
        }
        return (String) njcVar;
    }

    public static SharedPreferences q(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final ArrayList r(ww0 ww0Var) throws NoSuchAlgorithmException {
        String strEncodeToString;
        try {
            ArrayList arrayList = new ArrayList(1);
            if (ww0Var.b()) {
                strEncodeToString = ww0Var.c();
            } else {
                byte[] bytes = ww0Var.c().getBytes(Charset.forName("UTF-8"));
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(bytes, 0, bytes.length);
                    strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            }
            arrayList.add(strEncodeToString);
            return arrayList;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static wnc s(ma6 ma6Var) {
        if (ma6Var.p == null) {
            ma6Var.p = new wnc();
        }
        return ma6Var.p;
    }

    public static fm9 t(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return ssc.r;
            case 1:
                return ssc.q;
            case 2:
                return ssc.o;
            case 3:
                return ssc.p;
            case 4:
                return ssc.k;
            case 5:
                return ssc.m;
            case 6:
                return ssc.l;
            case 7:
                return ssc.s;
            case 8:
                return ssc.n;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static Continuation u(Continuation continuation) {
        hu3 hu3Var = continuation instanceof hu3 ? (hu3) continuation : null;
        if (hu3Var != null && (continuation = hu3Var.c) == null) {
            iu3 iu3Var = (iu3) hu3Var.getContext().get(vu4.b);
            if (iu3Var == null || (continuation = iu3Var.interceptContinuation(hu3Var)) == null) {
                continuation = hu3Var;
            }
            hu3Var.c = continuation;
        }
        return continuation;
    }

    public static final boolean v(int i) {
        return i == 1 || i == 2;
    }

    public static final String w(uu3 uu3Var) {
        return uu3Var.getClass().getName() + "@" + uu3Var.hashCode();
    }

    public static final lx3 x(sx3 sx3Var, lx3 lx3Var) {
        lx3 lx3VarM = m(sx3Var.getCoroutineContext(), lx3Var, true);
        jd4 jd4Var = ql4.a;
        return (lx3VarM == jd4Var || lx3VarM.get(vu4.b) != null) ? lx3VarM : lx3VarM.plus(jd4Var);
    }

    public static final void y(c66 c66Var, View view) {
        Object tag = view.getTag(vxb.oneme_theme_attach_listener);
        if ((tag instanceof View.OnAttachStateChangeListener ? (View.OnAttachStateChangeListener) tag : null) != null) {
            hm9.m0("ViewThemeUtils", "try to observe onThemeChanged more than once for " + p(view), new Object[0]);
            return;
        }
        View.OnAttachStateChangeListener fpfVar = new fpf(c66Var, view);
        view.setTag(vxb.oneme_theme_attach_listener, fpfVar);
        if (view.isAttachedToWindow()) {
            fpfVar.onViewAttachedToWindow(view);
        }
        view.addOnAttachStateChangeListener(fpfVar);
    }

    public static void z(Context context, l20 l20Var, kk5 kk5Var) throws FileNotFoundException {
        int i = 1;
        File fileH = kk5Var.h(l20Var);
        if (!fileH.exists()) {
            throw new FileNotFoundException("attach file not found");
        }
        String strQ = tfg.q(l20Var.j.c);
        if (!"application/vnd.android.package-archive".equals(strQ)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(1);
            intent.setDataAndType(kk5Var.f(context, fileH), strQ != null ? strQ : "*/*");
            if (strQ == null) {
                context.startActivity(intent);
                return;
            }
            try {
                context.startActivity(intent);
                return;
            } catch (Exception unused) {
                intent.setDataAndType(kk5Var.f(context, fileH), "*/*");
                context.startActivity(intent);
                return;
            }
        }
        try {
            if (context.getPackageManager().canRequestPackageInstalls()) {
                nd7.Q(new nm(context, i));
            }
        } catch (SecurityException e) {
            hm9.p("v3c", "fail to install apk", e);
            if (e.toString().contains("REQUEST_INSTALL_PACKAGES")) {
                Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent2.setDataAndType(kk5Var.f(context, fileH), strQ);
                context.startActivity(intent2);
            }
        }
    }

    public abstract void C(j1 j1Var, j1 j1Var2);

    public abstract void D(j1 j1Var, Thread thread);

    public abstract boolean c(l1 l1Var, w0 w0Var, w0 w0Var2);

    public abstract boolean d(l1 l1Var, Object obj, Object obj2);

    public abstract boolean e(l1 l1Var, j1 j1Var, j1 j1Var2);

    public abstract void l(Rect rect, Rect rect2);
}
