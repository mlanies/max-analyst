package org.apache.http.conn;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes2.dex */
public final class MultihomePlainSocketFactory implements SocketFactory {
    private static final MultihomePlainSocketFactory DEFAULT_FACTORY = new MultihomePlainSocketFactory();

    private MultihomePlainSocketFactory() {
    }

    public static MultihomePlainSocketFactory getSocketFactory() {
        return DEFAULT_FACTORY;
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        }
        if (httpParams == null) {
            throw new IllegalArgumentException("Parameters may not be null.");
        }
        if (socket == null) {
            socket = createSocket();
        }
        if (inetAddress != null || i2 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            socket.bind(new InetSocketAddress(inetAddress, i2));
        }
        int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpParams);
        InetAddress[] allByName = InetAddress.getAllByName(str);
        ArrayList arrayList = new ArrayList(allByName.length);
        arrayList.addAll(Arrays.asList(allByName));
        Collections.shuffle(arrayList);
        Iterator it = arrayList.iterator();
        IOException iOException = null;
        while (it.hasNext()) {
            try {
                socket.connect(new InetSocketAddress((InetAddress) it.next(), i), connectionTimeout);
                break;
            } catch (SocketTimeoutException e) {
                throw e;
            } catch (IOException e2) {
                iOException = e2;
                socket = new Socket();
            }
        }
        if (iOException == null) {
            return socket;
        }
        throw iOException;
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() {
        return new Socket();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return PlainSocketFactory.class.hashCode();
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final boolean isSecure(Socket socket) throws IllegalArgumentException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null.");
        }
        if (socket.getClass() != Socket.class) {
            throw new IllegalArgumentException("Socket not created by this factory.");
        }
        if (socket.isClosed()) {
            throw new IllegalArgumentException("Socket is closed.");
        }
        return false;
    }
}
