package ru.ok.android.api.session;

import defpackage.zr6;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import ru.ok.android.api.core.ApiInvocationException;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/android/api/session/ApiSessionChangedException;", "Lru/ok/android/api/core/ApiInvocationException;", "odnoklassniki-android-api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ApiSessionChangedException extends ApiInvocationException {
    public final String Z;
    public final String s0;

    public ApiSessionChangedException(String str, String str2, String str3) {
        super(107, str);
        this.Z = str2;
        this.s0 = str3;
    }

    @Override // ru.ok.android.api.core.ApiInvocationException, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiSessionChangedException{sessionKey=");
        sb.append(this.Z);
        sb.append("sessionSecret='");
        sb.append(String.format(Locale.US, "0x%08x", Arrays.copyOf(new Object[]{Integer.valueOf(this.s0.hashCode())}, 1)));
        sb.append("', errorCode=");
        sb.append(this.a);
        sb.append(", errorMessage='");
        sb.append(this.b);
        sb.append("', errorField='");
        sb.append(this.c);
        sb.append("', errorData='");
        sb.append(this.o);
        sb.append("', errorCustomData=");
        sb.append(this.Y);
        sb.append(", errorCustomKey='");
        return zr6.l(sb, this.X, "'}");
    }
}
