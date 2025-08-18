package defpackage;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* loaded from: classes2.dex */
public final class ox7 extends pnf {
    public static final t6a t0 = new t6a(xca.a, new r6a(vca.c), wca.g, ":contact-list", wca.f);
    public static final t6a u0 = new t6a(w0c.oneme_main_calls_title, new r6a(vca.a), wca.c, ":call-list", wca.b);
    public static final t6a v0;
    public static final t6a w0;
    public final q0e X;
    public final w7c Y;
    public final z16 Z;
    public final hp b;
    public final List c;
    public t6a o;
    public final mn5 s0;

    static {
        final int i = 0;
        v0 = new t6a(w0c.oneme_main_chats_title, new q6a(new c66() { // from class: nx7
            @Override // defpackage.c66
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ImageView imageView = (ImageView) obj;
                Boolean bool = (Boolean) obj2;
                switch (i) {
                    case 0:
                        boolean zBooleanValue = bool.booleanValue();
                        fka fkaVar = (fka) obj3;
                        Drawable drawable = imageView.getDrawable();
                        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = drawable instanceof EnhancedAnimatedVectorDrawable ? (EnhancedAnimatedVectorDrawable) drawable : null;
                        if (enhancedAnimatedVectorDrawable != null) {
                            c54.Z(enhancedAnimatedVectorDrawable, "left_dot", fkaVar.b().i);
                            c54.Z(enhancedAnimatedVectorDrawable, "middle_dot", fkaVar.b().i);
                            c54.Z(enhancedAnimatedVectorDrawable, "right_dot", fkaVar.b().i);
                            c54.Z(enhancedAnimatedVectorDrawable, "shape", zBooleanValue ? fkaVar.getIcon().a.c.a : fkaVar.getIcon().a.c.b);
                        }
                        break;
                    default:
                        boolean zBooleanValue2 = bool.booleanValue();
                        fka fkaVar2 = (fka) obj3;
                        Drawable drawable2 = imageView.getDrawable();
                        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable2 = drawable2 instanceof EnhancedAnimatedVectorDrawable ? (EnhancedAnimatedVectorDrawable) drawable2 : null;
                        if (enhancedAnimatedVectorDrawable2 != null) {
                            c54.Z(enhancedAnimatedVectorDrawable2, "cutout", fkaVar2.b().i);
                            c54.Z(enhancedAnimatedVectorDrawable2, "gear", zBooleanValue2 ? fkaVar2.getIcon().a.c.a : fkaVar2.getIcon().a.c.b);
                        }
                        break;
                }
                return e5f.a;
            }
        }, new g27(11)), wca.e, ":chat-list", wca.d);
        final int i2 = 1;
        w0 = new t6a(w0c.oneme_main_settings_title, new q6a(new c66() { // from class: nx7
            @Override // defpackage.c66
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ImageView imageView = (ImageView) obj;
                Boolean bool = (Boolean) obj2;
                switch (i2) {
                    case 0:
                        boolean zBooleanValue = bool.booleanValue();
                        fka fkaVar = (fka) obj3;
                        Drawable drawable = imageView.getDrawable();
                        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = drawable instanceof EnhancedAnimatedVectorDrawable ? (EnhancedAnimatedVectorDrawable) drawable : null;
                        if (enhancedAnimatedVectorDrawable != null) {
                            c54.Z(enhancedAnimatedVectorDrawable, "left_dot", fkaVar.b().i);
                            c54.Z(enhancedAnimatedVectorDrawable, "middle_dot", fkaVar.b().i);
                            c54.Z(enhancedAnimatedVectorDrawable, "right_dot", fkaVar.b().i);
                            c54.Z(enhancedAnimatedVectorDrawable, "shape", zBooleanValue ? fkaVar.getIcon().a.c.a : fkaVar.getIcon().a.c.b);
                        }
                        break;
                    default:
                        boolean zBooleanValue2 = bool.booleanValue();
                        fka fkaVar2 = (fka) obj3;
                        Drawable drawable2 = imageView.getDrawable();
                        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable2 = drawable2 instanceof EnhancedAnimatedVectorDrawable ? (EnhancedAnimatedVectorDrawable) drawable2 : null;
                        if (enhancedAnimatedVectorDrawable2 != null) {
                            c54.Z(enhancedAnimatedVectorDrawable2, "cutout", fkaVar2.b().i);
                            c54.Z(enhancedAnimatedVectorDrawable2, "gear", zBooleanValue2 ? fkaVar2.getIcon().a.c.a : fkaVar2.getIcon().a.c.b);
                        }
                        break;
                }
                return e5f.a;
            }
        }, new g27(12)), wca.j, ":settings", wca.i);
    }

    public ox7(jp jpVar, uq0 uq0Var, String str) {
        Object next;
        this.b = jpVar;
        t6a t6aVar = t0;
        t6a t6aVar2 = u0;
        t6a t6aVar3 = v0;
        List listM = y53.M(t6aVar, t6aVar2, t6aVar3, w0);
        this.c = listM;
        this.o = t6aVar3;
        q0e q0eVarA = r0e.a(Boolean.valueOf(jpVar.d("app.messages.calls.menu.item", true)));
        this.X = q0eVarA;
        this.Y = new w7c(q0eVarA);
        this.Z = new z16(16, this);
        this.s0 = uq0Var.c;
        Iterator it = listM.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (tpa.f(((t6a) next).d, str)) {
                    break;
                }
            }
        }
        t6a t6aVar4 = (t6a) next;
        this.o = t6aVar4 != null ? t6aVar4 : t6aVar3;
        hp hpVar = this.b;
        final z16 z16Var = this.Z;
        final jp jpVar2 = (jp) hpVar;
        jpVar2.getClass();
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ip
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                jp jpVar3 = jpVar2;
                jpVar3.getClass();
                if (str2 != null && str2.equals("app.messages.calls.menu.item")) {
                    ((ox7) z16Var.b).X.m(null, Boolean.valueOf(jpVar3.d("app.messages.calls.menu.item", true)));
                }
            }
        };
        jpVar2.m.put(z16Var, onSharedPreferenceChangeListener);
        jpVar2.g.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // defpackage.pnf
    public final void p() {
        jp jpVar = (jp) this.b;
        ne7 ne7Var = jpVar.g;
        WeakHashMap weakHashMap = jpVar.m;
        z16 z16Var = this.Z;
        ne7Var.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) weakHashMap.get(z16Var));
        weakHashMap.remove(z16Var);
    }
}
