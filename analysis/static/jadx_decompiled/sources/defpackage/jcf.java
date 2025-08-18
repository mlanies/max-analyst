package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class jcf {
    public final us a;
    public final us b;
    public final us c;

    public jcf(us usVar, us usVar2, us usVar3) {
        this.a = usVar;
        this.b = usVar2;
        this.c = usVar3;
    }

    public abstract kcf a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        us usVar = this.c;
        Class cls2 = (Class) usVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        usVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException, SecurityException {
        us usVar = this.a;
        Method method = (Method) usVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, jcf.class.getClassLoader()).getDeclaredMethod("read", jcf.class);
        usVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        us usVar = this.b;
        Method method = (Method) usVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, jcf.class);
        usVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((kcf) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((kcf) this).e.readParcelable(kcf.class.getClassLoader());
    }

    public final lcf h() {
        String string = ((kcf) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (lcf) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((kcf) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((kcf) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(lcf lcfVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (lcfVar == null) {
            ((kcf) this).e.writeString(null);
            return;
        }
        try {
            ((kcf) this).e.writeString(b(lcfVar.getClass()).getName());
            kcf kcfVarA = a();
            try {
                d(lcfVar.getClass()).invoke(null, lcfVar, kcfVarA);
                int i = kcfVarA.i;
                if (i >= 0) {
                    int i2 = kcfVarA.d.get(i);
                    Parcel parcel = kcfVarA.e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(lcfVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
