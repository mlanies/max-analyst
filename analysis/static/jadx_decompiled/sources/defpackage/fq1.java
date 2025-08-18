package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class fq1 implements mb7, Serializable {
    public static final Object NO_RECEIVER = eq1.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient mb7 reflected;
    private final String signature;

    public fq1(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.mb7
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.mb7
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public mb7 compute() {
        mb7 mb7Var = this.reflected;
        if (mb7Var != null) {
            return mb7Var;
        }
        mb7 mb7VarComputeReflected = computeReflected();
        this.reflected = mb7VarComputeReflected;
        return mb7VarComputeReflected;
    }

    public abstract mb7 computeReflected();

    @Override // defpackage.lb7
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.mb7
    public String getName() {
        return this.name;
    }

    public ob7 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return nec.a(cls);
        }
        nec.a.getClass();
        return new xoa(cls);
    }

    @Override // defpackage.mb7
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract mb7 getReflected();

    @Override // defpackage.mb7
    public ec7 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.mb7
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.mb7
    public fc7 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.mb7
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.mb7
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.mb7
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.mb7
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
