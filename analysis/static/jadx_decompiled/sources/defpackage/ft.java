package defpackage;

import android.animation.ObjectAnimator;
import android.net.Uri;
import android.os.Looper;
import android.text.Spannable;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class ft {
    public static final Continuation[] a = new Continuation[0];
    public static final qx7 b = new qx7(11);
    public static final wdg c = new wdg(5);
    public static final r66 d = new r66();
    public static final kj6 e = new kj6(11);
    public static final oz7 f = new oz7();
    public static final yb9 g = new yb9();
    public static final oz7 h = new oz7();

    public static final File A(Uri uri) {
        if (!tpa.f(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
    }

    public static void B(Spannable spannable, uw3 uw3Var, int i, int i2) {
        Object njcVar;
        if (i < 0) {
            i = 0;
        }
        if (i >= spannable.length()) {
            return;
        }
        int length = spannable.length();
        if (i2 > length) {
            i2 = length;
        }
        try {
            njcVar = (uw3[]) spannable.getSpans(i, i2, uw3Var.getClass());
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            njcVar = null;
        }
        uw3[] uw3VarArr = (uw3[]) njcVar;
        if (uw3VarArr != null && uw3VarArr.length != 0) {
            for (uw3 uw3Var2 : uw3VarArr) {
                kp.v(spannable, uw3Var2, i, i2);
            }
        }
        try {
            spannable.setSpan(uw3Var, i, i2, 33);
        } catch (Throwable th2) {
            hm9.p("Markdown", "error while try to set span", th2);
        }
    }

    public static final void C(y5f y5fVar) {
        y5fVar.e(a1b.class, new uza(0));
    }

    public static final void D(y5f y5fVar) {
        y5fVar.c(b64.class, new lxc(5));
    }

    public static final void E(y5f y5fVar) {
        y5fVar.c(b64.class, new lxc(14));
    }

    public static final void a(kl7 kl7Var, View view, boolean z) {
        float f2 = z ? 0.0f : 1.0f;
        float f3 = z ? 1.0f : 0.0f;
        float f4 = z ? -(fk4.d().getDisplayMetrics().density * 50.0f) : 0.0f;
        float f5 = z ? 0.0f : -(fk4.d().getDisplayMetrics().density * 50.0f);
        view.setTranslationY(f4);
        kl7Var.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f2, f3));
        kl7Var.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f4, f5));
    }

    public static final void b(int i, int i2, int i3, int i4, View view, View view2) {
        if (view == null) {
            return;
        }
        view.post(new uc3(view2, i, i2, i3, i4, view, 0));
    }

    public static final ObjectAnimator c(View view, boolean z, float f2, float f3, long j) {
        view.setAlpha(f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f2, f3);
        objectAnimatorOfFloat.setStartDelay(z ? j - 50 : 0L);
        objectAnimatorOfFloat.setDuration(50L);
        return objectAnimatorOfFloat;
    }

    public static a34 d(lhc lhcVar, String str, r4c r4cVar, int i) {
        y24 y24Var = new y24(1);
        y24Var.b = mr0.S(str, r4cVar.c);
        y24Var.g = r4cVar.a;
        y24Var.h = r4cVar.b;
        String strA = lhcVar.a();
        if (strA == null) {
            strA = r4cVar.b(((mk0) lhcVar.b.get(0)).a).toString();
        }
        y24Var.e(strA);
        y24Var.c(i);
        y24Var.d();
        return y24Var.b();
    }

    public static final void e() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new pq1("Methods that affect the view hierarchy can can only be called from the main thread.");
        }
    }

    public static final void f(View view, boolean z, long j, m56 m56Var) {
        int i = y7a.m;
        Object tag = view.getTag(i);
        if (tag == null) {
            if ((view.getVisibility() == 0) == z) {
                if (m56Var != null) {
                    m56Var.invoke(Boolean.valueOf(view.getVisibility() == 0));
                    return;
                }
                return;
            }
        }
        boolean zF = tpa.f(tag, "fade_in");
        boolean zF2 = tpa.f(tag, "fade_out");
        if (zF && z) {
            return;
        }
        if (!zF2 || z) {
            String str = z ? "fade_in" : "fade_out";
            view.animate().cancel();
            view.clearAnimation();
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener(null);
            }
            float f2 = z ? 0.0f : 1.0f;
            float f3 = z ? 1.0f : 0.0f;
            view.animate().setDuration(j).alpha(f3).setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator()).setListener(new rg(view, i, str, f2, f3, z, m56Var)).start();
        }
    }

    public static /* synthetic */ void g(View view, boolean z, long j, m56 m56Var, int i) {
        if ((i & 2) != 0) {
            j = 150;
        }
        if ((i & 4) != 0) {
            m56Var = null;
        }
        f(view, z, j, m56Var);
    }

    public static final vk6 h(List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((vk6) next) instanceof uk6)) {
                break;
            }
        }
        return (vk6) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x04ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bj6 i(defpackage.xv1 r12) {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft.i(xv1):bj6");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class j(nb7 nb7Var) {
        Class clsA = ((f23) nb7Var).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsA;
    }

    public static final boolean l(View view) {
        Object tag = view.getTag(y7a.m);
        boolean zF = tpa.f(tag, "fade_in");
        boolean zF2 = tpa.f(tag, "fade_out");
        if (tag == null) {
            if (view.getVisibility() != 0) {
                return false;
            }
        } else if (!zF && (zF2 || view.getVisibility() != 0)) {
            return false;
        }
        return true;
    }

    public static boolean n(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static final vk6 o(List list) {
        Object objPrevious;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (!(((vk6) objPrevious) instanceof uk6)) {
                break;
            }
        }
        return (vk6) objPrevious;
    }

    public static m13 p(t24 t24Var, int i, lhc lhcVar) {
        r4c r4cVar = lhcVar.X;
        zw6 zw6Var = lhcVar.b;
        if (r4cVar == null) {
            return null;
        }
        qy5 qy5Var = lhcVar.a;
        String str = qy5Var.m;
        kj6 kj6Var = mbe.a0;
        xu0 xu0Var = new xu0((str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new f26(32, kj6Var) : new d28(2, kj6Var), i, qy5Var);
        try {
            r4c r4cVarE = lhcVar.e();
            fm9.h(r4cVarE);
            r4c r4cVarD = lhcVar.d();
            if (r4cVarD != null) {
                r4c r4cVarA = r4cVarE.a(r4cVarD, ((mk0) zw6Var.get(0)).a);
                if (r4cVarA == null) {
                    new u07(t24Var, d(lhcVar, ((mk0) zw6Var.get(0)).a, r4cVarE, 0), lhcVar.a, 0, null, xu0Var).load();
                } else {
                    r4cVarD = r4cVarA;
                }
                new u07(t24Var, d(lhcVar, ((mk0) zw6Var.get(0)).a, r4cVarD, 0), lhcVar.a, 0, null, xu0Var).load();
            }
            xu0Var.c();
            return xu0Var.a();
        } catch (Throwable th) {
            xu0Var.c();
            throw th;
        }
    }

    public static final boolean q(View view, boolean z) {
        if (view != null && view.getVisibility() == 0) {
            return z || view.getAlpha() != 0.0f;
        }
        return false;
    }

    public static int r(s02 s02Var, int i, int i2, int i3) {
        fm9.f(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        lz7.g(lz7.g(i4, i5), 1 << i3);
        if (s02Var.b() < i) {
            return -1;
        }
        int i6 = s02Var.i(i);
        if (i6 != i4) {
            return i6;
        }
        if (s02Var.b() < i2) {
            return -1;
        }
        int i7 = s02Var.i(i2);
        int i8 = i6 + i7;
        if (i7 != i5) {
            return i8;
        }
        if (s02Var.b() < i3) {
            return -1;
        }
        return i8 + s02Var.i(i3);
    }

    public static h7b s(wpa wpaVar) {
        wpaVar.H(1);
        int iX = wpaVar.x();
        long j = wpaVar.b + iX;
        int i = iX / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jO = wpaVar.o();
            if (jO == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jO;
            jArrCopyOf2[i2] = wpaVar.o();
            wpaVar.H(2);
            i2++;
        }
        wpaVar.H((int) (j - wpaVar.b));
        return new h7b(jArrCopyOf, jArrCopyOf2, false, 19);
    }

    public static final void t(h23 h23Var, Object obj, String str, Integer num) {
        try {
            Field declaredField = h23Var.a().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, num);
        } catch (Throwable unused) {
        }
    }

    public static void y(s02 s02Var) {
        s02Var.t(3);
        s02Var.t(8);
        boolean zH = s02Var.h();
        boolean zH2 = s02Var.h();
        if (zH) {
            s02Var.t(5);
        }
        if (zH2) {
            s02Var.t(6);
        }
    }

    public static void z(s02 s02Var) {
        int i;
        int i2 = s02Var.i(2);
        if (i2 == 0) {
            s02Var.t(6);
            return;
        }
        int iR = r(s02Var, 5, 8, 16) + 1;
        if (i2 == 1) {
            s02Var.t(iR * 7);
            return;
        }
        if (i2 == 2) {
            boolean zH = s02Var.h();
            int i3 = zH ? 1 : 5;
            int i4 = zH ? 7 : 5;
            int i5 = zH ? 8 : 6;
            int i6 = 0;
            while (i6 < iR) {
                if (s02Var.h()) {
                    s02Var.t(7);
                    i = 0;
                } else {
                    if (s02Var.i(2) == 3 && s02Var.i(i4) * i3 != 0) {
                        s02Var.s();
                    }
                    i = s02Var.i(i5) * i3;
                    if (i != 0 && i != 180) {
                        s02Var.s();
                    }
                    s02Var.s();
                }
                if (i != 0 && i != 180 && s02Var.h()) {
                    i6++;
                }
                i6++;
            }
        }
    }

    public abstract void k(int i);

    public abstract boolean m();

    public abstract void u(boolean z);

    public abstract void v(boolean z);

    public abstract void w();

    public abstract void x(int i);
}
