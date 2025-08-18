package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class rw3 extends ViewGroup.MarginLayoutParams {
    public ow3 a;
    public boolean b;
    public int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final Rect q;

    public rw3(int i, int i2) {
        super(i, i2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.n;
        }
        if (i != 1) {
            return false;
        }
        return this.o;
    }

    public final void b(ow3 ow3Var) {
        ow3 ow3Var2 = this.a;
        if (ow3Var2 != ow3Var) {
            if (ow3Var2 != null) {
                ow3Var2.j();
            }
            this.a = ow3Var;
            this.b = true;
            if (ow3Var != null) {
                ow3Var.g(this);
            }
        }
    }

    public rw3(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        ow3 ow3Var;
        super(context, attributeSet);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j3c.CoordinatorLayout_Layout);
        this.c = typedArrayObtainStyledAttributes.getInteger(j3c.CoordinatorLayout_Layout_android_layout_gravity, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(j3c.CoordinatorLayout_Layout_layout_anchor, -1);
        this.d = typedArrayObtainStyledAttributes.getInteger(j3c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
        this.e = typedArrayObtainStyledAttributes.getInteger(j3c.CoordinatorLayout_Layout_layout_keyline, -1);
        this.g = typedArrayObtainStyledAttributes.getInt(j3c.CoordinatorLayout_Layout_layout_insetEdge, 0);
        this.h = typedArrayObtainStyledAttributes.getInt(j3c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(j3c.CoordinatorLayout_Layout_layout_behavior);
        this.b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(j3c.CoordinatorLayout_Layout_layout_behavior);
            String str = CoordinatorLayout.G0;
            if (TextUtils.isEmpty(string)) {
                ow3Var = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.G0;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.I0;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.H0);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    ow3Var = (ow3) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(wg0.i("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.a = ow3Var;
        }
        typedArrayObtainStyledAttributes.recycle();
        ow3 ow3Var2 = this.a;
        if (ow3Var2 != null) {
            ow3Var2.g(this);
        }
    }

    public rw3(rw3 rw3Var) {
        super((ViewGroup.MarginLayoutParams) rw3Var);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
    }

    public rw3(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
    }

    public rw3(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
    }
}
