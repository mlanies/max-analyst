package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class ote implements s43 {
    public static final o97 b = new o97("CORE", 1);
    public static final cc7[] c = new cc7[0];
    public final /* synthetic */ int a;

    public /* synthetic */ ote(int i) {
        this.a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ote.A(java.lang.String):int");
    }

    public static int B(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final void D(View view, int i, int i2, int i3, int i4) {
        View view2 = (View) view.getParent();
        if (c54.K(view)) {
            view.layout(view2.getMeasuredWidth() - i3, i2, view2.getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    public static /* synthetic */ void E(View view, int i, int i2, int i3, int i4) {
        int measuredWidth = view.getMeasuredWidth() + i;
        if ((i4 & 8) != 0) {
            i3 = view.getMeasuredHeight() + i2;
        }
        D(view, i, i2, measuredWidth, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fx8 F(defpackage.gy8 r14) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ote.F(gy8):fx8");
    }

    public static TypedArray G(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fn1 O(defpackage.gy8 r18) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ote.O(gy8):fn1");
    }

    public static void R(Drawable drawable, int i) {
        aq4.g(drawable, i);
    }

    public static void S(Drawable drawable, ColorStateList colorStateList) {
        aq4.h(drawable, colorStateList);
    }

    public static void T(Drawable drawable, PorterDuff.Mode mode) {
        aq4.i(drawable, mode);
    }

    public static long V(int i, long j) {
        long j2 = i;
        c54.j("bytesPerFrame must be greater than 0.", j2 > 0);
        return j / j2;
    }

    public static h37 X(h37 h37Var, int i) {
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (z) {
            if (h37Var.c <= 0) {
                i = -i;
            }
            return new h37(h37Var.a, h37Var.b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static j37 Y(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new j37(i, i2 - 1, 1);
        }
        j37 j37Var = j37.o;
        return j37.o;
    }

    public static final void Z(y5f y5fVar) {
        y5fVar.e(uba.class, new lxc(4));
    }

    public static final void a0(y5f y5fVar) {
        y5fVar.c(b64.class, new lxc(13));
        y5fVar.e(cz3.class, new mxc(3));
        y5fVar.e(dxa.class, new mxc(4));
    }

    public static float b(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static final int b0(int i, float f) {
        return Color.argb(tu0.G(f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static long c(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static float d(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int e(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long f(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException(z7b.i(au1.k(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j2, '.'));
    }

    public static final Object i(ilc ilcVar, CancellationSignal cancellationSignal, Callable callable, Continuation continuation) {
        lx3 lx3VarH;
        if (ilcVar.n() && ilcVar.k()) {
            return callable.call();
        }
        v0f v0fVar = (v0f) continuation.getContext().get(v0f.c);
        if (v0fVar == null || (lx3VarH = v0fVar.a) == null) {
            lx3VarH = f8.h(ilcVar);
        }
        sy1 sy1Var = new sy1(1, v3c.u(continuation));
        sy1Var.n();
        sy1Var.d(new ey3(cancellationSignal, 0, j47.T(zd6.a, lx3VarH, null, new fy3(callable, sy1Var, null), 2)));
        return sy1Var.m();
    }

    public static final Object j(ilc ilcVar, Callable callable, Continuation continuation) {
        lx3 lx3VarK;
        if (ilcVar.n() && ilcVar.k()) {
            return callable.call();
        }
        v0f v0fVar = (v0f) continuation.getContext().get(v0f.c);
        if (v0fVar == null || (lx3VarK = v0fVar.a) == null) {
            lx3VarK = f8.k(ilcVar);
        }
        return j47.t0(lx3VarK, new dy3(callable, null), continuation);
    }

    public static long k(int i, long j) {
        long j2 = i;
        c54.j("sampleRate must be greater than 0.", j2 > 0);
        return (TimeUnit.SECONDS.toNanos(1L) * j) / j2;
    }

    public static int m(int i, int i2, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static final Boolean n(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.tt7 s(defpackage.pke r4) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ote.s(pke):tt7");
    }

    public static jn t(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        jn jnVarL;
        if (z(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new jn((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                jnVarL = jn.l(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                jnVarL = null;
            }
            if (jnVarL != null) {
                return jnVarL;
            }
        }
        return new jn((Shader) null, (ColorStateList) null, 0);
    }

    public static final PackageInfo u(PackageManager packageManager, String str) {
        return Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0)) : packageManager.getPackageInfo(str, 0);
    }

    public static String x(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean z(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public boolean C() {
        return false;
    }

    public abstract void H();

    public void I() {
    }

    public abstract void J(int i);

    public abstract void K(Typeface typeface, boolean z);

    public abstract boolean L(int i, KeyEvent keyEvent);

    public boolean M(KeyEvent keyEvent) {
        return false;
    }

    public boolean N() {
        return false;
    }

    public abstract void P(boolean z);

    public abstract void Q(boolean z);

    public abstract void U(CharSequence charSequence);

    public j7 W(imc imcVar) {
        return null;
    }

    public boolean a() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z);

    public abstract int l(View view, int i, int i2);

    public cg6 o() {
        return new cg6();
    }

    public abstract String p();

    public abstract int q();

    public abstract int r(View view, int i);

    public String toString() {
        switch (this.a) {
            case 10:
                return "Alignment:" + p();
            default:
                return super.toString();
        }
    }

    public int v(int i, int i2) {
        return i;
    }

    public abstract Context y();
}
