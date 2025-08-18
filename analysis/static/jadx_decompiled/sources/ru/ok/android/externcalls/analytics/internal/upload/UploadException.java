package ru.ok.android.externcalls.analytics.internal.upload;

import defpackage.au1;
import defpackage.rh4;
import defpackage.z84;
import kotlin.Metadata;
import ru.ok.android.api.core.ApiInvocationException;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/UploadException;", "", "apiMethod", "", "cause", "Lru/ok/android/api/core/ApiInvocationException;", "(Ljava/lang/String;Lru/ok/android/api/core/ApiInvocationException;)V", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UploadException extends Throwable {
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/UploadException$Companion;", "", "()V", "getApiInvocationErrorMessage", "", "apiMethod", "error", "Lru/ok/android/api/core/ApiInvocationException;", "getErrorMessage", "", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final String getApiInvocationErrorMessage(String apiMethod, ApiInvocationException error) {
            StringBuilder sbM = au1.m("Error executing API method ", apiMethod, ": code=");
            sbM.append(error.a);
            sbM.append(", message=");
            sbM.append(error.b);
            return sbM.toString();
        }

        public final String getErrorMessage(String apiMethod, Throwable error) {
            return rh4.k("Error executing API method ", apiMethod, ": ", error.getMessage());
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    public UploadException(String str, ApiInvocationException apiInvocationException) {
        super(Companion.getApiInvocationErrorMessage(str, apiInvocationException), apiInvocationException);
    }

    public static final String getApiInvocationErrorMessage(String str, ApiInvocationException apiInvocationException) {
        return Companion.getApiInvocationErrorMessage(str, apiInvocationException);
    }

    public static final String getErrorMessage(String str, Throwable th) {
        return Companion.getErrorMessage(str, th);
    }

    public UploadException(String str, Throwable th) {
        super(Companion.getErrorMessage(str, th), th);
    }
}
