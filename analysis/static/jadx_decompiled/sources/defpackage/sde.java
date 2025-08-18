package defpackage;

import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class sde implements MenuItem.OnMenuItemClickListener {
    public static final Class[] d = {MenuItem.class};
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ sde() {
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                Method method = (Method) this.c;
                try {
                    Class<?> returnType = method.getReturnType();
                    Class<?> cls = Boolean.TYPE;
                    Object obj = this.b;
                    if (returnType == cls) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((fr8) this.c).M(menuItem));
        }
    }

    public sde(fr8 fr8Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.c = fr8Var;
        this.b = onMenuItemClickListener;
    }
}
