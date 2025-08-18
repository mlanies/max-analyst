package defpackage;

/* loaded from: classes.dex */
public interface vnf {
    default qnf a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default qnf b(Class cls, wh9 wh9Var) {
        return a(cls);
    }

    default qnf c(h23 h23Var, wh9 wh9Var) {
        return b(h23Var.a(), wh9Var);
    }
}
