package one.me.sdk.transfer.exceptions;

import defpackage.eq6;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/transfer/exceptions/HttpUrlExpiredException;", "Lone/me/sdk/transfer/exceptions/HttpErrorException;", "transfer_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class HttpUrlExpiredException extends HttpErrorException {
    public HttpUrlExpiredException() {
        this(null, null, null, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpUrlExpiredException(String str, eq6 eq6Var, String str2, int i) {
        str = (i & 1) != 0 ? null : str;
        super(str == null ? "Expired url" : str, (i & 2) != 0 ? null : eq6Var, (i & 4) != 0 ? null : str2);
    }
}
