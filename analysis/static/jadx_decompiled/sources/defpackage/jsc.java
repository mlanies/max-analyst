package defpackage;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class jsc implements vnf {
    public final Application a;
    public final unf b;
    public final Bundle c;
    public final gh7 d;
    public final mm e;

    public jsc(Application application, isc iscVar, Bundle bundle) {
        unf unfVar;
        this.e = iscVar.y();
        this.d = iscVar.Q();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (unf.c == null) {
                unf.c = new unf(application);
            }
            unfVar = unf.c;
        } else {
            unfVar = new unf(null);
        }
        this.b = unfVar;
    }

    @Override // defpackage.vnf
    public final qnf a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.vnf
    public final qnf b(Class cls, wh9 wh9Var) {
        xxc xxcVar = xxc.Z;
        LinkedHashMap linkedHashMap = wh9Var.a;
        String str = (String) linkedHashMap.get(xxcVar);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(z7.e) == null || linkedHashMap.get(z7.f) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(unf.d);
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? ksc.a(cls, ksc.b) : ksc.a(cls, ksc.a);
        return constructorA == null ? this.b.b(cls, wh9Var) : (!zIsAssignableFrom || application == null) ? ksc.b(cls, constructorA, z7.f(wh9Var)) : ksc.b(cls, constructorA, application, z7.f(wh9Var));
    }

    public final qnf d(Class cls, String str) {
        gh7 gh7Var = this.d;
        if (gh7Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? ksc.a(cls, ksc.b) : ksc.a(cls, ksc.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (wnf.a == null) {
                wnf.a = new wnf();
            }
            return wnf.a.a(cls);
        }
        mm mmVar = this.e;
        Bundle bundleC = mmVar.c(str);
        Class[] clsArr = csc.f;
        csc cscVarH = lz7.h(bundleC, this.c);
        dsc dscVar = new dsc(str, cscVarH);
        dscVar.a(mmVar, gh7Var);
        fg7 fg7Var = gh7Var.d;
        if (fg7Var == fg7.b || fg7Var.a(fg7.o)) {
            mmVar.g();
        } else {
            gh7Var.a(new bc4(gh7Var, 3, mmVar));
        }
        qnf qnfVarB = (!zIsAssignableFrom || application == null) ? ksc.b(cls, constructorA, cscVarH) : ksc.b(cls, constructorA, application, cscVarH);
        qnfVarB.a("androidx.lifecycle.savedstate.vm.tag", dscVar);
        return qnfVarB;
    }
}
