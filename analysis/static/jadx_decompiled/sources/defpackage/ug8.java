package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class ug8 {
    public bg8 X;
    public boolean Y;
    public vg8 Z;
    public final Context a;
    public final ey1 b;
    public final cy c = new cy(11, this);
    public fd7 o;
    public boolean s0;

    public ug8(Context context, ey1 ey1Var) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.a = context;
        if (ey1Var != null) {
            this.b = ey1Var;
        } else {
            this.b = new ey1(21, new ComponentName(context, getClass()));
        }
    }

    public sg8 c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract tg8 d(String str);

    public tg8 e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return d(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public abstract void f(bg8 bg8Var);

    public final void g(vg8 vg8Var) {
        eh8.b();
        if (this.Z != vg8Var) {
            this.Z = vg8Var;
            if (this.s0) {
                return;
            }
            this.s0 = true;
            this.c.sendEmptyMessage(1);
        }
    }

    public final void h(bg8 bg8Var) {
        eh8.b();
        if (Objects.equals(this.X, bg8Var)) {
            return;
        }
        this.X = bg8Var;
        if (this.Y) {
            return;
        }
        this.Y = true;
        this.c.sendEmptyMessage(2);
    }
}
