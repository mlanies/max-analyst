package defpackage;

import java.io.IOException;
import ru.ok.android.api.core.ApiException;

/* loaded from: classes.dex */
public final class n01 implements hl {
    @Override // defpackage.hl
    public final void debugApiException(vk vkVar, fl flVar, ApiException apiException) {
        hm9.l0("ApiProviderTag", "debugApiException: " + flVar.getUri() + " " + apiException.getMessage(), apiException);
    }

    @Override // defpackage.hl
    public final void debugApiRequest(vk vkVar, fl flVar, wk wkVar) {
        hm9.n("ApiProviderTag", "debugApiRequest: " + flVar.getUri());
    }

    @Override // defpackage.hl
    public final db7 debugApiResponseFail(vk vkVar, fl flVar, db7 db7Var) {
        hm9.m0("ApiProviderTag", "debugApiResponseFail: " + flVar.getUri(), new Object[0]);
        return db7Var;
    }

    @Override // defpackage.hl
    public final db7 debugApiResponseOk(vk vkVar, fl flVar, db7 db7Var) {
        hm9.n("ApiProviderTag", "debugApiResponseOk: " + flVar.getUri());
        return db7Var;
    }

    @Override // defpackage.hl
    public final void debugIoException(vk vkVar, fl flVar, IOException iOException) {
        hm9.l0("ApiProviderTag", "debugIoException: " + flVar.getUri() + " " + iOException.getMessage(), iOException);
    }
}
