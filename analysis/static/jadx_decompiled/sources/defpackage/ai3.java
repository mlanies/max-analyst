package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ai3 implements kwe {
    public Object X;
    public Object Y;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public ai3(je7 je7Var, y7d y7dVar) {
        this.a = y7dVar;
        this.b = je7Var;
        this.c = new AtomicInteger(0);
        this.o = new AtomicReference(zh3.b);
        this.X = new khe(new zf3(1));
        this.Y = new khe(new md1(23, this));
    }

    public static yj8 d(q3b q3bVar, zw6 zw6Var, yj8 yj8Var, hue hueVar) {
        mue mueVarX0 = q3bVar.x0();
        int iB = q3bVar.B();
        Object objM = mueVarX0.q() ? null : mueVarX0.m(iB);
        int iB2 = (q3bVar.n() || mueVarX0.q()) ? -1 : mueVarX0.f(iB, hueVar).b(oaf.S(q3bVar.k()) - hueVar.g());
        for (int i = 0; i < zw6Var.size(); i++) {
            yj8 yj8Var2 = (yj8) zw6Var.get(i);
            if (f(yj8Var2, objM, q3bVar.n(), q3bVar.o0(), q3bVar.O(), iB2)) {
                return yj8Var2;
            }
        }
        if (zw6Var.isEmpty() && yj8Var != null) {
            if (f(yj8Var, objM, q3bVar.n(), q3bVar.o0(), q3bVar.O(), iB2)) {
                return yj8Var;
            }
        }
        return null;
    }

    public static boolean f(yj8 yj8Var, Object obj, boolean z, int i, int i2, int i3) {
        if (!yj8Var.a.equals(obj)) {
            return false;
        }
        int i4 = yj8Var.b;
        return (z && i4 == i && yj8Var.c == i2) || (!z && i4 == -1 && yj8Var.e == i3);
    }

    public void a(String str, String str2) {
        Map map = (Map) this.Y;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public void b(jn jnVar, yj8 yj8Var, mue mueVar) {
        if (yj8Var == null) {
            return;
        }
        if (mueVar.b(yj8Var.a) != -1) {
            jnVar.I(yj8Var, mueVar);
            return;
        }
        mue mueVar2 = (mue) ((cx6) this.c).get(yj8Var);
        if (mueVar2 != null) {
            jnVar.I(yj8Var, mueVar2);
        }
    }

    public ja0 c() {
        String strG = ((String) this.a) == null ? " transportName" : "";
        if (((i05) this.c) == null) {
            strG = strG.concat(" encodedPayload");
        }
        if (((Long) this.o) == null) {
            strG = au1.g(strG, " eventMillis");
        }
        if (((Long) this.X) == null) {
            strG = au1.g(strG, " uptimeMillis");
        }
        if (((Map) this.Y) == null) {
            strG = au1.g(strG, " autoMetadata");
        }
        if (strG.isEmpty()) {
            return new ja0((String) this.a, (Integer) this.b, (i05) this.c, ((Long) this.o).longValue(), ((Long) this.X).longValue(), (Map) this.Y);
        }
        throw new IllegalStateException("Missing required properties:".concat(strG));
    }

    public MenuItem e(int i) {
        Toolbar toolbar = (Toolbar) this.b;
        if (toolbar != null) {
            return toolbar.getMenu().findItem(i);
        }
        return null;
    }

    public void g(String str) {
        TextView textView = (TextView) this.o;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void h() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b bVarY = ((y7g) this.a).y();
        Toolbar toolbar = (Toolbar) this.b;
        if (toolbar == null || bVarY == null) {
            return;
        }
        dn dnVar = (dn) ((im) bVarY).V();
        if (dnVar.u0 instanceof Activity) {
            dnVar.x();
            ote oteVar = dnVar.z0;
            if (oteVar instanceof d6g) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            dnVar.A0 = null;
            if (oteVar != null) {
                oteVar.I();
            }
            dnVar.z0 = null;
            Object obj = dnVar.u0;
            mwe mweVar = new mwe(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : dnVar.B0, dnVar.x0);
            dnVar.z0 = mweVar;
            dnVar.x0.b = mweVar.Y;
            toolbar.setBackInvokedCallbackEnabled(true);
            dnVar.a();
        }
    }

    public void i(mue mueVar) {
        jn jnVarA = cx6.a();
        if (((zw6) this.b).isEmpty()) {
            b(jnVarA, (yj8) this.X, mueVar);
            if (!f46.B((yj8) this.Y, (yj8) this.X)) {
                b(jnVarA, (yj8) this.Y, mueVar);
            }
            if (!f46.B((yj8) this.o, (yj8) this.X) && !f46.B((yj8) this.o, (yj8) this.Y)) {
                b(jnVarA, (yj8) this.o, mueVar);
            }
        } else {
            for (int i = 0; i < ((zw6) this.b).size(); i++) {
                b(jnVarA, (yj8) ((zw6) this.b).get(i), mueVar);
            }
            if (!((zw6) this.b).contains((yj8) this.o)) {
                b(jnVarA, (yj8) this.o, mueVar);
            }
        }
        this.c = jnVarA.j();
    }

    @Override // defpackage.kwe
    public boolean onMenuItemClick(MenuItem menuItem) {
        return true;
    }

    public ai3(go9 go9Var) {
        sme smeVar = (sme) go9Var.c;
        y7g y7gVar = (y7g) go9Var.d;
        if (((WeakReference) y7gVar.c).get() != null) {
        } else {
            WeakReference weakReference = (WeakReference) y7gVar.b;
            if (weakReference.get() != null) {
                ((a) weakReference.get()).d0();
            } else {
                throw new IllegalStateException("ContextWeakWrapper should have Activity or Fragment");
            }
        }
        bk4.b();
        this.a = y7gVar;
        Toolbar toolbar = (Toolbar) go9Var.e;
        this.b = toolbar;
        this.c = smeVar;
        if (toolbar != null) {
            toolbar.setVisibility(0);
        }
        toolbar.findViewById(xxb.toolbar);
        this.Y = toolbar.findViewById(xxb.toolbar__wrapper_title);
        TextView textView = (TextView) toolbar.findViewById(go9Var.b);
        this.o = textView;
        if (textView != null) {
            new vqe(textView, c54.a(textView.getContext())).a();
        }
        this.X = (TextView) toolbar.findViewById(xxb.toolbar_subtitle);
        if (((TextView) this.o) != null) {
            toolbar.setContentInsetStartWithNavigation(0);
            TextView textView2 = (TextView) this.o;
            textView2.getContext();
            j47.q(textView2, bk4.a(8.0f));
            TextView textView3 = (TextView) this.X;
            if (textView3 != null) {
                ((TextView) this.o).getContext();
                j47.q(textView3, bk4.a(8.0f));
            }
        }
        sme smeVar2 = (sme) this.c;
        ngg.i(smeVar2, toolbar, (TextView) this.o, (TextView) this.X, smeVar2.F, smeVar2.M);
        toolbar.m(azb.menu_empty);
        toolbar.setOnMenuItemClickListener(this);
        nd7.h(toolbar, new e5(19, this));
    }

    public ai3(m4b m4bVar, z9d z9dVar, k3b k3bVar, zw6 zw6Var, Bundle bundle, iad iadVar) {
        this.a = m4bVar;
        this.b = z9dVar;
        this.c = k3bVar;
        this.o = zw6Var;
        this.X = bundle == null ? Bundle.EMPTY : bundle;
        this.Y = iadVar;
    }
}
