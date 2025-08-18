package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class oy9 extends idg implements xr6 {
    public final Object d;

    public oy9(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 4);
        this.d = obj;
    }

    public static xr6 K0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof xr6 ? (xr6) iInterfaceQueryLocalInterface : new wfg(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    public static Object L0(xr6 xr6Var) throws SecurityException {
        if (xr6Var instanceof oy9) {
            return ((oy9) xr6Var).d;
        }
        IBinder iBinderAsBinder = xr6Var.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(zr6.h(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        fp3.n(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
