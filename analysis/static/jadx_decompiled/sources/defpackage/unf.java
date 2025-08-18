package defpackage;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class unf extends wnf {
    public static unf c;
    public static final pq9 d = new pq9();
    public final Application b;

    public unf(Application application) {
        this.b = application;
    }

    public static qnf d(Class cls, Application application) {
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            return kq0.h(cls);
        }
        try {
            return (qnf) cls.getConstructor(Application.class).newInstance(application);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    @Override // defpackage.wnf, defpackage.vnf
    public final qnf a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.wnf, defpackage.vnf
    public final qnf b(Class cls, wh9 wh9Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) wh9Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (AndroidViewModel.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return kq0.h(cls);
    }
}
