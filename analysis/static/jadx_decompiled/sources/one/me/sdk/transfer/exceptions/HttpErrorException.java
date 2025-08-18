package one.me.sdk.transfer.exceptions;

import defpackage.au1;
import defpackage.eq6;
import defpackage.zr6;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/transfer/exceptions/HttpErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "transfer_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public class HttpErrorException extends Exception {
    public final eq6 a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public HttpErrorException() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sbM = au1.m("HttpErrorException(msg='", getMessage(), "', error='");
        sbM.append(this.a);
        sbM.append("', response='");
        return zr6.l(sbM, this.b, "')");
    }

    public HttpErrorException(String str, eq6 eq6Var) {
        this(str, eq6Var, null, 4);
    }

    public /* synthetic */ HttpErrorException(String str, eq6 eq6Var, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : eq6Var, (i & 4) != 0 ? null : str2);
    }

    public HttpErrorException(String str, eq6 eq6Var, String str2) {
        super(str);
        this.a = eq6Var;
        this.b = str2;
    }
}
