package defpackage;

import java.io.IOException;
import ru.ok.android.api.core.ApiException;

/* loaded from: classes2.dex */
public interface hl {
    public static final gl a = new gl();

    default void debugApiException(vk vkVar, fl flVar, ApiException apiException) {
    }

    default void debugApiRequest(vk vkVar, fl flVar, wk wkVar) {
    }

    default db7 debugApiResponseFail(vk vkVar, fl flVar, db7 db7Var) {
        return db7Var;
    }

    default db7 debugApiResponseOk(vk vkVar, fl flVar, db7 db7Var) {
        return db7Var;
    }

    default void debugIoException(vk vkVar, fl flVar, IOException iOException) {
    }
}
