package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public interface fl {
    default int getPriority() {
        return 16;
    }

    kl getScope();

    Uri getUri();

    default boolean shouldGzip() {
        return false;
    }

    boolean shouldPost();

    default boolean willWriteParams() {
        return true;
    }

    default boolean willWriteSupplyParams() {
        return false;
    }

    void writeParams(kb7 kb7Var);

    default void writeSupplyParams(kb7 kb7Var) {
    }
}
