package one.me.net.client.api;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/net/client/api/AddressUnreachableException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "client-api"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class AddressUnreachableException extends RuntimeException {
    public final InetAddress a;
    public final IOException b;
    public final String c;

    public AddressUnreachableException(InetAddress inetAddress, SocketTimeoutException socketTimeoutException) {
        super("Unreachable " + inetAddress, socketTimeoutException);
        this.a = inetAddress;
        this.b = socketTimeoutException;
        this.c = "ONEME-18278";
    }
}
