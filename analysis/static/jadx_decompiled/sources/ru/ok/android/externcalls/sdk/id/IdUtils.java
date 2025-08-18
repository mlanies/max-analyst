package ru.ok.android.externcalls.sdk.id;

import defpackage.kl;
import defpackage.rk0;
import defpackage.sk0;
import defpackage.tu0;
import ru.ok.android.externcalls.sdk.api.InternalIdResponse;

/* loaded from: classes2.dex */
public final class IdUtils {
    private IdUtils() {
        throw new AssertionError("utility class");
    }

    public static sk0 resolveInternalRequest(String str, boolean z) {
        rk0 rk0VarS = tu0.s("vchat.getOkIdByExternalId");
        rk0VarS.b = kl.c;
        rk0VarS.b("externalId", str);
        rk0VarS.c("anonym", z);
        return rk0VarS.a(InternalIdResponse.PARSER);
    }
}
