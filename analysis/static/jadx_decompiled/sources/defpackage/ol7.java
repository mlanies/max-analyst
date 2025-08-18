package defpackage;

/* loaded from: classes2.dex */
public interface ol7 {
    long getItemId();

    default boolean h(ol7 ol7Var) {
        return getItemId() == ol7Var.getItemId();
    }

    int l();

    default Object n(Object obj) {
        return null;
    }

    default boolean t(Object obj) {
        return equals(obj);
    }
}
