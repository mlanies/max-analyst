package defpackage;

import android.os.Handler;
import android.widget.FrameLayout;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class bc4 implements ug7 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ bc4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ug7
    public final void m(eh7 eh7Var, eg7 eg7Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                int i = ac4.$EnumSwitchMapping$0[eg7Var.ordinal()];
                zb4 zb4Var = (zb4) this.b;
                switch (i) {
                    case 1:
                        zb4Var.getClass();
                        break;
                    case 2:
                        zb4Var.onStart(eh7Var);
                        break;
                    case 3:
                        zb4Var.onResume(eh7Var);
                        break;
                    case 4:
                        zb4Var.onPause(eh7Var);
                        break;
                    case 5:
                        zb4Var.onStop(eh7Var);
                        break;
                    case 6:
                        zb4Var.onDestroy(eh7Var);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                ug7 ug7Var = (ug7) this.c;
                if (ug7Var != null) {
                    ug7Var.m(eh7Var, eg7Var);
                    return;
                }
                return;
            case 1:
                vd8 vd8Var = (vd8) this.c;
                if (vd8Var.X.Q()) {
                    return;
                }
                eh7Var.Q().f(this);
                w16 w16Var = (w16) this.b;
                if (((FrameLayout) w16Var.a).isAttachedToWindow()) {
                    vd8Var.H(w16Var);
                    return;
                }
                return;
            case 2:
                if (eg7Var == eg7.ON_DESTROY) {
                    ((Handler) this.b).removeCallbacks((Runnable) this.c);
                    eh7Var.Q().f(this);
                    return;
                }
                return;
            case 3:
                if (eg7Var == eg7.ON_START) {
                    ((gh7) this.b).f(this);
                    ((mm) this.c).g();
                    return;
                }
                return;
            default:
                HashMap map = ((i23) this.c).a;
                List list = (List) map.get(eg7Var);
                Object obj = this.b;
                i23.a(list, eh7Var, eg7Var, obj);
                i23.a((List) map.get(eg7.ON_ANY), eh7Var, eg7Var, obj);
                return;
        }
    }

    public bc4(Object obj) {
        this.a = 4;
        this.b = obj;
        k23 k23Var = k23.c;
        Class<?> cls = obj.getClass();
        i23 i23Var = (i23) k23Var.a.get(cls);
        this.c = i23Var == null ? k23Var.a(cls, null) : i23Var;
    }

    public bc4(vd8 vd8Var, w16 w16Var) {
        this.a = 1;
        this.c = vd8Var;
        this.b = w16Var;
    }
}
