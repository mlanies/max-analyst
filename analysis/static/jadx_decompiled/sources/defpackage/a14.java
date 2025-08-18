package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Range;
import android.util.Size;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import one.me.android.root.RootController;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;
import org.xmlpull.v1.XmlPullParser;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes.dex */
public abstract class a14 {
    public static volatile a14 f;
    public static final /* synthetic */ int h = 0;
    public static Handler i;
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final Object e = new Object();
    public static final nd2 g = new nd2(18);

    public static final boolean A(ApiInvocationException apiInvocationException) {
        String str;
        int i2 = apiInvocationException.a;
        if (i2 == 102 || i2 == 103) {
            return true;
        }
        return i2 == 100 && (((str = apiInvocationException.b) != null && w9e.p0(str, "session_key", false)) || tpa.f(apiInvocationException.c, "session_key"));
    }

    public static boolean B(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean C(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean D(XmlPullParser xmlPullParser, String str) {
        return C(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static float E(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static void F(float[] fArr, float f2) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f2, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void G(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static String H(long j) {
        long millis = TimeUnit.MICROSECONDS.toMillis(j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(millis);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(millis - timeUnit2.toMillis(hours));
        long millis2 = millis - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis2 - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    public static void I(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        aq4.h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void J(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = zmf.a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static void K(Context context, int i2) {
        N(0, context, context.getString(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void L(android.app.Activity r12, defpackage.uia r13) {
        /*
            y8a r0 = defpackage.y8a.a
            haa r0 = r0.o()
            foc r0 = r0.f()
            znc r0 = r0.C()
            java.util.ArrayList r0 = r0.e()
            java.lang.Object r0 = defpackage.x53.i0(r0)
            coc r0 = (defpackage.coc) r0
            r1 = 0
            if (r0 == 0) goto L1e
            uu3 r0 = r0.a
            goto L1f
        L1e:
            r0 = r1
        L1f:
            boolean r2 = r0 instanceof one.me.sdk.arch.Widget
            if (r2 == 0) goto L26
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            goto L27
        L26:
            r0 = r1
        L27:
            if (r0 == 0) goto L95
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r2 = "detect snackbar"
            defpackage.hm9.n(r12, r2)
            eia r12 = r13.X
            int r2 = r12.a
            r3 = 0
            r4 = 2
            if (r2 != r4) goto L40
            r2 = 1
            goto L41
        L40:
            r2 = r3
        L41:
            if (r2 == 0) goto L74
            r2 = r0
        L44:
            uu3 r4 = r2.getParentController()
            if (r4 == 0) goto L4f
            uu3 r2 = r2.getParentController()
            goto L44
        L4f:
            android.view.View r2 = r2.getView()
            if (r2 == 0) goto L5a
            android.view.ViewParent r2 = r2.getParent()
            goto L5b
        L5a:
            r2 = r1
        L5b:
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L62
            android.view.View r2 = (android.view.View) r2
            goto L63
        L62:
            r2 = r1
        L63:
            if (r2 == 0) goto L6d
            int r1 = defpackage.wca.a
            android.view.View r1 = r2.findViewById(r1)
            u6a r1 = (defpackage.u6a) r1
        L6d:
            if (r1 == 0) goto L74
            int r1 = r1.getHeight()
            goto L75
        L74:
            r1 = r3
        L75:
            wha r2 = new wha
            r2.<init>(r0)
            eia r9 = new eia
            int r12 = r12.c
            int r1 = r1 + r12
            r12 = 3
            r9.<init>(r3, r3, r1, r12)
            r8 = 0
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r11 = 47
            r4 = r13
            uia r12 = defpackage.uia.a(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.b = r12
            r2.i()
            goto La2
        L95:
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r13 = "widget is null for snackbar"
            defpackage.hm9.n0(r12, r13)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a14.L(android.app.Activity, uia):void");
    }

    public static final void M(Activity activity, Intent intent) {
        Object njcVar;
        uia uiaVar;
        if (intent == null) {
            intent = activity.getIntent();
        }
        try {
            njcVar = (uia) fm9.D(intent, "snackbar", uia.class);
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            hm9.l0(activity.getClass().getName(), "showSnackbarIfNeeded fail", thA);
        }
        if (!(!(njcVar instanceof njc)) || (uiaVar = (uia) njcVar) == null) {
            return;
        }
        L(activity, uiaVar);
    }

    public static void N(int i2, Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Toast.makeText(context, str, i2).show();
            return;
        }
        if (i == null) {
            i = new Handler(Looper.getMainLooper());
        }
        i.post(new si1(context, str, i2, 16));
    }

    public static String O(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static final void P(y5f y5fVar) {
        y5fVar.e(jvc.class, new k1e(23));
        y5fVar.e(SystemServicesManager$PushTokenGeneratedListener.class, new k1e(24));
        y5fVar.e(xie.class, new k1e(25));
        y5fVar.c(qu7.class, new lxc(20));
        y5fVar.e(acf.class, new k1e(26));
        y5fVar.e(lqf.class, new k1e(27));
        y5fVar.e(zp.class, new k1e(28));
        y5fVar.e(ri4.class, new k1e(29));
        y5fVar.e(ti4.class, new ybf(0));
        y5fVar.e(gta.class, new ybf(1));
    }

    public static float T() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.on5 r4, java.lang.Object r5, java.lang.Object r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.lp5
            if (r0 == 0) goto L13
            r0 = r7
            lp5 r0 = (defpackage.lp5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            lp5 r0 = new lp5
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r6 = r0.o
            defpackage.od2.a0(r7)
            goto L3f
        L31:
            defpackage.od2.a0(r7)
            r0.o = r6
            r0.Y = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L3f
            return
        L3f:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a14.a(on5, java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation):void");
    }

    public static final ShapeDrawable b(int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i2);
        shapeDrawable.getPaint().setAntiAlias(true);
        shapeDrawable.getPaint().setMaskFilter(new BlurMaskFilter(1000.0f, BlurMaskFilter.Blur.NORMAL));
        return shapeDrawable;
    }

    public static final void c(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("?");
            if (i3 < i2 - 1) {
                sb.append(",");
            }
        }
    }

    public static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                aq4.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                aq4.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                aq4.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final void e(RootController rootController, Intent intent) {
        if (rootController.C().n()) {
            return;
        }
        n6a n6aVar = (n6a) y8a.a.getAccessor().c(n6a.class);
        if (n6aVar.a()) {
            n6aVar.b();
            return;
        }
        nmc.T.getClass();
        if (x53.c0(mmc.b, intent.getAction())) {
            return;
        }
        f64 f64VarP1 = mx7.c.P1();
        ex7.b.getClass();
        f64VarP1.b(m64.a(ex7.e.a), null);
    }

    public static int f(Context context) {
        int iE;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int iSqrt = (int) Math.sqrt(Math.pow(point.y, 2.0d) + Math.pow(point.x, 2.0d));
        Canvas canvas = new Canvas();
        int iMin = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (iMin > 0) {
            iSqrt = Math.min(iSqrt, iMin);
        }
        try {
            iE = mr0.E();
        } catch (Exception unused) {
            iE = 0;
        }
        return iE > 0 ? Math.min(iSqrt, iE) : iSqrt;
    }

    public static void g(StateListDrawable stateListDrawable, fka fkaVar) {
        Drawable stateDrawable = stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{R.attr.state_checked}));
        EnhancedVectorDrawable enhancedVectorDrawable = stateDrawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) stateDrawable : null;
        if (enhancedVectorDrawable == null) {
            return;
        }
        Drawable stateDrawable2 = stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{-16842912}));
        GradientDrawable gradientDrawable = stateDrawable2 instanceof GradientDrawable ? (GradientDrawable) stateDrawable2 : null;
        if (gradientDrawable == null) {
            return;
        }
        c54.Z(enhancedVectorDrawable, "circle_background", fkaVar.getIcon().k);
        gradientDrawable.setStroke(tu0.G(2 * fk4.d().getDisplayMetrics().density), fkaVar.i().b.b);
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ImageView.ScaleType k(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static nb3 l(String str, String str2) {
        va0 va0Var = new va0(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lqb.a(va0.class));
        return new nb3(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new v02(15, va0Var), hashSet3);
    }

    public static StateListDrawable m(Context context) {
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, jub.ic_check_filled_24);
        pq9 pq9Var = qp4.u0;
        c54.Z(enhancedVectorDrawable, "circle_background", k7d.h(pq9Var, context).k);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        float f2 = 24;
        gradientDrawable.setSize(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(tu0.G(2 * fk4.d().getDisplayMetrics().density), pq9Var.b(context).i().i().b.b);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, enhancedVectorDrawable);
        stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
        return stateListDrawable;
    }

    public static ha0 p(ha0 ha0Var, Size size, Range range) {
        int i2 = ha0Var.c;
        int width = size.getWidth();
        int height = size.getHeight();
        int i3 = ha0Var.h;
        int i4 = ha0Var.d;
        return new ha0(ha0Var.a, ha0Var.b, eef.c(i2, i3, i3, i4, i4, width, ha0Var.e, height, ha0Var.f, range), ha0Var.d, size.getWidth(), size.getHeight(), ha0Var.g, ha0Var.h, ha0Var.i, ha0Var.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final RootController s(Activity activity) {
        nmc nmcVar = (nmc) activity;
        if (nmcVar.g().n()) {
            RootController rootController = (RootController) nmcVar.g().g("RootController");
            nmcVar.g().I();
            return rootController;
        }
        RootController rootController2 = new RootController();
        znc zncVarG = nmcVar.g();
        coc cocVarE = i24.e(rootController2, null, null);
        cocVarE.d("RootController");
        zncVarG.R(cocVarE);
        return rootController2;
    }

    public static nb3 t(String str, ig5 ig5Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lqb.a(va0.class));
        for (Class cls : new Class[0]) {
            h(cls, "Null interface");
            hashSet.add(lqb.a(cls));
        }
        nh4 nh4VarA = nh4.a(Context.class);
        if (!(!hashSet.contains(nh4VarA.a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(nh4VarA);
        return new nb3(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new d74(str, 20, ig5Var), hashSet3);
    }

    public static a14 u() {
        a14 a14Var;
        synchronized (e) {
            try {
                if (f == null) {
                    f = new et7(3);
                }
                a14Var = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a14Var;
    }

    public static String v(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static final void w(Activity activity, Intent intent) {
        String str;
        Object next;
        Object njcVar;
        bqb bqbVar;
        Object obj;
        String string;
        boolean zA = false;
        y8a y8aVar = y8a.a;
        n6a n6aVar = (n6a) y8aVar.getAccessor().c(n6a.class);
        if (n6aVar.a()) {
            n6aVar.b();
            return;
        }
        Long lF0 = null;
        if (intent.getAction() != null && (intent.getFlags() & 1048576) == 0) {
            String action = intent.getAction();
            nmc.T.getClass();
            if (x53.c0(mmc.b, action)) {
                gy2 gy2Var = gy2.c;
                gy2Var.getClass();
                Bundle extras = intent.getExtras();
                if (extras != null && (obj = extras.get("android.intent.extra.shortcut.ID")) != null && (string = obj.toString()) != null) {
                    lF0 = dae.f0(string);
                }
                f64 f64VarP1 = gy2Var.P1();
                Bundle bundle = new Bundle();
                bundle.putParcelable("oneme:share:data", intent);
                if (lF0 != null) {
                    bundle.putLongArray("selected_ids", new long[]{lF0.longValue()});
                }
                f64VarP1.b(":chats/share", bundle);
                return;
            }
        }
        ((ty0) y8aVar.getAccessor().c(ty0.class)).getClass();
        hm9.n("CallActionsProcessor", "handleCallRedirectActionIntent action=" + intent.getAction());
        znc zncVarC = y8aVar.o().f().C();
        String action2 = intent.getAction();
        if (action2 == null) {
            Uri data = intent.getData();
            if (data == null) {
                data = (Uri) fm9.D(intent, "deep_link", Uri.class);
            }
            if (data != null) {
                List list = (List) ps1.a.getValue();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (w9e.p0(data.toString(), (String) it.next(), false)) {
                            zA = ps1.a(zncVarC);
                            break;
                        }
                    }
                }
            }
        } else {
            wa1 wa1VarD = oz7.d(action2);
            if (!(wa1VarD instanceof sa1) && !(wa1VarD instanceof na1)) {
                if (wa1VarD instanceof ta1) {
                    je7 je7Var = ps1.a;
                    String str2 = zncVarC.g(":call-incoming") != null ? ":call-incoming" : null;
                    if (str2 == null) {
                        Iterator it2 = zncVarC.e().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            String str3 = ((coc) next).b;
                            if (str3 != null && w9e.p0(str3, ":call-incoming", false)) {
                                break;
                            }
                        }
                        coc cocVar = (coc) next;
                        str2 = cocVar != null ? cocVar.b : null;
                    }
                    if (str2 != null) {
                        zncVarC.D(str2);
                    }
                    if (str2 == null) {
                        String stringExtra = intent.getStringExtra("incoming_param_name");
                        str = stringExtra != null ? stringExtra : "";
                        String stringExtra2 = intent.getStringExtra("incoming_param_avatar");
                        long longExtra = intent.getLongExtra("incoming_param_chat_id", 0L);
                        boolean booleanExtra = intent.getBooleanExtra("incoming_param_is_video", false);
                        f64 f64VarP12 = vw7.c.P1();
                        StringBuilder sbJ = z7b.j(":call-incoming?chat_id=", longExtra, "&call_name=", str);
                        sbJ.append("&call_avatar=");
                        sbJ.append(stringExtra2);
                        sbJ.append("&video_enabled=");
                        sbJ.append(booleanExtra);
                        f64VarP12.b(sbJ.toString(), null);
                    }
                } else if (wa1VarD instanceof ra1) {
                    if (!ps1.a(zncVarC)) {
                        String stringExtra3 = intent.getStringExtra("link_param");
                        str = stringExtra3 != null ? stringExtra3 : "";
                        f64 f64VarP13 = vw7.c.P1();
                        y7g y7gVar = new y7g(13);
                        y7gVar.b = ":call-join-preview";
                        y7gVar.D(str, "link");
                        f64VarP13.c(y7gVar.r(), null);
                    }
                } else if (wa1VarD instanceof ua1) {
                    String stringExtra4 = intent.getStringExtra("call_id");
                    str = stringExtra4 != null ? stringExtra4 : "";
                    boolean booleanExtra2 = intent.getBooleanExtra("is_video", false);
                    String[] stringArrayExtra = intent.getStringArrayExtra("sdk_reasons");
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    vw7 vw7Var = vw7.c;
                    List listM0 = ys.m0(stringArrayExtra);
                    vw7Var.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append(":call-rate?call_id=" + str + "&is_video=" + booleanExtra2);
                    if (!listM0.isEmpty()) {
                        sb.append("&sdk_reasons=".concat(x53.n0(listM0, ",", null, null, null, 62)));
                    }
                    vw7Var.P1().b(sb.toString(), null);
                }
            } else if (!ps1.a(zncVarC)) {
                vw7.c.P1().b(":call-active", null);
            }
            zA = true;
        }
        if (zA) {
            hm9.n(activity.getClass().getName(), "call detect");
            return;
        }
        Uri data2 = intent.getData();
        if (data2 == null) {
            data2 = (Uri) fm9.D(intent, "deep_link", Uri.class);
        }
        if (data2 == null) {
            return;
        }
        y8a y8aVar2 = y8a.a;
        if (((f64) y8aVar2.getAccessor().c(f64.class)).c(data2, null)) {
            String stringExtra5 = intent.getStringExtra("external_callback_param_arg");
            if (stringExtra5 != null) {
                vw7.c.P1().b(":external_callback", dy7.g(new kpa("params", stringExtra5)));
            }
            String name = activity.getClass().getName();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, name, "deep link detect " + data2, null);
            }
            String stringExtra6 = intent.getStringExtra("push_action");
            if (stringExtra6 == null) {
                return;
            }
            if (!stringExtra6.equals("push_action_open_chat")) {
                if (stringExtra6.equals("push_action_open_chats")) {
                    rx9 rx9VarE = ((qx9) y8aVar2.getAccessor().c(qx9.class)).e();
                    rx9VarE.getClass();
                    String str4 = rx9.d;
                    hm9.n(str4, "onNotificationOpened");
                    try {
                        rx9VarE.b().b("Action", Collections.singletonMap("p_op", "open_chats"));
                        return;
                    } catch (Exception e2) {
                        hm9.p(str4, "onNotificationOpened: failed", e2);
                        ((cba) rx9VarE.c()).c(new HandledException("failed to log notification open", e2), true);
                        return;
                    }
                }
                return;
            }
            try {
                njcVar = (bqb) fm9.D(intent, "push_info", bqb.class);
            } catch (Throwable th) {
                njcVar = new njc(th);
            }
            Throwable thA = pjc.a(njcVar);
            if (thA != null) {
                hm9.l0(activity.getClass().getName(), "fail to fetch push info", thA);
            }
            if (!(!(njcVar instanceof njc)) || (bqbVar = (bqb) njcVar) == null) {
                return;
            }
            rx9 rx9VarE2 = ((qx9) y8a.a.getAccessor().c(qx9.class)).e();
            rx9VarE2.getClass();
            String str5 = rx9.d;
            hm9.m(str5, "onNotificationOpenedForChat: %s", bqbVar);
            String str6 = bqbVar.b;
            if (str6 == null) {
                return;
            }
            try {
                rx9VarE2.b().b("Action", br7.f(new kpa("trid", Long.valueOf(bqbVar.a)), new kpa("eKey", str6), new kpa("p_op", "open_chat")));
            } catch (Exception e3) {
                hm9.p(str5, "onNotificationOpenedForChat: failed", e3);
                ((cba) rx9VarE2.c()).c(new HandledException("failed to log notification open for chat", e3), true);
            }
        }
    }

    public static int z(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return s63.b(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public abstract void Q();

    public abstract void R(String str, String str2);

    public abstract void S(String str, String str2, RuntimeException runtimeException);

    public abstract List i(String str, List list);

    public abstract void n(String str, String str2);

    public abstract void o(String str, String str2, Throwable th);

    public abstract void q(String str, String str2);

    public abstract void r(String str, String str2, Throwable th);

    public abstract void x(String str, String str2);

    public abstract void y(String str, CancellationException cancellationException);
}
