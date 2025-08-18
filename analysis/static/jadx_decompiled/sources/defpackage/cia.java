package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class cia {
    public static bia b;
    public static bia c;
    public static final Handler a = new Handler(Looper.getMainLooper(), new aia());
    public static final AtomicBoolean d = new AtomicBoolean(false);

    public static void a(bia biaVar, yha yhaVar) {
        WeakReference weakReference;
        zha zhaVar;
        if (biaVar == null || (weakReference = biaVar.b) == null || (zhaVar = (zha) weakReference.get()) == null) {
            return;
        }
        a.removeCallbacksAndMessages(zhaVar);
        zhaVar.a.b(yhaVar);
    }

    public static void b(zha zhaVar, yha yhaVar) {
        AtomicBoolean atomicBoolean = d;
        if (atomicBoolean.compareAndSet(false, true)) {
            atomicBoolean.set(false);
            bia biaVar = b;
            if (biaVar != null ? tpa.f(biaVar.b.get(), zhaVar) : false) {
                a(b, yhaVar);
                return;
            }
            bia biaVar2 = c;
            if (biaVar2 != null ? tpa.f(biaVar2.b.get(), zhaVar) : false) {
                a(c, yhaVar);
            }
        }
    }

    public static void c(bia biaVar) {
        iia iiaVar;
        if (tpa.f(biaVar != null ? biaVar.a : null, fia.b)) {
            return;
        }
        Handler handler = a;
        handler.removeCallbacksAndMessages(biaVar);
        if (biaVar == null || (iiaVar = biaVar.a) == null) {
            iiaVar = gia.b;
        }
        handler.sendMessageDelayed(Message.obtain(handler, 0, biaVar), iiaVar.a);
    }

    public static void d() {
        zha zhaVar;
        wia wiaVar;
        bia biaVar = c;
        if (biaVar != null) {
            b = biaVar;
            uge ugeVar = null;
            c = null;
            WeakReference weakReference = biaVar.b;
            if (weakReference == null || (zhaVar = (zha) weakReference.get()) == null) {
                b = null;
                return;
            }
            i50 i50Var = zhaVar.a;
            uge ugeVar2 = (uge) i50Var.X;
            if (ugeVar2 != null) {
                ugeVar2.d();
            } else {
                WeakReference weakReference2 = (WeakReference) i50Var.c;
                if (ugeVar2 == null) {
                    ViewGroup viewGroup = (ViewGroup) weakReference2.get();
                    Context context = viewGroup != null ? viewGroup.getContext() : null;
                    if (context != null) {
                        uia uiaVar = (uia) i50Var.o;
                        ViewGroup viewGroup2 = (ViewGroup) weakReference2.get();
                        Context context2 = viewGroup2 != null ? viewGroup2.getContext() : null;
                        if (context2 == null) {
                            wiaVar = null;
                        } else {
                            wiaVar = new wia(context2, null);
                            wiaVar.setTitle(uiaVar.b);
                            wiaVar.setCaption(uiaVar.c);
                            wiaVar.setLeftElement(uiaVar.a);
                            tia tiaVar = uiaVar.o;
                            wiaVar.setRightElement(tiaVar);
                            if (tiaVar instanceof ria) {
                                wiaVar.setRightBtnAction$snackbar_release(null);
                            } else {
                                wiaVar.setRightBtnAction$snackbar_release(new xx5(21, i50Var));
                            }
                        }
                        if (wiaVar != null) {
                            ugeVar = new uge(context);
                            mec mecVar = new mec();
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                            eia eiaVar = ((uia) i50Var.o).X;
                            int i = eiaVar.a;
                            layoutParams.gravity = (i & 1) != 0 ? 48 : 80;
                            if ((i & 1) != 0) {
                                layoutParams.topMargin = eiaVar.b;
                            } else {
                                layoutParams.bottomMargin = eiaVar.c;
                            }
                            ugeVar.setLayoutParams(layoutParams);
                            if (ugeVar.isAttachedToWindow()) {
                                ugeVar.requestApplyInsets();
                            } else {
                                ugeVar.addOnAttachStateChangeListener(new o50(ugeVar, 6, ugeVar));
                            }
                            int i2 = vc7.a;
                            i50Var.b = vc7.b(vc7.c);
                            y98 y98Var = new y98(i50Var, 18, context);
                            WeakHashMap weakHashMap = zmf.a;
                            omf.u(ugeVar, y98Var);
                            ugeVar.addView(wiaVar);
                            float f = 12;
                            ugeVar.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(0 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                            ugeVar.setClipToPadding(false);
                            ugeVar.setClipChildren(false);
                            ugeVar.setClipToOutline(false);
                            ugeVar.setElevation(10.0f);
                            ugeVar.setCallback(new c8d(i50Var, mecVar, wiaVar, ugeVar));
                            mecVar.a = pla.a(ugeVar, new xp1(ugeVar, ugeVar, 1));
                            i50Var.X = ugeVar;
                        }
                    }
                    ugeVar2 = ugeVar;
                }
                if (ugeVar2 != null) {
                    ViewGroup viewGroup3 = (ViewGroup) weakReference2.get();
                    if (viewGroup3 != null) {
                        viewGroup3.addView(ugeVar2);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) weakReference2.get();
                    if (viewGroup4 != null) {
                        viewGroup4.addOnAttachStateChangeListener((ck) i50Var.Z);
                    }
                }
            }
            if (d.compareAndSet(true, false)) {
                bia biaVar2 = b;
                if (biaVar2 != null ? tpa.f(biaVar2.b.get(), (zha) i50Var.s0) : false) {
                    c(b);
                }
            }
        }
    }
}
